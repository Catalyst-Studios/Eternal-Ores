package net.radzratz.eternalores.mixin.slag_n_embers;

import dev.lopyluna.slag.content.blocks.casting.CastingBE;
import dev.lopyluna.slag.content.blocks.casting.CastingInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.gen.Accessor;

@Pseudo
@Mixin(value = CastingBE.class, remap = false)
public interface CastingBEAccessor {
    @Accessor("itemInventory")
    CastingInventory getItemInventory();
}