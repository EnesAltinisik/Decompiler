package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzz;

public class JoinOptions extends AbstractSafeParcelable {
    public static final Creator<JoinOptions> CREATOR = new zzc();
    private final int mVersionCode;
    private int zzafm;

    public JoinOptions() {
        this(1, 0);
    }

    JoinOptions(int i, int i2) {
        this.mVersionCode = i;
        this.zzafm = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JoinOptions)) {
            return false;
        }
        return this.zzafm == ((JoinOptions) obj).zzafm;
    }

    public int getConnectionType() {
        return this.zzafm;
    }

    int getVersionCode() {
        return this.mVersionCode;
    }

    public int hashCode() {
        return zzz.hashCode(Integer.valueOf(this.zzafm));
    }

    public String toString() {
        String str;
        switch (this.zzafm) {
            case 0:
                str = "STRONG";
                break;
            case 2:
                str = "INVISIBLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
