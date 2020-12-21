package net.partycrafted.partycraftedplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Skull;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class kopfCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(sender instanceof Player) {
            Bukkit.getConsoleSender().sendMessage("Du musst ein spieler sein!");
        }
        Player p = (Player) sender;
        if(!p.hasPermission("partycrafted.command.kopf")) {
            p.sendMessage("[" + ChatColor.DARK_GREEN + "Party Crafted" + ChatColor.DARK_RED + " Permission system" + ChatColor.RESET + "]" + ChatColor.RED+ "Du hasst nicht die nötige berechtigung");
            return true;
        }
        if(args.length == 1) {
            ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
            SkullMeta im = (SkullMeta)is.getItemMeta();
            im.setOwner(args[0]);
            im.setDisplayName("kopf von " + args[0]);
            is.setItemMeta(im);
            p.getInventory().addItem(new ItemStack[] {is});
            p.updateInventory();
            return true;
        }else{
            p.sendMessage("[" + ChatColor.DARK_GREEN + "Party Crafted" + ChatColor.DARK_RED + " Command Manager" + ChatColor.RESET + "]" + ChatColor.YELLOW + "Syntax fehler verwendung : /kopf <Spieler>");
        }
        return false;
    }
}
