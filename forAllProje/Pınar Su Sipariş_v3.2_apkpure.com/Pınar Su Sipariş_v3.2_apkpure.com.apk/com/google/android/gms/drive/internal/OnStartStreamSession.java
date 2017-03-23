package com.google.android.gms.drive.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class OnStartStreamSession extends AbstractSafeParcelable {
    public static final Creator<OnStartStreamSession> CREATOR = new zzbf();
    final int mVersionCode;
    final ParcelFileDescriptor zzayQ;
    final IBinder zzayR;
    final String zzug;

    OnStartStreamSession(int i, ParcelFileDescriptor parcelFileDescriptor, IBinder iBinder, String str) {
        this.mVersionCode = i;
        this.zzayQ = parcelFileDescriptor;
        this.zzayR = iBinder;
        this.zzug = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbf.zza(this, parcel, i | 1);
    }
}
