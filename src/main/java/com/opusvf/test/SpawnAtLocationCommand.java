package com.opusvf.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class SpawnAtLocationCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length != 0) {
            String name = args[0];
            ArrayList<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
            for (Player p : players) {
                if (p.getName().equalsIgnoreCase(name)) {
                    try {
                        Location location = p.getLocation();
                        String world = p.getWorld().getName();
                        Bukkit.getWorld(world).spawnEntity(location, EntityType.WARDEN);
                    } catch (Exception e) {
                        //  Block of code to handle errors
                    }
                }
            }
        }
        return false;
    }
}
