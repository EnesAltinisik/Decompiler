package com.google.android.gms.b;

import com.google.android.gms.b.ig.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class go implements Iterable<Entry<gx, jr>> {
    static final /* synthetic */ boolean a = (!go.class.desiredAssertionStatus());
    private static final go b = new go(new ig(null));
    private final ig<jr> c;

    private go(ig<jr> igVar) {
        this.c = igVar;
    }

    public static go a() {
        return b;
    }

    public static go a(Map<String, Object> map) {
        ig a = ig.a();
        ig igVar = a;
        for (Entry entry : map.entrySet()) {
            igVar = igVar.a(new gx((String) entry.getKey()), new ig(js.a(entry.getValue())));
        }
        return new go(igVar);
    }

    private jr a(gx gxVar, ig<jr> igVar, jr jrVar) {
        if (igVar.b() != null) {
            return jrVar.a(gxVar, (jr) igVar.b());
        }
        jr jrVar2 = null;
        Iterator it = igVar.c().iterator();
        jr jrVar3 = jrVar;
        while (it.hasNext()) {
            jr a;
            jr jrVar4;
            Entry entry = (Entry) it.next();
            ig igVar2 = (ig) entry.getValue();
            je jeVar = (je) entry.getKey();
            if (!jeVar.e()) {
                a = a(gxVar.a(jeVar), igVar2, jrVar3);
                jrVar4 = jrVar2;
            } else if (a || igVar2.b() != null) {
                jrVar4 = (jr) igVar2.b();
                a = jrVar3;
            } else {
                throw new AssertionError("Priority writes must always be leaf nodes");
            }
            jrVar2 = jrVar4;
            jrVar3 = a;
        }
        return (jrVar3.a(gxVar).b() || jrVar2 == null) ? jrVar3 : jrVar3.a(gxVar.a(je.c()), jrVar2);
    }

    public static go b(Map<gx, jr> map) {
        ig a = ig.a();
        ig igVar = a;
        for (Entry entry : map.entrySet()) {
            igVar = igVar.a((gx) entry.getKey(), new ig((jr) entry.getValue()));
        }
        return new go(igVar);
    }

    public go a(gx gxVar) {
        return gxVar.h() ? b : new go(this.c.a(gxVar, ig.a()));
    }

    public go a(final gx gxVar, go goVar) {
        return (go) goVar.c.a((Object) this, new a<jr, go>(this) {
            public go a(gx gxVar, jr jrVar, go goVar) {
                return goVar.a(gxVar.a(gxVar), jrVar);
            }
        });
    }

    public go a(gx gxVar, jr jrVar) {
        if (gxVar.h()) {
            return new go(new ig(jrVar));
        }
        gx a = this.c.a(gxVar);
        if (a != null) {
            gx a2 = gx.a(a, gxVar);
            jr jrVar2 = (jr) this.c.e(a);
            je g = a2.g();
            if (g != null && g.e() && jrVar2.a(a2.f()).b()) {
                return this;
            }
            return new go(this.c.a(a, jrVar2.a(a2, jrVar)));
        }
        return new go(this.c.a(gxVar, new ig(jrVar)));
    }

    public go a(je jeVar, jr jrVar) {
        return a(new gx(jeVar), jrVar);
    }

    public jr a(jr jrVar) {
        return a(gx.a(), this.c, jrVar);
    }

    public Map<String, Object> a(final boolean z) {
        final Map<String, Object> hashMap = new HashMap();
        this.c.a(new a<jr, Void>(this) {
            public Void a(gx gxVar, jr jrVar, Void voidR) {
                hashMap.put(gxVar.b(), jrVar.a(z));
                return null;
            }
        });
        return hashMap;
    }

    public jr b() {
        return (jr) this.c.b();
    }

    public boolean b(gx gxVar) {
        return c(gxVar) != null;
    }

    public jr c(gx gxVar) {
        gx a = this.c.a(gxVar);
        return a != null ? ((jr) this.c.e(a)).a(gx.a(a, gxVar)) : null;
    }

    public List<jq> c() {
        List<jq> arrayList = new ArrayList();
        if (this.c.b() != null) {
            for (jq jqVar : (jr) this.c.b()) {
                arrayList.add(new jq(jqVar.a(), jqVar.b()));
            }
        } else {
            Iterator it = this.c.c().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                ig igVar = (ig) entry.getValue();
                if (igVar.b() != null) {
                    arrayList.add(new jq((je) entry.getKey(), (jr) igVar.b()));
                }
            }
        }
        return arrayList;
    }

    public go d(gx gxVar) {
        if (gxVar.h()) {
            return this;
        }
        jr c = c(gxVar);
        return c != null ? new go(new ig(c)) : new go(this.c.c(gxVar));
    }

    public Map<je, go> d() {
        Map<je, go> hashMap = new HashMap();
        Iterator it = this.c.c().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            hashMap.put((je) entry.getKey(), new go((ig) entry.getValue()));
        }
        return hashMap;
    }

    public boolean e() {
        return this.c.d();
    }

    public boolean equals(Object obj) {
        return obj == this ? true : (obj == null || obj.getClass() != getClass()) ? false : ((go) obj).a(true).equals(a(true));
    }

    public int hashCode() {
        return a(true).hashCode();
    }

    public Iterator<Entry<gx, jr>> iterator() {
        return this.c.iterator();
    }

    public String toString() {
        String valueOf = String.valueOf(a(true).toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 15).append("CompoundWrite{").append(valueOf).append("}").toString();
    }
}
