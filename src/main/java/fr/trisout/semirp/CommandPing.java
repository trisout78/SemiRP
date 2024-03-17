package fr.trisout.semirp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandPing implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("ping")) {
            long startTime = System.currentTimeMillis();
            long endTime = System.currentTimeMillis();
            long duration = endTime - startTime;
            sender.sendMessage("Pong! " + duration + "ms");
            return true;
        }
        return false;
    }
}