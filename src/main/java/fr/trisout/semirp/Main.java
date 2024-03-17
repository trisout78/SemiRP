package fr.trisout.semirp;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.WorldBorder;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Plugin By Trisout");
        getLogger().warning("Attention: Malgré le fait que ce plugin soit publique, merci de prendre en compte les information suivantes");
        getLogger().warning("- Ce plugin est en développement, il est donc possible que des bugs soient présents");
        getLogger().warning("- Vous devez impérativement me créditer si vous utilisez ce plugin");
        getLogger().warning("- Vous ne pouvez pas vendre ce plugin");
        getLogger().warning("- Vous devez, comment l'indique la licence, partager toute modification et sous la même licence");
        getLogger().warning("- Vous ne pouvez pas retirer les crédits du plugin");
        getLogger().warning("- Aucun support ne sera fourni pour ce plugin");
        getLogger().warning("- Je ne suis pas responsable des dégâts que ce plugin pourrait causer");
        getLogger().warning("- Aucune mise a jour de ce plugin est garantie");
        getLogger().warning("- Vous ne pouvez pas supprimer cet avertissement");
        getCommand("Broadcast").setExecutor(new CommandBroadcast());
        getCommand("Annonce").setExecutor(new CommandAnnonce());
        getCommand("Mairie").setExecutor(new CommandMairie());
    }

    @EventHandler
    public void onAdvancementGranted(PlayerAdvancementDoneEvent event) {
        World world = Bukkit.getWorld("world");
        WorldBorder worldborder = world.getWorldBorder();
        Player player = event.getPlayer();
        double newsize = worldborder.getSize() + 1;
        worldborder.setSize(newsize, 3);
        getLogger().info("Advancement done by " + player + ". Setting world border to " + newsize + " blocks.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin By Trisout");
        getLogger().warning("Attention: Malgré le fait que ce plugin soit publique, merci de prendre en compte les information suivantes");
        getLogger().warning("- Ce plugin est en développement, il est donc possible que des bugs soient présents");
        getLogger().warning("- Vous devez impérativement me créditer si vous utilisez ce plugin");
        getLogger().warning("- Vous ne pouvez pas vendre ce plugin");
        getLogger().warning("- Vous devez, comment l'indique la licence, partager toute modification et sous la même licence");
        getLogger().warning("- Vous ne pouvez pas retirer les crédits du plugin");
        getLogger().warning("- Aucun support ne sera fourni pour ce plugin");
        getLogger().warning("- Je ne suis pas responsable des dégâts que ce plugin pourrait causer");
        getLogger().warning("- Aucune mise a jour de ce plugin est garantie");
        getLogger().warning("- Vous ne pouvez pas supprimer cet avertissement");
    }

}