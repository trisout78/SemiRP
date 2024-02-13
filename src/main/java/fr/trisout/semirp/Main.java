package fr.trisout.semirp;

import org.bukkit.Bukkit;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;

public class Main extends JavaPlugin {
    private int worldBorder;

    @Override
    public void onEnable() {
        System.out.println("§cBy Trisout");
        getCommand("Broadcast").setExecutor(new CommandBroadcast());
        getCommand("Annonce").setExecutor(new CommandAnnonce());
        getCommand("Mairie").setExecutor(new CommandMairie());

        // Load world border value from config
        this.worldBorder = this.getConfig().getInt("worldborder", 2000);
    }

    @Override
    public void onDisable() {
        System.out.println("§cBy Trisout");
    }

    @EventHandler
    public void OnPlayerAdvancementDone(PlayerAdvancementDoneEvent event) {
        // Increment world border value
        this.worldBorder++;

        // Set new world border
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "worldborder set " + this.worldBorder + "3");

        // Save new world border value to config
        this.getConfig().set("worldborder", this.worldBorder);
        this.saveConfig();
    }
}