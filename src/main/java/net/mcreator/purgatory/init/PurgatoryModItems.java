
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purgatory.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.purgatory.PurgatoryMod;

public class PurgatoryModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PurgatoryMod.MODID);
	public static final DeferredItem<Item> PURGATORY_BLOCK = block(PurgatoryModBlocks.PURGATORY_BLOCK);
	public static final DeferredItem<Item> GRUNT_SPAWN_EGG = REGISTRY.register("grunt_spawn_egg", () -> new DeferredSpawnEggItem(PurgatoryModEntities.GRUNT, -1, -1, new Item.Properties()));
	public static final DeferredItem<Item> GRUNT_2_SPAWN_EGG = REGISTRY.register("grunt_2_spawn_egg", () -> new DeferredSpawnEggItem(PurgatoryModEntities.GRUNT_2, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
