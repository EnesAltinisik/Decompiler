package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;

public class zzb implements Creator<AcceptConnectionRequestParams> {
    static void zza(AcceptConnectionRequestParams acceptConnectionRequestParams, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 1, acceptConnectionRequestParams.zzHy(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, acceptConnectionRequestParams.zzHz(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 3, acceptConnectionRequestParams.getPayload(), false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 4, acceptConnectionRequestParams.zzHA());
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1000, acceptConnectionRequestParams.versionCode);
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgj(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjy(i);
    }

    public AcceptConnectionRequestParams zzgj(Parcel parcel) {
        byte[] bArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 4:
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
            return new AcceptConnectionRequestParams(i, iBinder, str, bArr, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public AcceptConnectionRequestParams[] zzjy(int i) {
        return new AcceptConnectionRequestParams[i];
    }
}
