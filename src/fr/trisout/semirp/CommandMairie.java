package fr.trisout.semirp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandMairie implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player)sender;
            Location location = new Location(Bukkit.getWorld("world"), -1179, 120, 1177);
            player.teleport(location);
            player.playSound(player.getLocation(), Sound.valueOf("ENTITY_ENDERMAN_TELEPORT"), 1, 1);
            player.sendMessage("§aTéléporté à la mairie !");
        }
        return false;
    }
}
