package net.radzratz.eternalores.util.compat.mekanism.chemicals;

import mekanism.api.MekanismAPI;
import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalBuilder;
import mekanism.common.registration.impl.ChemicalDeferredRegister;
import mekanism.common.registration.impl.DeferredChemical;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical;
import org.jetbrains.annotations.Nullable;

import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.config.EOChemicalsConfig.CFG;
import static net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical.*;

public class EOInfusions {
    public static final ChemicalDeferredRegister EO_CHEMICALS = new ChemicalDeferredRegister(EternalOres.id);

    static {
        INF_ALUMINUM = rgtrInfusion("aluminum", 0x8cf4e2, CFG.chemicalSet.aluminumInfusion, CFG.chemicalSet.allInfusions);
        INF_AMBER = rgtrInfusion("amber", 0xffb818, CFG.chemicalSet.amberInfusion, CFG.chemicalSet.allInfusions);
        INF_AMETHYST = rgtrInfusion("amethyst", 0xcfa0f3, CFG.chemicalSet.amethystInfusion, CFG.chemicalSet.allInfusions);
        INF_APATITE = rgtrInfusion("apatite", 0x60f9ff, CFG.chemicalSet.apatiteInfusion, CFG.chemicalSet.allInfusions);
        INF_ARCANUM = rgtrInfAnim("arcanum", 0xc3a3a9, CFG.chemicalSet.arcanumInfusion, CFG.chemicalSet.allInfusions, 0xc3b8a9, 0xc3a3a9, 0x9975a1, 0x704b74, 0x705c74);
        INF_ARDITE = rgtrInfusion("ardite", 0xf28524, CFG.chemicalSet.arditeInfusion, CFG.chemicalSet.allInfusions);
        INF_AURORIUM = rgtrInfAnim("aurorium", 0xffc100, CFG.chemicalSet.auroriumInfusion, CFG.chemicalSet.allInfusions, 0xd1b9ff, 0xaa82ff, 0x7854ff, 0x5454e9, 0x5454bc, 0x594a95, 0x5e2e85);
        INF_BISMUTH = rgtrInfusion("bismuth", 0xccb0ff, CFG.chemicalSet.bismuthInfusion, CFG.chemicalSet.allInfusions);
        INF_BLAZE = rgtrInfusion("blaze", 0xffc100, CFG.chemicalSet.blazeInfusion, CFG.chemicalSet.allInfusions);
        INF_CATALYRIUM = rgtrInfAnim("catalyrium", 0x213352, CFG.chemicalSet.catalyriumInfusion, CFG.chemicalSet.allInfusions, 0x1f2843, 0x7f1f00);
        INF_CERTUS = rgtrInfusion("certus_quartz", 0xdaffff, CFG.chemicalSet.certusInfusion, CFG.chemicalSet.certusInfusion);
        INF_CHROMIUM = rgtrInfusion("chromium", 0xdacad4, CFG.chemicalSet.chromiumInfusion, CFG.chemicalSet.allInfusions);
        INF_CINNABAR = rgtrInfusion("cinnabar", 0xaa212b, CFG.chemicalSet.cinnabarInfusion, CFG.chemicalSet.allInfusions);
        INF_COBALT = rgtrInfusion("cobalt", 0xaaf9f9, CFG.chemicalSet.cobaltInfusion, CFG.chemicalSet.allInfusions);
        INF_COPPER = rgtrInfusion("copper", 0xe77c56, CFG.chemicalSet.copperInfusion, CFG.chemicalSet.allInfusions);
        INF_COSMIC_MATTER = rgtrInfAnim("cosmic_matter", 0x5e2e85, CFG.chemicalSet.cosmicMatterInfusion, CFG.chemicalSet.allInfusions, 0x1b1b1b, 0x383838, 0x5a5a5a);
        INF_ELECTRUM = rgtrInfusion("electrum", 0xfdde88, CFG.chemicalSet.electrumInfusion, CFG.chemicalSet.allInfusions);
        INF_EMERALD = rgtrInfusion("emerald", 0x41f384, CFG.chemicalSet.emeraldInfusion, CFG.chemicalSet.allInfusions);
        INF_ENDER = rgtrInfusion("ender", 0x8cf4e2, CFG.chemicalSet.enderInfusion, CFG.chemicalSet.allInfusions);
        INF_ENDERGETIC = rgtrInfusion("endergetic", 0x9cc298, CFG.chemicalSet.endergeticInfusion, CFG.chemicalSet.allInfusions);
        INF_ENDERIUM = rgtrInfusion("enderium", 0x309584, CFG.chemicalSet.enderiumInfusion, CFG.chemicalSet.allInfusions);
        INF_ENERGETIC = rgtrInfusion("energetic", 0xf6e9af, CFG.chemicalSet.energeticInfusion, CFG.chemicalSet.allInfusions);
        INF_ENRICHED_CARBON = rgtrInfusion("highly_enriched_carbon", 0x060606, CFG.chemicalSet.enrichedCarbonInfusion, CFG.chemicalSet.allInfusions);
        INF_ETERNAL_DARK = rgtrInfusion("eternal_dark", 0x000000, CFG.chemicalSet.eternalDarkInfusion, CFG.chemicalSet.allInfusions);
        INF_ETERNAL_LIGHT = rgtrInfusion("eternal_light", 0xffffff, CFG.chemicalSet.eternalLightInfusion, CFG.chemicalSet.allInfusions);
        INF_ETERNITY = rgtrInfAnim("eternity", 0xd0ffff, CFG.chemicalSet.eternityInfusion, CFG.chemicalSet.allInfusions, 0xb8ccff, 0xbca8fa, 0x7f87d6, 0xa256af, 0x9275d6, 0xdf43d8, 0x9947a9, 0x691064, 0x8c0569, 0xc14984, 0xed607d, 0xeb629e);
        INF_ETHERIUM = rgtrInfAnim("etherium", 0xfdeaff, CFG.chemicalSet.etheriumInfusion, CFG.chemicalSet.allInfusions, 0xe2ccff, 0xb8bbff, 0x978eff);
        INF_FLUIX = rgtrInfAnim("fluix", 0xb06fdd, CFG.chemicalSet.fluixInfusion, CFG.chemicalSet.fluixInfusion, 0x6054a6, 0x6054a6, 0x212040, 0x212040);
        INF_GALLIUM = rgtrInfusion("gallium", 0x96a2ad, CFG.chemicalSet.galliumInfusion, CFG.chemicalSet.allInfusions);
        INF_GARNET = rgtrInfusion("garnet", 0xc7006e, CFG.chemicalSet.garnetInfusion, CFG.chemicalSet.allInfusions);
        INF_GRAPHITE = rgtrInfusion("graphite", 0x494949, CFG.chemicalSet.graphiteInfusion, CFG.chemicalSet.allInfusions);
        INF_INVAR = rgtrInfusion("invar", 0xbac1b7, CFG.chemicalSet.invarInfusion, CFG.chemicalSet.allInfusions);
        INF_IRIDIUM = rgtrInfusion("iridium", 0xbeb79c, CFG.chemicalSet.iridiumInfusion, CFG.chemicalSet.allInfusions);
        INF_IRON = rgtrInfusion("iron", 0xbababa, CFG.chemicalSet.ironInfusion, CFG.chemicalSet.allInfusions);
        INF_JADE = rgtrInfusion("jade", 0x55b52d, CFG.chemicalSet.jadeInfusion, CFG.chemicalSet.allInfusions);
        INF_LAPIS = rgtrInfusion("lapis", 0x5a82e2, CFG.chemicalSet.lapisInfusion, CFG.chemicalSet.allInfusions);
        INF_LEAD = rgtrInfusion("lead", 0xa2afd8, CFG.chemicalSet.leadInfusion, CFG.chemicalSet.allInfusions);
        INF_LOW_CARBON = rgtrInfusion("low_enriched_carbon", 0x4d4a47, CFG.chemicalSet.lowCarbonInfusion, CFG.chemicalSet.allInfusions);
        INF_LUMIUM = rgtrInfusion("lumium", 0xfff3c9, CFG.chemicalSet.lumiumInfusion, CFG.chemicalSet.allInfusions);
        INF_MANGANESE = rgtrInfusion("manganese", 0xabe3a1, CFG.chemicalSet.manganeseInfusion, CFG.chemicalSet.allInfusions);
        INF_MOLYBDENUM = rgtrInfusion("molybdenum", 0xa8cddd, CFG.chemicalSet.molybdenumInfusion, CFG.chemicalSet.allInfusions);
        INF_MONAZITE = rgtrInfusion("monazite", 0xf7a120, CFG.chemicalSet.monaziteInfusion, CFG.chemicalSet.allInfusions);
        INF_NECROTICARITE = rgtrInfusion("necroticarite", 0x660090, CFG.chemicalSet.necroticariteInfusion, CFG.chemicalSet.allInfusions);
        INF_NETHER_ENRICHED = rgtrInfusion("nether", 0xffb9b9, CFG.chemicalSet.netherEnrichedInfusion, CFG.chemicalSet.allInfusions);
        INF_NETHER_STAR = rgtrInfusion("nether_star", 0xc1d4ed, CFG.chemicalSet.netherStarInfusion, CFG.chemicalSet.allInfusions);
        INF_NICKEL = rgtrInfusion("nickel", 0xd3c8ab, CFG.chemicalSet.nickelInfusion, CFG.chemicalSet.allInfusions);
        INF_NITER = rgtrInfusion("niter", 0xe5efee, CFG.chemicalSet.niterInfusion, CFG.chemicalSet.allInfusions);
        INF_OBSIDIAN = rgtrInfusion("obsidian", 0x9167e1, CFG.chemicalSet.obsidianInfusion, CFG.chemicalSet.allInfusions);
        INF_ONYX = rgtrInfusion("onyx", 0x63949a, CFG.chemicalSet.onyxInfusion, CFG.chemicalSet.allInfusions);
        INF_PEARL = rgtrInfusion("pearl", 0xedeadb, CFG.chemicalSet.pearlInfusion, CFG.chemicalSet.allInfusions);
        INF_PERIDOT = rgtrInfusion("peridot", 0xb5f54f, CFG.chemicalSet.peridotInfusion, CFG.chemicalSet.allInfusions);
        INF_PLATINUM = rgtrInfusion("platinum", 0x97c3c6, CFG.chemicalSet.platinumInfusion, CFG.chemicalSet.allInfusions);
        INF_PLUTONIUM = rgtrInfusion("plutonium", 0xdfc1c0, CFG.chemicalSet.plutoniumInfusion, CFG.chemicalSet.allInfusions);
        INF_PRISMARINE = rgtrInfusion("prismarine", 0xb4d8ca, CFG.chemicalSet.prismarineInfusion, CFG.chemicalSet.allInfusions);
        INF_PYROLITE = rgtrInfAnim("pyrolite", 0xfea585, CFG.chemicalSet.pyroliteInfusion, CFG.chemicalSet.allInfusions, 0xfe4d26, 0xc40000, 0x980101);
        INF_QUANTIQUARITE = rgtrInfAnim("quantiquarite", 0xadbdcd, CFG.chemicalSet.quantiquariteInfusion, CFG.chemicalSet.allInfusions, 0x839eaf);
        INF_QUARTZ = rgtrInfusion("quartz", 0xe5dfd6, CFG.chemicalSet.quartzInfusion, CFG.chemicalSet.allInfusions);
        INF_RUBY = rgtrInfusion("ruby", 0xef4646, CFG.chemicalSet.rubyInfusion, CFG.chemicalSet.allInfusions);
        INF_SANGUIS = rgtrInfusion("sanguis_vivus", 0xd60000, CFG.chemicalSet.sanguisInfusion, CFG.chemicalSet.allInfusions);
        INF_SAPPHIRE = rgtrInfusion("sapphire", 0x8aefff, CFG.chemicalSet.sapphireInfusion, CFG.chemicalSet.allInfusions);
        INF_SCULKITE = rgtrInfAnim("sculkite", 0x05625d, CFG.chemicalSet.sculkiteInfusion, CFG.chemicalSet.allInfusions, 0x034150, 0x009295, 0x052a32, 0x194648);
        INF_SHADOW = rgtrInfusion("shadow", 0x8a76ee, CFG.chemicalSet.shadowInfusion, CFG.chemicalSet.allInfusions);
        INF_SIGNALUM = rgtrInfusion("signalum", 0xe83e09, CFG.chemicalSet.signalumInfusion, CFG.chemicalSet.allInfusions);
        INF_SILICON = rgtrInfusion("silicon", 0x58558b, CFG.chemicalSet.siliconInfusion, CFG.chemicalSet.allInfusions);
        INF_SILVER = rgtrInfusion("silver", 0xb9cbe3, CFG.chemicalSet.silverInfusion, CFG.chemicalSet.allInfusions);
        INF_SOURCE = rgtrInfusion("source", 0xb36de0, CFG.chemicalSet.sourceInfusion, CFG.chemicalSet.allInfusions);
        INF_SPECTRAL_BLUERITE = rgtrInfAnim("spectral_sky_bluerite", 0xc8ffff, CFG.chemicalSet.spectralBlueriteInfusion, CFG.chemicalSet.allInfusions, 0xefffff, 0x87e6ff);
        INF_STELLARIUM = rgtrInfAnim("stellarium", 0xffe5fb, CFG.chemicalSet.stellariumInfusion, CFG.chemicalSet.allInfusions, 0xdeb4de, 0xac6aac, 0x9777ac, 0x7163ac, 0x50399e, 0x58109c);
        INF_TACHYARITE = rgtrInfAnim("tachyarite", 0xbbf8f1, CFG.chemicalSet.tachyariteInfusion, CFG.chemicalSet.allInfusions, 0x87ece0, 0x54beb2);
        INF_TANZANITE = rgtrInfusion("tanzanite", 0x5637b6, CFG.chemicalSet.tanzaniteInfusion, CFG.chemicalSet.allInfusions);
        INF_TEMICTETL = rgtrInfAnim("temictetl", 0x03fcfc, CFG.chemicalSet.temictetlInfusion, CFG.chemicalSet.allInfusions, 0x27898b, 0x455d60, 0x5f3a3c, 0x5f3a3c);
        INF_TITANIUM = rgtrInfusion("titanium", 0xf1acf0, CFG.chemicalSet.titaniumInfusion, CFG.chemicalSet.allInfusions);
        INF_TUNGSTEN = rgtrInfusion("tungsten", 0x7086cb, CFG.chemicalSet.tungstenInfusion, CFG.chemicalSet.allInfusions);
        INF_ULTIMATITANIUM = rgtrInfusion("ultimatitanium", 0x9565a3, CFG.chemicalSet.ultimatitaniumInfusion, CFG.chemicalSet.allInfusions);
        INF_UNIVERSIUM = rgtrInfAnim("universium", 0xff00a0, CFG.chemicalSet.universiumInfusion, CFG.chemicalSet.allInfusions, 0xce008d, 0x91006d, 0x660052, 0x4d003a, 0x390026, 0x1a0010);
        INF_URANINITE = rgtrInfusion("uraninite", 0xbad0a9, CFG.chemicalSet.uraniniteInfusion, CFG.chemicalSet.allInfusions);
        INF_URANIUM = rgtrInfusion("uranium", 0x637753, CFG.chemicalSet.uraniumInfusion, CFG.chemicalSet.allInfusions);
        INF_VANADIUM = rgtrInfusion("vanadium", 0x636984, CFG.chemicalSet.vanadiumInfusion, CFG.chemicalSet.allInfusions);
        INF_VOIDERITE = rgtrInfAnim("voiderite", 0xde2f16, CFG.chemicalSet.voideriteInfusion, CFG.chemicalSet.allInfusions, 0x462bae, 0x2c1648, 0x390e3a, 0x2e0620);
        INF_ZINC = rgtrInfusion("zinc", 0x94b0b1, CFG.chemicalSet.zincInfusion, CFG.chemicalSet.allInfusions);
        INF_ZIRCON = rgtrInfusion("zircon", 0xde2f16, CFG.chemicalSet.zirconInfusion, CFG.chemicalSet.allInfusions);
    }

    public static DeferredChemical<EOChemical> rgtrInfusion(String name, int tint, BooleanSupplier ind, BooleanSupplier gen) {
        return EO_CHEMICALS.register(name, ()-> new EOChemical(ChemicalBuilder.infuseType().tint(tint), ind, gen));
    }

    public static DeferredChemical<EOChemical> rgtrInfAnim(String name, int baseTint, BooleanSupplier ind, BooleanSupplier gen, int... tintCycle) {
        return EO_CHEMICALS.register(name, () -> new EOChemical(ChemicalBuilder.infuseType().tint(baseTint), ind, gen, tintCycle));
    }

    public static @Nullable Holder<Chemical> getChemical(String name) {
        ResourceLocation id = EO(name);
        return MekanismAPI.CHEMICAL_REGISTRY
                .getOptional(id)
                .map(Holder::direct)
                .orElse(null);
    }

    public static void rgtr(IEventBus bus) {
        EO_CHEMICALS.register(bus);
    }
}
