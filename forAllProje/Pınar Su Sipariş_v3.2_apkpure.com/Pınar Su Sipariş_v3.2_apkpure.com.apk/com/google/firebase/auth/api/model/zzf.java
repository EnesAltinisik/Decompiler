package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzf implements Creator<ProviderUserInfoList> {
    static void zza(ProviderUserInfoList providerUserInfoList, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, providerUserInfoList.mVersionCode);
        zzb.zzc(parcel, 2, providerUserInfoList.zzOD(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjq(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzns(i);
    }

    public ProviderUserInfoList zzjq(Parcel parcel) {
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
                    list = zza.zzc(parcel, zzap, ProviderUserInfo.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ProviderUserInfoList(i, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ProviderUserInfoList[] zzns(int i) {
        return new ProviderUserInfoList[i];
    }
}
