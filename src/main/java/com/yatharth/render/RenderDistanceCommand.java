package com.yatharth.render;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RenderDistanceCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage("Only players can use this command.");
            return true;
        }

        if (args.length != 1) {
            player.sendMessage("Usage: /setrd <distance>");
            return true;
        }

        try {
            int distance = Integer.parseInt(args[0]);
            if (distance < 2 || distance > 32) {
                player.sendMessage("Render distance must be between 2 and 32.");
                return true;
            }

            player.setSendViewDistance(distance);
            player.sendMessage("Set server-side render distance to " + distance);
        } catch (NumberFormatException e) {
            player.sendMessage("Invalid number.");
        }

        return true;
    }
}
