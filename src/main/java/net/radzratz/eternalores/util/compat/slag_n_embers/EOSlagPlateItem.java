package net.radzratz.eternalores.util.compat.slag_n_embers;

import dev.lopyluna.slag.content.items.dynamic_part.IDynamicPart;
import dev.lopyluna.slag.content.types.MaterialType;
import dev.lopyluna.slag.content.types.PartType;
import dev.lopyluna.slag.register.AllDataComponents;
import dev.lopyluna.slag.register.AllDynamicTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.item.types.EOPlateItem;

import java.util.Optional;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOUtils.SLAG;

public class EOSlagPlateItem extends EOPlateItem implements IDynamicPart {
    private static final ResourceLocation PLATE = SLAG("plate");
    private final ResourceLocation slagMat;

    private EOSlagPlateItem(Properties p, BooleanSupplier set, BooleanSupplier on, ResourceLocation slagMat) {
        super(p, set, on);
        this.slagMat = slagMat;
    }

    public static EOPlateItem create(BooleanSupplier set, BooleanSupplier on, String slagId) {
        Item.Properties p = new Item.Properties()
                .component(AllDataComponents.MATERIAL_TYPE.get(), SLAG(slagId))
                .component(AllDataComponents.PART_TYPE.get(), PLATE);
        return new EOSlagPlateItem(p, set, on, SLAG(slagId));
    }

    @Override
    public Optional<MaterialType> getMaterialType(ItemStack s) {
        return AllDynamicTypes.getMaterial(slagMat);
    }

    @Override public Optional<PartType> getPartType(ItemStack s) {
        return AllDynamicTypes.getPart(PLATE);
    }
}
