package net.radzratz.eternalores.util.recipes.util;

import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;

import static net.radzratz.eternalores.util.EOUtils.*;

public record EORecipePaths(String id) {
    public static final EORecipePaths PATH = new EORecipePaths("");

    // Compat
    private static final String Compat = "compat/";
    private static final String EIO = Compat + ENDERIO;
    private static final String AA = Compat + ACTUALLY_ADDITIONS;
    private static final String EEP = Compat + ENERGIZED_POWER;
    private static final String MK = Compat + MEKANISM;
    private static final String MKM = Compat + MEKANISM_MORE_MACHINE;
    private static final String IEN = Compat + IMMERSIVE_ENGINEERING;
    private static final String FA = Compat + FORBIDDEN_ARCANUS;
    private static final String PW = Compat + POWAH;
    private static final String IF = Compat + INDUSTRIAL_FOREGOING;
    private static final String INTEG = Compat + INTEGRATED_DYNAMICS;
    private static final String RAIL = Compat + RAILCRAFT;
    private static final String ARS = Compat + ARS_NOUVEAU;

    // Actually Additions
    public String Crush() {
        return AA + "/crusher/";
    }

    public String Lens() {
        return AA + "/mining_lens/";
    }

    public String Imbue() {
        return ARS + "/imbuement/";
    }

    // Energized Power
    public String EPSmelter() {
        return EEP + "/alloy_furnace/";
    }

    public String EPCompressor() {
        return EEP + "/compressor/";
    }

    public String EPPress() {
        return EEP + "/metal_press/";
    }

    public String EPPulverizer() {
        return EEP + "/pulverizer/";
    }

    public String EEPSawmill() {
        return EEP + "/sawmill/";
    }

    public String EEPFiltration() {
        return EEP + "/filtration_plant/";
    }

    // EnderIO
    public String Sag() {
        return EIO + "/sag_milling/";
    }

    public String ESmelter() {
        return EIO + "/alloy_smelting/";
    }

    // Mekanism
    public String MCrusher() {
        return MK + "/crusher/";
    }

    public String MCrystal() {
        return MK + "/crystallizer/";
    }

    public String MDissolution() {
        return MK + "/dissolution/";
    }

    public String MInjecting() {
        return MK + "/injecting/";
    }

    public String MWasher() {
        return MK + "/washing/";
    }

    public String MPurifier() {
        return MK + "/purifier/";
    }

    public String MEnriching() {
        return MK + "/enriching/";
    }

    public String MPrecision() {
        return MK + "/sawmill/";
    }

    public String MLathe() {
        return MKM + "/lathe/";
    }

    public String MStamping() {
        return MKM + "/stamper/";
    }

    public String MRolling() {
        return MKM + "/rolling_mill/";
    }

    // Powah
    public String PWHCrafting() {
        return PW + "/crafting/";
    }

    public String PWHOrb() {
        return PW + "/energizing_orb/";
    }

    // Immersive Engineering
    public String IECrusher() {
        return IEN + "/crusher/";
    }

    public String IEKiln() {
        return IEN + "/kiln/";
    }

    public String IEPress() {
        return IEN + "/press/";
    }

    public String IEArc() {
        return IEN + "/arc_furnace/";
    }

    public String IExcavator() {
        return IEN + "/mineral_mix/";
    }

    public String IESawmill() {
        return IEN + "/sawmill/";
    }

    // Forbidden Arcanus
    public String FAClibano() {
        return FA + "/clibano/";
    }

    // Industrial Foregoing
    public String IFLaser() {
        return IF + "/laser_drill/";
    }

    // Integrated Dynamics
    public String INTEGSqueezer() {
        return INTEG + "/squeezer/";
    }

    // Railcraft
    public String RAILCrusher() {
        return RAIL + "/crusher/";
    }

    public String RAILRolling() {
        return RAIL + "/rolling/";
    }

    // Base

    public String Shaped() {
        return "crafting/shaped/" + id;
    }

    public String Shapeless() {
        return "crafting/shapeless/" + id;
    }

    // Materials

    public String Recycle() {
        return "recycle/" + id;
    }

    public String Ingot() {
        return "ingots/" + id;
    }

    public String Nugget() {
        return "nuggets/" + id;
    }

    public String Gem() {
        return "gems/" + id;
    }

    public String GemShard() {
        return "gem_shards/" + id;
    }

    public String Coal() {
        return "coals/" + id;
    }

    public String Alloy() {
        return "alloys/" + id;
    }

    public String DirtyDust() {
        return "dirty_dusts/" + id;
    }

    public String Dust() {
        return "dusts/" + id;
    }

    public String Blend() {
        return "blends/" + id;
    }

    public String SmallDust() {
        return "small_dusts/" + id;
    }

    public String Duplication() {
        return "duplication/" + id;
    }

    public String Clump() {
        return "clumps/" + id;
    }

    public String Crystal() {
        return "crystals/" + id;
    }

    public String Shards() {
        return "shards/" + id;
    }

    public String OreGem() {
        return "ore_gems/" + id;
    }

    public String Enriched() {
        return "enriched/" + id;
    }

    public String Plate() {
        return "plates/" + id;
    }

    public String Rod() {
        return "rods/" + id;
    }

    public String Gear() {
        return "gears/" + id;
    }

    public String Foil() {
        return "foils/" + id;
    }

    public String Wire() {
        return "wires/" + id;
    }

    public String Pearl() {
        return "pearls/" + id;
    }

    public String Crushing() {
        return "crushing/" + id;
    }

    public String RawProc() {
        return "raw_proc/" + id;
    }

    public String RawProcBlock() {
        return "raw_proc_block/" + id;
    }

    public String OreProc() {
        return "ore_proc/" + id;
    }

    public String Ore() {
        return "ores/" + id;
    }

    public String Block() {
        return "blocks/" + id;
    }

    public String DustBlock() {
        return "dust_blocks/" + id;
    }

    public String Slurry() {
        return "slurry/" + id;
    }

    public String Furnace() {
        return "furnace/" + id;
    }

    public String Smelt() {
        return "smelting/" + id;
    }

    public String Raw() {
        return "raw/" + id;
    }

    public String RawBlock() {
        return "raw_block/" + id;
    }

    public String Storage() {
        return "storage_blocks/" + id;
    }

    public String Pebble() {
        return "pebbles/" + id;
    }

    public String BioFuel() {
        return "bio/" + id;
    }

    public String ShardBlock() {
        return "shard_blocks/" + id;
    }

    public String Star() {
        return "stars/" + id;
    }

    public String Scute() {
        return "scutes_and_shells/" + id;
    }

    public String Misc() {
        return "misc/" + id;
    }

    public String Geo() {
        return "geoshards/" + id;
    }

    public static String resolveOrePath(String id, String mat) {
        if (id.startsWith("deepslate_"))
            return mat + "_slate";
        else if (id.startsWith("nether_"))
            return mat + "_nether";
        else if (id.startsWith("end_"))
            return mat + "_end";
        else
            return mat;
    }

    public static String resolveRecipeId(EOCommonRecipes.Grp grp, EORecipePaths id) {
        return switch (grp) {
            case DUST -> id.Dust();
            case ORE  -> id.Ore();
            case ORE_PROC  -> id.OreProc();
            case BLOCK  -> id.Block();
            case SMALL_DUST  -> id.SmallDust();
            case DUPLICATION  -> id.Duplication();
            case ALLOYS  -> id.Alloy();
            case PEARL  -> id.Pearl();
            case ROD  -> id.Rod();
            case MISC  -> id.Misc();
            case STAR  -> id.Star();
            case SCUTES  -> id.Scute();
            case GEM  -> id.Gem();
            case STORAGE  -> id.Storage();
            case CRUSH  -> id.Crushing();
            case RECYCLE  -> id.Recycle();
            case DUST_BLOCK  -> id.DustBlock();
            case GEM_SHARD  -> id.GemShard();
            case INGOT  -> id.Ingot();
            case BIO  -> id.BioFuel();
            case COAL  -> id.Coal();
        };
    }
}
