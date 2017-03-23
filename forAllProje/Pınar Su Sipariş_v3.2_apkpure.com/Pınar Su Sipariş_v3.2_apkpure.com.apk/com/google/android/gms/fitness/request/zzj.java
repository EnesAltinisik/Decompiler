package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Creator<DataTypeReadRequest> {
    static void zza(DataTypeReadRequest dataTypeReadRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataTypeReadRequest.getName(), false);
        zzb.zza(parcel, 3, dataTypeReadRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, dataTypeReadRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdp(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfF(i);
    }

    public DataTypeReadRequest zzdp(Parcel parcel) {
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
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
            return new DataTypeReadRequest(i, str, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataTypeReadRequest[] zzfF(int i) {
        return new DataTypeReadRequest[i];
    }
}
