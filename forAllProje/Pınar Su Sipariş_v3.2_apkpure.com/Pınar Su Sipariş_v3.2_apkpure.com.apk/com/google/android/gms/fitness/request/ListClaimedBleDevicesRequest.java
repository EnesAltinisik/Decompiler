package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzsc;
import com.google.android.gms.internal.zzsc.zza;

public class ListClaimedBleDevicesRequest extends AbstractSafeParcelable {
    public static final Creator<ListClaimedBleDevicesRequest> CREATOR = new zzr();
    private final int mVersionCode;
    private final zzsc zzaHP;

    ListClaimedBleDevicesRequest(int i, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaHP = zza.zzcb(iBinder);
    }

    public ListClaimedBleDevicesRequest(zzsc com_google_android_gms_internal_zzsc) {
        this.mVersionCode = 2;
        this.zzaHP = com_google_android_gms_internal_zzsc;
    }

    public IBinder getCallbackBinder() {
        return this.zzaHP.asBinder();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzr.zza(this, parcel, i);
    }
}
