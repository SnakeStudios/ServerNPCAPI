package com.isnakebuzz.servernpc.Skins;

import lombok.Getter;

import javax.annotation.Nullable;
import java.util.UUID;

@Getter
public class SkinData {

    private String value;
    private String signature;
    private UUID uuid;

    public SkinData(String value, String signature, @Nullable UUID uuid) {
        this.value = value;
        this.signature = signature;
        this.uuid = uuid;
    }

}
