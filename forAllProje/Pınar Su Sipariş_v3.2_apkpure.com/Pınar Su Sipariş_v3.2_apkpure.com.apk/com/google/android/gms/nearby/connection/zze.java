package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<Strategy> {
    static void zza(Strategy strategy, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, strategy.zzHx());
        zzb.zzc(parcel, 2, strategy.getConnectionType());
        zzb.zzc(parcel, 1000, strategy.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgi(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjs(i);
    }

    public Strategy zzgi(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Strategy(i3, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Strategy[] zzjs(int i) {
        return new Strategy[i];
    }
}
