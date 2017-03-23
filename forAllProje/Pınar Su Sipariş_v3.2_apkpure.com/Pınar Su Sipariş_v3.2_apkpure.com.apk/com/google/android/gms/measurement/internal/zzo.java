package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzd.zzb;
import com.google.android.gms.common.internal.zzd.zzc;
import com.google.android.gms.measurement.internal.zzm.zza;

public class zzo extends zzd<zzm> {
    public zzo(Context context, Looper looper, zzb com_google_android_gms_common_internal_zzd_zzb, zzc com_google_android_gms_common_internal_zzd_zzc) {
        super(context, looper, 93, com_google_android_gms_common_internal_zzd_zzb, com_google_android_gms_common_internal_zzd_zzc, null);
    }

    public /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzdw(iBinder);
    }

    public zzm zzdw(IBinder iBinder) {
        return zza.zzdv(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.measurement.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
