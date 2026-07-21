package net.radzratz.eternalores.util.recipes.util;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class EOAdvancementYeeter implements RecipeOutput {
    private final RecipeOutput delegate;

    public EOAdvancementYeeter(RecipeOutput delegate) {
        this.delegate = delegate;
    }

    @Override
    public void accept(@NotNull ResourceLocation location, @NotNull Recipe<?> recipe, @Nullable AdvancementHolder ignored) {
        delegate.accept(location, recipe, null);
    }

    @Override
    public void accept(@NotNull ResourceLocation location, @NotNull Recipe<?> recipe, @Nullable AdvancementHolder ignored, ICondition @NotNull [] conditions) {
        delegate.accept(location, recipe, null, conditions);
    }

    @Override
    public Advancement.@NotNull Builder advancement() {
        return Advancement.Builder.advancement();
    }
}
