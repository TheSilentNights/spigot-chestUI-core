package com.thesilentnights.components;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Button extends ChestItem{
    Function getFunction();
    //检测button按钮权限
    boolean checkPermission(Player clicker);
}
