package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig.Builder;

public final class RoomConfigImpl extends RoomConfig {
    private final int zzaQL;
    private final RoomUpdateListener zzaQW;
    private final RoomStatusUpdateListener zzaQX;
    private final RealTimeMessageReceivedListener zzaQY;
    private final Bundle zzaRb;
    private final String[] zzaRc;
    private final String zzaaF;

    RoomConfigImpl(Builder builder) {
        this.zzaQW = builder.zzaQW;
        this.zzaQX = builder.zzaQX;
        this.zzaQY = builder.zzaQY;
        this.zzaaF = builder.zzaQZ;
        this.zzaQL = builder.zzaQL;
        this.zzaRb = builder.zzaRb;
        this.zzaRc = (String[]) builder.zzaRa.toArray(new String[builder.zzaRa.size()]);
        zzaa.zzb(this.zzaQY, (Object) "Must specify a message listener");
    }

    public Bundle getAutoMatchCriteria() {
        return this.zzaRb;
    }

    public String getInvitationId() {
        return this.zzaaF;
    }

    public String[] getInvitedPlayerIds() {
        return this.zzaRc;
    }

    public RealTimeMessageReceivedListener getMessageReceivedListener() {
        return this.zzaQY;
    }

    public RoomStatusUpdateListener getRoomStatusUpdateListener() {
        return this.zzaQX;
    }

    public RoomUpdateListener getRoomUpdateListener() {
        return this.zzaQW;
    }

    public int getVariant() {
        return this.zzaQL;
    }
}
