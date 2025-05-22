package net.yackrond.dndmod.util;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.yackrond.dndmod.DnDMod;

public class ModWoodTypes {
    public static final WoodType YEW = WoodType.register(new WoodType(DnDMod.MOD_ID + ":yew", BlockSetType.OAK));
}
