package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class LoadRealtimeRequest extends AbstractSafeParcelable {
    public static final Creator<LoadRealtimeRequest> CREATOR = new zzar();
    final int mVersionCode;
    final DriveId zzauZ;
    final boolean zzayr;
    final List<String> zzays;
    final boolean zzayt;
    final DataHolder zzayu;
    final String zzayv;

    LoadRealtimeRequest(int i, DriveId driveId, boolean z, List<String> list, boolean z2, DataHolder dataHolder, String str) {
        this.mVersionCode = i;
        this.zzauZ = driveId;
        this.zzayr = z;
        this.zzays = list;
        this.zzayt = z2;
        this.zzayu = dataHolder;
        this.zzayv = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzar.zza(this, parcel, i);
    }
}
