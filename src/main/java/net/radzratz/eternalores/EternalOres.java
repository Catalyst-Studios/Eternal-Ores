package net.radzratz.eternalores;

import com.mojang.logging.LogUtils;
import net.minecraft.core.component.DataComponents;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.config.IConfigSpec;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.radzratz.eternalores.block.EOCompressedBlockRegistry;
import net.radzratz.eternalores.data_components.EODataComponents;
import net.radzratz.eternalores.entities.EOEntityRegistry;
import net.radzratz.eternalores.util.EOCreativeModeTabs;
import net.radzratz.eternalores.util.EOSetRegistries;
import net.radzratz.eternalores.item.tools.EOGemCutter;
import net.radzratz.eternalores.item.tools.EOHammers;
import net.radzratz.eternalores.item.tools.EOWireCutter;
import net.radzratz.eternalores.util.recipes.EORecipeRegistry;
import net.radzratz.eternalores.util.compat.enderio.items.EOioItems;
import net.radzratz.eternalores.util.compat.geore.GEOreRegistry;
import net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusions;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import net.radzratz.eternalores.util.compat.mekanism.conditions.EOMKConditionRegistry;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.radzratz.eternalores.util.config.*;
import net.radzratz.eternalores.util.config.EODuplicateRecipeConfig;
import net.radzratz.eternalores.worldgen.chunk.EOChunkGenRegistry;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import org.slf4j.Logger;

import static net.radzratz.eternalores.util.EOUtils.*;

@Mod(EternalOres.id)
public class EternalOres {
    public static final String id = "eternalores";
    private static final String cfg = "-config.toml";
    public static final Logger LOG = LogUtils.getLogger();

    public EternalOres(IEventBus bus, ModContainer mCont) {
        LOG.info("[Eternal Ores] Loading...");

        LOG.info("[Eternal Ores] Loading Custom WorldGen Features...");
        EOWorldGenRegistries.rgtr(bus);

        LOG.info("[Eternal Ores] Loading Configs...");
        configs(mCont, EOMiningDimensionConfig.CONFIG_SPEC, "/mining-dimension-settings");
        configs(mCont, EOWorldGenConfig.CONFIG_SPEC, "/world-gen-settings");
        configs(mCont, EOTweaksConfig.CONFIG_SPEC, "/tweaks");
        configs(mCont, EOEventsConfig.CONFIG_SPEC, "/events");
        configs(mCont, EODuplicateRecipeConfig.CONFIG_SPEC, "/external-recipe-handler");
        configs(mCont, EOMaterialConfig.CONFIG_SPEC, "/materials-settings");
        configs(mCont, EOCompressedBlockConfig.CONFIG_SPEC, "/compressed-block-level-settings");
        configs(mCont, EOToolsConfig.CONFIG_SPEC, "/tool-settings");
        configs(mCont, EOTooltipConfig.CONFIG_SPEC, "/tooltips-settings");
        bus.addListener(EternalOres::modifyComponents);

        LOG.info("[Eternal Ores] Loading Registries...");
        EOSetRegistries.rgtr(bus);
        EOCompressedBlockRegistry.rgtr(bus);
        EOCreativeModeTabs.rgtr(bus);
        EORecipeRegistry.rgtr(bus);
        EODataComponents.rgtr(bus);
        EOEntityRegistry.rgtr(bus);

        LOG.info("[Eternal Ores] Loading Conditions...");
        EOMKConditionRegistry.rgtr(bus);

        LOG.info("[Eternal Ores] Loading Chunk Generators...");
        EOChunkGenRegistry.rgtr(bus);

        LOG.info("[Eternal ores] Loading Compat Classes...");
        if (mekanismMod) {
            EOMekSlurries.rgtr(bus);
            EOInfusions.rgtr(bus);
            configs(mCont, EOChemicalsConfig.CONFIG_SPEC, "/chemicals-settings");
        }

        if (enderioMod) {
            EOioItems.rgtr(bus);
        }

        if (ironFurnaceMod) {
            EOIronFurnaceRegistries.rgtr(bus, mCont);
        }

        if (georeMod) {
            GEOreRegistry.rgtr(bus);
        }

        LOG.info("[Eternal Ores] Loaded Successfully!");
    }

    public static void configs(ModContainer modContainer, IConfigSpec spec, String name) {
        modContainer.registerConfig(ModConfig.Type.COMMON, spec, configName(name));
    }

    private static String configName(String name) {
        return id + name + cfg;
    }

    @SubscribeEvent
    public static void modifyComponents(ModifyDefaultComponentsEvent evt) {
        var CFG = EOToolsConfig.CFG;

        evt.modify(EOHammers.COBALT_HAMMER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.hammers.cobalt.getDurability()));
        evt.modify(EOHammers.COPPER_HAMMER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.hammers.copper.getDurability()));
        evt.modify(EOHammers.STONE_HAMMER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.hammers.stone.getDurability()));
        evt.modify(EOHammers.DIAMOND_HAMMER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.hammers.diamond.getDurability()));
        evt.modify(EOHammers.IRON_HAMMER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.hammers.iron.getDurability()));

        evt.modify(EOWireCutter.COBALT_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.wireCutters.cobalt.getDurability()));
        evt.modify(EOWireCutter.COPPER_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.wireCutters.copper.getDurability()));
        evt.modify(EOWireCutter.GOLD_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.wireCutters.gold.getDurability()));
        evt.modify(EOWireCutter.DIAMOND_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.wireCutters.diamond.getDurability()));
        evt.modify(EOWireCutter.IRON_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.wireCutters.iron.getDurability()));

        evt.modify(EOGemCutter.IRON_GEM_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.gemCutter.iron.getDurability()));
        evt.modify(EOGemCutter.GOLD_GEM_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.gemCutter.gold.getDurability()));
        evt.modify(EOGemCutter.COPPER_GEM_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.gemCutter.copper.getDurability()));
        evt.modify(EOGemCutter.NETHERITE_GEM_CUTTER.get(), b -> b.set(DataComponents.MAX_DAMAGE, CFG.gemCutter.netherite.getDurability()));
    }
}
