package com.google.android.gms.games.request;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;

public final class GameRequestBuffer extends zzf<GameRequest> {
    public GameRequestBuffer(DataHolder dataHolder) {
        super(dataHolder);
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzu(i, i2);
    }

    protected String zzsW() {
        return "external_request_id";
    }

    protected GameRequest zzu(int i, int i2) {
        return new GameRequestRef(this.zzamz, i, i2);
    }
}
