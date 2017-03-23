package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzg implements Creator<Response> {
    static void zza(Response response, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, response.zzZR, i, false);
        zzb.zzc(parcel, 2, response.zzZS, false);
        zzb.zza(parcel, 3, response.zzZT, false);
        zzb.zzc(parcel, 1000, response.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaB(i);
    }

    public Response[] zzaB(int i) {
        return new Response[i];
    }

    public Response zzy(Parcel parcel) {
        String[] strArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        List list = null;
        Status status = null;
        while (parcel.dataPosition() < zzaq) {
            int i2;
            Status status2;
            String[] strArr2;
            List list2;
            int zzap = zza.zzap(parcel);
            String[] strArr3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = i;
                    List list3 = list;
                    status2 = (Status) zza.zza(parcel, zzap, Status.CREATOR);
                    strArr2 = strArr;
                    list2 = list3;
                    break;
                case 2:
                    status2 = status;
                    i2 = i;
                    strArr3 = strArr;
                    Object zzc = zza.zzc(parcel, zzap, UsageInfo.CREATOR);
                    strArr2 = strArr3;
                    break;
                case 3:
                    strArr2 = zza.zzC(parcel, zzap);
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    strArr3 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = zza.zzg(parcel, zzap);
                    strArr2 = strArr3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    strArr2 = strArr;
                    list2 = list;
                    status2 = status;
                    i2 = i;
                    break;
            }
            i = i2;
            status = status2;
            list = list2;
            strArr = strArr2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new Response(i, status, list, strArr);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
