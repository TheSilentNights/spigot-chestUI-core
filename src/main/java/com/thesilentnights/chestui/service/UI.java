package com.thesilentnights.chestui.service;

import com.thesilentnights.chestui.repo.MenuRepo;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class UI
{
    //初始化inventory并且展示给player
    public static void openToPlayer(Player player, String name, ChestUIHolder holder)
    {
        Inventory inventory = Bukkit.createInventory(holder, 54);

        holder.getProvider().getElements().forEach((integer, element) ->
                inventory.setItem(integer, element.getItemStack()));

        holder.setInventory(inventory);
        MenuRepo.register(holder);

        player.openInventory(inventory);
    }

}
