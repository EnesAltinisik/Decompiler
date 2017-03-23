package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator<AdvertisingOptions> {
    static void zza(AdvertisingOptions advertisingOptions, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, advertisingOptions.zzHw(), i, false);
        zzb.zzc(parcel, 1000, advertisingOptions.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzge(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjo(i);
    }

    public AdvertisingOptions zzge(Parcel parcel) {
        int zzaq = com.google.android.gms.common.internal.safeparcel.zza.zzaq(parcel);
        int i = 0;
        Strategy strategy = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = com.google.android.gms.common.internal.safeparcel.zza.zzap(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzcj(zzap)) {
                case 1:
                    strategy = (Strategy) com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzap, Strategy.CREATOR);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AdvertisingOptions(i, strategy);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AdvertisingOptions[] zzjo(int i) {
        return new AdvertisingOptions[i];
    }
}
