
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purgatory.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.purgatory.block.PurgatoryBlockBlock;
import net.mcreator.purgatory.PurgatoryMod;

public class PurgatoryModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PurgatoryMod.MODID);
	public static final DeferredBlock<Block> PURGATORY_BLOCK = REGISTRY.register("purgatory_block", PurgatoryBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
