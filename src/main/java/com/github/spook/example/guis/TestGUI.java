package com.github.spook.example.guis;

import com.github.spook.example.interfaces.GUI;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class TestGUI implements GUI {

    @Override
    public void onClick(Player player, ClickType clickType, int slot, ItemStack clickedItem, Inventory eventInventory) {
        if(!clickType.equals(ClickType.LEFT)) return;
        if(slot == 0) {
            player.sendMessage("You clicked bedrock, changing gamemode!");
            player.setGameMode(GameMode.CREATIVE);
        }
    }

    @Override
    public void onClose(Player player) {
        player.sendMessage("You have closed the example GUI");
    }

    @Override
    public Inventory getInventory() {
        final Inventory inventory = Bukkit.createInventory(this, 9, "Example GUI");
        inventory.setItem(0, new ItemStack(Material.BEDROCK, 1));
        return inventory;
    }
}
