package com.google.android.gms.ads.internal.reward.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.reward.client.zzc.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzig;

@zzig
public class zzf extends zzg<zzc> {
    public zzf() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    protected zzc zzai(IBinder iBinder) {
        return zza.zzag(iBinder);
    }

    public zzb zzb(Context context, zzga com_google_android_gms_internal_zzga) {
        Throwable e;
        try {
            return zzb.zza.zzaf(((zzc) zzaI(context)).zza(zze.zzD(context), com_google_android_gms_internal_zzga, com.google.android.gms.common.internal.zze.zzaqR));
        } catch (RemoteException e2) {
            e = e2;
            zzb.zzd("Could not get remote RewardedVideoAd.", e);
            return null;
        } catch (zzg.zza e3) {
            e = e3;
            zzb.zzd("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzai(iBinder);
    }
}
