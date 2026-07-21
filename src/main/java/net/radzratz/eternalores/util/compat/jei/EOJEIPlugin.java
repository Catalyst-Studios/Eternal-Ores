package net.radzratz.eternalores.util.compat.jei;

import mekanism.api.chemical.ChemicalStack;
import mekanism.client.recipe_viewer.jei.MekanismJEI;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.runtime.IJeiRuntime;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusions;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.*;

@JeiPlugin
public class EOJEIPlugin implements IModPlugin {

    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return EO("eternal_ores_plugin");
    }

    @Override
    public void registerRecipeCatalysts(@NotNull IRecipeCatalystRegistration registry) {
        if(ironFurnaceMod) {
            registry.addRecipeCatalyst(new ItemStack(EOIronFurnaceRegistries.CATALYRIUM_FURNACE.item()), RecipeTypes.SMELTING);
            registry.addRecipeCatalyst(new ItemStack(EOIronFurnaceRegistries.CATALYRIUM_FURNACE.item()), RecipeTypes.FUELING);
        }
    }

    @Override
    public void onRuntimeAvailable(@NotNull IJeiRuntime jeiRuntime) {
        if (mekanismMod) {
            // Hides infusions and slurries from appearing over JEI catalogue
            // when said chemical is disabled over the config
            List<ChemicalStack> infusion = EOInfusions.EO_CHEMICALS.getEntries().stream()
                    .filter(e -> e.get() instanceof EOChemical c && !c.isEnabled())
                    .map(e -> new ChemicalStack(e, 1))
                    .toList();

            if (!infusion.isEmpty()) {
                jeiRuntime.getIngredientManager()
                        .removeIngredientsAtRuntime(MekanismJEI.TYPE_CHEMICAL, infusion);
            }
        }
    }
}
