package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Creator<EndCompoundOperationRequest> {
    static void zza(EndCompoundOperationRequest endCompoundOperationRequest, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1, endCompoundOperationRequest.mVersionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeJ(i);
    }

    public EndCompoundOperationRequest zzcy(Parcel parcel) {
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
            return new EndCompoundOperationRequest(i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public EndCompoundOperationRequest[] zzeJ(int i) {
        return new EndCompoundOperationRequest[i];
    }
}
