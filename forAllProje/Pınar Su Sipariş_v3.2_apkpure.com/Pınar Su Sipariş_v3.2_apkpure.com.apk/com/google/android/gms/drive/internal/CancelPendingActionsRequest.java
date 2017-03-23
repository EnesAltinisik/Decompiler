package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest extends AbstractSafeParcelable {
    public static final Creator<CancelPendingActionsRequest> CREATOR = new zze();
    final int mVersionCode;
    final List<String> zzawg;

    CancelPendingActionsRequest(int i, List<String> list) {
        this.mVersionCode = i;
        this.zzawg = list;
    }

    public CancelPendingActionsRequest(List<String> list) {
        this(1, list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
