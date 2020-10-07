package com.isnakebuzz.servernpc.Events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NPCLoadEvent extends Event {

    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

}
