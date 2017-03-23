package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzm implements Creator<InterstitialAdParameterParcel> {
    static void zza(InterstitialAdParameterParcel interstitialAdParameterParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, interstitialAdParameterParcel.versionCode);
        zzb.zza(parcel, 2, interstitialAdParameterParcel.zzrf);
        zzb.zza(parcel, 3, interstitialAdParameterParcel.zzrg);
        zzb.zza(parcel, 4, interstitialAdParameterParcel.zzrh, false);
        zzb.zza(parcel, 5, interstitialAdParameterParcel.zzri);
        zzb.zza(parcel, 6, interstitialAdParameterParcel.zzrj);
        zzb.zzc(parcel, 7, interstitialAdParameterParcel.zzrk);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzg(i);
    }

    public InterstitialAdParameterParcel zza(Parcel parcel) {
        int i = 0;
        int zzaq = zza.zzaq(parcel);
        String str = null;
        float f = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 3:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 4:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 5:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 6:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 7:
                    i = zza.zzg(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new InterstitialAdParameterParcel(i2, z3, z2, str, z, f, i);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }

    public InterstitialAdParameterParcel[] zzg(int i) {
        return new InterstitialAdParameterParcel[i];
    }
}
