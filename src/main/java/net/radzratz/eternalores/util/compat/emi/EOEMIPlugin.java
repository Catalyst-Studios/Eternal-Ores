package net.radzratz.eternalores.util.compat.emi;

import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.VanillaEmiRecipeCategories;
import dev.emi.emi.api.stack.EmiStack;
import mekanism.client.recipe_viewer.emi.ChemicalEmiStack;
import net.neoforged.neoforge.fluids.FluidType;
import net.radzratz.eternalores.fluids.type.EOFluidType;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusions;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.CATALYRIUM_FURNACE;

@EmiEntrypoint
public class EOEMIPlugin implements EmiPlugin {

    @Override
    public void register(EmiRegistry registry) {
        if (ironFurnaceMod) {
            registry.addWorkstation(VanillaEmiRecipeCategories.SMELTING, EmiStack.of(CATALYRIUM_FURNACE.item().get()));
            registry.addWorkstation(VanillaEmiRecipeCategories.BLASTING, EmiStack.of(CATALYRIUM_FURNACE.item().get()));
        }

        if (mekanismMod) {
            // Hides infusions and slurries from appearing over EMI catalogue
            // when said chemical is disabled over the config
            EOInfusions.EO_CHEMICALS.getEntries().stream()
                    .filter(e -> e.get() instanceof EOChemical c && !c.isEnabled())
                    .forEach(e -> registry.removeEmiStacks(new ChemicalEmiStack(e, 1)));
        }

        allFluidSourceEntries()
                .filter(e -> e.get().getFluidType() instanceof EOFluidType type && !type.isEnabled())
                .forEach(e -> registry.removeEmiStacks(EmiStack.of(e.get(), FluidType.BUCKET_VOLUME)));
    }
}
