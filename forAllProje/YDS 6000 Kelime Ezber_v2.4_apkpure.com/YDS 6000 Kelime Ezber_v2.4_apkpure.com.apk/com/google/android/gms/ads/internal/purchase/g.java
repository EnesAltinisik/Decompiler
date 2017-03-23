package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.uz.a;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zy;

@vz
public final class g extends a implements ServiceConnection {
    b a;
    private boolean b = false;
    private Context c;
    private int d;
    private Intent e;
    private f f;
    private String g;

    public g(Context context, String str, boolean z, int i, Intent intent, f fVar) {
        this.g = str;
        this.d = i;
        this.e = intent;
        this.b = z;
        this.c = context;
        this.f = fVar;
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        return this.g;
    }

    public Intent c() {
        return this.e;
    }

    public int d() {
        return this.d;
    }

    public void e() {
        int a = v.s().a(this.e);
        if (this.d == -1 && a == 0) {
            this.a = new b(this.c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.a.a.a().a(this.c, intent, (ServiceConnection) this, 1);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zy.d("In-app billing service connected.");
        this.a.a(iBinder);
        String b = v.s().b(v.s().b(this.e));
        if (b != null) {
            if (this.a.a(this.c.getPackageName(), b) == 0) {
                h.a(this.c).a(this.f);
            }
            com.google.android.gms.common.a.a.a().a(this.c, (ServiceConnection) this);
            this.a.a();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zy.d("In-app billing service disconnected.");
        this.a.a();
    }
}
