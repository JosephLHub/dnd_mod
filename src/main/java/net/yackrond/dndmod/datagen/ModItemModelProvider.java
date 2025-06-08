package net.yackrond.dndmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DnDMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.METAL_DETECTOR);

        simpleItem(ModItems.MINIATURE_CLOAK);
        simpleItem(ModItems.MINIATURE_BELL);
        simpleItem(ModItems.SILVER_WIRE);
        simpleItem(ModItems.CURED_LEATHER);
        simpleItem(ModItems.HOLY_WATER_BOTTLE);
        simpleItem(ModItems.SILVER_MIRROR);
        simpleItem(ModItems.HOLY_TEXT);
        simpleItem(ModItems.ROPE);
        simpleItem(ModItems.CLOTH_STRIP);
        simpleItem(ModItems.MISTLETOE_ASHES);
        simpleItem(ModItems.LINKED_PLATINUM_RINGS);
        simpleItem(ModItems.INCENSE);
        simpleItem(ModItems.LEATHER_STRAP);
        simpleItem(ModItems.BROKEN_PORTAL_KEY);
        simpleItem(ModItems.PORTAL_KEY);
        simpleItem(ModItems.LEAD_SHEET);
        simpleItem(ModItems.COTTON);
        simpleItem(ModItems.CLOTH);
        simpleItem(ModItems.GOLD_TINGED_FULL_MOON_MISTLETOE);
        simpleItem(ModItems.PLATINUM_PLATED_DRAGON_SCALE);
        simpleItem(ModItems.RARE_INCENSE);
        simpleItem(ModItems.GLASS_BEAD);
        simpleItem(ModItems.CRYSTAL_BEAD);
        simpleItem(ModItems.BURNING_INCENSE);
        simpleItem(ModItems.SILVER_ROD);
        simpleItem(ModItems.QUICKSILVER_BOTTLE);
        simpleItem(ModItems.PHOSPHORUS);
        simpleItem(ModItems.MITHRIL_ORB);
        simpleItem(ModItems.MINIATURE_JADE_PRISON);
        simpleItem(ModItems.SOPORIFIC_HERBS);
        simpleItem(ModItems.FLEA_IN_BOTTLE);
        simpleItem(ModItems.MIXED_HERBS);
        simpleItem(ModItems.BRASS_BRAZIER);
        simpleItem(ModItems.TALLOW);
        simpleItem(ModItems.BUTTER);
        simpleItem(ModItems.VIAL_OF_WATER);
        simpleItem(ModItems.VIAL_OF_QUICKSILVER);
        simpleItem(ModItems.GLASS_SHARD);
        simpleItem(ModItems.DUST);
        simpleItem(ModItems.BRIMSTONE);
        simpleItem(ModItems.DECK_OF_CARDS);
        simpleItem(ModItems.FOX_FUR);
        simpleItem(ModItems.FISH_TAIL);
        simpleItem(ModItems.GILDED_ACORN);
        simpleItem(ModItems.PICKLED_TENTACLE);
        simpleItem(ModItems.TENTACLE);
        simpleItem(ModItems.HOLY_SYMBOL);
        simpleItem(ModItems.ROTTEN_EGG);
        simpleItem(ModItems.SKUNK_CABBAGE);
        simpleItem(ModItems.GILDED_FLOWER);
        simpleItem(ModItems.VIAL_OF_FRESH_BLOOD);
        simpleItem(ModItems.VIAL_OF_BLOOD);
        simpleItem(ModItems.CRYSTAL_VIAL_OF_TEARS);
        simpleItem(ModItems.SILVER_WHISTLE);
        simpleItem(ModItems.PLATINUM_VIAL_OF_EYEBALL);
        simpleItem(ModItems.ORNATE_STONE);
        simpleItem(ModItems.PEBBLE);
        simpleItem(ModItems.ASH);
        simpleItem(ModItems.GOLD_VIAL);
        simpleItem(ModItems.GRAIN);
        simpleItem(ModItems.GOLDEN_RELIQUARY);
        simpleItem(ModItems.DRAGON_INSIGNIA);
        simpleItem(ModItems.RUBY_VIAL_OF_FRESH_BLOOD);
        simpleItem(ModItems.RUBY_VIAL_OF_BLOOD);
        simpleItem(ModItems.THORNY_TWIG);
        simpleItem(ModItems.MINIATURE_IVORY_PORTAL);
        simpleItem(ModItems.SILVER_SPOON);
        simpleItem(ModItems.OVERWORLD_ATTUNED_TUNING_FORK);
        simpleItem(ModItems.NETHER_ATTUNED_TUNING_FORK);
        simpleItem(ModItems.END_ATTUNED_TUNING_FORK);
        simpleItem(ModItems.CLOTH_WRAPPED_FUR);
        simpleItem(ModItems.SALT);
        simpleItem(ModItems.PEARL);
        simpleItem(ModItems.OWL_FEATHER);
        simpleItem(ModItems.MARKED_STICK);
        simpleItem(ModItems.MARKED_BONE);
        simpleItem(ModItems.COPPER_PIECE);
        simpleItem(ModItems.BLOODHOUND_FUR);
        simpleItem(ModItems.TUNING_FORK);
        simpleItem(ModItems.TALC);
        simpleItem(ModItems.GLASS_EYE);
        simpleItem(ModItems.MINIATURE_CLAY_ZIGGURAT);
        simpleItem(ModItems.BAT_FUR);
        simpleItem(ModItems.VIAL_OF_HOLY_WATER);
        simpleItem(ModItems.VIAL_OF_UNHOLY_WATER);
        simpleItem(ModItems.IVORY_STRIP);
        simpleItem(ModItems.FOCUS);
        simpleItem(ModItems.VIAL_OF_EYE_OINTMENT);
        simpleItem(ModItems.HUMMINGBIRD_FEATHER);
        simpleItem(ModItems.PETRIFIED_NEWT_EYE);
        simpleItem(ModItems.ROSE_PETAL);
        simpleItem(ModItems.CRICKET_IN_BOTTLE);
        simpleItem(ModItems.TINY_TART);
        simpleItem(ModItems.SILVER_PIECE);
        simpleItem(ModItems.GOLD_PIECE);
        simpleItem(ModItems.PLATINUM_PIECE);
        simpleItem(ModItems.SNAKE_TONGUE);
        simpleItem(ModItems.VIAL_OF_SWEET_OIL);
        simpleItem(ModItems.ACORN);
        simpleItem(ModItems.VINEGAR_SOAKED_SALT);
        simpleItem(ModItems.VIAL_OF_HONEY);
        simpleItem(ModItems.CLAY_ORB);
        simpleItem(ModItems.DIAMOND_ORB);
        simpleItem(ModItems.EMERALD_ORB);
        simpleItem(ModItems.RUBY_ORB);
        simpleItem(ModItems.SAPPHIRE_ORB);
        simpleItem(ModItems.GLOWWORM_IN_BOTTLE);
        simpleItem(ModItems.FIREFLY_IN_BOTTLE);
        simpleItem(ModItems.PHOSPHORESCENT_MOSS);
        simpleItem(ModItems.FULGUROUS_TWIG);
        simpleItem(ModItems.RED_DRAGON_SCALE);
        simpleItem(ModItems.VIAL_OF_PITCH);
        simpleItem(ModItems.SUMAC_BERRY);
        simpleItem(ModItems.PEANUT);
        simpleItem(ModItems.POWDERED_RHUBARB);
        simpleItem(ModItems.SNAKE_STOMACH);
        simpleItem(ModItems.MOONSEED_SEEDS);
        simpleItem(ModItems.OPALESCENT_FELDSPAR_CHUNK);
        simpleItem(ModItems.FLAMMABLE_ORB);
        simpleItem(ModItems.AMBER_ROD);
        simpleItem(ModItems.AMETHYST_ROD);
        simpleItem(ModItems.GLASS_ROD);
        simpleItem(ModItems.EXPLOSIVE_ORB);
        simpleItem(ModItems.COPPER_WIRE);
        simpleItem(ModItems.PAPER_FAN);
        simpleItem(ModItems.BLACK_PEARL);
        simpleItem(ModItems.GLASS_HALF_ORB);
        simpleItem(ModItems.GUM_ARABIC_HALF_ORB);
        simpleItem(ModItems.VIAL_OF_SLUG_BILE);
        simpleItem(ModItems.SNAKESKIN_GLOVE);
        simpleItem(ModItems.AMETHYST_CONE);
        simpleItem(ModItems.GLASS_CONE);
        simpleItem(ModItems.SUNBURST_PENDANT);
        simpleItem(ModItems.PAPER_CONE);
        simpleItem(ModItems.LEAF_CONE);
        simpleItem(ModItems.SILVER_PIN);
        simpleItem(ModItems.MAGNIFYING_GLASS);
        simpleItem(ModItems.ORNAMENTAL_SWORD);
        simpleItem(ModItems.ONYX);
        simpleItem(ModItems.VIAL_OF_PITCH_AND_QUICKSILVER);
        simpleItem(ModItems.LINKED_SILVER_RINGS);
        simpleItem(ModItems.IRON_STAR);
        simpleItem(ModItems.LEAD_BASED_INK_BOTTLE);
        simpleItem(ModItems.EYELASH_IN_GUM_ARABIC);
        simpleItem(ModItems.POWDERED_JADE);
        simpleItem(ModItems.APPLE_PIE_CRUST);
        simpleItem(ModItems.SILK);
        simpleItem(ModItems.CHICKEN_HEART);
        simpleItem(ModItems.SOPORIFIC_QUILL);
        simpleItem(ModItems.MINIATURE_PLAYER);
        simpleItem(ModItems.UNDEAD_EYE_IN_DIAMOND);
        simpleItem(ModItems.BROKEN_BONE);
        simpleItem(ModItems.BLACK_SILK);
        simpleItem(ModItems.POWDERED_BLACK_PEARL);
        simpleItem(ModItems.POT_OF_GRAVE_DIRT);
        simpleItem(ModItems.POT_OF_BRACKISH_WATER);
        simpleItem(ModItems.MINIATURE_SILVER_CAGE);
        simpleItem(ModItems.PLATINUM_WIRE);
        simpleItem(ModItems.ORNATE_SILVER_INGOT);
        simpleItem(ModItems.DIAMANTINE_HOURGLASS);
        simpleItem(ModItems.MISTLETOE);
        simpleItem(ModItems.SHAMROCK);
        simpleItem(ModItems.DRIED_CARROT);
        simpleItem(ModItems.HOT_PEPPER);
        simpleItem(ModItems.GOLD_HOOK);
        simpleItem(ModItems.MINIATURE_CLAY_HAND);
        simpleItem(ModItems.POWDERED_CORN);
        simpleItem(ModItems.TWISTED_PAPER);
        simpleItem(ModItems.SMOKE_IN_BOTTLE);
        simpleItem(ModItems.LIQUORICE_ROOT);
        simpleItem(ModItems.CORK);
        simpleItem(ModItems.COCOON);
        simpleItem(ModItems.SESAME_SEEDS);
        simpleItem(ModItems.QUIVER);
        simpleItem(ModItems.MANDRAKE_ROOT);
        simpleItem(ModItems.IRON_BLADE);
        simpleItem(ModItems.BAG_OF_SOILS);
        simpleItem(ModItems.OUTER_PLANES_INSIGNIA);
        simpleItem(ModItems.ORNATE_AMETHYST_ROD);
        simpleItem(ModItems.PRAYER_WHEEL);
        simpleItem(ModItems.POT_OF_DEBRIS);
        simpleItem(ModItems.JADE_CIRCLET);
        simpleItem(ModItems.OIL_BOTTLE);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.RAW_SILVER);

        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.RAW_PLATINUM);

        simpleItem(ModItems.ADAMANT_INGOT);
        simpleItem(ModItems.ADAMANT_NUGGET);
        simpleItem(ModItems.RAW_ADAMANT);

        simpleItem(ModItems.COPPER_NUGGET);
        simpleItem(ModItems.POWDERED_COPPER);

        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.CHRYSOLITE);
        simpleItem(ModItems.SUNSTONE);
        simpleItem(ModItems.OPAL);

        simpleItem(ModItems.POWDERED_DIAMOND);
        simpleItem(ModItems.POWDERED_EMERALD);
        simpleItem(ModItems.POWDERED_IRON);
        simpleItem(ModItems.POWDERED_GOLD);
        simpleItem(ModItems.POWDERED_SILVER);
        simpleItem(ModItems.POWDERED_PLATINUM);
        simpleItem(ModItems.POWDERED_ADAMANT);
        simpleItem(ModItems.POWDERED_RUBY);
        simpleItem(ModItems.POWDERED_SAPPHIRE);
        simpleItem(ModItems.POWDERED_CHRYSOLITE);
        simpleItem(ModItems.POWDERED_SUNSTONE);

        simpleBlockItem(ModBlocks.YEW_DOOR);
        fenceItem(ModBlocks.YEW_FENCE, ModBlocks.YEW_PLANKS);
        buttonItem(ModBlocks.YEW_BUTTON, ModBlocks.YEW_PLANKS);
        wallItem(ModBlocks.SILVER_WALL, ModBlocks.SILVER_BLOCK);

        evenSimplerBlockItem(ModBlocks.YEW_STAIRS);
        evenSimplerBlockItem(ModBlocks.YEW_SLAB);
        evenSimplerBlockItem(ModBlocks.YEW_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.YEW_FENCE_GATE);

        trapdoorItem(ModBlocks.YEW_TRAPDOOR);

        simpleItem(ModItems.YEW_SIGN);
        simpleItem(ModItems.YEW_HANGING_SIGN);
        saplingItem(ModBlocks.YEW_SAPLING);

    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(DnDMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
