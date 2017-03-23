package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzd implements Creator<GetInstrumentsRequest> {
    static void zza(GetInstrumentsRequest getInstrumentsRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getInstrumentsRequest.getVersionCode());
        zzb.zza(parcel, 2, getInstrumentsRequest.zzbAx, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzih(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmb(i);
    }

    public GetInstrumentsRequest zzih(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    iArr = zza.zzw(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetInstrumentsRequest(i, iArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetInstrumentsRequest[] zzmb(int i) {
        return new GetInstrumentsRequest[i];
    }
}
