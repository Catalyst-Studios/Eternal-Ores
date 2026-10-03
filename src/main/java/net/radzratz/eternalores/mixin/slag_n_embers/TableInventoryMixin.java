package net.radzratz.eternalores.mixin.slag_n_embers;

import dev.lopyluna.slag.content.blocks.table.TableInventory;
import dev.lopyluna.slag.register.AllDataComponents;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.item.tools.EOMolds;
import net.radzratz.eternalores.util.config.EOTweaksConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Pseudo
@Mixin(value = TableInventory.class, remap = false)
public class TableInventoryMixin {
    @Inject(
            method = "isItemValid",
            at = @At("HEAD"),
            cancellable = true
    )
    private void isItemValid(int slot, ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
        if (!EOTweaksConfig.CFG.EO_TWEAKS.slagTableTweaks.get()) return;
        if (slot != 1) return;
        if (stack.getItem() instanceof EOMolds && stack.has(AllDataComponents.CAST_TYPE)) {
            cir.setReturnValue(true);
        }
    }
}
