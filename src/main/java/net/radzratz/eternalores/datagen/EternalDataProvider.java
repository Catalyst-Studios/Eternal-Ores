package net.radzratz.eternalores.datagen;

import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EternalDataProvider implements DataProvider
{
    private final PackOutput packOutput;
    private final List<DataProvider> subProviders = new ArrayList<>();

    public EternalDataProvider(PackOutput packOutput)
    {
        this.packOutput = packOutput;
    }

    public void addSubProvider(boolean include, DataProvider provider)
    {
        if(include)
        {
            subProviders.add(provider);
        }
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cachedOutput)
    {
        return CompletableFuture.allOf(
                subProviders.stream()
                        .map(provider -> provider.run(cachedOutput))
                        .toArray(CompletableFuture[]::new)
        );
    }

    @Override
    public @NotNull String getName()
    {
        return "Eternal Data Provider";
    }
}
