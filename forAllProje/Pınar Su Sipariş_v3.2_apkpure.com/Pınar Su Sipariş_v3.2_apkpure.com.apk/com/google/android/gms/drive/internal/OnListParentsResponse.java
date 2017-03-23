package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

public class OnListParentsResponse extends WriteAwareParcelable {
    public static final Creator<OnListParentsResponse> CREATOR = new zzba();
    final int mVersionCode;
    final DataHolder zzayO;

    OnListParentsResponse(int i, DataHolder dataHolder) {
        this.mVersionCode = i;
        this.zzayO = dataHolder;
    }

    protected void zzK(Parcel parcel, int i) {
        zzba.zza(this, parcel, i);
    }

    public DataHolder zzwB() {
        return this.zzayO;
    }
}
