package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;
import java.util.List;

public class zzk implements Creator<LogicalFilter> {
    static void zza(LogicalFilter logicalFilter, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, logicalFilter.zzaAH, i, false);
        zzb.zzc(parcel, 2, logicalFilter.zzaAW, false);
        zzb.zzc(parcel, 1000, logicalFilter.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcs(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeD(i);
    }

    public LogicalFilter zzcs(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Operator operator = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            Operator operator2;
            ArrayList zzc;
            int zzap = zza.zzap(parcel);
            List list2;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    Operator operator3 = (Operator) zza.zza(parcel, zzap, Operator.CREATOR);
                    list2 = list;
                    operator2 = operator3;
                    break;
                case 2:
                    zzc = zza.zzc(parcel, zzap, FilterHolder.CREATOR);
                    operator2 = operator;
                    i2 = i;
                    break;
                case 1000:
                    List list3 = list;
                    operator2 = operator;
                    i2 = zza.zzg(parcel, zzap);
                    list2 = list3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzc = list;
                    operator2 = operator;
                    i2 = i;
                    break;
            }
            i = i2;
            operator = operator2;
            Object obj = zzc;
        }
        if (parcel.dataPosition() == zzaq) {
            return new LogicalFilter(i, operator, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public LogicalFilter[] zzeD(int i) {
        return new LogicalFilter[i];
    }
}
