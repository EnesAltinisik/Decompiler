package android.support.v4.g;

import android.annotation.TargetApi;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

@TargetApi(13)
class f<T> implements ClassLoaderCreator<T> {
    private final e<T> a;

    public f(e<T> eVar) {
        this.a = eVar;
    }

    public T createFromParcel(Parcel parcel) {
        return this.a.b(parcel, null);
    }

    public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.b(parcel, classLoader);
    }

    public T[] newArray(int i) {
        return this.a.b(i);
    }
}
