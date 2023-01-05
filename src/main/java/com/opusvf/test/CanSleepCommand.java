package com.opusvf.test;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class CanSleepCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ArrayList<Player> players = new ArrayList<>(Bukkit.getOnlinePlayers());
        int total;
        int canSleep = 0;
        total = players.size();
        for (Player p : players) {
            String worldName = p.getWorld().getName();
            if (!worldName.contains("_nether") && !worldName.contains("_the_end")) {
                canSleep = canSleep + 1;
            }
        }
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Can Sleep (In Overworld) -> " + canSleep + "/" + total);

        return false;
    }
}
