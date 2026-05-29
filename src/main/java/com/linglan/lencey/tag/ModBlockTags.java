package com.linglan.lencey.tag;

import com.linglan.lencey.LenceyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {

    public static final TagKey<Block> PICKAXE_AXE_MINEABLE = create("pickaxe_axe_mineable");

    private static TagKey<Block> create(final String name) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(LenceyMod.MOD_ID, name));
    }
}
