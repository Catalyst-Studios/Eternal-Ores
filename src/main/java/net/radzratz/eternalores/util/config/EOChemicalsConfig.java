package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import static net.radzratz.eternalores.util.EOUtils.capitalize;
import static net.radzratz.eternalores.util.EOUtils.replaceUnderscoreWithCapitalization;

public class EOChemicalsConfig {
    public static final EOChemicalsConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final EOChemicalSet chemicalSet;

    static {
        Pair<EOChemicalsConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOChemicalsConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOChemicalsConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                 Eternal Ores Chemicals Config.
                
                 This config allows you to disable any of Eternal Ores added Chemicals, like Slurries and Infusion Types.
                
                 Disabling the Slurries, will cause the Chemical Crystallizer to ignore the recipes added by Eternal Ores of
                 each material. Also, it will disable both Clean and Dirty versions of said slurry. Can be disabled individually
                 or generally.
                
                 Disabling the Infusions, will cause the Metallurgic Infuser, and Chemical Oxidizer to ignore the added
                 recipes by Eternal Ores. These can be disabled individually or generally.
                
                 This config DOES NOT unregister any of these chemicals in any way, it only hides them and toggles any function they had, if they had one.
                
                 Additionally, once you toggle said Infusion/Slurry, it will be hidden automatically from JEI/EMI recipe viewers.
                
                 Each change requires a Game Restart.
                """).push("chemicals_config");

        this.chemicalSet = new EOChemicalSet(bldr);

        bldr.pop();
    }

    public static class EOChemicalSet {
        public final ModConfigSpec.BooleanValue allInfusions;
        public final ModConfigSpec.BooleanValue aluminumInfusion;
        public final ModConfigSpec.BooleanValue amberInfusion;
        public final ModConfigSpec.BooleanValue amethystInfusion;
        public final ModConfigSpec.BooleanValue apatiteInfusion;
        public final ModConfigSpec.BooleanValue arcanumInfusion;
        public final ModConfigSpec.BooleanValue arditeInfusion;
        public final ModConfigSpec.BooleanValue auroriumInfusion;
        public final ModConfigSpec.BooleanValue bismuthInfusion;
        public final ModConfigSpec.BooleanValue blazeInfusion;
        public final ModConfigSpec.BooleanValue catalyriumInfusion;
        public final ModConfigSpec.BooleanValue certusInfusion;
        public final ModConfigSpec.BooleanValue chromiumInfusion;
        public final ModConfigSpec.BooleanValue cinnabarInfusion;
        public final ModConfigSpec.BooleanValue cobaltInfusion;
        public final ModConfigSpec.BooleanValue copperInfusion;
        public final ModConfigSpec.BooleanValue cosmicMatterInfusion;
        public final ModConfigSpec.BooleanValue electrumInfusion;
        public final ModConfigSpec.BooleanValue emeraldInfusion;
        public final ModConfigSpec.BooleanValue enderInfusion;
        public final ModConfigSpec.BooleanValue endergeticInfusion;
        public final ModConfigSpec.BooleanValue enderiumInfusion;
        public final ModConfigSpec.BooleanValue energeticInfusion;
        public final ModConfigSpec.BooleanValue enrichedCarbonInfusion;
        public final ModConfigSpec.BooleanValue eternalDarkInfusion;
        public final ModConfigSpec.BooleanValue eternalLightInfusion;
        public final ModConfigSpec.BooleanValue eternityInfusion;
        public final ModConfigSpec.BooleanValue etheriumInfusion;
        public final ModConfigSpec.BooleanValue fluixInfusion;
        public final ModConfigSpec.BooleanValue galliumInfusion;
        public final ModConfigSpec.BooleanValue garnetInfusion;
        public final ModConfigSpec.BooleanValue graphiteInfusion;
        public final ModConfigSpec.BooleanValue invarInfusion;
        public final ModConfigSpec.BooleanValue iridiumInfusion;
        public final ModConfigSpec.BooleanValue ironInfusion;
        public final ModConfigSpec.BooleanValue jadeInfusion;
        public final ModConfigSpec.BooleanValue lapisInfusion;
        public final ModConfigSpec.BooleanValue leadInfusion;
        public final ModConfigSpec.BooleanValue lowCarbonInfusion;
        public final ModConfigSpec.BooleanValue lumiumInfusion;
        public final ModConfigSpec.BooleanValue monaziteInfusion;
        public final ModConfigSpec.BooleanValue manganeseInfusion;
        public final ModConfigSpec.BooleanValue molybdenumInfusion;
        public final ModConfigSpec.BooleanValue necroticariteInfusion;
        public final ModConfigSpec.BooleanValue netherEnrichedInfusion;
        public final ModConfigSpec.BooleanValue netherStarInfusion;
        public final ModConfigSpec.BooleanValue nickelInfusion;
        public final ModConfigSpec.BooleanValue niterInfusion;
        public final ModConfigSpec.BooleanValue obsidianInfusion;
        public final ModConfigSpec.BooleanValue onyxInfusion;
        public final ModConfigSpec.BooleanValue pearlInfusion;
        public final ModConfigSpec.BooleanValue peridotInfusion;
        public final ModConfigSpec.BooleanValue platinumInfusion;
        public final ModConfigSpec.BooleanValue plutoniumInfusion;
        public final ModConfigSpec.BooleanValue prismarineInfusion;
        public final ModConfigSpec.BooleanValue pyroliteInfusion;
        public final ModConfigSpec.BooleanValue quantiquariteInfusion;
        public final ModConfigSpec.BooleanValue quartzInfusion;
        public final ModConfigSpec.BooleanValue rubyInfusion;
        public final ModConfigSpec.BooleanValue sanguisInfusion;
        public final ModConfigSpec.BooleanValue sapphireInfusion;
        public final ModConfigSpec.BooleanValue sculkiteInfusion;
        public final ModConfigSpec.BooleanValue shadowInfusion;
        public final ModConfigSpec.BooleanValue signalumInfusion;
        public final ModConfigSpec.BooleanValue siliconInfusion;
        public final ModConfigSpec.BooleanValue silverInfusion;
        public final ModConfigSpec.BooleanValue sourceInfusion;
        public final ModConfigSpec.BooleanValue spectralBlueriteInfusion;
        public final ModConfigSpec.BooleanValue stellariumInfusion;
        public final ModConfigSpec.BooleanValue tachyariteInfusion;
        public final ModConfigSpec.BooleanValue tanzaniteInfusion;
        public final ModConfigSpec.BooleanValue temictetlInfusion;
        public final ModConfigSpec.BooleanValue titaniumInfusion;
        public final ModConfigSpec.BooleanValue tungstenInfusion;
        public final ModConfigSpec.BooleanValue ultimatitaniumInfusion;
        public final ModConfigSpec.BooleanValue universiumInfusion;
        public final ModConfigSpec.BooleanValue uraniniteInfusion;
        public final ModConfigSpec.BooleanValue uraniumInfusion;
        public final ModConfigSpec.BooleanValue vanadiumInfusion;
        public final ModConfigSpec.BooleanValue voideriteInfusion;
        public final ModConfigSpec.BooleanValue zincInfusion;
        public final ModConfigSpec.BooleanValue zirconInfusion;

        public final ModConfigSpec.BooleanValue allSlurry;
        public final ModConfigSpec.BooleanValue aluminumSlurry;
        public final ModConfigSpec.BooleanValue arditeSlurry;
        public final ModConfigSpec.BooleanValue berylliumSlurry;
        public final ModConfigSpec.BooleanValue catalyriumSlurry;
        public final ModConfigSpec.BooleanValue cobaltSlurry;
        public final ModConfigSpec.BooleanValue galliumSlurry;
        public final ModConfigSpec.BooleanValue iridiumSlurry;
        public final ModConfigSpec.BooleanValue molybdenumSlurry;
        public final ModConfigSpec.BooleanValue neodymium;
        public final ModConfigSpec.BooleanValue nickelSlurry;
        public final ModConfigSpec.BooleanValue platinumSlurry;
        public final ModConfigSpec.BooleanValue sculkiteSlurry;
        public final ModConfigSpec.BooleanValue silverSlurry;
        public final ModConfigSpec.BooleanValue titaniumSlurry;
        public final ModConfigSpec.BooleanValue tungstenSlurry;
        public final ModConfigSpec.BooleanValue ultimatitaniumSlurry;
        public final ModConfigSpec.BooleanValue uraniniteSlurry;
        public final ModConfigSpec.BooleanValue vanadiumSlurry;
        public final ModConfigSpec.BooleanValue zincSlurry;

        public EOChemicalSet(ModConfigSpec.Builder bldr) {
            bldr.comment("Material Infusions").push("infusions");
            this.allInfusions = infusionToggle(bldr, "all_infusions");
            this.aluminumInfusion = infusionToggle(bldr, "aluminum");
            this.amberInfusion = infusionToggle(bldr, "amber");
            this.amethystInfusion = infusionToggle(bldr, "amethyst");
            this.apatiteInfusion = infusionToggle(bldr, "apatite");
            this.arcanumInfusion = infusionToggle(bldr, "arcanum");
            this.arditeInfusion = infusionToggle(bldr, "ardite");
            this.auroriumInfusion = infusionToggle(bldr, "aurorium");
            this.bismuthInfusion = infusionToggle(bldr, "bismuth");
            this.blazeInfusion = infusionToggle(bldr, "blaze");
            this.catalyriumInfusion = infusionToggle(bldr, "catalyrium");
            this.certusInfusion = infusionToggle(bldr, "certus_quartz");
            this.chromiumInfusion = infusionToggle(bldr, "chromium");
            this.cinnabarInfusion = infusionToggle(bldr, "cinnabar");
            this.cobaltInfusion = infusionToggle(bldr, "cobalt");
            this.copperInfusion = infusionToggle(bldr, "copper");
            this.cosmicMatterInfusion = infusionToggle(bldr, "cosmic_matter");
            this.electrumInfusion = infusionToggle(bldr, "electrum");
            this.emeraldInfusion = infusionToggle(bldr, "emerald");
            this.enderInfusion = infusionToggle(bldr, "ender");
            this.endergeticInfusion = infusionToggle(bldr, "endergetic");
            this.enderiumInfusion = infusionToggle(bldr, "enderium");
            this.energeticInfusion = infusionToggle(bldr, "energetic");
            this.enrichedCarbonInfusion = infusionToggle(bldr, "highly_enriched_carbon");
            this.eternalDarkInfusion = infusionToggle(bldr, "eternal_dark");
            this.eternalLightInfusion = infusionToggle(bldr, "eternal_light");
            this.eternityInfusion = infusionToggle(bldr, "eternity");
            this.etheriumInfusion = infusionToggle(bldr, "etherium");
            this.fluixInfusion = infusionToggle(bldr, "fluix");
            this.galliumInfusion = infusionToggle(bldr, "gallium");
            this.garnetInfusion = infusionToggle(bldr, "garnet");
            this.graphiteInfusion = infusionToggle(bldr, "graphite");
            this.invarInfusion = infusionToggle(bldr, "invar");
            this.iridiumInfusion = infusionToggle(bldr, "iridium");
            this.ironInfusion = infusionToggle(bldr, "iron");
            this.jadeInfusion = infusionToggle(bldr, "jade");
            this.lapisInfusion = infusionToggle(bldr, "lapis");
            this.leadInfusion = infusionToggle(bldr, "lead");
            this.lowCarbonInfusion = infusionToggle(bldr, "low_carbon");
            this.lumiumInfusion = infusionToggle(bldr, "lumium");
            this.monaziteInfusion = infusionToggle(bldr, "monazite");
            this.manganeseInfusion = infusionToggle(bldr, "manganese");
            this.molybdenumInfusion = infusionToggle(bldr, "molybdenum");
            this.necroticariteInfusion = infusionToggle(bldr, "necroticarite");
            this.netherEnrichedInfusion = infusionToggle(bldr, "nether_enriched");
            this.netherStarInfusion = infusionToggle(bldr, "nether_star");
            this.nickelInfusion = infusionToggle(bldr, "nickel");
            this.niterInfusion = infusionToggle(bldr, "niter");
            this.obsidianInfusion = infusionToggle(bldr, "obsidian");
            this.onyxInfusion = infusionToggle(bldr, "onyx");
            this.pearlInfusion = infusionToggle(bldr, "pearl");
            this.peridotInfusion = infusionToggle(bldr, "peridot");
            this.platinumInfusion = infusionToggle(bldr, "platinum");
            this.plutoniumInfusion = infusionToggle(bldr, "plutonium");
            this.prismarineInfusion = infusionToggle(bldr, "prismarine");
            this.pyroliteInfusion = infusionToggle(bldr, "pyrolite");
            this.quantiquariteInfusion = infusionToggle(bldr, "quantiquarite");
            this.quartzInfusion = infusionToggle(bldr, "quartz");
            this.rubyInfusion = infusionToggle(bldr, "ruby");
            this.sanguisInfusion = infusionToggle(bldr, "sanguis_vivus");
            this.sapphireInfusion = infusionToggle(bldr, "sapphire");
            this.sculkiteInfusion = infusionToggle(bldr, "sculkite");
            this.shadowInfusion = infusionToggle(bldr, "shadow");
            this.signalumInfusion = infusionToggle(bldr, "signalum");
            this.siliconInfusion = infusionToggle(bldr, "silicon");
            this.silverInfusion = infusionToggle(bldr, "silver");
            this.spectralBlueriteInfusion = infusionToggle(bldr, "spectral_sky_bluerite");
            this.sourceInfusion = infusionToggle(bldr, "source");
            this.stellariumInfusion = infusionToggle(bldr, "stellarium");
            this.tachyariteInfusion = infusionToggle(bldr, "tachyarite");
            this.tanzaniteInfusion = infusionToggle(bldr, "tanzanite");
            this.temictetlInfusion = infusionToggle(bldr, "temictetl");
            this.titaniumInfusion = infusionToggle(bldr, "titanium");
            this.tungstenInfusion = infusionToggle(bldr, "tungsten");
            this.ultimatitaniumInfusion = infusionToggle(bldr, "ultimatitanium");
            this.universiumInfusion = infusionToggle(bldr, "universium");
            this.uraniniteInfusion = infusionToggle(bldr, "uraninite");
            this.uraniumInfusion = infusionToggle(bldr, "uranium");
            this.vanadiumInfusion = infusionToggle(bldr, "vanadium");
            this.voideriteInfusion = infusionToggle(bldr, "voiderite");
            this.zincInfusion = infusionToggle(bldr, "zinc");
            this.zirconInfusion = infusionToggle(bldr, "zircon");
            bldr.pop();

            bldr.comment("Material Slurries").push("slurries");
            this.allSlurry = slurryToggle(bldr, "all_slurries");
            this.aluminumSlurry = slurryToggle(bldr, "aluminum");
            this.arditeSlurry = slurryToggle(bldr, "ardite");
            this.berylliumSlurry = slurryToggle(bldr, "beryllium");
            this.catalyriumSlurry = slurryToggle(bldr, "catalyrium");
            this.cobaltSlurry = slurryToggle(bldr, "cobalt");
            this.galliumSlurry = slurryToggle(bldr, "gallium");
            this.iridiumSlurry = slurryToggle(bldr, "iridium");
            this.molybdenumSlurry = slurryToggle(bldr, "molybdenum");
            this.neodymium = slurryToggle(bldr, "neodymium");
            this.nickelSlurry = slurryToggle(bldr, "nickel");
            this.platinumSlurry = slurryToggle(bldr, "platinum");
            this.sculkiteSlurry = slurryToggle(bldr, "sculkite");
            this.silverSlurry = slurryToggle(bldr, "silver");
            this.titaniumSlurry = slurryToggle(bldr, "titanium");
            this.tungstenSlurry = slurryToggle(bldr, "tungsten");
            this.ultimatitaniumSlurry = slurryToggle(bldr, "ultimatitanium");
            this.uraniniteSlurry = slurryToggle(bldr, "uraninite");
            this.vanadiumSlurry = slurryToggle(bldr, "vanadium");
            this.zincSlurry = slurryToggle(bldr, "zinc");
            bldr.pop();
        }

        private ModConfigSpec.BooleanValue infusionToggle(ModConfigSpec.Builder bldr, String id) {
            return bldr
                    .comment("[Server] Enable/Disable " + replaceUnderscoreWithCapitalization(id) + " Infusion.")
                    .translation("config.eternalores.chemicals.infusions." + id)
                    .gameRestart()
                    .define("is" + capitalize(id) + "Enabled", true);
        }

        private ModConfigSpec.BooleanValue slurryToggle(ModConfigSpec.Builder bldr, String id) {
            return bldr
                    .comment("[Server] Enable " + replaceUnderscoreWithCapitalization(id) + " Slurries.")
                    .translation("config.eternalores.chemicals.slurry." + id)
                    .gameRestart()
                    .define("is" + capitalize(id) + "Enabled", true);
        }
    }
}
