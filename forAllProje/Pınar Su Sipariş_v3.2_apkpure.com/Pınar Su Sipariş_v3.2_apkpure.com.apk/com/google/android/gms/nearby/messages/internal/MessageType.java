package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class MessageType extends AbstractSafeParcelable {
    public static final Creator<MessageType> CREATOR = new zzm();
    final int mVersionCode;
    public final String type;
    public final String zzasB;

    MessageType(int i, String str, String str2) {
        this.mVersionCode = i;
        this.zzasB = str;
        this.type = str2;
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageType)) {
            return false;
        }
        MessageType messageType = (MessageType) obj;
        return zzz.equal(this.zzasB, messageType.zzasB) && zzz.equal(this.type, messageType.type);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzasB, this.type);
    }

    public String toString() {
        String str = this.zzasB;
        String str2 = this.type;
        return new StringBuilder((String.valueOf(str).length() + 17) + String.valueOf(str2).length()).append("namespace=").append(str).append(", type=").append(str2).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzm.zza(this, parcel, i);
    }
}
