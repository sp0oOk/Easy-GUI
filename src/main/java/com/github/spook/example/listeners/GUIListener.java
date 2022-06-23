package com.github.spook.example.listeners;

import com.github.spook.example.interfaces.GUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class GUIListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onClick(InventoryClickEvent event) {
        if(!(event.getInventory().getHolder() instanceof GUI) || event.getCurrentItem() == null) return;
        final GUI currentGUI = (GUI) event.getInventory().getHolder();
        event.setCancelled(true);
        currentGUI.onClick((Player) event.getWhoClicked(), event.getClick(), event.getRawSlot(), event.getCurrentItem(), event.getInventory());
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void onClose(InventoryCloseEvent event) {
        if(!(event.getInventory().getHolder() instanceof GUI)) return;
        ((GUI) event.getInventory().getHolder()).onClose((Player) event.getPlayer());
    }

}
