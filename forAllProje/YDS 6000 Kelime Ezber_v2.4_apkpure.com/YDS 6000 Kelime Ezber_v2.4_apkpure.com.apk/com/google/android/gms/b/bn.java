package com.google.android.gms.b;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;

public final class bn extends a {
    public static final Creator<bn> CREATOR = new bo();
    public final int a;
    private aw.a b = null;
    private byte[] c;

    bn(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        e();
    }

    private boolean c() {
        return this.b != null;
    }

    private void d() {
        if (!c()) {
            try {
                this.b = aw.a.a(this.c);
                this.c = null;
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        e();
    }

    private void e() {
        if (this.b == null && this.c != null) {
            return;
        }
        if (this.b != null && this.c == null) {
            return;
        }
        if (this.b != null && this.c != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (this.b == null && this.c == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    public byte[] a() {
        return this.c != null ? this.c : ln.a(this.b);
    }

    public aw.a b() {
        d();
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        bo.a(this, parcel, i);
    }
}
