package android.support.v7.c;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: RegisteredMediaRouteProviderWatcher */
final class l {
    private final Context a;
    private final a b;
    private final Handler c;
    private final PackageManager d;
    private final ArrayList<k> e = new ArrayList();
    private boolean f;
    private final BroadcastReceiver g = new BroadcastReceiver(this) {
        final /* synthetic */ l a;

        {
            this.a = r1;
        }

        public void onReceive(Context context, Intent intent) {
            this.a.b();
        }
    };
    private final Runnable h = new Runnable(this) {
        final /* synthetic */ l a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.b();
        }
    };

    /* compiled from: RegisteredMediaRouteProviderWatcher */
    public interface a {
        void a(c cVar);

        void b(c cVar);
    }

    public l(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
        this.c = new Handler();
        this.d = context.getPackageManager();
    }

    public void a() {
        if (!this.f) {
            this.f = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
            intentFilter.addDataScheme("package");
            this.a.registerReceiver(this.g, intentFilter, null, this.c);
            this.c.post(this.h);
        }
    }

    private void b() {
        if (this.f) {
            k kVar;
            int i = 0;
            for (ResolveInfo resolveInfo : this.d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0)) {
                int i2;
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    int a = a(serviceInfo.packageName, serviceInfo.name);
                    if (a < 0) {
                        c kVar2 = new k(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        kVar2.f();
                        i2 = i + 1;
                        this.e.add(i, kVar2);
                        this.b.a(kVar2);
                    } else if (a >= i) {
                        kVar = (k) this.e.get(a);
                        kVar.f();
                        kVar.h();
                        i2 = i + 1;
                        Collections.swap(this.e, a, i);
                    }
                    i = i2;
                }
                i2 = i;
                i = i2;
            }
            if (i < this.e.size()) {
                for (int size = this.e.size() - 1; size >= i; size--) {
                    kVar = (k) this.e.get(size);
                    this.b.b(kVar);
                    this.e.remove(kVar);
                    kVar.g();
                }
            }
        }
    }

    private int a(String str, String str2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            if (((k) this.e.get(i)).a(str, str2)) {
                return i;
            }
        }
        return -1;
    }
}
