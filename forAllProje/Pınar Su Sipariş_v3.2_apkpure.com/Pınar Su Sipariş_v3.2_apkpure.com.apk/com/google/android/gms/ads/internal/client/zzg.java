package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzg implements Creator<AdRequestParcel> {
    static void zza(AdRequestParcel adRequestParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, adRequestParcel.versionCode);
        zzb.zza(parcel, 2, adRequestParcel.zzuN);
        zzb.zza(parcel, 3, adRequestParcel.extras, false);
        zzb.zzc(parcel, 4, adRequestParcel.zzuO);
        zzb.zzb(parcel, 5, adRequestParcel.zzuP, false);
        zzb.zza(parcel, 6, adRequestParcel.zzuQ);
        zzb.zzc(parcel, 7, adRequestParcel.zzuR);
        zzb.zza(parcel, 8, adRequestParcel.zzuS);
        zzb.zza(parcel, 9, adRequestParcel.zzuT, false);
        zzb.zza(parcel, 10, adRequestParcel.zzuU, i, false);
        zzb.zza(parcel, 11, adRequestParcel.zzuV, i, false);
        zzb.zza(parcel, 12, adRequestParcel.zzuW, false);
        zzb.zza(parcel, 13, adRequestParcel.zzuX, false);
        zzb.zza(parcel, 14, adRequestParcel.zzuY, false);
        zzb.zzb(parcel, 15, adRequestParcel.zzuZ, false);
        zzb.zza(parcel, 16, adRequestParcel.zzva, false);
        zzb.zza(parcel, 17, adRequestParcel.zzvb, false);
        zzb.zza(parcel, 18, adRequestParcel.zzvc);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzb(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzp(i);
    }

    public AdRequestParcel zzb(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        int i2 = 0;
        List list = null;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        String str = null;
        SearchAdRequestParcel searchAdRequestParcel = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        List list2 = null;
        String str3 = null;
        String str4 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    list = zza.zzE(parcel, zzap);
                    break;
                case 6:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 7:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 9:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    searchAdRequestParcel = (SearchAdRequestParcel) zza.zza(parcel, zzap, SearchAdRequestParcel.CREATOR);
                    break;
                case 11:
                    location = (Location) zza.zza(parcel, zzap, Location.CREATOR);
                    break;
                case 12:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 13:
                    bundle2 = zza.zzs(parcel, zzap);
                    break;
                case 14:
                    bundle3 = zza.zzs(parcel, zzap);
                    break;
                case 15:
                    list2 = zza.zzE(parcel, zzap);
                    break;
                case 16:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 17:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 18:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AdRequestParcel(i, j, bundle, i2, list, z, i3, z2, str, searchAdRequestParcel, location, str2, bundle2, bundle3, list2, str3, str4, z3);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AdRequestParcel[] zzp(int i) {
        return new AdRequestParcel[i];
    }
}
