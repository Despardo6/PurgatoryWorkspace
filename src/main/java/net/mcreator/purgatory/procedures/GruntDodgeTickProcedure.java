package net.mcreator.purgatory.procedures;

import net.minecraft.world.entity.Entity;

public class GruntDodgeTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double rad = 0;
		double lungeSound = 0;
		if (entity.getPersistentData().getDouble("dodge") < 300) {
			entity.getPersistentData().putDouble("dodge", (entity.getPersistentData().getDouble("dodge") + 1));
		}
	}
}
