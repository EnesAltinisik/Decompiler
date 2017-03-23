package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<LandmarkParcel> {
    static void zza(LandmarkParcel landmarkParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, landmarkParcel.versionCode);
        zzb.zza(parcel, 2, landmarkParcel.x);
        zzb.zza(parcel, 3, landmarkParcel.y);
        zzb.zzc(parcel, 4, landmarkParcel.type);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhF(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzly(i);
    }

    public LandmarkParcel zzhF(Parcel parcel) {
        int i = 0;
        float f = 0.0f;
        int zzaq = zza.zzaq(parcel);
        float f2 = 0.0f;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    f2 = zza.zzl(parcel, zzap);
                    break;
                case 3:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LandmarkParcel(i2, f2, f, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LandmarkParcel[] zzly(int i) {
        return new LandmarkParcel[i];
    }
}
