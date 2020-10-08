package dev.bsdlp;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * says the player name when they connect.
 */
public class Events implements Listener {
    /**
     * registers a handler on player connect.
     * @param event
     */
    @EventHandler
    public void onPostLogin(PostLoginEvent event) {
        ProxyServer.getInstance().getLogger().info(event.getPlayer().getName() + " has connected");
    }

    /**
     * registers a handler on player disconnect.
     * @param event
     */
    @EventHandler
    public void onPlayerDisconnect(PlayerDisconnectEvent event) {
        ProxyServer.getInstance().getLogger().info(event.getPlayer().getName() + " has disconnected");
    }
}
