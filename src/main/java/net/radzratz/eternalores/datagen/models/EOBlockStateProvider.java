package net.radzratz.eternalores.datagen.models;

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
import net.radzratz.eternalores.block.EOBlocks;
import org.jetbrains.annotations.NotNull;

import static net.neoforged.neoforge.client.model.generators.ModelProvider.TEXTURE;

@SuppressWarnings("all")
public class EOBlockStateProvider extends BlockStateProvider
{
    private final ExistingFileHelper exFileHelper;

    public EOBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, EternalOres.MOD_ID, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels()
    {
        //COMPRESSED BLOCKS
        blockWithItem(EOBlocks.COBBLE_1);
        blockWithItem(EOBlocks.COBBLE_2);
        blockWithItem(EOBlocks.COBBLE_3);
        blockWithItem(EOBlocks.COBBLE_4);
        blockWithItem(EOBlocks.COBBLE_5);
        blockWithItem(EOBlocks.COBBLE_6);
        blockWithItem(EOBlocks.COBBLE_7);
        blockWithItem(EOBlocks.COBBLE_8);
        blockWithItem(EOBlocks.COBBLE_9);

        blockWithItem(EOBlocks.SAND_1);
        blockWithItem(EOBlocks.SAND_2);
        blockWithItem(EOBlocks.SAND_3);
        blockWithItem(EOBlocks.SAND_4);
        blockWithItem(EOBlocks.SAND_5);
        blockWithItem(EOBlocks.SAND_6);
        blockWithItem(EOBlocks.SAND_7);
        blockWithItem(EOBlocks.SAND_8);
        blockWithItem(EOBlocks.SAND_9);

        blockWithItem(EOBlocks.DIRT_1);
        blockWithItem(EOBlocks.DIRT_2);
        blockWithItem(EOBlocks.DIRT_3);
        blockWithItem(EOBlocks.DIRT_4);
        blockWithItem(EOBlocks.DIRT_5);
        blockWithItem(EOBlocks.DIRT_6);
        blockWithItem(EOBlocks.DIRT_7);
        blockWithItem(EOBlocks.DIRT_8);
        blockWithItem(EOBlocks.DIRT_9);

        blockWithItem(EOBlocks.ANDESITE_1);
        blockWithItem(EOBlocks.ANDESITE_2);
        blockWithItem(EOBlocks.ANDESITE_3);
        blockWithItem(EOBlocks.ANDESITE_4);
        blockWithItem(EOBlocks.ANDESITE_5);
        blockWithItem(EOBlocks.ANDESITE_6);
        blockWithItem(EOBlocks.ANDESITE_7);
        blockWithItem(EOBlocks.ANDESITE_8);
        blockWithItem(EOBlocks.ANDESITE_9);

        blockWithItem(EOBlocks.GRAVEL_1);
        blockWithItem(EOBlocks.GRAVEL_2);
        blockWithItem(EOBlocks.GRAVEL_3);
        blockWithItem(EOBlocks.GRAVEL_4);
        blockWithItem(EOBlocks.GRAVEL_5);
        blockWithItem(EOBlocks.GRAVEL_6);
        blockWithItem(EOBlocks.GRAVEL_7);
        blockWithItem(EOBlocks.GRAVEL_8);
        blockWithItem(EOBlocks.GRAVEL_9);

        blockWithItem(EOBlocks.GRANITE_1);
        blockWithItem(EOBlocks.GRANITE_2);
        blockWithItem(EOBlocks.GRANITE_3);
        blockWithItem(EOBlocks.GRANITE_4);
        blockWithItem(EOBlocks.GRANITE_5);
        blockWithItem(EOBlocks.GRANITE_6);
        blockWithItem(EOBlocks.GRANITE_7);
        blockWithItem(EOBlocks.GRANITE_8);
        blockWithItem(EOBlocks.GRANITE_9);

        blockWithItem(EOBlocks.DIORITE_1);
        blockWithItem(EOBlocks.DIORITE_2);
        blockWithItem(EOBlocks.DIORITE_3);
        blockWithItem(EOBlocks.DIORITE_4);
        blockWithItem(EOBlocks.DIORITE_5);
        blockWithItem(EOBlocks.DIORITE_6);
        blockWithItem(EOBlocks.DIORITE_7);
        blockWithItem(EOBlocks.DIORITE_8);
        blockWithItem(EOBlocks.DIORITE_9);

        //METAL BLOCKS
        blockWithItem(EOBlocks.ALUMINUM_BLOCK);
        blockWithItem(EOBlocks.ARDITE_BLOCK);
        blockWithItem(EOBlocks.BRONZE_BLOCK);
        blockWithItem(EOBlocks.CATALYRIUM_BLOCK);
        blockWithItem(EOBlocks.COBALT_BLOCK);
        blockWithItem(EOBlocks.CONSTANTAN_BLOCK);
        blockWithItem(EOBlocks.ELECTRUM_BLOCK);
        blockWithItem(EOBlocks.ENDERIUM_BLOCK);
        blockWithItem(EOBlocks.INVAR_BLOCK);
        blockWithItem(EOBlocks.LEAD_BLOCK);
        blockWithItem(EOBlocks.LUMIUM_BLOCK);
        blockWithItem(EOBlocks.NICKEL_BLOCK);
        blockWithItem(EOBlocks.OSMIUM_BLOCK);
        blockWithItem(EOBlocks.PLATINUM_BLOCK);
        blockWithItem(EOBlocks.PLUTONIUM_BLOCK);
        blockWithItem(EOBlocks.TIN_BLOCK);
        blockWithItem(EOBlocks.SIGNALUM_BLOCK);
        blockWithItem(EOBlocks.URANIUM_BLOCK);
        blockWithItem(EOBlocks.ULTIMATITANIUM_BLOCK);
        blockWithItem(EOBlocks.SILVER_BLOCK);
        blockWithItem(EOBlocks.GRAPHITE_BLOCK);
        blockWithItem(EOBlocks.BRASS_BLOCK);
        blockWithItem(EOBlocks.ZINC_BLOCK);
        blockWithItem(EOBlocks.STEEL_BLOCK);
        blockWithItem(EOBlocks.BLUE_STEEL_BLOCK);
        blockWithItem(EOBlocks.GALLIUM_BLOCK);
        blockWithItem(EOBlocks.TITANIUM_BLOCK);
        blockWithItem(EOBlocks.PEWTER_BLOCK);
        blockWithItem(EOBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(EOBlocks.BRITANNIA_SILVER_BLOCK);
        blockWithItem(EOBlocks.IRIDIUM_BLOCK);
        blockWithItem(EOBlocks.CAST_IRON_BLOCK);
        blockWithItem(EOBlocks.URANINITE_BLOCK);
        blockWithItem(EOBlocks.CAST_STEEL_BLOCK);
        blockWithItem(EOBlocks.WROUGHT_IRON_BLOCK);
        blockWithItem(EOBlocks.NETHERSTEEL_BLOCK);
        blockWithItem(EOBlocks.SHADOWSTEEL_BLOCK);
        blockWithItem(EOBlocks.PIG_IRON_BLOCK);

        //GEM BLOCKS
        blockWithItem(EOBlocks.SAPPHIRE_BLOCK);
        blockWithItem(EOBlocks.FLUORITE_BLOCK);
        blockWithItem(EOBlocks.APATITE_BLOCK);
        blockWithItem(EOBlocks.CINNABAR_BLOCK);
        blockWithItem(EOBlocks.AMBER_BLOCK);
        blockWithItem(EOBlocks.NITER_BLOCK);
        blockWithItem(EOBlocks.RUBY_BLOCK);
        blockWithItem(EOBlocks.ONYX_BLOCK);
        blockWithItem(EOBlocks.PERIDOT_BLOCK);
        blockWithItem(EOBlocks.NECROTICARITE_BLOCK);

        //MISC BLOCKS
        blockWithItem(EOBlocks.NETHER_STAR_BLOCK);

        //RAW BLOCKS
        blockWithItem(EOBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(EOBlocks.RAW_ARDITE_BLOCK);
        blockWithItem(EOBlocks.RAW_CATALYRIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_COBALT_BLOCK);
        blockWithItem(EOBlocks.RAW_LEAD_BLOCK);
        blockWithItem(EOBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(EOBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(EOBlocks.RAW_PLUTONIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_SILVER_BLOCK);
        blockWithItem(EOBlocks.SULFUR_BLOCK);
        blockWithItem(EOBlocks.RAW_TIN_BLOCK);
        blockWithItem(EOBlocks.RAW_URANIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_ZINC_BLOCK);
        blockWithItem(EOBlocks.RAW_GALLIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_IRIDIUM_BLOCK);
        blockWithItem(EOBlocks.RAW_URANINITE_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(EOBlocks.ALUMINUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
        //COBALT
        blockWithItem(EOBlocks.COBALT_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
        //LEAD
        blockWithItem(EOBlocks.LEAD_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        //NICKEL
        blockWithItem(EOBlocks.NICKEL_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
        //OSMIUM
        blockWithItem(EOBlocks.OSMIUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
        //PLATINUM
        blockWithItem(EOBlocks.PLATINUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
        //PLUTONIUM
        blockWithItem(EOBlocks.PLUTONIUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
        //SULFUR
        blockWithItem(EOBlocks.SULFUR_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
        //TIN
        blockWithItem(EOBlocks.TIN_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK);
        //URANIUM
        blockWithItem(EOBlocks.URANIUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
        //SILVER
        blockWithItem(EOBlocks.SILVER_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
        //ZINC
        blockWithItem(EOBlocks.ZINC_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
        //GALLIUM
        blockWithItem(EOBlocks.GALLIUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);
        //IRIDIUM
        blockWithItem(EOBlocks.IRIDIUM_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK);
        //URANINITE
        blockWithItem(EOBlocks.URANINITE_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK);

        //GEMS
        //FLUORITE
        blockWithItem(EOBlocks.FLUORITE_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
        //SAPPHIRE
        blockWithItem(EOBlocks.SAPPHIRE_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        //APATITE
        blockWithItem(EOBlocks.APATITE_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
        //CINNABAR
        blockWithItem(EOBlocks.CINNABAR_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
        //AMBER
        blockWithItem(EOBlocks.AMBER_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
        //ONYX
        blockWithItem(EOBlocks.ONYX_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
        //NITER
        blockWithItem(EOBlocks.NITER_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK);
        //RUBY
        blockWithItem(EOBlocks.RUBY_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        //PERIDOT
        blockWithItem(EOBlocks.PERIDOT_ORE_BLOCK);
        blockWithItem(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
        //OBSIDIAN
        blockWithItem(EOBlocks.OBSIDIAN_ORE_BLOCK);
        //NECROTICARITE
        blockWithItem(EOBlocks.NECROTICARITE_ORE_BLOCK);
        //ARDITE
        blockWithItem(EOBlocks.ARDITE_ORE_BLOCK);
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

    /// Can't remember when I added this and for what purpose LMAO
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
