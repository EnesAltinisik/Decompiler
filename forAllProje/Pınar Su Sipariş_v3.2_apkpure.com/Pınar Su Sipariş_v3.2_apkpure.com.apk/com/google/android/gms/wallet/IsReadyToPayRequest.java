package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    public static final Creator<IsReadyToPayRequest> CREATOR = new zzi();
    final int mVersionCode;

    public final class zza {
        final /* synthetic */ IsReadyToPayRequest zzbzp;

        private zza(IsReadyToPayRequest isReadyToPayRequest) {
            this.zzbzp = isReadyToPayRequest;
        }

        public IsReadyToPayRequest zzNf() {
            return this.zzbzp;
        }
    }

    IsReadyToPayRequest() {
        this.mVersionCode = 1;
    }

    IsReadyToPayRequest(int i) {
        this.mVersionCode = i;
    }

    public static zza zzNe() {
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        isReadyToPayRequest.getClass();
        return new zza();
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzi.zza(this, parcel, i);
    }
}
