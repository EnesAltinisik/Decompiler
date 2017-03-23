package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: ParcelableCompat */
public final class d {

    /* compiled from: ParcelableCompat */
    static class a<T> implements Creator<T> {
        final e<T> a;

        public a(e<T> eVar) {
            this.a = eVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.a.createFromParcel(parcel, null);
        }

        public T[] newArray(int i) {
            return this.a.newArray(i);
        }
    }

    public static <T> Creator<T> a(e<T> eVar) {
        if (VERSION.SDK_INT >= 13) {
            return g.a(eVar);
        }
        return new a(eVar);
    }
}
