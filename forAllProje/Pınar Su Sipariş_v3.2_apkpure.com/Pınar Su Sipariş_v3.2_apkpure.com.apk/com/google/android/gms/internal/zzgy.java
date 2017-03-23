package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzha.zza;

@zzig
public final class zzgy extends zzg<zzha> {
    public zzgy() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    protected zzha zzP(IBinder iBinder) {
        return zza.zzR(iBinder);
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzP(iBinder);
    }

    public zzgz zzf(Activity activity) {
        try {
            return zzgz.zza.zzQ(((zzha) zzaI(activity)).zzm(zze.zzD(activity)));
        } catch (Throwable e) {
            zzb.zzd("Could not create remote AdOverlay.", e);
            return null;
        } catch (Throwable e2) {
            zzb.zzd("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
