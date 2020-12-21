package net.partycrafted.partycraftedplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class supportCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        try {
            player.performCommand("msg pogrammerX " + args.toString());
        } catch (Exception e) {
            player.sendMessage("Immommentan ist kein admin / mod / sup Online");
            player.sendMessage("Wenn du willst kannst du uns eine mail schreiben mailto:overjamed@yahoo.com");
        }
        return false;
    }
}
