package net.radzratz.eternalores.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import org.jetbrains.annotations.NotNull;

import static net.neoforged.neoforge.client.model.generators.ModelProvider.TEXTURE;

@SuppressWarnings("all")
public class EternalBlockStateProvider extends BlockStateProvider
{
    private final ExistingFileHelper exFileHelper;

    public EternalBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, EternalOres.MOD_ID, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels()
    {
        //COMPRESSED BLOCKS
        blockWithItem(EternalGeneralBlocks.COBBLE_1);
        blockWithItem(EternalGeneralBlocks.COBBLE_2);
        blockWithItem(EternalGeneralBlocks.COBBLE_3);
        blockWithItem(EternalGeneralBlocks.COBBLE_4);
        blockWithItem(EternalGeneralBlocks.COBBLE_5);
        blockWithItem(EternalGeneralBlocks.COBBLE_6);
        blockWithItem(EternalGeneralBlocks.COBBLE_7);
        blockWithItem(EternalGeneralBlocks.COBBLE_8);
        blockWithItem(EternalGeneralBlocks.COBBLE_9);

        blockWithItem(EternalGeneralBlocks.SAND_1);
        blockWithItem(EternalGeneralBlocks.SAND_2);
        blockWithItem(EternalGeneralBlocks.SAND_3);
        blockWithItem(EternalGeneralBlocks.SAND_4);
        blockWithItem(EternalGeneralBlocks.SAND_5);
        blockWithItem(EternalGeneralBlocks.SAND_6);
        blockWithItem(EternalGeneralBlocks.SAND_7);
        blockWithItem(EternalGeneralBlocks.SAND_8);
        blockWithItem(EternalGeneralBlocks.SAND_9);

        blockWithItem(EternalGeneralBlocks.DIRT_1);
        blockWithItem(EternalGeneralBlocks.DIRT_2);
        blockWithItem(EternalGeneralBlocks.DIRT_3);
        blockWithItem(EternalGeneralBlocks.DIRT_4);
        blockWithItem(EternalGeneralBlocks.DIRT_5);
        blockWithItem(EternalGeneralBlocks.DIRT_6);
        blockWithItem(EternalGeneralBlocks.DIRT_7);
        blockWithItem(EternalGeneralBlocks.DIRT_8);
        blockWithItem(EternalGeneralBlocks.DIRT_9);

        blockWithItem(EternalGeneralBlocks.ANDESITE_1);
        blockWithItem(EternalGeneralBlocks.ANDESITE_2);
        blockWithItem(EternalGeneralBlocks.ANDESITE_3);
        blockWithItem(EternalGeneralBlocks.ANDESITE_4);
        blockWithItem(EternalGeneralBlocks.ANDESITE_5);
        blockWithItem(EternalGeneralBlocks.ANDESITE_6);
        blockWithItem(EternalGeneralBlocks.ANDESITE_7);
        blockWithItem(EternalGeneralBlocks.ANDESITE_8);
        blockWithItem(EternalGeneralBlocks.ANDESITE_9);

        blockWithItem(EternalGeneralBlocks.GRAVEL_1);
        blockWithItem(EternalGeneralBlocks.GRAVEL_2);
        blockWithItem(EternalGeneralBlocks.GRAVEL_3);
        blockWithItem(EternalGeneralBlocks.GRAVEL_4);
        blockWithItem(EternalGeneralBlocks.GRAVEL_5);
        blockWithItem(EternalGeneralBlocks.GRAVEL_6);
        blockWithItem(EternalGeneralBlocks.GRAVEL_7);
        blockWithItem(EternalGeneralBlocks.GRAVEL_8);
        blockWithItem(EternalGeneralBlocks.GRAVEL_9);

        blockWithItem(EternalGeneralBlocks.GRANITE_1);
        blockWithItem(EternalGeneralBlocks.GRANITE_2);
        blockWithItem(EternalGeneralBlocks.GRANITE_3);
        blockWithItem(EternalGeneralBlocks.GRANITE_4);
        blockWithItem(EternalGeneralBlocks.GRANITE_5);
        blockWithItem(EternalGeneralBlocks.GRANITE_6);
        blockWithItem(EternalGeneralBlocks.GRANITE_7);
        blockWithItem(EternalGeneralBlocks.GRANITE_8);
        blockWithItem(EternalGeneralBlocks.GRANITE_9);

        blockWithItem(EternalGeneralBlocks.DIORITE_1);
        blockWithItem(EternalGeneralBlocks.DIORITE_2);
        blockWithItem(EternalGeneralBlocks.DIORITE_3);
        blockWithItem(EternalGeneralBlocks.DIORITE_4);
        blockWithItem(EternalGeneralBlocks.DIORITE_5);
        blockWithItem(EternalGeneralBlocks.DIORITE_6);
        blockWithItem(EternalGeneralBlocks.DIORITE_7);
        blockWithItem(EternalGeneralBlocks.DIORITE_8);
        blockWithItem(EternalGeneralBlocks.DIORITE_9);

        //METAL BLOCKS
        blockWithItem(EternalGeneralBlocks.ALUMINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRONZE_BLOCK);
        blockWithItem(EternalGeneralBlocks.COBALT_BLOCK);
        blockWithItem(EternalGeneralBlocks.CONSTANTAN_BLOCK);
        blockWithItem(EternalGeneralBlocks.ELECTRUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.ENDERIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.INVAR_BLOCK);
        blockWithItem(EternalGeneralBlocks.LEAD_BLOCK);
        blockWithItem(EternalGeneralBlocks.LUMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.NICKEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.OSMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PLATINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PLUTONIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.TIN_BLOCK);
        blockWithItem(EternalGeneralBlocks.SIGNALUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.URANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.GRAPHITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRASS_BLOCK);
        blockWithItem(EternalGeneralBlocks.ZINC_BLOCK);
        blockWithItem(EternalGeneralBlocks.STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.BLUE_STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.GALLIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.TITANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PEWTER_BLOCK);
        blockWithItem(EternalGeneralBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.IRIDIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.CAST_IRON_BLOCK);
        blockWithItem(EternalGeneralBlocks.URANINITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.CAST_STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.WROUGHT_IRON_BLOCK);
        blockWithItem(EternalGeneralBlocks.NETHERSTEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.SHADOWSTEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.PIG_IRON_BLOCK);

        //GEM BLOCKS
        blockWithItem(EternalGeneralBlocks.SAPPHIRE_BLOCK);
        blockWithItem(EternalGeneralBlocks.FLUORITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.APATITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.CINNABAR_BLOCK);
        blockWithItem(EternalGeneralBlocks.AMBER_BLOCK);
        blockWithItem(EternalGeneralBlocks.NITER_BLOCK);
        blockWithItem(EternalGeneralBlocks.RUBY_BLOCK);
        blockWithItem(EternalGeneralBlocks.ONYX_BLOCK);
        blockWithItem(EternalGeneralBlocks.PERIDOT_BLOCK);
        blockWithItem(EternalGeneralBlocks.NECROTICARITE_BLOCK);

        //MISC BLOCKS
        blockWithItem(EternalGeneralBlocks.NETHER_STAR_BLOCK);

        //RAW BLOCKS
        blockWithItem(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_COBALT_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_LEAD_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.SULFUR_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_TIN_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_URANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_ZINC_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_GALLIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_URANINITE_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
        //COBALT
        blockWithItem(EternalGeneralBlocks.COBALT_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
        //LEAD
        blockWithItem(EternalGeneralBlocks.LEAD_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        //NICKEL
        blockWithItem(EternalGeneralBlocks.NICKEL_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
        //OSMIUM
        blockWithItem(EternalGeneralBlocks.OSMIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
        //PLATINUM
        blockWithItem(EternalGeneralBlocks.PLATINUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
        //PLUTONIUM
        blockWithItem(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
        //SULFUR
        blockWithItem(EternalGeneralBlocks.SULFUR_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
        //TIN
        blockWithItem(EternalGeneralBlocks.TIN_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK);
        //URANIUM
        blockWithItem(EternalGeneralBlocks.URANIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
        //SILVER
        blockWithItem(EternalGeneralBlocks.SILVER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
        //ZINC
        blockWithItem(EternalGeneralBlocks.ZINC_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
        //GALLIUM
        blockWithItem(EternalGeneralBlocks.GALLIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);
        //IRIDIUM
        blockWithItem(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK);
        //URANINITE
        blockWithItem(EternalGeneralBlocks.URANINITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK);

        //GEMS
        //FLUORITE
        blockWithItem(EternalGeneralBlocks.FLUORITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
        //SAPPHIRE
        blockWithItem(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        //APATITE
        blockWithItem(EternalGeneralBlocks.APATITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
        //CINNABAR
        blockWithItem(EternalGeneralBlocks.CINNABAR_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
        //AMBER
        blockWithItem(EternalGeneralBlocks.AMBER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
        //ONYX
        blockWithItem(EternalGeneralBlocks.ONYX_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
        //NITER
        blockWithItem(EternalGeneralBlocks.NITER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK);
        //RUBY
        blockWithItem(EternalGeneralBlocks.RUBY_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        //PERIDOT
        blockWithItem(EternalGeneralBlocks.PERIDOT_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
        //OBSIDIAN
        blockWithItem(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK);
        //NECROTICARITE
        blockWithItem(EternalGeneralBlocks.NECROTICARITE_ORE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock)
    {
        Block block = deferredBlock.get();
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);
        BlockModelBuilder model = basicBlock(id);
        simpleBlockWithItem(block, model);
    }

    public @NotNull BlockModelBuilder basicBlock(ResourceLocation block)
    {
        String blockName = block.getPath();
        String basePath = "block/";

        String[] possiblePaths =
                {
                basePath + blockName,
                basePath + "metal/" + blockName,
                basePath + "gem/" + blockName,
                basePath + "compressed/" + blockName,
                basePath + "ore_stone/" + blockName,
                basePath + "ore_deepslate/" + blockName,
                basePath + "ore_nether/" + blockName,
                basePath + "ore_end/" + blockName,
                basePath + "raw_ore_block/" + blockName,
                basePath + "misc/" + blockName,
                basePath + "blast_furnace/" + blockName,
                basePath + "smoker/" + blockName,
                basePath + "furnace/" + blockName
        };

        BlockModelBuilder builder = null;

        for(String path : possiblePaths)
        {
            if(     blockName.contains("furnace") ||
                    blockName.contains("smoker") ||
                    blockName.contains("blast_furnace")
              )
            {
                return createFurnaceModel(block);
            }

            ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(block.getNamespace(), path);
            if(exFileHelper.exists(texture, TEXTURE))
            {
                builder = this.models().getBuilder(block.toString())
                        .parent(new ModelFile.UncheckedModelFile("block/cube_all"))
                        .texture("all", texture);
                break;
            }
        }

        if(builder == null)
        {
            ResourceLocation fallback = ResourceLocation.fromNamespaceAndPath(block.getNamespace(), basePath + blockName);
            builder = this.models().getBuilder(block.toString())
                    .parent(new ModelFile.UncheckedModelFile("block/cube_all"))
                    .texture("all", fallback);
        }

        return builder;
    }

    private BlockModelBuilder createFurnaceModel(ResourceLocation block)
    {
        String blockName = block.getPath();
        return models().getBuilder(block.toString())
                .parent(new ModelFile.UncheckedModelFile("block/orientable"))
                .texture("front", ResourceLocation.fromNamespaceAndPath(block.getNamespace(), "block/" + blockName + "_front"))
                .texture("side", ResourceLocation.fromNamespaceAndPath(block.getNamespace(), "block/" + blockName + "_side"))
                .texture("top", ResourceLocation.fromNamespaceAndPath(block.getNamespace(), "block/" + blockName + "_top"));
    }
}
