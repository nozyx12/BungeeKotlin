package fr.nozyx.bungeekotlin

import net.md_5.bungee.api.plugin.Plugin

class BungeeKotlin : Plugin() {
    override fun onEnable() {
        this.logger.info("BungeeKotlin started ! (Kotlin v2.0.0)")
    }

    override fun onDisable() {
        this.logger.info("BungeeKotlin stopping!")
    }
}