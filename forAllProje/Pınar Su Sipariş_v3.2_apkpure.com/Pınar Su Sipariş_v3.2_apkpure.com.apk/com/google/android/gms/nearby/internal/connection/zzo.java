package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo implements Creator<StartCrossAppDiscoveryRestrictedParams> {
    static void zza(StartCrossAppDiscoveryRestrictedParams startCrossAppDiscoveryRestrictedParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, startCrossAppDiscoveryRestrictedParams.zzHy(), false);
        zzb.zzc(parcel, 2, startCrossAppDiscoveryRestrictedParams.zzHH());
        zzb.zza(parcel, 3, startCrossAppDiscoveryRestrictedParams.zzuD());
        zzb.zza(parcel, 4, startCrossAppDiscoveryRestrictedParams.zzHA());
        zzb.zzc(parcel, 1000, startCrossAppDiscoveryRestrictedParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgs(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjH(i);
    }

    public StartCrossAppDiscoveryRestrictedParams zzgs(Parcel parcel) {
        long j = 0;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        IBinder iBinder = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new StartCrossAppDiscoveryRestrictedParams(i2, iBinder, i, j2, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StartCrossAppDiscoveryRestrictedParams[] zzjH(int i) {
        return new StartCrossAppDiscoveryRestrictedParams[i];
    }
}
