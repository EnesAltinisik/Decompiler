package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeAdOptions.Builder;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzig
public final class zzgl implements NativeMediationAdRequest {
    private final int zzFA;
    private final Date zzbg;
    private final Set<String> zzbi;
    private final boolean zzbj;
    private final Location zzbk;
    private final NativeAdOptionsParcel zzqL;
    private final List<String> zzqM;
    private final int zzve;
    private final boolean zzvq;

    public zzgl(Date date, int i, Set<String> set, Location location, boolean z, int i2, NativeAdOptionsParcel nativeAdOptionsParcel, List<String> list, boolean z2) {
        this.zzbg = date;
        this.zzve = i;
        this.zzbi = set;
        this.zzbk = location;
        this.zzbj = z;
        this.zzFA = i2;
        this.zzqL = nativeAdOptionsParcel;
        this.zzqM = list;
        this.zzvq = z2;
    }

    public Date getBirthday() {
        return this.zzbg;
    }

    public int getGender() {
        return this.zzve;
    }

    public Set<String> getKeywords() {
        return this.zzbi;
    }

    public Location getLocation() {
        return this.zzbk;
    }

    public NativeAdOptions getNativeAdOptions() {
        return this.zzqL == null ? null : new Builder().setReturnUrlsForImageAssets(this.zzqL.zzBl).setImageOrientation(this.zzqL.zzBm).setRequestMultipleImages(this.zzqL.zzBn).build();
    }

    public boolean isAppInstallAdRequested() {
        return this.zzqM != null && this.zzqM.contains("2");
    }

    public boolean isContentAdRequested() {
        return this.zzqM != null && this.zzqM.contains("1");
    }

    public boolean isDesignedForFamilies() {
        return this.zzvq;
    }

    public boolean isTesting() {
        return this.zzbj;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzFA;
    }
}
