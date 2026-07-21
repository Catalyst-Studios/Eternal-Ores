package net.radzratz.eternalores.util.compat.enderio.items;

import com.enderio.enderio.api.capacitor.CapacitorData;
import com.enderio.enderio.init.EIODataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.EOUtils;
import net.radzratz.eternalores.util.compat.enderio.items.types.EOCapacitors;
import net.radzratz.eternalores.util.compat.enderio.items.types.EOGrindingBall;

import java.util.Collection;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.compat.enderio.items.types.EOGrindingBall.*;
import static net.radzratz.eternalores.util.compat.enderio.items.types.EOCapacitors.*;

public class EOioItems {
    public static final DeferredRegister.Items EIO_ITEMS = DeferredRegister.createItems(EternalOres.id);

    static {
        // Grinding Balls
        CATALYRIC_GRINDING_BALL = rgtrBalls("catalyric");
        ELECTRUM_GRINDING_BALL = rgtrBalls("electrum");
        ENDERIUM_GRINDING_BALL = rgtrBalls("enderium");
        SIGNALUM_GRINDING_BALL = rgtrBalls("signalum");
        LUMIUM_GRINDING_BALL = rgtrBalls("lumium");

        // Capacitors
        CATALYRIC_CAPACITOR = rgtrCapacitors("catalyric", 8);
        ENDERIUM_CAPACITOR = rgtrCapacitors("enderium", 7);
        SIGNALUM_CAPACITOR = rgtrCapacitors("signalum", 6);
        LUMIUM_CAPACITOR = rgtrCapacitors("lumium", 5);
        INVAR_CAPACITOR = rgtrCapacitors("invar", 4);
    }

    /**
     * @see EOUtils#allItemEntries
     */
    public static Stream<DeferredHolder<Item, ? extends Item>> allEnderIOItemEntries() {
        return Stream.of(EIO_ITEMS.getEntries()).flatMap(Collection::stream);
    }

    /**
     * Eternal Ores Capacitor helper
     * @param id Capacitor name
     * @param base Represents the level of the capacitor
     */
    private static DeferredItem<EOCapacitors> rgtrCapacitors(String id, int base) {
        return EIO_ITEMS.registerItem(id + "_capacitor", EOCapacitors::new,
                new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(base)));
    }

    /**
     * Eternal Ores Grinding Ball helper
     * <p>
     * if ya laugh when reading the word balls without any proper context given, then we both have a problem
     * @param id Item id
     * @return We return a normal item registry, we no longer define the grinding ball modifiers within the item registry
     */
    private static DeferredItem<EOGrindingBall> rgtrBalls(String id) {
        return EIO_ITEMS.registerItem(id + "_grinding_ball", EOGrindingBall::new, new Item.Properties());
    }

    public static void rgtr(IEventBus bus) {
        EIO_ITEMS.register(bus);
    }
}
