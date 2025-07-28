package net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces;

public interface IEOritechRecipeType
{
    /// IEOritechRecipeType interface
    String suffix();
    String folder();
    int inputs();
    int outputs();
    boolean isCentrifuge();
    boolean isCentrifugeFluid();
    boolean isPulverizer();
    boolean isPulverizerByproduct();
    boolean isFoundryGem();
    boolean isFoundryAlloy();
    boolean isLaser();
    boolean isAtomicForge();
    boolean isRefinery();
    boolean isFragment();
    boolean isParticleAccel();
    boolean isAssembler();
}
