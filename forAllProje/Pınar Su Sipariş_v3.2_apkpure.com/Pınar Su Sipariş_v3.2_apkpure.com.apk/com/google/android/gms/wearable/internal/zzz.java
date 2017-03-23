package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class zzz extends zzc implements DataEvent {
    private final int zzaKH;

    public zzz(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zzaKH = i2;
    }

    public /* synthetic */ Object freeze() {
        return zzNF();
    }

    public DataItem getDataItem() {
        return new zzaf(this.zzamz, this.zzapa, this.zzaKH);
    }

    public int getType() {
        return getInteger("event_type");
    }

    public String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : FitnessActivities.UNKNOWN;
        String valueOf = String.valueOf(getDataItem());
        return new StringBuilder((String.valueOf(str).length() + 32) + String.valueOf(valueOf).length()).append("DataEventRef{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }

    public DataEvent zzNF() {
        return new zzy(this);
    }
}
