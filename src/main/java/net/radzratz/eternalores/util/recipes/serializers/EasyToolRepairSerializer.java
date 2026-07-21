package net.radzratz.eternalores.util.recipes.serializers;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.radzratz.eternalores.util.recipes.types.EasyToolRepair;
import org.jetbrains.annotations.NotNull;

public class EasyToolRepairSerializer implements RecipeSerializer<EasyToolRepair> {
    private static final EasyToolRepair INSTANCE = new EasyToolRepair(CraftingBookCategory.MISC);

    public static final MapCodec<EasyToolRepair> CODEC = MapCodec.unit(INSTANCE);

    public static final StreamCodec<RegistryFriendlyByteBuf, EasyToolRepair> STREAM_CODEC = StreamCodec.unit(INSTANCE);

    @Override
    public @NotNull MapCodec<EasyToolRepair> codec() {
        return CODEC;
    }

    @Override
    public @NotNull StreamCodec<RegistryFriendlyByteBuf, EasyToolRepair> streamCodec() {
        return STREAM_CODEC;
    }
}
