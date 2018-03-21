/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Savage_Killer13.SavagesMilitary.blocks;

import net.minecraft.block.material.Material;

/**
 *
 * @author Soren Mortimer
 */
public class BlockOres extends BlockBase {
    
    public BlockOres(String name, Material material, float hardness, float resistance) {
        super(name, material);
        
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel("pickaxe", 3);
        setLightLevel(0.0f);
    }
    
}
