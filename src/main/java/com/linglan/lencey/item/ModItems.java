package com.linglan.lencey.item;

import com.linglan.lencey.LenceyMod;
import com.linglan.lencey.item.custom.LenceyItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static final Item LENCEY = registerItem("lencey",
            LenceyItem::new,
            new Item.Properties().durability(127).stacksTo(1));

    private static Item registerItem(final String name, final Item.Properties properties) {
        return registerItem(name, Item::new, properties);
    }

    private static Item registerItem(final String name, final Function<Item.Properties, Item> itemFactory, final Item.Properties properties) {
        ResourceKey<Item> itmeKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, name));
        Item item = (Item)itemFactory.apply(properties.setId(itmeKey));
        if (item instanceof BlockItem blockItem) {
            blockItem.registerBlocks(Item.BY_BLOCK, item);
        }

        return Registry.register(BuiltInRegistries.ITEM, itmeKey, item);
    }

    public static void register() {
        LenceyMod.LOGGER.info("Registering Mod Items" + LenceyMod.MOD_ID);
    }
}
