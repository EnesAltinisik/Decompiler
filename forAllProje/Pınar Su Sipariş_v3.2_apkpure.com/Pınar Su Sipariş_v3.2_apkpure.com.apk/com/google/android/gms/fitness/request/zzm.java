package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSet;

public class zzm implements Creator<DataUpdateRequest> {
    static void zza(DataUpdateRequest dataUpdateRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataUpdateRequest.zzoq());
        zzb.zza(parcel, 2, dataUpdateRequest.zzxn());
        zzb.zza(parcel, 3, dataUpdateRequest.getDataSet(), i, false);
        zzb.zza(parcel, 4, dataUpdateRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, dataUpdateRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzds(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfI(i);
    }

    public DataUpdateRequest zzds(Parcel parcel) {
        long j = 0;
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DataSet dataSet = null;
        long j2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 2:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    dataSet = (DataSet) zza.zza(parcel, zzap, DataSet.CREATOR);
                    break;
                case 4:
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
            return new DataUpdateRequest(i, j2, j, dataSet, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataUpdateRequest[] zzfI(int i) {
        return new DataUpdateRequest[i];
    }
}
