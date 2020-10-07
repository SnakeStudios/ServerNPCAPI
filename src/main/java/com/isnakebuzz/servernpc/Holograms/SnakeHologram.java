package com.isnakebuzz.servernpc.Holograms;

import org.bukkit.Location;

import java.util.List;

public interface SnakeHologram extends Cloneable {

    /**
     * Spawn hologram to all entities
     */
    void spawn();

    /**
     * Get location of hologram
     *
     * @return Location of Hologram
     */
    Location getLocation();

    /**
     * Set location of hologram
     *
     * @param location is the new Location to Hologram
     */
    void setLocation(Location location);

    /**
     * Get lines of hologram
     *
     * @return lines of hologram
     */
    List<String> getLines();

    /**
     * Set new lines for the Hologram
     *
     * @param lines of the hologram
     */
    void setLines(List<String> lines);

    /**
     * Get height of hologram
     *
     * @return height of hologram
     */
    double getHeight();

    /**
     * Set height of hologram
     *
     * @param height of hologram
     */
    void setHeight(double height);

    /**
     * Recreate hologram
     */
    void reload();

    /**
     * Clone Hologram
     */
    SnakeHologram clone();

    /**
     * Delete hologram
     */
    void delete();

}
