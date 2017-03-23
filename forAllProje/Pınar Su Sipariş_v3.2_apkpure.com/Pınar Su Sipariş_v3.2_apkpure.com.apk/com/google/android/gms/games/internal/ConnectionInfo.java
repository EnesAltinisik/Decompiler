package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo implements SafeParcelable {
    public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
    private final int mVersionCode;
    private final String zzaKO;
    private final int zzaKP;

    public ConnectionInfo(int i, String str, int i2) {
        this.mVersionCode = i;
        this.zzaKO = str;
        this.zzaKP = i2;
    }

    public int describeContents() {
        return 0;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ConnectionInfoCreator.zza(this, parcel, i);
    }

    public String zzzM() {
        return this.zzaKO;
    }

    public int zzzN() {
        return this.zzaKP;
    }
}
