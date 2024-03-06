package discordconnect.discordconnect;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordConnect extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("DiscordConnector is working!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("DiscordConnector is turning off!");
    }
}
