package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<DiscoveryOptions> {
    static void zza(DiscoveryOptions discoveryOptions, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, discoveryOptions.zzHw(), i, false);
        zzb.zzc(parcel, 1000, discoveryOptions.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjr(i);
    }

    public DiscoveryOptions zzgh(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Strategy strategy = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    strategy = (Strategy) zza.zza(parcel, zzap, Strategy.CREATOR);
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
            return new DiscoveryOptions(i, strategy);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DiscoveryOptions[] zzjr(int i) {
        return new DiscoveryOptions[i];
    }
}
