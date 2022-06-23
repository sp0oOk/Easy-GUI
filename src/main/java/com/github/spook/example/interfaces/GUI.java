package com.github.spook.example.interfaces;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public interface GUI extends InventoryHolder {
    void onClick(final Player player, final ClickType clickType, final int slot, final ItemStack clickedItem, final Inventory eventInventory);
    void onClose(final Player player);
}
