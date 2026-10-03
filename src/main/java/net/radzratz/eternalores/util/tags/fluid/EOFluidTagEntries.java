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

            String path = entry.getId().getPath();
            String material = EOMaterials.extractMaterialName(path);

            switch (type.type()) {
                case MOLTEN -> {
                    register.registerFlat(entry, path, false);
                    register.registerExternal(entry, NO_INFINITE_DRAINING, true);
                    register.registerExternal(entry, HOT_FLUID, true);
                }
                case FLUID, CHEMICAL -> {
                    register.registerFlat(entry, material, false);
                    register.registerExternal(entry, NO_INFINITE_DRAINING, true);
                }
                case GAS -> {
                    register.registerFlat(entry, material, false);
                    register.register(entry, GASEOUS, false);
                    register.registerExternal(entry, NO_INFINITE_DRAINING, true);
                }
            }
        });
    }
}