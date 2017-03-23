package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<Strategy> {
    static void zza(Strategy strategy, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, strategy.zzbiZ);
        zzb.zzc(parcel, 2, strategy.zzbja);
        zzb.zzc(parcel, 3, strategy.zzbjb);
        zzb.zza(parcel, 4, strategy.zzbjc);
        zzb.zzc(parcel, 5, strategy.zzHP());
        zzb.zzc(parcel, 6, strategy.zzHx());
        zzb.zzc(parcel, 1000, strategy.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgA(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjT(i);
    }

    public Strategy zzgA(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i5 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i6 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new Strategy(i6, i5, i4, i3, z, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public Strategy[] zzjT(int i) {
        return new Strategy[i];
    }
}
