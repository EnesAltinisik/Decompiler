package android.support.v4.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class t implements Parcelable {
    public static final Creator<t> CREATOR = new Creator<t>() {
        public t a(Parcel parcel) {
            return new t(parcel);
        }

        public t[] a(int i) {
            return new t[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    v[] a;
    int[] b;
    g[] c;

    public t(Parcel parcel) {
        this.a = (v[]) parcel.createTypedArray(v.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (g[]) parcel.createTypedArray(g.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
    }
}
