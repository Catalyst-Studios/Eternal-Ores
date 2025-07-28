package net.radzratz.eternalores.datagen.recipes;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.neoforged.neoforge.common.conditions.ICondition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Forgive me Father as I have sinned...
 * <p>
 * {@link EOAdvancementYeeter} is pretty much a normal {@link RecipeOutput}, its only purpose is
 * to prevent the advancements from generating.
 * <p>
 * It is required and necessary to pass every single recipe with its .unlockedBy parameter to prevent our
 * lovely DataGen from throwing an exception... But this applies the yeetus yayeekity to the advancements.
 * <p>
 * One Last Thing; There were around 1300'ish files generating from these recipes... and I sincerely hope
 * they enable something to "load" our lovely recipes without them advancements.
 */
public class EOAdvancementYeeter implements RecipeOutput
{
    private final RecipeOutput delegate;

    public EOAdvancementYeeter(RecipeOutput delegate) { this.delegate = delegate; }

    @Override
    public void accept(@NotNull ResourceLocation location, @NotNull Recipe<?> recipe, @Nullable AdvancementHolder ignored)
    {
        delegate.accept(location, recipe, null);
    }

    @Override
    public void accept(@NotNull ResourceLocation location, @NotNull Recipe<?> recipe, @Nullable AdvancementHolder ignored, ICondition @NotNull [] conditions)
    {
        delegate.accept(location, recipe, null, conditions);
    }

    @Override
    public Advancement.@NotNull Builder advancement() { return Advancement.Builder.advancement(); }
}
