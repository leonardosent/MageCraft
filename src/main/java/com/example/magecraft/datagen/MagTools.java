package com.example.magecraft.datagen;

import com.example.magecraft.setup.Registration;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MagTools {
    public static final ForgeTier MAGIC_STAFF = new ForgeTier(0, 0, 0f, 0F, 0, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(Registration.MAGIC_STAFF.get()));
}
