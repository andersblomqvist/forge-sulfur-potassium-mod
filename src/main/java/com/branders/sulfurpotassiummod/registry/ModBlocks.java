package com.branders.sulfurpotassiummod.registry;

import com.branders.sulfurpotassiummod.SulfurPotassiumMod;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

/**
 * 	Mod Block registry and references
 * 
 * 	@author Anders <Branders> Blomqvist
 */
public class ModBlocks {
	
	public static final Block 
		SULFUR_ORE = registerBlock("sulfur_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 4), AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE)), ItemGroups.NATURAL),
		SULFUR_NETHER_ORE = registerBlock("sulfur_nether_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F, 3.0F).sounds(BlockSoundGroup.NETHER_ORE).mapColor(MapColor.DARK_RED)), ItemGroups.NATURAL),
		SULFUR_BLOCK = registerBlock("sulfur_block", new Block(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).strength(5.0F, 6.0F)), ItemGroups.BUILDING_BLOCKS),
		POTASSIUM_ORE = registerBlock("potassium_ore", new Block(AbstractBlock.Settings.copy(Blocks.STONE).strength(3.0F, 3.0F)), ItemGroups.NATURAL),
		POTASSIUM_BLOCK = registerBlock("potassium_block", new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).strength(5.0F, 6.0F).sounds(BlockSoundGroup.METAL)), ItemGroups.BUILDING_BLOCKS);
	
	// Initialize static variables (registration)
	public static void register() {}
	
	private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {	
		Registry.register(Registries.BLOCK, Identifier.of(SulfurPotassiumMod.MOD_ID, name), block);
		ModItems.registerItem(name, new BlockItem(block, new Item.Settings()), group);
		return block;
	}
}
