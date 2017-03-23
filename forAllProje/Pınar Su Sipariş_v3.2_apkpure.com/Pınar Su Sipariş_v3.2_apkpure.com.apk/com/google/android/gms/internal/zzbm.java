package com.google.android.gms.internal;

import com.google.ads.afma.nano.Google3NanoAfmaSignals.AFMASignals;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class zzbm implements Callable {
    protected final String TAG = getClass().getSimpleName();
    protected final String className;
    protected final zzav zznO;
    protected final String zzoS;
    protected Method zzoU;
    protected final AFMASignals zzoY;
    protected final int zzoZ;
    protected final int zzpa;

    public zzbm(zzav com_google_android_gms_internal_zzav, String str, String str2, AFMASignals aFMASignals, int i, int i2) {
        this.zznO = com_google_android_gms_internal_zzav;
        this.className = str;
        this.zzoS = str2;
        this.zzoY = aFMASignals;
        this.zzoZ = i;
        this.zzpa = i2;
    }

    public /* synthetic */ Object call() throws Exception {
        return zzaV();
    }

    protected abstract void zzaQ() throws IllegalAccessException, InvocationTargetException;

    public Void zzaV() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.zzoU = this.zznO.zzc(this.className, this.zzoS);
            if (this.zzoU != null) {
                zzaQ();
                zzak zzaK = this.zznO.zzaK();
                if (!(zzaK == null || this.zzoZ == zzamj.UNSET_ENUM_VALUE)) {
                    zzaK.zza(this.zzpa, this.zzoZ, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }
}
