package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbg extends zzbm {
    private static final Object zznS = new Object();
    private static volatile Long zzoO = null;

    public zzbg(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        if (zzoO == null) {
            synchronized (zznS) {
                if (zzoO == null) {
                    zzoO = (Long) this.zzoU.invoke(null, new Object[0]);
                }
            }
        }
        this.zzoY.jbkSignal = zzoO;
    }
}
