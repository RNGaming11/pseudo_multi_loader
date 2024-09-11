package qa.luffy.pseudo.neoforge;

import net.neoforged.fml.common.Mod;

import qa.luffy.pseudo.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
