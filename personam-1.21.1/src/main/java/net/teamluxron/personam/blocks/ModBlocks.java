package net.teamluxron.personam.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.teamluxron.personam.PersonaM;

public class ModBlocks {
    public static final Block VELVITE = registerBlock("velvite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_STAIRS = registerBlock("velvite_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_SLAB = registerBlock("velvite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_WALL = registerBlock("velvite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VELVITE = registerBlock("velvite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VELVITE_STAIRS = registerBlock("polished_velvite_stairs",
            new StairsBlock(ModBlocks.POLISHED_VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VELVITE_SLAB = registerBlock("polished_velvite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VELVITE_WALL = registerBlock("polished_velvite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_BRICKS = registerBlock("velvite_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_BRICK_STAIRS = registerBlock("velvite_brick_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_BRICK_SLAB = registerBlock("velvite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_BRICK_WALL = registerBlock("velvite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_TILE = registerBlock("velvite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_TILE_STAIRS = registerBlock("velvite_tile_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_TILE_SLAB = registerBlock("velvite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block VELVITE_TILE_WALL = registerBlock("velvite_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VELVITE = registerBlock("polished_velvite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_VELVITE = registerBlock("chiseled_velvite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE = registerBlock("soulcite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_STAIRS = registerBlock("soulcite_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_SLAB = registerBlock("soulcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_WALL = registerBlock("soulcite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_SOULCITE = registerBlock("polished_soulcite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_SOULCITE_STAIRS = registerBlock("polished_soulcite_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_SOULCITE_SLAB = registerBlock("polished_soulcite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_SOULCITE_WALL = registerBlock("polished_soulcite_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_BRICKS = registerBlock("soulcite_bricks",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_BRICK_STAIRS = registerBlock("soulcite_brick_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_BRICK_SLAB = registerBlock("soulcite_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_BRICK_WALL = registerBlock("soulcite_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_TILE = registerBlock("soulcite_tile",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_TILE_STAIRS = registerBlock("soulcite_tile_stairs",
            new StairsBlock(ModBlocks.VELVITE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_TILE_SLAB = registerBlock("soulcite_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block SOULCITE_TILE_WALL = registerBlock("soulcite_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_SOULCITE = registerBlock("chiseled_soulcite",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PersonaM.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PersonaM.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        PersonaM.LOGGER.info("Registering Blocks for " + PersonaM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.VELVITE);
            entries.add(ModBlocks.VELVITE_STAIRS);
            entries.add(ModBlocks.VELVITE_SLAB);
            entries.add(ModBlocks.VELVITE_WALL);
            entries.add(ModBlocks.POLISHED_VELVITE);
            entries.add(ModBlocks.POLISHED_VELVITE_STAIRS);
            entries.add(ModBlocks.POLISHED_VELVITE_SLAB);
            entries.add(ModBlocks.POLISHED_VELVITE_WALL);
            entries.add(ModBlocks.VELVITE_BRICKS);
            entries.add(ModBlocks.VELVITE_BRICK_STAIRS);
            entries.add(ModBlocks.VELVITE_BRICK_SLAB);
            entries.add(ModBlocks.VELVITE_BRICK_WALL);
            entries.add(ModBlocks.VELVITE_TILE);
            entries.add(ModBlocks.VELVITE_TILE_STAIRS);
            entries.add(ModBlocks.VELVITE_TILE_SLAB);
            entries.add(ModBlocks.VELVITE_TILE_WALL);
            entries.add(ModBlocks.CHISELED_VELVITE);
            entries.add(ModBlocks.SOULCITE);
            entries.add(ModBlocks.SOULCITE_STAIRS);
            entries.add(ModBlocks.SOULCITE_SLAB);
            entries.add(ModBlocks.SOULCITE_WALL);
            entries.add(ModBlocks.POLISHED_SOULCITE);
            entries.add(ModBlocks.POLISHED_SOULCITE_STAIRS);
            entries.add(ModBlocks.POLISHED_SOULCITE_SLAB);
            entries.add(ModBlocks.POLISHED_SOULCITE_WALL);
            entries.add(ModBlocks.SOULCITE_BRICKS);
            entries.add(ModBlocks.SOULCITE_BRICK_STAIRS);
            entries.add(ModBlocks.SOULCITE_BRICK_SLAB);
            entries.add(ModBlocks.SOULCITE_BRICK_WALL);
            entries.add(ModBlocks.SOULCITE_TILE);
            entries.add(ModBlocks.SOULCITE_TILE_STAIRS);
            entries.add(ModBlocks.SOULCITE_TILE_SLAB);
            entries.add(ModBlocks.SOULCITE_TILE_WALL);
            entries.add(ModBlocks.CHISELED_SOULCITE);
        });
    }
}
