package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzax extends zzbm {
    public zzax(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.atvSignal = Long.valueOf(-1);
        this.zzoY.atvSignal = (Long) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
    }
}
