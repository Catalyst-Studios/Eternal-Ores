package net.radzratz.eternalores.util.tags.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;



public class EOItemsGeneralTags
{
    public static class Items
    {

        //Tools
        public static final TagKey<Item> HAMMERS = createGeneralItemTags("eternalores","tools/hammers");
        public static final TagKey<Item> GEM_CUTTER = createGeneralItemTags("eternalores","tools/gem_cutter");

        //Misc
        public static final TagKey<Item> SILICON = createGeneralItemTags("c","silicon");

        //Stone, Metal & Gem Dust
        public static final TagKey<Item> METAL_DUSTS = createGeneralItemTags("c", "dusts/metal");
        public static final TagKey<Item> GEM_DUSTS = createGeneralItemTags("c","dusts/gem");
        public static final TagKey<Item> STONE_DUSTS = createGeneralItemTags("c","dusts/stone");

        //Gears
        public static final TagKey<Item> GEARS = createGeneralItemTags("c","gears");
        public static final TagKey<Item> METAL_GEARS = createGeneralItemTags("c","gears/metal");
        public static final TagKey<Item> GEM_GEARS = createGeneralItemTags("c","gears/gem");

        public static final TagKey<Item> SMALL_GEARS = createGeneralItemTags("c","gears/small");
        public static final TagKey<Item> SMALL_METAL_GEARS = createGeneralItemTags("c","gears/small_metal");
        public static final TagKey<Item> SMALL_GEM_GEARS = createGeneralItemTags("c","gears/small_gem");

        //Rods
        public static final TagKey<Item> METAL_RODS = createGeneralItemTags("c","rods/metal");
        public static final TagKey<Item> GEM_RODS = createGeneralItemTags("c","rods/gem");

        //Plates
        public static final TagKey<Item> PLATES = createGeneralItemTags("c","plates");
        public static final TagKey<Item> METAL_PLATES = createGeneralItemTags("c","plates/metal");
        public static final TagKey<Item> GEM_PLATES = createGeneralItemTags("c","plates/gem");

        /// Apparently there is NO COAL ITEM TAG IN HERE, SEARCHED FOR IT LIKE 30 MINUTES, JUST TO REALIZE THAT I'VE BEEN BAMBOOZLED!!!!
        ///
        /// LIKE COME ON, WHY WOULD I NEED STORAGE BLOCKS/ORE BLOCKS OF COAL WHEN I NEED THE SPECIFIC ITEM TAG
        ///
        /// BUT RAT THERE ARE ITEM TAGS FOR COAL, WELL GUESS WHAT, THERE AIN'T EXCEPT FOR GOD DARN STORAGE BLOCKS AND ORE BLOCKS NO SWEET LOVELY ITEM
        ///
        public static final TagKey<Item> COAL = createGeneralItemTags("c","frickin_coal");
        public static final TagKey<Item> SCULK = createGeneralItemTags("c","sculk");

        public static TagKey<Item> createGeneralItemTags(String namespace, String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}
