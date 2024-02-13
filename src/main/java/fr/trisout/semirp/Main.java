package fr.trisout.semirp;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.WorldBorder;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("Broadcast").setExecutor(new CommandBroadcast());
        getCommand("Annonce").setExecutor(new CommandAnnonce());
        getCommand("Mairie").setExecutor(new CommandMairie());
    }

    @EventHandler
    public void onAdvancementDone(PlayerAdvancementDoneEvent event) {
        World world = Bukkit.getWorld("world");
        WorldBorder worldborder = world.getWorldBorder();
        double newsize = worldborder.getSize() + 1;
        worldborder.setSize(newsize);
    }
}