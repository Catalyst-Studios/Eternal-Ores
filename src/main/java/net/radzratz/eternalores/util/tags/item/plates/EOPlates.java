package net.radzratz.eternalores.util.tags.item.plates;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static net.radzratz.eternalores.util.EOUtils.C;

public class EOPlates
{
    public static class Items
    {
        //Aluminum / Aluminium
        public static final TagKey<Item> TAG_ALUMINUM_PLATE = createPlateTag("plates/aluminum");
        public static final TagKey<Item> TAG_ALUMINIUM_PLATE = createPlateTag("plates/aluminium");
        //Ardite
        public static final TagKey<Item> TAG_ARDITE_PLATE = createPlateTag("plates/ardite");
        //Blue Steel
        public static final TagKey<Item> TAG_BLUE_STEEL_PLATE = createPlateTag("plates/blue_steel");
        //Brass
        public static final TagKey<Item> TAG_BRASS_PLATE = createPlateTag("plates/brass");
        //Britannia Silver
        public static final TagKey<Item> TAG_BRITANNIA_PLATE = createPlateTag("plates/britannia_silver");
        //Bronze
        public static final TagKey<Item> TAG_BRONZE_PLATE = createPlateTag("plates/bronze");
        //Catalyrium
        public static final TagKey<Item> TAG_CATALYRIUM_PLATE = createPlateTag("plates/catalyrium");
        //Cast Iron
        public static final TagKey<Item> TAG_CAST_IRON_PLATE = createPlateTag("plates/cast_iron");
        //Cast Steel
        public static final TagKey<Item> TAG_CAST_STEEL_PLATE = createPlateTag("plates/cast_steel");
        //Cobalt
        public static final TagKey<Item> TAG_COBALT_PLATE = createPlateTag("plates/cobalt");
        //Constantan
        public static final TagKey<Item> TAG_CONSTANTAN_PLATE = createPlateTag("plates/constantan");
        //Copper
        public static final TagKey<Item> TAG_COPPER_PLATE = createPlateTag("plates/copper");
        //Diamond
        public static final TagKey<Item> TAG_DIAMOND_PLATE = createPlateTag("plates/diamond");
        //Electrum
        public static final TagKey<Item> TAG_ELECTRUM_PLATE = createPlateTag("plates/electrum");
        //Enderium
        public static final TagKey<Item> TAG_ENDERIUM_PLATE = createPlateTag("plates/enderium");
        //Eternal Dark
        public static final TagKey<Item> TAG_ETERNAL_DARK_PLATE = createPlateTag("plates/eternal_dark");
        //Eternal Light
        public static final TagKey<Item> TAG_ETERNAL_LIGHT_PLATE = createPlateTag("plates/eternal_light");
        //Gallium
        public static final TagKey<Item> TAG_GALLIUM_PLATE = createPlateTag("plates/gallium");
        //Graphite
        public static final TagKey<Item> TAG_GRAPHITE_PLATE = createPlateTag("plates/graphite");
        //Gold
        public static final TagKey<Item> TAG_GOLD_PLATE = createPlateTag("plates/gold");
        //Invar
        public static final TagKey<Item> TAG_INVAR_PLATE = createPlateTag("plates/invar");
        //Iridium
        public static final TagKey<Item> TAG_IRIDIUM_PLATE = createPlateTag("plates/iridium");
        //Iron
        public static final TagKey<Item> TAG_IRON_PLATE = createPlateTag("plates/iron");
        //Lead
        public static final TagKey<Item> TAG_LEAD_PLATE = createPlateTag("plates/lead");
        //Lumium
        public static final TagKey<Item> TAG_LUMIUM_PLATE = createPlateTag("plates/lumium");
        //Necroticarite
        public static final TagKey<Item> TAG_NECROTICARITE_PLATE = createPlateTag("plates/necroticarite");
        //Netherite
        public static final TagKey<Item> TAG_NETHERITE_PLATE = createPlateTag("plates/netherite");
        //Nethersteel
        public static final TagKey<Item> TAG_NETHERSTEEL_PLATE = createPlateTag("plates/nethersteel");
        //Nickel
        public static final TagKey<Item> TAG_NICKEL_PLATE = createPlateTag("plates/nickel");
        //Osmium
        public static final TagKey<Item> TAG_OSMIUM_PLATE = createPlateTag("plates/osmium");
        //Pewter
        public static final TagKey<Item> TAG_PEWTER_PLATE = createPlateTag("plates/pewter");
        //Pig Iron
        public static final TagKey<Item> TAG_PIG_IRON_PLATE = createPlateTag("plates/pig_iron");
        //Platinum
        public static final TagKey<Item> TAG_PLATINUM_PLATE = createPlateTag("plates/platinum");
        //Plutonium
        public static final TagKey<Item> TAG_PLUTONIUM_PLATE = createPlateTag("plates/plutonium");
        //Redstone
        public static final TagKey<Item> TAG_REDSTONE_PLATE = createPlateTag("plates/redstone");
        //Rose Gold
        public static final TagKey<Item> TAG_ROSE_GOLD_PLATE = createPlateTag("plates/rose_gold");
        //Sapphire
        public static final TagKey<Item> TAG_SAPPHIRE_PLATE = createPlateTag("plates/sapphire");
        //Signalum
        public static final TagKey<Item> TAG_SIGNALUM_PLATE = createPlateTag("plates/signalum");
        //Silver
        public static final TagKey<Item> TAG_SILVER_PLATE = createPlateTag("plates/silver");
        //Shadowsteel
        public static final TagKey<Item> TAG_SHADOWSTEEL_PLATE = createPlateTag("plates/shadowsteel");
        //Steel
        public static final TagKey<Item> TAG_STEEL_PLATE = createPlateTag("plates/steel");
        //Tin
        public static final TagKey<Item> TAG_TIN_PLATE = createPlateTag("plates/tin");
        //Titanium
        public static final TagKey<Item> TAG_TITANIUM_PLATE = createPlateTag("plates/titanium");
        //Tungsten
        public static final TagKey<Item> TAG_TUNGSTEN_PLATE = createPlateTag("plates/tungsten");
        //Ultimatitanium
        public static final TagKey<Item> TAG_ULTIMATITANIUM_PLATE = createPlateTag("plates/ultimatitanium");
        //Uranium
        public static final TagKey<Item> TAG_URANIUM_PLATE = createPlateTag("plates/uranium");
        //Wrought Iron
        public static final TagKey<Item> TAG_WROUGHT_IRON_PLATE = createPlateTag("plates/wrought_iron");
        //Zinc
        public static final TagKey<Item> TAG_ZINC_PLATE = createPlateTag("plates/zinc");
        //Quantiquarite
        public static final TagKey<Item> TAG_QUANTIQUARITE_PLATE = createPlateTag("plates/quantiquarite");
        //Tachyarite
        public static final TagKey<Item> TAG_TACHYARITE_PLATE = createPlateTag("plates/tachyarite");
        //Voiderite
        public static final TagKey<Item> TAG_VOIDERITE_PLATE = createPlateTag("plates/voiderite");

        private static TagKey<Item> createPlateTag(String path) { return ItemTags.create(C(path)); }
    }
}
