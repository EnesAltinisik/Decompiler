package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.b.nl.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

@vz
public class nh extends o<nl> {
    nh(Context context, Looper looper, b bVar, c cVar) {
        super(context, looper, 123, bVar, cVar, null);
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    protected nl b(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String i() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    protected String j() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public nl k() {
        return (nl) super.u();
    }
}
