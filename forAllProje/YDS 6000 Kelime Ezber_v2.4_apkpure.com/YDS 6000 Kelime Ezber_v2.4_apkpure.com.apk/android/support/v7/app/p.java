package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.support.v4.b.ag;
import android.support.v4.b.ah;
import android.support.v4.b.ah.q;
import android.support.v7.appcompat.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import java.util.List;

public class p extends ah {

    private static class a extends e {
        private a() {
        }

        public Notification a(android.support.v4.b.ah.d dVar, ag agVar) {
            p.e(agVar, dVar);
            return agVar.b();
        }
    }

    public static class b extends android.support.v4.b.ah.d {
        public b(Context context) {
            super(context);
        }

        protected e b() {
            return VERSION.SDK_INT >= 24 ? new a() : VERSION.SDK_INT >= 21 ? new g() : VERSION.SDK_INT >= 16 ? new f() : VERSION.SDK_INT >= 14 ? new e() : super.b();
        }

        protected CharSequence i() {
            if (this.m instanceof android.support.v4.b.ah.g) {
                android.support.v4.b.ah.g gVar = (android.support.v4.b.ah.g) this.m;
                android.support.v4.b.ah.g.a a = p.b(gVar);
                CharSequence b = gVar.b();
                if (a != null) {
                    return b != null ? p.b(this, gVar, a) : a.a();
                }
            }
            return super.i();
        }

        protected CharSequence j() {
            if (this.m instanceof android.support.v4.b.ah.g) {
                android.support.v4.b.ah.g gVar = (android.support.v4.b.ah.g) this.m;
                android.support.v4.b.ah.g.a a = p.b(gVar);
                CharSequence b = gVar.b();
                if (!(b == null && a == null)) {
                    return b != null ? b : a.c();
                }
            }
            return super.j();
        }
    }

    public static class c extends q {
    }

    public static class h extends q {
        int[] a = null;
        android.support.v4.f.a.a.a b;
        boolean c;
        PendingIntent h;
    }

    public static class d extends h {
    }

    private static class e extends e {
        e() {
        }

        public Notification a(android.support.v4.b.ah.d dVar, ag agVar) {
            RemoteViews a = p.h(agVar, dVar);
            Notification b = agVar.b();
            if (a != null) {
                b.contentView = a;
            } else if (dVar.c() != null) {
                b.contentView = dVar.c();
            }
            return b;
        }
    }

    private static class f extends e {
        f() {
        }

        public Notification a(android.support.v4.b.ah.d dVar, ag agVar) {
            RemoteViews b = p.g(agVar, dVar);
            Notification b2 = agVar.b();
            if (b != null) {
                b2.contentView = b;
            }
            p.d(b2, dVar);
            return b2;
        }
    }

    private static class g extends e {
        g() {
        }

        public Notification a(android.support.v4.b.ah.d dVar, ag agVar) {
            RemoteViews c = p.f(agVar, dVar);
            Notification b = agVar.b();
            if (c != null) {
                b.contentView = c;
            }
            p.g(b, dVar);
            p.h(b, dVar);
            return b;
        }
    }

    private static TextAppearanceSpan a(int i) {
        return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i), null);
    }

    private static RemoteViews a(android.support.v4.b.ah.d dVar) {
        if (dVar.c() == null) {
            return null;
        }
        RemoteViews a = s.a(dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.F.icon, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), dVar.h(), R.layout.notification_template_custom_big, false, null);
        s.a(dVar.a, a, dVar.c());
        return a;
    }

    private static void a(Context context, RemoteViews remoteViews, int i) {
        if (i == 0) {
            i = context.getResources().getColor(R.color.notification_material_background_media_default_color);
        }
        remoteViews.setInt(R.id.status_bar_latest_event_content, "setBackgroundColor", i);
    }

    private static void a(android.support.v4.b.ah.g gVar, ag agVar, android.support.v4.b.ah.d dVar) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        List c = gVar.c();
        int i = (gVar.b() != null || a(gVar.c())) ? 1 : 0;
        for (int size = c.size() - 1; size >= 0; size--) {
            android.support.v4.b.ah.g.a aVar = (android.support.v4.b.ah.g.a) c.get(size);
            CharSequence b = i != 0 ? b(dVar, gVar, aVar) : aVar.a();
            if (size != c.size() - 1) {
                spannableStringBuilder.insert(0, "\n");
            }
            spannableStringBuilder.insert(0, b);
        }
        t.a(agVar, spannableStringBuilder);
    }

    private static boolean a(List<android.support.v4.b.ah.g.a> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((android.support.v4.b.ah.g.a) list.get(size)).c() == null) {
                return true;
            }
        }
        return false;
    }

    private static android.support.v4.b.ah.g.a b(android.support.v4.b.ah.g gVar) {
        List c = gVar.c();
        for (int size = c.size() - 1; size >= 0; size--) {
            android.support.v4.b.ah.g.a aVar = (android.support.v4.b.ah.g.a) c.get(size);
            if (!TextUtils.isEmpty(aVar.c())) {
                return aVar;
            }
        }
        return !c.isEmpty() ? (android.support.v4.b.ah.g.a) c.get(c.size() - 1) : null;
    }

    private static CharSequence b(android.support.v4.b.ah.d dVar, android.support.v4.b.ah.g gVar, android.support.v4.b.ah.g.a aVar) {
        int i;
        CharSequence charSequence;
        android.support.v4.h.a a = android.support.v4.h.a.a();
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        Object obj = VERSION.SDK_INT >= 21 ? 1 : null;
        int i2 = (obj != null || VERSION.SDK_INT <= 10) ? -16777216 : -1;
        CharSequence c = aVar.c();
        if (TextUtils.isEmpty(aVar.c())) {
            String a2 = gVar.a() == null ? "" : gVar.a();
            if (!(obj == null || dVar.h() == 0)) {
                i2 = dVar.h();
            }
            String str = a2;
            i = i2;
            charSequence = str;
        } else {
            CharSequence charSequence2 = c;
            i = i2;
            charSequence = charSequence2;
        }
        charSequence = a.a(charSequence);
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.setSpan(a(i), spannableStringBuilder.length() - charSequence.length(), spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("  ").append(a.a(aVar.a() == null ? "" : aVar.a()));
        return spannableStringBuilder;
    }

    @TargetApi(16)
    private static void d(Notification notification, android.support.v4.b.ah.d dVar) {
        if (dVar.m instanceof h) {
            h hVar = (h) dVar.m;
            RemoteViews d = dVar.d() != null ? dVar.d() : dVar.c();
            boolean z = (dVar.m instanceof d) && d != null;
            s.a(notification, dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), 0, (List) dVar.v, hVar.c, hVar.h, z);
            if (z) {
                s.a(dVar.a, notification.bigContentView, d);
            }
        } else if (dVar.m instanceof c) {
            e(notification, dVar);
        }
    }

    @TargetApi(16)
    private static void e(Notification notification, android.support.v4.b.ah.d dVar) {
        RemoteViews d = dVar.d();
        if (d == null) {
            d = dVar.c();
        }
        if (d != null) {
            RemoteViews a = s.a(dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, notification.icon, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), dVar.h(), R.layout.notification_template_custom_big, false, dVar.v);
            s.a(dVar.a, a, d);
            notification.bigContentView = a;
        }
    }

    @TargetApi(24)
    private static void e(ag agVar, android.support.v4.b.ah.d dVar) {
        if (dVar.m instanceof c) {
            r.a(agVar);
        } else if (dVar.m instanceof d) {
            r.b(agVar);
        } else if (!(dVar.m instanceof android.support.v4.b.ah.g)) {
            f(agVar, dVar);
        }
    }

    @TargetApi(21)
    private static RemoteViews f(ag agVar, android.support.v4.b.ah.d dVar) {
        if (!(dVar.m instanceof h)) {
            return dVar.m instanceof c ? a(dVar) : g(agVar, dVar);
        } else {
            h hVar = (h) dVar.m;
            q.a(agVar, hVar.a, hVar.b != null ? hVar.b.a() : null);
            boolean z = dVar.c() != null;
            Object obj = (VERSION.SDK_INT < 21 || VERSION.SDK_INT > 23) ? null : 1;
            obj = (z || !(obj == null || dVar.d() == null)) ? 1 : null;
            if (!(dVar.m instanceof d) || obj == null) {
                return null;
            }
            RemoteViews a = s.a(agVar, dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), dVar.v, hVar.a, false, null, z);
            if (z) {
                s.a(dVar.a, a, dVar.c());
            }
            a(dVar.a, a, dVar.h());
            return a;
        }
    }

    @TargetApi(21)
    private static void f(Notification notification, android.support.v4.b.ah.d dVar) {
        RemoteViews e = dVar.e();
        RemoteViews c = e != null ? e : dVar.c();
        if (e != null) {
            e = s.a(dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, notification.icon, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), dVar.h(), R.layout.notification_template_custom_big, false, dVar.v);
            s.a(dVar.a, e, c);
            notification.headsUpContentView = e;
        }
    }

    @TargetApi(16)
    private static RemoteViews g(ag agVar, android.support.v4.b.ah.d dVar) {
        if (dVar.m instanceof android.support.v4.b.ah.g) {
            a((android.support.v4.b.ah.g) dVar.m, agVar, dVar);
        }
        return h(agVar, dVar);
    }

    @TargetApi(21)
    private static void g(Notification notification, android.support.v4.b.ah.d dVar) {
        RemoteViews d = dVar.d() != null ? dVar.d() : dVar.c();
        if ((dVar.m instanceof d) && d != null) {
            s.a(notification, dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), 0, (List) dVar.v, false, null, true);
            s.a(dVar.a, notification.bigContentView, d);
            a(dVar.a, notification.bigContentView, dVar.h());
        } else if (dVar.m instanceof c) {
            e(notification, dVar);
        }
    }

    @TargetApi(14)
    private static RemoteViews h(ag agVar, android.support.v4.b.ah.d dVar) {
        if (dVar.m instanceof h) {
            h hVar = (h) dVar.m;
            boolean z = (dVar.m instanceof d) && dVar.c() != null;
            RemoteViews a = s.a(agVar, dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), dVar.v, hVar.a, hVar.c, hVar.h, z);
            if (z) {
                s.a(dVar.a, a, dVar.c());
                return a;
            }
        } else if (dVar.m instanceof c) {
            return a(dVar);
        }
        return null;
    }

    @TargetApi(21)
    private static void h(Notification notification, android.support.v4.b.ah.d dVar) {
        RemoteViews e = dVar.e() != null ? dVar.e() : dVar.c();
        if ((dVar.m instanceof d) && e != null) {
            notification.headsUpContentView = s.a(dVar.a, dVar.b, dVar.c, dVar.h, dVar.i, dVar.g, dVar.n, dVar.l, dVar.f(), dVar.g(), 0, dVar.v, false, null, true);
            s.a(dVar.a, notification.headsUpContentView, e);
            a(dVar.a, notification.headsUpContentView, dVar.h());
        } else if (dVar.m instanceof c) {
            f(notification, dVar);
        }
    }
}
