package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.query.Query;

public class zzbl implements Creator<QueryRequest> {
    static void zza(QueryRequest queryRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, queryRequest.mVersionCode);
        zzb.zza(parcel, 2, queryRequest.zzayW, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbQ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeb(i);
    }

    public QueryRequest zzbQ(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Query query = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    query = (Query) zza.zza(parcel, zzap, Query.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new QueryRequest(i, query);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public QueryRequest[] zzeb(int i) {
        return new QueryRequest[i];
    }
}
