package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Creator<SymbolBoxParcel> {
    static void zza(SymbolBoxParcel symbolBoxParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, symbolBoxParcel.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlE(i);
    }

    public SymbolBoxParcel zzhK(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new SymbolBoxParcel(i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SymbolBoxParcel[] zzlE(int i) {
        return new SymbolBoxParcel[i];
    }
}
