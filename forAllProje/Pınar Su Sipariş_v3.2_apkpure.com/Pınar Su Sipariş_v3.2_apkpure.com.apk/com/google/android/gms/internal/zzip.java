package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.zzio.zza;
import java.util.WeakHashMap;

@zzig
public final class zzip {
    private WeakHashMap<Context, a> zzOs = new WeakHashMap();

    private class a {
        public final long a = zzu.zzco().currentTimeMillis();
        public final zzio b;
        final /* synthetic */ zzip c;

        public a(zzip com_google_android_gms_internal_zzip, zzio com_google_android_gms_internal_zzio) {
            this.c = com_google_android_gms_internal_zzip;
            this.b = com_google_android_gms_internal_zzio;
        }

        public boolean a() {
            return ((Long) zzcu.zzyu.get()).longValue() + this.a < zzu.zzco().currentTimeMillis();
        }
    }

    public zzio zzx(Context context) {
        a aVar = (a) this.zzOs.get(context);
        zzio zzii = (aVar == null || aVar.a() || !((Boolean) zzcu.zzyt.get()).booleanValue()) ? new zza(context).zzii() : new zza(context, aVar.b).zzii();
        this.zzOs.put(context, new a(this, zzii));
        return zzii;
    }
}
