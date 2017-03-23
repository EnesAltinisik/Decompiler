package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zze implements Creator<FetchConfigIpcRequest> {
    static void zza(FetchConfigIpcRequest fetchConfigIpcRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, fetchConfigIpcRequest.mVersionCode);
        zzb.zza(parcel, 2, fetchConfigIpcRequest.getPackageName(), false);
        zzb.zza(parcel, 3, fetchConfigIpcRequest.zzvu());
        zzb.zza(parcel, 4, fetchConfigIpcRequest.zzvv(), i, false);
        zzb.zza(parcel, 5, fetchConfigIpcRequest.zzvw(), false);
        zzb.zza(parcel, 6, fetchConfigIpcRequest.zzvx(), false);
        zzb.zza(parcel, 7, fetchConfigIpcRequest.zzvy(), false);
        zzb.zzb(parcel, 8, fetchConfigIpcRequest.zzvz(), false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaE(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzcD(i);
    }

    public FetchConfigIpcRequest zzaE(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        DataHolder dataHolder = null;
        String str4 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    dataHolder = (DataHolder) zza.zza(parcel, zzap, DataHolder.CREATOR);
                    break;
                case 5:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    list = zza.zzE(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new FetchConfigIpcRequest(i, str4, j, dataHolder, str3, str2, str, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public FetchConfigIpcRequest[] zzcD(int i) {
        return new FetchConfigIpcRequest[i];
    }
}
