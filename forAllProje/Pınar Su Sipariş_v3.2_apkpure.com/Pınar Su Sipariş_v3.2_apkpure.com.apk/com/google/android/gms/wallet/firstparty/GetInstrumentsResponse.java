package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class GetInstrumentsResponse extends AbstractSafeParcelable {
    public static final Creator<GetInstrumentsResponse> CREATOR = new zze();
    private final int mVersionCode;
    String[] zzbAy;
    byte[][] zzbAz;

    GetInstrumentsResponse() {
        this(1, new String[0], new byte[0][]);
    }

    GetInstrumentsResponse(int i, String[] strArr, byte[][] bArr) {
        this.mVersionCode = i;
        this.zzbAy = strArr;
        this.zzbAz = bArr;
    }

    public int getVersionCode() {
        return this.mVersionCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zze.zza(this, parcel, i);
    }
}
