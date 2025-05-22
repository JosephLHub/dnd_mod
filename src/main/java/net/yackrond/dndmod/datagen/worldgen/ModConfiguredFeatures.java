package net.yackrond.dndmod.datagen.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ADAMANT_ORE_KEY = registerKey("adamant_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ADAMANT_ORE_KEY = registerKey("nether_adamant_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ADAMANT_ORE_KEY = registerKey("end_adamant_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CHRYSOLITE_ORE_KEY = registerKey("chrysolite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CHRYSOLITE_ORE_KEY = registerKey("nether_chrysolite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CHRYSOLITE_ORE_KEY = registerKey("end_chrysolite_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> YEW_KEY = registerKey("yew");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceables,
                ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.PLATINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldAdamantOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.ADAMANT_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ADAMANT_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldChrysoliteOres = List.of(OreConfiguration.target(stoneReplaceables,
                        ModBlocks.CHRYSOLITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_CHRYSOLITE_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres, 9));
        register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_SILVER_ORE.get().defaultBlockState(), 7));
        register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_SILVER_ORE.get().defaultBlockState(), 5));

        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres, 5));
        register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_PLATINUM_ORE.get().defaultBlockState(), 7));
        register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_PLATINUM_ORE.get().defaultBlockState(), 9));

        register(context, OVERWORLD_ADAMANT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAdamantOres, 1));
        register(context, NETHER_ADAMANT_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_ADAMANT_ORE.get().defaultBlockState(), 3));
        register(context, END_ADAMANT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_ADAMANT_ORE.get().defaultBlockState(), 5));

        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 7));
        register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_RUBY_ORE.get().defaultBlockState(), 7));
        register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_RUBY_ORE.get().defaultBlockState(), 7));

        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 7));
        register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 7));
        register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_SAPPHIRE_ORE.get().defaultBlockState(), 7));

        register(context, OVERWORLD_CHRYSOLITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldChrysoliteOres, 7));
        register(context, NETHER_CHRYSOLITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, ModBlocks.NETHER_CHRYSOLITE_ORE.get().defaultBlockState(), 7));
        register(context, END_CHRYSOLITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables, ModBlocks.END_CHRYSOLITE_ORE.get().defaultBlockState(), 7));

        register(context, YEW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.YEW_LOG.get()), new StraightTrunkPlacer(5, 4, 3), //TREE TRUNK
                BlockStateProvider.simple(ModBlocks.YEW_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3), //LEAVES
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(DnDMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
