package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzo implements Creator<RawDataPoint> {
    static void zza(RawDataPoint rawDataPoint, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, rawDataPoint.zzaCX);
        zzb.zza(parcel, 2, rawDataPoint.zzaCY);
        zzb.zza(parcel, 3, rawDataPoint.zzaCZ, i, false);
        zzb.zzc(parcel, 4, rawDataPoint.zzaDU);
        zzb.zzc(parcel, 5, rawDataPoint.zzaDV);
        zzb.zza(parcel, 6, rawDataPoint.zzaDb);
        zzb.zza(parcel, 7, rawDataPoint.zzaDc);
        zzb.zzc(parcel, 1000, rawDataPoint.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcZ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfo(i);
    }

    public RawDataPoint zzcZ(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        long j2 = 0;
        Value[] valueArr = null;
        int i2 = 0;
        int i3 = 0;
        long j3 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 2:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    valueArr = (Value[]) zza.zzb(parcel, zzap, Value.CREATOR);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 6:
                    j3 = zza.zzi(parcel, zzap);
                    break;
                case 7:
                    j4 = zza.zzi(parcel, zzap);
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
            return new RawDataPoint(i, j, j2, valueArr, i2, i3, j3, j4);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RawDataPoint[] zzfo(int i) {
        return new RawDataPoint[i];
    }
}
