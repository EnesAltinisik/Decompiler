package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.ads.internal.client.zzs.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzig;

@zzig
public final class zzd extends zzg<zzt> {
    public zzd() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public zzs zza(Context context, String str, zzga com_google_android_gms_internal_zzga) {
        try {
            return zza.zzl(((zzt) zzaI(context)).zza(zze.zzD(context), str, com_google_android_gms_internal_zzga, com.google.android.gms.common.internal.zze.zzaqR));
        } catch (Throwable e) {
            zzb.zzd("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (Throwable e2) {
            zzb.zzd("Could not create remote builder for AdLoader.", e2);
            return null;
        }
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzg(iBinder);
    }

    protected zzt zzg(IBinder iBinder) {
        return zzt.zza.zzm(iBinder);
    }
}
