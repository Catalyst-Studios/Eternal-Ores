package net.radzratz.eternalores.fluids.type;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.radzratz.eternalores.util.config.EOFluidsConfig;
import org.jetbrains.annotations.Nullable;

import java.util.function.IntSupplier;
import java.util.function.UnaryOperator;

import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOFluidType extends FluidType {
    public enum FluidTypes {
        FLUID("fluid", "fluid_generic", props -> props
                .lightLevel(0)
                .canSwim(false)
                .canDrown(false)
                .canConvertToSource(false)
                .density(1000)
                .viscosity(1000)
                .temperature(300)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        ),
        MOLTEN("molten", "molten_metal", props -> props
                .lightLevel(11)
                .canSwim(false)
                .canDrown(false)
                .canConvertToSource(false)
                .density(3000)
                .viscosity(6000)
                .temperature(1500)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL_LAVA)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY_LAVA)
        ),
        GAS("gas", "gas_generic", props -> props
                .lightLevel(0)
                .density(-1000)
                .viscosity(200)
                .temperature(300)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        ),
        CHEMICAL("chemical", "chemical_generic", props -> props
                .lightLevel(0)
                .canSwim(false)
                .canDrown(false)
                .canConvertToSource(false)
                .density(1000)
                .viscosity(200)
                .temperature(500)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        );

        public final String prefix;
        public final String defaultTexture;
        private final UnaryOperator<FluidType.Properties> defaults;

        FluidTypes(String prefix, String defaultTexture, UnaryOperator<FluidType.Properties> defaults) {
            this.prefix = prefix;
            this.defaultTexture = defaultTexture;
            this.defaults = defaults;
        }

        public FluidType.Properties baseProps() {
            return defaults.apply(FluidType.Properties.create());
        }
    }

    private final FluidTypes type;
    private final String name;
    private final String textureName;
    @Nullable
    private final IntSupplier tint;
    private final boolean hazardous;

    public EOFluidType(FluidType.Properties props, FluidTypes type, String name, @Nullable String customTexture, @Nullable IntSupplier tint, Boolean hazardous) {
        super(props);
        this.type = type;
        this.name = name;
        this.textureName = customTexture != null ? customTexture : type.defaultTexture;
        this.tint = tint;
        this.hazardous = hazardous;
    }

    public FluidTypes type() {
        return type;
    }

    public boolean hasTint() {
        return tint != null;
    }

    public int getTint() {
        return hasTint() ? tint.getAsInt() : 0xFFFFFFFF;
    }

    public boolean isHazardous() {
        return hazardous;
    }

    public boolean isEnabled() {
        return EOFluidsConfig.CFG.fluidSet.isEnabled(type, name);
    }

    public ResourceLocation getStillTexture() {
        return EO("block/fluids/" + textureName + "_still");
    }

    public ResourceLocation getFlowingTexture() {
        return EO("block/fluids/" + textureName + "_flow");
    }
}