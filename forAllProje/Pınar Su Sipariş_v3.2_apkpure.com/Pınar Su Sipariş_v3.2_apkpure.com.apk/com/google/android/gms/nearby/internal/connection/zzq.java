package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzq implements Creator<StopAdvertisingParams> {
    static void zza(StopAdvertisingParams stopAdvertisingParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, stopAdvertisingParams.zzHA());
        zzb.zzc(parcel, 1000, stopAdvertisingParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgu(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjJ(i);
    }

    public StopAdvertisingParams zzgu(Parcel parcel) {
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
            return new StopAdvertisingParams(i, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StopAdvertisingParams[] zzjJ(int i) {
        return new StopAdvertisingParams[i];
    }
}
