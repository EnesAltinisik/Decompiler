package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.nearby.messages.internal.zzg.zza;

final class b extends zza {
    private final zzb<Status> a;
    private boolean b;

    private b(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
    }

    static b a(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        return new b(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
    }

    public void zzbm(Status status) throws RemoteException {
        if (!this.b) {
            this.a.setResult(status);
            this.b = true;
        }
    }
}
