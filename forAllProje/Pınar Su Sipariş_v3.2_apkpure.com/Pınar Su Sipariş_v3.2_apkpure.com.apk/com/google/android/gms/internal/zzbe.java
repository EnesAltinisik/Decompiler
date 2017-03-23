package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbe extends zzbm {
    private long startTime;

    public zzbe(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, long j, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
        this.startTime = j;
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzoU.invoke(null, new Object[0])).longValue();
        this.zzoY.evtTime = Long.valueOf(longValue);
        if (this.startTime != 0) {
            this.zzoY.uptSignal = Long.valueOf(longValue - this.startTime);
            this.zzoY.usgSignal = Long.valueOf(this.startTime);
        }
    }
}
