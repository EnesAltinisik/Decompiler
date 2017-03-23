package android.support.v4.b;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ah {
    static final h a;

    public static class a extends android.support.v4.b.al.a {
        public static final android.support.v4.b.al.a.a e = new android.support.v4.b.al.a.a() {
        };
        final Bundle a;
        public int b;
        public CharSequence c;
        public PendingIntent d;
        private final ar[] f;
        private boolean g;

        public int a() {
            return this.b;
        }

        public CharSequence b() {
            return this.c;
        }

        public PendingIntent c() {
            return this.d;
        }

        public Bundle d() {
            return this.a;
        }

        public boolean e() {
            return this.g;
        }

        public ar[] f() {
            return this.f;
        }

        public /* synthetic */ android.support.v4.b.at.a[] g() {
            return f();
        }
    }

    public static abstract class q {
        d d;
        CharSequence e;
        CharSequence f;
        boolean g = false;

        public void a(Bundle bundle) {
        }

        public void a(d dVar) {
            if (this.d != dVar) {
                this.d = dVar;
                if (this.d != null) {
                    this.d.a(this);
                }
            }
        }
    }

    public static class b extends q {
        Bitmap a;
        Bitmap b;
        boolean c;
    }

    public static class c extends q {
        CharSequence a;

        public c a(CharSequence charSequence) {
            this.a = d.d(charSequence);
            return this;
        }
    }

    public static class d {
        int A = 0;
        Notification B;
        RemoteViews C;
        RemoteViews D;
        RemoteViews E;
        public Notification F = new Notification();
        public ArrayList<String> G;
        public Context a;
        public CharSequence b;
        public CharSequence c;
        PendingIntent d;
        PendingIntent e;
        RemoteViews f;
        public Bitmap g;
        public CharSequence h;
        public int i;
        int j;
        boolean k = true;
        public boolean l;
        public q m;
        public CharSequence n;
        public CharSequence[] o;
        int p;
        int q;
        boolean r;
        String s;
        boolean t;
        String u;
        public ArrayList<a> v = new ArrayList();
        boolean w = false;
        String x;
        Bundle y;
        int z = 0;

        public d(Context context) {
            this.a = context;
            this.F.when = System.currentTimeMillis();
            this.F.audioStreamType = -1;
            this.j = 0;
            this.G = new ArrayList();
        }

        private void a(int i, boolean z) {
            if (z) {
                Notification notification = this.F;
                notification.flags |= i;
                return;
            }
            notification = this.F;
            notification.flags &= i ^ -1;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public Notification a() {
            return ah.a.a(this, b());
        }

        public d a(int i) {
            this.F.icon = i;
            return this;
        }

        public d a(long j) {
            this.F.when = j;
            return this;
        }

        public d a(PendingIntent pendingIntent) {
            this.d = pendingIntent;
            return this;
        }

        public d a(Uri uri) {
            this.F.sound = uri;
            this.F.audioStreamType = -1;
            return this;
        }

        public d a(q qVar) {
            if (this.m != qVar) {
                this.m = qVar;
                if (this.m != null) {
                    this.m.a(this);
                }
            }
            return this;
        }

        public d a(CharSequence charSequence) {
            this.b = d(charSequence);
            return this;
        }

        public d a(boolean z) {
            a(16, z);
            return this;
        }

        public d b(int i) {
            this.z = i;
            return this;
        }

        public d b(PendingIntent pendingIntent) {
            this.F.deleteIntent = pendingIntent;
            return this;
        }

        public d b(CharSequence charSequence) {
            this.c = d(charSequence);
            return this;
        }

        public d b(boolean z) {
            this.w = z;
            return this;
        }

        protected e b() {
            return new e();
        }

        public d c(CharSequence charSequence) {
            this.F.tickerText = d(charSequence);
            return this;
        }

        public RemoteViews c() {
            return this.C;
        }

        public RemoteViews d() {
            return this.D;
        }

        public RemoteViews e() {
            return this.E;
        }

        public long f() {
            return this.k ? this.F.when : 0;
        }

        public int g() {
            return this.j;
        }

        public int h() {
            return this.z;
        }

        protected CharSequence i() {
            return this.c;
        }

        protected CharSequence j() {
            return this.b;
        }
    }

    protected static class e {
        protected e() {
        }

        public Notification a(d dVar, ag agVar) {
            Notification b = agVar.b();
            if (dVar.C != null) {
                b.contentView = dVar.C;
            }
            return b;
        }
    }

    public static class f extends q {
        ArrayList<CharSequence> a = new ArrayList();
    }

    public static class g extends q {
        CharSequence a;
        CharSequence b;
        List<a> c = new ArrayList();

        public static final class a {
            private final CharSequence a;
            private final long b;
            private final CharSequence c;
            private String d;
            private Uri e;

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = ((a) list.get(i)).f();
                }
                return bundleArr;
            }

            private Bundle f() {
                Bundle bundle = new Bundle();
                if (this.a != null) {
                    bundle.putCharSequence("text", this.a);
                }
                bundle.putLong("time", this.b);
                if (this.c != null) {
                    bundle.putCharSequence("sender", this.c);
                }
                if (this.d != null) {
                    bundle.putString("type", this.d);
                }
                if (this.e != null) {
                    bundle.putParcelable("uri", this.e);
                }
                return bundle;
            }

            public CharSequence a() {
                return this.a;
            }

            public long b() {
                return this.b;
            }

            public CharSequence c() {
                return this.c;
            }

            public String d() {
                return this.d;
            }

            public Uri e() {
                return this.e;
            }
        }

        g() {
        }

        public CharSequence a() {
            return this.a;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            if (this.a != null) {
                bundle.putCharSequence("android.selfDisplayName", this.a);
            }
            if (this.b != null) {
                bundle.putCharSequence("android.conversationTitle", this.b);
            }
            if (!this.c.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.c));
            }
        }

        public CharSequence b() {
            return this.b;
        }

        public List<a> c() {
            return this.c;
        }
    }

    interface h {
        Notification a(d dVar, e eVar);
    }

    static class l implements h {
        l() {
        }

        public Notification a(d dVar, e eVar) {
            Notification a = al.a(dVar.F, dVar.a, dVar.j(), dVar.i(), dVar.d, dVar.e);
            if (dVar.j > 0) {
                a.flags |= 128;
            }
            if (dVar.C != null) {
                a.contentView = dVar.C;
            }
            return a;
        }

        public Bundle a(Notification notification) {
            return null;
        }
    }

    static class o extends l {
        o() {
        }

        public Notification a(d dVar, e eVar) {
            ag aVar = new android.support.v4.b.ao.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r, dVar.l, dVar.j, dVar.n, dVar.w, dVar.y, dVar.s, dVar.t, dVar.u, dVar.C, dVar.D);
            ah.a((af) aVar, dVar.v);
            ah.a(aVar, dVar.m);
            Notification a = eVar.a(dVar, aVar);
            if (dVar.m != null) {
                Bundle a2 = a(a);
                if (a2 != null) {
                    dVar.m.a(a2);
                }
            }
            return a;
        }

        public Bundle a(Notification notification) {
            return ao.a(notification);
        }
    }

    static class p extends o {
        p() {
        }

        public Notification a(d dVar, e eVar) {
            ag aVar = new android.support.v4.b.ap.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r, dVar.k, dVar.l, dVar.j, dVar.n, dVar.w, dVar.G, dVar.y, dVar.s, dVar.t, dVar.u, dVar.C, dVar.D);
            ah.a((af) aVar, dVar.v);
            ah.a(aVar, dVar.m);
            return eVar.a(dVar, aVar);
        }

        public Bundle a(Notification notification) {
            return ap.a(notification);
        }
    }

    static class i extends p {
        i() {
        }

        public Notification a(d dVar, e eVar) {
            ag aVar = new android.support.v4.b.ai.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r, dVar.k, dVar.l, dVar.j, dVar.n, dVar.w, dVar.G, dVar.y, dVar.s, dVar.t, dVar.u, dVar.C, dVar.D);
            ah.a((af) aVar, dVar.v);
            ah.a(aVar, dVar.m);
            Notification a = eVar.a(dVar, aVar);
            if (dVar.m != null) {
                dVar.m.a(a(a));
            }
            return a;
        }
    }

    static class j extends i {
        j() {
        }

        public Notification a(d dVar, e eVar) {
            ag aVar = new android.support.v4.b.aj.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r, dVar.k, dVar.l, dVar.j, dVar.n, dVar.w, dVar.x, dVar.G, dVar.y, dVar.z, dVar.A, dVar.B, dVar.s, dVar.t, dVar.u, dVar.C, dVar.D, dVar.E);
            ah.a((af) aVar, dVar.v);
            ah.a(aVar, dVar.m);
            Notification a = eVar.a(dVar, aVar);
            if (dVar.m != null) {
                dVar.m.a(a(a));
            }
            return a;
        }
    }

    static class k extends j {
        k() {
        }

        public Notification a(d dVar, e eVar) {
            af aVar = new android.support.v4.b.ak.a(dVar.a, dVar.F, dVar.b, dVar.c, dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r, dVar.k, dVar.l, dVar.j, dVar.n, dVar.w, dVar.x, dVar.G, dVar.y, dVar.z, dVar.A, dVar.B, dVar.s, dVar.t, dVar.u, dVar.o, dVar.C, dVar.D, dVar.E);
            ah.a(aVar, dVar.v);
            ah.b(aVar, dVar.m);
            Notification a = eVar.a(dVar, aVar);
            if (dVar.m != null) {
                dVar.m.a(a(a));
            }
            return a;
        }
    }

    static class m extends l {
        m() {
        }

        public Notification a(d dVar, e eVar) {
            Notification a = am.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g);
            if (dVar.C != null) {
                a.contentView = dVar.C;
            }
            return a;
        }
    }

    static class n extends l {
        n() {
        }

        public Notification a(d dVar, e eVar) {
            return eVar.a(dVar, new android.support.v4.b.an.a(dVar.a, dVar.F, dVar.j(), dVar.i(), dVar.h, dVar.f, dVar.i, dVar.d, dVar.e, dVar.g, dVar.p, dVar.q, dVar.r));
        }
    }

    static {
        if (android.support.v4.g.c.a()) {
            a = new k();
        } else if (VERSION.SDK_INT >= 21) {
            a = new j();
        } else if (VERSION.SDK_INT >= 20) {
            a = new i();
        } else if (VERSION.SDK_INT >= 19) {
            a = new p();
        } else if (VERSION.SDK_INT >= 16) {
            a = new o();
        } else if (VERSION.SDK_INT >= 14) {
            a = new n();
        } else if (VERSION.SDK_INT >= 11) {
            a = new m();
        } else {
            a = new l();
        }
    }

    static void a(af afVar, ArrayList<a> arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            afVar.a((a) it.next());
        }
    }

    static void a(ag agVar, q qVar) {
        if (qVar == null) {
            return;
        }
        if (qVar instanceof c) {
            c cVar = (c) qVar;
            ao.a(agVar, cVar.e, cVar.g, cVar.f, cVar.a);
        } else if (qVar instanceof f) {
            f fVar = (f) qVar;
            ao.a(agVar, fVar.e, fVar.g, fVar.f, fVar.a);
        } else if (qVar instanceof b) {
            b bVar = (b) qVar;
            ao.a(agVar, bVar.e, bVar.g, bVar.f, bVar.a, bVar.b, bVar.c);
        }
    }

    static void b(ag agVar, q qVar) {
        if (qVar == null) {
            return;
        }
        if (qVar instanceof g) {
            g gVar = (g) qVar;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            List arrayList3 = new ArrayList();
            List arrayList4 = new ArrayList();
            List arrayList5 = new ArrayList();
            for (a aVar : gVar.c) {
                arrayList.add(aVar.a());
                arrayList2.add(Long.valueOf(aVar.b()));
                arrayList3.add(aVar.c());
                arrayList4.add(aVar.d());
                arrayList5.add(aVar.e());
            }
            ak.a(agVar, gVar.a, gVar.b, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        a(agVar, qVar);
    }
}
