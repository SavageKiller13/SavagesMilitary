package com.Savage_Killer13.SavagesMilitary.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;


public class SteelBlock extends BlockBase {
    
    public SteelBlock(String name, Material material) {
        super(name, material);
        
        setHardness(12.5f);
        setResistance(22.5f);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(0.0f);
    }
    
}
