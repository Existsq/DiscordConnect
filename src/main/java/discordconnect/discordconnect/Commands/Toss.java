package discordconnect.discordconnect.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Toss implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
        }

        Player player = (Player) sender;

        if (args.length == 0) {
            player.sendMessage("You need to provide a player nickname");
        } else if (args.length == 1){
            Player playerToToss = Bukkit.getPlayer(args[0]);

            if (playerToToss == null) {
                Bukkit.getLogger().info("An error occurred!");
                return false;
            } else {
                Location playerToTossLocation = playerToToss.getLocation();
                playerToTossLocation.setY(320);
                playerToToss.teleport(playerToTossLocation);

            }
        }



        return true;
    }
}
