package com.opusvf.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class WhereCommand implements CommandExecutor {
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
                        String result = String.format("%s location -> X %s Y %s Z %s (%s)", name, location.getBlockX(), location.getBlockY(), location.getBlockZ(), world);
                        sender.sendMessage(ChatColor.GREEN + result);
                    } catch (Exception e) {
                        //  Block of code to handle errors
                    }
                }
            }
        }
        return false;
    }
}
