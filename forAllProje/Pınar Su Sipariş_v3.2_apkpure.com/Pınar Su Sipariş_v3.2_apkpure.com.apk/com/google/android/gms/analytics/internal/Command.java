package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Command implements Parcelable {
    @Deprecated
    public static final Creator<Command> CREATOR = new Creator<Command>() {
        @Deprecated
        public Command a(Parcel parcel) {
            return new Command(parcel);
        }

        @Deprecated
        public Command[] a(int i) {
            return new Command[i];
        }

        @Deprecated
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Deprecated
        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    private String mValue;
    private String zzBc;
    private String zzXo;

    @Deprecated
    Command(Parcel parcel) {
        readFromParcel(parcel);
    }

    @Deprecated
    private void readFromParcel(Parcel parcel) {
        this.zzBc = parcel.readString();
        this.zzXo = parcel.readString();
        this.mValue = parcel.readString();
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.zzBc;
    }

    public String getValue() {
        return this.mValue;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzBc);
        parcel.writeString(this.zzXo);
        parcel.writeString(this.mValue);
    }
}
