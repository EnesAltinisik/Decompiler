package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

public final class zzbo {
    private final zzbs zzpt;

    public zzbo(String str, Context context, boolean z) {
        this.zzpt = zzbr.zzb(str, context, z);
    }

    public void zza(MotionEvent motionEvent) throws RemoteException {
        this.zzpt.zzd(zze.zzD(motionEvent));
    }

    public Uri zzc(Uri uri, Context context) throws zzbp, RemoteException {
        zzd zza = this.zzpt.zza(zze.zzD(uri), zze.zzD(context));
        if (zza != null) {
            return (Uri) zze.zzx(zza);
        }
        throw new zzbp();
    }

    public Uri zzd(Uri uri, Context context) throws zzbp, RemoteException {
        zzd zzb = this.zzpt.zzb(zze.zzD(uri), zze.zzD(context));
        if (zzb != null) {
            return (Uri) zze.zzx(zzb);
        }
        throw new zzbp();
    }
}
