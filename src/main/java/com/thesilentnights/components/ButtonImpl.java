package com.thesilentnights.components;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ButtonImpl implements Button{
    private ItemStack itemStack;
    private int slot;
    private Function function;

    public ButtonImpl(ItemStack itemStack, int slot, Function function) {
        this.itemStack = itemStack;
        this.slot = slot;
        this.function = function;
    }

    @Override
    public ItemStack getItemStack() {
        return null;
    }

    @Override
    public int getSlot() {
        return slot;
    }

    @Override
    public Function getFunction() {
        return function;
    }

    @Override
    public boolean checkPermission(Player clicker) {
        return false;
    }




}
