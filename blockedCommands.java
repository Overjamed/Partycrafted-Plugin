package net.partycrafted.partycraftedplugin.blockedCommands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class blockedCommands implements Listener {
    @EventHandler
    public void onCMD(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();

        String[] cmd = e.getMessage().substring(1).split(" ");


        if (cmd[0].startsWith("bukkit")) {
            if (!p.isOp()) {
                p.sendMessage("[" + ChatColor.DARK_GREEN + "Party Craft" + ChatColor.DARK_RED + " Permission System" + ChatColor.RESET + "]" + ChatColor.RED + "Dazu Bist du nicht berechtigt. Bitte kontaktiere einen Admin wenn das hier ein fehler ist");
                e.setCancelled(true);
            }
        }
        if (cmd[0].equalsIgnoreCase("plugins") || cmd[0].equalsIgnoreCase("pl")|| cmd[0].equalsIgnoreCase("?") || cmd[0].equalsIgnoreCase("help") || cmd[0].equalsIgnoreCase("version") || cmd[0].equalsIgnoreCase("me")) {
            if (!p.isOp()) {
                p.sendMessage("[" + ChatColor.DARK_GREEN + "Party Craft" + ChatColor.DARK_RED + " Permission System" + ChatColor.RESET + "]" + ChatColor.RED + "Dazu Bist du nicht berechtigt. Bitte kontaktiere einen Admin wenn das hier ein fehler ist");
                e.setCancelled(true);
            }
        }
    }
}
