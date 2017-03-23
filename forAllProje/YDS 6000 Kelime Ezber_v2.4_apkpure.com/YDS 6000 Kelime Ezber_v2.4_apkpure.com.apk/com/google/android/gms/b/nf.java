package com.google.android.gms.b;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import java.io.InputStream;

@vz
public class nf extends a {
    public static final Creator<nf> CREATOR = new ng();
    public final int a;
    private ParcelFileDescriptor b;

    public nf() {
        this(1, null);
    }

    nf(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    public synchronized boolean a() {
        return this.b != null;
    }

    public synchronized InputStream b() {
        InputStream inputStream = null;
        synchronized (this) {
            if (this.b != null) {
                inputStream = new AutoCloseInputStream(this.b);
                this.b = null;
            }
        }
        return inputStream;
    }

    synchronized ParcelFileDescriptor c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ng.a(this, parcel, i);
    }
}
