package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetBuyFlowInitializationTokenResponse extends AbstractSafeParcelable {
    public static final Creator<GetBuyFlowInitializationTokenResponse> CREATOR = new zzc();
    private final int mVersionCode;
    byte[] zzbAw;

    GetBuyFlowInitializationTokenResponse() {
        this(1, new byte[0]);
    }

    GetBuyFlowInitializationTokenResponse(int i, byte[] bArr) {
        this.mVersionCode = i;
        this.zzbAw = bArr;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
