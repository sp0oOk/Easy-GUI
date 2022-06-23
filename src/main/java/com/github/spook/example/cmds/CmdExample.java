package com.github.spook.example.cmds;

import com.github.spook.example.guis.TestGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExample implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("You cannot execute this command!");
            return false;
        }
        final Player player = (Player) sender;
        player.openInventory(new TestGUI().getInventory());
        return false;
    }
}
