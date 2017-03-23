package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.nearby.messages.Message;

public class MessageWrapper extends AbstractSafeParcelable {
    public static final zzn CREATOR = new zzn();
    final int mVersionCode;
    public final Message zzbjL;

    MessageWrapper(int i, Message message) {
        this.mVersionCode = i;
        this.zzbjL = (Message) zzaa.zzz(message);
    }

    public static final MessageWrapper zza(Message message) {
        return new MessageWrapper(1, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageWrapper)) {
            return false;
        }
        return zzz.equal(this.zzbjL, ((MessageWrapper) obj).zzbjL);
    }

    public int hashCode() {
        return zzz.hashCode(this.zzbjL);
    }

    public String toString() {
        String valueOf = String.valueOf(this.zzbjL.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MessageWrapper{message=").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzn com_google_android_gms_nearby_messages_internal_zzn = CREATOR;
        zzn.zza(this, parcel, i);
    }
}
