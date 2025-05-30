/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.client.net.storage.pc

import com.cobblemon.mod.common.api.net.ClientNetworkPacketHandler
import com.cobblemon.mod.common.client.render.gui.PCBoxWallpaperRepository
import com.cobblemon.mod.common.net.messages.server.storage.pc.PCBoxWallpapersPacket
import com.cobblemon.mod.common.net.messages.client.storage.pc.wallpaper.RequestPCBoxWallpapersPacket
import net.minecraft.client.Minecraft

object RequestPCBoxWallpapersHandler : ClientNetworkPacketHandler<RequestPCBoxWallpapersPacket> {
    override fun handle(packet: RequestPCBoxWallpapersPacket, client: Minecraft) {
        PCBoxWallpaperRepository.findWallpapers(client.resourceManager)
        PCBoxWallpapersPacket(PCBoxWallpaperRepository.availableWallpapers).sendToServer()
    }
}