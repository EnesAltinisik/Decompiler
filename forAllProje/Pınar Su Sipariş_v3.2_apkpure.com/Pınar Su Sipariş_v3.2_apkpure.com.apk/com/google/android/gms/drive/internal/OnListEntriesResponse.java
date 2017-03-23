package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListEntriesResponse extends WriteAwareParcelable {
    public static final Creator<OnListEntriesResponse> CREATOR = new zzaz();
    final int mVersionCode;
    final boolean zzaxj;
    final DataHolder zzayN;

    OnListEntriesResponse(int i, DataHolder dataHolder, boolean z) {
        this.mVersionCode = i;
        this.zzayN = dataHolder;
        this.zzaxj = z;
    }

    protected void zzK(Parcel parcel, int i) {
        zzaz.zza(this, parcel, i);
    }

    public boolean zzwA() {
        return this.zzaxj;
    }

    public DataHolder zzwz() {
        return this.zzayN;
    }
}
