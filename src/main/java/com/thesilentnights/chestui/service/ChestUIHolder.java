package com.thesilentnights.chestui.service;

import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryHolder;

public interface ChestUIHolder extends InventoryHolder {
    Player getViewer();
}
