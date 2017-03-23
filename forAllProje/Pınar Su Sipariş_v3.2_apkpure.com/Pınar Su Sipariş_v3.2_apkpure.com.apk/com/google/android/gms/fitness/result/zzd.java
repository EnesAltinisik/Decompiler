package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.fitness.data.DataSource;

public class zzd implements Creator<DataSourceStatsResult> {
    static void zza(DataSourceStatsResult dataSourceStatsResult, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, dataSourceStatsResult.zzaCI, i, false);
        zzb.zza(parcel, 2, dataSourceStatsResult.zzaaQ);
        zzb.zza(parcel, 3, dataSourceStatsResult.zzaIv);
        zzb.zza(parcel, 4, dataSourceStatsResult.zzaIw);
        zzb.zza(parcel, 5, dataSourceStatsResult.zzaIx);
        zzb.zzc(parcel, 1000, dataSourceStatsResult.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgh(i);
    }

    public DataSourceStatsResult zzdQ(Parcel parcel) {
        boolean z = false;
        long j = 0;
        int zzaq = zza.zzaq(parcel);
        DataSource dataSource = null;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
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
                    z = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 5:
                    j = zza.zzi(parcel, zzap);
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
            return new DataSourceStatsResult(i, dataSource, j3, z, j2, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DataSourceStatsResult[] zzgh(int i) {
        return new DataSourceStatsResult[i];
    }
}
