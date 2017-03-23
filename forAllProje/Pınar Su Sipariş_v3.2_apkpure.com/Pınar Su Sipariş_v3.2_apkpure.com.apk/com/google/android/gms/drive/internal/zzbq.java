package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.List;

public class zzbq implements Creator<SetResourceParentsRequest> {
    static void zza(SetResourceParentsRequest setResourceParentsRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, setResourceParentsRequest.mVersionCode);
        zzb.zza(parcel, 2, setResourceParentsRequest.zzawF, i, false);
        zzb.zzc(parcel, 3, setResourceParentsRequest.zzayX, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbV(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzeg(i);
    }

    public SetResourceParentsRequest zzbV(Parcel parcel) {
        List list = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DriveId driveId = null;
        while (parcel.dataPosition() < zzaq) {
            DriveId driveId2;
            int zzg;
            ArrayList zzc;
            int zzap = zza.zzap(parcel);
            List list2;
            switch (zza.zzcj(zzap)) {
                case 1:
                    List list3 = list;
                    driveId2 = driveId;
                    zzg = zza.zzg(parcel, zzap);
                    list2 = list3;
                    break;
                case 2:
                    zzg = i;
                    DriveId driveId3 = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    list2 = list;
                    driveId2 = driveId3;
                    break;
                case 3:
                    zzc = zza.zzc(parcel, zzap, DriveId.CREATOR);
                    driveId2 = driveId;
                    zzg = i;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzc = list;
                    driveId2 = driveId;
                    zzg = i;
                    break;
            }
            i = zzg;
            driveId = driveId2;
            Object obj = zzc;
        }
        if (parcel.dataPosition() == zzaq) {
            return new SetResourceParentsRequest(i, driveId, list);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public SetResourceParentsRequest[] zzeg(int i) {
        return new SetResourceParentsRequest[i];
    }
}
