package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class SyncInfoResult extends AbstractSafeParcelable implements Result {
    public static final Creator<SyncInfoResult> CREATOR = new zzl();
    private final int mVersionCode;
    private final Status zzaaO;
    private final long zzajg;

    SyncInfoResult(int i, Status status, long j) {
        this.mVersionCode = i;
        this.zzaaO = status;
        this.zzajg = j;
    }

    private boolean zzb(SyncInfoResult syncInfoResult) {
        return this.zzaaO.equals(syncInfoResult.zzaaO) && zzz.equal(Long.valueOf(this.zzajg), Long.valueOf(syncInfoResult.zzajg));
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SyncInfoResult) && zzb((SyncInfoResult) obj));
    }

    public Status getStatus() {
        return this.zzaaO;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaO, Long.valueOf(this.zzajg));
    }

    public String toString() {
        return zzz.zzy(this).zzg("status", this.zzaaO).zzg("timestamp", Long.valueOf(this.zzajg)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    public long zzyA() {
        return this.zzajg;
    }
}
