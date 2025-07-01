package com.thesilentnights.chestui.service;

import com.thesilentnights.chestui.components.Button;
import com.thesilentnights.chestui.components.ChestElement;

import java.util.Hashtable;
import java.util.Map;

public class InventoryProviderImpl implements InventoryProvider {
    private final int permission;
    private final Map<Integer, ChestElement> itemTable = new Hashtable<>();

    public InventoryProviderImpl(int permission) {
        this.permission = permission;
    }

    @Override
    public int getPermission() {
        return permission;
    }

    @Override
    public Map<Integer, ChestElement> getElements() {
        return itemTable;
    }


    @Override
    public ChestElement getChestItem(int slot) {
        return itemTable.get(slot);
    }

    public void addButton(Button button) {
        itemTable.put(button.getSlot(), button);
    }

    public void addElement(ChestElement element) {
        itemTable.put(element.getSlot(), element);
    }


}
