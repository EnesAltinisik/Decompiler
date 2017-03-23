package android.support.v4.f.a;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class a {

    public static final class a implements Parcelable {
        public static final Creator<a> CREATOR = new Creator<a>() {
            public a a(Parcel parcel) {
                return new a(VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            public a[] a(int i) {
                return new a[i];
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }
        };
        private final Object a;

        a(Object obj) {
            this.a = obj;
        }

        public Object a() {
            return this.a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == null ? aVar.a == null : aVar.a == null ? false : this.a.equals(aVar.a);
        }

        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.a);
            }
        }
    }
}
