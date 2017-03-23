package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<AddLocalCapabilityResponse> {
    static void zza(AddLocalCapabilityResponse addLocalCapabilityResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, addLocalCapabilityResponse.versionCode);
        zzb.zzc(parcel, 2, addLocalCapabilityResponse.statusCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zziA(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmx(i);
    }

    public AddLocalCapabilityResponse zziA(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AddLocalCapabilityResponse(i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AddLocalCapabilityResponse[] zzmx(int i) {
        return new AddLocalCapabilityResponse[i];
    }
}
