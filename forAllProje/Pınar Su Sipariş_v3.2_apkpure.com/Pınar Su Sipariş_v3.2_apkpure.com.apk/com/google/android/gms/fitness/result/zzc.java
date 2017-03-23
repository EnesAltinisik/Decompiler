package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import java.util.ArrayList;
import java.util.List;

public class zzc implements Creator<DataReadResult> {
    static void zza(DataReadResult dataReadResult, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzd(parcel, 1, dataReadResult.zzyv(), false);
        zzb.zza(parcel, 2, dataReadResult.getStatus(), i, false);
        zzb.zzd(parcel, 3, dataReadResult.zzyu(), false);
        zzb.zzc(parcel, 5, dataReadResult.zzyt());
        zzb.zzc(parcel, 6, dataReadResult.zzxv(), false);
        zzb.zzc(parcel, 7, dataReadResult.zzyw(), false);
        zzb.zzc(parcel, 1000, dataReadResult.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdP(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgg(i);
    }

    public DataReadResult zzdP(Parcel parcel) {
        int i = 0;
        List list = null;
        int zzaq = zza.zzaq(parcel);
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List list2 = null;
        Status status = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    zza.zza(parcel, zzap, arrayList, getClass().getClassLoader());
                    break;
                case 2:
                    status = (Status) zza.zza(parcel, zzap, Status.CREATOR);
                    break;
                case 3:
                    zza.zza(parcel, zzap, arrayList2, getClass().getClassLoader());
                    break;
                case 5:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    list2 = zza.zzc(parcel, zzap, DataSource.CREATOR);
                    break;
                case 7:
                    list = zza.zzc(parcel, zzap, DataType.CREATOR);
                    break;
                case 1000:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new DataReadResult(i2, arrayList, status, arrayList2, i, list2, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataReadResult[] zzgg(int i) {
        return new DataReadResult[i];
    }
}
