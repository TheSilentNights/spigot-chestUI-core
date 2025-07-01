package com.thesilentnights.chestui.repo;

import com.thesilentnights.chestui.service.ChestUIHolder;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MenuRepo {
    static List<ChestUIHolder> chestUIHolders = new ArrayList<>();

    public static void register(ChestUIHolder holder) throws IllegalArgumentException {
        chestUIHolders.add(holder);
    }

    public static ChestUIHolder findViewer(Player player) {
        Optional<ChestUIHolder> first = chestUIHolders.stream().filter(holder -> holder.getViewer().getName().equals(player.getName())).findFirst();

        return first.orElse(null);
    }

    public static ChestUIHolder getByName(String name)
    {
        Optional<ChestUIHolder> first = chestUIHolders.stream().filter(holder -> holder.getViewer().getName().equals(name)).findFirst();
        return first.orElse(null);
    }
}
