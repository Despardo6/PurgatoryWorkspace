package net.mcreator.purgatory.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.purgatory.entity.Grunt2Entity;

public class Grunt2Model extends GeoModel<Grunt2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Grunt2Entity entity) {
		return ResourceLocation.parse("purgatory:animations/grunt.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Grunt2Entity entity) {
		return ResourceLocation.parse("purgatory:geo/grunt.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Grunt2Entity entity) {
		return ResourceLocation.parse("purgatory:textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(Grunt2Entity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("Head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
