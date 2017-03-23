package com.google.android.gms.config.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class CustomVariable extends AbstractSafeParcelable {
    public static final zzd CREATOR = new zzd();
    private final String mName;
    private final String mValue;
    private final int mVersionCode;

    CustomVariable(int i, String str, String str2) {
        this.mVersionCode = i;
        this.mName = str;
        this.mValue = str2;
    }

    public CustomVariable(String str, String str2) {
        this(1, str, str2);
    }

    public String getName() {
        return this.mName;
    }

    public String getValue() {
        return this.mValue;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
