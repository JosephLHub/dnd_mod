package net.yackrond.dndmod.item.custom;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.item.ModItems;
import net.yackrond.dndmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier ADAMANTIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_MODDED_TOOL, () -> Ingredient.of(ModItems.ADAMANT_INGOT.get())),
            new ResourceLocation(DnDMod.MOD_ID, "adamant_ingot"), List.of(Tiers.NETHERITE), List.of());
}
