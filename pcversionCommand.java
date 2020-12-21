package net.partycrafted.partycraftedplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class pcversionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.LIGHT_PURPLE + "Das Partycraft Plugin auf der version 1.15.*");
        return false;
    }
}
