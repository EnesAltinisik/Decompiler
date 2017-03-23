package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;

public class zzaz extends zzbm {
    private static final Object zznS = new Object();
    private static volatile String zzoN = null;

    public zzaz(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.intSignal = "E";
        if (zzoN == null) {
            synchronized (zznS) {
                if (zzoN == null) {
                    zzoN = zzah.zza(((ByteBuffer) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()})).array(), true);
                }
            }
        }
        this.zzoY.intSignal = zzoN;
    }
}
