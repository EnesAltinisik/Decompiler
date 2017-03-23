package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh implements Creator<PutDataRequest> {
    static void zza(PutDataRequest putDataRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, putDataRequest.mVersionCode);
        zzb.zza(parcel, 2, putDataRequest.getUri(), i, false);
        zzb.zza(parcel, 4, putDataRequest.zzNq(), false);
        zzb.zza(parcel, 5, putDataRequest.getData(), false);
        zzb.zza(parcel, 6, putDataRequest.zzNr());
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zziy(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzmv(i);
    }

    public PutDataRequest zziy(Parcel parcel) {
        byte[] bArr = null;
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        long j = 0;
        Bundle bundle = null;
        Uri uri = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    uri = (Uri) zza.zza(parcel, zzap, Uri.CREATOR);
                    break;
                case 4:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 5:
                    bArr = zza.zzt(parcel, zzap);
                    break;
                case 6:
                    j = zza.zzi(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new PutDataRequest(i, uri, bundle, bArr, j);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public PutDataRequest[] zzmv(int i) {
        return new PutDataRequest[i];
    }
}
