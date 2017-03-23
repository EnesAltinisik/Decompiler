package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class ProxyCard extends AbstractSafeParcelable {
    public static final Creator<ProxyCard> CREATOR = new zzr();
    private final int mVersionCode;
    String zzbAk;
    String zzbAl;
    int zzbAm;
    int zzbAn;

    ProxyCard(int i, String str, String str2, int i2, int i3) {
        this.mVersionCode = i;
        this.zzbAk = str;
        this.zzbAl = str2;
        this.zzbAm = i2;
        this.zzbAn = i3;
    }

    public String getCvn() {
        return this.zzbAl;
    }

    public int getExpirationMonth() {
        return this.zzbAm;
    }

    public int getExpirationYear() {
        return this.zzbAn;
    }

    public String getPan() {
        return this.zzbAk;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
