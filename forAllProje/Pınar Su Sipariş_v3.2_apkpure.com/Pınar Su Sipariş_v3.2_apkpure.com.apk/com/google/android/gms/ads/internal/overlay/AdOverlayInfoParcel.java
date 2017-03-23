package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzed;
import com.google.android.gms.internal.zzej;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzla;

@zzig
public final class AdOverlayInfoParcel extends AbstractSafeParcelable {
    public static final zzf CREATOR = new zzf();
    public final int orientation;
    public final String url;
    public final int versionCode;
    public final AdLauncherIntentInfoParcel zzHC;
    public final zza zzHD;
    public final zzg zzHE;
    public final zzla zzHF;
    public final zzed zzHG;
    public final String zzHH;
    public final boolean zzHI;
    public final String zzHJ;
    public final zzp zzHK;
    public final int zzHL;
    public final zzej zzHM;
    public final String zzHN;
    public final InterstitialAdParameterParcel zzHO;
    public final VersionInfoParcel zzsx;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.versionCode = i;
        this.zzHC = adLauncherIntentInfoParcel;
        this.zzHD = (zza) zze.zzx(zzd.zza.zzbz(iBinder));
        this.zzHE = (zzg) zze.zzx(zzd.zza.zzbz(iBinder2));
        this.zzHF = (zzla) zze.zzx(zzd.zza.zzbz(iBinder3));
        this.zzHG = (zzed) zze.zzx(zzd.zza.zzbz(iBinder4));
        this.zzHH = str;
        this.zzHI = z;
        this.zzHJ = str2;
        this.zzHK = (zzp) zze.zzx(zzd.zza.zzbz(iBinder5));
        this.orientation = i2;
        this.zzHL = i3;
        this.url = str3;
        this.zzsx = versionInfoParcel;
        this.zzHM = (zzej) zze.zzx(zzd.zza.zzbz(iBinder6));
        this.zzHN = str4;
        this.zzHO = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzp com_google_android_gms_ads_internal_overlay_zzp, zzla com_google_android_gms_internal_zzla, int i, VersionInfoParcel versionInfoParcel, String str, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.versionCode = 4;
        this.zzHC = null;
        this.zzHD = com_google_android_gms_ads_internal_client_zza;
        this.zzHE = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzHF = com_google_android_gms_internal_zzla;
        this.zzHG = null;
        this.zzHH = null;
        this.zzHI = false;
        this.zzHJ = null;
        this.zzHK = com_google_android_gms_ads_internal_overlay_zzp;
        this.orientation = i;
        this.zzHL = 1;
        this.url = null;
        this.zzsx = versionInfoParcel;
        this.zzHM = null;
        this.zzHN = str;
        this.zzHO = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzp com_google_android_gms_ads_internal_overlay_zzp, zzla com_google_android_gms_internal_zzla, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.versionCode = 4;
        this.zzHC = null;
        this.zzHD = com_google_android_gms_ads_internal_client_zza;
        this.zzHE = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzHF = com_google_android_gms_internal_zzla;
        this.zzHG = null;
        this.zzHH = null;
        this.zzHI = z;
        this.zzHJ = null;
        this.zzHK = com_google_android_gms_ads_internal_overlay_zzp;
        this.orientation = i;
        this.zzHL = 2;
        this.url = null;
        this.zzsx = versionInfoParcel;
        this.zzHM = null;
        this.zzHN = null;
        this.zzHO = null;
    }

    public AdOverlayInfoParcel(zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzed com_google_android_gms_internal_zzed, zzp com_google_android_gms_ads_internal_overlay_zzp, zzla com_google_android_gms_internal_zzla, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, zzej com_google_android_gms_internal_zzej) {
        this.versionCode = 4;
        this.zzHC = null;
        this.zzHD = com_google_android_gms_ads_internal_client_zza;
        this.zzHE = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzHF = com_google_android_gms_internal_zzla;
        this.zzHG = com_google_android_gms_internal_zzed;
        this.zzHH = null;
        this.zzHI = z;
        this.zzHJ = null;
        this.zzHK = com_google_android_gms_ads_internal_overlay_zzp;
        this.orientation = i;
        this.zzHL = 3;
        this.url = str;
        this.zzsx = versionInfoParcel;
        this.zzHM = com_google_android_gms_internal_zzej;
        this.zzHN = null;
        this.zzHO = null;
    }

    public AdOverlayInfoParcel(zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzed com_google_android_gms_internal_zzed, zzp com_google_android_gms_ads_internal_overlay_zzp, zzla com_google_android_gms_internal_zzla, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, zzej com_google_android_gms_internal_zzej) {
        this.versionCode = 4;
        this.zzHC = null;
        this.zzHD = com_google_android_gms_ads_internal_client_zza;
        this.zzHE = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzHF = com_google_android_gms_internal_zzla;
        this.zzHG = com_google_android_gms_internal_zzed;
        this.zzHH = str2;
        this.zzHI = z;
        this.zzHJ = str;
        this.zzHK = com_google_android_gms_ads_internal_overlay_zzp;
        this.orientation = i;
        this.zzHL = 3;
        this.url = null;
        this.zzsx = versionInfoParcel;
        this.zzHM = com_google_android_gms_internal_zzej;
        this.zzHN = null;
        this.zzHO = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, zza com_google_android_gms_ads_internal_client_zza, zzg com_google_android_gms_ads_internal_overlay_zzg, zzp com_google_android_gms_ads_internal_overlay_zzp, VersionInfoParcel versionInfoParcel) {
        this.versionCode = 4;
        this.zzHC = adLauncherIntentInfoParcel;
        this.zzHD = com_google_android_gms_ads_internal_client_zza;
        this.zzHE = com_google_android_gms_ads_internal_overlay_zzg;
        this.zzHF = null;
        this.zzHG = null;
        this.zzHH = null;
        this.zzHI = false;
        this.zzHJ = null;
        this.zzHK = com_google_android_gms_ads_internal_overlay_zzp;
        this.orientation = -1;
        this.zzHL = 4;
        this.url = null;
        this.zzsx = versionInfoParcel;
        this.zzHM = null;
        this.zzHN = null;
        this.zzHO = null;
    }

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzb(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    IBinder zzgA() {
        return zze.zzD(this.zzHM).asBinder();
    }

    IBinder zzgB() {
        return zze.zzD(this.zzHK).asBinder();
    }

    IBinder zzgw() {
        return zze.zzD(this.zzHD).asBinder();
    }

    IBinder zzgx() {
        return zze.zzD(this.zzHE).asBinder();
    }

    IBinder zzgy() {
        return zze.zzD(this.zzHF).asBinder();
    }

    IBinder zzgz() {
        return zze.zzD(this.zzHG).asBinder();
    }
}
