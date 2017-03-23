package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class GoogleNowAuthState extends AbstractSafeParcelable {
    public static final Creator<GoogleNowAuthState> CREATOR = new zza();
    final int mVersionCode;
    String zzbmR;
    String zzbmS;
    long zzbmT;

    GoogleNowAuthState(int i, String str, String str2, long j) {
        this.mVersionCode = i;
        this.zzbmR = str;
        this.zzbmS = str2;
        this.zzbmT = j;
    }

    public String getAccessToken() {
        return this.zzbmS;
    }

    public String getAuthCode() {
        return this.zzbmR;
    }

    public long getNextAllowedTimeMillis() {
        return this.zzbmT;
    }

    public String toString() {
        String str = this.zzbmR;
        String str2 = this.zzbmS;
        return new StringBuilder((String.valueOf(str).length() + 74) + String.valueOf(str2).length()).append("mAuthCode = ").append(str).append("\nmAccessToken = ").append(str2).append("\nmNextAllowedTimeMillis = ").append(this.zzbmT).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zza.zza(this, parcel, i);
    }
}
