package com.opusvf.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class DistanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ArrayList<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        if (args.length != 0) {
            String name = args[0];
            for (Player p : players) {
                if (p.getName().equalsIgnoreCase(name)) {
                    try {
                        Location location = p.getLocation();
                        double distance = location.distance(((Player) sender).getLocation());
                        String distanceString = String.valueOf(distance);
                        String result = String.format("Distance to %s -> %s", name, distanceString);
                        sender.sendMessage(ChatColor.LIGHT_PURPLE + result);
                    } catch (Exception e) {
                        //  Block of code to handle errors
                    }
                }
            }
        } else {
            for (Player p : players) {
                try {
                    String name = p.getName();
                    Location location = p.getLocation();
                    double distance = location.distance(((Player) sender).getLocation());
                    String distanceString = String.valueOf(distance);
                    String result = String.format("Distance to %s -> %s", name, distanceString);
                    sender.sendMessage(ChatColor.LIGHT_PURPLE + result);
                } catch (Exception e) {
                    //  Block of code to handle errors
                }
            }
        }
        return false;
    }
}
