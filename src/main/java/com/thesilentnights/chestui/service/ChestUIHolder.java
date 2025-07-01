package com.thesilentnights.chestui.service;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public interface ChestUIHolder extends InventoryHolder
{
    Player getViewer();

    void setInventory(Inventory inventory);

    InventoryProvider getProvider();

    //在哪一个槽位执行
    void executeOn(int slot);
}
