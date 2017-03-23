package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.query.internal.FilterHolder;

public class OpenFileIntentSenderRequest extends AbstractSafeParcelable {
    public static final Creator<OpenFileIntentSenderRequest> CREATOR = new zzbj();
    final int mVersionCode;
    final String zzavG;
    final String[] zzavH;
    final DriveId zzavJ;
    final FilterHolder zzayU;

    OpenFileIntentSenderRequest(int i, String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this.mVersionCode = i;
        this.zzavG = str;
        this.zzavH = strArr;
        this.zzavJ = driveId;
        this.zzayU = filterHolder;
    }

    public OpenFileIntentSenderRequest(String str, String[] strArr, DriveId driveId, FilterHolder filterHolder) {
        this(1, str, strArr, driveId, filterHolder);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbj.zza(this, parcel, i);
    }
}
