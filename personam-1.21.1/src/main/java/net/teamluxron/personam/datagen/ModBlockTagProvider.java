package net.teamluxron.personam.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.teamluxron.personam.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
         .add(ModBlocks.VELVITE)
         .add(ModBlocks.POLISHED_VELVITE)
         .add(ModBlocks.VELVITE_BRICKS)
         .add(ModBlocks.VELVITE_TILE)
         .add(ModBlocks.CHISELED_VELVITE)
         .add(ModBlocks.SOULCITE)
         .add(ModBlocks.POLISHED_SOULCITE)
         .add(ModBlocks.SOULCITE_BRICKS)
         .add(ModBlocks.SOULCITE_TILE)
         .add(ModBlocks.CHISELED_SOULCITE)

        ;
    getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

        ;
    }
}
