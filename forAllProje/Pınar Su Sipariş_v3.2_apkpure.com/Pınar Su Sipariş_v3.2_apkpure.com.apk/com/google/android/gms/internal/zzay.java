package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzay extends zzbm {
    private static final Object zznS = new Object();
    private static volatile String zzoM = null;

    public zzay(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.cerSignal = "E";
        if (zzoM == null) {
            synchronized (zznS) {
                if (zzoM == null) {
                    zzoM = (String) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
                }
            }
        }
        this.zzoY.cerSignal = zzah.zza(zzoM.getBytes(), true);
    }
}
