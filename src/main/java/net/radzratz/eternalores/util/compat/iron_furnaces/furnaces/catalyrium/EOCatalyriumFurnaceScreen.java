package net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.catalyrium;

import ironfurnaces.gui.furnaces.BlockIronFurnaceScreenBase;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

public class EOCatalyriumFurnaceScreen extends BlockIronFurnaceScreenBase<EOCatalyriumFurnaceContainer>  {
    public EOCatalyriumFurnaceScreen(EOCatalyriumFurnaceContainer furnaceContainer, Inventory inv, Component name) {
        super(furnaceContainer, inv, name);
        this.GUI = GUI_NETHERITE;
    }
}
