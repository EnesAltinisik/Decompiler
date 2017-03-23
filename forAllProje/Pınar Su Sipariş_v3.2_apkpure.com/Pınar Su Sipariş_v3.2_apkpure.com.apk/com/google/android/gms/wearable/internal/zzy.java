package com.google.android.gms.wearable.internal;

import com.google.android.gms.fitness.FitnessActivities;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzy implements DataEvent {
    private int zzagd;
    private DataItem zzbDc;

    public zzy(DataEvent dataEvent) {
        this.zzagd = dataEvent.getType();
        this.zzbDc = (DataItem) dataEvent.getDataItem().freeze();
    }

    public /* synthetic */ Object freeze() {
        return zzNF();
    }

    public DataItem getDataItem() {
        return this.zzbDc;
    }

    public int getType() {
        return this.zzagd;
    }

    public boolean isDataValid() {
        return true;
    }

    public String toString() {
        String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : FitnessActivities.UNKNOWN;
        String valueOf = String.valueOf(getDataItem());
        return new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length()).append("DataEventEntity{ type=").append(str).append(", dataitem=").append(valueOf).append(" }").toString();
    }

    public DataEvent zzNF() {
        return this;
    }
}
