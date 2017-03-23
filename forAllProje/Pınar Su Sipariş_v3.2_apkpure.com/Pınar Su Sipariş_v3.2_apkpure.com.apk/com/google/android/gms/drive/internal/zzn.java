package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzn implements Creator<CreateFileRequest> {
    static void zza(CreateFileRequest createFileRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, createFileRequest.mVersionCode);
        zzb.zza(parcel, 2, createFileRequest.zzawY, i, false);
        zzb.zza(parcel, 3, createFileRequest.zzawW, i, false);
        zzb.zza(parcel, 4, createFileRequest.zzawL, i, false);
        zzb.zza(parcel, 5, createFileRequest.zzawX, false);
        zzb.zza(parcel, 6, createFileRequest.zzawD);
        zzb.zza(parcel, 7, createFileRequest.zzavv, false);
        zzb.zzc(parcel, 8, createFileRequest.zzawZ);
        zzb.zzc(parcel, 9, createFileRequest.zzaxa);
        zzb.zza(parcel, 10, createFileRequest.zzavy, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbk(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdr(i);
    }

    public CreateFileRequest zzbk(Parcel parcel) {
        int i = 0;
        String str = null;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        String str2 = null;
        boolean z = false;
        Integer num = null;
        Contents contents = null;
        MetadataBundle metadataBundle = null;
        DriveId driveId = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    driveId = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    break;
                case 3:
                    metadataBundle = (MetadataBundle) zza.zza(parcel, zzap, MetadataBundle.CREATOR);
                    break;
                case 4:
                    contents = (Contents) zza.zza(parcel, zzap, Contents.CREATOR);
                    break;
                case 5:
                    num = zza.zzh(parcel, zzap);
                    break;
                case 6:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 7:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 9:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 10:
                    str = zza.zzq(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CreateFileRequest(i3, driveId, metadataBundle, contents, num, z, str2, i2, i, str);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CreateFileRequest[] zzdr(int i) {
        return new CreateFileRequest[i];
    }
}
