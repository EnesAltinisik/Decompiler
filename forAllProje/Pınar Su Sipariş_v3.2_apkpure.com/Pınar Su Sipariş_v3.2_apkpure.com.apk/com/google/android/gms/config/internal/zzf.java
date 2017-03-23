package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<FetchConfigIpcResponse> {
    static void zza(FetchConfigIpcResponse fetchConfigIpcResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, fetchConfigIpcResponse.getVersionCode());
        zzb.zzc(parcel, 2, fetchConfigIpcResponse.getStatusCode());
        zzb.zza(parcel, 3, fetchConfigIpcResponse.zzvA(), i, false);
        zzb.zza(parcel, 4, fetchConfigIpcResponse.getThrottleEndTimeMillis());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaF(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzcE(i);
    }

    public FetchConfigIpcResponse zzaF(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DataHolder dataHolder = null;
        long j = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    dataHolder = (DataHolder) zza.zza(parcel, zzap, DataHolder.CREATOR);
                    break;
                case 4:
                    j = zza.zzi(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new FetchConfigIpcResponse(i2, i, dataHolder, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public FetchConfigIpcResponse[] zzcE(int i) {
        return new FetchConfigIpcResponse[i];
    }
}
