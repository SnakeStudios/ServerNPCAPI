package com.isnakebuzz.servernpc.NPC.Utilities;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@Data
@AllArgsConstructor
public class NPCSettings {

    private ItemStack helmet;
    private ItemStack chest;
    private ItemStack leggs;
    private ItemStack boots;

    private ItemStack mainHand;
    private ItemStack secondHand;

    private List<String> actions;

    private boolean lookClose;
    private boolean isSeated;
    private boolean nameTag;

    /*NPC Glowing*/
    private boolean glowing;
    private ChatColor glowingColor;

    @Accessors(fluent = true, chain = true)
    private boolean holder;

    private double lookRange;
    private int clickCD;

    public NPCSettings() {
        this(new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR), new ItemStack(Material.AIR), Lists.newArrayList(), false, false, false, false, ChatColor.DARK_GRAY, false, 6, 1);
    }


}
