package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.zzaw.zza;

public class RemoveListenerRequest extends AbstractSafeParcelable {
    public static final Creator<RemoveListenerRequest> CREATOR = new zzbg();
    final int mVersionCode;
    public final zzaw zzbCi;

    RemoveListenerRequest(int i, IBinder iBinder) {
        this.mVersionCode = i;
        if (iBinder != null) {
            this.zzbCi = zza.zzeC(iBinder);
        } else {
            this.zzbCi = null;
        }
    }

    public RemoveListenerRequest(zzaw com_google_android_gms_wearable_internal_zzaw) {
        this.mVersionCode = 1;
        this.zzbCi = com_google_android_gms_wearable_internal_zzaw;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzbg.zza(this, parcel, i);
    }

    IBinder zzNt() {
        return this.zzbCi == null ? null : this.zzbCi.asBinder();
    }
}
