package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class StringListResponse extends AbstractSafeParcelable {
    public static final Creator<StringListResponse> CREATOR = new zzbt();
    private final int mVersionCode;
    private final List<String> zzayY;

    StringListResponse(int i, List<String> list) {
        this.mVersionCode = i;
        this.zzayY = list;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbt.zza(this, parcel, i);
    }

    public List<String> zzwD() {
        return this.zzayY;
    }
}
