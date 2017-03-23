package android.support.v4.b;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

final class v implements Parcelable {
    public static final Creator<v> CREATOR = new Creator<v>() {
        public v a(Parcel parcel) {
            return new v(parcel);
        }

        public v[] a(int i) {
            return new v[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    l l;

    public v(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt() != 0;
        this.h = parcel.readInt() != 0;
        this.i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.j = z;
        this.k = parcel.readBundle();
    }

    public v(l lVar) {
        this.a = lVar.getClass().getName();
        this.b = lVar.n;
        this.c = lVar.v;
        this.d = lVar.E;
        this.e = lVar.F;
        this.f = lVar.G;
        this.g = lVar.J;
        this.h = lVar.I;
        this.i = lVar.p;
        this.j = lVar.H;
    }

    public l a(p pVar, l lVar, s sVar) {
        if (this.l == null) {
            Context g = pVar.g();
            if (this.i != null) {
                this.i.setClassLoader(g.getClassLoader());
            }
            this.l = l.a(g, this.a, this.i);
            if (this.k != null) {
                this.k.setClassLoader(g.getClassLoader());
                this.l.l = this.k;
            }
            this.l.a(this.b, lVar);
            this.l.v = this.c;
            this.l.x = true;
            this.l.E = this.d;
            this.l.F = this.e;
            this.l.G = this.f;
            this.l.J = this.g;
            this.l.I = this.h;
            this.l.H = this.j;
            this.l.z = pVar.d;
            if (r.a) {
                Log.v("FragmentManager", "Instantiated fragment " + this.l);
            }
        }
        this.l.C = sVar;
        return this.l;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.i);
        if (!this.j) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeBundle(this.k);
    }
}
