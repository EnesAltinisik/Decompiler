package a.a.a.a.a.g;

import a.a.a.a.a.b.g;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.o;
import a.a.a.a.a.b.s;
import a.a.a.a.a.e.e;
import a.a.a.a.c;
import a.a.a.a.i;
import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Settings */
public class q {
    private final AtomicReference<t> a;
    private final CountDownLatch b;
    private s c;
    private boolean d;

    /* compiled from: Settings */
    static class a {
        private static final q a = new q();
    }

    /* compiled from: Settings */
    public interface b<T> {
        T usingSettings(t tVar);
    }

    public static q a() {
        return a.a;
    }

    private q() {
        this.a = new AtomicReference();
        this.b = new CountDownLatch(1);
        this.d = false;
    }

    public synchronized q a(i iVar, o oVar, e eVar, String str, String str2, String str3) {
        q qVar;
        if (this.d) {
            qVar = this;
        } else {
            if (this.c == null) {
                Context context = iVar.getContext();
                String c = oVar.c();
                String a = new g().a(context);
                String j = oVar.j();
                s sVar = new s();
                k kVar = new k();
                i iVar2 = new i(iVar);
                String k = a.a.a.a.a.b.i.k(context);
                i iVar3 = iVar;
                String str4 = str3;
                l lVar = new l(iVar3, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), eVar);
                j = str2;
                String str5 = str;
                this.c = new j(iVar, new w(a, oVar.g(), oVar.f(), oVar.e(), oVar.m(), oVar.b(), oVar.n(), a.a.a.a.a.b.i.a(a.a.a.a.a.b.i.m(context)), j, str5, l.a(j).a(), k), sVar, kVar, iVar2, lVar);
            }
            this.d = true;
            qVar = this;
        }
        return qVar;
    }

    public <T> T a(b<T> bVar, T t) {
        t tVar = (t) this.a.get();
        return tVar == null ? t : bVar.usingSettings(tVar);
    }

    public t b() {
        try {
            this.b.await();
            return (t) this.a.get();
        } catch (InterruptedException e) {
            c.h().e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    public synchronized boolean c() {
        t a;
        a = this.c.a();
        a(a);
        return a != null;
    }

    public synchronized boolean d() {
        t a;
        a = this.c.a(r.SKIP_CACHE_LOOKUP);
        a(a);
        if (a == null) {
            c.h().e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }

    private void a(t tVar) {
        this.a.set(tVar);
        this.b.countDown();
    }
}
