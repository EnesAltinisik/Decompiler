package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

public final class zzbr extends zzg<zzbt> {
    private static final zzbr zzpy = new zzbr();

    private zzbr() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static zzbs zzb(String str, Context context, boolean z) {
        if (zzc.zzqV().isGooglePlayServicesAvailable(context) == 0) {
            zzbs zzc = zzpy.zzc(str, context, z);
            if (zzc != null) {
                return zzc;
            }
        }
        return new zzbq(str, context, z);
    }

    private zzbs zzc(String str, Context context, boolean z) {
        IBinder zza;
        zzd zzD = zze.zzD(context);
        if (z) {
            try {
                zza = ((zzbt) zzaI(context)).zza(str, zzD);
            } catch (RemoteException e) {
                return null;
            } catch (zza e2) {
                return null;
            }
        }
        zza = ((zzbt) zzaI(context)).zzb(str, zzD);
        return zzbs.zza.zzd(zza);
    }

    protected zzbt zzb(IBinder iBinder) {
        return zzbt.zza.zze(iBinder);
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzb(iBinder);
    }
}
