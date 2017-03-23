package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class zzbj implements Creator<OpenFileIntentSenderRequest> {
    static void zza(OpenFileIntentSenderRequest openFileIntentSenderRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, openFileIntentSenderRequest.mVersionCode);
        zzb.zza(parcel, 2, openFileIntentSenderRequest.zzavG, false);
        zzb.zza(parcel, 3, openFileIntentSenderRequest.zzavH, false);
        zzb.zza(parcel, 4, openFileIntentSenderRequest.zzavJ, i, false);
        zzb.zza(parcel, 5, openFileIntentSenderRequest.zzayU, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbO(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdZ(i);
    }

    public OpenFileIntentSenderRequest zzbO(Parcel parcel) {
        FilterHolder filterHolder = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        DriveId driveId = null;
        String[] strArr = null;
        String str = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 3:
                    strArr = zza.zzC(parcel, zzap);
                    break;
                case 4:
                    driveId = (DriveId) zza.zza(parcel, zzap, DriveId.CREATOR);
                    break;
                case 5:
                    filterHolder = (FilterHolder) zza.zza(parcel, zzap, FilterHolder.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new OpenFileIntentSenderRequest(i, str, strArr, driveId, filterHolder);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OpenFileIntentSenderRequest[] zzdZ(int i) {
        return new OpenFileIntentSenderRequest[i];
    }
}
