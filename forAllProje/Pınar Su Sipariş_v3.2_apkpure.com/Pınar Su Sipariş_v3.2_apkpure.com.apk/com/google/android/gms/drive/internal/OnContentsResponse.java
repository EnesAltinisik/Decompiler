package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

public class OnContentsResponse extends AbstractSafeParcelable {
    public static final Creator<OnContentsResponse> CREATOR = new zzat();
    final int mVersionCode;
    final Contents zzaxB;
    final boolean zzayA;

    OnContentsResponse(int i, Contents contents, boolean z) {
        this.mVersionCode = i;
        this.zzaxB = contents;
        this.zzayA = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzat.zza(this, parcel, i);
    }

    public Contents zzwt() {
        return this.zzaxB;
    }

    public boolean zzwu() {
        return this.zzayA;
    }
}
