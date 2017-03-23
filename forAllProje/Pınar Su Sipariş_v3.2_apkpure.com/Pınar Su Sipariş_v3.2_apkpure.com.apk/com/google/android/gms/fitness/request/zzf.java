package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import java.util.List;

public class zzf implements Creator<DataReadRequest> {
    static void zza(DataReadRequest dataReadRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, dataReadRequest.getDataTypes(), false);
        zzb.zzc(parcel, 2, dataReadRequest.getDataSources(), false);
        zzb.zza(parcel, 3, dataReadRequest.zzoq());
        zzb.zza(parcel, 4, dataReadRequest.zzxn());
        zzb.zzc(parcel, 5, dataReadRequest.getAggregatedDataTypes(), false);
        zzb.zzc(parcel, 6, dataReadRequest.getAggregatedDataSources(), false);
        zzb.zzc(parcel, 7, dataReadRequest.getBucketType());
        zzb.zzc(parcel, 1000, dataReadRequest.getVersionCode());
        zzb.zza(parcel, 8, dataReadRequest.zzyb());
        zzb.zza(parcel, 9, dataReadRequest.getActivityDataSource(), i, false);
        zzb.zzc(parcel, 10, dataReadRequest.getLimit());
        zzb.zza(parcel, 12, dataReadRequest.zzya());
        zzb.zza(parcel, 13, dataReadRequest.zzxZ());
        zzb.zza(parcel, 14, dataReadRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 16, dataReadRequest.zzyc(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdl(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfB(i);
    }

    public DataReadRequest zzdl(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        List list = null;
        List list2 = null;
        long j = 0;
        long j2 = 0;
        List list3 = null;
        List list4 = null;
        int i2 = 0;
        long j3 = 0;
        DataSource dataSource = null;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        List list5 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    list = zza.zzc(parcel, zzap, DataType.CREATOR);
                    break;
                case 2:
                    list2 = zza.zzc(parcel, zzap, DataSource.CREATOR);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 5:
                    list3 = zza.zzc(parcel, zzap, DataType.CREATOR);
                    break;
                case 6:
                    list4 = zza.zzc(parcel, zzap, DataSource.CREATOR);
                    break;
                case 7:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 9:
                    dataSource = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    break;
                case 10:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 12:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 13:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 14:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 16:
                    list5 = zza.zzc(parcel, zzap, Device.CREATOR);
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
            return new DataReadRequest(i, list, list2, j, j2, list3, list4, i2, j3, dataSource, i3, z, z2, iBinder, list5);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataReadRequest[] zzfB(int i) {
        return new DataReadRequest[i];
    }
}
