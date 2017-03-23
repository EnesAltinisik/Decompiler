package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zza implements Creator<FaceParcel> {
    static void zza(FaceParcel faceParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, faceParcel.versionCode);
        zzb.zzc(parcel, 2, faceParcel.id);
        zzb.zza(parcel, 3, faceParcel.centerX);
        zzb.zza(parcel, 4, faceParcel.centerY);
        zzb.zza(parcel, 5, faceParcel.width);
        zzb.zza(parcel, 6, faceParcel.height);
        zzb.zza(parcel, 7, faceParcel.zzbxX);
        zzb.zza(parcel, 8, faceParcel.zzbxY);
        zzb.zza(parcel, 9, faceParcel.zzbxZ, i, false);
        zzb.zza(parcel, 10, faceParcel.zzbya);
        zzb.zza(parcel, 11, faceParcel.zzbyb);
        zzb.zza(parcel, 12, faceParcel.zzbyc);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhD(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlv(i);
    }

    public FaceParcel zzhD(Parcel parcel) {
        int zzaq = com.google.android.gms.common.internal.safeparcel.zza.zzaq(parcel);
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        LandmarkParcel[] landmarkParcelArr = null;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        while (parcel.dataPosition() < zzaq) {
            int zzap = com.google.android.gms.common.internal.safeparcel.zza.zzap(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzcj(zzap)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i2 = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                case 3:
                    f = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 4:
                    f2 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 5:
                    f3 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 6:
                    f4 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 7:
                    f5 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 8:
                    f6 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f7 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 11:
                    f8 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                case 12:
                    f9 = com.google.android.gms.common.internal.safeparcel.zza.zzl(parcel, zzap);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, landmarkParcelArr, f7, f8, f9);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public FaceParcel[] zzlv(int i) {
        return new FaceParcel[i];
    }
}
