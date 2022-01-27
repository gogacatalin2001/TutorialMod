package com.bombiliu.tutorialmod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("tutorialmod")
public class TutorialMod {
    TutorialMod() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
