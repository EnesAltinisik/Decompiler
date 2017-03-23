package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.TransferProgressOptions;

public class zzbm implements Creator<RemoveEventListenerRequest> {
    static void zza(RemoveEventListenerRequest removeEventListenerRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, removeEventListenerRequest.mVersionCode);
        zzb.zza(parcel, 2, removeEventListenerRequest.zzauZ, i, false);
        zzb.zzc(parcel, 3, removeEventListenerRequest.zzatd);
        zzb.zza(parcel, 4, removeEventListenerRequest.zzawz, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbR(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzec(i);
    }

    public RemoveEventListenerRequest zzbR(Parcel parcel) {
        TransferProgressOptions transferProgressOptions = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DriveId driveId = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int i3;
            DriveId driveId2;
            int zzg;
            TransferProgressOptions transferProgressOptions2;
            int zzap = zza.zzap(parcel);
            TransferProgressOptions transferProgressOptions3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    transferProgressOptions3 = transferProgressOptions;
                    i3 = i;
                    driveId2 = driveId;
                    zzg = zza.zzg(parcel, zzap);
                    transferProgressOptions2 = transferProgressOptions3;
                    break;
                case 2:
                    zzg = i2;
                    int i4 = i;
                    driveId2 = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    transferProgressOptions2 = transferProgressOptions;
                    i3 = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    zzg = i2;
                    transferProgressOptions3 = transferProgressOptions;
                    i3 = zza.zzg(parcel, zzap);
                    transferProgressOptions2 = transferProgressOptions3;
                    break;
                case 4:
                    transferProgressOptions2 = (TransferProgressOptions) zza.zza(parcel, zzap, TransferProgressOptions.CREATOR);
                    i3 = i;
                    driveId2 = driveId;
                    zzg = i2;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    transferProgressOptions2 = transferProgressOptions;
                    i3 = i;
                    driveId2 = driveId;
                    zzg = i2;
                    break;
            }
            i2 = zzg;
            driveId = driveId2;
            i = i3;
            transferProgressOptions = transferProgressOptions2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new RemoveEventListenerRequest(i2, driveId, i, transferProgressOptions);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public RemoveEventListenerRequest[] zzec(int i) {
        return new RemoveEventListenerRequest[i];
    }
}
