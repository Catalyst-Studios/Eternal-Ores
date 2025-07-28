package net.radzratz.eternalores.item.types;

import net.minecraft.world.item.Item;
import net.radzratz.eternalores.item.types.enums.EOMaterialFormType;

public class EODustItem extends Item
{
    private final EOMaterialFormType getDustType;

    public EODustItem(EOMaterialFormType type, Properties properties)
    {
        super(properties);
        this.getDustType = type;
    }

    public EOMaterialFormType getDustType()
    {
        return getDustType;
    }
}
