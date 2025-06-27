package com.thesilentnights.inventory;

import com.thesilentnights.components.ChestItem;
import org.bukkit.inventory.Inventory;

public interface InventoryProvider {
    Inventory getInventory();
    int getPermission();
    void addItem(ChestItem item);
}
