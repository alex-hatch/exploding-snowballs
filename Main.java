package me.alex.firstplugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("Enabling exploding arrows");
        getServer().getPluginManager().registerEvents(new SnowballHit(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling exploding arrows");
    }
}