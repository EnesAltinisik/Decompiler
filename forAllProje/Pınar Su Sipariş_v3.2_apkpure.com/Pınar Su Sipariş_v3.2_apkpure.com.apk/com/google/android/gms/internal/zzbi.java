package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;

public class zzbi extends zzbm {
    private static volatile String osVersion = null;
    private static final Object zznS = new Object();

    public zzbi(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.osVersion = "E";
        if (osVersion == null) {
            synchronized (zznS) {
                if (osVersion == null) {
                    osVersion = (String) this.zzoU.invoke(null, new Object[0]);
                }
            }
        }
        this.zzoY.osVersion = osVersion;
    }
}
