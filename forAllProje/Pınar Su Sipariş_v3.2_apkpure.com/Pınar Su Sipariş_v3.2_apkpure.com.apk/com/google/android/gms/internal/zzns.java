package com.google.android.gms.internal;

import android.support.v4.h.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zza;
import com.google.android.gms.common.api.zzb;
import java.util.Set;

public final class zzns extends zznv<zzb> {
    private int zzalM;
    private boolean zzalN;

    private void zza(ConnectionResult connectionResult) {
        a aVar = null;
        for (int i = 0; i < aVar.size(); i++) {
            zza((zznq) aVar.b(i), connectionResult);
        }
    }

    public void zza(zznq<?> com_google_android_gms_internal_zznq_, ConnectionResult connectionResult) {
        synchronized (null) {
            a aVar = null;
            try {
                aVar.put(com_google_android_gms_internal_zznq_, connectionResult);
                this.zzalM--;
                boolean isSuccess = connectionResult.isSuccess();
                if (!isSuccess) {
                    this.zzalN = isSuccess;
                }
                if (this.zzalM == 0) {
                    Status status = this.zzalN ? new Status(13) : Status.zzalw;
                    aVar = null;
                    zzb(aVar.size() == 1 ? new zza(status, null) : new zzb(status, null));
                }
            } finally {
            }
        }
    }

    protected /* synthetic */ Result zzc(Status status) {
        return zzw(status);
    }

    public Set<zznq<?>> zzrC() {
        a aVar = null;
        return aVar.keySet();
    }

    protected zzb zzw(Status status) {
        zzb com_google_android_gms_common_api_zzb;
        synchronized (null) {
            try {
                zza(new ConnectionResult(8));
                a aVar = null;
                if (aVar.size() != 1) {
                    com_google_android_gms_common_api_zzb = new zzb(status, null);
                }
            } finally {
            }
        }
        return com_google_android_gms_common_api_zzb;
    }
}
