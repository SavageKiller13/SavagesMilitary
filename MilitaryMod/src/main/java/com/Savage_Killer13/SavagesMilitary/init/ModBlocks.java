package com.Savage_Killer13.SavagesMilitary.init;

import com.Savage_Killer13.SavagesMilitary.blocks.BlockBase;
import com.Savage_Killer13.SavagesMilitary.blocks.SteelBlock;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
    
    public static final Block ORE_STEEL_END = new BlockOres("ore_steel_end", "end") {};
    public static final Block ORE_STEEL_OVERWORLD = new BlockOres("ore_steel_overworld", "overworld") {};
    public static final Block ORE_STEEL_NETHER = new BlockOres("ore_steel_nether", "nether") {};
}
