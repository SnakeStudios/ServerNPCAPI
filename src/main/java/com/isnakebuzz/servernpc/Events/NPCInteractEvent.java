package com.isnakebuzz.servernpc.Events;

import com.isnakebuzz.servernpc.NPC.SnakeNPC;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

public class NPCInteractEvent extends NPCEvent implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final ClickType clickType;
    private final SnakeNPC npc;
    private boolean cancelled;

    public NPCInteractEvent(Player player, ClickType clickType, SnakeNPC npc) {
        super(player, npc);
        this.player = player;
        this.clickType = clickType;
        this.npc = npc;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getWhoClicked() {
        return this.player;
    }

    public ClickType getClickType() {
        return this.clickType;
    }

    public SnakeNPC getSnakeNPC() {
        return this.npc;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }

    public enum ClickType {
        LEFT_CLICK, RIGHT_CLICK
    }

}
