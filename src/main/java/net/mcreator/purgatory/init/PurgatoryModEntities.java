
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purgatory.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.purgatory.entity.GruntEntity;
import net.mcreator.purgatory.entity.Grunt2Entity;
import net.mcreator.purgatory.PurgatoryMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class PurgatoryModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, PurgatoryMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<GruntEntity>> GRUNT = register("grunt",
			EntityType.Builder.<GruntEntity>of(GruntEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<Grunt2Entity>> GRUNT_2 = register("grunt_2",
			EntityType.Builder.<Grunt2Entity>of(Grunt2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		GruntEntity.init(event);
		Grunt2Entity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRUNT.get(), GruntEntity.createAttributes().build());
		event.put(GRUNT_2.get(), Grunt2Entity.createAttributes().build());
	}
}
