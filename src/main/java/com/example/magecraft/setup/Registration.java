package com.example.magecraft.setup;

import com.example.magecraft.datagen.MagTools;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SnowballItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.example.magecraft.MageCraft.MODID;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);

    public static final RegistryObject<Item> MAGIC_STAFF = ITEMS.register("magic_staff", () -> new SwordItem(MagTools.MAGIC_STAFF, 0, 0f, ITEM_PROPERTIES));

    public static final RegistryObject<Item> MAGIC_BOOK = ITEMS.register("magic_book", () -> new Item(ITEM_PROPERTIES));

    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust", () -> new Item(ITEM_PROPERTIES));
    public static final RegistryObject<Item> MAGIC_CUBE = ITEMS.register("magic_cube", () -> new Item(ITEM_PROPERTIES));

    //public static final RegistryObject<Item> MAGIC_STAFF = ITEMS.register("magic_staff", () -> new StaffItem(ITEM_PROPERTIES.setNoRepair().defaultDurability(500)));
    public static final RegistryObject<Item> MAGIC_SPELL = ITEMS.register("magic_spell", () -> new SnowballItem(ITEM_PROPERTIES));
}
