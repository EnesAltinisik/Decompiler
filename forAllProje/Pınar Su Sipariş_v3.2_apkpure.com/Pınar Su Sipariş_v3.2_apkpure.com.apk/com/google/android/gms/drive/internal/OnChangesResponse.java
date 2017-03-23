package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

public class OnChangesResponse extends WriteAwareParcelable {
    public static final Creator<OnChangesResponse> CREATOR = new zzas();
    final int mVersionCode;
    final DataHolder zzayw;
    final List<DriveId> zzayx;
    final ChangeSequenceNumber zzayy;
    final boolean zzayz;

    OnChangesResponse(int i, DataHolder dataHolder, List<DriveId> list, ChangeSequenceNumber changeSequenceNumber, boolean z) {
        this.mVersionCode = i;
        this.zzayw = dataHolder;
        this.zzayx = list;
        this.zzayy = changeSequenceNumber;
        this.zzayz = z;
    }

    protected void zzK(Parcel parcel, int i) {
        zzas.zza(this, parcel, i | 1);
    }
}
