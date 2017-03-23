package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class QueryResultEventParcelable extends WriteAwareParcelable implements DriveEvent {
    public static final zzl CREATOR = new zzl();
    final int mVersionCode;
    final DataHolder zzamz;
    final boolean zzawq;
    final int zzawr;

    QueryResultEventParcelable(int i, DataHolder dataHolder, boolean z, int i2) {
        this.mVersionCode = i;
        this.zzamz = dataHolder;
        this.zzawq = z;
        this.zzawr = i2;
    }

    public int getType() {
        return 3;
    }

    public void zzK(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    public DataHolder zzwg() {
        return this.zzamz;
    }

    public boolean zzwh() {
        return this.zzawq;
    }

    public int zzwi() {
        return this.zzawr;
    }
}
