package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzk implements Creator<RangeParcelable> {
    static void zza(RangeParcelable rangeParcelable, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, rangeParcelable.a);
        zzb.zzb(parcel, 2, rangeParcelable.b, false);
        zzb.zzb(parcel, 3, rangeParcelable.c, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjx(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznB(i);
    }

    public RangeParcelable zzjx(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    list2 = zza.zzE(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzE(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new RangeParcelable(i, list2, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RangeParcelable[] zznB(int i) {
        return new RangeParcelable[i];
    }
}
