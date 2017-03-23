package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzj implements Creator<ControlProgressRequest> {
    static void zza(ControlProgressRequest controlProgressRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, controlProgressRequest.mVersionCode);
        zzb.zzc(parcel, 2, controlProgressRequest.zzawQ);
        zzb.zzc(parcel, 3, controlProgressRequest.zzawR);
        zzb.zza(parcel, 4, controlProgressRequest.zzauZ, i, false);
        zzb.zza(parcel, 5, controlProgressRequest.zzawS, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdn(i);
    }

    public ControlProgressRequest zzbh(Parcel parcel) {
        ParcelableTransferPreferences parcelableTransferPreferences = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DriveId driveId = null;
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
                    i = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    driveId = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    break;
                case 5:
                    parcelableTransferPreferences = (ParcelableTransferPreferences) zza.zza(parcel, zzap, ParcelableTransferPreferences.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new ControlProgressRequest(i3, i2, i, driveId, parcelableTransferPreferences);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public ControlProgressRequest[] zzdn(int i) {
        return new ControlProgressRequest[i];
    }
}
