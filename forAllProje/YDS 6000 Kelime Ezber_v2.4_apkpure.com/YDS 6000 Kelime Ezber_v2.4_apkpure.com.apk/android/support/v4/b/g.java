package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class g implements Parcelable {
    public static final Creator<g> CREATOR = new Creator<g>() {
        public g a(Parcel parcel) {
            return new g(parcel);
        }

        public g[] a(int i) {
            return new g[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;

    public g(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public g(f fVar) {
        int size = fVar.c.size();
        this.a = new int[(size * 6)];
        if (fVar.j) {
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) fVar.c.get(i2);
                int i3 = i + 1;
                this.a[i] = aVar.a;
                int i4 = i3 + 1;
                this.a[i3] = aVar.b != null ? aVar.b.n : -1;
                int i5 = i4 + 1;
                this.a[i4] = aVar.c;
                i3 = i5 + 1;
                this.a[i5] = aVar.d;
                i5 = i3 + 1;
                this.a[i3] = aVar.e;
                i = i5 + 1;
                this.a[i5] = aVar.f;
            }
            this.b = fVar.h;
            this.c = fVar.i;
            this.d = fVar.l;
            this.e = fVar.n;
            this.f = fVar.o;
            this.g = fVar.p;
            this.h = fVar.q;
            this.i = fVar.r;
            this.j = fVar.s;
            this.k = fVar.t;
            this.l = fVar.u;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public f a(r rVar) {
        int i = 0;
        f fVar = new f(rVar);
        int i2 = 0;
        while (i < this.a.length) {
            a aVar = new a();
            int i3 = i + 1;
            aVar.a = this.a[i];
            if (r.a) {
                Log.v("FragmentManager", "Instantiate " + fVar + " op #" + i2 + " base fragment #" + this.a[i3]);
            }
            int i4 = i3 + 1;
            i = this.a[i3];
            if (i >= 0) {
                aVar.b = (l) rVar.e.get(i);
            } else {
                aVar.b = null;
            }
            i3 = i4 + 1;
            aVar.c = this.a[i4];
            i4 = i3 + 1;
            aVar.d = this.a[i3];
            i3 = i4 + 1;
            aVar.e = this.a[i4];
            i4 = i3 + 1;
            aVar.f = this.a[i3];
            fVar.d = aVar.c;
            fVar.e = aVar.d;
            fVar.f = aVar.e;
            fVar.g = aVar.f;
            fVar.a(aVar);
            i2++;
            i = i4;
        }
        fVar.h = this.b;
        fVar.i = this.c;
        fVar.l = this.d;
        fVar.n = this.e;
        fVar.j = true;
        fVar.o = this.f;
        fVar.p = this.g;
        fVar.q = this.h;
        fVar.r = this.i;
        fVar.s = this.j;
        fVar.t = this.k;
        fVar.u = this.l;
        fVar.a(1);
        return fVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        if (this.l) {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }
}
