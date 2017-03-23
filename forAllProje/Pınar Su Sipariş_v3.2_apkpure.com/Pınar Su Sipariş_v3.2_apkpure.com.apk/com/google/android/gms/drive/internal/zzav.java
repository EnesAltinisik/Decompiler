package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveFileRange;
import java.util.List;

public class zzav implements Creator<OnDownloadProgressResponse> {
    static void zza(OnDownloadProgressResponse onDownloadProgressResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, onDownloadProgressResponse.mVersionCode);
        zzb.zza(parcel, 2, onDownloadProgressResponse.zzayD);
        zzb.zza(parcel, 3, onDownloadProgressResponse.zzayE);
        zzb.zzc(parcel, 4, onDownloadProgressResponse.zzDO);
        zzb.zzc(parcel, 5, onDownloadProgressResponse.zzayF, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbB(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdM(i);
    }

    public OnDownloadProgressResponse zzbB(Parcel parcel) {
        long j = 0;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        List list = null;
        long j2 = 0;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    list = zza.zzc(parcel, zzap, DriveFileRange.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new OnDownloadProgressResponse(i2, j2, j, i, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OnDownloadProgressResponse[] zzdM(int i) {
        return new OnDownloadProgressResponse[i];
    }
}
