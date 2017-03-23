package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzao implements Creator<SearchAdRequestParcel> {
    static void zza(SearchAdRequestParcel searchAdRequestParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, searchAdRequestParcel.versionCode);
        zzb.zzc(parcel, 2, searchAdRequestParcel.zzwA);
        zzb.zzc(parcel, 3, searchAdRequestParcel.backgroundColor);
        zzb.zzc(parcel, 4, searchAdRequestParcel.zzwB);
        zzb.zzc(parcel, 5, searchAdRequestParcel.zzwC);
        zzb.zzc(parcel, 6, searchAdRequestParcel.zzwD);
        zzb.zzc(parcel, 7, searchAdRequestParcel.zzwE);
        zzb.zzc(parcel, 8, searchAdRequestParcel.zzwF);
        zzb.zzc(parcel, 9, searchAdRequestParcel.zzwG);
        zzb.zza(parcel, 10, searchAdRequestParcel.zzwH, false);
        zzb.zzc(parcel, 11, searchAdRequestParcel.zzwI);
        zzb.zza(parcel, 12, searchAdRequestParcel.zzwJ, false);
        zzb.zzc(parcel, 13, searchAdRequestParcel.zzwK);
        zzb.zzc(parcel, 14, searchAdRequestParcel.zzwL);
        zzb.zza(parcel, 15, searchAdRequestParcel.zzwM, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzd(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzs(i);
    }

    public SearchAdRequestParcel zzd(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        String str = null;
        int i10 = 0;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        String str3 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i5 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    i6 = zza.zzg(parcel, zzap);
                    break;
                case 7:
                    i7 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    i8 = zza.zzg(parcel, zzap);
                    break;
                case 9:
                    i9 = zza.zzg(parcel, zzap);
                    break;
                case 10:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 11:
                    i10 = zza.zzg(parcel, zzap);
                    break;
                case 12:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 13:
                    i11 = zza.zzg(parcel, zzap);
                    break;
                case 14:
                    i12 = zza.zzg(parcel, zzap);
                    break;
                case 15:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new SearchAdRequestParcel(i, i2, i3, i4, i5, i6, i7, i8, i9, str, i10, str2, i11, i12, str3);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SearchAdRequestParcel[] zzs(int i) {
        return new SearchAdRequestParcel[i];
    }
}
