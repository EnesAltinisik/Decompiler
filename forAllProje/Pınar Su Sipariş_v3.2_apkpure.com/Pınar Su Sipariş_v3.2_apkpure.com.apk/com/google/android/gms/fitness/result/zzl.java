package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzl implements Creator<SyncInfoResult> {
    static void zza(SyncInfoResult syncInfoResult, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, syncInfoResult.getStatus(), i, false);
        zzb.zza(parcel, 2, syncInfoResult.zzyA());
        zzb.zzc(parcel, 1000, syncInfoResult.getVersionCode());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzdY(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzgp(i);
    }

    public SyncInfoResult zzdY(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Status status = null;
        long j = 0;
        while (parcel.dataPosition() < zzaq) {
            Status status2;
            int i2;
            long j2;
            int zzap = zza.zzap(parcel);
            long j3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    j3 = j;
                    status2 = (Status) zza.zza(parcel, zzap, Status.CREATOR);
                    i2 = i;
                    j2 = j3;
                    break;
                case 2:
                    j2 = zza.zzi(parcel, zzap);
                    status2 = status;
                    i2 = i;
                    break;
                case 1000:
                    j3 = j;
                    status2 = status;
                    i2 = zza.zzg(parcel, zzap);
                    j2 = j3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    j2 = j;
                    status2 = status;
                    i2 = i;
                    break;
            }
            status = status2;
            i = i2;
            j = j2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SyncInfoResult(i, status, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SyncInfoResult[] zzgp(int i) {
        return new SyncInfoResult[i];
    }
}
