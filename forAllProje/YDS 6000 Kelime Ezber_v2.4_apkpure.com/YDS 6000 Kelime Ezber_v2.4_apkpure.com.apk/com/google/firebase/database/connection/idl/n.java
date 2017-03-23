package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.gh;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

class n extends a {
    public static final Creator<n> CREATOR = new o();
    final int a;
    final List<String> b;
    final List<String> c;

    public n(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static gh a(n nVar, Object obj) {
        return new gh(nVar.b, nVar.c, obj);
    }

    public static n a(gh ghVar) {
        return new n(1, ghVar.a(), ghVar.b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        o.a(this, parcel, i);
    }
}
