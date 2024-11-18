
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.purgatory.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.purgatory.client.renderer.GruntRenderer;
import net.mcreator.purgatory.client.renderer.Grunt2Renderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PurgatoryModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PurgatoryModEntities.GRUNT.get(), GruntRenderer::new);
		event.registerEntityRenderer(PurgatoryModEntities.GRUNT_2.get(), Grunt2Renderer::new);
	}
}
