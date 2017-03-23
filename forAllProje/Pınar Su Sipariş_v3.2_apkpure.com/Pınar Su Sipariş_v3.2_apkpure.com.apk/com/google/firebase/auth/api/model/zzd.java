package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<GetTokenResponse> {
    static void zza(GetTokenResponse getTokenResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getTokenResponse.mVersionCode);
        zzb.zza(parcel, 2, getTokenResponse.zzOG(), false);
        zzb.zza(parcel, 3, getTokenResponse.getAccessToken(), false);
        zzb.zza(parcel, 4, Long.valueOf(getTokenResponse.zzOH()), false);
        zzb.zza(parcel, 5, getTokenResponse.zzOI(), false);
        zzb.zza(parcel, 6, Long.valueOf(getTokenResponse.zzOJ()), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzjo(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zznq(i);
    }

    public GetTokenResponse zzjo(Parcel parcel) {
        Long l = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    l2 = zza.zzj(parcel, zzap);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    l = zza.zzj(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetTokenResponse(i, str3, str2, l2, str, l);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetTokenResponse[] zznq(int i) {
        return new GetTokenResponse[i];
    }
}
