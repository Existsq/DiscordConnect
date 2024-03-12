package discordconnect.discordconnect.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("§cYou need to provide a gamemode!");
        } else {
            switch (args[0].toLowerCase(Locale.ROOT)) {
                case "survival":
                case "0":
                    player.setGameMode(GameMode.SURVIVAL);
                    player.sendTitle("§aSURVIVAL MODE", "");
                    break;
                case "creative":
                case "1":
                    player.setGameMode(GameMode.CREATIVE);
                    player.sendTitle("§aCREATIVE MODE", "");
                    break;
                case "adventure":
                case "2":
                    player.setGameMode(GameMode.ADVENTURE);
                    player.sendTitle("§aADVENTURE MODE", "");
                    break;
                case "spectator":
                case "3":
                    player.setGameMode(GameMode.SPECTATOR);
                    player.sendTitle("§aSPECTATOR MODE", "");
                    break;
                default:
                    player.sendMessage("§cYou have entered the wrong gamemode!");
                    break;
            }
        }

        return true;
    }

}
