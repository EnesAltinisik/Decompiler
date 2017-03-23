package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.va;
import com.google.android.gms.b.vz;
import com.google.android.gms.b.zd;
import com.google.android.gms.b.ze;
import com.google.android.gms.b.zi;
import com.google.android.gms.b.zy;
import com.google.android.gms.common.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@vz
public class c extends zd implements ServiceConnection {
    private final Object a;
    private boolean b;
    private Context c;
    private va d;
    private b e;
    private h f;
    private List<f> g;
    private k h;

    public c(Context context, va vaVar, k kVar) {
        this(context, vaVar, kVar, new b(context), h.a(context.getApplicationContext()));
    }

    c(Context context, va vaVar, k kVar, b bVar, h hVar) {
        this.a = new Object();
        this.b = false;
        this.g = null;
        this.c = context;
        this.d = vaVar;
        this.h = kVar;
        this.e = bVar;
        this.f = hVar;
        this.g = this.f.a(10);
    }

    private void a(long j) {
        do {
            if (!b(j)) {
                ze.a("Timeout waiting for pending transaction to be processed.");
            }
        } while (!this.b);
    }

    private boolean b(long j) {
        long elapsedRealtime = 60000 - (SystemClock.elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            return false;
        }
        try {
            this.a.wait(elapsedRealtime);
        } catch (InterruptedException e) {
            zy.e("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void a() {
        synchronized (this.a) {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            a.a().a(this.c, intent, (ServiceConnection) this, 1);
            a(SystemClock.elapsedRealtime());
            a.a().a(this.c, (ServiceConnection) this);
            this.e.a();
        }
    }

    protected void a(final f fVar, String str, String str2) {
        final Intent intent = new Intent();
        v.s();
        intent.putExtra("RESPONSE_CODE", 0);
        v.s();
        intent.putExtra("INAPP_PURCHASE_DATA", str);
        v.s();
        intent.putExtra("INAPP_DATA_SIGNATURE", str2);
        zi.a.post(new Runnable(this) {
            final /* synthetic */ c c;

            public void run() {
                try {
                    if (this.c.h.a(fVar.b, -1, intent)) {
                        this.c.d.a(new g(this.c.c, fVar.c, true, -1, intent, fVar));
                    } else {
                        this.c.d.a(new g(this.c.c, fVar.c, false, -1, intent, fVar));
                    }
                } catch (RemoteException e) {
                    zy.e("Fail to verify and dispatch pending transaction");
                }
            }
        });
    }

    public void b() {
        synchronized (this.a) {
            a.a().a(this.c, (ServiceConnection) this);
            this.e.a();
        }
    }

    protected void c() {
        if (!this.g.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (f fVar : this.g) {
                hashMap.put(fVar.c, fVar);
            }
            String str = null;
            while (true) {
                Bundle b = this.e.b(this.c.getPackageName(), str);
                if (b == null || v.s().a(b) != 0) {
                    break;
                }
                ArrayList stringArrayList = b.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList stringArrayList2 = b.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList stringArrayList3 = b.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                String string = b.getString("INAPP_CONTINUATION_TOKEN");
                for (int i = 0; i < stringArrayList.size(); i++) {
                    if (hashMap.containsKey(stringArrayList.get(i))) {
                        str = (String) stringArrayList.get(i);
                        String str2 = (String) stringArrayList2.get(i);
                        String str3 = (String) stringArrayList3.get(i);
                        f fVar2 = (f) hashMap.get(str);
                        if (fVar2.b.equals(v.s().a(str2))) {
                            a(fVar2, str2, str3);
                            hashMap.remove(str);
                        }
                    }
                }
                if (string == null || hashMap.isEmpty()) {
                    break;
                }
                str = string;
            }
            for (String str4 : hashMap.keySet()) {
                this.f.a((f) hashMap.get(str4));
            }
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.a) {
            this.e.a(iBinder);
            c();
            this.b = true;
            this.a.notify();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        zy.d("In-app billing service disconnected.");
        this.e.a();
    }
}
