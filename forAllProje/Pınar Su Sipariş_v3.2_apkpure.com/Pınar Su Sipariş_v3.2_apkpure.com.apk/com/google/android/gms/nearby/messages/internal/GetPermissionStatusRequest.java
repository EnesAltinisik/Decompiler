package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.internal.zzg.zza;

@Deprecated
public class GetPermissionStatusRequest extends AbstractSafeParcelable {
    public static final Creator<GetPermissionStatusRequest> CREATOR = new zzd();
    final int mVersionCode;
    @Deprecated
    public final String zzbiR;
    public final zzg zzbjI;
    @Deprecated
    public final ClientAppContext zzbjJ;

    GetPermissionStatusRequest(int i, IBinder iBinder, String str, ClientAppContext clientAppContext) {
        this.mVersionCode = i;
        this.zzbjI = zza.zzdH(iBinder);
        this.zzbiR = str;
        this.zzbjJ = ClientAppContext.zza(clientAppContext, null, str, false);
    }

    GetPermissionStatusRequest(IBinder iBinder) {
        this(1, iBinder, null, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }

    IBinder zzHy() {
        return this.zzbjI.asBinder();
    }
}
