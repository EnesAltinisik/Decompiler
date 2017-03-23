package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzig;

@zzig
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final zzj CREATOR = new zzj();
    public final int versionCode;
    public final boolean zzBl;
    public final int zzBm;
    public final boolean zzBn;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2) {
        this.versionCode = i;
        this.zzBl = z;
        this.zzBm = i2;
        this.zzBn = z2;
    }

    public NativeAdOptionsParcel(NativeAdOptions nativeAdOptions) {
        this(1, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzj.zza(this, parcel, i);
    }
}
