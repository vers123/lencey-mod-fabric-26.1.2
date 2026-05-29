package com.linglan.lencey.tag;

import com.linglan.lencey.LenceyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {

    public static final TagKey<Item> LENCEY_MATERIALS = bind("lencey_materials");

    private static TagKey<Item> bind(final String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, name));
    }
}
