package com.thesilentnights.chestui;

import com.thesilentnights.chestui.commands.Debug;
import com.thesilentnights.chestui.events.PlayerClickListener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class ChestUI extends JavaPlugin
{
    public static Logger logger;
    public static ChestUI instance;

    @Override
    public void onDisable()
    {
        super.onDisable();
    }

    @Override
    public void onEnable()
    {
        ChestUI.logger = this.getLogger();
        instance = this;
        getServer().getPluginManager().registerEvents(new PlayerClickListener(), this);
        Objects.requireNonNull(getCommand("debug")).setExecutor(new Debug());
    }
}
