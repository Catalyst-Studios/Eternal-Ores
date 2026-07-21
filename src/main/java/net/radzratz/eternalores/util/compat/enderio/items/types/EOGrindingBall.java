package net.radzratz.eternalores.util.compat.enderio.items.types;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class EOGrindingBall extends Item {
    public EOGrindingBall(Properties properties) {
        super(properties);
    }

    public static DeferredItem<EOGrindingBall> CATALYRIC_GRINDING_BALL;
    public static DeferredItem<EOGrindingBall> ELECTRUM_GRINDING_BALL;
    public static DeferredItem<EOGrindingBall> ENDERIUM_GRINDING_BALL;
    public static DeferredItem<EOGrindingBall> SIGNALUM_GRINDING_BALL;
    public static DeferredItem<EOGrindingBall> LUMIUM_GRINDING_BALL;
}
