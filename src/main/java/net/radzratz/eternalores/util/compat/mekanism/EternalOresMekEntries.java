package net.radzratz.eternalores.util.compat.mekanism;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.PurificationRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.CrushingRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.EnrichingRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.InjectorRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.tags.EternalOresItemMekTags;
import net.radzratz.eternalores.util.tags.item.ores.EternalOreBlockItemTags;
import net.radzratz.eternalores.util.tags.item.plates.EternalPlates;
import net.radzratz.eternalores.util.tags.item.raw_materials.EternalRawMaterialTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMiscRodsTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EternalStorageRawOreBlockItemTags;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class EternalOresMekEntries
{
    ///
    /// Material Set/Clump -> Dirty Dust List
    ///
    public static final Map<String, CrushingRecipeType.Inputs> DIRTY_DUST_ENTRIES = Map.of(
            "aluminum", new CrushingRecipeType.Inputs(
                    EternalOresMekanismCompat.ALUMINUM_CLUMP.get(),
                    EternalOresMekanismCompat.ALUMINUM_DIRTY_DUST.get()
            )
    );

    ///
    /// Material Set Plates/Rods -> Dust
    ///
    public static final Map<String, CrushingRecipeType.InputsDeconstruction> DUST_DECONSTRUCTION_ENTRIES;
    static
    {
        Map<String, CrushingRecipeType.InputsDeconstruction> map = new HashMap<>();

        registerDecoRecipes(map, "aluminum",
                EternalPlates.Items.ALUMINUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ALUMINUM,
                EternalGeneralItems.ALUMINUM_DUST);

        registerDecoRecipes(map, "blue_steel",
                EternalPlates.Items.BLUE_STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_BLUE_STEEL,
                EternalGeneralItems.BLUE_STEEL_DUST);

        registerDecoRecipes(map, "brass",
                EternalPlates.Items.BRASS_PLATE,
                EternalMetalRodsTags.Items.ROD_BRASS,
                EternalGeneralItems.BRASS_DUST);

        registerDecoRecipes(map, "bronze",
                EternalPlates.Items.BRONZE_PLATE,
                EternalMetalRodsTags.Items.ROD_BRONZE,
                EternalGeneralItems.BRONZE_DUST);

        registerDecoRecipes(map, "catalyrium",
                EternalPlates.Items.CATALYRIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_CATALYRIUM,
                EternalGeneralItems.CATALYRIUM_DUST);

        registerDecoRecipes(map, "cast_iron",
                EternalPlates.Items.CAST_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_CAST_IRON,
                EternalGeneralItems.CAST_IRON_DUST);

        registerDecoRecipes(map, "cast_steel",
                EternalPlates.Items.CAST_STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_CAST_STEEL,
                EternalGeneralItems.CAST_STEEL_DUST);

        registerDecoRecipes(map, "cobalt",
                EternalPlates.Items.COBALT_PLATE,
                EternalMetalRodsTags.Items.ROD_COBALT,
                EternalGeneralItems.COBALT_DUST);

        registerDecoRecipes(map, "constantan",
                EternalPlates.Items.CONSTANTAN_PLATE,
                EternalMetalRodsTags.Items.ROD_CONSTANTAN,
                EternalGeneralItems.CONSTANTAN_DUST);

        registerDecoRecipes(map, "copper",
                EternalPlates.Items.COPPER_PLATE,
                EternalMetalRodsTags.Items.ROD_COPPER,
                EternalGeneralItems.COPPER_DUST);

        registerDecoRecipes(map, "diamond",
                EternalPlates.Items.DIAMOND_PLATE,
                EternalGemRodsTags.Items.ROD_DIAMOND,
                EternalGeneralItems.DIAMOND_DUST);

        registerDecoRecipes(map, "electrum",
                EternalPlates.Items.ELECTRUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ELECTRUM,
                EternalGeneralItems.ELECTRUM_DUST);

        registerDecoRecipes(map, "enderium",
                EternalPlates.Items.ENDERIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ENDERIUM,
                EternalGeneralItems.ENDERIUM_DUST);

        registerDecoRecipes(map, "gallium",
                EternalPlates.Items.GALLIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_GALLIUM,
                EternalGeneralItems.GALLIUM_DUST);

        registerDecoRecipes(map, "gold",
                EternalPlates.Items.GOLD_PLATE,
                EternalMetalRodsTags.Items.ROD_GOLD,
                EternalGeneralItems.GOLD_DUST);

        registerDecoRecipes(map, "copper",
                EternalPlates.Items.COPPER_PLATE,
                EternalMetalRodsTags.Items.ROD_COPPER,
                EternalGeneralItems.COPPER_DUST);

        registerDecoRecipes(map, "graphite",
                EternalPlates.Items.GRAPHITE_PLATE,
                EternalMiscRodsTags.Items.ROD_GRAPHITE,
                EternalGeneralItems.GRAPHITE_DUST);

        registerDecoRecipes(map, "invar",
                EternalPlates.Items.INVAR_PLATE,
                EternalMetalRodsTags.Items.ROD_INVAR,
                EternalGeneralItems.INVAR_DUST);

        registerDecoRecipes(map, "iridium",
                EternalPlates.Items.IRIDIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_IRIDIUM,
                EternalGeneralItems.IRIDIUM_DUST);

        registerDecoRecipes(map, "iron",
                EternalPlates.Items.IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_IRON,
                EternalGeneralItems.IRON_DUST);

        registerDecoRecipes(map, "lead",
                EternalPlates.Items.LEAD_PLATE,
                EternalMetalRodsTags.Items.ROD_LEAD,
                EternalGeneralItems.LEAD_DUST);

        registerDecoRecipes(map, "lumium",
                EternalPlates.Items.LUMIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_LUMIUM,
                EternalGeneralItems.LUMIUM_DUST);

        registerDecoRecipes(map, "necroticarite",
                EternalPlates.Items.NECROTICARITE_PLATE,
                EternalGemRodsTags.Items.ROD_NECROTICARITE,
                EternalGeneralItems.NECROTICARITE_DUST);

        registerDecoRecipes(map, "netherite",
                EternalPlates.Items.NETHERITE_PLATE,
                EternalMetalRodsTags.Items.ROD_NETHERITE,
                EternalGeneralItems.NETHERITE_DUST);

        registerDecoRecipes(map, "nethersteel",
                EternalPlates.Items.NETHERSTEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_NETHERSTEEL,
                EternalGeneralItems.NETHERSTEEL_DUST);

        registerDecoRecipes(map, "nickel",
                EternalPlates.Items.NICKEL_PLATE,
                EternalMetalRodsTags.Items.ROD_NICKEL,
                EternalGeneralItems.NICKEL_DUST);

        registerDecoRecipes(map, "osmium",
                EternalPlates.Items.OSMIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_OSMIUM,
                EternalGeneralItems.OSMIUM_DUST);

        registerDecoRecipes(map, "pig_iron",
                EternalPlates.Items.PIG_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_PIG_IRON,
                EternalGeneralItems.PIG_IRON_DUST);

        registerDecoRecipes(map, "platinum",
                EternalPlates.Items.PLATINUM_PLATE,
                EternalMetalRodsTags.Items.ROD_PLATINUM,
                EternalGeneralItems.PLATINUM_DUST);

        registerDecoRecipes(map, "plutonium",
                EternalPlates.Items.PLUTONIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_PLUTONIUM,
                EternalGeneralItems.PLUTONIUM_DUST);

        registerDecoRecipes(map, "rose_gold",
                EternalPlates.Items.ROSE_GOLD_PLATE,
                EternalMetalRodsTags.Items.ROD_ROSE_GOLD,
                EternalGeneralItems.ROSE_GOLD_DUST);

        registerDecoRecipes(map, "sapphire",
                EternalPlates.Items.SAPPHIRE_PLATE,
                EternalGemRodsTags.Items.ROD_SAPPHIRE,
                EternalGeneralItems.SAPPHIRE_DUST);

        registerDecoRecipes(map, "signalum",
                EternalPlates.Items.SIGNALUM_PLATE,
                EternalMetalRodsTags.Items.ROD_SIGNALUM,
                EternalGeneralItems.SIGNALUM_DUST);

        registerDecoRecipes(map, "silver",
                EternalPlates.Items.SILVER_PLATE,
                EternalMetalRodsTags.Items.ROD_SILVER,
                EternalGeneralItems.SILVER_DUST);

        registerDecoRecipes(map, "shadowsteel",
                EternalPlates.Items.SHADOWSTEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_SHADOWSTEEL,
                EternalGeneralItems.SHADOWSTEEL_DUST);

        registerDecoRecipes(map, "steel",
                EternalPlates.Items.STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_STEEL,
                EternalGeneralItems.STEEL_DUST);

        registerDecoRecipes(map, "tin",
                EternalPlates.Items.TIN_PLATE,
                EternalMetalRodsTags.Items.ROD_TIN,
                EternalGeneralItems.TIN_DUST);

        registerDecoRecipes(map, "titanium",
                EternalPlates.Items.TITANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_TITANIUM,
                EternalGeneralItems.TITANIUM_DUST);

        registerDecoRecipes(map, "ultimatitanium",
                EternalPlates.Items.ULTIMATITANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ULTIMATITANIUM,
                EternalGeneralItems.ULTIMATITANIUM_DUST);

        registerDecoRecipes(map, "uranium",
                EternalPlates.Items.URANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_URANIUM,
                EternalGeneralItems.URANIUM_DUST);

        registerDecoRecipes(map, "wrought_iron",
                EternalPlates.Items.WROUGHT_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_WROUGHT_IRON,
                EternalGeneralItems.WROUGHT_IRON_DUST);

        registerDecoRecipes(map, "zinc",
                EternalPlates.Items.ZINC_PLATE,
                EternalMetalRodsTags.Items.ROD_ZINC,
                EternalGeneralItems.ZINC_DUST);

        DUST_DECONSTRUCTION_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Dirty Dust -> Dust
    ///
    public static final Map<String, EnrichingRecipeType.Inputs> DUST_ENTRIES = Map.of(
            "aluminum", new EnrichingRecipeType.Inputs(
                    EternalRawMaterialTags.RAW_ALUMINUM,
                    EternalOresItemMekTags.Items.DIRTY_ALUMINUM_C,
                    EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                    EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                    EternalGeneralItems.ALUMINUM_DUST.get()
            )
    );

    ///
    /// Material Set/Shard -> Clump
    ///
    public static final Map<String, PurificationRecipeType.Inputs> CLUMP_ENTRIES = Map.of(
            "aluminum", new PurificationRecipeType.Inputs(
                    EternalRawMaterialTags.RAW_ALUMINUM,
                    EternalOresItemMekTags.Items.SHARD_ALUMINUM_C,
                    EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                    EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                    EternalOresMekanismCompat.ALUMINUM_CLUMP.get()
            )
    );

    ///
    /// Material Set/Crystal -> Shard
    ///
    public static final Map<String, InjectorRecipeType.Inputs> SHARD_ENTRIES = Map.of(
            "aluminum", new InjectorRecipeType.Inputs(
                    EternalRawMaterialTags.RAW_ALUMINUM,
                    EternalOresItemMekTags.Items.CRYSTAL_ALUMINUM_C,
                    EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                    EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                    EternalOresMekanismCompat.ALUMINUM_SHARD.get()
            )
    );

    private static void registerDecoRecipes(Map<String, CrushingRecipeType.InputsDeconstruction> map,
                                            String name,
                                            TagKey<Item> plateTag,
                                            TagKey<Item> rodTag,
                                            Supplier<Item> dustSupplier)
    {
        map.put(name, new CrushingRecipeType.InputsDeconstruction(
                plateTag,
                rodTag,
                dustSupplier.get()
        ));
    }
}
