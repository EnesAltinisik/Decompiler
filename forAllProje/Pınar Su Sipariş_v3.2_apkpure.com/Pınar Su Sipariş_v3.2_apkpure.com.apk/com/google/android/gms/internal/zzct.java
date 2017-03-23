package com.google.android.gms.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.zze;
import java.util.concurrent.Callable;

@zzig
public class zzct {
    private final Object zzpp = new Object();
    private boolean zzru = false;
    private SharedPreferences zzwV = null;

    public void initialize(Context context) {
        synchronized (this.zzpp) {
            if (this.zzru) {
                return;
            }
            Context remoteContext = zze.getRemoteContext(context);
            if (remoteContext == null) {
                return;
            }
            this.zzwV = zzu.zzcr().zzn(remoteContext);
            this.zzru = true;
        }
    }

    public <T> T zzd(final zzcq<T> com_google_android_gms_internal_zzcq_T) {
        synchronized (this.zzpp) {
            if (this.zzru) {
                return zzkm.zzb(new Callable<T>(this) {
                    final /* synthetic */ zzct b;

                    public T call() {
                        return com_google_android_gms_internal_zzcq_T.zza(this.b.zzwV);
                    }
                });
            }
            T zzeq = com_google_android_gms_internal_zzcq_T.zzeq();
            return zzeq;
        }
    }
}
