package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbb extends zzbm {
    private static volatile String appVersionName = null;
    private static final Object zznS = new Object();

    public zzbb(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.vnmSignal = "E";
        if (appVersionName == null) {
            synchronized (zznS) {
                if (appVersionName == null) {
                    appVersionName = (String) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
                }
            }
        }
        this.zzoY.vnmSignal = appVersionName;
    }
}
