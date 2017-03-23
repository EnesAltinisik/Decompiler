package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class HandleClientLifecycleEventRequest extends AbstractSafeParcelable {
    public static final Creator<HandleClientLifecycleEventRequest> CREATOR = new zze();
    public final int versionCode;
    @Deprecated
    public final ClientAppContext zzbjJ;
    public final int zzbjK;

    public HandleClientLifecycleEventRequest(int i) {
        this(1, null, i);
    }

    HandleClientLifecycleEventRequest(int i, ClientAppContext clientAppContext, int i2) {
        this.versionCode = i;
        this.zzbjJ = clientAppContext;
        this.zzbjK = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
