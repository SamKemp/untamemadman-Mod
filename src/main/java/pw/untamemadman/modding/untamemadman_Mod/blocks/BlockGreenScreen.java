package pw.untamemadman.modding.untamemadman_Mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pw.untamemadman.modding.untamemadman_Mod.reference.Reference;

/**
 * Created by untamemadman on 06/03/2015.
 */

public class BlockGreenScreen extends Block
{
    private final String name = "GreenScreen";
    public BlockGreenScreen()
    {
        super(Material.rock);
        GameRegistry.registerBlock(this, name);
        setUnlocalizedName(Reference.MOD_ID + "_" + name);
        setCreativeTab(CreativeTabs.tabBlock);
        setLightLevel(1.0F);
        setBlockUnbreakable();
        setResistance(6000000.0F);
    }

    public String getName()
    {
        return name;
    }
}
