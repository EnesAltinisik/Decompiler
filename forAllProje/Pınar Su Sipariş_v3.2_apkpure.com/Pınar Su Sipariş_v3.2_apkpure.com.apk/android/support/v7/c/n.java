package android.support.v7.c;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.support.v7.c.g.f;
import android.support.v7.c.h.g;
import android.view.Display;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemMediaRouteProvider */
abstract class n extends c {

    /* compiled from: SystemMediaRouteProvider */
    public interface e {
        f a(String str);
    }

    /* compiled from: SystemMediaRouteProvider */
    static class a extends n implements android.support.v7.c.h.a, g {
        private static final ArrayList<IntentFilter> j = new ArrayList();
        private static final ArrayList<IntentFilter> k = new ArrayList();
        protected final Object a;
        protected final Object b;
        protected final Object c;
        protected final Object d;
        protected int e;
        protected boolean f;
        protected boolean g;
        protected final ArrayList<b> h = new ArrayList();
        protected final ArrayList<c> i = new ArrayList();
        private final e l;
        private android.support.v7.c.h.e m;
        private android.support.v7.c.h.c n;

        /* compiled from: SystemMediaRouteProvider */
        protected final class a extends android.support.v7.c.c.d {
            final /* synthetic */ a a;
            private final Object b;

            public a(a aVar, Object obj) {
                this.a = aVar;
                this.b = obj;
            }

            public void b(int i) {
                android.support.v7.c.h.d.a(this.b, i);
            }

            public void c(int i) {
                android.support.v7.c.h.d.b(this.b, i);
            }
        }

        /* compiled from: SystemMediaRouteProvider */
        protected static final class b {
            public final Object a;
            public final String b;
            public a c;

            public b(Object obj, String str) {
                this.a = obj;
                this.b = str;
            }
        }

        /* compiled from: SystemMediaRouteProvider */
        protected static final class c {
            public final f a;
            public final Object b;

            public c(f fVar, Object obj) {
                this.a = fVar;
                this.b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            j.add(intentFilter);
            intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            k.add(intentFilter);
        }

        public a(Context context, e eVar) {
            super(context);
            this.l = eVar;
            this.a = h.a(context);
            this.b = h();
            this.c = i();
            this.d = h.a(this.a, context.getResources().getString(android.support.v7.d.a.d.mr_user_route_category_name), false);
            k();
        }

        public android.support.v7.c.c.d a(String str) {
            int b = b(str);
            if (b >= 0) {
                return new a(this, ((b) this.h.get(b)).a);
            }
            return null;
        }

        public void b(b bVar) {
            int i;
            boolean z = false;
            if (bVar != null) {
                List a = bVar.a().a();
                int size = a.size();
                int i2 = 0;
                i = 0;
                while (i2 < size) {
                    int i3;
                    String str = (String) a.get(i2);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i3 = i | 1;
                    } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        i3 = i | 2;
                    } else {
                        i3 = 8388608 | i;
                    }
                    i2++;
                    i = i3;
                }
                z = bVar.b();
            } else {
                i = 0;
            }
            if (this.e != i || this.f != z) {
                this.e = i;
                this.f = z;
                g();
                k();
            }
        }

        public void a(Object obj) {
            if (e(obj)) {
                f();
            }
        }

        private void k() {
            int i = 0;
            for (Object e : h.a(this.a)) {
                i |= e(e);
            }
            if (i != 0) {
                f();
            }
        }

        private boolean e(Object obj) {
            if (g(obj) != null || f(obj) >= 0) {
                return false;
            }
            b bVar = new b(obj, j(obj));
            a(bVar);
            this.h.add(bVar);
            return true;
        }

        private String j(Object obj) {
            String format = (j() == obj ? 1 : 0) != 0 ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(h(obj).hashCode())});
            if (b(format) < 0) {
                return format;
            }
            int i = 2;
            while (true) {
                String format2 = String.format(Locale.US, "%s_%d", new Object[]{format, Integer.valueOf(i)});
                if (b(format2) < 0) {
                    return format2;
                }
                i++;
            }
        }

        public void b(Object obj) {
            if (g(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    this.h.remove(f);
                    f();
                }
            }
        }

        public void c(Object obj) {
            if (g(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    a((b) this.h.get(f));
                    f();
                }
            }
        }

        public void d(Object obj) {
            if (g(obj) == null) {
                int f = f(obj);
                if (f >= 0) {
                    b bVar = (b) this.h.get(f);
                    int d = android.support.v7.c.h.d.d(obj);
                    if (d != bVar.c.k()) {
                        bVar.c = new android.support.v7.c.a.a(bVar.c).c(d).a();
                        f();
                    }
                }
            }
        }

        public void a(int i, Object obj) {
            if (obj == h.a(this.a, 8388611)) {
                c g = g(obj);
                if (g != null) {
                    g.a.o();
                    return;
                }
                int f = f(obj);
                if (f >= 0) {
                    f a = this.l.a(((b) this.h.get(f)).b);
                    if (a != null) {
                        a.o();
                    }
                }
            }
        }

        public void b(int i, Object obj) {
        }

        public void a(Object obj, Object obj2, int i) {
        }

        public void a(Object obj, Object obj2) {
        }

        public void a(Object obj, int i) {
            c g = g(obj);
            if (g != null) {
                g.a.a(i);
            }
        }

        public void b(Object obj, int i) {
            c g = g(obj);
            if (g != null) {
                g.a.b(i);
            }
        }

        public void a(f fVar) {
            if (fVar.q() != this) {
                Object b = h.b(this.a, this.d);
                c cVar = new c(fVar, b);
                android.support.v7.c.h.d.a(b, (Object) cVar);
                h.f.a(b, this.c);
                a(cVar);
                this.i.add(cVar);
                h.c(this.a, b);
                return;
            }
            int f = f(h.a(this.a, 8388611));
            if (f >= 0 && ((b) this.h.get(f)).b.equals(fVar.p())) {
                fVar.o();
            }
        }

        public void b(f fVar) {
            if (fVar.q() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    c cVar = (c) this.i.remove(e);
                    android.support.v7.c.h.d.a(cVar.b, null);
                    h.f.a(cVar.b, null);
                    h.d(this.a, cVar.b);
                }
            }
        }

        public void c(f fVar) {
            if (fVar.q() != this) {
                int e = e(fVar);
                if (e >= 0) {
                    a((c) this.i.get(e));
                }
            }
        }

        public void d(f fVar) {
            if (!fVar.e()) {
                return;
            }
            int e;
            if (fVar.q() != this) {
                e = e(fVar);
                if (e >= 0) {
                    i(((c) this.i.get(e)).b);
                    return;
                }
                return;
            }
            e = b(fVar.p());
            if (e >= 0) {
                i(((b) this.h.get(e)).a);
            }
        }

        protected void f() {
            android.support.v7.c.d.a aVar = new android.support.v7.c.d.a();
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                aVar.a(((b) this.h.get(i)).c);
            }
            a(aVar.a());
        }

        protected int f(Object obj) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                if (((b) this.h.get(i)).a == obj) {
                    return i;
                }
            }
            return -1;
        }

        protected int b(String str) {
            int size = this.h.size();
            for (int i = 0; i < size; i++) {
                if (((b) this.h.get(i)).b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        protected int e(f fVar) {
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                if (((c) this.i.get(i)).a == fVar) {
                    return i;
                }
            }
            return -1;
        }

        protected c g(Object obj) {
            Object g = android.support.v7.c.h.d.g(obj);
            return g instanceof c ? (c) g : null;
        }

        protected void a(b bVar) {
            android.support.v7.c.a.a aVar = new android.support.v7.c.a.a(bVar.b, h(bVar.a));
            a(bVar, aVar);
            bVar.c = aVar.a();
        }

        protected String h(Object obj) {
            CharSequence a = android.support.v7.c.h.d.a(obj, a());
            return a != null ? a.toString() : "";
        }

        protected void a(b bVar, android.support.v7.c.a.a aVar) {
            int a = android.support.v7.c.h.d.a(bVar.a);
            if ((a & 1) != 0) {
                aVar.a(j);
            }
            if ((a & 2) != 0) {
                aVar.a(k);
            }
            aVar.a(android.support.v7.c.h.d.b(bVar.a));
            aVar.b(android.support.v7.c.h.d.c(bVar.a));
            aVar.c(android.support.v7.c.h.d.d(bVar.a));
            aVar.d(android.support.v7.c.h.d.e(bVar.a));
            aVar.e(android.support.v7.c.h.d.f(bVar.a));
        }

        protected void a(c cVar) {
            h.f.a(cVar.b, cVar.a.a());
            h.f.a(cVar.b, cVar.a.g());
            h.f.b(cVar.b, cVar.a.h());
            h.f.c(cVar.b, cVar.a.j());
            h.f.d(cVar.b, cVar.a.k());
            h.f.e(cVar.b, cVar.a.i());
        }

        protected void g() {
            if (this.g) {
                this.g = false;
                h.a(this.a, this.b);
            }
            if (this.e != 0) {
                this.g = true;
                h.b(this.a, this.e, this.b);
            }
        }

        protected Object h() {
            return h.a((android.support.v7.c.h.a) this);
        }

        protected Object i() {
            return h.a((g) this);
        }

        protected void i(Object obj) {
            if (this.m == null) {
                this.m = new android.support.v7.c.h.e();
            }
            this.m.a(this.a, 8388611, obj);
        }

        protected Object j() {
            if (this.n == null) {
                this.n = new android.support.v7.c.h.c();
            }
            return this.n.a(this.a);
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    private static class b extends a implements android.support.v7.c.i.b {
        private android.support.v7.c.i.a j;
        private android.support.v7.c.i.d k;

        public b(Context context, e eVar) {
            super(context, eVar);
        }

        public void e(Object obj) {
            int f = f(obj);
            if (f >= 0) {
                b bVar = (b) this.h.get(f);
                Display b = android.support.v7.c.i.e.b(obj);
                int displayId = b != null ? b.getDisplayId() : -1;
                if (displayId != bVar.c.n()) {
                    bVar.c = new android.support.v7.c.a.a(bVar.c).f(displayId).a();
                    f();
                }
            }
        }

        protected void a(b bVar, android.support.v7.c.a.a aVar) {
            super.a(bVar, aVar);
            if (!android.support.v7.c.i.e.a(bVar.a)) {
                aVar.a(false);
            }
            if (b(bVar)) {
                aVar.b(true);
            }
            Display b = android.support.v7.c.i.e.b(bVar.a);
            if (b != null) {
                aVar.f(b.getDisplayId());
            }
        }

        protected void g() {
            super.g();
            if (this.j == null) {
                this.j = new android.support.v7.c.i.a(a(), b());
            }
            this.j.a(this.f ? this.e : 0);
        }

        protected Object h() {
            return i.a(this);
        }

        protected boolean b(b bVar) {
            if (this.k == null) {
                this.k = new android.support.v7.c.i.d();
            }
            return this.k.a(bVar.a);
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    private static class c extends b {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        protected void a(b bVar, android.support.v7.c.a.a aVar) {
            super.a(bVar, aVar);
            CharSequence a = android.support.v7.c.j.a.a(bVar.a);
            if (a != null) {
                aVar.c(a.toString());
            }
        }

        protected void i(Object obj) {
            h.a(this.a, 8388611, obj);
        }

        protected Object j() {
            return j.a(this.a);
        }

        protected void a(c cVar) {
            super.a(cVar);
            android.support.v7.c.j.b.a(cVar.b, cVar.a.b());
        }

        protected void g() {
            int i = 1;
            if (this.g) {
                h.a(this.a, this.b);
            }
            this.g = true;
            Object obj = this.a;
            int i2 = this.e;
            Object obj2 = this.b;
            if (!this.f) {
                i = 0;
            }
            j.a(obj, i2, obj2, i | 2);
        }

        protected boolean b(b bVar) {
            return android.support.v7.c.j.a.b(bVar.a);
        }
    }

    /* compiled from: SystemMediaRouteProvider */
    static class d extends n {
        private static final ArrayList<IntentFilter> a = new ArrayList();
        private final AudioManager b;
        private final b c;
        private int d = -1;

        /* compiled from: SystemMediaRouteProvider */
        final class a extends android.support.v7.c.c.d {
            final /* synthetic */ d a;

            a(d dVar) {
                this.a = dVar;
            }

            public void b(int i) {
                this.a.b.setStreamVolume(3, i, 0);
                this.a.f();
            }

            public void c(int i) {
                int streamVolume = this.a.b.getStreamVolume(3);
                if (Math.min(this.a.b.getStreamMaxVolume(3), Math.max(0, streamVolume + i)) != streamVolume) {
                    this.a.b.setStreamVolume(3, streamVolume, 0);
                }
                this.a.f();
            }
        }

        /* compiled from: SystemMediaRouteProvider */
        final class b extends BroadcastReceiver {
            final /* synthetic */ d a;

            b(d dVar) {
                this.a = dVar;
            }

            public void onReceive(Context context, Intent intent) {
                if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    int intExtra = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                    if (intExtra >= 0 && intExtra != this.a.d) {
                        this.a.f();
                    }
                }
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
            a.add(intentFilter);
        }

        public d(Context context) {
            super(context);
            this.b = (AudioManager) context.getSystemService("audio");
            this.c = new b(this);
            context.registerReceiver(this.c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            f();
        }

        private void f() {
            Resources resources = a().getResources();
            int streamMaxVolume = this.b.getStreamMaxVolume(3);
            this.d = this.b.getStreamVolume(3);
            a(new android.support.v7.c.d.a().a(new android.support.v7.c.a.a("DEFAULT_ROUTE", resources.getString(android.support.v7.d.a.d.mr_system_route_name)).a(a).b(3).a(0).e(1).d(streamMaxVolume).c(this.d).a()).a());
        }

        public android.support.v7.c.c.d a(String str) {
            if (str.equals("DEFAULT_ROUTE")) {
                return new a(this);
            }
            return null;
        }
    }

    protected n(Context context) {
        super(context, new android.support.v7.c.c.c(new ComponentName(a.a.a.a.a.b.a.ANDROID_CLIENT_TYPE, n.class.getName())));
    }

    public static n a(Context context, e eVar) {
        if (VERSION.SDK_INT >= 18) {
            return new c(context, eVar);
        }
        if (VERSION.SDK_INT >= 17) {
            return new b(context, eVar);
        }
        if (VERSION.SDK_INT >= 16) {
            return new a(context, eVar);
        }
        return new d(context);
    }

    public void a(f fVar) {
    }

    public void b(f fVar) {
    }

    public void c(f fVar) {
    }

    public void d(f fVar) {
    }
}
