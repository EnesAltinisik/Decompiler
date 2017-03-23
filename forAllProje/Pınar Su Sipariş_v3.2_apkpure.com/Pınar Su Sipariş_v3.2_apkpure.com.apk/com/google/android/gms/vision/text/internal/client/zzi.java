package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<WordBoxParcel> {
    static void zza(WordBoxParcel wordBoxParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, wordBoxParcel.versionCode);
        zzb.zza(parcel, 2, wordBoxParcel.zzbyI, i, false);
        zzb.zza(parcel, 3, wordBoxParcel.zzbyx, i, false);
        zzb.zza(parcel, 4, wordBoxParcel.zzbyy, i, false);
        zzb.zza(parcel, 5, wordBoxParcel.zzbyA, false);
        zzb.zza(parcel, 6, wordBoxParcel.zzbyB);
        zzb.zza(parcel, 7, wordBoxParcel.zzbyq, false);
        zzb.zza(parcel, 8, wordBoxParcel.zzbyJ);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhM(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlG(i);
    }

    public WordBoxParcel zzhM(Parcel parcel) {
        boolean z = false;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        float f = 0.0f;
        String str2 = null;
        BoundingBoxParcel boundingBoxParcel = null;
        BoundingBoxParcel boundingBoxParcel2 = null;
        SymbolBoxParcel[] symbolBoxParcelArr = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    symbolBoxParcelArr = (SymbolBoxParcel[]) zza.zzb(parcel, zzap, SymbolBoxParcel.CREATOR);
                    break;
                case 3:
                    boundingBoxParcel2 = (BoundingBoxParcel) zza.zza(parcel, zzap, BoundingBoxParcel.CREATOR);
                    break;
                case 4:
                    boundingBoxParcel = (BoundingBoxParcel) zza.zza(parcel, zzap, BoundingBoxParcel.CREATOR);
                    break;
                case 5:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new WordBoxParcel(i, symbolBoxParcelArr, boundingBoxParcel2, boundingBoxParcel, str2, f, str, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public WordBoxParcel[] zzlG(int i) {
        return new WordBoxParcel[i];
    }
}
