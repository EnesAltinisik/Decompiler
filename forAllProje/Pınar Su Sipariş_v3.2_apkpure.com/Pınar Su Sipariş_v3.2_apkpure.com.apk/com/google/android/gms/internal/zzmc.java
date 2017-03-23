package com.google.android.gms.internal;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzmb.zza;
import com.google.android.gms.internal.zznt.zzb;

public abstract class zzmc<T> extends zza {
    protected zzb<T> zzaar;

    public zzmc(zzb<T> com_google_android_gms_internal_zznt_zzb_T) {
        this.zzaar = com_google_android_gms_internal_zznt_zzb_T;
    }

    public void zza(Response response) {
    }

    public void zza(Status status) {
    }

    public void zza(Status status, ParcelFileDescriptor parcelFileDescriptor) {
    }

    public void zza(Status status, boolean z) {
    }
}
