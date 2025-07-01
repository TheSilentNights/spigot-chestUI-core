package com.thesilentnights.chestui.service;

import com.thesilentnights.chestui.components.ChestElement;

import java.util.Map;

public interface InventoryProvider {
    int getPermission();

    Map<Integer, ChestElement> getElements();

    ChestElement getChestItem(int slot);
}
