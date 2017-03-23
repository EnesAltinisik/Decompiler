package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzrp.zza;

public class zzsa extends zza {
    private final zzb<Status> zzasz;

    public zzsa(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
        this.zzasz = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
    }

    public void zzo(Status status) {
        this.zzasz.setResult(status);
    }
}
