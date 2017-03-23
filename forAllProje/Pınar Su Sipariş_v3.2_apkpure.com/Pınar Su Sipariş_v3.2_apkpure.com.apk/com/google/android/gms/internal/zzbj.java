package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class zzbj extends zzbm {
    private List<Long> zzoQ = null;

    public zzbj(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.uwSignal = Long.valueOf(-1);
        this.zzoY.uhSignal = Long.valueOf(-1);
        if (this.zzoQ == null) {
            this.zzoQ = (List) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
        }
        if (this.zzoQ != null && this.zzoQ.size() == 2) {
            this.zzoY.uwSignal = Long.valueOf(((Long) this.zzoQ.get(0)).longValue());
            this.zzoY.uhSignal = Long.valueOf(((Long) this.zzoQ.get(1)).longValue());
        }
    }
}
