package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.realtime.internal.ParcelableChangeInfo;
import java.util.List;

public class ParcelableEventList extends AbstractSafeParcelable {
    public static final Creator<ParcelableEventList> CREATOR = new zzd();
    final int mVersionCode;
    final DataHolder zzaBG;
    final boolean zzaBH;
    final List<String> zzaBI;
    final ParcelableChangeInfo zzaBJ;
    final List<ParcelableEvent> zzqD;

    ParcelableEventList(int i, List<ParcelableEvent> list, DataHolder dataHolder, boolean z, List<String> list2, ParcelableChangeInfo parcelableChangeInfo) {
        this.mVersionCode = i;
        this.zzqD = list;
        this.zzaBG = dataHolder;
        this.zzaBH = z;
        this.zzaBI = list2;
        this.zzaBJ = parcelableChangeInfo;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
