package android.support.v4.b;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.ah;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

class y {
    private static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6};

    static class a {
        public l a;
        public boolean b;
        public f c;
        public l d;
        public boolean e;
        public f f;

        a() {
        }
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        aVar = new a();
        sparseArray.put(i, aVar);
        return aVar;
    }

    private static android.support.v4.i.a<String, String> a(int i, ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        android.support.v4.i.a<String, String> aVar = new android.support.v4.i.a();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            f fVar = (f) arrayList.get(i4);
            if (fVar.b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                if (fVar.s != null) {
                    ArrayList arrayList3;
                    ArrayList arrayList4;
                    int size = fVar.s.size();
                    if (booleanValue) {
                        arrayList3 = fVar.s;
                        arrayList4 = fVar.t;
                    } else {
                        ArrayList arrayList5 = fVar.s;
                        arrayList3 = fVar.t;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    private static Object a(l lVar, l lVar2, boolean z) {
        if (lVar == null || lVar2 == null) {
            return null;
        }
        return z.b(z.a(z ? lVar2.A() : lVar.z()));
    }

    private static Object a(l lVar, boolean z) {
        if (lVar == null) {
            return null;
        }
        return z.a(z ? lVar.y() : lVar.v());
    }

    private static Object a(ViewGroup viewGroup, View view, android.support.v4.i.a<String, String> aVar, a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        View view2 = null;
        final l lVar = aVar2.a;
        final l lVar2 = aVar2.d;
        if (lVar != null) {
            lVar.p().setVisibility(0);
        }
        if (lVar == null || lVar2 == null) {
            return null;
        }
        Object obj3;
        final boolean z = aVar2.b;
        Object a = aVar.isEmpty() ? null : a(lVar, lVar2, z);
        android.support.v4.i.a b = b((android.support.v4.i.a) aVar, a, aVar2);
        final android.support.v4.i.a c = c(aVar, a, aVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (c != null) {
                c.clear();
                obj3 = null;
            } else {
                obj3 = null;
            }
        } else {
            a((ArrayList) arrayList, b, aVar.keySet());
            a((ArrayList) arrayList2, c, aVar.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        Rect rect;
        b(lVar, lVar2, z, b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            z.a(obj3, view, (ArrayList) arrayList);
            a(obj3, obj2, b, aVar2.e, aVar2.f);
            rect = new Rect();
            view2 = b(c, aVar2, obj, z);
            if (view2 != null) {
                z.a(obj, rect);
            }
        } else {
            rect = null;
        }
        aq.a(viewGroup, new Runnable() {
            public void run() {
                y.b(lVar, lVar2, z, c, false);
                if (view2 != null) {
                    z.a(view2, rect);
                }
            }
        });
        return obj3;
    }

    private static Object a(Object obj, Object obj2, Object obj3, l lVar, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || lVar == null)) {
            z2 = z ? lVar.C() : lVar.B();
        }
        return z2 ? z.a(obj2, obj, obj3) : z.b(obj2, obj, obj3);
    }

    private static String a(android.support.v4.i.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.c(i))) {
                return (String) aVar.b(i);
            }
        }
        return null;
    }

    private static void a(f fVar, a aVar, SparseArray<a> sparseArray, boolean z, boolean z2) {
        l lVar = aVar.b;
        int i = lVar.F;
        if (i != 0) {
            int i2;
            int i3;
            a a;
            boolean z3;
            int i4;
            int i5;
            boolean z4;
            int i6;
            switch (z ? a[aVar.a] : aVar.a) {
                case 1:
                case 7:
                    z3 = z2 ? lVar.X : (lVar.t || lVar.H) ? false : true;
                    i4 = 1;
                    i2 = 0;
                    i5 = 0;
                    z4 = z3;
                    break;
                case 3:
                case 6:
                    i6 = z2 ? (lVar.t || lVar.P == null || lVar.P.getVisibility() != 0 || lVar.Z < 0.0f) ? 0 : 1 : (!lVar.t || lVar.H) ? 0 : 1;
                    i4 = 0;
                    i2 = i6;
                    i5 = 1;
                    i3 = 0;
                    break;
                case 4:
                    i6 = z2 ? (lVar.Y && lVar.t && lVar.H) ? 1 : 0 : (!lVar.t || lVar.H) ? 0 : 1;
                    i4 = 0;
                    i2 = i6;
                    i5 = 1;
                    i3 = 0;
                    break;
                case 5:
                    z3 = z2 ? lVar.Y && !lVar.H && lVar.t : lVar.H;
                    i4 = 1;
                    i2 = 0;
                    i5 = 0;
                    z4 = z3;
                    break;
                default:
                    i4 = 0;
                    i2 = 0;
                    i5 = 0;
                    i3 = 0;
                    break;
            }
            a aVar2 = (a) sparseArray.get(i);
            if (i3 != 0) {
                a = a(aVar2, (SparseArray) sparseArray, i);
                a.a = lVar;
                a.b = z;
                a.c = fVar;
            } else {
                a = aVar2;
            }
            if (!(z2 || r4 == 0)) {
                if (a != null && a.d == lVar) {
                    a.d = null;
                }
                r rVar = fVar.b;
                if (lVar.k < 1 && rVar.m >= 1 && !fVar.u) {
                    rVar.f(lVar);
                    rVar.a(lVar, 1, 0, 0, false);
                }
            }
            if (i2 == 0 || !(a == null || a.d == null)) {
                aVar2 = a;
            } else {
                aVar2 = a(a, (SparseArray) sparseArray, i);
                aVar2.d = lVar;
                aVar2.e = z;
                aVar2.f = fVar;
            }
            if (!z2 && r7 != 0 && aVar2 != null && aVar2.a == lVar) {
                aVar2.a = null;
            }
        }
    }

    public static void a(f fVar, SparseArray<a> sparseArray, boolean z) {
        int size = fVar.c.size();
        for (int i = 0; i < size; i++) {
            a(fVar, (a) fVar.c.get(i), (SparseArray) sparseArray, false, z);
        }
    }

    private static void a(r rVar, int i, a aVar, View view, android.support.v4.i.a<String, String> aVar2) {
        ViewGroup viewGroup = null;
        if (rVar.o.a()) {
            viewGroup = (ViewGroup) rVar.o.a(i);
        }
        if (viewGroup != null) {
            l lVar = aVar.a;
            l lVar2 = aVar.d;
            boolean z = aVar.b;
            boolean z2 = aVar.e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object a = a(lVar, z);
            Object b = b(lVar2, z2);
            Object a2 = a(viewGroup, view, (android.support.v4.i.a) aVar2, aVar, arrayList2, arrayList, a, b);
            if (a != null || a2 != null || b != null) {
                ArrayList b2 = b(b, lVar2, arrayList2, view);
                ArrayList b3 = b(a, lVar, arrayList, view);
                b(b3, 4);
                Object a3 = a(a, b, a2, lVar, z);
                if (a3 != null) {
                    a(b, lVar2, b2);
                    ArrayList a4 = z.a(arrayList);
                    z.a(a3, a, b3, b, b2, a2, arrayList);
                    z.a(viewGroup, a3);
                    z.a(viewGroup, arrayList2, arrayList, a4, aVar2);
                    b(b3, 0);
                    z.a(a2, arrayList2, arrayList);
                }
            }
        }
    }

    static void a(r rVar, ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (rVar.m >= 1 && VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                f fVar = (f) arrayList.get(i3);
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    b(fVar, sparseArray, z);
                } else {
                    a(fVar, sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(rVar.n.g());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    android.support.v4.i.a a = a(keyAt, (ArrayList) arrayList, (ArrayList) arrayList2, i, i2);
                    a aVar = (a) sparseArray.valueAt(i4);
                    if (z) {
                        a(rVar, keyAt, aVar, view, a);
                    } else {
                        b(rVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    private static void a(android.support.v4.i.a<String, String> aVar, android.support.v4.i.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.c(size))) {
                aVar.d(size);
            }
        }
    }

    private static void a(ViewGroup viewGroup, l lVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final View view2 = view;
        final l lVar2 = lVar;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        aq.a(viewGroup, new Runnable() {
            public void run() {
                if (obj3 != null) {
                    z.c(obj3, view2);
                    arrayList5.addAll(y.b(obj3, lVar2, arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        z.b(obj4, arrayList6, arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    private static void a(Object obj, l lVar, final ArrayList<View> arrayList) {
        if (lVar != null && obj != null && lVar.t && lVar.H && lVar.Y) {
            lVar.k(true);
            z.b(obj, lVar.p(), (ArrayList) arrayList);
            aq.a(lVar.O, new Runnable() {
                public void run() {
                    y.b(arrayList, 4);
                }
            });
        }
    }

    private static void a(Object obj, Object obj2, android.support.v4.i.a<String, View> aVar, boolean z, f fVar) {
        if (fVar.s != null && !fVar.s.isEmpty()) {
            Object obj3;
            if (z) {
                obj3 = (String) fVar.t.get(0);
            } else {
                String str = (String) fVar.s.get(0);
            }
            View view = (View) aVar.get(obj3);
            z.a(obj, view);
            if (obj2 != null) {
                z.a(obj2, view);
            }
        }
    }

    private static void a(ArrayList<View> arrayList, android.support.v4.i.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.c(size);
            if (collection.contains(ah.u(view))) {
                arrayList.add(view);
            }
        }
    }

    private static android.support.v4.i.a<String, View> b(android.support.v4.i.a<String, String> aVar, Object obj, a aVar2) {
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        ArrayList arrayList;
        av avVar;
        l lVar = aVar2.d;
        Map aVar3 = new android.support.v4.i.a();
        z.a(aVar3, lVar.p());
        f fVar = aVar2.f;
        av R;
        if (aVar2.e) {
            R = lVar.R();
            arrayList = fVar.t;
            avVar = R;
        } else {
            R = lVar.S();
            arrayList = fVar.s;
            avVar = R;
        }
        aVar3.a(arrayList);
        if (avVar != null) {
            avVar.a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(ah.u(view))) {
                    aVar.put(ah.u(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.a(aVar3.keySet());
        }
        return aVar3;
    }

    private static View b(android.support.v4.i.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        f fVar = aVar2.c;
        if (obj == null || fVar.s == null || fVar.s.isEmpty()) {
            return null;
        }
        Object obj2;
        if (z) {
            obj2 = (String) fVar.s.get(0);
        } else {
            String str = (String) fVar.t.get(0);
        }
        return (View) aVar.get(obj2);
    }

    private static Object b(l lVar, boolean z) {
        if (lVar == null) {
            return null;
        }
        return z.a(z ? lVar.w() : lVar.x());
    }

    private static Object b(ViewGroup viewGroup, View view, android.support.v4.i.a<String, String> aVar, a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final l lVar = aVar2.a;
        final l lVar2 = aVar2.d;
        if (lVar == null || lVar2 == null) {
            return null;
        }
        Object obj3;
        final boolean z = aVar2.b;
        Object a = aVar.isEmpty() ? null : a(lVar, lVar2, z);
        android.support.v4.i.a b = b((android.support.v4.i.a) aVar, a, aVar2);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        Rect rect;
        b(lVar, lVar2, z, b, true);
        if (obj3 != null) {
            rect = new Rect();
            z.a(obj3, view, (ArrayList) arrayList);
            a(obj3, obj2, b, aVar2.e, aVar2.f);
            if (obj != null) {
                z.a(obj, rect);
            }
        } else {
            rect = null;
        }
        final android.support.v4.i.a<String, String> aVar3 = aVar;
        final a aVar4 = aVar2;
        final ArrayList<View> arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj4 = obj;
        aq.a(viewGroup, new Runnable() {
            public void run() {
                android.support.v4.i.a a = y.c(aVar3, obj3, aVar4);
                if (a != null) {
                    arrayList3.addAll(a.values());
                    arrayList3.add(view2);
                }
                y.b(lVar, lVar2, z, a, false);
                if (obj3 != null) {
                    z.a(obj3, arrayList4, arrayList3);
                    View a2 = y.b(a, aVar4, obj4, z);
                    if (a2 != null) {
                        z.a(a2, rect);
                    }
                }
            }
        });
        return obj3;
    }

    private static ArrayList<View> b(Object obj, l lVar, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList();
            z.a((ArrayList) arrayList2, lVar.p());
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                z.a(obj, (ArrayList) arrayList2);
            }
        }
        return arrayList2;
    }

    public static void b(f fVar, SparseArray<a> sparseArray, boolean z) {
        if (fVar.b.o.a()) {
            for (int size = fVar.c.size() - 1; size >= 0; size--) {
                a(fVar, (a) fVar.c.get(size), (SparseArray) sparseArray, true, z);
            }
        }
    }

    private static void b(l lVar, l lVar2, boolean z, android.support.v4.i.a<String, View> aVar, boolean z2) {
        int i = 0;
        av R = z ? lVar2.R() : lVar.R();
        if (R != null) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            while (i < size) {
                arrayList2.add(aVar.b(i));
                arrayList.add(aVar.c(i));
                i++;
            }
            if (z2) {
                R.a(arrayList2, arrayList, null);
            } else {
                R.b(arrayList2, arrayList, null);
            }
        }
    }

    private static void b(r rVar, int i, a aVar, View view, android.support.v4.i.a<String, String> aVar2) {
        ViewGroup viewGroup = null;
        if (rVar.o.a()) {
            viewGroup = (ViewGroup) rVar.o.a(i);
        }
        if (viewGroup != null) {
            l lVar = aVar.a;
            l lVar2 = aVar.d;
            boolean z = aVar.b;
            boolean z2 = aVar.e;
            Object a = a(lVar, z);
            Object b = b(lVar2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object b2 = b(viewGroup, view, aVar2, aVar, arrayList, arrayList2, a, b);
            if (a != null || b2 != null || b != null) {
                ArrayList b3 = b(b, lVar2, arrayList, view);
                Object obj = (b3 == null || b3.isEmpty()) ? null : b;
                z.b(a, view);
                b = a(a, obj, b2, lVar, aVar.b);
                if (b != null) {
                    ArrayList arrayList3 = new ArrayList();
                    z.a(b, a, arrayList3, obj, b3, b2, arrayList2);
                    a(viewGroup, lVar, view, arrayList2, a, arrayList3, obj, b3);
                    z.a((View) viewGroup, arrayList2, (Map) aVar2);
                    z.a(viewGroup, b);
                    z.a(viewGroup, arrayList2, (Map) aVar2);
                }
            }
        }
    }

    private static void b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    private static android.support.v4.i.a<String, View> c(android.support.v4.i.a<String, String> aVar, Object obj, a aVar2) {
        l lVar = aVar2.a;
        View p = lVar.p();
        if (aVar.isEmpty() || obj == null || p == null) {
            aVar.clear();
            return null;
        }
        ArrayList arrayList;
        av avVar;
        android.support.v4.i.a<String, View> aVar3 = new android.support.v4.i.a();
        z.a((Map) aVar3, p);
        f fVar = aVar2.c;
        av S;
        if (aVar2.b) {
            S = lVar.S();
            arrayList = fVar.s;
            avVar = S;
        } else {
            S = lVar.R();
            arrayList = fVar.t;
            avVar = S;
        }
        aVar3.a(arrayList);
        if (avVar != null) {
            avVar.a(arrayList, aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                p = (View) aVar3.get(str);
                if (p == null) {
                    str = a((android.support.v4.i.a) aVar, str);
                    if (str != null) {
                        aVar.remove(str);
                    }
                } else if (!str.equals(ah.u(p))) {
                    str = a((android.support.v4.i.a) aVar, str);
                    if (str != null) {
                        aVar.put(str, ah.u(p));
                    }
                }
            }
        } else {
            a((android.support.v4.i.a) aVar, (android.support.v4.i.a) aVar3);
        }
        return aVar3;
    }
}
