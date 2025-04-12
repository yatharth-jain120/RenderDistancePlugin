package com.yatharth.render;

import org.bukkit.plugin.java.JavaPlugin;

public class RenderPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("RenderDistancePlugin enabled");
        this.getCommand("setrd").setExecutor(new RenderDistanceCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("RenderDistancePlugin disabled");
    }
}
