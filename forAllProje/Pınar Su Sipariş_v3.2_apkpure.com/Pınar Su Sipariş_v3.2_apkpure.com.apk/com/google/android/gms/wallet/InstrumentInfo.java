package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Creator<InstrumentInfo> CREATOR = new zzh();
    private final int mVersionCode;
    private String zzbzn;
    private String zzbzo;

    InstrumentInfo(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzbzn = str;
        this.zzbzo = str2;
    }

    public String getInstrumentDetails() {
        return this.zzbzo;
    }

    public String getInstrumentType() {
        return this.zzbzn;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzh.zza(this, parcel, i);
    }
}
