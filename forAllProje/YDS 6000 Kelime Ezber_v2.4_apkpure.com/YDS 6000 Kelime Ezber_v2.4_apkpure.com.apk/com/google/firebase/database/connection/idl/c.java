package com.google.firebase.database.connection.idl;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.b.gd;
import com.google.android.gms.b.jc;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.List;

public class c extends a {
    public static final Creator<c> CREATOR = new d();
    final int a;
    final f b;
    final int c;
    final List<String> d;
    final boolean e;
    final String f;
    final String g;

    public c(int i, f fVar, int i2, List<String> list, boolean z, String str, String str2) {
        this.a = i;
        this.b = fVar;
        this.c = i2;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    public c(gd gdVar, jc.a aVar, List<String> list, boolean z, String str, String str2) {
        int i;
        switch (aVar) {
            case DEBUG:
                i = 1;
                break;
            case INFO:
                i = 2;
                break;
            case WARN:
                i = 3;
                break;
            case ERROR:
                i = 4;
                break;
            default:
                i = 0;
                break;
        }
        this.a = 1;
        this.b = f.a(gdVar);
        this.c = i;
        this.d = list;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    public jc.a a() {
        switch (this.c) {
            case 0:
                return jc.a.NONE;
            case 1:
                return jc.a.DEBUG;
            case 2:
                return jc.a.INFO;
            case 3:
                return jc.a.WARN;
            case 4:
                return jc.a.ERROR;
            default:
                return jc.a.NONE;
        }
    }

    public List<String> b() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        d.a(this, parcel, i);
    }
}
