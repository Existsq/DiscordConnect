package discordconnect.discordconnect.Handlers;

import discordconnect.discordconnect.DiscordConnect;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class PlayerHandler implements Listener {


    public PlayerHandler(DiscordConnect discordConnect) {
        Bukkit.getPluginManager().registerEvents(this, discordConnect);
    }


    @EventHandler
    public void onPLayerQuit(PlayerQuitEvent event) {
        String nickname = event.getPlayer().getName();

        Bukkit.getLogger().info("Player (" + nickname + ") joined a server!");
    }


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String nickname = event.getPlayer().getName();

        player.sendTitle("§a§lWelcome, " + nickname + "!", "§7Feel at home");

        Bukkit.getLogger().info("Player (" + nickname + ") joined a server!");
    }
}


/*
        double totalTime = 6.0;
        double time = 6.0;

        BossBar bossBar = Bukkit.createBossBar("Welcome to the server, " + nickname + "!", BarColor.PURPLE, BarStyle.SEGMENTED_6);
        bossBar.addPlayer(player);


        for (int i = 0; i < 6; i++) {
            // Setting progress +1 each second
            double percentage = time/totalTime;
            time--;
            bossBar.setProgress(percentage);

            if (time <= 0) {
                break;
            }

        }
 */