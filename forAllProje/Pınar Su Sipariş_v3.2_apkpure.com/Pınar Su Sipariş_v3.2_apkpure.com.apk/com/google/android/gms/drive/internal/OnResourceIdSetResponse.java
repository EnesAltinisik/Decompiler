package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class OnResourceIdSetResponse extends AbstractSafeParcelable {
    public static final Creator<OnResourceIdSetResponse> CREATOR = new zzbe();
    private final int mVersionCode;
    private final List<String> zzawI;

    OnResourceIdSetResponse(int i, List<String> list) {
        this.mVersionCode = i;
        this.zzawI = list;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbe.zza(this, parcel, i);
    }

    public List<String> zzwl() {
        return this.zzawI;
    }
}
