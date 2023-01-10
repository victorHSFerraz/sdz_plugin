package com.opusvf.test;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LastDeathCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        try {
            Location location = player.getLastDeathLocation();
            if (location != null) {
                String result = String.format("Last Death Location -> X %s Y %s Z %s", location.getBlockX(), location.getBlockY(), location.getBlockZ());
                player.sendMessage(ChatColor.RED + result);
            }
        } catch (Exception e) {
            //  Block of code to handle errors
        }
        return false;
    }
}
