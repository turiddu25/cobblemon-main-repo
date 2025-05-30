/*
 * Copyright (C) 2023 Cobblemon Contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package com.cobblemon.mod.common.advancement.criterion

import com.mojang.serialization.Codec
import com.mojang.serialization.codecs.RecordCodecBuilder
import net.minecraft.advancements.critereon.ContextAwarePredicate
import net.minecraft.advancements.critereon.EntityPredicate
import net.minecraft.server.level.ServerPlayer
import java.util.Optional

/**
 * A context that is used when you require a [CountableContext] along with some type string.
 *
 * @author Hiroku
 * @since November 4th, 2022
 */
open class CountablePokemonTypeContext(times: Int, var species: String) : CountableContext(times)

class CaughtPokemonCriterion(
    playerCtx: Optional<ContextAwarePredicate>,
    val species: String,
    count: Int
): CountableCriterion<CountablePokemonTypeContext>(playerCtx, count) {

    companion object {
        val CODEC: Codec<CaughtPokemonCriterion> = RecordCodecBuilder.create { it.group(
            EntityPredicate.ADVANCEMENT_CODEC.optionalFieldOf("player").forGetter(CaughtPokemonCriterion::playerCtx),
            Codec.STRING.optionalFieldOf("species", "any").forGetter(CaughtPokemonCriterion::species),
            Codec.INT.optionalFieldOf("count", 0).forGetter(CaughtPokemonCriterion::count)
        ).apply(it, ::CaughtPokemonCriterion) }
    }

    override fun matches(player: ServerPlayer, context: CountablePokemonTypeContext): Boolean {
        return super.matches(player, context) && (context.species == species || species == "any")
    }
}
