package net.radzratz.eternalores.util.compat.mekanism.fluids;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.ChemicalDeferredRegister;
import mekanism.common.registration.impl.SlurryRegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.neoforged.bus.api.IEventBus;
import net.radzratz.eternalores.EternalOres;

public class EternalOresMekFluids
{
    public static final ChemicalDeferredRegister EO_SLURRYS = new ChemicalDeferredRegister(EternalOres.MOD_ID);

    public static final SlurryRegistryObject<Chemical, Chemical> ALUMINUM_SLURRY =
            registerSlurry("aluminum", 0xFF947a7a, "c:ores/aluminum");

    public static final SlurryRegistryObject<Chemical, Chemical> CATALYRIUM_SLURRY =
            registerSlurry("catalyrium", 0xFF7f1f00, "c:storage_blocks/raw_catalyrium");

    public static final SlurryRegistryObject<Chemical, Chemical> COBALT_SLURRY =
            registerSlurry("cobalt", 0xFF7ca5a5, "c:ores/cobalt");

    public static final SlurryRegistryObject<Chemical, Chemical> GALLIUM_SLURRY =
            registerSlurry("gallium", 0xFF3e4650, "c:ores/gallium");

    public static final SlurryRegistryObject<Chemical, Chemical> IRIDIUM_SLURRY =
            registerSlurry("iridium", 0xFFb6b5b1, "c:ores/iridium");

    public static final SlurryRegistryObject<Chemical, Chemical> NICKEL_SLURRY =
            registerSlurry("nickel", 0xFFc7c1c1, "c:ores/nickel");

    public static final SlurryRegistryObject<Chemical, Chemical> PLATINUM_SLURRY =
            registerSlurry("platinum", 0xFF7e786d, "c:ores/platinum");

    public static final SlurryRegistryObject<Chemical, Chemical> SILVER_SLURRY =
            registerSlurry("silver", 0xFFa49f9f, "c:ores/silver");

    public static final SlurryRegistryObject<Chemical, Chemical> URANINITE_SLURRY =
            registerSlurry("uraninite", 0xFF85bf65, "c:ores/uraninite");

    public static final SlurryRegistryObject<Chemical, Chemical> ZINC_SLURRY =
            registerSlurry("zinc", 0xFFa49f9f, "c:ores/zinc");

    public static SlurryRegistryObject<Chemical, Chemical> registerSlurry(String name,
                                                                          int tint,
                                                                          String oreTagPath)
    {
        String[] parts = oreTagPath.split(":", 2);
        ResourceLocation tagId = ResourceLocation.fromNamespaceAndPath(parts[0], parts[1]);

        return EO_SLURRYS.registerSlurry(name, builder -> builder
                .tint(tint)
                .ore(TagKey.create(BuiltInRegistries.ITEM.key(), tagId))
        );
    }

    public static void registerEOMekFluids(IEventBus eventBus)
    {
        EO_SLURRYS.register(eventBus);
    }
}
