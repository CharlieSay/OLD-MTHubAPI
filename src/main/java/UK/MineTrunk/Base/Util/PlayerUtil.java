/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UK.MineTrunk.Base.Util;

import java.util.LinkedList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class PlayerUtil {

    public static void message(org.bukkit.entity.Entity client, LinkedList<String> messageList) {
        message(client, messageList, false);
    }

    public static void message(org.bukkit.entity.Entity client, String message) {
        message(client, message, false);
    }

    public static void message(org.bukkit.entity.Entity client, LinkedList<String> messageList, boolean wiki) {
        for (String curMessage : messageList) {
            message(client, curMessage, wiki);
        }
    }

    public static void message(org.bukkit.entity.Entity client, String message, boolean wiki) {
        if (client == null) {
            return;
        }
        if (!(client instanceof Player)) {
            return;
        }

        ((Player) client).sendMessage(message);
    }

    public static void kick(Player player, String module, String message, boolean log) {
        if (player == null) {
            return;
        }
        String out = ChatColor.RED + module
                + ChatColor.WHITE + " - "
                + ChatColor.YELLOW + message;
        player.kickPlayer(out);

        if (log) {
            System.out.println("Kicked Client [" + player.getName() + "] for [" + module + " - " + message + "]");
        }
    }

    
    public static boolean isOnline(String name) {
        Player player = Bukkit.getPlayerExact(name);
        if(player == null)
        {
            return true;
        }else{
            return false;
        }
    }

    public static String safeNameLength(String name) {
        if (name.length() > 16) {
            name = name.substring(0, 16);
        }
        return name;
    }
}
