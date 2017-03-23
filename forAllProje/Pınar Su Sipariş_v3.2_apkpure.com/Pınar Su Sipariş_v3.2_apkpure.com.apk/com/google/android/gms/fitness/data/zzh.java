package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<DataUpdateNotification> {
    static void zza(DataUpdateNotification dataUpdateNotification, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataUpdateNotification.zzxz());
        zzb.zza(parcel, 2, dataUpdateNotification.zzxA());
        zzb.zzc(parcel, 3, dataUpdateNotification.getOperationType());
        zzb.zza(parcel, 4, dataUpdateNotification.getDataSource(), i, false);
        zzb.zza(parcel, 5, dataUpdateNotification.getDataType(), i, false);
        zzb.zzc(parcel, 1000, dataUpdateNotification.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcU(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfj(i);
    }

    public DataUpdateNotification zzcU(Parcel parcel) {
        long j = 0;
        DataType dataType = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DataSource dataSource = null;
        long j2 = 0;
        int i2 = 0;
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
                    i = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    dataSource = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    break;
                case 5:
                    dataType = (DataType) zza.zza(parcel, zzap, DataType.CREATOR);
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
            return new DataUpdateNotification(i2, j2, j, i, dataSource, dataType);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataUpdateNotification[] zzfj(int i) {
        return new DataUpdateNotification[i];
    }
}
