package com.google.android.gms.common.a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a {
    private static final Object a = new Object();
    private static a b;
    private static Integer h;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private d g;
    private d i;

    private a() {
        if (b()) {
            this.c = Collections.EMPTY_LIST;
            this.d = Collections.EMPTY_LIST;
            this.e = Collections.EMPTY_LIST;
            this.f = Collections.EMPTY_LIST;
            return;
        }
        String str = (String) com.google.android.gms.common.a.b.a.b.a();
        this.c = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) com.google.android.gms.common.a.b.a.c.a();
        this.d = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) com.google.android.gms.common.a.b.a.d.a();
        this.e = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        str = (String) com.google.android.gms.common.a.b.a.e.a();
        this.f = str == null ? Collections.EMPTY_LIST : Arrays.asList(str.split(","));
        this.g = new d(1024, ((Long) com.google.android.gms.common.a.b.a.f.a()).longValue());
        this.i = new d(1024, ((Long) com.google.android.gms.common.a.b.a.f.a()).longValue());
    }

    public static a a() {
        synchronized (a) {
            if (b == null) {
                b = new a();
            }
        }
        return b;
    }

    private boolean a(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        return component == null ? false : b.a(context, component.getPackageName());
    }

    private boolean b() {
        return c() == c.b;
    }

    private static int c() {
        if (h == null) {
            try {
                h = Integer.valueOf(c.b);
            } catch (SecurityException e) {
                h = Integer.valueOf(c.b);
            }
        }
        return h.intValue();
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    public void a(Context context, ServiceConnection serviceConnection, String str, Intent intent) {
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    public boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        if (!a(context, intent)) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
    }
}
