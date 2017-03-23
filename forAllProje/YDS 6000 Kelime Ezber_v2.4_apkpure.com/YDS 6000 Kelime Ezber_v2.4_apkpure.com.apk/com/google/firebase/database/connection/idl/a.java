package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.fy;
import com.google.android.gms.b.gc;
import java.util.ArrayList;
import java.util.List;

class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Creator<a> CREATOR = new b();
    final int a;
    final List<String> b;
    final List<String> c;

    public a(int i, List<String> list, List<String> list2) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }

    public static fy a(a aVar) {
        List arrayList = new ArrayList(aVar.b.size());
        for (String a : aVar.b) {
            arrayList.add(gc.a(a));
        }
        return new fy(arrayList, aVar.c);
    }

    public static a a(fy fyVar) {
        List<List> a = fyVar.a();
        List arrayList = new ArrayList(a.size());
        for (List a2 : a) {
            arrayList.add(gc.a(a2));
        }
        return new a(1, arrayList, fyVar.b());
    }

    public void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel, i);
    }
}
