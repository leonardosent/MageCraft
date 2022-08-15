package com.example.magecraft.datagen;

import com.example.magecraft.MageCraft;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

//import static com.example.magecraft.client.OreGenModelLoader.OREGEN_LOADER;

public class MagBlockStates extends BlockStateProvider {

    public MagBlockStates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, MageCraft.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
    }

}