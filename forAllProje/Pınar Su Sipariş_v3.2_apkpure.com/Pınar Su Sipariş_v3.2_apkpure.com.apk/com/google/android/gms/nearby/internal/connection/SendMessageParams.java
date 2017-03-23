package com.google.android.gms.nearby.internal.connection;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public final class SendMessageParams extends AbstractSafeParcelable {
    public static final Creator<SendMessageParams> CREATOR = new zzm();
    final int versionCode;
    private final String[] zzbiG;
    private final byte[] zzbid;
    private final long zzbie;

    SendMessageParams(int i, String[] strArr, byte[] bArr, long j) {
        this.versionCode = i;
        this.zzbiG = strArr;
        this.zzbid = bArr;
        this.zzbie = j;
    }

    public byte[] getPayload() {
        return this.zzbid;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }

    public long zzHA() {
        return this.zzbie;
    }

    public String[] zzHF() {
        return this.zzbiG;
    }
}
