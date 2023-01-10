package com.opusvf.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("where").setExecutor(new WhereCommand());
        getCommand("canSleep").setExecutor(new CanSleepCommand());
        getCommand("distance").setExecutor(new DistanceCommand());
        getCommand("lastDeath").setExecutor(new LastDeathCommand());
        getCommand("config").setExecutor(new SpawnAtLocationCommand());
    }
}
