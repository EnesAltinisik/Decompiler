package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.c;

class cq extends BroadcastReceiver {
    static final String a = cq.class.getName();
    private final cv b;
    private boolean c;
    private boolean d;

    cq(cv cvVar) {
        c.a((Object) cvVar);
        this.b = cvVar;
    }

    private Context d() {
        return this.b.s();
    }

    private co e() {
        return this.b.f();
    }

    public void a() {
        this.b.a();
        this.b.C();
        if (!this.c) {
            d().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = this.b.r().x();
            e().D().a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.d));
            this.c = true;
        }
    }

    public void b() {
        this.b.a();
        this.b.C();
        if (c()) {
            e().D().a("Unregistering connectivity change receiver");
            this.c = false;
            this.d = false;
            try {
                d().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                e().x().a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    public boolean c() {
        this.b.C();
        return this.c;
    }

    public void onReceive(Context context, Intent intent) {
        this.b.a();
        String action = intent.getAction();
        e().D().a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean x = this.b.r().x();
            if (this.d != x) {
                this.d = x;
                this.b.h().a(new Runnable(this) {
                    final /* synthetic */ cq b;

                    public void run() {
                        this.b.b.a(x);
                    }
                });
                return;
            }
            return;
        }
        e().z().a("NetworkBroadcastReceiver received unknown action", action);
    }
}
