package com.example.magecraft.datagen;

import com.example.magecraft.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class MagRecipes extends RecipeProvider {

    public MagRecipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapeless(Registration.MAGIC_DUST.get(), 3)
                .requires(Items.GLOWSTONE_DUST)
                .requires(Items.REDSTONE)
                .requires(Items.GUNPOWDER)
                .requires(Items.BLAZE_POWDER)
                .requires(Items.DRAGON_BREATH)
                .group("magecraft1")
                .unlockedBy("magic", InventoryChangeTrigger.TriggerInstance.hasItems(Items.DRAGON_BREATH))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.MAGIC_CUBE.get())
                .pattern("ouo")
                .pattern("udu")
                .pattern("ouo")
                .define('o', Items.OBSIDIAN)
                .define('u', Items.DIAMOND)
                .define('d', Registration.MAGIC_DUST.get())
                .group("magecraft2")
                .unlockedBy("magic", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MAGIC_DUST.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(Registration.MAGIC_BOOK.get())
                .pattern("o o")
                .pattern(" b ")
                .pattern("o o")
                .define('b', Items.ENCHANTED_BOOK)
                .define('o', Registration.MAGIC_DUST.get())
                .group("magecraft3")
                .unlockedBy("magic", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MAGIC_DUST.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(Registration.MAGIC_STAFF.get())
                .pattern("/o/")
                .pattern(" / ")
                .pattern(" / ")
                .define('o', Registration.MAGIC_CUBE.get())
                .define('/', Items.STICK)
                .group("magecraft4")
                .unlockedBy("magic", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.MAGIC_CUBE.get()))
                .save(consumer);
    }
}