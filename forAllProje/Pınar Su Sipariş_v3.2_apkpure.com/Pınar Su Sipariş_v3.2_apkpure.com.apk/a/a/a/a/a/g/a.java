package a.a.a.a.a.g;

import a.a.a.a.a.b.r;
import a.a.a.a.a.e.c;
import a.a.a.a.a.e.d;
import a.a.a.a.a.e.e;
import a.a.a.a.i;
import a.a.a.a.k;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Locale;

/* compiled from: AbstractAppSpiCall */
abstract class a extends a.a.a.a.a.b.a {
    public a(i iVar, String str, String str2, e eVar, c cVar) {
        super(iVar, str, str2, eVar, cVar);
    }

    public boolean a(d dVar) {
        d b = b(a(getHttpRequest(), dVar), dVar);
        a.a.a.a.c.h().a("Fabric", "Sending app info to " + getUrl());
        if (dVar.j != null) {
            a.a.a.a.c.h().a("Fabric", "App icon hash is " + dVar.j.a);
            a.a.a.a.c.h().a("Fabric", "App icon size is " + dVar.j.c + "x" + dVar.j.d);
        }
        int b2 = b.b();
        a.a.a.a.c.h().a("Fabric", ("POST".equals(b.p()) ? "Create" : "Update") + " app request ID: " + b.b(a.a.a.a.a.b.a.HEADER_REQUEST_ID));
        a.a.a.a.c.h().a("Fabric", "Result was " + b2);
        if (r.a(b2) == 0) {
            return true;
        }
        return false;
    }

    private d a(d dVar, d dVar2) {
        return dVar.a(a.a.a.a.a.b.a.HEADER_API_KEY, dVar2.a).a(a.a.a.a.a.b.a.HEADER_CLIENT_TYPE, a.a.a.a.a.b.a.ANDROID_CLIENT_TYPE).a(a.a.a.a.a.b.a.HEADER_CLIENT_VERSION, this.kit.getVersion());
    }

    private d b(d dVar, d dVar2) {
        d e = dVar.e("app[identifier]", dVar2.b).e("app[name]", dVar2.f).e("app[display_version]", dVar2.c).e("app[build_version]", dVar2.d).a("app[source]", Integer.valueOf(dVar2.g)).e("app[minimum_sdk_version]", dVar2.h).e("app[built_sdk_version]", dVar2.i);
        if (!a.a.a.a.a.b.i.c(dVar2.e)) {
            e.e("app[instance_identifier]", dVar2.e);
        }
        if (dVar2.j != null) {
            Closeable closeable = null;
            try {
                closeable = this.kit.getContext().getResources().openRawResource(dVar2.j.b);
                e.e("app[icon][hash]", dVar2.j.a).a("app[icon][data]", "icon.png", "application/octet-stream", (InputStream) closeable).a("app[icon][width]", Integer.valueOf(dVar2.j.c)).a("app[icon][height]", Integer.valueOf(dVar2.j.d));
            } catch (Throwable e2) {
                a.a.a.a.c.h().e("Fabric", "Failed to find app icon with resource ID: " + dVar2.j.b, e2);
            } finally {
                String str = "Failed to close app icon InputStream.";
                a.a.a.a.a.b.i.a(closeable, str);
            }
        }
        if (dVar2.k != null) {
            for (k kVar : dVar2.k) {
                e.e(a(kVar), kVar.b());
                e.e(b(kVar), kVar.c());
            }
        }
        return e;
    }

    String a(k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][version]", new Object[]{kVar.a()});
    }

    String b(k kVar) {
        return String.format(Locale.US, "app[build][libraries][%s][type]", new Object[]{kVar.a()});
    }
}
