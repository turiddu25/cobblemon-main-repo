/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.net.messages.client.storage.pc

import com.cobblemon.mod.common.api.net.NetworkPacket
import com.cobblemon.mod.common.api.net.UnsplittablePacket
import com.cobblemon.mod.common.api.storage.pc.PCBox
import com.cobblemon.mod.common.net.IntSize
import com.cobblemon.mod.common.pokemon.Pokemon
import com.cobblemon.mod.common.util.*
import io.netty.buffer.Unpooled
import java.util.UUID
import net.minecraft.core.RegistryAccess
import net.minecraft.network.RegistryFriendlyByteBuf
import net.minecraft.resources.ResourceLocation

/**
 * Sets an entire box of Pokémon in the client side representation of a PC. This is used
 * during the initial sending of a PC's contents. It's better than sending hundreds of packets
 * for a full PC - this way it's one large-ish packet per box. It's also used when sorting a box.
 *
 * Handled by [com.cobblemon.mod.common.client.net.storage.pc.SetPCBoxHandler].
 *
 * @author Hiroku
 * @since June 18th, 2022
 */
class SetPCBoxPacket internal constructor(val storeID: UUID, val boxNumber: Int, val name: String, val wallpaper: ResourceLocation, val pokemon: Map<Int, (RegistryAccess) -> Pokemon>) : NetworkPacket<SetPCBoxPacket>, UnsplittablePacket {

    override val id = ID

    constructor(box: PCBox): this(box.pc.uuid, box.boxNumber, box.name?: "", box.wallpaper, box.getNonEmptySlotsForPackets())

    override fun encode(buffer: RegistryFriendlyByteBuf) {
        buffer.writeUUID(storeID)
        buffer.writeSizedInt(IntSize.U_SHORT, boxNumber)
        buffer.writeString(name)
        buffer.writeString(wallpaper.toString())
        buffer.writeMapK(map = pokemon) { (slot, pokemon) ->
            buffer.writeSizedInt(IntSize.U_BYTE, slot)
            val subBuffer = RegistryFriendlyByteBuf(Unpooled.buffer(), buffer.registryAccess())
            Pokemon.S2C_CODEC.encode(subBuffer, pokemon(buffer.registryAccess()))
            buffer.writeInt(subBuffer.readableBytes())
            buffer.writeBytes(subBuffer)
            subBuffer.release()
        }
    }

    companion object {
        val ID = cobblemonResource("set_pc_box")
        fun decode(buffer: RegistryFriendlyByteBuf): SetPCBoxPacket {
            val storeID = buffer.readUUID()
            val boxNumber = buffer.readSizedInt(IntSize.U_SHORT)
            val name = buffer.readString()
            val wallpaper = ResourceLocation.parse(buffer.readString())
            val pokemonMap = mutableMapOf<Int, (RegistryAccess) -> Pokemon>()
            buffer.readMapK(map = pokemonMap) {
                val key = buffer.readSizedInt(IntSize.U_BYTE)
                val subBuffer = buffer.readBytes(buffer.readInt())
                key to {
                    val pokemon = Pokemon.S2C_CODEC.decode(RegistryFriendlyByteBuf(subBuffer, buffer.registryAccess()))
                    subBuffer.release()
                    pokemon
                }
            }
            return SetPCBoxPacket(storeID, boxNumber, name, wallpaper, pokemonMap)
        }
    }
}