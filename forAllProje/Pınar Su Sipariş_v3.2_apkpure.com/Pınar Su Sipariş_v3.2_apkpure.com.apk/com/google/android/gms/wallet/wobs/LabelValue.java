package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class LabelValue extends AbstractSafeParcelable {
    public static final Creator<LabelValue> CREATOR = new zzb();
    String label;
    private final int mVersionCode;
    String value;

    LabelValue() {
        this.mVersionCode = 1;
    }

    LabelValue(int i, String str, String str2) {
        this.mVersionCode = i;
        this.label = str;
        this.value = str2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
