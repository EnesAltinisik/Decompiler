package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.b.bp.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

public class bk extends o<bp> {
    public bk(Context context, Looper looper, b bVar, c cVar) {
        super(context, looper, 116, bVar, cVar, null);
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    protected bp b(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String i() {
        return "com.google.android.gms.gass.START";
    }

    protected String j() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public bp k() {
        return (bp) super.u();
    }
}
