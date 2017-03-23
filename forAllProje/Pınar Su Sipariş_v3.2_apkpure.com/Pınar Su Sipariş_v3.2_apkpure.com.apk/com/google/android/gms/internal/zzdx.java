package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.internal.zzdm.zza;

@zzig
public class zzdx extends zzg<zzdm> {
    public zzdx() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    protected zzdm zzI(IBinder iBinder) {
        return zza.zzA(iBinder);
    }

    public zzdl zzb(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        Throwable e;
        try {
            return zzdl.zza.zzz(((zzdm) zzaI(context)).zza(zze.zzD(context), zze.zzD(frameLayout), zze.zzD(frameLayout2), com.google.android.gms.common.internal.zze.zzaqR));
        } catch (RemoteException e2) {
            e = e2;
            zzb.zzd("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (zzg.zza e3) {
            e = e3;
            zzb.zzd("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    protected /* synthetic */ Object zzc(IBinder iBinder) {
        return zzI(iBinder);
    }
}
