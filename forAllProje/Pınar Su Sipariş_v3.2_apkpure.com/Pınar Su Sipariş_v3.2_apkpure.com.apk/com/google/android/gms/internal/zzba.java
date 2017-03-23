package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzba extends zzbm {
    private static volatile Long appVersionCode = null;
    private static final Object zznS = new Object();

    public zzba(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.vcdSignal = Long.valueOf(-1);
        if (appVersionCode == null) {
            synchronized (zznS) {
                if (appVersionCode == null) {
                    appVersionCode = (Long) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
                }
            }
        }
        this.zzoY.vcdSignal = appVersionCode;
    }
}
