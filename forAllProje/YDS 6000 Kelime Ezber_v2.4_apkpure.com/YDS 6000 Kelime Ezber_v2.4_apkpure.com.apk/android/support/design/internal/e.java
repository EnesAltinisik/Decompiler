package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.g.d;
import android.util.SparseArray;

public class e extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<e> CREATOR = d.a(new android.support.v4.g.e<e>() {
        public e a(Parcel parcel, ClassLoader classLoader) {
            return new e(parcel, classLoader);
        }

        public e[] a(int i) {
            return new e[i];
        }

        public /* synthetic */ Object b(Parcel parcel, ClassLoader classLoader) {
            return a(parcel, classLoader);
        }

        public /* synthetic */ Object[] b(int i) {
            return a(i);
        }
    });

    public e(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
