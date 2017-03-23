package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class InitializeBuyFlowRequest extends AbstractSafeParcelable {
    public static final Creator<InitializeBuyFlowRequest> CREATOR = new zzf();
    private final int mVersionCode;
    byte[][] zzbAA;

    InitializeBuyFlowRequest(int i, byte[][] bArr) {
        this.mVersionCode = i;
        this.zzbAA = bArr;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzf.zza(this, parcel, i);
    }
}
