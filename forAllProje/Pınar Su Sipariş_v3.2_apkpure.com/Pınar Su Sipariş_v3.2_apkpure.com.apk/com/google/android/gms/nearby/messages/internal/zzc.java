package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Creator<DistanceImpl> {
    static void zza(DistanceImpl distanceImpl, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, distanceImpl.mVersionCode);
        zzb.zzc(parcel, 2, distanceImpl.accuracy);
        zzb.zza(parcel, 3, distanceImpl.zzbjH);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgG(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzka(i);
    }

    public DistanceImpl zzgG(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        double d = 0.0d;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    d = zza.zzn(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new DistanceImpl(i2, i, d);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DistanceImpl[] zzka(int i) {
        return new DistanceImpl[i];
    }
}
