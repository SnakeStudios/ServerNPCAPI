package com.isnakebuzz.servernpc.API;

import com.isnakebuzz.servernpc.Holograms.SnakeHologram;
import com.isnakebuzz.servernpc.NPC.SnakeNPC;
import com.isnakebuzz.servernpc.NPC.Utilities.NPCSettings;
import com.isnakebuzz.servernpc.Skins.SkinData;
import org.bukkit.Location;

import java.util.UUID;

public interface ServerNPCAPI {

    /**
     * Create a NPC with skin data
     *
     * @param name        Name for the NPC
     * @param uuid        UUID for the NPC
     * @param npcSettings Settings for the NPC
     * @param skinData    NPC Skin data
     * @param location    Locations for the NPC
     * @param hologram    Hologram if has created
     * @return SnakeNPC
     * @throws Exception
     */
    SnakeNPC createNPC(String name, UUID uuid, NPCSettings npcSettings, SkinData skinData, Location location, SnakeHologram hologram) throws Exception;

    /**
     * Create a NPC with names
     *
     * @param name        Name of the NPC
     * @param uuid        UUID of the NPC
     * @param npcSettings Settings for the NPC
     * @param skinName    PlayerName or the SkinName
     * @param location    Locations of the NPC
     * @param hologram    Hologram if has created.
     * @return SnakeNPC
     * @throws Exception
     */
    SnakeNPC createNPC(String name, UUID uuid, NPCSettings npcSettings, String skinName, Location location, SnakeHologram hologram) throws Exception;

}
