package net.radzratz.eternalores.item.types;

import net.minecraft.world.item.Item;
import net.radzratz.eternalores.item.types.enums.EOMaterialFormType;

public class EORodItem extends Item
{
    private final EOMaterialFormType rodType;

    public EORodItem(EOMaterialFormType type, Properties properties)
    {
        super(properties);
        this.rodType = type;
    }

    public EOMaterialFormType getRodType()
    {
        return rodType;
    }
}
