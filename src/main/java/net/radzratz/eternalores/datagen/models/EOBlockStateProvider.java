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
import net.radzratz.eternalores.block.EOBlockRegistry;
import org.jetbrains.annotations.NotNull;

import static net.neoforged.neoforge.client.model.generators.ModelProvider.TEXTURE;

@SuppressWarnings("all")
public class EOBlockStateProvider extends BlockStateProvider
{
    private final ExistingFileHelper exFileHelper;

    public EOBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper)
    {
        super(output, EternalOres.id, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels()
    {
        //COMPRESSED BLOCKS
        blockWithItem(EOBlockRegistry.COBBLE_1);
        blockWithItem(EOBlockRegistry.COBBLE_2);
        blockWithItem(EOBlockRegistry.COBBLE_3);
        blockWithItem(EOBlockRegistry.COBBLE_4);
        blockWithItem(EOBlockRegistry.COBBLE_5);
        blockWithItem(EOBlockRegistry.COBBLE_6);
        blockWithItem(EOBlockRegistry.COBBLE_7);
        blockWithItem(EOBlockRegistry.COBBLE_8);
        blockWithItem(EOBlockRegistry.COBBLE_9);

        blockWithItem(EOBlockRegistry.SAND_1);
        blockWithItem(EOBlockRegistry.SAND_2);
        blockWithItem(EOBlockRegistry.SAND_3);
        blockWithItem(EOBlockRegistry.SAND_4);
        blockWithItem(EOBlockRegistry.SAND_5);
        blockWithItem(EOBlockRegistry.SAND_6);
        blockWithItem(EOBlockRegistry.SAND_7);
        blockWithItem(EOBlockRegistry.SAND_8);
        blockWithItem(EOBlockRegistry.SAND_9);

        blockWithItem(EOBlockRegistry.DIRT_1);
        blockWithItem(EOBlockRegistry.DIRT_2);
        blockWithItem(EOBlockRegistry.DIRT_3);
        blockWithItem(EOBlockRegistry.DIRT_4);
        blockWithItem(EOBlockRegistry.DIRT_5);
        blockWithItem(EOBlockRegistry.DIRT_6);
        blockWithItem(EOBlockRegistry.DIRT_7);
        blockWithItem(EOBlockRegistry.DIRT_8);
        blockWithItem(EOBlockRegistry.DIRT_9);

        blockWithItem(EOBlockRegistry.ANDESITE_1);
        blockWithItem(EOBlockRegistry.ANDESITE_2);
        blockWithItem(EOBlockRegistry.ANDESITE_3);
        blockWithItem(EOBlockRegistry.ANDESITE_4);
        blockWithItem(EOBlockRegistry.ANDESITE_5);
        blockWithItem(EOBlockRegistry.ANDESITE_6);
        blockWithItem(EOBlockRegistry.ANDESITE_7);
        blockWithItem(EOBlockRegistry.ANDESITE_8);
        blockWithItem(EOBlockRegistry.ANDESITE_9);

        blockWithItem(EOBlockRegistry.GRAVEL_1);
        blockWithItem(EOBlockRegistry.GRAVEL_2);
        blockWithItem(EOBlockRegistry.GRAVEL_3);
        blockWithItem(EOBlockRegistry.GRAVEL_4);
        blockWithItem(EOBlockRegistry.GRAVEL_5);
        blockWithItem(EOBlockRegistry.GRAVEL_6);
        blockWithItem(EOBlockRegistry.GRAVEL_7);
        blockWithItem(EOBlockRegistry.GRAVEL_8);
        blockWithItem(EOBlockRegistry.GRAVEL_9);

        blockWithItem(EOBlockRegistry.GRANITE_1);
        blockWithItem(EOBlockRegistry.GRANITE_2);
        blockWithItem(EOBlockRegistry.GRANITE_3);
        blockWithItem(EOBlockRegistry.GRANITE_4);
        blockWithItem(EOBlockRegistry.GRANITE_5);
        blockWithItem(EOBlockRegistry.GRANITE_6);
        blockWithItem(EOBlockRegistry.GRANITE_7);
        blockWithItem(EOBlockRegistry.GRANITE_8);
        blockWithItem(EOBlockRegistry.GRANITE_9);

        blockWithItem(EOBlockRegistry.DIORITE_1);
        blockWithItem(EOBlockRegistry.DIORITE_2);
        blockWithItem(EOBlockRegistry.DIORITE_3);
        blockWithItem(EOBlockRegistry.DIORITE_4);
        blockWithItem(EOBlockRegistry.DIORITE_5);
        blockWithItem(EOBlockRegistry.DIORITE_6);
        blockWithItem(EOBlockRegistry.DIORITE_7);
        blockWithItem(EOBlockRegistry.DIORITE_8);
        blockWithItem(EOBlockRegistry.DIORITE_9);

        //METAL BLOCKS
        blockWithItem(EOBlockRegistry.ALUMINUM_BLOCK);
        blockWithItem(EOBlockRegistry.ARDITE_BLOCK);
        blockWithItem(EOBlockRegistry.BRONZE_BLOCK);
        blockWithItem(EOBlockRegistry.CATALYRIUM_BLOCK);
        blockWithItem(EOBlockRegistry.COBALT_BLOCK);
        blockWithItem(EOBlockRegistry.CONSTANTAN_BLOCK);
        blockWithItem(EOBlockRegistry.ELECTRUM_BLOCK);
        blockWithItem(EOBlockRegistry.ENDERIUM_BLOCK);
        blockWithItem(EOBlockRegistry.INVAR_BLOCK);
        blockWithItem(EOBlockRegistry.LEAD_BLOCK);
        blockWithItem(EOBlockRegistry.LUMIUM_BLOCK);
        blockWithItem(EOBlockRegistry.NICKEL_BLOCK);
        blockWithItem(EOBlockRegistry.OSMIUM_BLOCK);
        blockWithItem(EOBlockRegistry.PLATINUM_BLOCK);
        blockWithItem(EOBlockRegistry.PLUTONIUM_BLOCK);
        blockWithItem(EOBlockRegistry.TIN_BLOCK);
        blockWithItem(EOBlockRegistry.SIGNALUM_BLOCK);
        blockWithItem(EOBlockRegistry.URANIUM_BLOCK);
        blockWithItem(EOBlockRegistry.ULTIMATITANIUM_BLOCK);
        blockWithItem(EOBlockRegistry.SILVER_BLOCK);
        blockWithItem(EOBlockRegistry.GRAPHITE_BLOCK);
        blockWithItem(EOBlockRegistry.BRASS_BLOCK);
        blockWithItem(EOBlockRegistry.ZINC_BLOCK);
        blockWithItem(EOBlockRegistry.STEEL_BLOCK);
        blockWithItem(EOBlockRegistry.BLUE_STEEL_BLOCK);
        blockWithItem(EOBlockRegistry.GALLIUM_BLOCK);
        blockWithItem(EOBlockRegistry.TITANIUM_BLOCK);
        blockWithItem(EOBlockRegistry.PEWTER_BLOCK);
        blockWithItem(EOBlockRegistry.ROSE_GOLD_BLOCK);
        blockWithItem(EOBlockRegistry.BRITANNIA_SILVER_BLOCK);
        blockWithItem(EOBlockRegistry.IRIDIUM_BLOCK);
        blockWithItem(EOBlockRegistry.CAST_IRON_BLOCK);
        blockWithItem(EOBlockRegistry.URANINITE_BLOCK);
        blockWithItem(EOBlockRegistry.CAST_STEEL_BLOCK);
        blockWithItem(EOBlockRegistry.WROUGHT_IRON_BLOCK);
        blockWithItem(EOBlockRegistry.NETHERSTEEL_BLOCK);
        blockWithItem(EOBlockRegistry.SHADOWSTEEL_BLOCK);
        blockWithItem(EOBlockRegistry.PIG_IRON_BLOCK);
        blockWithItem(EOBlockRegistry.TUNGSTEN_BLOCK);
        blockWithItem(EOBlockRegistry.SILICON_BLOCK);

        //GEM BLOCKS
        blockWithItem(EOBlockRegistry.SAPPHIRE_BLOCK);
        blockWithItem(EOBlockRegistry.FLUORITE_BLOCK);
        blockWithItem(EOBlockRegistry.APATITE_BLOCK);
        blockWithItem(EOBlockRegistry.CINNABAR_BLOCK);
        blockWithItem(EOBlockRegistry.AMBER_BLOCK);
        blockWithItem(EOBlockRegistry.NITER_BLOCK);
        blockWithItem(EOBlockRegistry.RUBY_BLOCK);
        blockWithItem(EOBlockRegistry.ONYX_BLOCK);
        blockWithItem(EOBlockRegistry.PERIDOT_BLOCK);
        blockWithItem(EOBlockRegistry.NECROTICARITE_BLOCK);

        //MISC BLOCKS
        blockWithItem(EOBlockRegistry.NETHER_STAR_BLOCK);

        //RAW BLOCKS
        blockWithItem(EOBlockRegistry.RAW_ALUMINUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_ARDITE_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_CATALYRIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_COBALT_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_LEAD_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_NICKEL_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_OSMIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_PLATINUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_PLUTONIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_SILVER_BLOCK);
        blockWithItem(EOBlockRegistry.SULFUR_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_TIN_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_URANIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_ZINC_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_GALLIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_IRIDIUM_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_URANINITE_BLOCK);
        blockWithItem(EOBlockRegistry.RAW_TUNGSTEN_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(EOBlockRegistry.ALUMINUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_ALUMINUM_ORE_BLOCK);
        //COBALT
        blockWithItem(EOBlockRegistry.COBALT_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_COBALT_ORE_BLOCK);
        //LEAD
        blockWithItem(EOBlockRegistry.LEAD_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_LEAD_ORE_BLOCK);
        //NICKEL
        blockWithItem(EOBlockRegistry.NICKEL_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_NICKEL_ORE_BLOCK);
        //OSMIUM
        blockWithItem(EOBlockRegistry.OSMIUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_OSMIUM_ORE_BLOCK);
        //PLATINUM
        blockWithItem(EOBlockRegistry.PLATINUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_PLATINUM_ORE_BLOCK);
        //PLUTONIUM
        blockWithItem(EOBlockRegistry.PLUTONIUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
        //SULFUR
        blockWithItem(EOBlockRegistry.SULFUR_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_SULFUR_ORE_BLOCK);
        //TIN
        blockWithItem(EOBlockRegistry.TIN_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_TIN_ORE_BLOCK);
        //URANIUM
        blockWithItem(EOBlockRegistry.URANIUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_URANIUM_ORE_BLOCK);
        //SILVER
        blockWithItem(EOBlockRegistry.SILVER_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_SILVER_ORE_BLOCK);
        //ZINC
        blockWithItem(EOBlockRegistry.ZINC_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_ZINC_ORE_BLOCK);
        //GALLIUM
        blockWithItem(EOBlockRegistry.GALLIUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_GALLIUM_ORE_BLOCK);
        //IRIDIUM
        blockWithItem(EOBlockRegistry.IRIDIUM_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_IRIDIUM_ORE_BLOCK);
        //URANINITE
        blockWithItem(EOBlockRegistry.URANINITE_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_URANINITE_ORE_BLOCK);
        //TUNGSTEN
        blockWithItem(EOBlockRegistry.TUNGSTEN_ORE_BLOCK);

        //GEMS
        //FLUORITE
        blockWithItem(EOBlockRegistry.FLUORITE_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_FLUORITE_ORE_BLOCK);
        //SAPPHIRE
        blockWithItem(EOBlockRegistry.SAPPHIRE_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        //APATITE
        blockWithItem(EOBlockRegistry.APATITE_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_APATITE_ORE_BLOCK);
        //CINNABAR
        blockWithItem(EOBlockRegistry.CINNABAR_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_CINNABAR_ORE_BLOCK);
        //AMBER
        blockWithItem(EOBlockRegistry.AMBER_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_AMBER_ORE_BLOCK);
        //ONYX
        blockWithItem(EOBlockRegistry.ONYX_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_ONYX_ORE_BLOCK);
        //NITER
        blockWithItem(EOBlockRegistry.NITER_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_NITER_ORE_BLOCK);
        //RUBY
        blockWithItem(EOBlockRegistry.RUBY_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_RUBY_ORE_BLOCK);
        //PERIDOT
        blockWithItem(EOBlockRegistry.PERIDOT_ORE_BLOCK);
        blockWithItem(EOBlockRegistry.DEEPSLATE_PERIDOT_ORE_BLOCK);
        //OBSIDIAN
        blockWithItem(EOBlockRegistry.OBSIDIAN_ORE_BLOCK);
        //NECROTICARITE
        blockWithItem(EOBlockRegistry.NECROTICARITE_ORE_BLOCK);
        //ARDITE
        blockWithItem(EOBlockRegistry.ARDITE_ORE_BLOCK);
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
