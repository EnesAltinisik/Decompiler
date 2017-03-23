package com.google.firebase.crash.internal;

import android.content.Context;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzqi;

public class zzg {
    private static zzg zzbGw;
    private zzqi zzbGv;

    public static class zza extends Exception {
        private zza(Throwable th) {
            super(th);
        }
    }

    private zzg() {
    }

    public static zzg zzPc() {
        zzg com_google_firebase_crash_internal_zzg;
        synchronized (zzg.class) {
            if (zzbGw != null) {
                com_google_firebase_crash_internal_zzg = zzbGw;
            } else {
                zzbGw = new zzg();
                com_google_firebase_crash_internal_zzg = zzbGw;
            }
        }
        return com_google_firebase_crash_internal_zzg;
    }

    public zzd zzPd() throws zza {
        zzaa.zzz(this.zzbGv);
        try {
            return com.google.firebase.crash.internal.zzd.zza.zzeJ(this.zzbGv.zzdM("com.google.firebase.crash.internal.api.FirebaseCrashApiImpl"));
        } catch (Throwable e) {
            throw new zza(e);
        }
    }

    public zze zzPe() throws zza {
        zzaa.zzz(this.zzbGv);
        try {
            return com.google.firebase.crash.internal.zze.zza.zzeK(this.zzbGv.zzdM("com.google.firebase.crash.internal.service.FirebaseCrashReceiverServiceImpl"));
        } catch (Throwable e) {
            throw new zza(e);
        }
    }

    public zzf zzPf() throws zza {
        zzaa.zzz(this.zzbGv);
        try {
            return com.google.firebase.crash.internal.zzf.zza.zzeL(this.zzbGv.zzdM("com.google.firebase.crash.internal.service.FirebaseCrashSenderServiceImpl"));
        } catch (Throwable e) {
            throw new zza(e);
        }
    }

    public void zzah(Context context) throws zza {
        synchronized (zzg.class) {
            if (this.zzbGv != null) {
                return;
            }
            try {
                this.zzbGv = zzqi.zza(context, zzqi.zzaCq, "com.google.android.gms.crash");
            } catch (Throwable e) {
                throw new zza(e);
            }
        }
    }
}
