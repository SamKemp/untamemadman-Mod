package pw.untamemadman.modding.untamemadman_mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import pw.untamemadman.modding.untamemadman_mod.proxy.IProxy;
import pw.untamemadman.modding.untamemadman_mod.reference.Reference;

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


}