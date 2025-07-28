package net.radzratz.eternalores.util.tags.item;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOItemsGeneralTags
{
    public static String dustTag = "dusts/";
    public static String ingotTag = "ingots/";
    public static String plateTag = "plates/";
    public static String rodTag = "rods/";
    public static String rawTag = "raw_materials/";
    public static String clumpTag = "clumps/";
    public static String nuggetTag = "nuggets/";
    public static String smallDustTag = "small_dusts/";
    public static String gemTag = "gems/";
    public static String gemShardTag = "gem_shards/";

    public static String hammerTag = "tools/hammers";
    public static String cutterTag = "tools/gem_cutter";

    public static String storage = "storage_blocks/";

    public static class Items
    {
        //Tools
        public static final TagKey<Item> hammers = toolTags("tools/hammers");
        public static final TagKey<Item> GEM_CUTTER = toolTags("tools/gem_cutter");

        //Misc
        public static final TagKey<Item> silicon = createGeneralItemTags("silicon");

        //Stone, Metal & Gem Dust
        public static final TagKey<Item> METAL_DUSTS = createGeneralItemTags("dusts/metal");
        public static final TagKey<Item> GEM_DUSTS = createGeneralItemTags("dusts/gem");
        public static final TagKey<Item> STONE_DUSTS = createGeneralItemTags("dusts/stone");
        public static final TagKey<Item> MISC_DUSTS = createGeneralItemTags("dusts/misc");
        public static final TagKey<Item> WOOD_DUSTS = createGeneralItemTags("dusts/wood");

        //Gears
        public static final TagKey<Item> GEARS = createGeneralItemTags("gears");
        public static final TagKey<Item> METAL_GEARS = createGeneralItemTags("gears/metal");
        public static final TagKey<Item> GEM_GEARS = createGeneralItemTags("gears/gem");
        public static final TagKey<Item> MISC_GEARS = createGeneralItemTags("gears/misc");

        public static final TagKey<Item> SMALL_GEARS = createGeneralItemTags("gears/small");
        public static final TagKey<Item> SMALL_METAL_GEARS = createGeneralItemTags("gears/small_metal");
        public static final TagKey<Item> SMALL_GEM_GEARS = createGeneralItemTags("gears/small_gem");

        //Rods
        public static final TagKey<Item> METAL_RODS = createGeneralItemTags("rods/metal");
        public static final TagKey<Item> GEM_RODS = createGeneralItemTags("rods/gem");
        public static final TagKey<Item> MISC_RODS = createGeneralItemTags("rods/misc");

        //Plates
        public static final TagKey<Item> PLATES = createGeneralItemTags("plates");
        public static final TagKey<Item> METAL_PLATES = createGeneralItemTags("plates/metal");
        public static final TagKey<Item> GEM_PLATES = createGeneralItemTags("plates/gem");
        public static final TagKey<Item> MISC_PLATES = createGeneralItemTags("plates/misc");

        public static final TagKey<Item> WIRES = createGeneralItemTags("wires");

        public static final TagKey<Item> CLUMP_C = createGeneralItemTags("clumps");
        public static final TagKey<Item> DIRTY_DUST_C = createGeneralItemTags("dirty_dusts");
        public static final TagKey<Item> CRYSTALS_C = createGeneralItemTags("crystals");
        public static final TagKey<Item> SHARDS_C = createGeneralItemTags("shards");
        public static final TagKey<Item> O_SMALL_CLUMP_C = createGeneralItemTags("small_clumps");
        public static final TagKey<Item> O_SMALL_DUST_C = createGeneralItemTags("small_dusts");
        public static final TagKey<Item> O_GEM_C = createGeneralItemTags("ore_gem");

        public static final TagKey<Item> ITEM_RAW_BLOCK = createGeneralItemTags("raw_ore_block");

        /// Apparently there is NO COAL ITEM TAG IN HERE, SEARCHED FOR IT LIKE 30 MINUTES, JUST TO REALIZE THAT I'VE BEEN BAMBOOZLED!!!!
        ///
        /// LIKE COME ON, WHY WOULD I NEED STORAGE BLOCKS/ORE BLOCKS OF COAL WHEN I NEED THE SPECIFIC ITEM TAG
        ///
        /// BUT RAT THERE ARE ITEM TAGS FOR COAL, WELL GUESS WHAT, THERE AIN'T EXCEPT FOR GOD DARN STORAGE BLOCKS AND ORE BLOCKS NO SWEET LOVELY ITEM
        ///
        public static final TagKey<Item> COAL = createGeneralItemTags("frickin_coal");
        public static final TagKey<Item> SCULK = createGeneralItemTags("sculk");

        public static TagKey<Item> createGeneralItemTags(String path) { return ItemTags.create(C(path)); }

        public static TagKey<Item> toolTags(String path) { return ItemTags.create(EO(path)); }
    }
}
