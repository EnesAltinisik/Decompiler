package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzr;
import com.google.android.gms.common.internal.zzr.zza;

public class DriveServiceResponse extends AbstractSafeParcelable {
    public static final Creator<DriveServiceResponse> CREATOR = new zzad();
    final int mVersionCode;
    final IBinder zzayc;

    DriveServiceResponse(int i, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzayc = iBinder;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzad.zza(this, parcel, i);
    }

    public zzr zzws() {
        return zza.zzaU(this.zzayc);
    }
}
