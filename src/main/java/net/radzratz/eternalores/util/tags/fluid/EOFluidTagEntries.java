package net.radzratz.eternalores.util.tags.fluid;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.datagen.tags.EOFluidTagProvider;
import net.radzratz.eternalores.fluids.type.EOFluidType;
import net.radzratz.eternalores.util.EOMaterials;
import net.radzratz.eternalores.util.tags.fluid.util.FluidTagAutoRegister;
import net.radzratz.eternalores.util.tags.fluid.util.ITagFluidProvider;

import java.util.Comparator;

import static net.neoforged.neoforge.common.Tags.Fluids.GASEOUS;
import static net.radzratz.eternalores.util.EOUtils.allFluidSourceEntries;
import static net.radzratz.eternalores.util.tags.fluid.EOFluidTags.Compat.*;

public class EOFluidTagEntries implements ITagFluidProvider {

    @Override
    public void addTags(EOFluidTagProvider provider, HolderLookup.Provider lookup) {
        FluidTagAutoRegister register = new FluidTagAutoRegister(provider);

        allFluidSourceEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Fluid fluid = entry.get();
            if (!(fluid.getFluidType() instanceof EOFluidType type)) return;

            register.registerFlat(entry, flatName(type, entry.getId().getPath()), false);
            register.registerExternal(entry, NO_INFINITE_DRAINING, true);

            switch (type.type()) {
                case MOLTEN, PLASMA -> register.registerExternal(entry, HOT_FLUID, true);
                case GAS -> register.register(entry, GASEOUS, false);
                default -> {}
            }
        });
    }

    public static String flatName(EOFluidType type, String fluidPath) {
        String material = EOMaterials.extractMaterialName(fluidPath);
        return switch (type.type()) {
            case MOLTEN -> fluidPath;
            case PLASMA -> material + "_plasma";
            case FLUID, CHEMICAL, GAS -> material;
        };
    }
}