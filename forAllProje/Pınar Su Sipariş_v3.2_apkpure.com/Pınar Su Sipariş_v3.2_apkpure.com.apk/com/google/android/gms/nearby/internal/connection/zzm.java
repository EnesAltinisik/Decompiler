package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Creator<SendMessageParams> {
    static void zza(SendMessageParams sendMessageParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sendMessageParams.zzHF(), false);
        zzb.zza(parcel, 2, sendMessageParams.getPayload(), false);
        zzb.zza(parcel, 3, sendMessageParams.zzHA());
        zzb.zzc(parcel, 1000, sendMessageParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgq(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjF(i);
    }

    public SendMessageParams zzgq(Parcel parcel) {
        byte[] bArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    strArr = zza.zzC(parcel, zzap);
                    break;
                case 2:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 1000:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new SendMessageParams(i, strArr, bArr, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SendMessageParams[] zzjF(int i) {
        return new SendMessageParams[i];
    }
}
