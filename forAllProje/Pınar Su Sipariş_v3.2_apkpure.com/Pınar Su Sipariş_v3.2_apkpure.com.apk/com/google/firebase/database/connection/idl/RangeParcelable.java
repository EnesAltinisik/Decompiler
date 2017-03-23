package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzael;
import java.util.List;

class RangeParcelable extends AbstractSafeParcelable {
    public static final zzk CREATOR = new zzk();
    final int a;
    final List<String> b;
    final List<String> c;

    public RangeParcelable(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static zzael a(RangeParcelable rangeParcelable, Object obj) {
        return new zzael(rangeParcelable.b, rangeParcelable.c, obj);
    }

    public static RangeParcelable a(zzael com_google_android_gms_internal_zzael) {
        return new RangeParcelable(1, com_google_android_gms_internal_zzael.zzQu(), com_google_android_gms_internal_zzael.zzQv());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzk.zza(this, parcel, i);
    }
}
