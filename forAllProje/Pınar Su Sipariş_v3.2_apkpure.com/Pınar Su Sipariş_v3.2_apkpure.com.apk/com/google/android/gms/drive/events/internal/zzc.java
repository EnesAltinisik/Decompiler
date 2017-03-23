package com.google.android.gms.drive.events.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzc implements Creator<TransferProgressData> {
    static void zza(TransferProgressData transferProgressData, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, transferProgressData.mVersionCode);
        zzb.zzc(parcel, 2, transferProgressData.zzawt);
        zzb.zza(parcel, 3, transferProgressData.zzauZ, i, false);
        zzb.zzc(parcel, 4, transferProgressData.zzDO);
        zzb.zza(parcel, 5, transferProgressData.zzaww);
        zzb.zza(parcel, 6, transferProgressData.zzawx);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaY(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzde(i);
    }

    public TransferProgressData zzaY(Parcel parcel) {
        long j = 0;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DriveId driveId = null;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 3:
                    driveId = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 6:
                    j = zza.zzi(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new TransferProgressData(i3, i2, driveId, i, j2, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public TransferProgressData[] zzde(int i) {
        return new TransferProgressData[i];
    }
}
