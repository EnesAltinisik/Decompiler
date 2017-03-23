package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.zzaeh;

class HostInfoParcelable extends AbstractSafeParcelable {
    public static final zzd CREATOR = new zzd();
    final int a;
    final String b;
    final String c;
    final boolean d;

    public HostInfoParcelable(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static zzaeh a(HostInfoParcelable hostInfoParcelable) {
        return new zzaeh(hostInfoParcelable.b, hostInfoParcelable.c, hostInfoParcelable.d);
    }

    public static HostInfoParcelable a(zzaeh com_google_android_gms_internal_zzaeh) {
        return new HostInfoParcelable(1, com_google_android_gms_internal_zzaeh.getHost(), com_google_android_gms_internal_zzaeh.getNamespace(), com_google_android_gms_internal_zzaeh.isSecure());
    }

    public void writeToParcel(Parcel parcel, int i) {
        zzd.zza(this, parcel, i);
    }
}
