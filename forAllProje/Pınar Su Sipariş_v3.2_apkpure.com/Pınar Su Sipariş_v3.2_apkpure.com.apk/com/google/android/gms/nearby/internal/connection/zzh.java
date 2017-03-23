package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<GetLocalEndpointIdParams> {
    static void zza(GetLocalEndpointIdParams getLocalEndpointIdParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, getLocalEndpointIdParams.zzHA());
        zzb.zzc(parcel, 1000, getLocalEndpointIdParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjC(i);
    }

    public GetLocalEndpointIdParams zzgn(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
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
            return new GetLocalEndpointIdParams(i, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetLocalEndpointIdParams[] zzjC(int i) {
        return new GetLocalEndpointIdParams[i];
    }
}
