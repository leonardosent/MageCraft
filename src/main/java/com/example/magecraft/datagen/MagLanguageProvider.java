package com.example.magecraft.datagen;

import com.example.magecraft.MageCraft;
import com.example.magecraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import static com.example.magecraft.setup.ModSetup.TAB_NAME;

public class MagLanguageProvider extends LanguageProvider {

    public MagLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MageCraft.MODID, locale);
    }

    @Override
    protected void addTranslations() {
        add("itemGroup." + TAB_NAME, "MageCraft");

        add(Registration.MAGIC_DUST.get(), "Magic Dust");
        add(Registration.MAGIC_CUBE.get(), "Magic Cube");
        add(Registration.MAGIC_BOOK.get(), "Magic Spellbook");

        add(Registration.MAGIC_STAFF.get(), "Magic Staff");
    }
}