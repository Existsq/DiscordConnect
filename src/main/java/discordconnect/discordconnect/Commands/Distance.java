package discordconnect.discordconnect.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Distance implements CommandExecutor {

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
            Player playerToMeasure = Bukkit.getServer().getPlayer(args[0]);

            assert playerToMeasure != null;
            Location playerToMeasureLocation = playerToMeasure.getLocation();

            Location senderPlayerLocation = player.getLocation();
            int distance = (int) senderPlayerLocation.distance(playerToMeasureLocation);

            if (distance <= 50) {
                player.sendMessage(playerToMeasure.getName() + " " + distance  + " " + "blocks away from you. Be careful!");
            } else {
                player.sendMessage(playerToMeasure.getName() + " " + distance + " " + "blocks away from you.");
            }


        }

        return true;
    }

}
