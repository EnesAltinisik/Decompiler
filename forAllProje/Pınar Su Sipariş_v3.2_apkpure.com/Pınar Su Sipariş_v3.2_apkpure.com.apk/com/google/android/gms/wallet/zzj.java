package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Creator<LineItem> {
    static void zza(LineItem lineItem, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, lineItem.getVersionCode());
        zzb.zza(parcel, 2, lineItem.description, false);
        zzb.zza(parcel, 3, lineItem.zzbzq, false);
        zzb.zza(parcel, 4, lineItem.zzbzr, false);
        zzb.zza(parcel, 5, lineItem.zzbyM, false);
        zzb.zzc(parcel, 6, lineItem.zzbzs);
        zzb.zza(parcel, 7, lineItem.zzbyN, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhW(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlQ(i);
    }

    public LineItem zzhW(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LineItem(i2, str5, str4, str3, str2, i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LineItem[] zzlQ(int i) {
        return new LineItem[i];
    }
}
