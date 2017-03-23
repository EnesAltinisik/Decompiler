package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<DisconnectFromEndpointParams> {
    static void zza(DisconnectFromEndpointParams disconnectFromEndpointParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, disconnectFromEndpointParams.zzHz(), false);
        zzb.zza(parcel, 2, disconnectFromEndpointParams.zzHA());
        zzb.zzc(parcel, 1000, disconnectFromEndpointParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgl(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjA(i);
    }

    public DisconnectFromEndpointParams zzgl(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        long j = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new DisconnectFromEndpointParams(i, str, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DisconnectFromEndpointParams[] zzjA(int i) {
        return new DisconnectFromEndpointParams[i];
    }
}
