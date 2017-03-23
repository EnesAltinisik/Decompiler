package com.b.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;

public class d implements Parcelable {
    public static final Creator<d> CREATOR = new Creator<d>() {
        public d a(Parcel parcel) {
            return new d(parcel);
        }

        public d[] a(int i) {
            return new d[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    public String a;
    public String b;
    public String c;
    public Date d;
    public f e;
    public String f;
    public String g;
    public boolean h;

    protected d(Parcel parcel) {
        f fVar = null;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        long readLong = parcel.readLong();
        this.d = readLong == -1 ? null : new Date(readLong);
        int readInt = parcel.readInt();
        if (readInt != -1) {
            fVar = f.values()[readInt];
        }
        this.e = fVar;
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readByte() != (byte) 0;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d != null ? this.d.getTime() : -1);
        parcel.writeInt(this.e == null ? -1 : this.e.ordinal());
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
    }
}
