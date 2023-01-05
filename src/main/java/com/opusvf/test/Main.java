package com.opusvf.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("where").setExecutor(new WhereCommand());
        getCommand("canSleep").setExecutor(new CanSleepCommand());
        getCommand("distance").setExecutor(new DistanceCommand());
    }
}
