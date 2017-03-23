package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator<QueryResultEventParcelable> {
    static void zza(QueryResultEventParcelable queryResultEventParcelable, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, queryResultEventParcelable.mVersionCode);
        zzb.zza(parcel, 2, queryResultEventParcelable.zzamz, i, false);
        zzb.zza(parcel, 3, queryResultEventParcelable.zzawq);
        zzb.zzc(parcel, 4, queryResultEventParcelable.zzawr);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaT(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzcY(i);
    }

    public QueryResultEventParcelable zzaT(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DataHolder dataHolder = null;
        boolean z = false;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            boolean z2;
            DataHolder dataHolder2;
            int zzg;
            int zzap = zza.zzap(parcel);
            int i3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    zzg = zza.zzg(parcel, zzap);
                    zzap = i3;
                    break;
                case 2:
                    zzg = i2;
                    boolean z3 = z;
                    dataHolder2 = (DataHolder) zza.zza(parcel, zzap, DataHolder.CREATOR);
                    zzap = i;
                    z2 = z3;
                    break;
                case 3:
                    dataHolder2 = dataHolder;
                    zzg = i2;
                    i3 = i;
                    z2 = zza.zzc(parcel, zzap);
                    zzap = i3;
                    break;
                case 4:
                    zzap = zza.zzg(parcel, zzap);
                    z2 = z;
                    dataHolder2 = dataHolder;
                    zzg = i2;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzap = i;
                    z2 = z;
                    dataHolder2 = dataHolder;
                    zzg = i2;
                    break;
            }
            i2 = zzg;
            dataHolder = dataHolder2;
            z = z2;
            i = zzap;
        }
        if (parcel.dataPosition() == zzaq) {
            return new QueryResultEventParcelable(i2, dataHolder, z, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public QueryResultEventParcelable[] zzcY(int i) {
        return new QueryResultEventParcelable[i];
    }
}
