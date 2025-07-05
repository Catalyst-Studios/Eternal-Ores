package net.radzratz.eternalores.util.tags.item.plates;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOPlates
{
    public static class Items
    {

        //Aluminum / Aluminium
        public static final TagKey<Item> ALUMINUM_PLATE = createPlateTag("plates/aluminum");
        public static final TagKey<Item> ALUMINIUM_PLATE = createPlateTag("plates/aluminium");
        //Ardite
        public static final TagKey<Item> ARDITE_PLATE = createPlateTag("plates/ardite");
        //Blue Steel
        public static final TagKey<Item> BLUE_STEEL_PLATE = createPlateTag("plates/blue_steel");
        //Brass
        public static final TagKey<Item> BRASS_PLATE = createPlateTag("plates/brass");
        //Britannia Silver
        public static final TagKey<Item> BRITANNIA_PLATE = createPlateTag("plates/britannia_silver");
        //Bronze
        public static final TagKey<Item> BRONZE_PLATE = createPlateTag("plates/bronze");
        //Catalyrium
        public static final TagKey<Item> CATALYRIUM_PLATE = createPlateTag("plates/catalyrium");
        //Cast Iron
        public static final TagKey<Item> CAST_IRON_PLATE = createPlateTag("plates/cast_iron");
        //Cast Steel
        public static final TagKey<Item> CAST_STEEL_PLATE = createPlateTag("plates/cast_steel");
        //Cobalt
        public static final TagKey<Item> COBALT_PLATE = createPlateTag("plates/cobalt");
        //Constantan
        public static final TagKey<Item> CONSTANTAN_PLATE = createPlateTag("plates/constantan");
        //Copper
        public static final TagKey<Item> COPPER_PLATE = createPlateTag("plates/copper");
        //Diamond
        public static final TagKey<Item> DIAMOND_PLATE = createPlateTag("plates/diamond");
        //Electrum
        public static final TagKey<Item> ELECTRUM_PLATE = createPlateTag("plates/electrum");
        //Enderium
        public static final TagKey<Item> ENDERIUM_PLATE = createPlateTag("plates/enderium");
        //Eternal Dark
        public static final TagKey<Item> ETERNAL_DARK_PLATE = createPlateTag("plates/eternal_dark");
        //Eternal Light
        public static final TagKey<Item> ETERNAL_LIGHT_PLATE = createPlateTag("plates/eternal_light");
        //Gallium
        public static final TagKey<Item> GALLIUM_PLATE = createPlateTag("plates/gallium");
        //Graphite
        public static final TagKey<Item> GRAPHITE_PLATE = createPlateTag("plates/graphite");
        //Gold
        public static final TagKey<Item> GOLD_PLATE = createPlateTag("plates/gold");
        //Invar
        public static final TagKey<Item> INVAR_PLATE = createPlateTag("plates/invar");
        //Iridium
        public static final TagKey<Item> IRIDIUM_PLATE = createPlateTag("plates/iridium");
        //Iron
        public static final TagKey<Item> IRON_PLATE = createPlateTag("plates/iron");
        //Lead
        public static final TagKey<Item> LEAD_PLATE = createPlateTag("plates/lead");
        //Lumium
        public static final TagKey<Item> LUMIUM_PLATE = createPlateTag("plates/lumium");
        //Necroticarite
        public static final TagKey<Item> NECROTICARITE_PLATE = createPlateTag("plates/necroticarite");
        //Netherite
        public static final TagKey<Item> NETHERITE_PLATE = createPlateTag("plates/netherite");
        //Nethersteel
        public static final TagKey<Item> NETHERSTEEL_PLATE = createPlateTag("plates/nethersteel");
        //Nickel
        public static final TagKey<Item> NICKEL_PLATE = createPlateTag("plates/nickel");
        //Osmium
        public static final TagKey<Item> OSMIUM_PLATE = createPlateTag("plates/osmium");
        //Pewter
        public static final TagKey<Item> PEWTER_PLATE = createPlateTag("plates/pewter");
        //Pig Iron
        public static final TagKey<Item> PIG_IRON_PLATE = createPlateTag("plates/pig_iron");
        //Platinum
        public static final TagKey<Item> PLATINUM_PLATE = createPlateTag("plates/platinum");
        //Plutonium
        public static final TagKey<Item> PLUTONIUM_PLATE = createPlateTag("plates/plutonium");
        //Redstone
        public static final TagKey<Item> REDSTONE_PLATE = createPlateTag("plates/redstone");
        //Rose Gold
        public static final TagKey<Item> ROSE_GOLD_PLATE = createPlateTag("plates/rose_gold");
        //Sapphire
        public static final TagKey<Item> SAPPHIRE_PLATE = createPlateTag("plates/sapphire");
        //Signalum
        public static final TagKey<Item> SIGNALUM_PLATE = createPlateTag("plates/signalum");
        //Silver
        public static final TagKey<Item> SILVER_PLATE = createPlateTag("plates/silver");
        //Shadowsteel
        public static final TagKey<Item> SHADOWSTEEL_PLATE = createPlateTag("plates/shadowsteel");
        //Steel
        public static final TagKey<Item> STEEL_PLATE = createPlateTag("plates/steel");
        //Tin
        public static final TagKey<Item> TIN_PLATE = createPlateTag("plates/tin");
        //Titanium
        public static final TagKey<Item> TITANIUM_PLATE = createPlateTag("plates/titanium");
        //Ultimatitanium
        public static final TagKey<Item> ULTIMATITANIUM_PLATE = createPlateTag("plates/ultimatitanium");
        //Uranium
        public static final TagKey<Item> URANIUM_PLATE = createPlateTag("plates/uranium");
        //Wrought Iron
        public static final TagKey<Item> WROUGHT_IRON_PLATE = createPlateTag("plates/wrought_iron");
        //Zinc
        public static final TagKey<Item> ZINC_PLATE = createPlateTag("plates/zinc");
        //Quantiquarite
        public static final TagKey<Item> QUANTIQUARITE_PLATE = createPlateTag("plates/quantiquarite");
        //Tachyarite
        public static final TagKey<Item> TACHYARITE_PLATE = createPlateTag("plates/tachyarite");
        //Voiderite
        public static final TagKey<Item> VOIDERITE_PLATE = createPlateTag("plates/voiderite");

        private static TagKey<Item> createPlateTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
