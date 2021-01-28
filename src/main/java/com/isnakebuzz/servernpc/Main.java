package com.isnakebuzz.servernpc;

import com.isnakebuzz.servernpc.API.ServerNPCAPI;

public interface Main {


    /**
     * @return The NPC api.
     * @since 1.13.0 this was deprecated.
     * @deprecated Replaced by {@link ServerNPC#getAPI()}
     */
    @Deprecated
    public static ServerNPCAPI getAPI() {
        return ServerNPC.getAPI();
    }

}
