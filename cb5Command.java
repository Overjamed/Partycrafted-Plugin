package net.partycrafted.partycraftedplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class cb5Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("[" + ChatColor.DARK_GREEN + "Party Craft" + ChatColor.YELLOW + " Command Manager" + ChatColor.RESET + "]" + ChatColor.RED + "Dieser Befehl ist noch nicht fertig bitte warte noch ein bisschen");
        return false;
    }
}

