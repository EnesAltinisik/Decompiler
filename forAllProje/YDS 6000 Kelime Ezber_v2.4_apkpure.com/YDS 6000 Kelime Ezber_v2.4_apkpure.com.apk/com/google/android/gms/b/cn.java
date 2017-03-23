package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.b.ck.a;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.o.b;
import com.google.android.gms.common.internal.o.c;

public class cn extends o<ck> {
    public cn(Context context, Looper looper, b bVar, c cVar) {
        super(context, looper, 93, bVar, cVar, null);
    }

    public /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    public ck b(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String i() {
        return "com.google.android.gms.measurement.START";
    }

    protected String j() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }
}
