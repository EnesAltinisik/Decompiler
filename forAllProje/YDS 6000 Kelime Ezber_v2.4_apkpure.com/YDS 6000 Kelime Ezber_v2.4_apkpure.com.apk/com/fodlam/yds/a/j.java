package com.fodlam.yds.a;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.arlib.floatingsearchview.a.a.a;

public class j implements a {
    public static final Creator<j> CREATOR = new Creator<j>() {
        public j a(Parcel parcel) {
            return new j(parcel);
        }

        public j[] a(int i) {
            return new j[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    String a;
    private boolean b = false;

    public j(Parcel parcel) {
        boolean z = false;
        this.a = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        }
        this.b = z;
    }

    public j(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
