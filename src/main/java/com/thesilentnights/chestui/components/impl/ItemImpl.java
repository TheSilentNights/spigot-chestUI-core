package com.thesilentnights.chestui.components.impl;

import com.thesilentnights.chestui.components.ChestElement;
import org.bukkit.inventory.ItemStack;

//default item
public class ItemImpl implements ChestElement {
    private final ItemStack itemStack;
    private final int slot;

    public ItemImpl(ItemStack itemStack, int slot) {
        this.itemStack = itemStack;
        this.slot = slot;
    }

    @Override
    public ItemStack getItemStack() {
        return itemStack;
    }

    @Override
    public int getSlot() {
        return slot;
    }
}
