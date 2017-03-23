package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbk extends zzbm {
    private static final Object zznS = new Object();
    private static volatile Long zzoR = null;

    public zzbk(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        if (zzoR == null) {
            synchronized (zznS) {
                if (zzoR == null) {
                    zzoR = (Long) this.zzoU.invoke(null, new Object[0]);
                }
            }
        }
        this.zzoY.utzSignal = zzoR;
    }
}
