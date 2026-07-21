package net.radzratz.eternalores.util.recipes;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.recipes.types.EasyToolRepair;
import net.radzratz.eternalores.util.recipes.serializers.EasyToolRepairSerializer;


public class EORecipeRegistry {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, EternalOres.id);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<EasyToolRepair>> EASY_TOOL_REPAIR =
            SERIALIZERS.register("easy_tool_repair", EasyToolRepairSerializer::new);

    public static void rgtr(IEventBus bus) {
        SERIALIZERS.register(bus);
    }
}
