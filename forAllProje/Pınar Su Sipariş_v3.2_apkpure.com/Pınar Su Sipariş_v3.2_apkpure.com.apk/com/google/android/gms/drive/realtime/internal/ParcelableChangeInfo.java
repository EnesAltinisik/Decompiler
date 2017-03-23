package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.event.ParcelableEvent;
import java.util.List;

public class ParcelableChangeInfo extends AbstractSafeParcelable {
    public static final Creator<ParcelableChangeInfo> CREATOR = new zzp();
    final int mVersionCode;
    final long zzajg;
    final List<ParcelableEvent> zzqD;

    ParcelableChangeInfo(int i, long j, List<ParcelableEvent> list) {
        this.mVersionCode = i;
        this.zzajg = j;
        this.zzqD = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }
}
