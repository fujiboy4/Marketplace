package me.benprog19.marketplace.main;

import me.benprog19.marketplace.utils.ChatUtils;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 * Created by Ben on 11/1/2023.
 * -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
 */

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatUtils.PLUGIN_PREFIX + "Starting Marketplace, please wait for plugin to load...");
    }

    @Override
    public void onDisable() {

    }

}
