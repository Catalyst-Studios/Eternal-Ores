package net.radzratz.eternalores.item.types;

import net.minecraft.world.item.Item;
import net.radzratz.eternalores.item.types.enums.EOMaterialFormType;

public class EOGearItem extends Item
{
    private final EOMaterialFormType gearType;

    public EOGearItem(EOMaterialFormType type, Properties properties)
    {
        super(properties);
        this.gearType = type;
    }

    public EOMaterialFormType getGearType()
    {
        return gearType;
    }
}
