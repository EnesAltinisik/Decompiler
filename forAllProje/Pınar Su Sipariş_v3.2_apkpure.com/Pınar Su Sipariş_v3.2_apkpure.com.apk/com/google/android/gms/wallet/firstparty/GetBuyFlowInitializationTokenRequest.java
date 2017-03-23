package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
public final class GetBuyFlowInitializationTokenRequest extends AbstractSafeParcelable {
    public static final Creator<GetBuyFlowInitializationTokenRequest> CREATOR = new zzb();
    private final int mVersionCode;
    byte[] zzbAu;
    byte[] zzbAv;

    GetBuyFlowInitializationTokenRequest() {
        this(1, null, null);
    }

    GetBuyFlowInitializationTokenRequest(int i, byte[] bArr, byte[] bArr2) {
        this.mVersionCode = i;
        this.zzbAu = bArr;
        this.zzbAv = bArr2;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
