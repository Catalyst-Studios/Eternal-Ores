package net.radzratz.eternalores.util.compat.mekanism.conditions;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import mekanism.api.MekanismAPI;
import mekanism.api.chemical.Chemical;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical;
import org.jetbrains.annotations.NotNull;

import static net.radzratz.eternalores.util.EOUtils.EO;

public record EOChemicalCondition(ResourceLocation chemicalId) implements ICondition {
    public static final MapCodec<EOChemicalCondition> CODEC = RecordCodecBuilder.mapCodec(inst ->
            inst.group(ResourceLocation.CODEC.fieldOf("chemical").forGetter(EOChemicalCondition::chemicalId)
            ).apply(inst, EOChemicalCondition::new)
    );

    @Override
    public boolean test(@NotNull IContext ctx) {
        Chemical chemical = MekanismAPI.CHEMICAL_REGISTRY.get(chemicalId);
        if (chemical instanceof EOChemical eoChemical) {
            return eoChemical.isEnabled();
        }
        return true;
    }

    @Override
    public @NotNull MapCodec<? extends ICondition> codec() {
        return CODEC;
    }

    public static @NotNull ICondition getCondition(String name) {
        return new EOChemicalCondition(EO(name));
    }
}
