package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzg implements Creator<StartScanRequest> {
    static void zza(StartScanRequest startScanRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, startScanRequest.zzHv(), false);
        zzb.zza(parcel, 2, startScanRequest.getCallbackBinder(), false);
        zzb.zza(parcel, 3, startScanRequest.zzHs());
        zzb.zzc(parcel, 1000, startScanRequest.versionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzgc(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzjm(i);
    }

    public StartScanRequest zzgc(Parcel parcel) {
        IBinder iBinder = null;
        byte b = (byte) 0;
        int zzaq = zza.zzaq(parcel);
        IBinder iBinder2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 2:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 3:
                    b = zza.zze(parcel, zzap);
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
            return new StartScanRequest(i, b, iBinder2, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public StartScanRequest[] zzjm(int i) {
        return new StartScanRequest[i];
    }
}
