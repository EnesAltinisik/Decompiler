package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzc;
import com.google.android.gms.ads.internal.zzu;

@zzig
public final class zzkj extends zzjv {
    private final String zzE;
    private final zzc zzRj;

    public zzkj(Context context, String str, String str2) {
        this(str2, zzu.zzck().zzg(context, str));
    }

    public zzkj(String str, String str2) {
        this.zzRj = new zzc(str2);
        this.zzE = str;
    }

    public void onStop() {
    }

    public void zzbQ() {
        this.zzRj.zzaQ(this.zzE);
    }
}
