package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzp implements Creator<RawDataSet> {
    static void zza(RawDataSet rawDataSet, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, rawDataSet.zzaDU);
        zzb.zzc(parcel, 2, rawDataSet.zzaDW);
        zzb.zzc(parcel, 3, rawDataSet.zzaDX, false);
        zzb.zza(parcel, 4, rawDataSet.zzaCW);
        zzb.zzc(parcel, 1000, rawDataSet.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzda(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfp(i);
    }

    public RawDataSet zzda(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        List list = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzc(parcel, zzap, RawDataPoint.CREATOR);
                    break;
                case 4:
                    z = zza.zzc(parcel, zzap);
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
            return new RawDataSet(i3, i2, i, list, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RawDataSet[] zzfp(int i) {
        return new RawDataSet[i];
    }
}
