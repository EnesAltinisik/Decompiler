package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<ProviderUserInfo> {
    static void zza(ProviderUserInfo providerUserInfo, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, providerUserInfo.mVersionCode);
        zzb.zza(parcel, 2, providerUserInfo.zzOK(), false);
        zzb.zza(parcel, 3, providerUserInfo.getDisplayName(), false);
        zzb.zza(parcel, 4, providerUserInfo.zzOo(), false);
        zzb.zza(parcel, 5, providerUserInfo.getProviderId(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjp(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznr(i);
    }

    public ProviderUserInfo zzjp(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ProviderUserInfo(i, str4, str3, str2, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ProviderUserInfo[] zznr(int i) {
        return new ProviderUserInfo[i];
    }
}
