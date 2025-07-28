package net.radzratz.eternalores.item.types;

import net.minecraft.world.item.Item;
import net.radzratz.eternalores.item.types.enums.EOMaterialFormType;

public class EOPlateItem extends Item
{
    private final EOMaterialFormType plateType;

    public EOPlateItem(EOMaterialFormType type, Properties properties)
    {
        super(properties);
        this.plateType = type;
    }

    public EOMaterialFormType getPlateType()
    {
        return plateType;
    }
}
