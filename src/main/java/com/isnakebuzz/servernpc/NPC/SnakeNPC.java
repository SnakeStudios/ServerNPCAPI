package com.isnakebuzz.servernpc.NPC;

import com.isnakebuzz.servernpc.Holograms.SnakeHologram;
import com.isnakebuzz.servernpc.NPC.Utilities.ItemSlot;
import com.isnakebuzz.servernpc.NPC.Utilities.NPCSettings;
import com.isnakebuzz.servernpc.Skins.SkinData;
import com.mojang.authlib.GameProfile;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.UUID;

public interface SnakeNPC {

    /**
     * Get NPC name
     *
     * @return name of the NPC
     */
    String getName();

    /**
     * Shows the NPC to the player
     *
     * @param player The player to show.
     */
    void show(Player player);

    /**
     * Hide the NPC to the player
     *
     * @param player The player to hide.
     */
    void hide(Player player);

    /**
     * Sit NPC
     *
     * @param seated The sit state for NPC.
     */
    void setSeated(boolean seated);

    /**
     * Remove player from ram.
     *
     * @param player The player to remove from ram.
     */
    void onLeave(Player player);

    /**
     * Get hologram of NPC.
     *
     * @return Hologram of NPC.
     */
    SnakeHologram getHologram();

    /**
     * Set new hologram for the NPC
     *
     * @param hologram New hologram for NPC
     */
    void setHologram(SnakeHologram hologram);

    /**
     * Update GameProfile of the NPC
     * Its common used for change skin and name.
     *
     * @param profileName The NPC displayname
     * @param uuid        The NPC UUID
     * @param skinData    The NPC Skin data.
     */
    void updateGameProfile(String profileName, UUID uuid, @Nonnull SkinData skinData);

    /**
     * Update GameProfile of the NPC
     * Its common used for change skin and name.
     *
     * @param itemSlot     Slot of the item
     * @param itemOnCursor Item for the NPC
     */
    void equip(ItemSlot itemSlot, ItemStack itemOnCursor);

    /**
     * Get the GameProfile of the NPC.
     *
     * @return The GameProfile of the NPC
     */
    GameProfile getGameProfile();

    /**
     * Get the NPC world.
     *
     * @return World of the NPC
     */
    World getWorld();

    /**
     * Get the location of the NPC.
     *
     * @return The location of the NPC.
     */
    Location getLocation();

    /**
     * Transports the NPC to location.
     *
     * @param location new location of NPC.
     */
    void setLocation(Location location);

    /**
     * Animation for NPC
     *
     * @param id of animation of the NPC
     */
    void sendAnimation(int id);

    /**
     * Change glowing state.
     *
     * @param state new state of Glowing.
     */
    void setGlowing(Boolean state);

    /**
     * Get the players viewing the NPC.
     *
     * @return The list of players viewing NPC.
     */
    List<UUID> getRendered();

    /**
     * Get the NPC settings.
     *
     * @return NPC Settings.
     */
    NPCSettings getNpcSettings();

    /**
     * Get the entity ID.
     *
     * @return The id of the NPC.
     */
    int getEntityID();

    /**
     * Get the entity UUID.
     *
     * @return The uuid of the NPC.
     */
    UUID getUuid();

    /**
     * Get the NPC status of looking.
     *
     * @return If the NPC is looking or not
     */
    boolean isLooking();

    /**
     * Get the NPC status of looking.
     *
     * @param player Look at player
     */
    void lookAt(Player player);

    /**
     * Update NPC skin.
     *
     * @param skinData to change the NPC
     */
    void updateSkin(SkinData skinData);

    /**
     * Set default looking of NPC.
     *
     * @param player Packet to player
     */
    void setDefaultLooking(Player player);


    /**
     * Update Scoreboard of NPC
     */
    void updateScore();

    /**
     * Get the NPC Deleted status.
     *
     * @return If the NPC is deleted or not
     */
    boolean isDeleted();

    /**
     * Delete NPC instance.
     */
    void delete();

}
