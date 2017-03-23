package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzk implements Creator<RejectConnectionRequestParams> {
    static void zza(RejectConnectionRequestParams rejectConnectionRequestParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, rejectConnectionRequestParams.zzHy(), false);
        zzb.zza(parcel, 2, rejectConnectionRequestParams.zzHz(), false);
        zzb.zza(parcel, 3, rejectConnectionRequestParams.zzHA());
        zzb.zzc(parcel, 1000, rejectConnectionRequestParams.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgo(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjD(i);
    }

    public RejectConnectionRequestParams zzgo(Parcel parcel) {
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
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
            return new RejectConnectionRequestParams(i, iBinder, str, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RejectConnectionRequestParams[] zzjD(int i) {
        return new RejectConnectionRequestParams[i];
    }
}
