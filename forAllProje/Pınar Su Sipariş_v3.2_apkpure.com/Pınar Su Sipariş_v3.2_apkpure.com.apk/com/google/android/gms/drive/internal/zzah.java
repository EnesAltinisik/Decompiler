package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.List;

public class zzah implements Creator<GetChangesRequest> {
    static void zza(GetChangesRequest getChangesRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, getChangesRequest.mVersionCode);
        zzb.zza(parcel, 2, getChangesRequest.zzayk, i, false);
        zzb.zzc(parcel, 3, getChangesRequest.zzayl);
        zzb.zzc(parcel, 4, getChangesRequest.zzawb, false);
        zzb.zza(parcel, 5, getChangesRequest.zzaym);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbr(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdC(i);
    }

    public GetChangesRequest zzbr(Parcel parcel) {
        List list = null;
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        ChangeSequenceNumber changeSequenceNumber = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    changeSequenceNumber = (ChangeSequenceNumber) zza.zza(parcel, zzap, ChangeSequenceNumber.CREATOR);
                    break;
                case 3:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 4:
                    list = zza.zzc(parcel, zzap, DriveSpace.CREATOR);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new GetChangesRequest(i2, changeSequenceNumber, i, list, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public GetChangesRequest[] zzdC(int i) {
        return new GetChangesRequest[i];
    }
}
