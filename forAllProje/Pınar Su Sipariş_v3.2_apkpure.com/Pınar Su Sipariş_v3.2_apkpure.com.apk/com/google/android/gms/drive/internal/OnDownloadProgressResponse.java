package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveFileRange;
import java.util.Collections;
import java.util.List;

public class OnDownloadProgressResponse extends AbstractSafeParcelable {
    public static final Creator<OnDownloadProgressResponse> CREATOR = new zzav();
    private static final List<DriveFileRange> zzayC = Collections.emptyList();
    final int mVersionCode;
    final int zzDO;
    final long zzayD;
    final long zzayE;
    final List<DriveFileRange> zzayF;

    OnDownloadProgressResponse(int i, long j, long j2, int i2, List<DriveFileRange> list) {
        this.mVersionCode = i;
        this.zzayD = j;
        this.zzayE = j2;
        this.zzDO = i2;
        this.zzayF = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzav.zza(this, parcel, i);
    }

    public long zzww() {
        return this.zzayD;
    }

    public long zzwx() {
        return this.zzayE;
    }
}
