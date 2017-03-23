package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzi implements Creator<IsReadyToPayRequest> {
    static void zza(IsReadyToPayRequest isReadyToPayRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, isReadyToPayRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzhV(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzlP(i);
    }

    public IsReadyToPayRequest zzhV(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new IsReadyToPayRequest(i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public IsReadyToPayRequest[] zzlP(int i) {
        return new IsReadyToPayRequest[i];
    }
}
