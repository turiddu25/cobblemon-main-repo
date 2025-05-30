/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.net.messages.client.pokemon.update

import com.cobblemon.mod.common.net.IntSize
import com.cobblemon.mod.common.pokemon.Pokemon
import com.cobblemon.mod.common.util.cobblemonResource
import com.cobblemon.mod.common.util.readSizedInt
import net.minecraft.network.RegistryFriendlyByteBuf

class FullnessUpdatePacket(pokemon: () -> Pokemon?, value: Int) : IntUpdatePacket<FullnessUpdatePacket>(pokemon, value) {
    override val id = ID
    override fun getSize() = IntSize.U_BYTE
    override fun set(pokemon: Pokemon, value: Int) {
        pokemon.currentFullness = value
    }

    companion object {
        val ID = cobblemonResource("fullness_update")
        fun decode(buffer: RegistryFriendlyByteBuf) = FullnessUpdatePacket(decodePokemon(buffer), buffer.readSizedInt(IntSize.U_BYTE))
    }
}