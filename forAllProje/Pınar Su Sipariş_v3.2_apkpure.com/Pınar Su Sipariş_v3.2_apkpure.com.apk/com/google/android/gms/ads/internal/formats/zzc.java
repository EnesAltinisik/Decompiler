package com.google.android.gms.ads.internal.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzdj.zza;
import com.google.android.gms.internal.zzig;

@zzig
public class zzc extends zza {
    private final Uri mUri;
    private final Drawable zzAA;
    private final double zzAB;

    public zzc(Drawable drawable, Uri uri, double d) {
        this.zzAA = drawable;
        this.mUri = uri;
        this.zzAB = d;
    }

    public double getScale() {
        return this.zzAB;
    }

    public Uri getUri() throws RemoteException {
        return this.mUri;
    }

    public zzd zzeM() throws RemoteException {
        return zze.zzD(this.zzAA);
    }
}
