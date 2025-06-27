package com.thesilentnights.inventory;

import com.thesilentnights.components.ChestItem;
import org.bukkit.block.Chest;
import org.bukkit.inventory.Inventory;

public class InventoryProviderImpl implements InventoryProvider {
    private Inventory inventory;
    private int permission;

    public InventoryProviderImpl(Inventory inventory, int permission) {
        this.inventory = inventory;
        this.permission = permission;
    }

    @Override
    public Inventory getInventory() {
        return null;
    }

    @Override
    public int getPermission() {
        return 0;
    }

    @Override
    public void addItem(ChestItem item) {
        if (checkItem(item)) {
            inventory.setItem(item.getSlot(), item.getItemStack());
        }
    }

    private boolean checkItem(ChestItem item) {
        return inventory.getItem(item.getSlot()) == null;
    }
}
