package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ParentDriveIdSet extends AbstractSafeParcelable {
    public static final Creator<ParentDriveIdSet> CREATOR = new zzl();
    final int mVersionCode;
    final List<PartialDriveId> zzazt;

    public ParentDriveIdSet() {
        this(1, new ArrayList());
    }

    ParentDriveIdSet(int i, List<PartialDriveId> list) {
        this.mVersionCode = i;
        this.zzazt = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzl.zza(this, parcel, i);
    }

    public Set<DriveId> zzG(long j) {
        Set<DriveId> hashSet = new HashSet();
        for (PartialDriveId zzH : this.zzazt) {
            hashSet.add(zzH.zzH(j));
        }
        return hashSet;
    }

    public void zza(PartialDriveId partialDriveId) {
        this.zzazt.add(partialDriveId);
    }
}
