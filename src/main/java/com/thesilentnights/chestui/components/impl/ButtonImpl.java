package com.thesilentnights.chestui.components.impl;

import com.thesilentnights.chestui.components.Button;
import com.thesilentnights.chestui.components.Function;
import org.bukkit.inventory.ItemStack;

public class ButtonImpl implements Button
{
    private ItemStack itemStack;
    private int slot;
    private Function function;

    public ButtonImpl(ItemStack itemStack, int slot, Function function)
    {
        this.itemStack = itemStack;
        this.slot = slot;
        this.function = function;
    }

    @Override
    public ItemStack getItemStack()
    {
        return itemStack;
    }

    @Override
    public int getSlot()
    {
        return slot;
    }

    @Override
    public Function getFunction()
    {
        return function;
    }

}
