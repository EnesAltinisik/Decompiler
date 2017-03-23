package com.google.android.gms.ads.internal.request;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.request.zzk.zza;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzd.zzb;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.internal.zzig;

@zzig
public class zze extends zzd<zzk> {
    final int zzLg;

    public zze(Context context, Looper looper, zzb com_google_android_gms_common_internal_zzd_zzb, zzc com_google_android_gms_common_internal_zzd_zzc, int i) {
        super(context, looper, 8, com_google_android_gms_common_internal_zzd_zzb, com_google_android_gms_common_internal_zzd_zzc, null);
        this.zzLg = i;
    }

    protected zzk zzaa(IBinder iBinder) {
        return zza.zzac(iBinder);
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzaa(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.ads.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public zzk zzhV() throws DeadObjectException {
        return (zzk) super.zztm();
    }
}
