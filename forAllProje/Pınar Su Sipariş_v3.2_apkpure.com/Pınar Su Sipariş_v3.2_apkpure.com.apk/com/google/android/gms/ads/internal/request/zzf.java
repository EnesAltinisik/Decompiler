package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.List;

public class zzf implements Creator<AdRequestInfoParcel> {
    static void zza(AdRequestInfoParcel adRequestInfoParcel, Parcel parcel, int i) {
        int zzar = zzb.zzar(parcel);
        zzb.zzc(parcel, 1, adRequestInfoParcel.versionCode);
        zzb.zza(parcel, 2, adRequestInfoParcel.zzLh, false);
        zzb.zza(parcel, 3, adRequestInfoParcel.zzLi, i, false);
        zzb.zza(parcel, 4, adRequestInfoParcel.zzsB, i, false);
        zzb.zza(parcel, 5, adRequestInfoParcel.zzsv, false);
        zzb.zza(parcel, 6, adRequestInfoParcel.applicationInfo, i, false);
        zzb.zza(parcel, 7, adRequestInfoParcel.zzLj, i, false);
        zzb.zza(parcel, 8, adRequestInfoParcel.zzLk, false);
        zzb.zza(parcel, 9, adRequestInfoParcel.zzLl, false);
        zzb.zza(parcel, 10, adRequestInfoParcel.zzLm, false);
        zzb.zza(parcel, 11, adRequestInfoParcel.zzsx, i, false);
        zzb.zza(parcel, 12, adRequestInfoParcel.zzLn, false);
        zzb.zzc(parcel, 13, adRequestInfoParcel.zzLo);
        zzb.zzb(parcel, 14, adRequestInfoParcel.zzsT, false);
        zzb.zza(parcel, 15, adRequestInfoParcel.zzLp, false);
        zzb.zza(parcel, 16, adRequestInfoParcel.zzLq);
        zzb.zza(parcel, 17, adRequestInfoParcel.zzLr, i, false);
        zzb.zzc(parcel, 18, adRequestInfoParcel.zzLs);
        zzb.zzc(parcel, 19, adRequestInfoParcel.zzLt);
        zzb.zza(parcel, 20, adRequestInfoParcel.zzLu);
        zzb.zza(parcel, 21, adRequestInfoParcel.zzLv, false);
        zzb.zza(parcel, 25, adRequestInfoParcel.zzLw);
        zzb.zza(parcel, 26, adRequestInfoParcel.zzLx, false);
        zzb.zzb(parcel, 27, adRequestInfoParcel.zzLy, false);
        zzb.zza(parcel, 28, adRequestInfoParcel.zzsu, false);
        zzb.zza(parcel, 29, adRequestInfoParcel.zzsP, i, false);
        zzb.zzb(parcel, 30, adRequestInfoParcel.zzLz, false);
        zzb.zza(parcel, 31, adRequestInfoParcel.zzLA);
        zzb.zza(parcel, 32, adRequestInfoParcel.zzLB, i, false);
        zzb.zza(parcel, 33, adRequestInfoParcel.zzLC, false);
        zzb.zza(parcel, 34, adRequestInfoParcel.zzLD);
        zzb.zzc(parcel, 35, adRequestInfoParcel.zzLE);
        zzb.zzc(parcel, 36, adRequestInfoParcel.zzLF);
        zzb.zza(parcel, 37, adRequestInfoParcel.zzLG);
        zzb.zza(parcel, 38, adRequestInfoParcel.zzLH);
        zzb.zza(parcel, 39, adRequestInfoParcel.zzLI, false);
        zzb.zza(parcel, 40, adRequestInfoParcel.zzLJ);
        zzb.zza(parcel, 41, adRequestInfoParcel.zzLK, false);
        zzb.zza(parcel, 42, adRequestInfoParcel.zzEJ);
        zzb.zzc(parcel, 43, adRequestInfoParcel.zzLL);
        zzb.zza(parcel, 44, adRequestInfoParcel.zzLM, false);
        zzb.zzJ(parcel, zzar);
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zzj(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return zzM(i);
    }

    public AdRequestInfoParcel[] zzM(int i) {
        return new AdRequestInfoParcel[i];
    }

    public AdRequestInfoParcel zzj(Parcel parcel) {
        int zzaq = zza.zzaq(parcel);
        int i = 0;
        Bundle bundle = null;
        AdRequestParcel adRequestParcel = null;
        AdSizeParcel adSizeParcel = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundle2 = null;
        int i2 = 0;
        List list = null;
        Bundle bundle3 = null;
        boolean z = false;
        Messenger messenger = null;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        String str5 = null;
        long j = 0;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        NativeAdOptionsParcel nativeAdOptionsParcel = null;
        List list3 = null;
        long j2 = 0;
        CapabilityParcel capabilityParcel = null;
        String str8 = null;
        float f2 = 0.0f;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        String str9 = null;
        String str10 = null;
        boolean z5 = false;
        int i7 = 0;
        Bundle bundle4 = null;
        while (parcel.dataPosition() < zzaq) {
            int zzap = zza.zzap(parcel);
            switch (zza.zzcj(zzap)) {
                case 1:
                    i = zza.zzg(parcel, zzap);
                    break;
                case 2:
                    bundle = zza.zzs(parcel, zzap);
                    break;
                case 3:
                    adRequestParcel = (AdRequestParcel) zza.zza(parcel, zzap, AdRequestParcel.CREATOR);
                    break;
                case 4:
                    adSizeParcel = (AdSizeParcel) zza.zza(parcel, zzap, AdSizeParcel.CREATOR);
                    break;
                case 5:
                    str = zza.zzq(parcel, zzap);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) zza.zza(parcel, zzap, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) zza.zza(parcel, zzap, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = zza.zzq(parcel, zzap);
                    break;
                case 9:
                    str3 = zza.zzq(parcel, zzap);
                    break;
                case 10:
                    str4 = zza.zzq(parcel, zzap);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) zza.zza(parcel, zzap, VersionInfoParcel.CREATOR);
                    break;
                case 12:
                    bundle2 = zza.zzs(parcel, zzap);
                    break;
                case 13:
                    i2 = zza.zzg(parcel, zzap);
                    break;
                case 14:
                    list = zza.zzE(parcel, zzap);
                    break;
                case 15:
                    bundle3 = zza.zzs(parcel, zzap);
                    break;
                case 16:
                    z = zza.zzc(parcel, zzap);
                    break;
                case 17:
                    messenger = (Messenger) zza.zza(parcel, zzap, Messenger.CREATOR);
                    break;
                case 18:
                    i3 = zza.zzg(parcel, zzap);
                    break;
                case 19:
                    i4 = zza.zzg(parcel, zzap);
                    break;
                case 20:
                    f = zza.zzl(parcel, zzap);
                    break;
                case 21:
                    str5 = zza.zzq(parcel, zzap);
                    break;
                case 25:
                    j = zza.zzi(parcel, zzap);
                    break;
                case 26:
                    str6 = zza.zzq(parcel, zzap);
                    break;
                case 27:
                    list2 = zza.zzE(parcel, zzap);
                    break;
                case 28:
                    str7 = zza.zzq(parcel, zzap);
                    break;
                case 29:
                    nativeAdOptionsParcel = (NativeAdOptionsParcel) zza.zza(parcel, zzap, (Creator) NativeAdOptionsParcel.CREATOR);
                    break;
                case 30:
                    list3 = zza.zzE(parcel, zzap);
                    break;
                case 31:
                    j2 = zza.zzi(parcel, zzap);
                    break;
                case 32:
                    capabilityParcel = (CapabilityParcel) zza.zza(parcel, zzap, CapabilityParcel.CREATOR);
                    break;
                case 33:
                    str8 = zza.zzq(parcel, zzap);
                    break;
                case 34:
                    f2 = zza.zzl(parcel, zzap);
                    break;
                case 35:
                    i5 = zza.zzg(parcel, zzap);
                    break;
                case 36:
                    i6 = zza.zzg(parcel, zzap);
                    break;
                case 37:
                    z3 = zza.zzc(parcel, zzap);
                    break;
                case 38:
                    z4 = zza.zzc(parcel, zzap);
                    break;
                case 39:
                    str9 = zza.zzq(parcel, zzap);
                    break;
                case 40:
                    z2 = zza.zzc(parcel, zzap);
                    break;
                case 41:
                    str10 = zza.zzq(parcel, zzap);
                    break;
                case 42:
                    z5 = zza.zzc(parcel, zzap);
                    break;
                case 43:
                    i7 = zza.zzg(parcel, zzap);
                    break;
                case 44:
                    bundle4 = zza.zzs(parcel, zzap);
                    break;
                default:
                    zza.zzb(parcel, zzap);
                    break;
            }
        }
        if (parcel.dataPosition() == zzaq) {
            return new AdRequestInfoParcel(i, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i2, list, bundle3, z, messenger, i3, i4, f, str5, j, str6, list2, str7, nativeAdOptionsParcel, list3, j2, capabilityParcel, str8, f2, z2, i5, i6, z3, z4, str9, str10, z5, i7, bundle4);
        }
        throw new zza.zza("Overread allowed size end=" + zzaq, parcel);
    }
}
