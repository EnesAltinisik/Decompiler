package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<TextModuleData> {
    static void zza(TextModuleData textModuleData, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, textModuleData.getVersionCode());
        zzb.zza(parcel, 2, textModuleData.zzbBt, false);
        zzb.zza(parcel, 3, textModuleData.body, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzis(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmp(i);
    }

    public TextModuleData zzis(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new TextModuleData(i, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public TextModuleData[] zzmp(int i) {
        return new TextModuleData[i];
    }
}
