package com.google.android.gms.b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.safeparcel.a;
import java.util.Iterator;

public class ce extends a implements Iterable<String> {
    public static final Creator<ce> CREATOR = new cg();
    public final int a;
    private final Bundle b;

    ce(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    ce(Bundle bundle) {
        c.a((Object) bundle);
        this.b = bundle;
        this.a = 1;
    }

    public int a() {
        return this.b.size();
    }

    Object a(String str) {
        return this.b.get(str);
    }

    public Bundle b() {
        return new Bundle(this.b);
    }

    public Iterator<String> iterator() {
        return new Iterator<String>(this) {
            Iterator<String> a = this.b.b.keySet().iterator();
            final /* synthetic */ ce b;

            {
                this.b = r2;
            }

            public String a() {
                return (String) this.a.next();
            }

            public boolean hasNext() {
                return this.a.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }

    public String toString() {
        return this.b.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        cg.a(this, parcel, i);
    }
}
