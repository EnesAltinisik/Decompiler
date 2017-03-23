package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzg implements Creator<DataSourceQueryParams> {
    static void zza(DataSourceQueryParams dataSourceQueryParams, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataSourceQueryParams.zzaCI, i, false);
        zzb.zza(parcel, 2, dataSourceQueryParams.zzaaQ);
        zzb.zza(parcel, 3, dataSourceQueryParams.zzaCY);
        zzb.zza(parcel, 4, dataSourceQueryParams.zzaHG);
        zzb.zzc(parcel, 5, dataSourceQueryParams.zzaHB);
        zzb.zzc(parcel, 6, dataSourceQueryParams.zzaHH);
        zzb.zzc(parcel, 1000, dataSourceQueryParams.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdm(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfC(i);
    }

    public DataSourceQueryParams zzdm(Parcel parcel) {
        long j = 0;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DataSource dataSource = null;
        int i2 = 0;
        long j2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    dataSource = (DataSource) zza.zza(parcel, zzap, DataSource.CREATOR);
                    break;
                case 2:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 5:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new DataSourceQueryParams(i3, dataSource, j3, j2, j, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataSourceQueryParams[] zzfC(int i) {
        return new DataSourceQueryParams[i];
    }
}
