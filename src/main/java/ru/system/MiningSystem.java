package ru.system;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MiningSystem extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
