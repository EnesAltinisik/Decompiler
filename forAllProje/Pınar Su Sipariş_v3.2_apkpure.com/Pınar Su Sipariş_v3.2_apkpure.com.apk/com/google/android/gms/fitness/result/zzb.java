package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.fitness.data.DataSet;

public class zzb implements Creator<DailyTotalResult> {
    static void zza(DailyTotalResult dailyTotalResult, Parcel parcel, int i) {
        int zzar = com.google.android.gms.common.internal.safeparcel.zzb.zzar(parcel);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 1, dailyTotalResult.getStatus(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zza(parcel, 2, dailyTotalResult.getTotal(), i, false);
        com.google.android.gms.common.internal.safeparcel.zzb.zzc(parcel, 1000, dailyTotalResult.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdO(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgf(i);
    }

    public DailyTotalResult zzdO(Parcel parcel) {
        DataSet dataSet = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            DataSet dataSet2;
            Status status2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    Status status3 = (Status) zza.zza(parcel, zzap, Status.CREATOR);
                    dataSet2 = dataSet;
                    status2 = status3;
                    break;
                case 2:
                    dataSet2 = (DataSet) zza.zza(parcel, zzap, DataSet.CREATOR);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    DataSet dataSet3 = dataSet;
                    status2 = status;
                    i2 = zza.zzg(parcel, zzap);
                    dataSet2 = dataSet3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    dataSet2 = dataSet;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            dataSet = dataSet2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new DailyTotalResult(i, status, dataSet);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DailyTotalResult[] zzgf(int i) {
        return new DailyTotalResult[i];
    }
}
