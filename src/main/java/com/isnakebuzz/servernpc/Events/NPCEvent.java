package com.isnakebuzz.servernpc.Events;

import com.isnakebuzz.servernpc.NPC.SnakeNPC;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public abstract class NPCEvent extends Event {

    private Player player;
    private SnakeNPC npc;

    public NPCEvent(Player player, SnakeNPC npc) {
        this.player = player;
        this.npc = npc;
    }

    public Player getPlayer() {
        return this.player;
    }

    public SnakeNPC getSnakeNPC() {
        return npc;
    }
}
