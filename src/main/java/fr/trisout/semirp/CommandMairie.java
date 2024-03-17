package fr.trisout.semirp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMairie implements CommandExecutor {
    private final Main plugin;

    public CommandMairie(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;
            double x = plugin.getConfig().getDouble("mairie_x");
            double y = plugin.getConfig().getDouble("mairie_y");
            double z = plugin.getConfig().getDouble("mairie_z");
            Location location = new Location(Bukkit.getWorld("world"), x, y, z);
            player.teleport(location);
            player.playSound(player.getLocation(), Sound.valueOf("ENTITY_ENDERMAN_TELEPORT"), 1, 1);
            player.sendMessage("§aTéléporté à la mairie !");
        }
        return false;
    }
}