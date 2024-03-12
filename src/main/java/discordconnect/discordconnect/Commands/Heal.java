package discordconnect.discordconnect.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;


public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
        }

        Damageable player = (Damageable) sender;

        if (args.length == 0) {
            player.setHealth(player.getMaxHealth());
            player.sendMessage("You have healed yourself");
        } else {
            Damageable playerToHeal = Bukkit.getPlayer(args[0]);

            assert playerToHeal != null;
            playerToHeal.setHealth(player.getMaxHealth());
            player.sendMessage("You have healed " + playerToHeal.getName() + "!");
        }

        return true;
    }

}
