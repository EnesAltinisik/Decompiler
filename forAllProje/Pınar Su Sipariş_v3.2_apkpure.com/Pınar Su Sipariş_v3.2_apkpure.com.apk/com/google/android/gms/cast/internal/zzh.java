package com.google.android.gms.cast.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public abstract class zzh extends zzb<Status> {
    public zzh(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public void zza(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
    }

    public Status zzb(Status status) {
        return status;
    }

    public /* synthetic */ Result zzc(Status status) {
        return zzb(status);
    }
}
