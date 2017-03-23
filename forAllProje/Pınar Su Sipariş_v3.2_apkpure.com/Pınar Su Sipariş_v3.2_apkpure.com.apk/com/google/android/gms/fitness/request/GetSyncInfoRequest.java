package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzrq;
import com.google.android.gms.internal.zzrq.zza;

public class GetSyncInfoRequest extends AbstractSafeParcelable {
    public static final Creator<GetSyncInfoRequest> CREATOR = new zzp();
    private final int mVersionCode;
    private final zzrq zzaHO;

    GetSyncInfoRequest(int i, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaHO = zza.zzca(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzaHO.asBinder();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("GetSyncInfoRequest {%d, %s, %s}", new Object[]{Integer.valueOf(this.mVersionCode), this.zzaHO});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }
}
