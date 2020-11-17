package com.dargen;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

    public class Main extends JavaPlugin implements CommandExecutor {
        public void onEnable() {
            if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
                (new PlaceHolders(this)).register();
            }

            (new BoardUpdater()).runTaskTimer(this, 0L, 100L);
            this.getCommand("fly").setExecutor(this);
            Bukkit.getPluginManager().registerEvents(new Events(), this);
        }

        public void onDisable() {
        }

        public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (command.getName().equalsIgnoreCase("fly") && sender instanceof Player) {
                Player player = (Player)sender;
                if (player.hasPermission("lobby.fly")) {
                }
            }

            return true;
        }
    }

