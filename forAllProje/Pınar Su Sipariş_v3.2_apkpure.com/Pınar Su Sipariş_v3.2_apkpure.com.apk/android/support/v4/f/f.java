package android.support.v4.f;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: ParcelableCompatHoneycombMR2 */
class f<T> implements ClassLoaderCreator<T> {
    private final e<T> a;

    public f(e<T> eVar) {
        this.a = eVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.a.createFromParcel(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.createFromParcel(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.a.newArray(i);
    }
}
