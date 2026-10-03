package net.radzratz.eternalores.mixin.slag_n_embers;

import dev.lopyluna.slag.content.blocks.table.TableBE;
import dev.lopyluna.slag.register.AllDataComponents;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.item.tools.EOMolds;
import net.radzratz.eternalores.util.config.EOTweaksConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Pseudo
@Mixin(value = TableBE.class, remap = false)
public abstract class TableBEMixin {
    @Inject(
            method = "store",
            at = @At("HEAD"),
            cancellable = true
    )
    private void onStore(ItemStack stack, CallbackInfo cir) {
        if (!EOTweaksConfig.CFG.EO_TWEAKS.slagTableTweaks.get()) return;

        var itemInventory = ((CastingBEAccessor) this).getItemInventory();

        if (stack.getItem() instanceof EOMolds && stack.has(AllDataComponents.CAST_TYPE) && itemInventory.getItem(1).isEmpty()) {
            itemInventory.setItem(1, stack);
            cir.cancel();
        }
    }
}
