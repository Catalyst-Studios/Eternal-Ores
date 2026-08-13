package net.radzratz.eternalores.util.compat.curios;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import top.theillusivec4.curios.api.CuriosDataProvider;
import top.theillusivec4.curios.api.type.capability.ICurio;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOUtils.*;

public class EOCuriosDatagen extends CuriosDataProvider {
    public EOCuriosDatagen(PackOutput output, ExistingFileHelper fileHelper, CompletableFuture<HolderLookup.Provider> registries) {
        super(EternalOres.id, output, fileHelper, registries);
    }

    @Override
    public void generate(HolderLookup.Provider registries, ExistingFileHelper fileHelper) {
        this.createSlot("prospector")
                .size(1)
                .order(50)
                .icon(EO("item/prospector_slot"))
                .dropRule(ICurio.DropRule.ALWAYS_DROP)
                .addValidator(CURIO("tag"));

        this.createEntities("prospector")
                .addPlayer()
                .addCondition(CURIOS_MOD)
                .addSlots("prospector");
    }
}
