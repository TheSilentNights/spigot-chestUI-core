package com.thesilentnights.chestui.events;

import com.thesilentnights.chestui.repo.MenuRepo;
import com.thesilentnights.chestui.service.ChestUIHolder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerClickListener implements Listener {
    @EventHandler
    public void handleClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        ChestUIHolder viewer = MenuRepo.findViewer(player);
        viewer.executeOn(event.getSlot());
        event.setCancelled(true);
    }
}
