package me.axeno.fireballfight;

import org.bukkit.plugin.java.JavaPlugin;
import me.axeno.fireballfight.managers.PluginManager;
import me.axeno.fireballfight.listeners.PlayerListener;

public class FireballFight extends JavaPlugin {
    
    @Override
    public void onEnable() {
        
        // Initialize managers
        PluginManager.getInstance().initialize();
        
        // Register listeners
        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        
        getLogger().info("FireballFight has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("FireballFight has been disabled!");
    }
    
}