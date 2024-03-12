package discordconnect.discordconnect.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Burn implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
        }

        assert sender instanceof Player;
        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("You need to provide a player nickname!");
        } else if (args.length == 1) {
            Player playerToBurn = Bukkit.getServer().getPlayer(args[0]);

            if (playerToBurn == null) {
                Bukkit.getLogger().info("An error occurred!");
                return false;
            } else {
                playerToBurn.setFireTicks(150);
            }
        }

        return true;
    }

}
