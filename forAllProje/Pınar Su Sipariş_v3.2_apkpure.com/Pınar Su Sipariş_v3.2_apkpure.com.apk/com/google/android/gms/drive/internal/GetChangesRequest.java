package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.DriveSpace;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetChangesRequest extends AbstractSafeParcelable {
    public static final Creator<GetChangesRequest> CREATOR = new zzah();
    final int mVersionCode;
    final List<DriveSpace> zzawb;
    private final Set<DriveSpace> zzawc;
    final ChangeSequenceNumber zzayk;
    final int zzayl;
    final boolean zzaym;

    private GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, Set<DriveSpace> set, boolean z) {
        this.mVersionCode = i;
        this.zzayk = changeSequenceNumber;
        this.zzayl = i2;
        this.zzawb = list;
        this.zzawc = set;
        this.zzaym = z;
    }

    GetChangesRequest(int i, ChangeSequenceNumber changeSequenceNumber, int i2, List<DriveSpace> list, boolean z) {
        this(i, changeSequenceNumber, i2, list, list == null ? null : new HashSet(list), z);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzah.zza(this, parcel, i);
    }
}
