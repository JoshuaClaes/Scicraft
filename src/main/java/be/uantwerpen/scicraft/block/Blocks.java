package be.uantwerpen.scicraft.block;

import be.uantwerpen.scicraft.Scicraft;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Map;

public class Blocks {
    public static final Block PION_NUL = new PionBlock(FabricBlockSettings.of(Material.WOOL).mapColor(MapColor.WHITE).strength(2f).nonOpaque().collidable(false));
    public static final Block PION_MINUS = new PionBlock(FabricBlockSettings.of(Material.WOOL).mapColor(MapColor.WHITE).strength(2f).nonOpaque().collidable(false));
    public static final Block PION_PLUS = new PionBlock(FabricBlockSettings.of(Material.WOOL).mapColor(MapColor.WHITE).strength(2f).nonOpaque().collidable(false));
    public static final Block NEUTRONBLOCK = new Block(FabricBlockSettings.of(Material.WOOL).mapColor(MapColor.WHITE).strength(2f).nonOpaque().collidable(false));

    private static Block registerBlock(Block block, String identifier) {
        return Registry.register(Registry.BLOCK, new Identifier(Scicraft.MOD_ID, identifier), block);
    }

    public static void registerBlocks(){
        registerBlock(PION_NUL, "pion_nul");
        registerBlock(PION_MINUS, "pion_minus");
        registerBlock(PION_PLUS, "pion_plus");
        registerBlock(NEUTRONBLOCK,"neutron_block");
    }


}