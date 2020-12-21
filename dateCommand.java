package net.partycrafted.partycraftedplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Date;

public class dateCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Date date = new Date();
        sender.sendMessage("[" + ChatColor.DARK_GREEN + "Partycrafted" + ChatColor.RESET + "] " + ChatColor.GREEN + "Es ist jetzt " + date.toString());
        return false;
    }
}
