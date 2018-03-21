package com.Savage_Killer13.SavagesMilitary.init;

import com.Savage_Killer13.SavagesMilitary.armour.ArmourBase;
import com.Savage_Killer13.SavagesMilitary.tools.ToolSpade;
import com.Savage_Killer13.SavagesMilitary.tools.ToolSword;
import com.Savage_Killer13.SavagesMilitary.items.ItemBase;
import com.Savage_Killer13.SavagesMilitary.tools.ToolAxe;
import com.Savage_Killer13.SavagesMilitary.tools.ToolPickaxe;
import com.Savage_Killer13.SavagesMilitary.util.Reference;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;



public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();
    
    //Materials
    public static final ToolMaterial TOOL_STEEL = EnumHelper.addToolMaterial("tool_steel", 3, 2000, 10.0F, 4.0F, 11);
    public static final ArmorMaterial ARMOUR_STEEL = EnumHelper.addArmorMaterial("armour_steel", Reference.MOD_ID + ":steel", 45, new int[]{4, 8, 10, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    
    //Items
    public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
    
    //Tools
    public static final Item STEEL_AXE = new ToolAxe("steel_axe", TOOL_STEEL);
    public static final Item STEEL_PICKAXE = new ToolPickaxe("steel_pickaxe", TOOL_STEEL);
    public static final Item STEEL_SWORD = new ToolSword("steel_sword", TOOL_STEEL);
    public static final Item STEEL_SPADE = new ToolSpade("steel_spade", TOOL_STEEL);
    
    //Armour
    public static final Item STEEL_HELMET = new ArmourBase("steel_helmet", ARMOUR_STEEL, 1, EntityEquipmentSlot.HEAD);
    public static final Item STEEL_CHESTPLATE = new ArmourBase("steel_chestplate", ARMOUR_STEEL, 1, EntityEquipmentSlot.CHEST);
    public static final Item STEEL_LEGGINGS = new ArmourBase("steel_leggings", ARMOUR_STEEL, 2, EntityEquipmentSlot.LEGS);
    public static final Item STEEL_BOOTS = new ArmourBase("steel_boots", ARMOUR_STEEL, 1, EntityEquipmentSlot.FEET);
}
