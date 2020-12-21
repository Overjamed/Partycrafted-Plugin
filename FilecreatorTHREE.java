package net.partycrafted.partycraftedplugin.FileCreators;

import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class FilecreatorTHREE {

    private File file = new File("plugins//partycrafted//commands//kopfCommand.yml");
    private YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);

    private String key = "Startup";
    private String Value = "run /give @s PLAYER_HEAD when done run skull + ARGS.TOSTRING";


    public void createfile() {
        yamlConfiguration.set(key, Value);
        try {
            yamlConfiguration.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
