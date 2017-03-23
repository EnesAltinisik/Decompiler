package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;

public class zzbr extends zzd {
    private final zzb<Status> zzasz;

    public zzbr(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        this.zzasz = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
    }

    public void onError(Status status) throws RemoteException {
        this.zzasz.setResult(status);
    }

    public void onSuccess() throws RemoteException {
        this.zzasz.setResult(Status.zzalw);
    }
}
