package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzs implements Creator<StopCrossAppDiscoveryRestrictedParams> {
    static void zza(StopCrossAppDiscoveryRestrictedParams stopCrossAppDiscoveryRestrictedParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, stopCrossAppDiscoveryRestrictedParams.zzHA());
        zzb.zzc(parcel, 1000, stopCrossAppDiscoveryRestrictedParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgw(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjL(i);
    }

    public StopCrossAppDiscoveryRestrictedParams zzgw(Parcel parcel) {
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
            return new StopCrossAppDiscoveryRestrictedParams(i, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StopCrossAppDiscoveryRestrictedParams[] zzjL(int i) {
        return new StopCrossAppDiscoveryRestrictedParams[i];
    }
}
