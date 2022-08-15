package com.example.magecraft.datagen;

import com.example.magecraft.MageCraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class MagBlockTags extends BlockTagsProvider {

    public MagBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, MageCraft.MODID, helper);
    }

    @Override
    protected void addTags() {
//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//        tag(BlockTags.NEEDS_IRON_TOOL)
//        tag(Tags.Blocks.ORES)
    }

    @Override
    public String getName() {
        return "MageCraft Tags";
    }
}