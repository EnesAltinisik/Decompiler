package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.nearby.connection.Strategy;

public class zzp implements Creator<StartDiscoveryParams> {
    static void zza(StartDiscoveryParams startDiscoveryParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, startDiscoveryParams.zzHy(), false);
        zzb.zza(parcel, 2, startDiscoveryParams.zzHI(), false);
        zzb.zza(parcel, 3, startDiscoveryParams.zzuD());
        zzb.zza(parcel, 4, startDiscoveryParams.zzHw(), i, false);
        zzb.zza(parcel, 5, startDiscoveryParams.zzHA());
        zzb.zzc(parcel, 1000, startDiscoveryParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgt(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjI(i);
    }

    public StartDiscoveryParams zzgt(Parcel parcel) {
        long j = 0;
        Strategy strategy = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j2 = 0;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    strategy = (Strategy) zza.zza(parcel, zzap, Strategy.CREATOR);
                    break;
                case 5:
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
            return new StartDiscoveryParams(i, iBinder, str, j2, strategy, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StartDiscoveryParams[] zzjI(int i) {
        return new StartDiscoveryParams[i];
    }
}
