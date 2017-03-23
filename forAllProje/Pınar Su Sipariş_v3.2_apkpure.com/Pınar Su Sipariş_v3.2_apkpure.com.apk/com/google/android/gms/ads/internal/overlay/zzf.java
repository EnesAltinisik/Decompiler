package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf implements Creator<AdOverlayInfoParcel> {
    static void zza(AdOverlayInfoParcel adOverlayInfoParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, adOverlayInfoParcel.versionCode);
        zzb.zza(parcel, 2, adOverlayInfoParcel.zzHC, i, false);
        zzb.zza(parcel, 3, adOverlayInfoParcel.zzgw(), false);
        zzb.zza(parcel, 4, adOverlayInfoParcel.zzgx(), false);
        zzb.zza(parcel, 5, adOverlayInfoParcel.zzgy(), false);
        zzb.zza(parcel, 6, adOverlayInfoParcel.zzgz(), false);
        zzb.zza(parcel, 7, adOverlayInfoParcel.zzHH, false);
        zzb.zza(parcel, 8, adOverlayInfoParcel.zzHI);
        zzb.zza(parcel, 9, adOverlayInfoParcel.zzHJ, false);
        zzb.zza(parcel, 10, adOverlayInfoParcel.zzgB(), false);
        zzb.zzc(parcel, 11, adOverlayInfoParcel.orientation);
        zzb.zzc(parcel, 12, adOverlayInfoParcel.zzHL);
        zzb.zza(parcel, 13, adOverlayInfoParcel.url, false);
        zzb.zza(parcel, 14, adOverlayInfoParcel.zzsx, i, false);
        zzb.zza(parcel, 15, adOverlayInfoParcel.zzgA(), false);
        zzb.zza(parcel, 16, adOverlayInfoParcel.zzHN, false);
        zzb.zza(parcel, 17, adOverlayInfoParcel.zzHO, i, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzh(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzE(i);
    }

    public AdOverlayInfoParcel[] zzE(int i) {
        return new AdOverlayInfoParcel[i];
    }

    public AdOverlayInfoParcel zzh(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        IBinder iBinder4 = null;
        String str = null;
        boolean z = false;
        String str2 = null;
        IBinder iBinder5 = null;
        int i2 = 0;
        int i3 = 0;
        String str3 = null;
        VersionInfoParcel versionInfoParcel = null;
        IBinder iBinder6 = null;
        String str4 = null;
        InterstitialAdParameterParcel interstitialAdParameterParcel = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    adLauncherIntentInfoParcel = (AdLauncherIntentInfoParcel) zza.zza(parcel, zzap, AdLauncherIntentInfoParcel.CREATOR);
                    break;
                case 3:
                    iBinder = zza.zzr(parcel, zzap);
                    break;
                case 4:
                    iBinder2 = zza.zzr(parcel, zzap);
                    break;
                case 5:
                    iBinder3 = zza.zzr(parcel, zzap);
                    break;
                case 6:
                    iBinder4 = zza.zzr(parcel, zzap);
                    break;
                case 7:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 8:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 9:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    iBinder5 = zza.zzr(parcel, zzap);
                    break;
                case 11:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 12:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 13:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) zza.zza(parcel, zzap, (Creator) VersionInfoParcel.CREATOR);
                    break;
                case 15:
                    iBinder6 = zza.zzr(parcel, zzap);
                    break;
                case 16:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 17:
                    interstitialAdParameterParcel = (InterstitialAdParameterParcel) zza.zza(parcel, zzap, (Creator) InterstitialAdParameterParcel.CREATOR);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AdOverlayInfoParcel(i, adLauncherIntentInfoParcel, iBinder, iBinder2, iBinder3, iBinder4, str, z, str2, iBinder5, i2, i3, str3, versionInfoParcel, iBinder6, str4, interstitialAdParameterParcel);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
