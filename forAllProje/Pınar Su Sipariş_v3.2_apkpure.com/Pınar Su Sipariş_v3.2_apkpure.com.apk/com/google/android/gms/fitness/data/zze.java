package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zze implements Creator<DataSet> {
    static void zza(DataSet dataSet, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataSet.getDataSource(), i, false);
        zzb.zza(parcel, 2, dataSet.getDataType(), i, false);
        zzb.zzd(parcel, 3, dataSet.zzxu(), false);
        zzb.zzc(parcel, 4, dataSet.zzxv(), false);
        zzb.zza(parcel, 5, dataSet.zzxm());
        zzb.zzc(parcel, 1000, dataSet.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcR(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfg(i);
    }

    public DataSet zzcR(Parcel parcel) {
        boolean z = false;
        List list = null;
        int zzaq = zza.zzaq(parcel);
        List arrayList = new ArrayList();
        DataType dataType = null;
        DataSource dataSource = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    dataSource = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) zza.zza(parcel, zzap, DataType.CREATOR);
                    break;
                case 3:
                    zza.zza(parcel, zzap, arrayList, getClass().getClassLoader());
                    break;
                case 4:
                    list = zza.zzc(parcel, zzap, DataSource.CREATOR);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
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
            return new DataSet(i, dataSource, dataType, arrayList, list, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataSet[] zzfg(int i) {
        return new DataSet[i];
    }
}
