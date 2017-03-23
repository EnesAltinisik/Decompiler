package com.google.firebase.crash.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FirebaseCrashOptions implements SafeParcelable {
    public static final Creator<FirebaseCrashOptions> CREATOR = new zzc();
    public final int mVersionCode;
    private String zzaoh;
    private String zzbGu;

    FirebaseCrashOptions(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzbGu = str;
        this.zzaoh = str2;
    }

    public FirebaseCrashOptions(String str, String str2) {
        this.mVersionCode = 1;
        this.zzbGu = str;
        this.zzaoh = str2;
    }

    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.zzaoh;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    public String zzPb() {
        return this.zzbGu;
    }
}
