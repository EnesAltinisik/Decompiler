package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zzc implements Creator<LabelValueRow> {
    static void zza(LabelValueRow labelValueRow, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, labelValueRow.getVersionCode());
        zzb.zza(parcel, 2, labelValueRow.zzbBk, false);
        zzb.zza(parcel, 3, labelValueRow.zzbBl, false);
        zzb.zzc(parcel, 4, labelValueRow.zzbBm, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzip(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmm(i);
    }

    public LabelValueRow zzip(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        ArrayList zzuT = com.google.android.gms.common.util.zzb.zzuT();
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
                case 4:
                    zzuT = zza.zzc(parcel, zzap, LabelValue.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new LabelValueRow(i, str2, str, zzuT);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LabelValueRow[] zzmm(int i) {
        return new LabelValueRow[i];
    }
}
