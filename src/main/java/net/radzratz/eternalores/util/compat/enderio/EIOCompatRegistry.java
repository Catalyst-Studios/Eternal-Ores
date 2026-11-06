package net.radzratz.eternalores.util.compat.enderio;

import com.enderio.enderio.api.capacitor.CapacitorData;
import com.enderio.enderio.init.EIODataComponents;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.enderio.items.EOCapacitors;
import net.radzratz.eternalores.util.compat.enderio.items.EOGrindingBall;

import java.util.Collection;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.compat.enderio.items.EOGrindingBall.*;
import static net.radzratz.eternalores.util.compat.enderio.items.EOCapacitors.*;

public class EIOCompatRegistry {
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

    public static Stream<DeferredHolder<Item, ? extends Item>> allEnderIOItemEntries() {
        return Stream.of(EIO_ITEMS.getEntries()).flatMap(Collection::stream);
    }

    private static DeferredItem<EOCapacitors> rgtrCapacitors(String id, int base) {
        return EIO_ITEMS.registerItem(id + "_capacitor", EOCapacitors::new,
                new Item.Properties().component(EIODataComponents.CAPACITOR_DATA, CapacitorData.simple(base)));
    }

    // if ya laugh when reading the word balls without any proper context given, then we both have a problem
    private static DeferredItem<EOGrindingBall> rgtrBalls(String id) {
        return EIO_ITEMS.registerItem(id + "_grinding_ball", EOGrindingBall::new, new Item.Properties());
    }

    public static void rgtr(IEventBus bus) {
        EIO_ITEMS.register(bus);
    }
}
