/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common

import com.cobblemon.mod.common.platform.PlatformRegistry
import com.cobblemon.mod.common.util.cobblemonResource
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.world.level.block.SoundType

object CobblemonSounds : PlatformRegistry<Registry<SoundEvent>, ResourceKey<Registry<SoundEvent>>, SoundEvent>() {

    override val registry: Registry<SoundEvent> = BuiltInRegistries.SOUND_EVENT
    override val resourceKey: ResourceKey<Registry<SoundEvent>> = Registries.SOUND_EVENT

    @JvmField
    val GUI_CLICK = this.create("gui.click")
    @JvmField
    val GUI_TRADE = this.create("gui.trade")

    @JvmField
    val PC_ON = this.create("pc.on")
    @JvmField
    val PC_OFF = this.create("pc.off")
    @JvmField
    val PC_GRAB = this.create("pc.grab")
    @JvmField
    val PC_DROP = this.create("pc.drop")
    @JvmField
    val PC_RELEASE = this.create("pc.release")
    @JvmField
    val PC_CLICK = this.create("pc.click")
    @JvmField
    val PC_WALLPAPER_UNLOCK = this.create("pc.wallpaper.unlock")

    @JvmField
    val NPC_GIBBER_GENERIC = this.create("entity.npc.gibber.generic")
    @JvmField
    val NPC_GIBBER_SPEECH_TYPE_1_1 = this.create("entity.npc.gibber.speech_type_1_1")
    @JvmField
    val NPC_GIBBER_SPEECH_TYPE_1_2 = this.create("entity.npc.gibber.speech_type_1_2")
    @JvmField
    val NPC_GIBBER_SPEECH_TYPE_1_3 = this.create("entity.npc.gibber.speech_type_1_3")

    @JvmField
    val VILLAGER_WORK_NURSE = this.create("entity.villager.work_nurse")

    @JvmField
    val HEALING_MACHINE_ACTIVE = this.create("block.healing_machine.active")

    @JvmField
    val POKE_BALL_HIT = this.create("poke_ball.hit")
    @JvmField
    val POKE_BALL_SEND_OUT = this.create("poke_ball.send_out")
    @JvmField
    val POKE_BALL_SHINY_SEND_OUT = this.create("poke_ball.shiny_send_out")
    @JvmField
    val POKE_BALL_RECALL = this.create("poke_ball.recall")
    @JvmField
    val POKE_BALL_THROW = this.create("poke_ball.throw")
    @JvmField
    val POKE_BALL_TRAIL = this.create("poke_ball.trail")

    @JvmField
    val POKEDEX_OPEN = this.create("item.pokedex.open")
    @JvmField
    val POKEDEX_CLOSE = this.create("item.pokedex.close")
    @JvmField
    val POKEDEX_CLICK = this.create("item.pokedex.click")
    @JvmField
    val POKEDEX_CLICK_SHORT = this.create("item.pokedex.click_short")
    @JvmField
    val POKEDEX_SCAN_OPEN = this.create("item.pokedex.scan_open")
    @JvmField
    val POKEDEX_SCAN_CLOSE = this.create("item.pokedex.scan_close")
    @JvmField
    val POKEDEX_SCAN_LOOP = this.create("item.pokedex.scan_loop")
    @JvmField
    val POKEDEX_SCAN_DETAIL = this.create("item.pokedex.scan_detail")
    @JvmField
    val POKEDEX_SCAN_REGISTER_POKEMON = this.create("item.pokedex.scan_register_pokemon")
    @JvmField
    val POKEDEX_SCAN_REGISTER_ASPECT = this.create("item.pokedex.scan_register_aspect")
    @JvmField
    val POKEDEX_SCAN_ZOOM_INCREMENT = this.create("item.pokedex.scan_zoom_increment")

    @JvmField
    val ITEM_USE = this.create("item.use")
    @JvmField
    val EVOLUTION_NOTIFICATION = this.create("evolution.notification")
    @JvmField
    val EVOLUTION_UI = this.create("evolution.ui")
    @JvmField
    val EVOLUTION = this.create("evolution.full")

    @JvmField
    val PVN_BATTLE = this.create("battle.pvn.default")
    @JvmField
    val PVP_BATTLE = this.create("battle.pvp.default")
    @JvmField
    val PVW_BATTLE = this.create("battle.pvw.default")

    @JvmField
    val MEDICINE_CANDY_USE = this.create("item.medicine.candy.use")
    @JvmField
    val MEDICINE_HERB_USE = this.create("item.medicine.herb.use")
    @JvmField
    val MEDICINE_LIQUID_USE = this.create("item.medicine.liquid.use")
    @JvmField
    val MEDICINE_PILLS_USE = this.create("item.medicine.pills.use")
    @JvmField
    val MEDICINE_SPRAY_USE = this.create("item.medicine.spray.use")
    @JvmField
    val MEDICINE_FEATHER_USE = this.create("item.medicine.feather.use")
    @JvmField
    val MOCHI_USE = this.create("item.medicine.feather.use")


    @JvmField
    val MULCH_PLACE = this.create("block.mulch.place")
    @JvmField
    val MULCH_REMOVE = this.create("block.mulch.remove")

    @JvmField
    val FOSSIL_MACHINE_ACTIVATE = this.create("block.fossil_machine.activate")
    @JvmField
    val FOSSIL_MACHINE_ACTIVE_LOOP = this.create("block.fossil_machine.active_loop")
    @JvmField
    val FOSSIL_MACHINE_ASSEMBLE = this.create("block.fossil_machine.assemble")
    @JvmField
    val FOSSIL_MACHINE_DNA_FULL = this.create("block.fossil_machine.dna_full")
    @JvmField
    val FOSSIL_MACHINE_FINISHED = this.create("block.fossil_machine.finished")
    @JvmField
    val FOSSIL_MACHINE_INSERT_DNA = this.create("block.fossil_machine.insert_dna")
    @JvmField
    val FOSSIL_MACHINE_INSERT_DNA_SMALL = this.create("block.fossil_machine.insert_dna_small")
    @JvmField
    val FOSSIL_MACHINE_INSERT_FOSSIL = this.create("block.fossil_machine.insert_fossil")
    @JvmField
    val FOSSIL_MACHINE_RETRIEVE_FOSSIL = this.create("block.fossil_machine.retrieve_fossil")
    @JvmField
    val FOSSIL_MACHINE_RETRIEVE_POKEMON = this.create("block.fossil_machine.retrieve_pokemon")
    @JvmField
    val FOSSIL_MACHINE_UNPROTECTED = this.create("block.fossil_machine.unprotected")

    @JvmField
    val RELIC_COIN_SACK_BREAK = this.create("block.relic_coin_sack.break")
    @JvmField
    val RELIC_COIN_SACK_HIT = this.create("block.relic_coin_sack.hit")
    @JvmField
    val RELIC_COIN_SACK_STEP = this.create("block.relic_coin_sack.step")
    @JvmField
    val RELIC_COIN_SACK_PLACE = this.create("block.relic_coin_sack.place")
    @JvmField
    val RELIC_COIN_POUCH_BREAK = this.create("block.relic_coin_pouch.break")
    @JvmField
    val RELIC_COIN_POUCH_PLACE = this.create("block.relic_coin_pouch.place")

    @JvmField
    val FISHING_NOTIFICATION = this.create("fishing.notification")
    @JvmField
    val FISHING_SPLASH_BIG = this.create("fishing.splash_big")
    @JvmField
    val FISHING_SPLASH_SMALL = this.create("fishing.splash_small")
    @JvmField
    val FISHING_BOBBER_LAND = this.create("fishing.bobber_land")
    @JvmField
    val FISHING_ROD_CAST = this.create("fishing.rod_cast")
    @JvmField
    val FISHING_ROD_REEL_IN = this.create("fishing.rod_reel_in")
    @JvmField
    val FISHING_BAIT_ATTACH = this.create("fishing.bait_attach")
    @JvmField
    val FISHING_BAIT_DETACH = this.create("fishing.bait_detach")

    @JvmField
    val TUMBLESTONE_BREAK = this.create("block.tumblestone.break")
    @JvmField
    val TUMBLESTONE_BLOCK_BREAK = this.create("block.tumblestone.block_break")
    @JvmField
    val TUMBLESTONE_HIT = this.create("block.tumblestone.hit")
    @JvmField
    val TUMBLESTONE_PLACE = this.create("block.tumblestone.place")
    @JvmField
    val TUMBLESTONE_STEP = this.create("block.tumblestone.step")

    @JvmField
    val EVOLUTION_STONE_BLOCK_BREAK = this.create("block.evolution_stone_block.break")
    @JvmField
    val EVOLUTION_STONE_BLOCK_HIT = this.create("block.evolution_stone_block.hit")
    @JvmField
    val EVOLUTION_STONE_BLOCK_PLACE = this.create("block.evolution_stone_block.place")
    @JvmField
    val EVOLUTION_STONE_BLOCK_STEP = this.create("block.evolution_stone_block.step")

    @JvmField
    val GIMMIGHOUL_GIVE_ITEM = this.create("pokemon.gimmighoul.give_item")
    @JvmField
    val GIMMIGHOUL_REVEAL = this.create("pokemon.gimmighoul.reveal")

    @JvmField
    val BERRY_BUSH_BREAK = this.create("block.berry_bush.break")
    @JvmField
    val BERRY_BUSH_PLACE = this.create("block.berry_bush.place")
    @JvmField
    val BERRY_HARVEST = this.create("block.berry_bush.harvest")
    @JvmField
    val BERRY_EAT = this.create("item.berry.eat")
    @JvmField
    val BERRY_EAT_FULL = this.create("item.berry.eat.full")

    @JvmField
    val BIG_ROOT_BREAK = this.create("block.big_root.break")
    @JvmField
    val ENERGY_ROOT_PLACE = this.create("block.energy_root.place")

    @JvmField
    val VIVICHOKE_BREAK = this.create("block.vivichoke.break")
    @JvmField
    val VIVICHOKE_PLACE = this.create("block.vivichoke.place")

    @JvmField
    val MINT_BREAK = this.create("block.mint.break")
    @JvmField
    val MINT_PLACE = this.create("block.mint.place")

    @JvmField
    val REVIVAL_HERB_BREAK = this.create("block.revival_herb.break")
    @JvmField
    val REVIVAL_HERB_PLACE = this.create("block.revival_herb.place")

    @JvmField
    val MEDICINAL_LEEK_BREAK = this.create("block.medicinal_leek.break")
    @JvmField
    val MEDICINAL_LEEK_PLACE = this.create("block.medicinal_leek.plant")

    @JvmField
    val GILDED_CHEST_OPEN = this.create("block.gilded_chest.open")
    @JvmField
    val GILDED_CHEST_CLOSE = this.create("block.gilded_chest.close")
    @JvmField
    val GILDED_CHEST_STEP = this.create("block.gilded_chest.step")
    @JvmField
    val GILDED_CHEST_HIT = this.create("block.gilded_chest.hit")
    @JvmField
    val GILDED_CHEST_BREAK = this.create("block.gilded_chest.break")
    @JvmField
    val GILDED_CHEST_PLACE = this.create("block.gilded_chest.place")

    @JvmField
    val RELIC_COIN_SACK_SOUNDS = SoundType(1f, 1.1f,
        RELIC_COIN_SACK_BREAK,
        RELIC_COIN_SACK_STEP,
        RELIC_COIN_SACK_PLACE,
        RELIC_COIN_SACK_HIT,
        RELIC_COIN_SACK_STEP
    )
    @JvmField
    val RELIC_COIN_POUCH_SOUNDS = SoundType(1f, 1.1f,
        RELIC_COIN_POUCH_BREAK,
        RELIC_COIN_SACK_STEP,
        RELIC_COIN_POUCH_PLACE,
        RELIC_COIN_SACK_HIT,
        RELIC_COIN_SACK_STEP
    )

    @JvmField
    val MOVE_QUICKATTACK_TARGET = this.create("move.quickattack.target")
    @JvmField
    val MOVE_PURSUIT_TARGET = this.create("move.pursuit.target")
    @JvmField
    val MOVE_PSYCHIC_TARGET = this.create("move.psychic.target")

    @JvmField
    val IMPACT_NORMAL = this.create("impact.normal")
    @JvmField
    val IMPACT_BUG = this.create("impact.bug")
    @JvmField
    val IMPACT_DARK = this.create("impact.dark")
    @JvmField
    val IMPACT_DRAGON = this.create("impact.dragon")
    @JvmField
    val IMPACT_ELECTRIC = this.create("impact.electric")
    @JvmField
    val IMPACT_FAIRY = this.create("impact.fairy")
    @JvmField
    val IMPACT_FIGHTING = this.create("impact.fighting")
    @JvmField
    val IMPACT_FIRE = this.create("impact.fire")
    @JvmField
    val IMPACT_FLYING = this.create("impact.flying")
    @JvmField
    val IMPACT_GHOST = this.create("impact.ghost")
    @JvmField
    val IMPACT_GRASS = this.create("impact.grass")
    @JvmField
    val IMPACT_GROUND = this.create("impact.ground")
    @JvmField
    val IMPACT_ICE = this.create("impact.ice")
    @JvmField
    val IMPACT_POISON = this.create("impact.poison")
    @JvmField
    val IMPACT_PSYCHIC = this.create("impact.psychic")
    @JvmField
    val IMPACT_ROCK = this.create("impact.rock")
    @JvmField
    val IMPACT_STEEL = this.create("impact.steel")
    @JvmField
    val IMPACT_WATER = this.create("impact.water")

    @JvmField
    val TUMBLESTONE_SOUNDS = SoundType(1f, 1.1f,
        TUMBLESTONE_BREAK,
        TUMBLESTONE_STEP,
        TUMBLESTONE_PLACE,
        TUMBLESTONE_HIT,
        TUMBLESTONE_STEP
    )

    @JvmField
    val TUMBLESTONE_BLOCK_SOUNDS = SoundType(1f, 1.1f,
        TUMBLESTONE_BLOCK_BREAK,
        TUMBLESTONE_STEP,
        TUMBLESTONE_PLACE,
        TUMBLESTONE_HIT,
        TUMBLESTONE_STEP
    )
    @JvmField
    val EVOLUTION_STONE_BLOCK_SOUNDS = SoundType(1f, 1.1f,
        EVOLUTION_STONE_BLOCK_BREAK,
        EVOLUTION_STONE_BLOCK_STEP,
        EVOLUTION_STONE_BLOCK_PLACE,
        EVOLUTION_STONE_BLOCK_HIT,
        EVOLUTION_STONE_BLOCK_STEP
    )


    @JvmField
    val BERRY_BUSH_SOUNDS = SoundType(0.8f, 1.1f,
        BERRY_BUSH_BREAK,
        SoundEvents.GRASS_STEP,
        BERRY_BUSH_PLACE,
        SoundEvents.GRASS_HIT,
        SoundEvents.GRASS_STEP
    )

    @JvmField
    val BIG_ROOT_SOUNDS = SoundType(0.8f, 1.1f,
        BIG_ROOT_BREAK,
        SoundEvents.ROOTS_STEP,
        ENERGY_ROOT_PLACE,
        SoundEvents.ROOTS_HIT,
        SoundEvents.ROOTS_FALL
    )

    @JvmField
    val ENERGY_ROOT_SOUNDS = SoundType(0.8f, 1.1f,
        BIG_ROOT_BREAK,
        SoundEvents.ROOTS_STEP,
        ENERGY_ROOT_PLACE,
        SoundEvents.ROOTS_HIT,
        SoundEvents.ROOTS_FALL
    )

    @JvmField
    val MEDICINAL_LEEK_SOUNDS = SoundType(1f, 1.1f,
        MEDICINAL_LEEK_BREAK,
        SoundEvents.GRASS_STEP,
        MEDICINAL_LEEK_PLACE,
        SoundEvents.GRASS_HIT,
        SoundEvents.GRASS_FALL
    )

    @JvmField
    val VIVICHOKE_SOUNDS = SoundType(0.6f, 1.1f,
        VIVICHOKE_BREAK,
        SoundEvents.GRASS_STEP,
        VIVICHOKE_PLACE,
        SoundEvents.GRASS_HIT,
        SoundEvents.GRASS_FALL
    )

    @JvmField
    val MINT_SOUNDS = SoundType(0.6f, 1.1f,
        MINT_BREAK,
        SoundEvents.GRASS_STEP,
        MINT_PLACE,
        SoundEvents.GRASS_HIT,
        SoundEvents.GRASS_FALL
    )

    @JvmField
    val REVIVAL_HERB_SOUNDS = SoundType(0.6f, 1.1f,
        REVIVAL_HERB_BREAK,
        SoundEvents.GRASS_STEP,
        REVIVAL_HERB_PLACE,
        SoundEvents.GRASS_HIT,
        SoundEvents.GRASS_FALL
    )

    @JvmField
    val GILDED_CHEST_SOUNDS = SoundType(1f, 1.1f,
        GILDED_CHEST_BREAK,
        GILDED_CHEST_STEP,
        GILDED_CHEST_PLACE,
        GILDED_CHEST_HIT,
        GILDED_CHEST_STEP
    )

    @JvmField
    val DISPLAY_CASE_ADD_ITEM = this.create("block.display_case.add_item")
    @JvmField
    val DISPLAY_CASE_REMOVE_ITEM = this.create("block.display_case.remove_item")
    @JvmField
    val DISPLAY_CASE_BREAK = this.create("block.display_case.break")
    @JvmField
    val DISPLAY_CASE_HIT = this.create("block.display_case.hit")
    @JvmField
    val DISPLAY_CASE_PLACE = this.create("block.display_case.place")
    @JvmField
    val DISPLAY_CASE_STEP = this.create("block.display_case.step")

    @JvmField
    val DISPLAY_CASE_SOUNDS = SoundType(1f, 1f,
        DISPLAY_CASE_BREAK,
        DISPLAY_CASE_STEP,
        DISPLAY_CASE_PLACE,
        DISPLAY_CASE_HIT,
        DISPLAY_CASE_STEP
    )

    @JvmField
    val CAMPFIRE_POT_PLACE_CAMPFIRE = this.create("block.campfire_pot.place_campfire")
    @JvmField
    val CAMPFIRE_POT_RETRIEVE = this.create("block.campfire_pot.retrieve")
    @JvmField
    val CAMPFIRE_POT_OPEN = this.create("block.campfire_pot.open")
    @JvmField
    val CAMPFIRE_POT_CLOSE = this.create("block.campfire_pot.close")
    @JvmField
    val CAMPFIRE_POT_USE = this.create("block.campfire_pot.use")
    @JvmField
    val CAMPFIRE_POT_COOK = this.create("block.campfire_pot.cook")
    @JvmField
    val CAMPFIRE_POT_CRAFT = this.create("block.campfire_pot.craft")
    @JvmField
    val CAMPFIRE_POT_PLACE = this.create("block.campfire_pot.place")
    @JvmField
    val CAMPFIRE_POT_BREAK = this.create("block.campfire_pot.break")
    @JvmField
    val CAMPFIRE_POT_HIT = this.create("block.campfire_pot.hit")
    @JvmField
    val CAMPFIRE_POT_STEP = this.create("block.campfire_pot.step")

    @JvmField
    val CAMPFIRE_POT_SOUNDS = SoundType(1f, 1.1f,
        CAMPFIRE_POT_BREAK,
        CAMPFIRE_POT_STEP,
        CAMPFIRE_POT_PLACE,
        CAMPFIRE_POT_HIT,
        CAMPFIRE_POT_STEP
    )

    private fun create(name: String): SoundEvent = this.create(name, SoundEvent.createVariableRangeEvent(cobblemonResource(name)))
}
