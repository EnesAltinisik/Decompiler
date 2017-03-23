package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class TimeInterval extends AbstractSafeParcelable {
    public static final Creator<TimeInterval> CREATOR = new zzg();
    private final int mVersionCode;
    long zzbBu;
    long zzbBv;

    TimeInterval() {
        this.mVersionCode = 1;
    }

    TimeInterval(int i, long j, long j2) {
        this.mVersionCode = i;
        this.zzbBu = j;
        this.zzbBv = j2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
