/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Savage_Killer13.SavagesMilitary.tools;

import com.Savage_Killer13.SavagesMilitary.Main;
import com.Savage_Killer13.SavagesMilitary.init.ModItems;
import com.Savage_Killer13.SavagesMilitary.util.IHasModel;
import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

/**
 *
 * @author Soren Mortimer
 */
public class ToolAxe extends ItemTool implements IHasModel {
    
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE);
    

    public ToolAxe(String name, ToolMaterial material){
        super(material, EFFECTIVE_ON);
        setUnlocalizedName(name);
        setRegistryName(name);

        setCreativeTab(CreativeTabs.TOOLS);
        ModItems.ITEMS.add(this);
    }



    @Override
    public float getDestroySpeed(ItemStack stack, IBlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }



    @Override
    public void registerModels() {
	Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
