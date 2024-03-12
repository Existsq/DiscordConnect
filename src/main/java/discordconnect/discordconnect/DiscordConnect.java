package discordconnect.discordconnect;
import discordconnect.discordconnect.Commands.*;

import discordconnect.discordconnect.Handlers.ChatHandler;
import discordconnect.discordconnect.Handlers.PlayerHandler;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordConnect extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("DiscordConnector is working!");

        getCommand("gm").setExecutor(new Gamemode());
        getCommand("burn").setExecutor(new Burn());
        getCommand("toss").setExecutor(new Toss());
        getCommand("distance").setExecutor(new Distance());
        getCommand("heal").setExecutor(new Heal());
        getCommand("pinfo").setExecutor(new PlayerInfo());

        new PlayerHandler(this);
        new ChatHandler(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("DiscordConnector is turning off!");
    }
}
