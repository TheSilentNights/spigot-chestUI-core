package com.thesilentnights.chestui.service;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChestUIHolderImpl implements ChestUIHolder {
    private Inventory inventory;
    private Player viewerName;

    public ChestUIHolderImpl() {

    }


    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public Player getViewer() {
        return viewerName;
    }
}
