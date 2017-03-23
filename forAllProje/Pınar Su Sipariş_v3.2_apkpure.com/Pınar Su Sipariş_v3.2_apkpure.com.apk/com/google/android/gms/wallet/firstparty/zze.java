package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zze implements Creator<GetInstrumentsResponse> {
    static void zza(GetInstrumentsResponse getInstrumentsResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getInstrumentsResponse.getVersionCode());
        zzb.zza(parcel, 2, getInstrumentsResponse.zzbAy, false);
        zzb.zza(parcel, 3, getInstrumentsResponse.zzbAz, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzii(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmc(i);
    }

    public GetInstrumentsResponse zzii(Parcel parcel) {
        byte[][] bArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    strArr = zza.zzC(parcel, zzap);
                    break;
                case 3:
                    bArr = zza.zzu(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetInstrumentsResponse(i, strArr, bArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetInstrumentsResponse[] zzmc(int i) {
        return new GetInstrumentsResponse[i];
    }
}
