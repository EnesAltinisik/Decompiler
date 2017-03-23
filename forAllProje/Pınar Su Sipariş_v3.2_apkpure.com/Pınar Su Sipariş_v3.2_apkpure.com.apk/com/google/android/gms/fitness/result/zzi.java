package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzi implements Creator<ReadRawResult> {
    static void zza(ReadRawResult readRawResult, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, readRawResult.zzwg(), i, false);
        zzb.zzc(parcel, 2, readRawResult.zzyy(), false);
        zzb.zzc(parcel, 1000, readRawResult.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdV(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgm(i);
    }

    public ReadRawResult zzdV(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DataHolder dataHolder = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            DataHolder dataHolder2;
            ArrayList zzc;
            int zzap = zza.zzap(parcel);
            List list2;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    DataHolder dataHolder3 = (DataHolder) zza.zza(parcel, zzap, DataHolder.CREATOR);
                    list2 = list;
                    dataHolder2 = dataHolder3;
                    break;
                case 2:
                    zzc = zza.zzc(parcel, zzap, DataHolder.CREATOR);
                    dataHolder2 = dataHolder;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    dataHolder2 = dataHolder;
                    i2 = zza.zzg(parcel, zzap);
                    list2 = list3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzc = list;
                    dataHolder2 = dataHolder;
                    i2 = i;
                    break;
            }
            i = i2;
            dataHolder = dataHolder2;
            Object obj = zzc;
        }
        if (parcel.dataPosition() == zzaq) {
            return new ReadRawResult(i, dataHolder, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ReadRawResult[] zzgm(int i) {
        return new ReadRawResult[i];
    }
}
