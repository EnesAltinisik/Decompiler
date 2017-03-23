package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzat implements Creator<OnContentsResponse> {
    static void zza(OnContentsResponse onContentsResponse, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, onContentsResponse.mVersionCode);
        zzb.zza(parcel, 2, onContentsResponse.zzaxB, i, false);
        zzb.zza(parcel, 3, onContentsResponse.zzayA);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbz(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdK(i);
    }

    public OnContentsResponse zzbz(Parcel parcel) {
        boolean z = false;
        int zzaq = zza.zzaq(parcel);
        Contents contents = null;
        int i = 0;
        while (parcel.dataPosition() < zzaq) {
            Contents contents2;
            int zzg;
            boolean z2;
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    boolean z3 = z;
                    contents2 = contents;
                    zzg = zza.zzg(parcel, zzap);
                    z2 = z3;
                    break;
                case 2:
                    zzg = i;
                    Contents contents3 = (Contents) zza.zza(parcel, zzap, Contents.CREATOR);
                    z2 = z;
                    contents2 = contents3;
                    break;
                case 3:
                    z2 = zza.zzc(parcel, zzap);
                    contents2 = contents;
                    zzg = i;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    z2 = z;
                    contents2 = contents;
                    zzg = i;
                    break;
            }
            i = zzg;
            contents = contents2;
            z = z2;
        }
        if (parcel.dataPosition() == zzaq) {
            return new OnContentsResponse(i, contents, z);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public OnContentsResponse[] zzdK(int i) {
        return new OnContentsResponse[i];
    }
}
