package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PendingCallback implements Parcelable {
    public static final Creator<PendingCallback> CREATOR = new Creator<PendingCallback>() {
        public PendingCallback a(Parcel parcel) {
            return new PendingCallback(parcel);
        }

        public PendingCallback[] a(int i) {
            return new PendingCallback[i];
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return a(i);
        }
    };
    final IBinder zzaqQ;

    public PendingCallback(Parcel parcel) {
        this.zzaqQ = parcel.readStrongBinder();
    }

    public int describeContents() {
        return 0;
    }

    public IBinder getIBinder() {
        return this.zzaqQ;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.zzaqQ);
    }
}
