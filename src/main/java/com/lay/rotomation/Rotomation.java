package com.lay.rotomation;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;

@Mod("rotomation")
public final class Rotomation {

    public static final String MOD_ID = "rotomation";

    public static ResourceLocation of(String path){
        return ResourceLocation.fromNamespaceAndPath(Rotomation.MOD_ID, path);
    }

    public static ResourceLocation of(ResourceLocation path){
        return ResourceLocation.fromNamespaceAndPath(Rotomation.MOD_ID, path.getPath());
    }

    public Rotomation() {
        NeoForge.EVENT_BUS.register(Rotomation.class);
    }

}
