package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.internal.zzrp.zza;

public class DeleteAllUserDataRequest extends AbstractSafeParcelable {
    public static final Creator<DeleteAllUserDataRequest> CREATOR = new zzn();
    private final int mVersionCode;
    private final zzrp zzaHq;

    DeleteAllUserDataRequest(int i, IBinder iBinder) {
        this.mVersionCode = i;
        this.zzaHq = zza.zzbZ(iBinder);
    }

    public IBinder getCallbackBinder() {
        return this.zzaHq.asBinder();
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public String toString() {
        return String.format("DisableFitRequest", new Object[0]);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn.zza(this, parcel, i);
    }
}
