package net.mcreator.purgatory.procedures;

import net.minecraft.world.entity.Entity;

public class GruntOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("lunge", 300);
	}
}
