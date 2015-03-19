package pw.untamemadman.modding.untamemadman_Mod.handler;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import pw.untamemadman.modding.untamemadman_Mod.reference.Reference;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean testValue = true;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }
    private static void loadConfiguration()
    {
        testValue = configuration.getBoolean("Useless", Configuration.CATEGORY_GENERAL, true, "This is useless!");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}