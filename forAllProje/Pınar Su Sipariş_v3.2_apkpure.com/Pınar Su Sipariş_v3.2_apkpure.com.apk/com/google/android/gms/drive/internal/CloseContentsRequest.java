package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.Contents;

public class CloseContentsRequest extends AbstractSafeParcelable {
    public static final Creator<CloseContentsRequest> CREATOR = new zzi();
    final int mVersionCode;
    final Contents zzawL;
    final int zzawN;
    final Boolean zzawP;

    CloseContentsRequest(int i, Contents contents, Boolean bool, int i2) {
        this.mVersionCode = i;
        this.zzawL = contents;
        this.zzawP = bool;
        this.zzawN = i2;
    }

    public CloseContentsRequest(int i, boolean z) {
        this(1, null, Boolean.valueOf(z), i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }
}
