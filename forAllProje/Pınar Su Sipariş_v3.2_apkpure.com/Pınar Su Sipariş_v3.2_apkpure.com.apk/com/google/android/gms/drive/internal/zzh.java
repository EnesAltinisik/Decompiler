package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class zzh implements Creator<CloseContentsAndUpdateMetadataRequest> {
    static void zza(CloseContentsAndUpdateMetadataRequest closeContentsAndUpdateMetadataRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, closeContentsAndUpdateMetadataRequest.mVersionCode);
        zzb.zza(parcel, 2, closeContentsAndUpdateMetadataRequest.zzawJ, i, false);
        zzb.zza(parcel, 3, closeContentsAndUpdateMetadataRequest.zzawK, i, false);
        zzb.zza(parcel, 4, closeContentsAndUpdateMetadataRequest.zzawL, i, false);
        zzb.zza(parcel, 5, closeContentsAndUpdateMetadataRequest.zzavw);
        zzb.zza(parcel, 6, closeContentsAndUpdateMetadataRequest.zzavv, false);
        zzb.zzc(parcel, 7, closeContentsAndUpdateMetadataRequest.zzawM);
        zzb.zzc(parcel, 8, closeContentsAndUpdateMetadataRequest.zzawN);
        zzb.zza(parcel, 9, closeContentsAndUpdateMetadataRequest.zzawO);
        zzb.zza(parcel, 10, closeContentsAndUpdateMetadataRequest.zzavA);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbf(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdl(i);
    }

    public CloseContentsAndUpdateMetadataRequest zzbf(Parcel parcel) {
        String str = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        boolean z3 = false;
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
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 7:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 8:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 9:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 10:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new CloseContentsAndUpdateMetadataRequest(i3, driveId, metadataBundle, contents, z3, str, i2, i, z, z2);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CloseContentsAndUpdateMetadataRequest[] zzdl(int i) {
        return new CloseContentsAndUpdateMetadataRequest[i];
    }
}
