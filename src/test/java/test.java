import com.isnakebuzz.servernpc.Main;
import com.isnakebuzz.servernpc.NPC.SnakeNPC;
import com.isnakebuzz.servernpc.NPC.Utilities.NPCSettings;
import com.isnakebuzz.servernpc.Skins.SkinData;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.UUID;

public class test {

    public void test() throws Exception {

        Location loc = new Location(Bukkit.getWorld("world"), 0,  100, 0);
        NPCSettings npcSettings = new NPCSettings();

        UUID uuid = UUID.randomUUID();

        SkinData skinData = new SkinData("value", "signature", uuid);

        // Automatically
        SnakeNPC snakeNPC = Main.getAPI().createNPC("asdasd", uuid, npcSettings, skinData, loc, null);

    }

}
