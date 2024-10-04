package net.teamluxron.personam.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.teamluxron.personam.PersonaM;

public class ModItems {

    //Resources
    public static final Item SOULCRYST_DUST = registerItem("soulcryst_dust", new Item(new Item.Settings()));
    public static final Item SOUL_CRYSTAL = registerItem("soul_crystal", new Item(new Item.Settings()));
    public static final Item SOULCRYST_INK = registerItem("soulcryst_ink", new Item(new Item.Settings()));
    public static final Item BLANK_TAROT_CARD = registerItem("blank_tarot_card", new Item(new Item.Settings()));
    public static final Item SOULGALLIUM_INGOT = registerItem("soulgallium_ingot", new Item(new Item.Settings()));
    public static final Item RAW_SOULGALLIUM = registerItem("raw_soulgallium", new Item(new Item.Settings()));
    public static final Item NETHERGALLIUM_INGOT = registerItem("nethergallium_ingot", new Item(new Item.Settings()));








    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PersonaM.MOD_ID, name), item);
    }

    public static void registerModItems(){
        PersonaM.LOGGER.info("Registering Items for " + PersonaM.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SOULCRYST_DUST);
            entries.add(SOUL_CRYSTAL);
            entries.add(SOULCRYST_INK);
            entries.add(BLANK_TAROT_CARD);
            entries.add(SOULGALLIUM_INGOT);
            entries.add(RAW_SOULGALLIUM);
            entries.add(NETHERGALLIUM_INGOT);
        });
    }
}
