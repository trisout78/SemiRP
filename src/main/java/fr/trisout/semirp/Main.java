package fr.trisout.semirp;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.advancement.Advancement;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.WorldBorder;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin By Trisout");
        getCommand("Broadcast").setExecutor(new CommandBroadcast());
        getCommand("Annonce").setExecutor(new CommandAnnonce());
        getCommand("Mairie").setExecutor(new CommandMairie());
    }

    @EventHandler
    public void onAdvancementGranted(PlayerAdvancementDoneEvent event) {
        World world = Bukkit.getWorld("world");
        WorldBorder worldborder = world.getWorldBorder();
        double newsize = worldborder.getSize() + 10;
        worldborder.setSize(newsize, 10);
        getLogger().info("Advancement done. Setting world border to " + newsize + " blocks.");
    }
}