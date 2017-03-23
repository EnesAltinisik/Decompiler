package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import java.util.List;

public class RealtimeDocumentSyncRequest extends AbstractSafeParcelable {
    public static final Creator<RealtimeDocumentSyncRequest> CREATOR = new zzk();
    final int mVersionCode;
    final List<String> zzavQ;
    final List<String> zzavR;

    RealtimeDocumentSyncRequest(int i, List<String> list, List<String> list2) {
        this.mVersionCode = i;
        this.zzavQ = (List) zzaa.zzz(list);
        this.zzavR = (List) zzaa.zzz(list2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
