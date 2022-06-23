package com.github.spook.example;

import com.github.spook.example.cmds.CmdExample;
import com.github.spook.example.listeners.GUIListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Example extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GUIListener(), this);
        getCommand("example").setExecutor(new CmdExample());
    }

}
