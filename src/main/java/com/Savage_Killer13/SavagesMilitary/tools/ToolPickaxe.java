/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Savage_Killer13.SavagesMilitary.tools;

import com.Savage_Killer13.SavagesMilitary.Main;
import com.Savage_Killer13.SavagesMilitary.init.ModItems;
import com.Savage_Killer13.SavagesMilitary.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

/**
 *
 * @author Soren Mortimer
 */
public class ToolPickaxe extends ItemPickaxe implements IHasModel {
    

    public ToolPickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        
        setCreativeTab(CreativeTabs.TOOLS);
        ModItems.ITEMS.add(this);
    }



    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
    
}
