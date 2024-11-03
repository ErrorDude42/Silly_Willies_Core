package io.github.errordude42.sillywillycore.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import io.github.errordude42.sillywillycore.entity.TestEntity;

public class TestModel extends GeoModel<TestEntity> {
	@Override
	public ResourceLocation getAnimationResource(TestEntity entity) {
		return new ResourceLocation("silly_willy_core", "animations/dreamscape_flyingeye_gecko.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TestEntity entity) {
		return new ResourceLocation("silly_willy_core", "geo/dreamscape_flyingeye_gecko.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TestEntity entity) {
		return new ResourceLocation("silly_willy_core", "textures/entities/" + entity.getTexture() + ".png");
	}

}
