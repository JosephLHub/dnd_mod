package net.yackrond.dndmod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DnDMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<MaceratorBlockEntity>> MACERATOR_BE = BLOCK_ENTITIES.register("macerator_be", () ->
            BlockEntityType.Builder.of(MaceratorBlockEntity::new, ModBlocks.MACERATOR.get()).build(null));
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
