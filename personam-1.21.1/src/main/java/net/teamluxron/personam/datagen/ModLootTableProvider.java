package net.teamluxron.personam.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.teamluxron.personam.blocks.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.VELVITE);
        addDrop(ModBlocks.VELVITE_STAIRS);
        addDrop(ModBlocks.VELVITE_SLAB, slabDrops(ModBlocks.VELVITE_SLAB));
        addDrop(ModBlocks.VELVITE_WALL);
        addDrop(ModBlocks.POLISHED_VELVITE);
        addDrop(ModBlocks.POLISHED_VELVITE_STAIRS);
        addDrop(ModBlocks.POLISHED_VELVITE_SLAB, slabDrops(ModBlocks.POLISHED_VELVITE_SLAB));
        addDrop(ModBlocks.POLISHED_VELVITE_WALL);
        addDrop(ModBlocks.VELVITE_BRICKS);
        addDrop(ModBlocks.VELVITE_BRICK_STAIRS);
        addDrop(ModBlocks.VELVITE_BRICK_SLAB, slabDrops(ModBlocks.VELVITE_BRICK_SLAB));
        addDrop(ModBlocks.VELVITE_BRICK_WALL);
        addDrop(ModBlocks.VELVITE_TILE);
        addDrop(ModBlocks.VELVITE_TILE_STAIRS);
        addDrop(ModBlocks.VELVITE_TILE_SLAB, slabDrops(ModBlocks.VELVITE_TILE_SLAB));
        addDrop(ModBlocks.VELVITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_VELVITE);
        addDrop(ModBlocks.SOULCITE);
        addDrop(ModBlocks.SOULCITE_STAIRS);
        addDrop(ModBlocks.SOULCITE_SLAB, slabDrops(ModBlocks.SOULCITE_SLAB));
        addDrop(ModBlocks.SOULCITE_WALL);
        addDrop(ModBlocks.POLISHED_SOULCITE);
        addDrop(ModBlocks.POLISHED_SOULCITE_STAIRS);
        addDrop(ModBlocks.POLISHED_SOULCITE_SLAB, slabDrops(ModBlocks.POLISHED_SOULCITE_SLAB));
        addDrop(ModBlocks.POLISHED_SOULCITE_WALL);
        addDrop(ModBlocks.SOULCITE_BRICKS);
        addDrop(ModBlocks.SOULCITE_BRICK_STAIRS);
        addDrop(ModBlocks.SOULCITE_BRICK_SLAB, slabDrops(ModBlocks.SOULCITE_BRICK_SLAB));
        addDrop(ModBlocks.SOULCITE_BRICK_WALL);
        addDrop(ModBlocks.SOULCITE_TILE);
        addDrop(ModBlocks.SOULCITE_TILE_STAIRS);
        addDrop(ModBlocks.SOULCITE_TILE_SLAB, slabDrops(ModBlocks.SOULCITE_TILE_SLAB));
        addDrop(ModBlocks.SOULCITE_TILE_WALL);
        addDrop(ModBlocks.CHISELED_SOULCITE);
        addDrop(ModBlocks.VELVET_OAK_LOG);
        addDrop(ModBlocks.VELVET_OAK_WOOD);
        addDrop(ModBlocks.STRIPPED_VELVET_OAK_LOG);
        addDrop(ModBlocks.STRIPPED_VELVET_OAK_WOOD);
        addDrop(ModBlocks.VELVET_OAK_PLANKS);
        addDrop(ModBlocks.VELVET_OAK_STAIRS);
        addDrop(ModBlocks.VELVET_OAK_SLAB, slabDrops(ModBlocks.VELVET_OAK_SLAB));
        addDrop(ModBlocks.VELVET_OAK_BUTTON);
        addDrop(ModBlocks.VELVET_OAK_PRESSURE_PLATE);
        addDrop(ModBlocks.VELVET_OAK_FENCE);
        addDrop(ModBlocks.VELVET_OAK_FENCE_GATE);
        addDrop(ModBlocks.VELVET_OAK_DOOR, doorDrops(ModBlocks.VELVET_OAK_DOOR));
        addDrop(ModBlocks.VELVET_OAK_TRAPDOOR);
        addDrop(ModBlocks.VELVET_OAK_SAPLING);

    }
}
