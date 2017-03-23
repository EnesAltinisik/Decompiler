package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Creator<MapValue> {
    static void zza(MapValue mapValue, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, mapValue.getFormat());
        zzb.zza(parcel, 2, mapValue.zzxF());
        zzb.zzc(parcel, 1000, mapValue.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcX(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfm(i);
    }

    public MapValue zzcX(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        float f = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    f = zza.zzl(parcel, zzap);
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
            return new MapValue(i2, i, f);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public MapValue[] zzfm(int i) {
        return new MapValue[i];
    }
}
