package com.example.magecraft.datagen;

import com.example.magecraft.MageCraft;
import com.example.magecraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MagItemModels extends ItemModelProvider {

    public MagItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MageCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture(Registration.MAGIC_DUST.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magic_dust"));
        singleTexture(Registration.MAGIC_CUBE.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magic_cube"));
        singleTexture(Registration.MAGIC_STAFF.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magic_staff"));
        singleTexture(Registration.MAGIC_BOOK.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("item/magic_spellbook"));
        singleTexture(Registration.MAGIC_SPELL.get().getRegistryName().getPath(),
                mcLoc("item/generated"),
                "layer0", modLoc("entity/magic_spell"));
    }
}