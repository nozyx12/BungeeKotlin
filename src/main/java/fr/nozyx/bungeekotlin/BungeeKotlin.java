package fr.nozyx.bungeekotlin;

import net.md_5.bungee.api.plugin.Plugin;

public class BungeeKotlin extends Plugin {
    public void onEnable() {
        this.getLogger().info("BungeeKotlin started ! (Kotlin v2.0.0)");
    }

    public void onDisable() {
        this.getLogger().info("BungeeKotlin stopping!");
    }
}
