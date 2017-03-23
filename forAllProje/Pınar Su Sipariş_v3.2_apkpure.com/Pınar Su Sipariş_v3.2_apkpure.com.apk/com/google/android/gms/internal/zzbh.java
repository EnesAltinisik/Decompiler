package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbh extends zzbm {
    private long zzoP = -1;

    public zzbh(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.ornSignal = Long.valueOf(-1);
        if (this.zzoP == -1) {
            this.zzoP = (long) ((Integer) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()})).intValue();
        }
        this.zzoY.ornSignal = Long.valueOf(this.zzoP);
    }
}
