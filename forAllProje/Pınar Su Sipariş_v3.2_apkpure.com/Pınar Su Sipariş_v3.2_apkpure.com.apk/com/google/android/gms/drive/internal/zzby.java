package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzby implements Creator<UpdatePermissionRequest> {
    static void zza(UpdatePermissionRequest updatePermissionRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, updatePermissionRequest.mVersionCode);
        zzb.zza(parcel, 2, updatePermissionRequest.zzauZ, i, false);
        zzb.zza(parcel, 3, updatePermissionRequest.zzavK, false);
        zzb.zzc(parcel, 4, updatePermissionRequest.zzayZ);
        zzb.zza(parcel, 5, updatePermissionRequest.zzawD);
        zzb.zza(parcel, 6, updatePermissionRequest.zzavv, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzcc(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzen(i);
    }

    public UpdatePermissionRequest zzcc(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        String str2 = null;
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    driveId = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    break;
                case 3:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 4:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new UpdatePermissionRequest(i2, driveId, str2, i, z, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public UpdatePermissionRequest[] zzen(int i) {
        return new UpdatePermissionRequest[i];
    }
}
