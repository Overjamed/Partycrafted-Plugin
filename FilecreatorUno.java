package net.partycrafted.partycraftedplugin.FileCreators;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FilecreatorUno {

    private File file = new File("plugins//partycrafted//GUI//Main//core//GUI.CLOSE.yml");
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    private String key = "GUI.closer";
    private String Value = "if GUI.CLOSE == 1 Then if GUI.CLOSER == 1 Then GUI.yml().CLOSE" +
            "CLOSE == stop.running(plugin: Main.get.plugin) DONE FINE";


    public void createfile() {
        yamlConfiguration.set(key, Value);
        try {
            yamlConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
