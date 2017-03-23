package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;

public class FieldWithSortOrder extends AbstractSafeParcelable {
    public static final zzc CREATOR = new zzc();
    final int mVersionCode;
    final boolean zzaAK;
    final String zzazg;

    FieldWithSortOrder(int i, String str, boolean z) {
        this.mVersionCode = i;
        this.zzazg = str;
        this.zzaAK = z;
    }

    public FieldWithSortOrder(String str, boolean z) {
        this(1, str, z);
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "FieldWithSortOrder[%s %s]";
        Object[] objArr = new Object[2];
        objArr[0] = this.zzazg;
        objArr[1] = this.zzaAK ? "ASC" : "DESC";
        return String.format(locale, str, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzc.zza(this, parcel, i);
    }
}
