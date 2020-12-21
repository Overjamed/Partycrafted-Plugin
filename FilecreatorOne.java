package net.partycrafted.partycraftedplugin.FileCreators;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FilecreatorOne {

    private File file = new File("plugins//partycrafted//GUI//Main//core//GUI.yml");
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    private String key = "GUI.LOADER=";
    private String Value = "if GUI.LOAD == 1 Then if GUI.OPEN == 1 Then GUI.yml().open" +
            "open == start.opener(plugin: Main.get.plugin) DONE FINE";


    public void createfile() {
        yamlConfiguration.set(key, Value);
        try {
            yamlConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
