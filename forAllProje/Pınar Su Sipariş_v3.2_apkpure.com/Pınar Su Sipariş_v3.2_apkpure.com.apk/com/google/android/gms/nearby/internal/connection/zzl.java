package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator<SendConnectionRequestParams> {
    static void zza(SendConnectionRequestParams sendConnectionRequestParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, sendConnectionRequestParams.zzHy(), false);
        zzb.zza(parcel, 2, sendConnectionRequestParams.getName(), false);
        zzb.zza(parcel, 3, sendConnectionRequestParams.zzHz(), false);
        zzb.zza(parcel, 4, sendConnectionRequestParams.getPayload(), false);
        zzb.zza(parcel, 5, sendConnectionRequestParams.zzHA());
        zzb.zzc(parcel, 1000, sendConnectionRequestParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgp(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjE(i);
    }

    public SendConnectionRequestParams zzgp(Parcel parcel) {
        byte[] bArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 5:
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
            return new SendConnectionRequestParams(i, iBinder, str2, str, bArr, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SendConnectionRequestParams[] zzjE(int i) {
        return new SendConnectionRequestParams[i];
    }
}
