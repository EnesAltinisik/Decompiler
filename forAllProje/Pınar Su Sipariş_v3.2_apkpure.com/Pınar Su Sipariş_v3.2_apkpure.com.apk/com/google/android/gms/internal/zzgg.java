package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@zzig
public final class zzgg implements MediationAdRequest {
    private final int zzFA;
    private final Date zzbg;
    private final Set<String> zzbi;
    private final boolean zzbj;
    private final Location zzbk;
    private final int zzve;
    private final boolean zzvq;

    public zzgg(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.zzbg = date;
        this.zzve = i;
        this.zzbi = set;
        this.zzbk = location;
        this.zzbj = z;
        this.zzFA = i2;
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
