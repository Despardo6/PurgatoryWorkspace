package net.mcreator.purgatory.procedures;

import net.minecraft.world.entity.Entity;

public class GruntDodgeOnSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("dodge", 300);
	}
}
