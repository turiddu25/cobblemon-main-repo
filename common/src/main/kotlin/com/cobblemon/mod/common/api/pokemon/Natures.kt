/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.api.pokemon

import com.cobblemon.mod.common.api.cooking.Flavour
import com.cobblemon.mod.common.api.pokemon.stats.Stats
import com.cobblemon.mod.common.pokemon.Nature
import com.cobblemon.mod.common.util.cobblemonResource
import net.minecraft.resources.ResourceLocation

/**
 * Registry for all Nature types
 * Get or register nature types
 *
 * @author Deltric
 * @since January 13th, 2022
 */
object Natures {
    private val allNatures = mutableListOf<Nature>()

    val HARDY = registerNature(
        Nature(cobblemonResource("hardy"), "cobblemon.nature.hardy",
        null, null, null, null)
    )

    val LONELY = registerNature(
        Nature(cobblemonResource("lonely"), "cobblemon.nature.lonely",
        Stats.ATTACK, Stats.DEFENCE, Flavour.SPICY, Flavour.SOUR)
    )

    val BRAVE = registerNature(
        Nature(cobblemonResource("brave"), "cobblemon.nature.brave",
            Stats.ATTACK, Stats.SPEED, Flavour.SPICY, Flavour.SWEET)
    )

    val ADAMANT = registerNature(
        Nature(cobblemonResource("adamant"), "cobblemon.nature.adamant",
        Stats.ATTACK, Stats.SPECIAL_ATTACK, Flavour.SPICY, Flavour.DRY)
    )

    val NAUGHTY = registerNature(
        Nature(cobblemonResource("naughty"), "cobblemon.nature.naughty",
        Stats.ATTACK, Stats.SPECIAL_DEFENCE, Flavour.SPICY, Flavour.BITTER)
    )

    val BOLD = registerNature(
        Nature(cobblemonResource("bold"), "cobblemon.nature.bold",
        Stats.DEFENCE, Stats.ATTACK, Flavour.SOUR, Flavour.SPICY)
    )

    val DOCILE = registerNature(
        Nature(cobblemonResource("docile"), "cobblemon.nature.docile",
        null, null, null, null)
    )

    val RELAXED = registerNature(
        Nature(cobblemonResource("relaxed"), "cobblemon.nature.relaxed",
        Stats.DEFENCE, Stats.SPEED, Flavour.SOUR, Flavour.SWEET)
    )

    val IMPISH = registerNature(
        Nature(cobblemonResource("impish"), "cobblemon.nature.impish",
        Stats.DEFENCE, Stats.SPECIAL_ATTACK, Flavour.SOUR, Flavour.DRY)
    )

    val LAX = registerNature(
        Nature(cobblemonResource("lax"), "cobblemon.nature.lax",
        Stats.DEFENCE, Stats.SPECIAL_DEFENCE, Flavour.SOUR, Flavour.BITTER)
    )

    val TIMID = registerNature(
        Nature(cobblemonResource("timid"), "cobblemon.nature.timid",
        Stats.SPEED, Stats.ATTACK, Flavour.SWEET, Flavour.SPICY)
    )

    val HASTY = registerNature(
        Nature(cobblemonResource("hasty"), "cobblemon.nature.hasty",
        Stats.SPEED, Stats.DEFENCE, Flavour.SWEET, Flavour.SOUR)
    )

    val SERIOUS = registerNature(
        Nature(cobblemonResource("serious"), "cobblemon.nature.serious",
        null, null, null, null)
    )

    val JOLLY = registerNature(
        Nature(cobblemonResource("jolly"), "cobblemon.nature.jolly",
        Stats.SPEED, Stats.SPECIAL_ATTACK, Flavour.SWEET, Flavour.DRY)
    )

    val NAIVE = registerNature(
        Nature(cobblemonResource("naive"), "cobblemon.nature.naive",
        Stats.SPEED, Stats.SPECIAL_DEFENCE, Flavour.SWEET, Flavour.BITTER)
    )

    val MODEST = registerNature(
        Nature(cobblemonResource("modest"), "cobblemon.nature.modest",
        Stats.SPECIAL_ATTACK, Stats.ATTACK, null, null)
    )

    val MILD = registerNature(
        Nature(cobblemonResource("mild"), "cobblemon.nature.mild",
        Stats.SPECIAL_ATTACK, Stats.DEFENCE, Flavour.DRY, Flavour.SOUR)
    )

    val QUIET = registerNature(
        Nature(cobblemonResource("quiet"), "cobblemon.nature.quiet",
        Stats.SPECIAL_ATTACK, Stats.SPEED, Flavour.DRY, Flavour.SWEET)
    )

    val BASHFUL = registerNature(
        Nature(cobblemonResource("bashful"), "cobblemon.nature.bashful",
        null, null, null, null)
    )

    val RASH = registerNature(
        Nature(cobblemonResource("rash"), "cobblemon.nature.rash",
        Stats.SPECIAL_ATTACK, Stats.SPECIAL_DEFENCE, Flavour.DRY, Flavour.BITTER)
    )

    val CALM = registerNature(
        Nature(cobblemonResource("calm"), "cobblemon.nature.calm",
        Stats.SPECIAL_DEFENCE, Stats.ATTACK, Flavour.BITTER, Flavour.SPICY)
    )

    val GENTLE = registerNature(
        Nature(cobblemonResource("gentle"), "cobblemon.nature.gentle",
        Stats.SPECIAL_DEFENCE, Stats.DEFENCE, Flavour.BITTER, Flavour.SOUR)
    )

    val SASSY = registerNature(
        Nature(cobblemonResource("sassy"), "cobblemon.nature.sassy",
        Stats.SPECIAL_DEFENCE, Stats.SPEED, Flavour.BITTER, Flavour.SWEET)
    )

    val CAREFUL = registerNature(
        Nature(cobblemonResource("careful"), "cobblemon.nature.careful",
        Stats.SPECIAL_DEFENCE, Stats.SPECIAL_ATTACK, Flavour.BITTER, Flavour.DRY)
    )

    val QUIRKY = registerNature(
        Nature(cobblemonResource("quirky"), "cobblemon.nature.quirky",
        null, null, null, null)
    )


    /**
     * Registers a new nature type
     */
    fun registerNature(nature: Nature): Nature {
        allNatures.add(nature)
        return nature
    }

    /**
     * Gets a nature by registry name
     * @return a nature type or null
     */
    fun getNature(name: ResourceLocation): Nature? {
        return allNatures.find { nature -> nature.name == name }
    }

    /**
     * Utility method to get a nature by string
     * @return a nature type or null
     */
    fun getNature(identifier: String): Nature? {
        val nature = getNature(cobblemonResource(identifier))
        if(nature != null) return nature
        return getNature(ResourceLocation.parse(identifier))
    }

    /**
     * Helper function for a random Nature
     * @return a random nature type
     */
    fun getRandomNature(): Nature {
        return allNatures.random()
    }

    fun all(): Collection<Nature> = this.allNatures.toList()

}