package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public abstract class WriteAwareParcelable extends AbstractSafeParcelable {
    private volatile transient boolean zzavW = false;

    public void writeToParcel(Parcel parcel, int i) {
        zzaa.zzai(!zzwc());
        this.zzavW = true;
        zzK(parcel, i);
    }

    protected abstract void zzK(Parcel parcel, int i);

    public final boolean zzwc() {
        return this.zzavW;
    }
}
