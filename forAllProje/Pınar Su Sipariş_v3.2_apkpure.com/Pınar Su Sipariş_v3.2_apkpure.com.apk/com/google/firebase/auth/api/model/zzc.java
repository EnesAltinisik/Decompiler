package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzc implements Creator<GetAccountInfoUserList> {
    static void zza(GetAccountInfoUserList getAccountInfoUserList, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getAccountInfoUserList.mVersionCode);
        zzb.zzc(parcel, 2, getAccountInfoUserList.zzOF(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznp(i);
    }

    public GetAccountInfoUserList zzjn(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    list = zza.zzc(parcel, zzap, GetAccountInfoUser.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetAccountInfoUserList(i, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetAccountInfoUserList[] zznp(int i) {
        return new GetAccountInfoUserList[i];
    }
}
