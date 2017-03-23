package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class TextModuleData extends AbstractSafeParcelable {
    public static final Creator<TextModuleData> CREATOR = new zzf();
    String body;
    private final int mVersionCode;
    String zzbBt;

    TextModuleData() {
        this.mVersionCode = 1;
    }

    TextModuleData(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzbBt = str;
        this.body = str2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
