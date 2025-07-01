package com.thesilentnights.chestui.commands;

import com.thesilentnights.chestui.repo.MenuRepo;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Debug implements Commands {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
        player.openInventory(MenuRepo.getByName("debug").getInventory());
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("");
    }
}
