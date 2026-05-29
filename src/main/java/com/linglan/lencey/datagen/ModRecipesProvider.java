package com.linglan.lencey.datagen;

import com.linglan.lencey.block.ModBlocks;
import com.linglan.lencey.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final List<ItemLike> LENCEY_LIST = List.of(ModBlocks.LENCEY_BLOCK);

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                oreSmelting(LENCEY_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.LENCEY, 0.7f, 200, "lencey");

                nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LENCEY, RecipeCategory.MISC, ModBlocks.LENCEY_BLOCK);
            }
        };
    }

    @Override
    public String getName() {
        return "recipe gen";
    }
}
