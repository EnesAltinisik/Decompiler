package a.a.a.a;

import a.a.a.a.a.b.g;
import a.a.a.a.a.b.i;
import a.a.a.a.a.b.l;
import a.a.a.a.a.e.b;
import a.a.a.a.a.e.e;
import a.a.a.a.a.g.d;
import a.a.a.a.a.g.h;
import a.a.a.a.a.g.n;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.t;
import a.a.a.a.a.g.y;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import retrofit.mime.MultipartTypedOutput;

/* compiled from: Onboarding */
class m extends i<Boolean> {
    private final e a = new b();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private final Future<Map<String, k>> j;
    private final Collection<i> k;

    protected /* synthetic */ Object doInBackground() {
        return a();
    }

    public m(Future<Map<String, k>> future, Collection<i> collection) {
        this.j = future;
        this.k = collection;
    }

    public String getVersion() {
        return "1.3.10.97";
    }

    protected boolean onPreExecute() {
        try {
            this.g = getIdManager().j();
            this.b = getContext().getPackageManager();
            this.c = getContext().getPackageName();
            this.d = this.b.getPackageInfo(this.c, 0);
            this.e = Integer.toString(this.d.versionCode);
            this.f = this.d.versionName == null ? "0.0" : this.d.versionName;
            this.h = this.b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.i = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (Throwable e) {
            c.h().e("Fabric", "Failed init", e);
            return false;
        }
    }

    protected Boolean a() {
        boolean a;
        String k = i.k(getContext());
        t c = c();
        if (c != null) {
            try {
                Map map;
                if (this.j != null) {
                    map = (Map) this.j.get();
                } else {
                    map = new HashMap();
                }
                a = a(k, c.a, a(map, this.k).values());
            } catch (Throwable e) {
                c.h().e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(a);
        }
        a = false;
        return Boolean.valueOf(a);
    }

    private t c() {
        try {
            q.a().a(this, this.idManager, this.a, this.e, this.f, b()).c();
            return q.a().b();
        } catch (Throwable e) {
            c.h().e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    Map<String, k> a(Map<String, k> map, Collection<i> collection) {
        for (i iVar : collection) {
            if (!map.containsKey(iVar.getIdentifier())) {
                map.put(iVar.getIdentifier(), new k(iVar.getIdentifier(), iVar.getVersion(), MultipartTypedOutput.DEFAULT_TRANSFER_ENCODING));
            }
        }
        return map;
    }

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    private boolean a(String str, a.a.a.a.a.g.e eVar, Collection<k> collection) {
        if ("new".equals(eVar.b)) {
            if (b(str, eVar, collection)) {
                return q.a().d();
            }
            c.h().e("Fabric", "Failed to create app with Crashlytics service.", null);
            return false;
        } else if ("configured".equals(eVar.b)) {
            return q.a().d();
        } else {
            if (!eVar.e) {
                return true;
            }
            c.h().a("Fabric", "Server says an update is required - forcing a full App update.");
            c(str, eVar, collection);
            return true;
        }
    }

    private boolean b(String str, a.a.a.a.a.g.e eVar, Collection<k> collection) {
        return new h(this, b(), eVar.c, this.a).a(a(n.a(getContext(), str), (Collection) collection));
    }

    private boolean c(String str, a.a.a.a.a.g.e eVar, Collection<k> collection) {
        return a(eVar, n.a(getContext(), str), (Collection) collection);
    }

    private boolean a(a.a.a.a.a.g.e eVar, n nVar, Collection<k> collection) {
        return new y(this, b(), eVar.c, this.a).a(a(nVar, (Collection) collection));
    }

    private d a(n nVar, Collection<k> collection) {
        return new d(new g().a(getContext()), getIdManager().c(), this.f, this.e, i.a(i.m(r0)), this.h, l.a(this.g).a(), this.i, "0", nVar, collection);
    }

    String b() {
        return i.b(getContext(), "com.crashlytics.ApiEndpoint");
    }
}
