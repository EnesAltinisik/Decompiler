package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbd extends zzbm {
    private static volatile Long cpuSignal = null;
    private static final Object zznS = new Object();

    public zzbd(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        if (cpuSignal == null) {
            synchronized (zznS) {
                if (cpuSignal == null) {
                    cpuSignal = (Long) this.zzoU.invoke(null, new Object[0]);
                }
            }
        }
        this.zzoY.cpuSignal = cpuSignal;
    }
}
