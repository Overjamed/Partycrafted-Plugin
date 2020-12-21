package net.partycrafted.partycraftedplugin.blockedCommands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class OPSblockedCommands implements Listener {
    @EventHandler
    public void onCMD(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();

        String[] cmd = e.getMessage().substring(1).split(" ");

        if (cmd[0].equalsIgnoreCase("stop")) {
            if (!p.hasPermission("partycrafted.server.operation.stop")) {
                p.kickPlayer("&4Du kannst den server nicht stoppen!!!!!");
            }
            if (cmd[0].equalsIgnoreCase("rl")) {
                if (!p.hasPermission("partycrafted.server.operation.reload")) {
                p.kickPlayer("&c Du kannst den server Nicht neuladen");
                }
            }
            if (cmd[0].equalsIgnoreCase("reload")) {
                if (!p.hasPermission("partycrafted.server.operation.reload")) {
                    p.kickPlayer("&c Du kannst den server Nicht neuladen");
                }
            }
        }
    }
}
