package com.thesilentnights.chestui;

import com.thesilentnights.chestui.commands.Debug;
import com.thesilentnights.chestui.repo.MenuRepo;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;
import java.util.logging.Logger;

public class ChestUI extends JavaPlugin {
    public static Logger logger;
    public static ChestUI instance;

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        ChestUI.logger = this.getLogger();
        instance = this;
        try {
            MenuRepo.register(
                    "debug",
                    InventoryProviderFactory.create(54, 4)
            );
        } catch (IllegalArgumentException e) {
            logger.info("error while loading");
        }
        InventoryProviderFactory.create(54, 4);
        Objects.requireNonNull(getCommand("debug")).setExecutor(new Debug());
    }
}
