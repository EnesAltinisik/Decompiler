package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataType;
import java.util.List;

public class zzh implements Creator<DataSourcesRequest> {
    static void zza(DataSourcesRequest dataSourcesRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, dataSourcesRequest.getDataTypes(), false);
        zzb.zza(parcel, 2, dataSourcesRequest.zzyd(), false);
        zzb.zza(parcel, 3, dataSourcesRequest.zzye());
        zzb.zza(parcel, 4, dataSourcesRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 1000, dataSourcesRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdn(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfD(i);
    }

    public DataSourcesRequest zzdn(Parcel parcel) {
        boolean z = false;
        IBinder iBinder = null;
        int zzaq = zza.zzaq(parcel);
        List list = null;
        List list2 = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    list2 = zza.zzc(parcel, zzap, DataType.CREATOR);
                    break;
                case 2:
                    list = zza.zzD(parcel, zzap);
                    break;
                case 3:
                    z = zza.zzc(parcel, zzap);
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
            return new DataSourcesRequest(i, list2, list, z, iBinder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataSourcesRequest[] zzfD(int i) {
        return new DataSourcesRequest[i];
    }
}
