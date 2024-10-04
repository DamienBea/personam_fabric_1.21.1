package net.teamluxron.personam.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.teamluxron.personam.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

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
