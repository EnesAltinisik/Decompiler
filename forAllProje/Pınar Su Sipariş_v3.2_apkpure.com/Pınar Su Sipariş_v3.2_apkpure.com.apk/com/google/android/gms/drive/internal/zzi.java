package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.Contents;

public class zzi implements Creator<CloseContentsRequest> {
    static void zza(CloseContentsRequest closeContentsRequest, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, closeContentsRequest.mVersionCode);
        zzb.zza(parcel, 2, closeContentsRequest.zzawL, i, false);
        zzb.zza(parcel, 3, closeContentsRequest.zzawP, false);
        zzb.zzc(parcel, 4, closeContentsRequest.zzawN);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzbg(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzdm(i);
    }

    public CloseContentsRequest zzbg(Parcel parcel) {
        Boolean bool = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        Contents contents = null;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            Boolean bool2;
            Contents contents2;
            int zzg;
            int zzap = zza.zzap(parcel);
            int i3;
            switch (zza.zzcj(zzap)) {
                case 1:
                    i3 = i;
                    bool2 = bool;
                    contents2 = contents;
                    zzg = zza.zzg(parcel, zzap);
                    zzap = i3;
                    break;
                case 2:
                    zzg = i2;
                    Boolean bool3 = bool;
                    contents2 = (Contents) zza.zza(parcel, zzap, Contents.CREATOR);
                    zzap = i;
                    bool2 = bool3;
                    break;
                case 3:
                    contents2 = contents;
                    zzg = i2;
                    i3 = i;
                    bool2 = zza.zzd(parcel, zzap);
                    zzap = i3;
                    break;
                case 4:
                    zzap = zza.zzg(parcel, zzap);
                    bool2 = bool;
                    contents2 = contents;
                    zzg = i2;
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    zzap = i;
                    bool2 = bool;
                    contents2 = contents;
                    zzg = i2;
                    break;
            }
            i2 = zzg;
            contents = contents2;
            bool = bool2;
            i = zzap;
        }
        if (parcel.dataPosition() == zzaq) {
            return new CloseContentsRequest(i2, contents, bool, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public CloseContentsRequest[] zzdm(int i) {
        return new CloseContentsRequest[i];
    }
}
