package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzz;

public class DataEventBuffer extends zzf<DataEvent> implements Result {
    private final Status zzaaO;

    public DataEventBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzaaO = new Status(dataHolder.getStatusCode());
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzx(i, i2);
    }

    protected String zzsW() {
        return "path";
    }

    protected DataEvent zzx(int i, int i2) {
        return new zzz(this.zzamz, i, i2);
    }
}
