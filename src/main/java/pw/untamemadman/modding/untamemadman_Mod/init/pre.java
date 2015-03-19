package pw.untamemadman.modding.untamemadman_Mod.init;

import net.minecraft.block.Block;
import pw.untamemadman.modding.untamemadman_Mod.blocks.BlockGreenScreen;

/**
 * Created by untamemadman on 06/03/2015.
 */

public class pre
{
    public static Block GreenScreen;

    public static void preInit()
    {
        //Blocks
        GreenScreen = new BlockGreenScreen();
    }
}
