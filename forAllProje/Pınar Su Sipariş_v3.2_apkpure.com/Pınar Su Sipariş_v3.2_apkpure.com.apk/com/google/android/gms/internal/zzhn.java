package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzhj.zza;

@zzig
public final class zzhn extends zzg<zzhj> {
    public zzhn() {
        super("com.google.android.gms.ads.InAppPurchaseManagerCreatorImpl");
    }

    protected zzhj zzZ(IBinder iBinder) {
        return zza.zzW(iBinder);
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzZ(iBinder);
    }

    public zzhi zzg(Activity activity) {
        try {
            return zzhi.zza.zzV(((zzhj) zzaI(activity)).zzn(zze.zzD(activity)));
        } catch (Throwable e) {
            zzb.zzd("Could not create remote InAppPurchaseManager.", e);
            return null;
        } catch (Throwable e2) {
            zzb.zzd("Could not create remote InAppPurchaseManager.", e2);
            return null;
        }
    }
}
