package net.radzratz.eternalores.util.compat.curios;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.radzratz.eternalores.item.special.prospectors.EOAdvProspector;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.prospectors.utils.EOProspectors;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICuriosItemHandler;

import java.util.Optional;

public class EOCurios {
    public static void register(RegisterCapabilitiesEvent event) {
        event.registerItem(
                CuriosCapability.ITEM,
                (stack, context) -> new ICurio() {
                    @Override
                    public ItemStack getStack() {
                        return stack;
                    }

                    @Override
                    public boolean canEquip(SlotContext slotContext) {
                        return slotContext.identifier().equals("prospector") || slotContext.identifier().equals("curio");
                    }
                },
                EOBasicProspector.PROSPECTOR.get(),
                EOAdvProspector.ADV_PROSPECTOR.get()
        );
    }

    public static Optional<ItemStack> findEquippedProspector(LivingEntity entity) {
        return CuriosApi.getCuriosInventory(entity)
                .map(ICuriosItemHandler::getEquippedCurios)
                .flatMap(handler -> {
                    for (int i = 0; i < handler.getSlots(); i++) {
                        ItemStack stack = handler.getStackInSlot(i);
                        if (stack.getItem() instanceof EOProspectors) {
                            return Optional.of(stack);
                        }
                    }
                    return Optional.empty();
                });
    }

    public static void handleCurioAction(ServerPlayer player, String action, BlockPos targetPos) {
        Optional<ItemStack> equipped = findEquippedProspector(player);
        if (equipped.isEmpty()) return;

        ItemStack stack = equipped.get();
        if (!(stack.getItem() instanceof EOProspectors prospector)) return;

        switch (action) {
            case "LINK" -> prospector.curioLink(player, stack, targetPos);
            case "UNLINK" -> prospector.curioUnlink(player, stack);
            case "USE" -> prospector.curioUse(player, stack);
            default -> {}
        }
    }
}