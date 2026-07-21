package net.radzratz.eternalores.item.types;

import java.util.function.BooleanSupplier;

public class EORawMaterialItem extends EOConfigItem {
    public EORawMaterialItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individual) {
        super(properties, materialSet, individual);
    }
}
