package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

public class h<T extends IInterface> extends u<T> {
    private final com.google.android.gms.common.api.a.h<T> e;

    protected T a(IBinder iBinder) {
        return this.e.a(iBinder);
    }

    protected String i() {
        return this.e.a();
    }

    protected String j() {
        return this.e.b();
    }

    public com.google.android.gms.common.api.a.h<T> k() {
        return this.e;
    }
}
