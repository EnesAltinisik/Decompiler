package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;

@zzig
public final class AdLauncherIntentInfoParcel extends AbstractSafeParcelable {
    public static final zzb CREATOR = new zzb();
    public final Intent intent;
    public final String mimeType;
    public final String packageName;
    public final String url;
    public final int versionCode;
    public final String zzGG;
    public final String zzGH;
    public final String zzGI;
    public final String zzGJ;

    public AdLauncherIntentInfoParcel(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.versionCode = i;
        this.zzGG = str;
        this.url = str2;
        this.mimeType = str3;
        this.packageName = str4;
        this.zzGH = str5;
        this.zzGI = str6;
        this.zzGJ = str7;
        this.intent = intent;
    }

    public AdLauncherIntentInfoParcel(Intent intent) {
        this(2, null, null, null, null, null, null, null, intent);
    }

    public AdLauncherIntentInfoParcel(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(2, str, str2, str3, str4, str5, str6, str7, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
