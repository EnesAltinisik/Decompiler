package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzhg;
import com.google.android.gms.internal.zzig;

@zzig
public final class GInAppPurchaseManagerInfoParcel extends AbstractSafeParcelable {
    public static final zza CREATOR = new zza();
    public final int versionCode;
    public final zzhg zzJe;
    public final Context zzJf;
    public final zzj zzJg;
    public final zzk zzsU;

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.versionCode = i;
        this.zzsU = (zzk) zze.zzx(zza.zzbz(iBinder));
        this.zzJe = (zzhg) zze.zzx(zza.zzbz(iBinder2));
        this.zzJf = (Context) zze.zzx(zza.zzbz(iBinder3));
        this.zzJg = (zzj) zze.zzx(zza.zzbz(iBinder4));
    }

    public GInAppPurchaseManagerInfoParcel(Context context, zzk com_google_android_gms_ads_internal_purchase_zzk, zzhg com_google_android_gms_internal_zzhg, zzj com_google_android_gms_ads_internal_purchase_zzj) {
        this.versionCode = 2;
        this.zzJf = context;
        this.zzsU = com_google_android_gms_ads_internal_purchase_zzk;
        this.zzJe = com_google_android_gms_internal_zzhg;
        this.zzJg = com_google_android_gms_ads_internal_purchase_zzj;
    }

    public static void zza(Intent intent, GInAppPurchaseManagerInfoParcel gInAppPurchaseManagerInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", gInAppPurchaseManagerInfoParcel);
        intent.putExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo", bundle);
    }

    public static GInAppPurchaseManagerInfoParcel zzc(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }

    IBinder zzhh() {
        return zze.zzD(this.zzJg).asBinder();
    }

    IBinder zzhi() {
        return zze.zzD(this.zzsU).asBinder();
    }

    IBinder zzhj() {
        return zze.zzD(this.zzJe).asBinder();
    }

    IBinder zzhk() {
        return zze.zzD(this.zzJf).asBinder();
    }
}
