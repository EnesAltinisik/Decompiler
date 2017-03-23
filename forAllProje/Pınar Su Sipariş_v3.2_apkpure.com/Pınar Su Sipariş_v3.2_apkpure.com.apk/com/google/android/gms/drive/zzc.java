package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc implements Creator<DriveFileRange> {
    static void zza(DriveFileRange driveFileRange, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, driveFileRange.mVersionCode);
        zzb.zza(parcel, 2, driveFileRange.zzavj);
        zzb.zza(parcel, 3, driveFileRange.zzavk);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzaJ(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzcI(i);
    }

    public DriveFileRange zzaJ(Parcel parcel) {
        long j = 0;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 3:
                    j = zza.zzi(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new DriveFileRange(i, j2, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public DriveFileRange[] zzcI(int i) {
        return new DriveFileRange[i];
    }
}
