package net.mcreator.purgatory.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.purgatory.entity.GruntEntity;

public class GruntEntityFallsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof GruntEntity) {
			((GruntEntity) entity).setAnimation("fall");
		}
	}
}
