package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.zzaw.zza;

public class AddListenerRequest extends AbstractSafeParcelable {
    public static final Creator<AddListenerRequest> CREATOR = new zzc();
    final int mVersionCode;
    public final zzaw zzbCi;
    public final IntentFilter[] zzbCj;
    public final String zzbCk;
    public final String zzbCl;

    AddListenerRequest(int i, IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.mVersionCode = i;
        if (iBinder != null) {
            this.zzbCi = zza.zzeC(iBinder);
        } else {
            this.zzbCi = null;
        }
        this.zzbCj = intentFilterArr;
        this.zzbCk = str;
        this.zzbCl = str2;
    }

    public AddListenerRequest(zzbq com_google_android_gms_wearable_internal_zzbq) {
        this.mVersionCode = 1;
        this.zzbCi = com_google_android_gms_wearable_internal_zzbq;
        this.zzbCj = com_google_android_gms_wearable_internal_zzbq.zzNJ();
        this.zzbCk = com_google_android_gms_wearable_internal_zzbq.zzNK();
        this.zzbCl = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }

    IBinder zzNt() {
        return this.zzbCi == null ? null : this.zzbCi.asBinder();
    }
}
