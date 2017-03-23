package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Creator<GetLocalDeviceIdParams> {
    static void zza(GetLocalDeviceIdParams getLocalDeviceIdParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1000, getLocalDeviceIdParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgm(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjB(i);
    }

    public GetLocalDeviceIdParams zzgm(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetLocalDeviceIdParams(i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetLocalDeviceIdParams[] zzjB(int i) {
        return new GetLocalDeviceIdParams[i];
    }
}
