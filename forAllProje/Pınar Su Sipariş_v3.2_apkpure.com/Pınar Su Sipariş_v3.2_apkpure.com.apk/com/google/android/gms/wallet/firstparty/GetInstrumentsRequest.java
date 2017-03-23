package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetInstrumentsRequest extends AbstractSafeParcelable {
    public static final Creator<GetInstrumentsRequest> CREATOR = new zzd();
    private final int mVersionCode;
    int[] zzbAx;

    GetInstrumentsRequest() {
        this(1, null);
    }

    GetInstrumentsRequest(int i, int[] iArr) {
        this.mVersionCode = i;
        this.zzbAx = iArr;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
