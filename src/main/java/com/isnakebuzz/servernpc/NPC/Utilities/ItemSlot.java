package com.isnakebuzz.servernpc.NPC.Utilities;

public enum ItemSlot {

    HAND(0, "mainhand"),
    HAND2(0, "offhand"),
    BOOTS(1, "feet"),
    LEGGINGS(2, "legs"),
    CHESTPLATE(3, "chest"),
    HELMET(4, "head");


    private Integer value;
    private String name;

    ItemSlot(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name.toUpperCase();
    }
}
