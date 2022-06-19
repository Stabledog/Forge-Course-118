package net.kaupenjoe.mccourse.entity.client.armor;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.item.custom.CobaltArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CobaltArmorModel extends AnimatedGeoModel<CobaltArmorItem> {
    @Override
    public ResourceLocation getModelResource(CobaltArmorItem object) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "geo/cobalt_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CobaltArmorItem object) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "textures/models/armor/cobalt_armor_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CobaltArmorItem animatable) {
        return new ResourceLocation(MCCourseMod.MOD_ID, "animations/armor_animation.json");
    }
}
