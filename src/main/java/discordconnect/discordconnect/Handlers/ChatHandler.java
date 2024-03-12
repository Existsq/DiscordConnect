package discordconnect.discordconnect.Handlers;

import discordconnect.discordconnect.DiscordConnect;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatHandler implements Listener {

    public ChatHandler(DiscordConnect plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public String onMessageSent(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();

        Bukkit.getLogger().info(message + "(by " + player.getName() + ")");
        return event.getMessage();
    }

}
