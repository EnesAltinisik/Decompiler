package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzt implements Creator<ReadRawRequest> {
    static void zza(ReadRawRequest readRawRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, readRawRequest.getCallbackBinder(), false);
        zzb.zzc(parcel, 3, readRawRequest.zzyg(), false);
        zzb.zza(parcel, 4, readRawRequest.zzya());
        zzb.zza(parcel, 5, readRawRequest.zzxZ());
        zzb.zzc(parcel, 1000, readRawRequest.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzfO(i);
    }

    public ReadRawRequest zzdy(Parcel parcel) {
        List list = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzc(parcel, zzap, DataSourceQueryParams.CREATOR);
                    break;
                case 4:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
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
            return new ReadRawRequest(i, iBinder, list, z2, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ReadRawRequest[] zzfO(int i) {
        return new ReadRawRequest[i];
    }
}
