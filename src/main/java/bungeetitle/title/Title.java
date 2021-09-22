package bungeetitle.title;


import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;


public final class Title extends Plugin  {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getProxy().getPluginManager().registerListener(this, new TitleUtil());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
