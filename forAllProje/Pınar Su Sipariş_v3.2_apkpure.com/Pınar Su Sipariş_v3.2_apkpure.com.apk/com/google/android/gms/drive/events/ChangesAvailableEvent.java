package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;
import java.util.Locale;

public final class ChangesAvailableEvent extends AbstractSafeParcelable implements DriveEvent {
    public static final Creator<ChangesAvailableEvent> CREATOR = new zzb();
    final int mVersionCode;
    final String zzaaR;
    final ChangesAvailableOptions zzavY;

    ChangesAvailableEvent(int i, String str, ChangesAvailableOptions changesAvailableOptions) {
        this.mVersionCode = i;
        this.zzaaR = str;
        this.zzavY = changesAvailableOptions;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) obj;
        return zzz.equal(this.zzavY, changesAvailableEvent.zzavY) && zzz.equal(this.zzaaR, changesAvailableEvent.zzaaR);
    }

    public int getType() {
        return 4;
    }

    public int hashCode() {
        return zzz.hashCode(this.zzavY, this.zzaaR);
    }

    public String toString() {
        return String.format(Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", new Object[]{this.zzavY});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzb.zza(this, parcel, i);
    }
}
