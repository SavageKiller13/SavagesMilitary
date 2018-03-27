/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Savage_Killer13.SavagesMilitary.world.gen;

import com.Savage_Killer13.SavagesMilitary.blocks.BlockOres;
import com.Savage_Killer13.SavagesMilitary.init.ModBlocks;
import com.Savage_Killer13.SavagesMilitary.util.handlers.EnumHandler;
import java.util.Random;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

/**
 *
 * @author Soren Mortimer
 */
public class WorldGenCustomOres implements IWorldGenerator {
    private final WorldGenerator ore_steel_overworld, ore_steel_nether, ore_steel_end;
    
    public WorldGenCustomOres() {
        ore_steel_overworld = new WorldGenMinable(ModBlocks.ORE_OVERWORLD_STEEL.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.STEEL), 3, BlockMatcher.forBlock(Blocks.STONE));
        ore_steel_nether = new WorldGenMinable(ModBlocks.ORE_NETHER_STEEL.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.STEEL), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));
        ore_steel_end = new WorldGenMinable(ModBlocks.ORE_END_STEEL.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.STEEL), 3, BlockMatcher.forBlock(Blocks.END_STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            case -1:
                runGenerator(ore_steel_nether, world, random, chunkX, chunkZ, 40, 0, 75);
                break;
            case 0:
                runGenerator(ore_steel_overworld, world, random, chunkX, chunkZ, 30, 5, 25);
                break;
            case 1:
                runGenerator(ore_steel_end, world, random, chunkX, chunkZ, 30, 0, 256);
                break;
        }
    }
    
    
    
    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
        
        int heightDiff = maxHeight - minHeight + 1; 
        for(int i=0; i < chance; i++) {
            int x = chunkX * 16 + rand.nextInt(16);
            int z = chunkZ * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            
            gen.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
