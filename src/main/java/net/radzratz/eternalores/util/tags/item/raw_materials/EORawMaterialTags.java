package net.radzratz.eternalores.util.tags.item.raw_materials;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EORawMaterialTags
{

    //Aluminum
    public static final TagKey<Item> RAW_ALUMINUM = createRawMaterialsTag("raw_materials/aluminum");
    public static final TagKey<Item> RAW_ALUMINIUM = createRawMaterialsTag("raw_materials/aluminium");
    //Ardite
    public static final TagKey<Item> RAW_ARDITE = createRawMaterialsTag("raw_materials/ardite");
    //Catalyrium
    public static final TagKey<Item> RAW_CATALYRIUM = createRawMaterialsTag("raw_materials/catalyrium");
    //Cobalt
    public static final TagKey<Item> RAW_COBALT = createRawMaterialsTag("raw_materials/cobalt");
    //Gallium
    public static final TagKey<Item> RAW_GALLIUM = createRawMaterialsTag("raw_materials/gallium");
    //Iridium
    public static final TagKey<Item> RAW_IRIDIUM = createRawMaterialsTag("raw_materials/iridium");
    //Lead
    public static final TagKey<Item> RAW_LEAD = createRawMaterialsTag("raw_materials/lead");
    //Nickel
    public static final TagKey<Item> RAW_NICKEL = createRawMaterialsTag("raw_materials/nickel");
    //Osmium
    public static final TagKey<Item> RAW_OSMIUM = createRawMaterialsTag("raw_materials/osmium");
    //Platinum
    public static final TagKey<Item> RAW_PLATINUM = createRawMaterialsTag("raw_materials/platinum");
    //Plutonium
    public static final TagKey<Item> RAW_PLUTONIUM = createRawMaterialsTag("raw_materials/plutonium");
    //Silver
    public static final TagKey<Item> RAW_SILVER = createRawMaterialsTag("raw_materials/silver");
    //Sulfur
    public static final TagKey<Item> SULFUR = createRawMaterialsTag("raw_materials/sulfur");
    //Tin
    public static final TagKey<Item> RAW_TIN = createRawMaterialsTag("raw_materials/tin");
    //Ultimatitanium
    public static final TagKey<Item> RAW_ULTIMATITANIUM = createRawMaterialsTag("raw_materials/ultimatitanium");
    //Uraninite
    public static final TagKey<Item> RAW_URANINITE = createRawMaterialsTag("raw_materials/uraninite");
    //Uranium
    public static final TagKey<Item> RAW_URANIUM = createRawMaterialsTag("raw_materials/uranium");
    //Zinc
    public static final TagKey<Item> RAW_ZINC = createRawMaterialsTag("raw_materials/zinc");

    private static TagKey<Item> createRawMaterialsTag(String path)
    {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
    }
}
