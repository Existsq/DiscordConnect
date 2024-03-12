package discordconnect.discordconnect.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.net.InetSocketAddress;
import java.util.UUID;

public class PlayerInfo implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command.");
        }

        assert sender instanceof Player;
        Player player = (Player) sender;
        int playerPing = player.getPing();
        InetSocketAddress socketAddress = player.getAddress();
        assert socketAddress != null;
        String hostname = socketAddress.getHostString();
        UUID UUID = player.getPlayerProfile().getUniqueId();

        player.sendMessage("Nickname: " + player.getName() + "\nSocket Address: " + socketAddress.toString().substring(1) + "\nPlayer ping: " + playerPing + "ms\nHostname: " + hostname + "\nPort: " + socketAddress.getPort() + "\nUUID: " + UUID);
        return true;
    }
}
