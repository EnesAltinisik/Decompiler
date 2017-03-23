package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.MessageEvent;

public class MessageEventParcelable extends AbstractSafeParcelable implements MessageEvent {
    public static final Creator<MessageEventParcelable> CREATOR = new zzba();
    private final String mPath;
    final int mVersionCode;
    private final String zzVg;
    private final byte[] zzaRo;
    private final int zzauX;

    MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.mVersionCode = i;
        this.zzauX = i2;
        this.mPath = str;
        this.zzaRo = bArr;
        this.zzVg = str2;
    }

    public byte[] getData() {
        return this.zzaRo;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getRequestId() {
        return this.zzauX;
    }

    public String getSourceNodeId() {
        return this.zzVg;
    }

    public String toString() {
        int i = this.zzauX;
        String str = this.mPath;
        String valueOf = String.valueOf(this.zzaRo == null ? "null" : Integer.valueOf(this.zzaRo.length));
        return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()).append("MessageEventParcelable[").append(i).append(",").append(str).append(", size=").append(valueOf).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzba.zza(this, parcel, i);
    }
}
