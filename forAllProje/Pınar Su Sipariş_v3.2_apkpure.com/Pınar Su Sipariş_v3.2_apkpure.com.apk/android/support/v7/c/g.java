package android.support.v7.c;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.ActivityManagerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.drive.FileUploadPreferences;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: MediaRouter */
public final class g {
    static d a;
    private static final boolean d = Log.isLoggable("MediaRouter", 3);
    final Context b;
    final ArrayList<b> c = new ArrayList();

    /* compiled from: MediaRouter */
    public static abstract class a {
        public void onRouteSelected(g gVar, f fVar) {
        }

        public void onRouteUnselected(g gVar, f fVar) {
        }

        public void onRouteAdded(g gVar, f fVar) {
        }

        public void onRouteRemoved(g gVar, f fVar) {
        }

        public void onRouteChanged(g gVar, f fVar) {
        }

        public void onRouteVolumeChanged(g gVar, f fVar) {
        }

        public void onRoutePresentationDisplayChanged(g gVar, f fVar) {
        }

        public void onProviderAdded(g gVar, e eVar) {
        }

        public void onProviderRemoved(g gVar, e eVar) {
        }

        public void onProviderChanged(g gVar, e eVar) {
        }
    }

    /* compiled from: MediaRouter */
    private static final class b {
        public final g a;
        public final a b;
        public f c = f.a;
        public int d;

        public b(g gVar, a aVar) {
            this.a = gVar;
            this.b = aVar;
        }

        public boolean a(f fVar) {
            return (this.d & 2) != 0 || fVar.a(this.c);
        }
    }

    /* compiled from: MediaRouter */
    public static abstract class c {
        public void a(Bundle bundle) {
        }

        public void a(String str, Bundle bundle) {
        }
    }

    /* compiled from: MediaRouter */
    private static final class d implements android.support.v7.c.l.a, android.support.v7.c.n.e {
        private final Context a;
        private final ArrayList<WeakReference<g>> b = new ArrayList();
        private final ArrayList<f> c = new ArrayList();
        private final ArrayList<e> d = new ArrayList();
        private final ArrayList<d> e = new ArrayList();
        private final android.support.v7.c.m.a f = new android.support.v7.c.m.a();
        private final c g = new c();
        private final a h = new a();
        private final android.support.v4.d.a.a i;
        private final n j;
        private final boolean k;
        private l l;
        private f m;
        private f n;
        private android.support.v7.c.c.d o;
        private b p;
        private b q;
        private MediaSessionCompat r;
        private android.support.v4.media.session.MediaSessionCompat.b s = new android.support.v4.media.session.MediaSessionCompat.b(this) {
            final /* synthetic */ d a;

            {
                this.a = r1;
            }
        };

        /* compiled from: MediaRouter */
        private final class a extends Handler {
            final /* synthetic */ d a;
            private final ArrayList<b> b;

            private a(d dVar) {
                this.a = dVar;
                this.b = new ArrayList();
            }

            public void a(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            public void handleMessage(Message message) {
                int i = message.what;
                Object obj = message.obj;
                b(i, obj);
                try {
                    int i2;
                    int size = this.a.b.size();
                    while (true) {
                        i2 = size - 1;
                        if (i2 < 0) {
                            break;
                        }
                        g gVar = (g) ((WeakReference) this.a.b.get(i2)).get();
                        if (gVar == null) {
                            this.a.b.remove(i2);
                        } else {
                            this.b.addAll(gVar.c);
                        }
                        size = i2;
                    }
                    int size2 = this.b.size();
                    for (i2 = 0; i2 < size2; i2++) {
                        a((b) this.b.get(i2), i, obj);
                    }
                } finally {
                    this.b.clear();
                }
            }

            private void b(int i, Object obj) {
                switch (i) {
                    case FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY /*257*/:
                        this.a.j.a((f) obj);
                        return;
                    case 258:
                        this.a.j.b((f) obj);
                        return;
                    case 259:
                        this.a.j.c((f) obj);
                        return;
                    case 262:
                        this.a.j.d((f) obj);
                        return;
                    default:
                        return;
                }
            }

            private void a(b bVar, int i, Object obj) {
                g gVar = bVar.a;
                a aVar = bVar.b;
                switch (65280 & i) {
                    case 256:
                        f fVar = (f) obj;
                        if (bVar.a(fVar)) {
                            switch (i) {
                                case FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY /*257*/:
                                    aVar.onRouteAdded(gVar, fVar);
                                    return;
                                case 258:
                                    aVar.onRouteRemoved(gVar, fVar);
                                    return;
                                case 259:
                                    aVar.onRouteChanged(gVar, fVar);
                                    return;
                                case 260:
                                    aVar.onRouteVolumeChanged(gVar, fVar);
                                    return;
                                case 261:
                                    aVar.onRoutePresentationDisplayChanged(gVar, fVar);
                                    return;
                                case 262:
                                    aVar.onRouteSelected(gVar, fVar);
                                    return;
                                case 263:
                                    aVar.onRouteUnselected(gVar, fVar);
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case 512:
                        e eVar = (e) obj;
                        switch (i) {
                            case 513:
                                aVar.onProviderAdded(gVar, eVar);
                                return;
                            case 514:
                                aVar.onProviderRemoved(gVar, eVar);
                                return;
                            case 515:
                                aVar.onProviderChanged(gVar, eVar);
                                return;
                            default:
                                return;
                        }
                    default:
                        return;
                }
            }
        }

        /* compiled from: MediaRouter */
        private final class b {
            final /* synthetic */ d a;
            private final MediaSessionCompat b;
            private int c;
            private int d;
            private android.support.v4.media.d e;

            public void a(int i, int i2, int i3) {
                if (this.e != null && i == this.c && i2 == this.d) {
                    this.e.a(i3);
                    return;
                }
                this.e = new android.support.v4.media.d(this, i, i2, i3) {
                    final /* synthetic */ b a;

                    public void b(final int i) {
                        this.a.a.h.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void run() {
                                if (this.b.a.a.n != null) {
                                    this.b.a.a.n.a(i);
                                }
                            }
                        });
                    }

                    public void c(final int i) {
                        this.a.a.h.post(new Runnable(this) {
                            final /* synthetic */ AnonymousClass1 b;

                            public void run() {
                                if (this.b.a.a.n != null) {
                                    this.b.a.a.n.b(i);
                                }
                            }
                        });
                    }
                };
                this.b.a(this.e);
            }

            public void a() {
                this.b.a(this.a.f.d);
                this.e = null;
            }

            public Token b() {
                return this.b.a();
            }
        }

        /* compiled from: MediaRouter */
        private final class c extends android.support.v7.c.c.a {
            final /* synthetic */ d a;

            private c(d dVar) {
                this.a = dVar;
            }

            public void a(c cVar, d dVar) {
                this.a.a(cVar, dVar);
            }
        }

        /* compiled from: MediaRouter */
        private final class d {
            final /* synthetic */ d a;
            private final m b;

            public void a() {
                this.b.a(this.a.f);
            }
        }

        d(Context context) {
            this.a = context;
            this.i = android.support.v4.d.a.a.a(context);
            this.k = ActivityManagerCompat.isLowRamDevice((ActivityManager) context.getSystemService("activity"));
            this.j = n.a(context, this);
            a(this.j);
        }

        public void a() {
            this.l = new l(this.a, this);
            this.l.a();
        }

        public g a(Context context) {
            int size = this.b.size();
            while (true) {
                int i = size - 1;
                g gVar;
                if (i >= 0) {
                    gVar = (g) ((WeakReference) this.b.get(i)).get();
                    if (gVar == null) {
                        this.b.remove(i);
                        size = i;
                    } else if (gVar.b == context) {
                        return gVar;
                    } else {
                        size = i;
                    }
                } else {
                    gVar = new g(context);
                    this.b.add(new WeakReference(gVar));
                    return gVar;
                }
            }
        }

        public void a(f fVar, int i) {
            if (fVar == this.n && this.o != null) {
                this.o.b(i);
            }
        }

        public void b(f fVar, int i) {
            if (fVar == this.n && this.o != null) {
                this.o.c(i);
            }
        }

        public List<f> b() {
            return this.c;
        }

        public f c() {
            if (this.m != null) {
                return this.m;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public f d() {
            if (this.n != null) {
                return this.n;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public void a(f fVar) {
            c(fVar, 3);
        }

        public void c(f fVar, int i) {
            if (!this.c.contains(fVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + fVar);
            } else if (fVar.f) {
                d(fVar, i);
            } else {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + fVar);
            }
        }

        public boolean a(f fVar, int i) {
            if (fVar.b()) {
                return false;
            }
            if ((i & 2) == 0 && this.k) {
                return true;
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar2 = (f) this.c.get(i2);
                if (((i & 1) == 0 || !fVar2.f()) && fVar2.a(fVar)) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            android.support.v7.c.f.a aVar = new android.support.v7.c.f.a();
            int size = this.b.size();
            boolean z = false;
            Object obj = null;
            while (true) {
                int i = size - 1;
                if (i < 0) {
                    break;
                }
                g gVar = (g) ((WeakReference) this.b.get(i)).get();
                if (gVar == null) {
                    this.b.remove(i);
                } else {
                    int size2 = gVar.c.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        b bVar = (b) gVar.c.get(i2);
                        aVar.a(bVar.c);
                        if ((bVar.d & 1) != 0) {
                            z = true;
                            obj = 1;
                        }
                        if (!((bVar.d & 4) == 0 || this.k)) {
                            obj = 1;
                        }
                        if ((bVar.d & 8) != 0) {
                            obj = 1;
                        }
                    }
                }
                size = i;
            }
            f a = obj != null ? aVar.a() : f.a;
            if (this.p == null || !this.p.a().equals(a) || this.p.b() != z) {
                if (!a.b() || z) {
                    this.p = new b(a, z);
                } else if (this.p != null) {
                    this.p = null;
                } else {
                    return;
                }
                if (g.d) {
                    Log.d("MediaRouter", "Updated discovery request: " + this.p);
                }
                if (!(obj == null || z || !this.k)) {
                    Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                int size3 = this.d.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((e) this.d.get(i3)).a.a(this.p);
                }
            }
        }

        public void a(c cVar) {
            if (c(cVar) < 0) {
                e eVar = new e(cVar);
                this.d.add(eVar);
                if (g.d) {
                    Log.d("MediaRouter", "Provider added: " + eVar);
                }
                this.h.a(513, eVar);
                a(eVar, cVar.e());
                cVar.a(this.g);
                cVar.a(this.p);
            }
        }

        public void b(c cVar) {
            int c = c(cVar);
            if (c >= 0) {
                cVar.a(null);
                cVar.a(null);
                e eVar = (e) this.d.get(c);
                a(eVar, null);
                if (g.d) {
                    Log.d("MediaRouter", "Provider removed: " + eVar);
                }
                this.h.a(514, eVar);
                this.d.remove(c);
            }
        }

        private void a(c cVar, d dVar) {
            int c = c(cVar);
            if (c >= 0) {
                a((e) this.d.get(c), dVar);
            }
        }

        private int c(c cVar) {
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                if (((e) this.d.get(i)).a == cVar) {
                    return i;
                }
            }
            return -1;
        }

        private void a(e eVar, d dVar) {
            boolean z = false;
            if (eVar.a(dVar)) {
                int i;
                int i2;
                f fVar;
                if (dVar != null) {
                    if (dVar.b()) {
                        List a = dVar.a();
                        int size = a.size();
                        int i3 = 0;
                        i = 0;
                        while (i3 < size) {
                            boolean z2;
                            a aVar = (a) a.get(i3);
                            String a2 = aVar.a();
                            int a3 = eVar.a(a2);
                            if (a3 < 0) {
                                f fVar2 = new f(eVar, a2, a(eVar, a2));
                                i2 = i + 1;
                                eVar.b.add(i, fVar2);
                                this.c.add(fVar2);
                                fVar2.a(aVar);
                                if (g.d) {
                                    Log.d("MediaRouter", "Route added: " + fVar2);
                                }
                                this.h.a(FileUploadPreferences.BATTERY_USAGE_CHARGING_ONLY, fVar2);
                                z2 = z;
                            } else if (a3 < i) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + aVar);
                                z2 = z;
                                i2 = i;
                            } else {
                                f fVar3 = (f) eVar.b.get(a3);
                                int i4 = i + 1;
                                Collections.swap(eVar.b, a3, i);
                                int a4 = fVar3.a(aVar);
                                if (a4 != 0) {
                                    if ((a4 & 1) != 0) {
                                        if (g.d) {
                                            Log.d("MediaRouter", "Route changed: " + fVar3);
                                        }
                                        this.h.a(259, fVar3);
                                    }
                                    if ((a4 & 2) != 0) {
                                        if (g.d) {
                                            Log.d("MediaRouter", "Route volume changed: " + fVar3);
                                        }
                                        this.h.a(260, fVar3);
                                    }
                                    if ((a4 & 4) != 0) {
                                        if (g.d) {
                                            Log.d("MediaRouter", "Route presentation display changed: " + fVar3);
                                        }
                                        this.h.a(261, fVar3);
                                    }
                                    if (fVar3 == this.n) {
                                        z2 = true;
                                        i2 = i4;
                                    }
                                }
                                z2 = z;
                                i2 = i4;
                            }
                            i3++;
                            i = i2;
                            z = z2;
                        }
                        for (i2 = eVar.b.size() - 1; i2 >= i; i2--) {
                            fVar = (f) eVar.b.get(i2);
                            fVar.a(null);
                            this.c.remove(fVar);
                        }
                        a(z);
                        for (i2 = eVar.b.size() - 1; i2 >= i; i2--) {
                            fVar = (f) eVar.b.remove(i2);
                            if (g.d) {
                                Log.d("MediaRouter", "Route removed: " + fVar);
                            }
                            this.h.a(258, fVar);
                        }
                        if (g.d) {
                            Log.d("MediaRouter", "Provider changed: " + eVar);
                        }
                        this.h.a(515, eVar);
                    }
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + dVar);
                }
                i = 0;
                for (i2 = eVar.b.size() - 1; i2 >= i; i2--) {
                    fVar = (f) eVar.b.get(i2);
                    fVar.a(null);
                    this.c.remove(fVar);
                }
                a(z);
                for (i2 = eVar.b.size() - 1; i2 >= i; i2--) {
                    fVar = (f) eVar.b.remove(i2);
                    if (g.d) {
                        Log.d("MediaRouter", "Route removed: " + fVar);
                    }
                    this.h.a(258, fVar);
                }
                if (g.d) {
                    Log.d("MediaRouter", "Provider changed: " + eVar);
                }
                this.h.a(515, eVar);
            }
        }

        private String a(e eVar, String str) {
            String str2 = eVar.c().flattenToShortString() + ":" + str;
            if (b(str2) < 0) {
                return str2;
            }
            int i = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", new Object[]{str2, Integer.valueOf(i)});
                if (b(format) < 0) {
                    return format;
                }
                i++;
            }
        }

        private int b(String str) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                if (((f) this.c.get(i)).c.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private void a(boolean z) {
            if (!(this.m == null || c(this.m))) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.m);
                this.m = null;
            }
            if (this.m == null && !this.c.isEmpty()) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (d(fVar) && c(fVar)) {
                        this.m = fVar;
                        Log.i("MediaRouter", "Found default route: " + this.m);
                        break;
                    }
                }
            }
            if (!(this.n == null || c(this.n))) {
                Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.n);
                d(null, 0);
            }
            if (this.n == null) {
                d(g(), 0);
            } else if (z) {
                h();
            }
        }

        private f g() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                if (fVar != this.m && b(fVar) && c(fVar)) {
                    return fVar;
                }
            }
            return this.m;
        }

        private boolean b(f fVar) {
            return fVar.q() == this.j && fVar.a("android.media.intent.category.LIVE_AUDIO") && !fVar.a("android.media.intent.category.LIVE_VIDEO");
        }

        private boolean c(f fVar) {
            return fVar.s != null && fVar.f;
        }

        private boolean d(f fVar) {
            return fVar.q() == this.j && fVar.b.equals("DEFAULT_ROUTE");
        }

        private void d(f fVar, int i) {
            if (this.n != fVar) {
                if (this.n != null) {
                    if (g.d) {
                        Log.d("MediaRouter", "Route unselected: " + this.n + " reason: " + i);
                    }
                    this.h.a(263, this.n);
                    if (this.o != null) {
                        this.o.a(i);
                        this.o.a();
                        this.o = null;
                    }
                }
                this.n = fVar;
                if (this.n != null) {
                    this.o = fVar.q().a(fVar.b);
                    if (this.o != null) {
                        this.o.b();
                    }
                    if (g.d) {
                        Log.d("MediaRouter", "Route selected: " + this.n);
                    }
                    this.h.a(262, this.n);
                }
                h();
            }
        }

        public f a(String str) {
            int c = c(this.j);
            if (c >= 0) {
                e eVar = (e) this.d.get(c);
                int a = eVar.a(str);
                if (a >= 0) {
                    return (f) eVar.b.get(a);
                }
            }
            return null;
        }

        public Token f() {
            if (this.q != null) {
                return this.q.b();
            }
            if (this.r != null) {
                return this.r.a();
            }
            return null;
        }

        private void h() {
            if (this.n != null) {
                this.f.a = this.n.j();
                this.f.b = this.n.k();
                this.f.c = this.n.i();
                this.f.d = this.n.h();
                this.f.e = this.n.g();
                int size = this.e.size();
                for (int i = 0; i < size; i++) {
                    ((d) this.e.get(i)).a();
                }
                if (this.q == null) {
                    return;
                }
                if (this.n == c()) {
                    this.q.a();
                    return;
                }
                int i2;
                if (this.f.c == 1) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                this.q.a(i2, this.f.b, this.f.a);
            } else if (this.q != null) {
                this.q.a();
            }
        }
    }

    /* compiled from: MediaRouter */
    public static final class e {
        private final c a;
        private final ArrayList<f> b = new ArrayList();
        private final android.support.v7.c.c.c c;
        private d d;

        e(c cVar) {
            this.a = cVar;
            this.c = cVar.c();
        }

        public c a() {
            g.e();
            return this.a;
        }

        public String b() {
            return this.c.a();
        }

        public ComponentName c() {
            return this.c.b();
        }

        boolean a(d dVar) {
            if (this.d == dVar) {
                return false;
            }
            this.d = dVar;
            return true;
        }

        int a(String str) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                if (((f) this.b.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + b() + " }";
        }
    }

    /* compiled from: MediaRouter */
    public static final class f {
        private final e a;
        private final String b;
        private final String c;
        private String d;
        private String e;
        private boolean f;
        private boolean g;
        private boolean h;
        private final ArrayList<IntentFilter> i = new ArrayList();
        private int j;
        private int k;
        private int l;
        private int m;
        private int n;
        private Display o;
        private int p = -1;
        private Bundle q;
        private IntentSender r;
        private a s;

        f(e eVar, String str, String str2) {
            this.a = eVar;
            this.b = str;
            this.c = str2;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.e;
        }

        public boolean c() {
            return this.f;
        }

        public boolean d() {
            return this.g;
        }

        public boolean e() {
            g.e();
            return g.a.d() == this;
        }

        public boolean f() {
            g.e();
            return g.a.c() == this;
        }

        public boolean a(f fVar) {
            if (fVar == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            g.e();
            return fVar.a(this.i);
        }

        public boolean a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            g.e();
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                if (((IntentFilter) this.i.get(i)).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public int g() {
            return this.j;
        }

        public int h() {
            return this.k;
        }

        public int i() {
            return this.l;
        }

        public int j() {
            return this.m;
        }

        public int k() {
            return this.n;
        }

        public boolean l() {
            return this.h;
        }

        public void a(int i) {
            g.e();
            g.a.a(this, Math.min(this.n, Math.max(0, i)));
        }

        public void b(int i) {
            g.e();
            if (i != 0) {
                g.a.b(this, i);
            }
        }

        public Bundle m() {
            return this.q;
        }

        public IntentSender n() {
            return this.r;
        }

        public void o() {
            g.e();
            g.a.a(this);
        }

        public String toString() {
            return "MediaRouter.RouteInfo{ uniqueId=" + this.c + ", name=" + this.d + ", description=" + this.e + ", enabled=" + this.f + ", connecting=" + this.g + ", canDisconnect=" + this.h + ", playbackType=" + this.j + ", playbackStream=" + this.k + ", volumeHandling=" + this.l + ", volume=" + this.m + ", volumeMax=" + this.n + ", presentationDisplayId=" + this.p + ", extras=" + this.q + ", settingsIntent=" + this.r + ", providerPackageName=" + this.a.b() + " }";
        }

        int a(a aVar) {
            int i = 0;
            if (this.s == aVar) {
                return 0;
            }
            this.s = aVar;
            if (aVar == null) {
                return 0;
            }
            if (!g.a(this.d, aVar.b())) {
                this.d = aVar.b();
                i = 1;
            }
            if (!g.a(this.e, aVar.c())) {
                this.e = aVar.c();
                i |= 1;
            }
            if (this.f != aVar.d()) {
                this.f = aVar.d();
                i |= 1;
            }
            if (this.g != aVar.e()) {
                this.g = aVar.e();
                i |= 1;
            }
            if (!this.i.equals(aVar.h())) {
                this.i.clear();
                this.i.addAll(aVar.h());
                i |= 1;
            }
            if (this.j != aVar.i()) {
                this.j = aVar.i();
                i |= 1;
            }
            if (this.k != aVar.j()) {
                this.k = aVar.j();
                i |= 1;
            }
            if (this.l != aVar.m()) {
                this.l = aVar.m();
                i |= 3;
            }
            if (this.m != aVar.k()) {
                this.m = aVar.k();
                i |= 3;
            }
            if (this.n != aVar.l()) {
                this.n = aVar.l();
                i |= 3;
            }
            if (this.p != aVar.n()) {
                this.p = aVar.n();
                this.o = null;
                i |= 5;
            }
            if (!g.a(this.q, aVar.o())) {
                this.q = aVar.o();
                i |= 1;
            }
            if (!g.a(this.r, aVar.g())) {
                this.r = aVar.g();
                i |= 1;
            }
            if (this.h == aVar.f()) {
                return i;
            }
            this.h = aVar.f();
            return i | 5;
        }

        String p() {
            return this.b;
        }

        c q() {
            return this.a.a();
        }
    }

    g(Context context) {
        this.b = context;
    }

    public static g a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        e();
        if (a == null) {
            a = new d(context.getApplicationContext());
            a.a();
        }
        return a.a(context);
    }

    public List<f> a() {
        e();
        return a.b();
    }

    public f b() {
        e();
        return a.c();
    }

    public f c() {
        e();
        return a.d();
    }

    public void a(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        e();
        if (d) {
            Log.d("MediaRouter", "selectRoute: " + fVar);
        }
        a.a(fVar);
    }

    public void a(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        e();
        a.c(b(), i);
    }

    public boolean a(f fVar, int i) {
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        e();
        return a.a(fVar, i);
    }

    public void a(f fVar, a aVar) {
        a(fVar, aVar, 0);
    }

    public void a(f fVar, a aVar, int i) {
        Object obj = 1;
        if (fVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else {
            b bVar;
            e();
            if (d) {
                Log.d("MediaRouter", "addCallback: selector=" + fVar + ", callback=" + aVar + ", flags=" + Integer.toHexString(i));
            }
            int b = b(aVar);
            if (b < 0) {
                bVar = new b(this, aVar);
                this.c.add(bVar);
            } else {
                bVar = (b) this.c.get(b);
            }
            Object obj2 = null;
            if (((bVar.d ^ -1) & i) != 0) {
                bVar.d |= i;
                obj2 = 1;
            }
            if (bVar.c.a(fVar)) {
                obj = obj2;
            } else {
                bVar.c = new android.support.v7.c.f.a(bVar.c).a(fVar).a();
            }
            if (obj != null) {
                a.e();
            }
        }
    }

    public void a(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        e();
        if (d) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int b = b(aVar);
        if (b >= 0) {
            this.c.remove(b);
            a.e();
        }
    }

    private int b(a aVar) {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.c.get(i)).b == aVar) {
                return i;
            }
        }
        return -1;
    }

    public Token d() {
        return a.f();
    }

    static void e() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    static <T> boolean a(T t, T t2) {
        return t == t2 || !(t == null || t2 == null || !t.equals(t2));
    }
}
