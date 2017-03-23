package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzj implements Creator<UsageInfo> {
    static void zza(UsageInfo usageInfo, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, usageInfo.zzaak, i, false);
        zzb.zza(parcel, 2, usageInfo.zzaal);
        zzb.zzc(parcel, 3, usageInfo.zzaam);
        zzb.zza(parcel, 4, usageInfo.zzwM, false);
        zzb.zza(parcel, 5, usageInfo.zzaan, i, false);
        zzb.zza(parcel, 6, usageInfo.zzaao);
        zzb.zzc(parcel, 7, usageInfo.zzaap);
        zzb.zzc(parcel, 1000, usageInfo.mVersionCode);
        zzb.zzc(parcel, 8, usageInfo.zzaaq);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzA(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaH(i);
    }

    public UsageInfo zzA(Parcel parcel) {
        DocumentContents documentContents = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        long j = 0;
        int i2 = -1;
        boolean z = false;
        String str = null;
        int i3 = 0;
        DocumentId documentId = null;
        int i4 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    documentId = (DocumentId) zza.zza(parcel, zzap, DocumentId.CREATOR);
                    break;
                case 2:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    documentContents = (DocumentContents) zza.zza(parcel, zzap, DocumentContents.CREATOR);
                    break;
                case 6:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 7:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new UsageInfo(i4, documentId, j, i3, str, documentContents, z, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public UsageInfo[] zzaH(int i) {
        return new UsageInfo[i];
    }
}
