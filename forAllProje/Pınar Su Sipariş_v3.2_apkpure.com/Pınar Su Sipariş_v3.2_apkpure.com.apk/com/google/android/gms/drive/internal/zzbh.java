package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;

public class zzbh implements Creator<OpenContentsRequest> {
    static void zza(OpenContentsRequest openContentsRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, openContentsRequest.mVersionCode);
        zzb.zza(parcel, 2, openContentsRequest.zzawJ, i, false);
        zzb.zzc(parcel, 3, openContentsRequest.zzauY);
        zzb.zzc(parcel, 4, openContentsRequest.zzayS);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbN(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdY(i);
    }

    public OpenContentsRequest zzbN(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        DriveId driveId = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            DriveId driveId2;
            int zzg;
            int zzap = zza.zzap(parcel);
            int i4;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i4 = i;
                    i = i2;
                    driveId2 = driveId;
                    zzg = zza.zzg(parcel, zzap);
                    zzap = i4;
                    break;
                case 2:
                    zzg = i3;
                    i4 = i2;
                    driveId2 = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    zzap = i;
                    i = i4;
                    break;
                case 3:
                    driveId2 = driveId;
                    zzg = i3;
                    i4 = i;
                    i = zza.zzg(parcel, zzap);
                    zzap = i4;
                    break;
                case 4:
                    zzap = zza.zzg(parcel, zzap);
                    i = i2;
                    driveId2 = driveId;
                    zzg = i3;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzap = i;
                    i = i2;
                    driveId2 = driveId;
                    zzg = i3;
                    break;
            }
            i3 = zzg;
            driveId = driveId2;
            i2 = i;
            i = zzap;
        }
        if (parcel.dataPosition() == zzaq) {
            return new OpenContentsRequest(i3, driveId, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OpenContentsRequest[] zzdY(int i) {
        return new OpenContentsRequest[i];
    }
}
