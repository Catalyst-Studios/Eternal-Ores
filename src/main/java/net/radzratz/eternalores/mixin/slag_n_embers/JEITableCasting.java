package net.radzratz.eternalores.mixin.slag_n_embers;

import dev.lopyluna.slag.content.blocks.table.TableCastingRecipe;
import dev.lopyluna.slag.content.jei.category.TableCastingCategory;
import dev.lopyluna.slag.register.AllTags;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.recipe.IFocusGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.radzratz.eternalores.util.compat.slag_n_embers.SlagTable;
import net.radzratz.eternalores.util.config.EOTweaksConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import java.util.ArrayList;
import java.util.Set;

@Pseudo
@Mixin(value = TableCastingCategory.class, remap = false)
public class JEITableCasting {
    private static final Set<TagKey<Item>> NATIVE_SLAG_CASTS = Set.of(
            AllTags.CAST_AXE_HEADS, AllTags.CAST_BALLS, AllTags.CAST_BOOTS,
            AllTags.CAST_CHESTPLATES, AllTags.CAST_DUSTS, AllTags.CAST_GEMS,
            AllTags.CAST_GUARDS, AllTags.CAST_HELMETS, AllTags.CAST_HOE_HEADS,
            AllTags.CAST_INGOTS, AllTags.CAST_LEGGINGS, AllTags.CAST_NUGGETS,
            AllTags.CAST_PICKAXE_HEADS, AllTags.CAST_PLATES, AllTags.CAST_RODS,
            AllTags.CAST_SHOVEL_HEADS, AllTags.CAST_SWORD_BLADES
    );

    @ModifyVariable(
            method = "setRecipe",
            at = @At(
                    value = "INVOKE",
                    target = "Lmezz/jei/api/gui/builder/IRecipeLayoutBuilder;addSlot(Lmezz/jei/api/recipe/RecipeIngredientRole;II)Lmezz/jei/api/gui/builder/IRecipeSlotBuilder;"
            ),
            ordinal = 0
    )
    private ArrayList<ItemStack> getRecipesByMold(ArrayList<ItemStack> moldList, IRecipeLayoutBuilder builder, RecipeHolder<TableCastingRecipe> holder, IFocusGroup group) {
        if (!EOTweaksConfig.CFG.EO_TWEAKS.slagTableTweaks.get()) return moldList;
        TagKey<Item> castType = holder.value().getCastType();
        if (castType == null) return moldList;

        if (!NATIVE_SLAG_CASTS.contains(castType)) {
            moldList.clear();
        }

        for (Item mold : SlagTable.getMoldsFor(castType)) {
            moldList.add(new ItemStack(mold));
        }
        return moldList;
    }
}
