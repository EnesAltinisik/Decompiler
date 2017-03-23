package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzaf;

public class DataItemBuffer extends zzf<DataItem> implements Result {
    private final Status zzaaO;

    public DataItemBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zzaaO = new Status(dataHolder.getStatusCode());
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    protected /* synthetic */ Object zzm(int i, int i2) {
        return zzy(i, i2);
    }

    protected String zzsW() {
        return "path";
    }

    protected DataItem zzy(int i, int i2) {
        return new zzaf(this.zzamz, i, i2);
    }
}
