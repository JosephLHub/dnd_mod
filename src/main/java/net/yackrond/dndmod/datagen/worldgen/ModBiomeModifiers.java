package net.yackrond.dndmod.datagen.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;
import net.yackrond.dndmod.DnDMod;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_SILVER_ORE = registerKey("add_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SILVER_ORE = registerKey("add_nether_silver_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SILVER_ORE = registerKey("add_end_silver_ore");

    public static final ResourceKey<BiomeModifier> ADD_PLATINUM_ORE = registerKey("add_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_PLATINUM_ORE = registerKey("add_nether_platinum_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_PLATINUM_ORE = registerKey("add_end_platinum_ore");

    public static final ResourceKey<BiomeModifier> ADD_ADAMANT_ORE = registerKey("add_adamant_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_ADAMANT_ORE = registerKey("add_nether_adamant_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_ADAMANT_ORE = registerKey("add_end_adamant_ore");

    public static final ResourceKey<BiomeModifier> ADD_RUBY_ORE = registerKey("add_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_RUBY_ORE = registerKey("add_nether_ruby_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_RUBY_ORE = registerKey("add_end_ruby_ore");

    public static final ResourceKey<BiomeModifier> ADD_SAPPHIRE_ORE = registerKey("add_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_SAPPHIRE_ORE = registerKey("add_nether_sapphire_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_SAPPHIRE_ORE = registerKey("add_end_sapphire_ore");

    public static final ResourceKey<BiomeModifier> ADD_CHRYSOLITE_ORE = registerKey("add_chrysolite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_CHRYSOLITE_ORE = registerKey("add_nether_chrysolite_ore");
    public static final ResourceKey<BiomeModifier> ADD_END_CHRYSOLITE_ORE = registerKey("add_end_chrysolite_ore");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SILVER_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SILVER_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_SILVER_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SILVER_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PLATINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_PLATINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_PLATINUM_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_PLATINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ADAMANT_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ADAMANT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_ADAMANT_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_ADAMANT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_ADAMANT_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_ADAMANT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUBY_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_RUBY_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_RUBY_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_RUBY_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_SAPPHIRE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_SAPPHIRE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_SAPPHIRE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_CHRYSOLITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.CHRYSOLITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_NETHER_CHRYSOLITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_CHRYSOLITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(ADD_END_CHRYSOLITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_CHRYSOLITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
    }
    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(DnDMod.MOD_ID, name));
    }
}
