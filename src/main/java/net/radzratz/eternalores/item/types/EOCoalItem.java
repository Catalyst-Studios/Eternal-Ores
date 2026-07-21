package net.radzratz.eternalores.item.types;

import java.util.function.BooleanSupplier;

public class EOCoalItem extends EOConfigItem {
    private final int burnTime;

    public EOCoalItem(Properties properties, int burnTime, BooleanSupplier materialSet, BooleanSupplier individual) {
        super(properties, materialSet, individual);
        this.burnTime = burnTime;
    }

    public int getBurnTime() {
        return this.burnTime;
    }
}
