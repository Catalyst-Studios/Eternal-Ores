package net.radzratz.eternalores.util.compat.geore;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;

import java.util.Collection;
import java.util.stream.Stream;

import static net.radzratz.eternalores.block.types.enums.EOBlockTier.*;
import static net.radzratz.eternalores.util.compat.geore.GEOreHelpers.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreLargeBuds.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreClusterBlock.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreShardBlock.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreBuddingBlock.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreMediumBuds.*;
import static net.radzratz.eternalores.util.compat.geore.blocks.GEOreSmallBuds.*;
import static net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem.*;

public class GEOreRegistry {
    public static final DeferredRegister.Blocks GEORE_BLOCKS = DeferredRegister.createBlocks(EternalOres.id);
    public static final DeferredRegister.Items GEORE_ITEMS = DeferredRegister.createItems(EternalOres.id);

    static {
        CATALYRIUM_SHARD = rgtrShard("catalyrium");
        ARDITE_SHARD = rgtrShard("ardite");
        BERYLLIUM_SHARD = rgtrShard("beryllium");
        COBALT_SHARD = rgtrShard("cobalt");
        GALLIUM_SHARD = rgtrShard("gallium");
        IRIDIUM_SHARD = rgtrShard("iridium");
        SCULKITE_SHARD = rgtrShard("sculkite");
        TITANIUM_SHARD = rgtrShard("titanium");
        ULTIMATITANIUM_SHARD = rgtrShard("ultimatitanium");
        FLUORITE_SHARD = rgtrShard("fluorite");
        APATITE_SHARD = rgtrShard("apatite");
        CINNABAR_SHARD = rgtrShard("cinnabar");
        GARNET_SHARD = rgtrShard("garnet");
        JADE_SHARD = rgtrShard("jade");
        NECROTICARITE_SHARD = rgtrShard("necroticarite");
        NITER_SHARD = rgtrShard("niter");
        OBSIDIAN_SHARD = rgtrShard("obsidian");
        ONYX_SHARD = rgtrShard("onyx");
        PEARL_SHARD = rgtrShard("pearl");
        PERIDOT_SHARD = rgtrShard("peridot");
        PYROLITE_SHARD = rgtrShard("pyrolite");
        TANZANITE_SHARD = rgtrShard("tanzanite");
        ZIRCON_SHARD = rgtrShard("zircon");
        MOLYBDENUM_SHARD = rgtrShard("molybdenum");
        NEODYMIUM_SHARD = rgtrShard("neodymium");
        SPINEL_SHARD = rgtrShard("spinel");
        PALLADIUM_SHARD = rgtrShard("palladium");

        CATALYRIUM_SHARD_BLOCK = rgtrGeOreBlock("catalyrium", T_NETHERITE);
        ARDITE_SHARD_BLOCK = rgtrGeOreBlock("ardite", T_NETHERITE);
        BERYLLIUM_SHARD_BLOCK = rgtrGeOreBlock("beryllium", T_IRON);
        COBALT_SHARD_BLOCK = rgtrGeOreBlock("cobalt", T_DIAMOND);
        GALLIUM_SHARD_BLOCK = rgtrGeOreBlock("gallium", T_STONE);
        IRIDIUM_SHARD_BLOCK = rgtrGeOreBlock("iridium", T_IRON);
        SCULKITE_SHARD_BLOCK = rgtrGeOreBlock("sculkite", T_NETHERITE);
        TITANIUM_SHARD_BLOCK = rgtrGeOreBlock("titanium", T_DIAMOND);
        ULTIMATITANIUM_SHARD_BLOCK = rgtrGeOreBlock("ultimatitanium", T_DIAMOND);
        FLUORITE_SHARD_BLOCK = rgtrGeOreBlock("fluorite", T_IRON);
        APATITE_SHARD_BLOCK = rgtrGeOreBlock("apatite", T_IRON);
        CINNABAR_SHARD_BLOCK = rgtrGeOreBlock("cinnabar", T_IRON);
        GARNET_SHARD_BLOCK = rgtrGeOreBlock("garnet", T_IRON);
        JADE_SHARD_BLOCK = rgtrGeOreBlock("jade", T_IRON);
        NECROTICARITE_SHARD_BLOCK = rgtrGeOreBlock("necroticarite", T_IRON);
        NITER_SHARD_BLOCK = rgtrGeOreBlock("niter", T_IRON);
        OBSIDIAN_SHARD_BLOCK = rgtrGeOreBlock("obsidian", T_DIAMOND);
        ONYX_SHARD_BLOCK = rgtrGeOreBlock("onyx", T_IRON);
        PEARL_SHARD_BLOCK = rgtrGeOreBlock("pearl", T_IRON);
        PERIDOT_SHARD_BLOCK = rgtrGeOreBlock("peridot", T_IRON);
        PYROLITE_SHARD_BLOCK = rgtrGeOreBlock("pyrolite", T_DIAMOND);
        TANZANITE_SHARD_BLOCK = rgtrGeOreBlock("tanzanite", T_IRON);
        ZIRCON_SHARD_BLOCK = rgtrGeOreBlock("zircon", T_IRON);
        MOLYBDENUM_SHARD_BLOCK = rgtrGeOreBlock("molybdenum", T_IRON);
        NEODYMIUM_SHARD_BLOCK = rgtrGeOreBlock("neodymium", T_IRON);
        SPINEL_SHARD_BLOCK = rgtrGeOreBlock("spinel", T_IRON);
        PALLADIUM_SHARD_BLOCK = rgtrGeOreBlock("palladium", T_DIAMOND);

        SMALL_CATALYRIUM_BUD = rgtrSmallBudBlock("catalyrium", T_NETHERITE);
        SMALL_ARDITE_BUD = rgtrSmallBudBlock("ardite", T_NETHERITE);
        SMALL_BERYLLIUM_BUD = rgtrSmallBudBlock("beryllium", T_IRON);
        SMALL_COBALT_BUD = rgtrSmallBudBlock("cobalt", T_DIAMOND);
        SMALL_GALLIUM_BUD = rgtrSmallBudBlock("gallium", T_STONE);
        SMALL_IRIDIUM_BUD = rgtrSmallBudBlock("iridium", T_IRON);
        SMALL_SCULKITE_BUD = rgtrSmallBudBlock("sculkite", T_NETHERITE);
        SMALL_TITANIUM_BUD = rgtrSmallBudBlock("titanium", T_DIAMOND);
        SMALL_ULTIMATITANIUM_BUD = rgtrSmallBudBlock("ultimatitanium", T_DIAMOND);
        SMALL_FLUORITE_BUD = rgtrSmallBudBlock("fluorite", T_IRON);
        SMALL_APATITE_BUD = rgtrSmallBudBlock("apatite", T_IRON);
        SMALL_CINNABAR_BUD = rgtrSmallBudBlock("cinnabar", T_IRON);
        SMALL_GARNET_BUD = rgtrSmallBudBlock("garnet", T_IRON);
        SMALL_JADE_BUD = rgtrSmallBudBlock("jade", T_IRON);
        SMALL_NECROTICARITE_BUD = rgtrSmallBudBlock("necroticarite", T_IRON);
        SMALL_NITER_BUD = rgtrSmallBudBlock("niter", T_IRON);
        SMALL_OBSIDIAN_BUD = rgtrSmallBudBlock("obsidian", T_DIAMOND);
        SMALL_ONYX_BUD = rgtrSmallBudBlock("onyx", T_IRON);
        SMALL_PEARL_BUD = rgtrSmallBudBlock("pearl", T_IRON);
        SMALL_PERIDOT_BUD = rgtrSmallBudBlock("peridot", T_IRON);
        SMALL_PYROLITE_BUD = rgtrSmallBudBlock("pyrolite", T_DIAMOND);
        SMALL_TANZANITE_BUD = rgtrSmallBudBlock("tanzanite", T_IRON);
        SMALL_ZIRCON_BUD = rgtrSmallBudBlock("zircon", T_IRON);
        SMALL_MOLYBDENUM_BUD = rgtrSmallBudBlock("molybdenum", T_IRON);
        SMALL_NEODYMIUM_BUD = rgtrSmallBudBlock("neodymium", T_IRON);
        SMALL_SPINEL_BUD = rgtrSmallBudBlock("spinel", T_IRON);
        SMALL_PALLADIUM_BUD = rgtrSmallBudBlock("palladium", T_DIAMOND);

        MEDIUM_CATALYRIUM_BUD = rgtrMediumBudBlock("catalyrium", T_NETHERITE);
        MEDIUM_ARDITE_BUD = rgtrMediumBudBlock("ardite", T_NETHERITE);
        MEDIUM_BERYLLIUM_BUD = rgtrMediumBudBlock("beryllium", T_IRON);
        MEDIUM_COBALT_BUD = rgtrMediumBudBlock("cobalt", T_DIAMOND);
        MEDIUM_GALLIUM_BUD = rgtrMediumBudBlock("gallium", T_STONE);
        MEDIUM_IRIDIUM_BUD = rgtrMediumBudBlock("iridium", T_IRON);
        MEDIUM_SCULKITE_BUD = rgtrMediumBudBlock("sculkite", T_NETHERITE);
        MEDIUM_TITANIUM_BUD = rgtrMediumBudBlock("titanium", T_DIAMOND);
        MEDIUM_ULTIMATITANIUM_BUD = rgtrMediumBudBlock("ultimatitanium", T_DIAMOND);
        MEDIUM_FLUORITE_BUD = rgtrMediumBudBlock("fluorite", T_IRON);
        MEDIUM_APATITE_BUD = rgtrMediumBudBlock("apatite", T_IRON);
        MEDIUM_CINNABAR_BUD = rgtrMediumBudBlock("cinnabar", T_IRON);
        MEDIUM_GARNET_BUD = rgtrMediumBudBlock("garnet", T_IRON);
        MEDIUM_JADE_BUD = rgtrMediumBudBlock("jade", T_IRON);
        MEDIUM_NECROTICARITE_BUD = rgtrMediumBudBlock("necroticarite", T_IRON);
        MEDIUM_NITER_BUD = rgtrMediumBudBlock("niter", T_IRON);
        MEDIUM_OBSIDIAN_BUD = rgtrMediumBudBlock("obsidian", T_DIAMOND);
        MEDIUM_ONYX_BUD = rgtrMediumBudBlock("onyx", T_IRON);
        MEDIUM_PEARL_BUD = rgtrMediumBudBlock("pearl", T_IRON);
        MEDIUM_PERIDOT_BUD = rgtrMediumBudBlock("peridot", T_IRON);
        MEDIUM_PYROLITE_BUD = rgtrMediumBudBlock("pyrolite", T_DIAMOND);
        MEDIUM_TANZANITE_BUD = rgtrMediumBudBlock("tanzanite", T_IRON);
        MEDIUM_ZIRCON_BUD = rgtrMediumBudBlock("zircon", T_IRON);
        MEDIUM_MOLYBDENUM_BUD = rgtrMediumBudBlock("molybdenum", T_IRON);
        MEDIUM_NEODYMIUM_BUD = rgtrMediumBudBlock("neodymium", T_IRON);
        MEDIUM_SPINEL_BUD = rgtrMediumBudBlock("spinel", T_IRON);
        MEDIUM_PALLADIUM_BUD = rgtrMediumBudBlock("palladium", T_DIAMOND);

        LARGE_CATALYRIUM_BUD = rgtrLargeBudBlock("catalyrium", T_NETHERITE);
        LARGE_ARDITE_BUD = rgtrLargeBudBlock("ardite", T_NETHERITE);
        LARGE_BERYLLIUM_BUD = rgtrLargeBudBlock("beryllium", T_IRON);
        LARGE_COBALT_BUD = rgtrLargeBudBlock("cobalt", T_DIAMOND);
        LARGE_GALLIUM_BUD = rgtrLargeBudBlock("gallium", T_STONE);
        LARGE_IRIDIUM_BUD = rgtrLargeBudBlock("iridium", T_IRON);
        LARGE_SCULKITE_BUD = rgtrLargeBudBlock("sculkite", T_NETHERITE);
        LARGE_TITANIUM_BUD = rgtrLargeBudBlock("titanium", T_DIAMOND);
        LARGE_ULTIMATITANIUM_BUD = rgtrLargeBudBlock("ultimatitanium", T_DIAMOND);
        LARGE_FLUORITE_BUD = rgtrLargeBudBlock("fluorite", T_IRON);
        LARGE_APATITE_BUD = rgtrLargeBudBlock("apatite", T_IRON);
        LARGE_CINNABAR_BUD = rgtrLargeBudBlock("cinnabar", T_IRON);
        LARGE_GARNET_BUD = rgtrLargeBudBlock("garnet", T_IRON);
        LARGE_JADE_BUD = rgtrLargeBudBlock("jade", T_IRON);
        LARGE_NECROTICARITE_BUD = rgtrLargeBudBlock("necroticarite", T_IRON);
        LARGE_NITER_BUD = rgtrLargeBudBlock("niter", T_IRON);
        LARGE_OBSIDIAN_BUD = rgtrLargeBudBlock("obsidian", T_DIAMOND);
        LARGE_ONYX_BUD = rgtrLargeBudBlock("onyx", T_IRON);
        LARGE_PEARL_BUD = rgtrLargeBudBlock("pearl", T_IRON);
        LARGE_PERIDOT_BUD = rgtrLargeBudBlock("peridot", T_IRON);
        LARGE_PYROLITE_BUD = rgtrLargeBudBlock("pyrolite", T_DIAMOND);
        LARGE_TANZANITE_BUD = rgtrLargeBudBlock("tanzanite", T_IRON);
        LARGE_ZIRCON_BUD = rgtrLargeBudBlock("zircon", T_IRON);
        LARGE_MOLYBDENUM_BUD = rgtrLargeBudBlock("molybdenum", T_IRON);
        LARGE_NEODYMIUM_BUD = rgtrLargeBudBlock("neodymium", T_IRON);
        LARGE_SPINEL_BUD = rgtrLargeBudBlock("spinel", T_IRON);
        LARGE_PALLADIUM_BUD = rgtrLargeBudBlock("palladium", T_DIAMOND);

        CATALYRIUM_CLUSTER = rgtrClusterBlock("catalyrium", T_NETHERITE, CATALYRIUM_SHARD);
        ARDITE_CLUSTER = rgtrClusterBlock("ardite", T_NETHERITE, ARDITE_SHARD);
        BERYLLIUM_CLUSTER = rgtrClusterBlock("beryllium", T_IRON, BERYLLIUM_SHARD);
        COBALT_CLUSTER = rgtrClusterBlock("cobalt", T_DIAMOND, COBALT_SHARD);
        GALLIUM_CLUSTER = rgtrClusterBlock("gallium", T_STONE, GALLIUM_SHARD);
        IRIDIUM_CLUSTER = rgtrClusterBlock("iridium", T_IRON, IRIDIUM_SHARD);
        SCULKITE_CLUSTER = rgtrClusterBlock("sculkite", T_NETHERITE, SCULKITE_SHARD);
        TITANIUM_CLUSTER = rgtrClusterBlock("titanium", T_DIAMOND, TITANIUM_SHARD);
        ULTIMATITANIUM_CLUSTER = rgtrClusterBlock("ultimatitanium", T_DIAMOND, ULTIMATITANIUM_SHARD);
        FLUORITE_CLUSTER = rgtrClusterBlock("fluorite", T_IRON, FLUORITE_SHARD);
        APATITE_CLUSTER = rgtrClusterBlock("apatite", T_IRON, APATITE_SHARD);
        CINNABAR_CLUSTER = rgtrClusterBlock("cinnabar", T_IRON, CINNABAR_SHARD);
        GARNET_CLUSTER = rgtrClusterBlock("garnet", T_IRON, GARNET_SHARD);
        JADE_CLUSTER = rgtrClusterBlock("jade", T_IRON, JADE_SHARD);
        NECROTICARITE_CLUSTER = rgtrClusterBlock("necroticarite", T_IRON, NECROTICARITE_SHARD);
        NITER_CLUSTER = rgtrClusterBlock("niter", T_IRON, NITER_SHARD);
        OBSIDIAN_CLUSTER = rgtrClusterBlock("obsidian", T_DIAMOND, OBSIDIAN_SHARD);
        ONYX_CLUSTER = rgtrClusterBlock("onyx", T_IRON, ONYX_SHARD);
        PEARL_CLUSTER = rgtrClusterBlock("pearl", T_IRON, PEARL_SHARD);
        PERIDOT_CLUSTER = rgtrClusterBlock("peridot", T_IRON, PERIDOT_SHARD);
        PYROLITE_CLUSTER = rgtrClusterBlock("pyrolite", T_DIAMOND, PYROLITE_SHARD);
        TANZANITE_CLUSTER = rgtrClusterBlock("tanzanite", T_IRON, TANZANITE_SHARD);
        ZIRCON_CLUSTER = rgtrClusterBlock("zircon", T_IRON, ZIRCON_SHARD);
        MOLYBDENUM_CLUSTER = rgtrClusterBlock("molybdenum", T_IRON, MOLYBDENUM_SHARD);
        NEODYMIUM_CLUSTER = rgtrClusterBlock("neodymium", T_IRON, NEODYMIUM_SHARD);
        SPINEL_CLUSTER = rgtrClusterBlock("spinel", T_IRON, SPINEL_SHARD);
        PALLADIUM_CLUSTER = rgtrClusterBlock("palladium", T_DIAMOND, PALLADIUM_SHARD);

        BUDDING_CATALYRIUM_BLOCK = rgtrBuddingBlock("catalyrium", T_NETHERITE, SMALL_CATALYRIUM_BUD, MEDIUM_CATALYRIUM_BUD, LARGE_CATALYRIUM_BUD, CATALYRIUM_CLUSTER);
        BUDDING_ARDITE_BLOCK = rgtrBuddingBlock("ardite", T_NETHERITE, SMALL_ARDITE_BUD, MEDIUM_ARDITE_BUD, LARGE_ARDITE_BUD, ARDITE_CLUSTER);
        BUDDING_BERYLLIUM_BLOCK = rgtrBuddingBlock("beryllium", T_IRON, SMALL_BERYLLIUM_BUD, MEDIUM_BERYLLIUM_BUD, LARGE_BERYLLIUM_BUD, BERYLLIUM_CLUSTER);
        BUDDING_COBALT_BLOCK = rgtrBuddingBlock("cobalt", T_DIAMOND, SMALL_COBALT_BUD, MEDIUM_COBALT_BUD, LARGE_COBALT_BUD, COBALT_CLUSTER);
        BUDDING_GALLIUM_BLOCK = rgtrBuddingBlock("gallium", T_STONE, SMALL_GALLIUM_BUD, MEDIUM_GALLIUM_BUD, LARGE_GALLIUM_BUD, GALLIUM_CLUSTER);
        BUDDING_IRIDIUM_BLOCK = rgtrBuddingBlock("iridium", T_IRON, SMALL_IRIDIUM_BUD, MEDIUM_IRIDIUM_BUD, LARGE_IRIDIUM_BUD, IRIDIUM_CLUSTER);
        BUDDING_SCULKITE_BLOCK = rgtrBuddingBlock("sculkite", T_NETHERITE, SMALL_SCULKITE_BUD, MEDIUM_SCULKITE_BUD, LARGE_SCULKITE_BUD, SCULKITE_CLUSTER);
        BUDDING_TITANIUM_BLOCK = rgtrBuddingBlock("titanium", T_DIAMOND, SMALL_TITANIUM_BUD, MEDIUM_TITANIUM_BUD, LARGE_TITANIUM_BUD, TITANIUM_CLUSTER);
        BUDDING_ULTIMATITANIUM_BLOCK = rgtrBuddingBlock("ultimatitanium", T_DIAMOND, SMALL_ULTIMATITANIUM_BUD, MEDIUM_ULTIMATITANIUM_BUD, LARGE_ULTIMATITANIUM_BUD, ULTIMATITANIUM_CLUSTER);
        BUDDING_FLUORITE_BLOCK = rgtrBuddingBlock("fluorite", T_IRON, SMALL_FLUORITE_BUD, MEDIUM_FLUORITE_BUD, LARGE_FLUORITE_BUD, FLUORITE_CLUSTER);
        BUDDING_APATITE_BLOCK = rgtrBuddingBlock("apatite", T_IRON, SMALL_APATITE_BUD, MEDIUM_APATITE_BUD, LARGE_APATITE_BUD, APATITE_CLUSTER);
        BUDDING_CINNABAR_BLOCK = rgtrBuddingBlock("cinnabar", T_IRON, SMALL_CINNABAR_BUD, MEDIUM_CINNABAR_BUD, LARGE_CINNABAR_BUD, CINNABAR_CLUSTER);
        BUDDING_GARNET_BLOCK = rgtrBuddingBlock("garnet", T_IRON, SMALL_GARNET_BUD, MEDIUM_GARNET_BUD, LARGE_GARNET_BUD, GARNET_CLUSTER);
        BUDDING_JADE_BLOCK = rgtrBuddingBlock("jade", T_IRON, SMALL_JADE_BUD, MEDIUM_JADE_BUD, LARGE_JADE_BUD, JADE_CLUSTER);
        BUDDING_NECROTICARITE_BLOCK = rgtrBuddingBlock("necroticarite", T_IRON, SMALL_NECROTICARITE_BUD, MEDIUM_NECROTICARITE_BUD, LARGE_NECROTICARITE_BUD, NECROTICARITE_CLUSTER);
        BUDDING_NITER_BLOCK = rgtrBuddingBlock("niter", T_IRON, SMALL_NITER_BUD, MEDIUM_NITER_BUD, LARGE_NITER_BUD, NITER_CLUSTER);
        BUDDING_OBSIDIAN_BLOCK = rgtrBuddingBlock("obsidian", T_DIAMOND, SMALL_OBSIDIAN_BUD, MEDIUM_OBSIDIAN_BUD, LARGE_OBSIDIAN_BUD, OBSIDIAN_CLUSTER);
        BUDDING_ONYX_BLOCK = rgtrBuddingBlock("onyx", T_IRON, SMALL_ONYX_BUD, MEDIUM_ONYX_BUD, LARGE_ONYX_BUD, ONYX_CLUSTER);
        BUDDING_PEARL_BLOCK = rgtrBuddingBlock("pearl", T_IRON, SMALL_PEARL_BUD, MEDIUM_PEARL_BUD, LARGE_PEARL_BUD, PEARL_CLUSTER);
        BUDDING_PERIDOT_BLOCK = rgtrBuddingBlock("peridot", T_IRON, SMALL_PERIDOT_BUD, MEDIUM_PERIDOT_BUD, LARGE_PERIDOT_BUD, PERIDOT_CLUSTER);
        BUDDING_PYROLITE_BLOCK = rgtrBuddingBlock("pyrolite", T_DIAMOND, SMALL_PYROLITE_BUD, MEDIUM_PYROLITE_BUD, LARGE_PYROLITE_BUD, PYROLITE_CLUSTER);
        BUDDING_TANZANITE_BLOCK = rgtrBuddingBlock("tanzanite", T_IRON, SMALL_TANZANITE_BUD, MEDIUM_TANZANITE_BUD, LARGE_TANZANITE_BUD, TANZANITE_CLUSTER);
        BUDDING_ZIRCON_BLOCK = rgtrBuddingBlock("zircon", T_IRON, SMALL_ZIRCON_BUD, MEDIUM_ZIRCON_BUD, LARGE_ZIRCON_BUD, ZIRCON_CLUSTER);
        BUDDING_MOLYBDENUM_BLOCK = rgtrBuddingBlock("molybdenum", T_IRON, SMALL_MOLYBDENUM_BUD, MEDIUM_MOLYBDENUM_BUD, LARGE_MOLYBDENUM_BUD, MOLYBDENUM_CLUSTER);
        BUDDING_NEODYMIUM_BLOCK = rgtrBuddingBlock("neodymium", T_IRON, SMALL_NEODYMIUM_BUD, MEDIUM_NEODYMIUM_BUD, LARGE_NEODYMIUM_BUD, NEODYMIUM_CLUSTER);
        BUDDING_SPINEL_BLOCK = rgtrBuddingBlock("spinel", T_IRON, SMALL_SPINEL_BUD, MEDIUM_SPINEL_BUD, LARGE_SPINEL_BUD, SPINEL_CLUSTER);
        BUDDING_PALLADIUM_BLOCK = rgtrBuddingBlock("palladium", T_DIAMOND, SMALL_PALLADIUM_BUD, MEDIUM_PALLADIUM_BUD, LARGE_PALLADIUM_BUD, PALLADIUM_CLUSTER);
    }

    public static Stream<DeferredHolder<Item, ? extends Item>> allGeOreItemEntries() {
        return Stream.of(GEORE_ITEMS.getEntries()).flatMap(Collection::stream);
    }

    public static Stream<DeferredHolder<Block, ? extends Block>> allGeOreBlockEntries() {
        return Stream.of(GEORE_BLOCKS.getEntries()).flatMap(Collection::stream);
    }

    public static void rgtr(IEventBus bus) {
        GEORE_BLOCKS.register(bus);
        GEORE_ITEMS.register(bus);
    }
}
