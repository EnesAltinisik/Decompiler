package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class zzbf extends zzbm {
    public zzbf(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        super(com_google_android_gms_internal_zzav, str, str2, aFMASignals, i, i2);
    }

    private void zzaR() throws IllegalAccessException, InvocationTargetException {
        this.zzoY.didSignal = (String) this.zzoU.invoke(null, new Object[]{this.zznO.getContext()});
    }

    private void zzaS() {
        AdvertisingIdClient zzaN = this.zznO.zzaN();
        if (zzaN == null) {
            zzp("E1");
            return;
        }
        try {
            Info info = zzaN.getInfo();
            String zzo = zzaw.zzo(info.getId());
            if (zzo != null) {
                this.zzoY.didSignal = zzo;
                this.zzoY.didOptOut = Boolean.valueOf(info.isLimitAdTrackingEnabled());
                this.zzoY.didSignalType = Integer.valueOf(5);
                return;
            }
            zzp("E");
        } catch (IOException e) {
            zzp("E");
        }
    }

    private void zzp(String str) {
    }

    protected void zzaQ() throws IllegalAccessException, InvocationTargetException {
        if (this.zznO.zzaI()) {
            zzaS();
        } else {
            zzaR();
        }
    }
}
