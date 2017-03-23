package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.util.zzf;
import java.util.Set;
import java.util.regex.Pattern;

public class DriveSpace extends AbstractSafeParcelable {
    public static final Creator<DriveSpace> CREATOR = new zzg();
    public static final DriveSpace zzavp = new DriveSpace("DRIVE");
    public static final DriveSpace zzavq = new DriveSpace("APP_DATA_FOLDER");
    public static final DriveSpace zzavr = new DriveSpace("PHOTOS");
    public static final Set<DriveSpace> zzavs = zzf.zza(zzavp, zzavq, zzavr);
    public static final String zzavt = TextUtils.join(",", zzavs.toArray());
    private static final Pattern zzavu = Pattern.compile("[A-Z0-9_]*");
    private final String mName;
    final int mVersionCode;

    DriveSpace(int i, String str) {
        this.mVersionCode = i;
        this.mName = (String) zzaa.zzz(str);
    }

    private DriveSpace(String str) {
        this(1, str);
    }

    public boolean equals(Object obj) {
        return (obj == null || obj.getClass() != DriveSpace.class) ? false : this.mName.equals(((DriveSpace) obj).mName);
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return 1247068382 ^ this.mName.hashCode();
    }

    public String toString() {
        return this.mName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzg.zza(this, parcel, i);
    }
}
