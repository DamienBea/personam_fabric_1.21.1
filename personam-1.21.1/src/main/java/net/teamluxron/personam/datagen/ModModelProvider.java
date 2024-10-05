package net.teamluxron.personam.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.teamluxron.personam.blocks.ModBlocks;
import net.teamluxron.personam.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Blocks
        BlockStateModelGenerator.BlockTexturePool VELVITEBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VELVITE);
        BlockStateModelGenerator.BlockTexturePool POLISHED_VELVITEBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_VELVITE);
        BlockStateModelGenerator.BlockTexturePool VELVITE_BRICKSBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VELVITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool VELVITE_TILElockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VELVITE_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_VELVITE);
        BlockStateModelGenerator.BlockTexturePool SOULCITEBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOULCITE);
        BlockStateModelGenerator.BlockTexturePool POLISHED_SOULCITEBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SOULCITE);
        BlockStateModelGenerator.BlockTexturePool SOULCITE_BRICKSBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOULCITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool SOULCITE_TILEBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SOULCITE_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SOULCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VELVET_OAK_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VELVET_OAK_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRIPPED_VELVET_OAK_LOG);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRIPPED_VELVET_OAK_WOOD);
        BlockStateModelGenerator.BlockTexturePool VOPBlockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VELVET_OAK_PLANKS);


        //Stairs
        VELVITEBlockPool.stairs(ModBlocks.VELVITE_STAIRS);
        POLISHED_VELVITEBlockPool.stairs(ModBlocks.POLISHED_VELVITE_STAIRS);
        VELVITE_BRICKSBlockPool.stairs(ModBlocks.VELVITE_BRICK_STAIRS);
        VELVITE_TILElockPool.stairs(ModBlocks.VELVITE_TILE_STAIRS);
        SOULCITEBlockPool.stairs(ModBlocks.SOULCITE_STAIRS);
        POLISHED_SOULCITEBlockPool.stairs(ModBlocks.POLISHED_SOULCITE_STAIRS);
        SOULCITE_BRICKSBlockPool.stairs(ModBlocks.SOULCITE_BRICK_STAIRS);
        SOULCITE_TILEBlockPool.stairs(ModBlocks.SOULCITE_TILE_STAIRS);
        VOPBlockPool.stairs(ModBlocks.VELVET_OAK_STAIRS);

        //Slabs
        VELVITEBlockPool.slab(ModBlocks.VELVITE_SLAB);
        POLISHED_VELVITEBlockPool.slab(ModBlocks.POLISHED_VELVITE_SLAB);
        VELVITE_BRICKSBlockPool.slab(ModBlocks.VELVITE_BRICK_SLAB);
        VELVITE_TILElockPool.slab(ModBlocks.VELVITE_TILE_SLAB);
        SOULCITEBlockPool.slab(ModBlocks.SOULCITE_SLAB);
        POLISHED_SOULCITEBlockPool.slab(ModBlocks.POLISHED_SOULCITE_SLAB);
        SOULCITE_BRICKSBlockPool.slab(ModBlocks.SOULCITE_BRICK_SLAB);
        SOULCITE_TILEBlockPool.slab(ModBlocks.SOULCITE_TILE_SLAB);
        VOPBlockPool.slab(ModBlocks.VELVET_OAK_SLAB);

        //Walls
        VELVITEBlockPool.wall(ModBlocks.VELVITE_WALL);
        POLISHED_VELVITEBlockPool.wall(ModBlocks.POLISHED_VELVITE_WALL);
        VELVITE_BRICKSBlockPool.wall(ModBlocks.VELVITE_BRICK_WALL);
        VELVITE_TILElockPool.wall(ModBlocks.VELVITE_TILE_WALL);
        SOULCITEBlockPool.wall(ModBlocks.SOULCITE_WALL);
        POLISHED_SOULCITEBlockPool.wall(ModBlocks.POLISHED_SOULCITE_WALL);
        SOULCITE_BRICKSBlockPool.wall(ModBlocks.SOULCITE_BRICK_WALL);
        SOULCITE_TILEBlockPool.wall(ModBlocks.SOULCITE_TILE_WALL);

        //Buttons and Pressureplates
        VOPBlockPool.button(ModBlocks.VELVET_OAK_BUTTON);
        VOPBlockPool.pressurePlate(ModBlocks.VELVET_OAK_PRESSURE_PLATE);

        //Fences and Gates
        VOPBlockPool.fence(ModBlocks.VELVET_OAK_FENCE);
        VOPBlockPool.fenceGate(ModBlocks.VELVET_OAK_FENCE_GATE);

        //Doors and Trapdoors
        blockStateModelGenerator.registerDoor(ModBlocks.VELVET_OAK_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.VELVET_OAK_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Resources
        itemModelGenerator.register(ModItems.SOULCRYST_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOUL_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.SOULCRYST_INK, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLANK_TAROT_CARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SOULGALLIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERGALLIUM_INGOT, Models.GENERATED);


    }
}
