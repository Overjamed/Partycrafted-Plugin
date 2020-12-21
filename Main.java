package net.partycrafted.partycraftedplugin;
import net.partycrafted.partycraftedplugin.FileCreators.FilecreatorFour;
import net.partycrafted.partycraftedplugin.FileCreators.FilecreatorOne;
import net.partycrafted.partycraftedplugin.FileCreators.FilecreatorTHREE;
import net.partycrafted.partycraftedplugin.FileCreators.FilecreatorUno;
import net.partycrafted.partycraftedplugin.blockedCommands.OPSblockedCommands;
import net.partycrafted.partycraftedplugin.blockedCommands.blockedCommands;
import net.partycrafted.partycraftedplugin.commands.*;
import net.partycrafted.partycraftedplugin.listeners.JoinListener;
import net.partycrafted.partycraftedplugin.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {


    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

        Bukkit.getConsoleSender().sendMessage("----------------Partycrafted----------------");
        Bukkit.getConsoleSender().sendMessage("   Plugin : Stable, Plugin Version : 1.0 ");
        Bukkit.getConsoleSender().sendMessage("         Plugin Status : Online");
        Bukkit.getConsoleSender().sendMessage("           All commands Online");
        Bukkit.getConsoleSender().sendMessage("           All Listeners Online");
        Bukkit.getConsoleSender().sendMessage("----------------Partycrafted----------------");

        listenerregistration();
        FileCreator();
        commandregistration();
    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("----------------Partycrafted----------------");
        Bukkit.getConsoleSender().sendMessage("    Plugin : Stable, Plugin Version: 1.0");
        Bukkit.getConsoleSender().sendMessage("          Plugin Status : Offline");
        Bukkit.getConsoleSender().sendMessage("            All Commands Offline");
        Bukkit.getConsoleSender().sendMessage("            All Listeners Offline");
        Bukkit.getConsoleSender().sendMessage("----------------Partycrafted----------------");

    }
    private void FileCreator() {
        new FilecreatorOne().createfile();
        new FilecreatorUno().createfile();
        new FilecreatorTHREE().createfile();
        new FilecreatorFour().createfile();
    }
    private void listenerregistration() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new QuitListener(), this);
        pluginManager.registerEvents(new blockedCommands(), this);
        pluginManager.registerEvents(new OPSblockedCommands(), this);
    }
    private void commandregistration() {
        getCommand("date").setExecutor(new dateCommand());
        getCommand("hub").setExecutor(new hubCommad());
        getCommand("cb1").setExecutor(new cb1Command());
        getCommand("minispiele").setExecutor(new minispielCommand());
        getCommand("pvp").setExecutor(new pvpCommand());
        getCommand("bw").setExecutor(new bwCommand());
        getCommand("cb2").setExecutor(new cb2Command());
        getCommand("cb3").setExecutor(new cb3Command());
        getCommand("cb4").setExecutor(new cb4Command());
        getCommand("cb5").setExecutor(new cb5Command());
        getCommand("farmwelt").setExecutor(new farmweltCommand());
        getCommand("kopf").setExecutor(new kopfCommand());
        getCommand("support").setExecutor(new supportCommand());
    }
}
