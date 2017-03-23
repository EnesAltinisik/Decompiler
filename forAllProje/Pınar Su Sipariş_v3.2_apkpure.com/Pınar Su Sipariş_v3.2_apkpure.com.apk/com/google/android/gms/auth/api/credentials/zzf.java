package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzf implements Creator<PasswordSpecification> {
    static void zza(PasswordSpecification passwordSpecification, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zza(parcel, 1, passwordSpecification.zzabN, false);
        zzb.zzb(parcel, 2, passwordSpecification.zzabO, false);
        zzb.zza(parcel, 3, passwordSpecification.zzabP, false);
        zzb.zzc(parcel, 4, passwordSpecification.zzabQ);
        zzb.zzc(parcel, 5, passwordSpecification.zzabR);
        zzb.zzc(parcel, 1000, passwordSpecification.mVersionCode);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzK(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzaR(i);
    }

    public PasswordSpecification zzK(Parcel parcel) {
        List list = null;
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        int i2 = 0;
        List list2 = null;
        String str = null;
        int i3 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 2:
                    list2 = zza.zzE(parcel, zzap);
                    break;
                case 3:
                    list = zza.zzD(parcel, zzap);
                    break;
                case 4:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 5:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 1000:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new PasswordSpecification(i3, str, list2, list, i2, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public PasswordSpecification[] zzaR(int i) {
        return new PasswordSpecification[i];
    }
}
