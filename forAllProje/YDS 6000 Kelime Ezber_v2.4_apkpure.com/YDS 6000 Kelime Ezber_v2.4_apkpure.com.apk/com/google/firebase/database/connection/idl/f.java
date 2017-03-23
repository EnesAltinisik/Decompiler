package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.gd;
import com.google.android.gms.common.internal.safeparcel.a;

class f extends a {
    public static final Creator<f> CREATOR = new g();
    final int a;
    final String b;
    final String c;
    final boolean d;

    public f(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public static gd a(f fVar) {
        return new gd(fVar.b, fVar.c, fVar.d);
    }

    public static f a(gd gdVar) {
        return new f(1, gdVar.a(), gdVar.b(), gdVar.c());
    }

    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }
}
