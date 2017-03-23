package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAdshieldEvent.AdShieldEvent;
import com.google.android.gms.clearcut.zzb;
import com.google.android.gms.clearcut.zzb.zza;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class zzak {
    protected static volatile zzb zznP = null;
    private static volatile Random zznR = null;
    private static final Object zznS = new Object();
    private zzav zznO;
    protected boolean zznQ = false;

    public zzak(zzav com_google_android_gms_internal_zzav) {
        this.zznO = com_google_android_gms_internal_zzav;
        zzcu.initialize(com_google_android_gms_internal_zzav.getContext());
        this.zznQ = ((Boolean) zzcu.zzyJ.get()).booleanValue();
        if (this.zznQ && zznP == null) {
            synchronized (zznS) {
                if (zznP == null) {
                    zznP = new zzb(com_google_android_gms_internal_zzav.getContext(), "ADSHIELD", null);
                }
            }
        }
    }

    private static Random zzU() {
        if (zznR == null) {
            synchronized (zznS) {
                if (zznR == null) {
                    zznR = new Random();
                }
            }
        }
        return zznR;
    }

    public int zzT() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (NoClassDefFoundError e) {
            return zzU().nextInt();
        } catch (RuntimeException e2) {
            return zzU().nextInt();
        }
    }

    public void zza(int i, int i2, long j) throws IOException {
        try {
            if (this.zznQ && zznP != null && this.zznO.zzaJ()) {
                zzamj adShieldEvent = new AdShieldEvent();
                adShieldEvent.appId = this.zznO.getContext().getPackageName();
                adShieldEvent.runtimeMs = Long.valueOf(j);
                zza zzj = zznP.zzj(zzamj.toByteArray(adShieldEvent));
                zzj.zzby(i2);
                zzj.zzbx(i);
                zzj.zzd(this.zznO.zzaH());
            }
        } catch (Exception e) {
        }
    }
}
