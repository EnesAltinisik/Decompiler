package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class k {
    private static final a a;
    private final Object b;

    interface a {
        Object a(k kVar);
    }

    static class d implements a {
        d() {
        }

        public Object a(k kVar) {
            return null;
        }
    }

    private static class b extends d {
        b() {
        }

        public Object a(final k kVar) {
            return l.a(new a(this) {
                final /* synthetic */ b b;

                public Object a(int i) {
                    c a = kVar.a(i);
                    return a == null ? null : a.a();
                }

                public List<Object> a(String str, int i) {
                    List a = kVar.a(str, i);
                    if (a == null) {
                        return null;
                    }
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((c) a.get(i2)).a());
                    }
                    return arrayList;
                }

                public boolean a(int i, int i2, Bundle bundle) {
                    return kVar.a(i, i2, bundle);
                }
            });
        }
    }

    private static class c extends d {
        c() {
        }

        public Object a(final k kVar) {
            return m.a(new a(this) {
                final /* synthetic */ c b;

                public Object a(int i) {
                    c a = kVar.a(i);
                    return a == null ? null : a.a();
                }

                public List<Object> a(String str, int i) {
                    List a = kVar.a(str, i);
                    if (a == null) {
                        return null;
                    }
                    List<Object> arrayList = new ArrayList();
                    int size = a.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((c) a.get(i2)).a());
                    }
                    return arrayList;
                }

                public boolean a(int i, int i2, Bundle bundle) {
                    return kVar.a(i, i2, bundle);
                }

                public Object b(int i) {
                    c b = kVar.b(i);
                    return b == null ? null : b.a();
                }
            });
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            a = new c();
        } else if (VERSION.SDK_INT >= 16) {
            a = new b();
        } else {
            a = new d();
        }
    }

    public k() {
        this.b = a.a(this);
    }

    public k(Object obj) {
        this.b = obj;
    }

    public c a(int i) {
        return null;
    }

    public Object a() {
        return this.b;
    }

    public List<c> a(String str, int i) {
        return null;
    }

    public boolean a(int i, int i2, Bundle bundle) {
        return false;
    }

    public c b(int i) {
        return null;
    }
}
