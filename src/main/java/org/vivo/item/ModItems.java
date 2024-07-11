package org.vivo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.vivo.Planvivo;

public class ModItems {

    public static final Item VIVO = registerItem("vivo", new Item(new FabricItemSettings().maxDamage(7).maxCount(1)));

    private static void addItemToGroup(FabricItemGroupEntries entries){
        entries.add(VIVO);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Planvivo.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Planvivo.LOGGER.info("register...");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToGroup);
    }
}
