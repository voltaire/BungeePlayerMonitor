package dev.bsdlp;

import net.md_5.bungee.api.plugin.Plugin;

/**
 * Hello world!
 */
public class BungeecordPlayerMonitor extends Plugin {
    @Override
    public void onEnable() {
        getProxy().getPluginManager().registerListener(this, new Events());
    }
}
