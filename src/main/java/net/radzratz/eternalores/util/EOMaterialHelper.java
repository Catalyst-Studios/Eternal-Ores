package net.radzratz.eternalores.util;

/**
 * Here be dragons
 * <p>
 * I know that this is cursed, but it really helped out getting the material name from each item and block.
 * <p>
 * Both Tags and Recipes, for the most part, are handled with this specific Helper
 */
public class EOMaterialHelper
{
    public static String o = "o_";

    public static String plate = "plate_";
    public static String rod = "rod_";
    public static String gear = "gear_";
    public static String raw = "raw_";
    public static String shard = "shard_";
    public static String gem = "gem_";
    public static String gemS = "gem_shard_";
    public static String wire = "wire_";
    public static String crystal = "crystal_";
    public static String dust = "_dust";
    public static String dirty = "dirty_";
    public static String ingot = "_ingot";
    public static String nugget = "_nugget";
    public static String sClump = "_small_clump";
    public static String oClump = "_clump";
    public static String oDust = "_small_dust";
    public static String oGem = "_gem";
    public static String clump = "clump_";

    public static String ore = "_ore_block";
    public static String slate = "deepslate_";
    public static String nether = "nether_";
    public static String end = "end_";
    public static String block = "_block";
    public static String comp = "compressed_";

    /**
     * Extracts the material name from a given item or block registry path.
     * <p>
     * This method is designed to handle multiple naming conventions used across Eternal Ores and
     * mod integrations (like Oritech or Mekanism), such as:
     * <ul>
     *     <li> Forms {@code plate_{material}}, {@code wire_{material}}, {@code rod_{material}}, {@code gear_{material}}</li>
     *     <li> Natural {@code raw_{material}}</li>
     *     <li> Gems {@code gem_{material}}</li>
     *     <li> Ingots {@code {material}_ingot}</li>
     *     <li> Nuggets {@code {material}_nugget}</li>
     *     <li> Raw Blocks {@code raw_{material}_block}</li>
     *     <li> Form Blocks {@code {material}_block}</li>
     *     <li> Compressed Blocks {@code compressed_{type}}</li>
     *     <li> Ores {@code {material}_ore_block}, {@code nether_{material}_ore_block}, {@code end_{material}_ore_block}</li>
     *     <li> Mek Items {@code dirty_{material}_dust}, {@code crystal_{material}}, {@code clump_{material}}, {@code crystal_{material}} </li>
     *     <li> (Oritech Items) {@code o_{material}_small_dust}, {@code o_{material}_small_clump}, {@code o_{material}_clump}, {@code o_{material}_gem}</li>
     * </ul>
     * <p>
     * This method safely trims off known prefixes and suffixes to isolate the base material name,
     * which can then be used to dynamically generate tags or language entries.
     *
     * @param path The registry path (e.g., {@code "plate_aluminum"}, {@code "o_tin_small_dust"}).
     * @return The material name without prefix/suffix (e.g., {@code "aluminum"}, {@code "tin"}).
     */
    public static String extractMaterial(String path)
    {
        /// Items
        if (path.startsWith(plate)) return path.substring(6);

        if (path.startsWith(rod)) return path.substring(4);

        if (path.startsWith(gear)) return path.substring(5);

        if (path.startsWith(raw))
        {
            if (path.endsWith(block)) { return path.substring(0, path.length() - 6); }

            return path.substring(4);
        }

        if (path.startsWith(shard)) return path.substring(6);

        if (path.startsWith(gem)) return path.substring(4);

        if (path.startsWith(wire)) return path.substring(5);

        if (path.startsWith(crystal)) return path.substring(8);

        if (path.endsWith(dust))
        {
            if (path.startsWith(dirty)) { return path.substring(6, path.length() - 5); }

            if (path.startsWith(o)) { return path.substring(2, path.length() - 11); }

            return path.substring(0, path.length() - 5);
        }

        if (path.endsWith(ingot)) return path.substring(0, path.length() - 6);

        if (path.endsWith(nugget)) return path.substring(0, path.length() - 7);

        if (path.startsWith(o) && path.endsWith(sClump)) return path.substring(2, path.length() - 12);

        if (path.startsWith(o) && path.endsWith(oClump)) return path.substring(2, path.length() - 6);

        if (path.startsWith(o) && path.endsWith(oGem)) return path.substring(2, path.length() - 4);

        if (path.startsWith(clump)) return path.substring(6);

        /// Blocks
        if (path.endsWith(ore))
        {
            String base = path.substring(0, path.length() - 10);
            if (base.startsWith(slate)) return base.substring(10);

            if (base.startsWith(nether)) return base.substring(7);

            if (base.startsWith(end)) return base.substring(4);

            return base;
        }

        if (path.endsWith(block)) return path.substring(0, path.length() - 6);

        // Compressed blocks
        if (path.startsWith(comp))
        {
            String rest = path.substring(11);
            int i = rest.lastIndexOf("_");
            if (i > 0)
            {
                return rest.substring(0, i); // e.g., "andesite_1x" → "andesite"
            }
            return rest;
        }

        return path;
    }
}
