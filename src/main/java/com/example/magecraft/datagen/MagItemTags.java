package com.example.magecraft.datagen;

import com.example.magecraft.MageCraft;
import com.example.magecraft.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MagItemTags extends ItemTagsProvider {

    public MagItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, MageCraft.MODID, helper);
    }

    @Override
    protected void addTags() {
        tag(Tags.Items.DUSTS)
                .add(Registration.MAGIC_DUST.get());
//        tag(Registration.MAGIC_STAFF_SPELLS)
//                .add(Registration.MAGIC_SPELL.get());
    }

    @Override
    public String getName() {
        return "MagiCraft Tags";
    }
}