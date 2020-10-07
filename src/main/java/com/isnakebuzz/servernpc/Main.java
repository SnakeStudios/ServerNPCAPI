package com.isnakebuzz.servernpc;

import com.isnakebuzz.servernpc.API.ServerNPCAPI;
import com.isnakebuzz.servernpc.Holograms.SnakeHologram;
import com.isnakebuzz.servernpc.NPC.SnakeNPC;
import com.isnakebuzz.servernpc.NPC.Utilities.NPCSettings;
import com.isnakebuzz.servernpc.Skins.SkinData;
import org.bukkit.Location;

import java.util.UUID;

public interface Main {

    /**
     * Get the API
     *
     * @return ServerNPCAPI
     */
    static ServerNPCAPI getAPI() {
        return new ServerNPCAPI() {
            @Override
            public SnakeNPC createNPC(String name, UUID uuid, NPCSettings npcSettings, SkinData skinData, Location location, SnakeHologram hologram) throws Exception {
                return null;
            }

            @Override
            public SnakeNPC createNPC(String name, UUID uuid, NPCSettings npcSettings, String skinName, Location location, SnakeHologram hologram) throws Exception {
                return null;
            }
        };
    }


}
