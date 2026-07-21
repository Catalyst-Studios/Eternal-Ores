package net.radzratz.eternalores.item.types;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.function.BooleanSupplier;

public class EOConfigItem extends Item {
    private final BooleanSupplier materialSet;
    private final BooleanSupplier individualItem;

    public EOConfigItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individualItem) {
        super(properties);
        // Represents the complete material set
        this.materialSet = materialSet;
        // Represents the individual item type from said set
        this.individualItem = individualItem;
        // truth being told, any of these can whatever the heck they want
        // they work regardless of which is which LMAO
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        // only hides said set or material, it does not unregister anything
        return materialSet.getAsBoolean() && individualItem.getAsBoolean();
    }
}
