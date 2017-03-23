package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Creator<EventParams> {
    static void zza(EventParams eventParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, eventParams.versionCode);
        zzb.zza(parcel, 2, eventParams.zzFB(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzfS(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjc(i);
    }

    public EventParams zzfS(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new EventParams(i, bundle);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public EventParams[] zzjc(int i) {
        return new EventParams[i];
    }
}
