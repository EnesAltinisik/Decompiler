package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;
import java.util.Collections;
import java.util.List;

@zzig
public final class AdRequestInfoParcel extends AbstractSafeParcelable {
    public static final zzf CREATOR = new zzf();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final boolean zzEJ;
    public final long zzLA;
    public final CapabilityParcel zzLB;
    public final String zzLC;
    public final float zzLD;
    public final int zzLE;
    public final int zzLF;
    public final boolean zzLG;
    public final boolean zzLH;
    public final String zzLI;
    public final boolean zzLJ;
    public final String zzLK;
    public final int zzLL;
    public final Bundle zzLM;
    public final Bundle zzLh;
    public final AdRequestParcel zzLi;
    public final PackageInfo zzLj;
    public final String zzLk;
    public final String zzLl;
    public final String zzLm;
    public final Bundle zzLn;
    public final int zzLo;
    public final Bundle zzLp;
    public final boolean zzLq;
    public final Messenger zzLr;
    public final int zzLs;
    public final int zzLt;
    public final float zzLu;
    public final String zzLv;
    public final long zzLw;
    public final String zzLx;
    public final List<String> zzLy;
    public final List<String> zzLz;
    public final AdSizeParcel zzsB;
    public final NativeAdOptionsParcel zzsP;
    public final List<String> zzsT;
    public final String zzsu;
    public final String zzsv;
    public final VersionInfoParcel zzsx;

    @zzig
    public static final class zza {
        public final ApplicationInfo applicationInfo;
        public final boolean zzEJ;
        public final CapabilityParcel zzLB;
        public final String zzLC;
        public final float zzLD;
        public final int zzLE;
        public final int zzLF;
        public final boolean zzLG;
        public final boolean zzLH;
        public final String zzLI;
        public final boolean zzLJ;
        public final String zzLK;
        public final int zzLL;
        public final Bundle zzLM;
        public final Bundle zzLh;
        public final AdRequestParcel zzLi;
        public final PackageInfo zzLj;
        public final String zzLl;
        public final String zzLm;
        public final Bundle zzLn;
        public final int zzLo;
        public final Bundle zzLp;
        public final boolean zzLq;
        public final Messenger zzLr;
        public final int zzLs;
        public final int zzLt;
        public final float zzLu;
        public final String zzLv;
        public final long zzLw;
        public final String zzLx;
        public final List<String> zzLy;
        public final List<String> zzLz;
        public final AdSizeParcel zzsB;
        public final NativeAdOptionsParcel zzsP;
        public final List<String> zzsT;
        public final String zzsu;
        public final String zzsv;
        public final VersionInfoParcel zzsx;

        public zza(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, VersionInfoParcel versionInfoParcel, Bundle bundle2, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i, int i2, float f, String str4, long j, String str5, List<String> list3, String str6, NativeAdOptionsParcel nativeAdOptionsParcel, CapabilityParcel capabilityParcel, String str7, float f2, boolean z2, int i3, int i4, boolean z3, boolean z4, String str8, String str9, boolean z5, int i5, Bundle bundle4) {
            this.zzLh = bundle;
            this.zzLi = adRequestParcel;
            this.zzsB = adSizeParcel;
            this.zzsv = str;
            this.applicationInfo = applicationInfo;
            this.zzLj = packageInfo;
            this.zzLl = str2;
            this.zzLm = str3;
            this.zzsx = versionInfoParcel;
            this.zzLn = bundle2;
            this.zzLq = z;
            this.zzLr = messenger;
            this.zzLs = i;
            this.zzLt = i2;
            this.zzLu = f;
            if (list == null || list.size() <= 0) {
                if (adSizeParcel.zzvx) {
                    this.zzLo = 4;
                } else {
                    this.zzLo = 0;
                }
                this.zzsT = null;
                this.zzLz = null;
            } else {
                this.zzLo = 3;
                this.zzsT = list;
                this.zzLz = list2;
            }
            this.zzLp = bundle3;
            this.zzLv = str4;
            this.zzLw = j;
            this.zzLx = str5;
            this.zzLy = list3;
            this.zzsu = str6;
            this.zzsP = nativeAdOptionsParcel;
            this.zzLB = capabilityParcel;
            this.zzLC = str7;
            this.zzLD = f2;
            this.zzLJ = z2;
            this.zzLE = i3;
            this.zzLF = i4;
            this.zzLG = z3;
            this.zzLH = z4;
            this.zzLI = str8;
            this.zzLK = str9;
            this.zzEJ = z5;
            this.zzLL = i5;
            this.zzLM = bundle4;
        }
    }

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, Messenger messenger, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list3, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4) {
        this.versionCode = i;
        this.zzLh = bundle;
        this.zzLi = adRequestParcel;
        this.zzsB = adSizeParcel;
        this.zzsv = str;
        this.applicationInfo = applicationInfo;
        this.zzLj = packageInfo;
        this.zzLk = str2;
        this.zzLl = str3;
        this.zzLm = str4;
        this.zzsx = versionInfoParcel;
        this.zzLn = bundle2;
        this.zzLo = i2;
        this.zzsT = list;
        this.zzLz = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        if (bundle3 == null) {
            Bundle bundle5 = new Bundle(1);
        }
        this.zzLp = bundle3;
        this.zzLq = z;
        this.zzLr = messenger;
        this.zzLs = i3;
        this.zzLt = i4;
        this.zzLu = f;
        this.zzLv = str5;
        this.zzLw = j;
        this.zzLx = str6;
        this.zzLy = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.zzsu = str7;
        this.zzsP = nativeAdOptionsParcel;
        this.zzLA = j2;
        this.zzLB = capabilityParcel;
        this.zzLC = str8;
        this.zzLD = f2;
        this.zzLJ = z2;
        this.zzLE = i5;
        this.zzLF = i6;
        this.zzLG = z3;
        this.zzLH = z4;
        this.zzLI = str9;
        this.zzLK = str10;
        this.zzEJ = z5;
        this.zzLL = i7;
        this.zzLM = bundle4;
    }

    public AdRequestInfoParcel(Bundle bundle, AdRequestParcel adRequestParcel, AdSizeParcel adSizeParcel, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, Messenger messenger, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, NativeAdOptionsParcel nativeAdOptionsParcel, long j2, CapabilityParcel capabilityParcel, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4) {
        this(18, bundle, adRequestParcel, adSizeParcel, str, applicationInfo, packageInfo, str2, str3, str4, versionInfoParcel, bundle2, i, list, bundle3, z, messenger, i2, i3, f, str5, j, str6, list3, str7, nativeAdOptionsParcel, list2, j2, capabilityParcel, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4);
    }

    public AdRequestInfoParcel(zza com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza, String str, long j) {
        this(com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLh, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLi, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsB, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsv, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.applicationInfo, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLj, str, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLl, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLm, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsx, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLn, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLo, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsT, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLz, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLp, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLq, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLr, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLs, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLt, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLu, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLv, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLw, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLx, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLy, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsu, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzsP, j, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLB, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLC, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLD, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLJ, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLE, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLF, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLG, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLH, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLI, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLK, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzEJ, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLL, com_google_android_gms_ads_internal_request_AdRequestInfoParcel_zza.zzLM);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
