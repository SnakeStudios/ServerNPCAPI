import com.isnakebuzz.servernpc.Main;
import com.isnakebuzz.servernpc.NPC.Utilities.NPCSettings;
import com.isnakebuzz.servernpc.Skins.SkinData;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.UUID;

public class test {

    public void test() throws Exception {

        //Name of the NPC || 16 length longer.
        String name = "testNPC";

        // Location of the NPC
        Location loc = new Location(Bukkit.getWorld("world"), 0, 100, 0);

        // Settings for the NPC
        NPCSettings npcSettings = new NPCSettings();

        // UUID of the NPC
        UUID uuid = UUID.randomUUID();

        // Skin Information - Also you can use nicks.
        SkinData skinData = new SkinData("value", "signature", uuid);

        // Creating the NPC || It returns SnakeNPC if you need it.
        Main.getAPI().createNPC(name, uuid, npcSettings, skinData, loc, null);

    }

}
