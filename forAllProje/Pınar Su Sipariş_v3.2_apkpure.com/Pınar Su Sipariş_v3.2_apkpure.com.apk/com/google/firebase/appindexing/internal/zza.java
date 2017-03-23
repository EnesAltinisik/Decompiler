package com.google.firebase.appindexing.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.firebase.appindexing.internal.ActionImpl.MetadataImpl;

public class zza implements Creator<ActionImpl> {
    static void zza(ActionImpl actionImpl, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, actionImpl.zzNX(), false);
        zzb.zza(parcel, 2, actionImpl.zzNY(), false);
        zzb.zza(parcel, 3, actionImpl.zzNZ(), false);
        zzb.zza(parcel, 4, actionImpl.zzOa(), false);
        zzb.zza(parcel, 5, actionImpl.zzOb(), i, false);
        zzb.zza(parcel, 6, actionImpl.zzOc(), false);
        zzb.zzc(parcel, 1000, actionImpl.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzji(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzni(i);
    }

    public ActionImpl zzji(Parcel parcel) {
        String str = null;
        int zzaq = com.google.android.gms.common.internal.safeparcel.zza.zzaq(parcel);
        int i = 0;
        MetadataImpl metadataImpl = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = com.google.android.gms.common.internal.safeparcel.zza.zzap(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.zza.zzcj(zzap)) {
                case 1:
                    str5 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 2:
                    str4 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str3 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str2 = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 5:
                    metadataImpl = (MetadataImpl) com.google.android.gms.common.internal.safeparcel.zza.zza(parcel, zzap, MetadataImpl.CREATOR);
                    break;
                case 6:
                    str = com.google.android.gms.common.internal.safeparcel.zza.zzq(parcel, zzap);
                    break;
                case 1000:
                    i = com.google.android.gms.common.internal.safeparcel.zza.zzg(parcel, zzap);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ActionImpl(i, str5, str4, str3, str2, metadataImpl, str);
        }
        throw new com.google.android.gms.common.internal.safeparcel.zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ActionImpl[] zzni(int i) {
        return new ActionImpl[i];
    }
}
