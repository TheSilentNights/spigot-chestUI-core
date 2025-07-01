package com.thesilentnights.chestui.commands;

import com.thesilentnights.chestui.components.Button;
import com.thesilentnights.chestui.components.Function;
import com.thesilentnights.chestui.service.ChestUIHolderImpl;
import com.thesilentnights.chestui.service.InventoryProviderImpl;
import com.thesilentnights.chestui.service.UI;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Debug implements Commands {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        InventoryProviderImpl inventoryProvider = new InventoryProviderImpl(4);
        inventoryProvider.addButton(new Button() {
            @Override
            public Function getFunction() {
                return new Function() {
                    @Override
                    public void execute(Player clicker) {
                        clicker.sendMessage("test success");
                    }
                };
            }

            @Override
            public ItemStack getItemStack() {
                return new ItemStack(Material.ACACIA_BUTTON);
            }

            @Override
            public int getSlot() {
                return 1;
            }
        });
        UI.openToPlayer(((Player) commandSender), ((Player) commandSender).getDisplayName(), new ChestUIHolderImpl((Player) commandSender, inventoryProvider));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
        return List.of("");
    }
}
