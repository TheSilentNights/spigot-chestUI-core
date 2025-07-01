package com.thesilentnights.chestui.service;

import com.thesilentnights.chestui.components.Button;
import com.thesilentnights.chestui.components.ChestElement;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChestUIHolderImpl implements ChestUIHolder {
    private final InventoryProvider provider;
    private Inventory inventory;
    private Player viewerName;

    public ChestUIHolderImpl(Player viewer, InventoryProvider provider) {
        this.viewerName = viewer;
        this.provider = provider;
    }


    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public InventoryProvider getProvider() {
        return provider;
    }

    @Override
    public void executeOn(int slot) {
        ChestElement chestItem = provider.getChestItem(slot);
        if (chestItem instanceof Button button) {
            button.getFunction().execute(viewerName);
        }
    }

    @Override
    public Player getViewer() {
        return viewerName;
    }
}
