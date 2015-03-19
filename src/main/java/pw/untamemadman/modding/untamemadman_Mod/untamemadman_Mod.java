package pw.untamemadman.modding.untamemadman_Mod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import pw.untamemadman.modding.untamemadman_Mod.blocks.BlockGreenScreen;
import pw.untamemadman.modding.untamemadman_Mod.handler.ConfigHandler;
import pw.untamemadman.modding.untamemadman_Mod.proxy.IProxy;
import pw.untamemadman.modding.untamemadman_Mod.reference.Reference;
import pw.untamemadman.modding.untamemadman_Mod.utility.LogHelper;

/**
 * Created by untamemadman on 06/03/2015.
 */


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUIFactoryClass)
public class untamemadman_Mod
{
    @Mod.Instance(Reference.MOD_ID)
    public static untamemadman_Mod instances;

    @SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static IProxy proxy;

    public static Block GreenScreen;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void Init (FMLInitializationEvent event)
    {
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            renderItem.getItemModelMesher().register(Item.getItemFromBlock(GreenScreen), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + ((BlockGreenScreen) GreenScreen).getName(), "inventory"));
        }
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}