package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.drive.events.internal.TransferProgressData;
import java.util.List;

public final class TransferStateEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<TransferStateEvent> CREATOR = new zzp();
    final int mVersionCode;
    final String zzaaR;
    final List<TransferProgressData> zzawu;

    TransferStateEvent(int i, String str, List<TransferProgressData> list) {
        this.mVersionCode = i;
        this.zzaaR = str;
        this.zzawu = list;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        TransferStateEvent transferStateEvent = (TransferStateEvent) obj;
        return zzz.equal(this.zzaaR, transferStateEvent.zzaaR) && zzz.equal(this.zzawu, transferStateEvent.zzawu);
    }

    public int getType() {
        return 7;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzaaR, this.zzawu);
    }

    public String toString() {
        return String.format("TransferStateEvent[%s]", new Object[]{TextUtils.join("','", this.zzawu)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzp.zza(this, parcel, i);
    }
}
