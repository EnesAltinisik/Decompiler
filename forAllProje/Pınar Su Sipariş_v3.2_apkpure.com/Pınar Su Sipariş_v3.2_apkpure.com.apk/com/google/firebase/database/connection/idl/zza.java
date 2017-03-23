package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zza implements Creator<CompoundHashParcelable> {
    static void zza(CompoundHashParcelable compoundHashParcelable, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, compoundHashParcelable.a);
        zzb.zzb(parcel, 2, compoundHashParcelable.b, false);
        zzb.zzb(parcel, 3, compoundHashParcelable.c, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzju(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzny(i);
    }

    public CompoundHashParcelable zzju(Parcel parcel) {
        List list = null;
        int zzaq = com.google.android.gms.common.internal.safeparcel.zza.zzaq(parcel);
        int i = 0;
        List list2 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = com.google.android.gms.common.internal.safeparcel.zza.zzap(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzcj(zzap)) {
                case 1:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                case 2:
                    list2 = com.google.android.gms.common.internal.safeparcel.zza.zzE(parcel, zzap);
                    break;
                case 3:
                    list = com.google.android.gms.common.internal.safeparcel.zza.zzE(parcel, zzap);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CompoundHashParcelable(i, list2, list);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CompoundHashParcelable[] zzny(int i) {
        return new CompoundHashParcelable[i];
    }
}
