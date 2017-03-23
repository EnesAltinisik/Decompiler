package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<LineBoxParcel> {
    static void zza(LineBoxParcel lineBoxParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, lineBoxParcel.versionCode);
        zzb.zza(parcel, 2, lineBoxParcel.zzbyw, i, false);
        zzb.zza(parcel, 3, lineBoxParcel.zzbyx, i, false);
        zzb.zza(parcel, 4, lineBoxParcel.zzbyy, i, false);
        zzb.zza(parcel, 5, lineBoxParcel.zzbyz, i, false);
        zzb.zza(parcel, 6, lineBoxParcel.zzbyA, false);
        zzb.zza(parcel, 7, lineBoxParcel.zzbyB);
        zzb.zza(parcel, 8, lineBoxParcel.zzbyq, false);
        zzb.zzc(parcel, 9, lineBoxParcel.zzbyC);
        zzb.zza(parcel, 10, lineBoxParcel.zzbyD);
        zzb.zzc(parcel, 11, lineBoxParcel.zzbyE);
        zzb.zzc(parcel, 12, lineBoxParcel.zzbyF);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhI(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlC(i);
    }

    public LineBoxParcel zzhI(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        WordBoxParcel[] wordBoxParcelArr = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        BoundingBoxParcel boundingBoxParcel3 = null;
        String str = null;
        float f = 0.0f;
        String str2 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    wordBoxParcelArr = (WordBoxParcel[]) zza.zzb(parcel, zzap, WordBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel = (BoundingBoxParcel) zza.zza(parcel, zzap, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel2 = (BoundingBoxParcel) zza.zza(parcel, zzap, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    boundingBoxParcel3 = (BoundingBoxParcel) zza.zza(parcel, zzap, BoundingBoxParcel.CREATOR);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 8:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 10:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 11:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 12:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LineBoxParcel(i, wordBoxParcelArr, boundingBoxParcel, boundingBoxParcel2, boundingBoxParcel3, str, f, str2, i2, z, i3, i4);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LineBoxParcel[] zzlC(int i) {
        return new LineBoxParcel[i];
    }
}
