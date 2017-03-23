package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FetchConfigIpcResponse extends AbstractSafeParcelable {
    public static final Creator<FetchConfigIpcResponse> CREATOR = new zzf();
    private final int mVersionCode;
    private final int zzahG;
    private final long zzauK;
    private final DataHolder zzauR;

    FetchConfigIpcResponse(int i, int i2, DataHolder dataHolder, long j) {
        this.mVersionCode = i;
        this.zzahG = i2;
        this.zzauR = dataHolder;
        this.zzauK = j;
    }

    public int getStatusCode() {
        return this.zzahG;
    }

    public long getThrottleEndTimeMillis() {
        return this.zzauK;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }

    public DataHolder zzvA() {
        return this.zzauR;
    }

    public void zzvB() {
        if (this.zzauR != null && !this.zzauR.isClosed()) {
            this.zzauR.close();
        }
    }
}
