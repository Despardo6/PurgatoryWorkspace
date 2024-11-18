package net.mcreator.purgatory.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.purgatory.entity.GruntEntity;

public class GruntDodgeProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		double rad = 0;
		double lungeSound = 0;
		if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null) && entity.getPersistentData().getDouble("dodge") >= 300) {
			if (entity instanceof GruntEntity) {
				((GruntEntity) entity).setAnimation("backdash");
			}
			entity.getPersistentData().putDouble("dodge", 0);
			lungeSound = Mth.nextInt(RandomSource.create(), 1, 3);
			rad = Math.toRadians(entity.getYRot());
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + Math.sin(rad) * 2), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + Math.cos(rad) * 2)));
			if (lungeSound == 1) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:item.trident.riptide_1 hostile @a ~ ~ ~ 1 1");
			} else if (lungeSound == 2) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:item.trident.riptide_2 hostile @a ~ ~ ~ 1 1");
			} else if (lungeSound == 3) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"playsound minecraft:item.trident.riptide_3 hostile @a ~ ~ ~ 1 1");
			}
			return false;
		} else {
			if (entity instanceof GruntEntity) {
				((GruntEntity) entity).setAnimation("hurt");
			}
		}
		return true;
	}
}
