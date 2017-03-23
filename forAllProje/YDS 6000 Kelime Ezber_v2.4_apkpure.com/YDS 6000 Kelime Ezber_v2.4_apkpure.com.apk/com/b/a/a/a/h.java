package com.b.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;

public class h implements Parcelable {
    public static final Creator<h> CREATOR = new Creator<h>() {
        public h a(Parcel parcel) {
            return new h(parcel);
        }

        public h[] a(int i) {
            return new h[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    @Deprecated
    public final String a = this.e.c.c;
    @Deprecated
    public final String b = this.e.c.a;
    @Deprecated
    public final String c = this.e.c.g;
    @Deprecated
    public final Date d = this.e.c.d;
    public final e e;

    protected h(Parcel parcel) {
        this.e = (e) parcel.readParcelable(e.class.getClassLoader());
    }

    public h(e eVar) {
        this.e = eVar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.b != null) {
            if (this.b.equals(hVar.b)) {
                return true;
            }
        } else if (hVar.b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b != null ? this.b.hashCode() : 0;
    }

    public String toString() {
        return String.format("%s purchased at %s(%s). Token: %s, Signature: %s", new Object[]{this.a, this.d, this.b, this.c, this.e.b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
    }
}
