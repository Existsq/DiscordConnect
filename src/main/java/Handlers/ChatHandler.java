package Handlers;

import discordconnect.discordconnect.DiscordConnect;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatHandler implements Listener {

    public ChatHandler(DiscordConnect plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }



    @EventHandler
    public void onMessageSent(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();

        

    }


    @EventHandler
    public void onTorchPlace(BlockPlaceEvent event) {
        Block block = event.getBlock();

        if (block.getType() != Material.TORCH) {
            return;
        }

        Bukkit.getLogger().info("A torch was placed!");
        Player player = event.getPlayer();
        player.setAllowFlight(true);
    }

}
