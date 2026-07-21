package net.radzratz.eternalores.util.compat.enderio.items.types;

import com.enderio.enderio.content.capacitors.CapacitorItem;
import net.neoforged.neoforge.registries.DeferredItem;

public class EOCapacitors extends CapacitorItem {
    public EOCapacitors(Properties properties) {
        super(properties);
    }

    public static DeferredItem<EOCapacitors> CATALYRIC_CAPACITOR;
    public static DeferredItem<EOCapacitors> SIGNALUM_CAPACITOR;
    public static DeferredItem<EOCapacitors> ENDERIUM_CAPACITOR;
    public static DeferredItem<EOCapacitors> LUMIUM_CAPACITOR;
    public static DeferredItem<EOCapacitors> INVAR_CAPACITOR;
}
