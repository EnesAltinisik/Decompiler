package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.b.abw.a;
import com.google.android.gms.common.api.c.b;
import com.google.android.gms.common.api.c.c;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.u;

public class abt extends u<abw> {
    public abt(Context context, Looper looper, p pVar, b bVar, c cVar) {
        super(context, looper, 40, pVar, bVar, cVar);
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return b(iBinder);
    }

    public void a(abv com_google_android_gms_b_abv, abq com_google_android_gms_b_abq) {
        ((abw) u()).a(com_google_android_gms_b_abv, com_google_android_gms_b_abq);
    }

    protected abw b(IBinder iBinder) {
        return a.a(iBinder);
    }

    protected String i() {
        return "com.google.android.gms.clearcut.service.START";
    }

    protected String j() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
