package net.radzratz.eternalores.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.item.special.prospectors.EOAdvProspector;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.teleporter.EOTeleporter;
import net.radzratz.eternalores.item.tools.*;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.compat.enderio.items.types.EOCapacitors;
import net.radzratz.eternalores.util.compat.enderio.items.types.EOGrindingBall;
import net.radzratz.eternalores.util.compat.geore.blocks.*;
import net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem;
import net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.EOIFurnacesFurnaceBlock;
import net.radzratz.eternalores.util.compat.iron_furnaces.upgrades.EOIFurnacesUpgrade;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static net.radzratz.eternalores.item.special.teleporter.EOTeleporter.TELEPORTER;
import static net.radzratz.eternalores.item.tools.EOHammers.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.enderio.items.EOioItems.allEnderIOItemEntries;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreBlockEntries;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreItemEntries;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.*;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(
            Registries.CREATIVE_MODE_TAB, EternalOres.id
    );

    private static final String TAB = "eternal_ores_tab_";

    public static final Supplier<CreativeModeTab> ORES;
    public static final Supplier<CreativeModeTab> RAW_BLOCKS;
    public static final Supplier<CreativeModeTab> BLOCKS;
    public static final Supplier<CreativeModeTab> COMP_BLOCKS;
    public static final Supplier<CreativeModeTab> MATERIALS;
    public static final Supplier<CreativeModeTab> DUSTS;
    public static final Supplier<CreativeModeTab> PLATES;
    public static final Supplier<CreativeModeTab> TOOLS;
    public static final Supplier<CreativeModeTab> COALS;
    public static final Supplier<CreativeModeTab> COMPAT_MATS;
    public static final Supplier<CreativeModeTab> COMPAT_ITEMS;

    static {
        ORES = rgtrTab(1, ALUMINUM_SET.ORE, "ores", tab ->
                tab.displayItems((params, output) -> acceptBlocks(output, EOreBlock.class)));

        RAW_BLOCKS = rgtrTab(2, CATALYRIUM_SET.RAW_BLOCK, "raw_mats", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EORawMaterialItem.class);
                    acceptBlocks(output, EORawBlock.class);
                })
        );

        BLOCKS = rgtrTab(3, CATALYRIUM_SET.BLOCK, "blocks", tab ->
                tab.displayItems((params, output) -> {
                    acceptBlocks(output, EOStorageBlock.class);
                    acceptBlocks(output, EODustBlock.class);
                })
        );

        COMP_BLOCKS = rgtrTab(4, ENDER_EYE_SET.BLOCK, "compressed", tab ->
                tab.displayItems((params, output) -> acceptBlocks(output, EOCompressedBlock.class)));

        MATERIALS = rgtrTab(5, MISSING_SET.INGOT, "materials", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOIngotItem.class);
                    acceptItems(output, EOItems.class);
                    acceptItems(output, EOPebbleItem.class);
                    acceptItems(output, EOGemItem.class);
                    acceptItems(output, EONuggetItem.class);
                    acceptItems(output, EOGemShardItem.class);
                })
        );

        DUSTS = rgtrTab(6, CATALYRIUM_SET.DUST, "dusts", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOBlends.class);
                    acceptItems(output, EODustItem.class);
                    acceptItems(output, EOSmallDustItem.class);
                })
        );

        PLATES = rgtrTab(7, CATALYRIUM_SET.PLATE, "forms", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOPlateItem.class);
                    acceptItems(output, EORodItem.class);
                    acceptItems(output, EOGearItem.class);
                    acceptItems(output, EOFoilItem.class);
                })
        );

        TOOLS = rgtrTab(8, COBALT_HAMMER, "tools", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOTeleporter.class);
                    acceptItems(output, EOBasicProspector.class);
                    acceptItems(output, EOAdvProspector.class);
                    acceptItems(output, EOHammers.class);
                    acceptItems(output, EOGemCutter.class);
                    acceptItems(output, EOWireCutter.class);
                    acceptItems(output, EOMolds.class);
                })
        );

        COALS = rgtrTab(9, COKE_SET.COAL, "coals", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOCoalItem.class);
                    acceptBlocks(output, EOCoalBlock.class);
                })
        );

        COMPAT_MATS = rgtrTab(10, CATALYRIUM_SET.CLUMP, "compat_materials", tab ->
                tab.displayItems((params, output) -> {
                    acceptItems(output, EOClumpItem.class);
                    acceptItems(output, EOSmallClumpItem.class);
                    acceptItems(output, EODirtyDustItem.class);
                    acceptItems(output, EOShardItem.class);
                    acceptItems(output, EOCrystalItem.class);
                    acceptItems(output, EOrGemItem.class);
                    acceptItems(output, EOEnrichedItems.class);
                })
        );

        // If none of these mods are present, this tab is hidden
        COMPAT_ITEMS = rgtrTab(11, TELEPORTER, "compat_items", tab ->
                tab.displayItems((params, output) -> {
                    acceptIfModLoaded(IRON_FURNACES, output, () -> {
                        acceptBlocks(output, EOIFurnacesFurnaceBlock.class);
                        acceptItems(output, EOIFurnacesUpgrade.class);
                    });

                    acceptIfModLoaded(ENDERIO, output, () -> {
                        acceptItems(output, EOCapacitors.class);
                        acceptItems(output, EOGrindingBall.class);
                    });

                    acceptIfModLoaded(GEORE, output, () -> {
                        acceptBlocks(output, GEOreShardBlock.class);
                        acceptBlocks(output, GEOreLargeBuds.class);
                        acceptBlocks(output, GEOreMediumBuds.class);
                        acceptBlocks(output, GEOreSmallBuds.class);
                        acceptBlocks(output, GEOreClusterBlock.class);
                        acceptItems(output, GEOreShardItem.class);
                        acceptBlocks(output, GEOreBuddingBlock.class);
                    });
                })
        );
    }

    public static CreativeModeTab.Builder base(Supplier<? extends ItemLike> icon) {
        // Shorthand for building the tab icon
        return CreativeModeTab.builder().icon(() -> new ItemStack(icon.get()));
    }

    public static void acceptItems(CreativeModeTab.Output output, Class<?> type, Predicate<DeferredHolder<Item, ? extends Item>> extraFilter) {
        allItemEntries()
                // Populates a tab with all registered items matching a given type
                .filter(e -> type.isInstance(e.get()))
                // extraFilter overload handles specific cases that need extra conditions
                .filter(extraFilter)
                // Sorts all items alphabetically, call me cheeky on this one hehe
                .sorted(Comparator.comparing(e -> e.getId().getPath()))
                .forEach(e -> output.accept(e.get()));

        if (georeMod) {
            allGeOreItemEntries()
                    .filter(e -> type.isInstance(e.get()))
                    .filter(extraFilter)
                    .sorted(Comparator.comparing(e -> e.getId().getPath()))
                    .forEach(e -> output.accept(e.get()));
        }

        if (enderioMod) {
            allEnderIOItemEntries()
                    .filter(e -> type.isInstance(e.get()))
                    .filter(extraFilter)
                    .sorted(Comparator.comparing(e -> e.getId().getPath()))
                    .forEach(e -> output.accept(e.get()));
        }

        if (ironFurnaceMod) {
            allIronFurnacesItemEntries()
                    .filter(e -> type.isInstance(e.get()))
                    .filter(extraFilter)
                    .sorted(Comparator.comparing(e -> e.getId().getPath()))
                    .forEach(e -> output.accept(e.get()));
        }
    }

    // Overload for tabs that don't need an extra filter
    public static void acceptItems(CreativeModeTab.Output output, Class<?> type) {
        acceptItems(output, type, e -> true);
    }

    public static void acceptBlocks(CreativeModeTab.Output output, Class<?> type, Predicate<DeferredHolder<Block, ? extends Block>> extraFilter) {
        allBlockEntries()
                // Same as acceptItems but iterates over block registry instead
                .filter(e -> type.isInstance(e.get()))
                // extraFilter overload handles specific cases
                .filter(extraFilter)
                // Sorts all blocks alphabetically
                .sorted(Comparator.comparing(e -> e.getId().getPath()))
                .forEach(e -> output.accept(e.get()));

        if (georeMod) {
            allGeOreBlockEntries()
                    .filter(e -> type.isInstance(e.get()))
                    .filter(extraFilter)
                    .sorted(Comparator.comparing(e -> e.getId().getPath()))
                    .forEach(e -> output.accept(e.get()));
        }

        if (ironFurnaceMod) {
            allIronFurnacesBlockEntries()
                    .filter(e -> type.isInstance(e.get()))
                    .filter(extraFilter)
                    .sorted(Comparator.comparing(e -> e.getId().getPath()))
                    .forEach(e -> output.accept(e.get()));
        }
    }

    public static void acceptBlocks(CreativeModeTab.Output output, Class<?> type) {
        // overload that don't need an extra filter
        acceptBlocks(output, type, e -> true);
    }

    public static void acceptIfModLoaded(String modId, CreativeModeTab.Output ignoredOutput, Runnable populate) {
        // overload that NEED an isModLoaded flag
        if (ModList.get().isLoaded(modId)) {
            populate.run();
        }
    }

    public static Supplier<CreativeModeTab> rgtrTab(int count, Supplier<? extends ItemLike> icon, String id, UnaryOperator<CreativeModeTab.Builder> operator) {
        return EOCreativeModeTabs.CREATIVE_TABS.register(TAB + count, () -> {
            CreativeModeTab.Builder bldr = base(icon)
                    .title(Component.translatable(CREATIVE_TAB + id));

            return operator.apply(bldr).build();
        });
    }

    public static void rgtr(IEventBus bus) {
        CREATIVE_TABS.register(bus);
    }
}
