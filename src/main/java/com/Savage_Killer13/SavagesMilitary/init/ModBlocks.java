package com.Savage_Killer13.SavagesMilitary.init;

import com.Savage_Killer13.SavagesMilitary.blocks.BlockOres;
import com.Savage_Killer13.SavagesMilitary.blocks.SteelBlock;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
    
    public static final Block ORE_END_STEEL = new BlockOres("ore_end_steel", Material.ROCK, "end");
    public static final Block ORE_OVERWORLD_STEEL = new BlockOres("ore_overworld_steel", Material.ROCK, "overworld");
    public static final Block ORE_NETHER_STEEL = new BlockOres("ore_nether_steel", Material.ROCK, "nether");
}
