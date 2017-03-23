package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<InitializeBuyFlowRequest> {
    static void zza(InitializeBuyFlowRequest initializeBuyFlowRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, initializeBuyFlowRequest.getVersionCode());
        zzb.zza(parcel, 2, initializeBuyFlowRequest.zzbAA, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzij(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmd(i);
    }

    public InitializeBuyFlowRequest zzij(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        byte[][] bArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    bArr = zza.zzu(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new InitializeBuyFlowRequest(i, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public InitializeBuyFlowRequest[] zzmd(int i) {
        return new InitializeBuyFlowRequest[i];
    }
}
