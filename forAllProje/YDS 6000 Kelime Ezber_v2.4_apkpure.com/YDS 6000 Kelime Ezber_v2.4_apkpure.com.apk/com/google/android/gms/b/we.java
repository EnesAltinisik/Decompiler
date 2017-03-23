package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.b.wo.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

@vz
public class we extends o<wo> {
    final int e;

    public we(Context context, Looper looper, b bVar, c cVar, int i) {
        super(context, looper, 8, bVar, cVar, null);
        this.e = i;
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    protected wo b(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String i() {
        return "com.google.android.gms.ads.service.START";
    }

    protected String j() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public wo k() {
        return (wo) super.u();
    }
}
