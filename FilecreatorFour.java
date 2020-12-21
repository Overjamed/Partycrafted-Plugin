package net.partycrafted.partycraftedplugin.FileCreators;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FilecreatorFour {

    private File file = new File("plugins//partycrafted//commands//hubCommand.yml");
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    private String key = "Do with Player";
    private String Value = "run mvtp world";


    public void createfile() {
        yamlConfiguration.set(key, Value);
        try {
            yamlConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
