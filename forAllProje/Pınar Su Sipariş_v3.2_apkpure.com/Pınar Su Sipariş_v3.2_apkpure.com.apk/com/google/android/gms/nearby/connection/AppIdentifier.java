package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;

public final class AppIdentifier extends AbstractSafeParcelable {
    public static final Creator<AppIdentifier> CREATOR = new zzb();
    private final int mVersionCode;
    private final String zzaDY;

    AppIdentifier(int i, String str) {
        this.mVersionCode = i;
        this.zzaDY = zzaa.zzh(str, "Missing application identifier value");
    }

    public AppIdentifier(String str) {
        this(1, str);
    }

    public String getIdentifier() {
        return this.zzaDY;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
