package android.support.v4.b;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.i.i;
import android.support.v4.view.ah;
import android.support.v4.view.n;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class r extends q implements n {
    static final Interpolator D = new DecelerateInterpolator(2.5f);
    static final Interpolator E = new DecelerateInterpolator(1.5f);
    static final Interpolator F = new AccelerateInterpolator(2.5f);
    static final Interpolator G = new AccelerateInterpolator(1.5f);
    static boolean a = false;
    static final boolean b;
    static Field q = null;
    SparseArray<Parcelable> A = null;
    ArrayList<e> B;
    Runnable C = new Runnable(this) {
        final /* synthetic */ r a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.d();
        }
    };
    private CopyOnWriteArrayList<i<android.support.v4.b.q.a, Boolean>> H;
    ArrayList<c> c;
    boolean d;
    ArrayList<l> e;
    ArrayList<l> f;
    ArrayList<Integer> g;
    ArrayList<f> h;
    ArrayList<l> i;
    ArrayList<f> j;
    ArrayList<Integer> k;
    ArrayList<android.support.v4.b.q.b> l;
    int m = 0;
    p n;
    n o;
    l p;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    ArrayList<f> w;
    ArrayList<Boolean> x;
    ArrayList<l> y;
    Bundle z = null;

    interface c {
        boolean a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2);
    }

    static class a implements AnimationListener {
        private AnimationListener a;
        private boolean b;
        View c;

        public a(View view, Animation animation) {
            if (view != null && animation != null) {
                this.c = view;
            }
        }

        public a(View view, Animation animation, AnimationListener animationListener) {
            if (view != null && animation != null) {
                this.a = animationListener;
                this.c = view;
                this.b = true;
            }
        }

        public void onAnimationEnd(Animation animation) {
            if (this.c != null && this.b) {
                if (ah.G(this.c) || android.support.v4.g.c.a()) {
                    this.c.post(new Runnable(this) {
                        final /* synthetic */ a a;

                        {
                            this.a = r1;
                        }

                        public void run() {
                            ah.a(this.a.c, 0, null);
                        }
                    });
                } else {
                    ah.a(this.c, 0, null);
                }
            }
            if (this.a != null) {
                this.a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.a != null) {
                this.a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.a != null) {
                this.a.onAnimationStart(animation);
            }
        }
    }

    static class b {
        public static final int[] a = new int[]{16842755, 16842960, 16842961};
    }

    private class d implements c {
        final String a;
        final int b;
        final int c;
        final /* synthetic */ r d;

        d(r rVar, String str, int i, int i2) {
            this.d = rVar;
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2) {
            return this.d.a((ArrayList) arrayList, (ArrayList) arrayList2, this.a, this.b, this.c);
        }
    }

    static class e implements c {
        private final boolean a;
        private final f b;
        private int c;

        e(f fVar, boolean z) {
            this.a = z;
            this.b = fVar;
        }

        public void a() {
            this.c--;
            if (this.c == 0) {
                this.b.b.v();
            }
        }

        public void b() {
            this.c++;
        }

        public boolean c() {
            return this.c == 0;
        }

        public void d() {
            boolean z = false;
            boolean z2 = this.c > 0;
            r rVar = this.b.b;
            int size = rVar.f.size();
            for (int i = 0; i < size; i++) {
                l lVar = (l) rVar.f.get(i);
                lVar.a(null);
                if (z2 && lVar.V()) {
                    lVar.D();
                }
            }
            r rVar2 = this.b.b;
            f fVar = this.b;
            boolean z3 = this.a;
            if (!z2) {
                z = true;
            }
            rVar2.a(fVar, z3, z, true);
        }

        public void e() {
            this.b.b.a(this.b, this.a, false, false);
        }
    }

    static {
        boolean z = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        b = z;
    }

    r() {
    }

    private int a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, android.support.v4.i.b<l> bVar) {
        int i3 = i2 - 1;
        int i4 = i2;
        while (i3 >= i) {
            int i5;
            f fVar = (f) arrayList.get(i3);
            boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
            Object obj = (!fVar.g() || fVar.a((ArrayList) arrayList, i3 + 1, i2)) ? null : 1;
            if (obj != null) {
                if (this.B == null) {
                    this.B = new ArrayList();
                }
                c eVar = new e(fVar, booleanValue);
                this.B.add(eVar);
                fVar.a(eVar);
                if (booleanValue) {
                    fVar.e();
                } else {
                    fVar.f();
                }
                int i6 = i4 - 1;
                if (i3 != i6) {
                    arrayList.remove(i3);
                    arrayList.add(i6, fVar);
                }
                b((android.support.v4.i.b) bVar);
                i5 = i6;
            } else {
                i5 = i4;
            }
            i3--;
            i4 = i5;
        }
        return i4;
    }

    static Animation a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(E);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(D);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(E);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private void a(f fVar, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(fVar);
        arrayList2.add(Boolean.valueOf(z));
        b(arrayList, arrayList2, 0, 1);
        if (z2) {
            y.a(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.m, true);
        }
        if (this.e != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                l lVar = (l) this.e.get(i);
                if (lVar != null && lVar.P != null && lVar.X && fVar.b(lVar.F)) {
                    if (VERSION.SDK_INT >= 11 && lVar.Z > 0.0f) {
                        lVar.P.setAlpha(lVar.Z);
                    }
                    if (z3) {
                        lVar.Z = 0.0f;
                    } else {
                        lVar.Z = -1.0f;
                        lVar.X = false;
                    }
                }
            }
        }
    }

    private void a(android.support.v4.i.b<l> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) bVar.b(i);
            if (!lVar.t) {
                View p = lVar.p();
                if (VERSION.SDK_INT < 11) {
                    lVar.p().setVisibility(4);
                } else {
                    lVar.Z = p.getAlpha();
                    p.setAlpha(0.0f);
                }
            }
        }
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.i.e("FragmentManager"));
        if (this.n != null) {
            try {
                this.n.a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    private void a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2) {
        int i = 0;
        int size = this.B == null ? 0 : this.B.size();
        while (i < size) {
            int indexOf;
            int i2;
            e eVar = (e) this.B.get(i);
            if (!(arrayList == null || eVar.a)) {
                indexOf = arrayList.indexOf(eVar.b);
                if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    eVar.e();
                    i2 = i;
                    indexOf = size;
                    i = i2 + 1;
                    size = indexOf;
                }
            }
            if (eVar.c() || (arrayList != null && eVar.b.a((ArrayList) arrayList, 0, arrayList.size()))) {
                this.B.remove(i);
                i--;
                size--;
                if (!(arrayList == null || eVar.a)) {
                    indexOf = arrayList.indexOf(eVar.b);
                    if (indexOf != -1 && ((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        eVar.e();
                        i2 = i;
                        indexOf = size;
                        i = i2 + 1;
                        size = indexOf;
                    }
                }
                eVar.d();
            }
            i2 = i;
            indexOf = size;
            i = i2 + 1;
            size = indexOf;
        }
    }

    private void a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int a;
        boolean z = ((f) arrayList.get(i)).u;
        if (this.y == null) {
            this.y = new ArrayList();
        } else {
            this.y.clear();
        }
        if (this.f != null) {
            this.y.addAll(this.f);
        }
        int i3 = i;
        boolean z2 = false;
        while (i3 < i2) {
            f fVar = (f) arrayList.get(i3);
            boolean booleanValue = ((Boolean) arrayList2.get(i3)).booleanValue();
            if (booleanValue) {
                fVar.b(this.y);
            } else {
                fVar.a(this.y);
            }
            fVar.a(booleanValue ? -1 : 1);
            boolean z3 = z2 || fVar.j;
            i3++;
            z2 = z3;
        }
        this.y.clear();
        if (!z) {
            y.a(this, arrayList, arrayList2, i, i2, false);
        }
        b(arrayList, arrayList2, i, i2);
        if (z) {
            android.support.v4.i.b bVar = new android.support.v4.i.b();
            b(bVar);
            a = a((ArrayList) arrayList, (ArrayList) arrayList2, i, i2, bVar);
            a(bVar);
        } else {
            a = i2;
        }
        if (a != i && z) {
            y.a(this, arrayList, arrayList2, i, a, true);
            a(this.m, true);
        }
        while (i < i2) {
            fVar = (f) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue() && fVar.n >= 0) {
                c(fVar.n);
                fVar.n = -1;
            }
            i++;
        }
        if (z2) {
            f();
        }
    }

    static boolean a(View view, Animation animation) {
        return VERSION.SDK_INT >= 19 && ah.g(view) == 0 && ah.z(view) && a(animation);
    }

    static boolean a(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return false;
        }
        List animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    private boolean a(String str, int i, int i2) {
        d();
        c(true);
        boolean a = a(this.w, this.x, str, i, i2);
        if (a) {
            this.d = true;
            try {
                b(this.w, this.x);
            } finally {
                w();
            }
        }
        e();
        return a;
    }

    public static int b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    private void b(android.support.v4.i.b<l> bVar) {
        if (this.m >= 1) {
            int min = Math.min(this.m, 4);
            boolean size = this.f == null ? false : this.f.size();
            for (boolean z = false; z < size; z++) {
                l lVar = (l) this.f.get(z);
                if (lVar.k < min) {
                    a(lVar, min, lVar.O(), lVar.P(), false);
                    if (!(lVar.P == null || lVar.H || !lVar.X)) {
                        bVar.add(lVar);
                    }
                }
            }
        }
    }

    private void b(View view, Animation animation) {
        if (view != null && animation != null && a(view, animation)) {
            AnimationListener animationListener;
            try {
                if (q == null) {
                    q = Animation.class.getDeclaredField("mListener");
                    q.setAccessible(true);
                }
                animationListener = (AnimationListener) q.get(animation);
            } catch (Throwable e) {
                Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
                animationListener = null;
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
                animationListener = null;
            }
            ah.a(view, 2, null);
            animation.setAnimationListener(new a(view, animation, animationListener));
        }
    }

    private void b(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2) {
        int i = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            }
            a((ArrayList) arrayList, (ArrayList) arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            while (i < size) {
                int i3;
                if (((f) arrayList.get(i)).u) {
                    i3 = i;
                } else {
                    if (i2 != i) {
                        a((ArrayList) arrayList, (ArrayList) arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((f) arrayList.get(i2)).u) {
                            i2++;
                        }
                    }
                    i3 = i2;
                    a((ArrayList) arrayList, (ArrayList) arrayList2, i, i3);
                    i2 = i3;
                    i3--;
                }
                i = i3 + 1;
            }
            if (i2 != size) {
                a((ArrayList) arrayList, (ArrayList) arrayList2, i2, size);
            }
        }
    }

    private static void b(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            f fVar = (f) arrayList.get(i);
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                fVar.f();
            } else {
                fVar.e();
            }
            i++;
        }
    }

    private void c(boolean z) {
        if (this.d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (Looper.myLooper() != this.n.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else {
            if (!z) {
                u();
            }
            if (this.w == null) {
                this.w = new ArrayList();
                this.x = new ArrayList();
            }
            a(null, null);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(java.util.ArrayList<android.support.v4.b.f> r5, java.util.ArrayList<java.lang.Boolean> r6) {
        /*
        r4 = this;
        r1 = 0;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = r4.c;	 Catch:{ all -> 0x003e }
        r0 = r0.size();	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        r0 = r1;
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r4.c;	 Catch:{ all -> 0x003e }
        r3 = r0.size();	 Catch:{ all -> 0x003e }
        r2 = r1;
    L_0x0018:
        if (r2 >= r3) goto L_0x0029;
    L_0x001a:
        r0 = r4.c;	 Catch:{ all -> 0x003e }
        r0 = r0.get(r2);	 Catch:{ all -> 0x003e }
        r0 = (android.support.v4.b.r.c) r0;	 Catch:{ all -> 0x003e }
        r0.a(r5, r6);	 Catch:{ all -> 0x003e }
        r0 = r2 + 1;
        r2 = r0;
        goto L_0x0018;
    L_0x0029:
        r0 = r4.c;	 Catch:{ all -> 0x003e }
        r0.clear();	 Catch:{ all -> 0x003e }
        r0 = r4.n;	 Catch:{ all -> 0x003e }
        r0 = r0.h();	 Catch:{ all -> 0x003e }
        r2 = r4.C;	 Catch:{ all -> 0x003e }
        r0.removeCallbacks(r2);	 Catch:{ all -> 0x003e }
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        if (r3 <= 0) goto L_0x0041;
    L_0x003c:
        r0 = 1;
        goto L_0x0010;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003e }
        throw r0;
    L_0x0041:
        r0 = r1;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.r.c(java.util.ArrayList, java.util.ArrayList):boolean");
    }

    public static int d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private l o(l lVar) {
        ViewGroup viewGroup = lVar.O;
        View view = lVar.P;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.f.indexOf(lVar) - 1; indexOf >= 0; indexOf--) {
            l lVar2 = (l) this.f.get(indexOf);
            if (lVar2.O == viewGroup && lVar2.P != null) {
                return lVar2;
            }
        }
        return null;
    }

    private void u() {
        if (this.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.u);
        }
    }

    private void v() {
        Object obj = 1;
        synchronized (this) {
            Object obj2 = (this.B == null || this.B.isEmpty()) ? null : 1;
            if (this.c == null || this.c.size() != 1) {
                obj = null;
            }
            if (!(obj2 == null && r0 == null)) {
                this.n.h().removeCallbacks(this.C);
                this.n.h().post(this.C);
            }
        }
    }

    private void w() {
        this.d = false;
        this.x.clear();
        this.w.clear();
    }

    private void x() {
        if (this.B != null) {
            while (!this.B.isEmpty()) {
                ((e) this.B.remove(0)).d();
            }
        }
    }

    private void y() {
        int size = this.e == null ? 0 : this.e.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.e.get(i);
            if (!(lVar == null || lVar.T() == null)) {
                int U = lVar.U();
                View T = lVar.T();
                lVar.a(null);
                Animation animation = T.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                a(lVar, U, 0, 0, false);
            }
        }
    }

    public int a(f fVar) {
        int size;
        synchronized (this) {
            if (this.k == null || this.k.size() <= 0) {
                if (this.j == null) {
                    this.j = new ArrayList();
                }
                size = this.j.size();
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + size + " to " + fVar);
                }
                this.j.add(fVar);
            } else {
                size = ((Integer) this.k.remove(this.k.size() - 1)).intValue();
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + size + " with " + fVar);
                }
                this.j.set(size, fVar);
            }
        }
        return size;
    }

    public android.support.v4.b.l.d a(l lVar) {
        if (lVar.n < 0) {
            a(new IllegalStateException("Fragment " + lVar + " is not currently in the FragmentManager"));
        }
        if (lVar.k <= 0) {
            return null;
        }
        Bundle n = n(lVar);
        return n != null ? new android.support.v4.b.l.d(n) : null;
    }

    public l a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.e.size()) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        l lVar = (l) this.e.get(i);
        if (lVar != null) {
            return lVar;
        }
        a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return lVar;
    }

    public l a(String str) {
        int size;
        l lVar;
        if (!(this.f == null || str == null)) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                lVar = (l) this.f.get(size);
                if (lVar != null && str.equals(lVar.G)) {
                    return lVar;
                }
            }
        }
        if (!(this.e == null || str == null)) {
            for (size = this.e.size() - 1; size >= 0; size--) {
                lVar = (l) this.e.get(size);
                if (lVar != null && str.equals(lVar.G)) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public x a() {
        return new f(this);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!l.b(this.n.g(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        l lVar;
        l b = resourceId != -1 ? b(resourceId) : null;
        if (b == null && string2 != null) {
            b = a(string2);
        }
        if (b == null && id != -1) {
            b = b(id);
        }
        if (a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + b);
        }
        if (b == null) {
            l a = l.a(context, string);
            a.v = true;
            a.E = resourceId != 0 ? resourceId : id;
            a.F = id;
            a.G = string2;
            a.w = true;
            a.z = this;
            a.A = this.n;
            a.a(this.n.g(), attributeSet, a.l);
            a(a, true);
            lVar = a;
        } else if (b.w) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            b.w = true;
            b.A = this.n;
            if (!b.K) {
                b.a(this.n.g(), attributeSet, b.l);
            }
            lVar = b;
        }
        if (this.m >= 1 || !lVar.v) {
            c(lVar);
        } else {
            a(lVar, 1, 0, 0, false);
        }
        if (lVar.P == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            lVar.P.setId(resourceId);
        }
        if (lVar.P.getTag() == null) {
            lVar.P.setTag(string2);
        }
        return lVar.P;
    }

    Animation a(l lVar, int i, boolean z, int i2) {
        Animation a = lVar.a(i, z, lVar.O());
        if (a != null) {
            return a;
        }
        if (lVar.O() != 0) {
            a = AnimationUtils.loadAnimation(this.n.g(), lVar.O());
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case 1:
                return a(this.n.g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return a(this.n.g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return a(this.n.g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return a(this.n.g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return a(this.n.g(), 0.0f, 1.0f);
            case 6:
                return a(this.n.g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.n.d()) {
                    i2 = this.n.e();
                }
                return i2 == 0 ? null : null;
        }
    }

    public void a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Bad id: " + i);
        }
        a(new d(this, null, i, i2), false);
    }

    public void a(int i, f fVar) {
        synchronized (this) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            int size = this.j.size();
            if (i < size) {
                if (a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + fVar);
                }
                this.j.set(i, fVar);
            } else {
                while (size < i) {
                    this.j.add(null);
                    if (this.k == null) {
                        this.k = new ArrayList();
                    }
                    if (a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.k.add(Integer.valueOf(size));
                    size++;
                }
                if (a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + fVar);
                }
                this.j.add(fVar);
            }
        }
    }

    void a(int i, boolean z) {
        if (this.n == null && i != 0) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.m) {
            this.m = i;
            if (this.e != null) {
                int size;
                int i2;
                int i3;
                l lVar;
                if (this.f != null) {
                    size = this.f.size();
                    i2 = 0;
                    i3 = 0;
                    while (i2 < size) {
                        lVar = (l) this.f.get(i2);
                        e(lVar);
                        i2++;
                        i3 = lVar.T != null ? lVar.T.a() | i3 : i3;
                    }
                } else {
                    i3 = 0;
                }
                size = this.e.size();
                i2 = 0;
                while (i2 < size) {
                    int a;
                    lVar = (l) this.e.get(i2);
                    if (lVar != null && ((lVar.u || lVar.I) && !lVar.X)) {
                        e(lVar);
                        if (lVar.T != null) {
                            a = lVar.T.a() | i3;
                            i2++;
                            i3 = a;
                        }
                    }
                    a = i3;
                    i2++;
                    i3 = a;
                }
                if (i3 == 0) {
                    c();
                }
                if (this.r && this.n != null && this.m == 5) {
                    this.n.c();
                    this.r = false;
                }
            }
        }
    }

    public void a(Configuration configuration) {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); i++) {
                l lVar = (l) this.f.get(i);
                if (lVar != null) {
                    lVar.a(configuration);
                }
            }
        }
    }

    public void a(Bundle bundle, String str, l lVar) {
        if (lVar.n < 0) {
            a(new IllegalStateException("Fragment " + lVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, lVar.n);
    }

    void a(Parcelable parcelable, s sVar) {
        if (parcelable != null) {
            t tVar = (t) parcelable;
            if (tVar.a != null) {
                List a;
                int size;
                int i;
                l lVar;
                List list;
                if (sVar != null) {
                    a = sVar.a();
                    List b = sVar.b();
                    if (a != null) {
                        size = a.size();
                    } else {
                        boolean z = false;
                    }
                    for (i = 0; i < size; i++) {
                        lVar = (l) a.get(i);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + lVar);
                        }
                        v vVar = tVar.a[lVar.n];
                        vVar.l = lVar;
                        lVar.m = null;
                        lVar.y = 0;
                        lVar.w = false;
                        lVar.t = false;
                        lVar.q = null;
                        if (vVar.k != null) {
                            vVar.k.setClassLoader(this.n.g().getClassLoader());
                            lVar.m = vVar.k.getSparseParcelableArray("android:view_state");
                            lVar.l = vVar.k;
                        }
                    }
                    list = b;
                } else {
                    list = null;
                }
                this.e = new ArrayList(tVar.a.length);
                if (this.g != null) {
                    this.g.clear();
                }
                int i2 = 0;
                while (i2 < tVar.a.length) {
                    v vVar2 = tVar.a[i2];
                    if (vVar2 != null) {
                        s sVar2 = (list == null || i2 >= list.size()) ? null : (s) list.get(i2);
                        lVar = vVar2.a(this.n, this.p, sVar2);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + lVar);
                        }
                        this.e.add(lVar);
                        vVar2.l = null;
                    } else {
                        this.e.add(null);
                        if (this.g == null) {
                            this.g = new ArrayList();
                        }
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.g.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (sVar != null) {
                    a = sVar.a();
                    if (a != null) {
                        i2 = a.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (i = 0; i < i2; i++) {
                        lVar = (l) a.get(i);
                        if (lVar.r >= 0) {
                            if (lVar.r < this.e.size()) {
                                lVar.q = (l) this.e.get(lVar.r);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + lVar + " target no longer exists: " + lVar.r);
                                lVar.q = null;
                            }
                        }
                    }
                }
                if (tVar.b != null) {
                    this.f = new ArrayList(tVar.b.length);
                    for (size = 0; size < tVar.b.length; size++) {
                        lVar = (l) this.e.get(tVar.b[size]);
                        if (lVar == null) {
                            a(new IllegalStateException("No instantiated fragment for index #" + tVar.b[size]));
                        }
                        lVar.t = true;
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + size + ": " + lVar);
                        }
                        if (this.f.contains(lVar)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f.add(lVar);
                    }
                } else {
                    this.f = null;
                }
                if (tVar.c != null) {
                    this.h = new ArrayList(tVar.c.length);
                    for (int i3 = 0; i3 < tVar.c.length; i3++) {
                        f a2 = tVar.c[i3].a(this);
                        if (a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a2.n + "): " + a2);
                            a2.a("  ", new PrintWriter(new android.support.v4.i.e("FragmentManager")), false);
                        }
                        this.h.add(a2);
                        if (a2.n >= 0) {
                            a(a2.n, a2);
                        }
                    }
                    return;
                }
                this.h = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(final android.support.v4.b.l r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r9 = 4;
        r6 = 3;
        r5 = 1;
        r7 = 0;
        r3 = 0;
        r0 = r11.t;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r11.I;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r12 <= r5) goto L_0x0010;
    L_0x000f:
        r12 = r5;
    L_0x0010:
        r0 = r11.u;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r11.k;
        if (r12 <= r0) goto L_0x001a;
    L_0x0018:
        r12 = r11.k;
    L_0x001a:
        r0 = r11.R;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r11.k;
        if (r0 >= r9) goto L_0x0025;
    L_0x0022:
        if (r12 <= r6) goto L_0x0025;
    L_0x0024:
        r12 = r6;
    L_0x0025:
        r0 = r11.k;
        if (r0 >= r12) goto L_0x0321;
    L_0x0029:
        r0 = r11.v;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r11.w;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r11.T();
        if (r0 == 0) goto L_0x0045;
    L_0x0038:
        r11.a(r7);
        r2 = r11.U();
        r0 = r10;
        r1 = r11;
        r4 = r3;
        r0.a(r1, r2, r3, r4, r5);
    L_0x0045:
        r0 = r11.k;
        switch(r0) {
            case 0: goto L_0x0085;
            case 1: goto L_0x0199;
            case 2: goto L_0x029a;
            case 3: goto L_0x029f;
            case 4: goto L_0x02c3;
            default: goto L_0x004a;
        };
    L_0x004a:
        r0 = r11.k;
        if (r0 == r12) goto L_0x0031;
    L_0x004e:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveToState: Fragment state for ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " not updated inline; ";
        r1 = r1.append(r2);
        r2 = "expected state ";
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r2 = " found ";
        r1 = r1.append(r2);
        r2 = r11.k;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r11.k = r12;
        goto L_0x0031;
    L_0x0085:
        r0 = a;
        if (r0 == 0) goto L_0x00a1;
    L_0x0089:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x00a1:
        r0 = r11.l;
        if (r0 == 0) goto L_0x00e9;
    L_0x00a5:
        r0 = r11.l;
        r1 = r10.n;
        r1 = r1.g();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r11.l;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r11.m = r0;
        r0 = r11.l;
        r1 = "android:target_state";
        r0 = r10.a(r0, r1);
        r11.q = r0;
        r0 = r11.q;
        if (r0 == 0) goto L_0x00d6;
    L_0x00cc:
        r0 = r11.l;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r11.s = r0;
    L_0x00d6:
        r0 = r11.l;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r11.S = r0;
        r0 = r11.S;
        if (r0 != 0) goto L_0x00e9;
    L_0x00e4:
        r11.R = r5;
        if (r12 <= r6) goto L_0x00e9;
    L_0x00e8:
        r12 = r6;
    L_0x00e9:
        r0 = r10.n;
        r11.A = r0;
        r0 = r10.p;
        r11.D = r0;
        r0 = r10.p;
        if (r0 == 0) goto L_0x0132;
    L_0x00f5:
        r0 = r10.p;
        r0 = r0.B;
    L_0x00f9:
        r11.z = r0;
        r0 = r10.n;
        r0 = r0.g();
        r10.a(r11, r0, r3);
        r11.N = r3;
        r0 = r10.n;
        r0 = r0.g();
        r11.a(r0);
        r0 = r11.N;
        if (r0 != 0) goto L_0x0139;
    L_0x0113:
        r0 = new android.support.v4.b.aw;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0132:
        r0 = r10.n;
        r0 = r0.i();
        goto L_0x00f9;
    L_0x0139:
        r0 = r11.D;
        if (r0 != 0) goto L_0x02ed;
    L_0x013d:
        r0 = r10.n;
        r0.b(r11);
    L_0x0142:
        r0 = r10.n;
        r0 = r0.g();
        r10.b(r11, r0, r3);
        r0 = r11.K;
        if (r0 != 0) goto L_0x02f4;
    L_0x014f:
        r0 = r11.l;
        r11.j(r0);
        r0 = r11.l;
        r10.a(r11, r0, r3);
    L_0x0159:
        r11.K = r3;
        r0 = r11.v;
        if (r0 == 0) goto L_0x0199;
    L_0x015f:
        r0 = r11.l;
        r0 = r11.b(r0);
        r1 = r11.l;
        r0 = r11.b(r0, r7, r1);
        r11.P = r0;
        r0 = r11.P;
        if (r0 == 0) goto L_0x0307;
    L_0x0171:
        r0 = r11.P;
        r11.Q = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x02fd;
    L_0x017b:
        r0 = r11.P;
        android.support.v4.view.ah.b(r0, r3);
    L_0x0180:
        r0 = r11.H;
        if (r0 == 0) goto L_0x018b;
    L_0x0184:
        r0 = r11.P;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x018b:
        r0 = r11.P;
        r1 = r11.l;
        r11.a(r0, r1);
        r0 = r11.P;
        r1 = r11.l;
        r10.a(r11, r0, r1, r3);
    L_0x0199:
        if (r12 <= r5) goto L_0x029a;
    L_0x019b:
        r0 = a;
        if (r0 == 0) goto L_0x01b7;
    L_0x019f:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x01b7:
        r0 = r11.v;
        if (r0 != 0) goto L_0x0285;
    L_0x01bb:
        r0 = r11.F;
        if (r0 == 0) goto L_0x0482;
    L_0x01bf:
        r0 = r11.F;
        r1 = -1;
        if (r0 != r1) goto L_0x01e5;
    L_0x01c4:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " for a container view with no id";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r10.a(r0);
    L_0x01e5:
        r0 = r10.o;
        r1 = r11.F;
        r0 = r0.a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0234;
    L_0x01f1:
        r1 = r11.x;
        if (r1 != 0) goto L_0x0234;
    L_0x01f5:
        r1 = r11.j();	 Catch:{ NotFoundException -> 0x030b }
        r2 = r11.F;	 Catch:{ NotFoundException -> 0x030b }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x030b }
    L_0x01ff:
        r2 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r8 = "No view found for id 0x";
        r4 = r4.append(r8);
        r8 = r11.F;
        r8 = java.lang.Integer.toHexString(r8);
        r4 = r4.append(r8);
        r8 = " (";
        r4 = r4.append(r8);
        r1 = r4.append(r1);
        r4 = ") for fragment ";
        r1 = r1.append(r4);
        r1 = r1.append(r11);
        r1 = r1.toString();
        r2.<init>(r1);
        r10.a(r2);
    L_0x0234:
        r11.O = r0;
        r1 = r11.l;
        r1 = r11.b(r1);
        r2 = r11.l;
        r1 = r11.b(r1, r0, r2);
        r11.P = r1;
        r1 = r11.P;
        if (r1 == 0) goto L_0x031d;
    L_0x0248:
        r1 = r11.P;
        r11.Q = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x0310;
    L_0x0252:
        r1 = r11.P;
        android.support.v4.view.ah.b(r1, r3);
    L_0x0257:
        if (r0 == 0) goto L_0x025e;
    L_0x0259:
        r1 = r11.P;
        r0.addView(r1);
    L_0x025e:
        r0 = r11.H;
        if (r0 == 0) goto L_0x0269;
    L_0x0262:
        r0 = r11.P;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0269:
        r0 = r11.P;
        r1 = r11.l;
        r11.a(r0, r1);
        r0 = r11.P;
        r1 = r11.l;
        r10.a(r11, r0, r1, r3);
        r0 = r11.P;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x031a;
    L_0x027f:
        r0 = r11.O;
        if (r0 == 0) goto L_0x031a;
    L_0x0283:
        r11.X = r5;
    L_0x0285:
        r0 = r11.l;
        r11.k(r0);
        r0 = r11.l;
        r10.b(r11, r0, r3);
        r0 = r11.P;
        if (r0 == 0) goto L_0x0298;
    L_0x0293:
        r0 = r11.l;
        r11.f(r0);
    L_0x0298:
        r11.l = r7;
    L_0x029a:
        r0 = 2;
        if (r12 <= r0) goto L_0x029f;
    L_0x029d:
        r11.k = r6;
    L_0x029f:
        if (r12 <= r6) goto L_0x02c3;
    L_0x02a1:
        r0 = a;
        if (r0 == 0) goto L_0x02bd;
    L_0x02a5:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02bd:
        r11.F();
        r10.b(r11, r3);
    L_0x02c3:
        if (r12 <= r9) goto L_0x004a;
    L_0x02c5:
        r0 = a;
        if (r0 == 0) goto L_0x02e1;
    L_0x02c9:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02e1:
        r11.G();
        r10.c(r11, r3);
        r11.l = r7;
        r11.m = r7;
        goto L_0x004a;
    L_0x02ed:
        r0 = r11.D;
        r0.a(r11);
        goto L_0x0142;
    L_0x02f4:
        r0 = r11.l;
        r11.h(r0);
        r11.k = r5;
        goto L_0x0159;
    L_0x02fd:
        r0 = r11.P;
        r0 = android.support.v4.b.ae.a(r0);
        r11.P = r0;
        goto L_0x0180;
    L_0x0307:
        r11.Q = r7;
        goto L_0x0199;
    L_0x030b:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x01ff;
    L_0x0310:
        r1 = r11.P;
        r1 = android.support.v4.b.ae.a(r1);
        r11.P = r1;
        goto L_0x0257;
    L_0x031a:
        r5 = r3;
        goto L_0x0283;
    L_0x031d:
        r11.Q = r7;
        goto L_0x0285;
    L_0x0321:
        r0 = r11.k;
        if (r0 <= r12) goto L_0x004a;
    L_0x0325:
        r0 = r11.k;
        switch(r0) {
            case 1: goto L_0x032c;
            case 2: goto L_0x03b8;
            case 3: goto L_0x0397;
            case 4: goto L_0x0373;
            case 5: goto L_0x034e;
            default: goto L_0x032a;
        };
    L_0x032a:
        goto L_0x004a;
    L_0x032c:
        if (r12 >= r5) goto L_0x004a;
    L_0x032e:
        r0 = r10.t;
        if (r0 == 0) goto L_0x0342;
    L_0x0332:
        r0 = r11.T();
        if (r0 == 0) goto L_0x0342;
    L_0x0338:
        r0 = r11.T();
        r11.a(r7);
        r0.clearAnimation();
    L_0x0342:
        r0 = r11.T();
        if (r0 == 0) goto L_0x043e;
    L_0x0348:
        r11.c(r12);
        r12 = r5;
        goto L_0x004a;
    L_0x034e:
        r0 = 5;
        if (r12 >= r0) goto L_0x0373;
    L_0x0351:
        r0 = a;
        if (r0 == 0) goto L_0x036d;
    L_0x0355:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x036d:
        r11.I();
        r10.d(r11, r3);
    L_0x0373:
        if (r12 >= r9) goto L_0x0397;
    L_0x0375:
        r0 = a;
        if (r0 == 0) goto L_0x0391;
    L_0x0379:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0391:
        r11.J();
        r10.e(r11, r3);
    L_0x0397:
        if (r12 >= r6) goto L_0x03b8;
    L_0x0399:
        r0 = a;
        if (r0 == 0) goto L_0x03b5;
    L_0x039d:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03b5:
        r11.K();
    L_0x03b8:
        r0 = 2;
        if (r12 >= r0) goto L_0x032c;
    L_0x03bb:
        r0 = a;
        if (r0 == 0) goto L_0x03d7;
    L_0x03bf:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03d7:
        r0 = r11.P;
        if (r0 == 0) goto L_0x03ea;
    L_0x03db:
        r0 = r10.n;
        r0 = r0.a(r11);
        if (r0 == 0) goto L_0x03ea;
    L_0x03e3:
        r0 = r11.m;
        if (r0 != 0) goto L_0x03ea;
    L_0x03e7:
        r10.m(r11);
    L_0x03ea:
        r11.L();
        r10.f(r11, r3);
        r0 = r11.P;
        if (r0 == 0) goto L_0x0436;
    L_0x03f4:
        r0 = r11.O;
        if (r0 == 0) goto L_0x0436;
    L_0x03f8:
        r0 = r10.m;
        if (r0 <= 0) goto L_0x0480;
    L_0x03fc:
        r0 = r10.t;
        if (r0 != 0) goto L_0x0480;
    L_0x0400:
        r0 = r11.P;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0480;
    L_0x0408:
        r0 = r11.Z;
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 < 0) goto L_0x0480;
    L_0x040f:
        r0 = r10.a(r11, r13, r3, r14);
    L_0x0413:
        r1 = 0;
        r11.Z = r1;
        if (r0 == 0) goto L_0x042f;
    L_0x0418:
        r1 = r11.P;
        r11.a(r1);
        r11.c(r12);
        r1 = r11.P;
        r2 = new android.support.v4.b.r$2;
        r2.<init>(r10, r1, r0, r11);
        r0.setAnimationListener(r2);
        r1 = r11.P;
        r1.startAnimation(r0);
    L_0x042f:
        r0 = r11.O;
        r1 = r11.P;
        r0.removeView(r1);
    L_0x0436:
        r11.O = r7;
        r11.P = r7;
        r11.Q = r7;
        goto L_0x032c;
    L_0x043e:
        r0 = a;
        if (r0 == 0) goto L_0x045a;
    L_0x0442:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x045a:
        r0 = r11.K;
        if (r0 != 0) goto L_0x0475;
    L_0x045e:
        r11.M();
        r10.g(r11, r3);
    L_0x0464:
        r11.N();
        r10.h(r11, r3);
        if (r15 != 0) goto L_0x004a;
    L_0x046c:
        r0 = r11.K;
        if (r0 != 0) goto L_0x0478;
    L_0x0470:
        r10.g(r11);
        goto L_0x004a;
    L_0x0475:
        r11.k = r3;
        goto L_0x0464;
    L_0x0478:
        r11.A = r7;
        r11.D = r7;
        r11.z = r7;
        goto L_0x004a;
    L_0x0480:
        r0 = r7;
        goto L_0x0413;
    L_0x0482:
        r0 = r7;
        goto L_0x0234;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.r.a(android.support.v4.b.l, int, int, int, boolean):void");
    }

    void a(l lVar, Context context, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).a(lVar, context, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).a((q) this, lVar, context);
                }
            }
        }
    }

    void a(l lVar, Bundle bundle, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).a(lVar, bundle, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).a((q) this, lVar, bundle);
                }
            }
        }
    }

    void a(l lVar, View view, Bundle bundle, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).a(lVar, view, bundle, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).a(this, lVar, view, bundle);
                }
            }
        }
    }

    public void a(l lVar, boolean z) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (a) {
            Log.v("FragmentManager", "add: " + lVar);
        }
        f(lVar);
        if (!lVar.I) {
            if (this.f.contains(lVar)) {
                throw new IllegalStateException("Fragment already added: " + lVar);
            }
            this.f.add(lVar);
            lVar.t = true;
            lVar.u = false;
            if (lVar.P == null) {
                lVar.Y = false;
            }
            if (lVar.L && lVar.M) {
                this.r = true;
            }
            if (z) {
                c(lVar);
            }
        }
    }

    public void a(p pVar, n nVar, l lVar) {
        if (this.n != null) {
            throw new IllegalStateException("Already attached");
        }
        this.n = pVar;
        this.o = nVar;
        this.p = lVar;
    }

    public void a(c cVar, boolean z) {
        if (!z) {
            u();
        }
        synchronized (this) {
            if (this.t || this.n == null) {
                throw new IllegalStateException("Activity has been destroyed");
            }
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(cVar);
            v();
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        l lVar;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.e != null) {
            size = this.e.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    lVar = (l) this.e.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(lVar);
                    if (lVar != null) {
                        lVar.a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f != null) {
            size = this.f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    lVar = (l) this.f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(lVar.toString());
                }
            }
        }
        if (this.i != null) {
            size = this.i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    lVar = (l) this.i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(lVar.toString());
                }
            }
        }
        if (this.h != null) {
            size = this.h.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    f fVar = (f) this.h.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(fVar.toString());
                    fVar.a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.j != null) {
                int size2 = this.j.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        fVar = (f) this.j.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(fVar);
                    }
                }
            }
            if (this.k != null && this.k.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.k.toArray()));
            }
        }
        if (this.c != null) {
            i = this.c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    c cVar = (c) this.c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(cVar);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.n);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.o);
        if (this.p != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.p);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.m);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.g != null && this.g.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.g.toArray()));
        }
    }

    public void a(boolean z) {
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                l lVar = (l) this.f.get(size);
                if (lVar != null) {
                    lVar.i(z);
                }
            }
        }
    }

    boolean a(int i) {
        return this.m >= i;
    }

    public boolean a(Menu menu) {
        if (this.f == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f.size(); i++) {
            l lVar = (l) this.f.get(i);
            if (lVar != null && lVar.c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        l lVar;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f.size()) {
                lVar = (l) this.f.get(i2);
                if (lVar != null && lVar.b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(lVar);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.i != null) {
            while (i < this.i.size()) {
                lVar = (l) this.i.get(i);
                if (arrayList == null || !arrayList.contains(lVar)) {
                    lVar.u();
                }
                i++;
            }
        }
        this.i = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.f == null) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            l lVar = (l) this.f.get(i);
            if (lVar != null && lVar.c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean a(ArrayList<f> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        if (this.h == null) {
            return false;
        }
        int size;
        if (str == null && i < 0 && (i2 & 1) == 0) {
            size = this.h.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.h.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            int size2;
            size = -1;
            if (str != null || i >= 0) {
                f fVar;
                size2 = this.h.size() - 1;
                while (size2 >= 0) {
                    fVar = (f) this.h.get(size2);
                    if ((str != null && str.equals(fVar.h())) || (i >= 0 && i == fVar.n)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    size2--;
                    while (size2 >= 0) {
                        fVar = (f) this.h.get(size2);
                        if ((str == null || !str.equals(fVar.h())) && (i < 0 || i != fVar.n)) {
                            break;
                        }
                        size2--;
                    }
                }
                size = size2;
            }
            if (size == this.h.size() - 1) {
                return false;
            }
            for (size2 = this.h.size() - 1; size2 > size; size2--) {
                arrayList.add(this.h.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    public l b(int i) {
        int size;
        l lVar;
        if (this.f != null) {
            for (size = this.f.size() - 1; size >= 0; size--) {
                lVar = (l) this.f.get(size);
                if (lVar != null && lVar.E == i) {
                    return lVar;
                }
            }
        }
        if (this.e != null) {
            for (size = this.e.size() - 1; size >= 0; size--) {
                lVar = (l) this.e.get(size);
                if (lVar != null && lVar.E == i) {
                    return lVar;
                }
            }
        }
        return null;
    }

    public l b(String str) {
        if (!(this.e == null || str == null)) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                l lVar = (l) this.e.get(size);
                if (lVar != null) {
                    lVar = lVar.a(str);
                    if (lVar != null) {
                        return lVar;
                    }
                }
            }
        }
        return null;
    }

    void b(f fVar) {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(fVar);
        f();
    }

    public void b(l lVar) {
        if (!lVar.R) {
            return;
        }
        if (this.d) {
            this.v = true;
            return;
        }
        lVar.R = false;
        a(lVar, this.m, 0, 0, false);
    }

    void b(l lVar, Context context, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).b(lVar, context, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).b((q) this, lVar, context);
                }
            }
        }
    }

    void b(l lVar, Bundle bundle, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).b(lVar, bundle, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).b((q) this, lVar, bundle);
                }
            }
        }
    }

    void b(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).b(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).a(this, lVar);
                }
            }
        }
    }

    public void b(c cVar, boolean z) {
        c(z);
        if (cVar.a(this.w, this.x)) {
            this.d = true;
            try {
                b(this.w, this.x);
            } finally {
                w();
            }
        }
        e();
    }

    public void b(Menu menu) {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); i++) {
                l lVar = (l) this.f.get(i);
                if (lVar != null) {
                    lVar.d(menu);
                }
            }
        }
    }

    public void b(boolean z) {
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                l lVar = (l) this.f.get(size);
                if (lVar != null) {
                    lVar.j(z);
                }
            }
        }
    }

    public boolean b() {
        u();
        return a(null, -1, 0);
    }

    public boolean b(MenuItem menuItem) {
        if (this.f == null) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            l lVar = (l) this.f.get(i);
            if (lVar != null && lVar.d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void c() {
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                l lVar = (l) this.e.get(i);
                if (lVar != null) {
                    b(lVar);
                }
            }
        }
    }

    public void c(int i) {
        synchronized (this) {
            this.j.set(i, null);
            if (this.k == null) {
                this.k = new ArrayList();
            }
            if (a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.k.add(Integer.valueOf(i));
        }
    }

    void c(l lVar) {
        a(lVar, this.m, 0, 0, false);
    }

    void c(l lVar, Bundle bundle, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).c(lVar, bundle, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).c(this, lVar, bundle);
                }
            }
        }
    }

    void c(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).c(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).b(this, lVar);
                }
            }
        }
    }

    void d(l lVar) {
        if (lVar.P != null) {
            Animation a = a(lVar, lVar.P(), !lVar.H, lVar.Q());
            if (a != null) {
                b(lVar.P, a);
                lVar.P.startAnimation(a);
                b(lVar.P, a);
                a.start();
            }
            int i = (!lVar.H || lVar.W()) ? 0 : 8;
            lVar.P.setVisibility(i);
            if (lVar.W()) {
                lVar.k(false);
            }
        }
        if (lVar.t && lVar.L && lVar.M) {
            this.r = true;
        }
        lVar.Y = false;
        lVar.c(lVar.H);
    }

    void d(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).d(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).c(this, lVar);
                }
            }
        }
    }

    public boolean d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r4 = this;
        r1 = 1;
        r4.c(r1);
        r0 = 0;
    L_0x0005:
        r2 = r4.w;
        r3 = r4.x;
        r2 = r4.c(r2, r3);
        if (r2 == 0) goto L_0x0022;
    L_0x000f:
        r4.d = r1;
        r0 = r4.w;	 Catch:{ all -> 0x001d }
        r2 = r4.x;	 Catch:{ all -> 0x001d }
        r4.b(r0, r2);	 Catch:{ all -> 0x001d }
        r4.w();
        r0 = r1;
        goto L_0x0005;
    L_0x001d:
        r0 = move-exception;
        r4.w();
        throw r0;
    L_0x0022:
        r4.e();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.r.d():boolean");
    }

    void e() {
        if (this.v) {
            int i = 0;
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                l lVar = (l) this.e.get(i2);
                if (!(lVar == null || lVar.T == null)) {
                    i |= lVar.T.a();
                }
            }
            if (i == 0) {
                this.v = false;
                c();
            }
        }
    }

    void e(l lVar) {
        if (lVar != null) {
            int i = this.m;
            if (lVar.u) {
                i = lVar.f() ? Math.min(i, 1) : Math.min(i, 0);
            }
            a(lVar, i, lVar.P(), lVar.Q(), false);
            if (lVar.P != null) {
                l o = o(lVar);
                if (o != null) {
                    View view = o.P;
                    ViewGroup viewGroup = lVar.O;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    i = viewGroup.indexOfChild(lVar.P);
                    if (i < indexOfChild) {
                        viewGroup.removeViewAt(i);
                        viewGroup.addView(lVar.P, indexOfChild);
                    }
                }
                if (lVar.X && lVar.O != null) {
                    if (VERSION.SDK_INT < 11) {
                        lVar.P.setVisibility(0);
                    } else if (lVar.Z > 0.0f) {
                        lVar.P.setAlpha(lVar.Z);
                    }
                    lVar.Z = 0.0f;
                    lVar.X = false;
                    Animation a = a(lVar, lVar.P(), true, lVar.Q());
                    if (a != null) {
                        b(lVar.P, a);
                        lVar.P.startAnimation(a);
                    }
                }
            }
            if (lVar.Y) {
                d(lVar);
            }
        }
    }

    void e(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).e(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).d(this, lVar);
                }
            }
        }
    }

    void f() {
        if (this.l != null) {
            for (int i = 0; i < this.l.size(); i++) {
                ((android.support.v4.b.q.b) this.l.get(i)).a();
            }
        }
    }

    void f(l lVar) {
        if (lVar.n < 0) {
            if (this.g == null || this.g.size() <= 0) {
                if (this.e == null) {
                    this.e = new ArrayList();
                }
                lVar.a(this.e.size(), this.p);
                this.e.add(lVar);
            } else {
                lVar.a(((Integer) this.g.remove(this.g.size() - 1)).intValue(), this.p);
                this.e.set(lVar.n, lVar);
            }
            if (a) {
                Log.v("FragmentManager", "Allocated fragment index " + lVar);
            }
        }
    }

    void f(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).f(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).e(this, lVar);
                }
            }
        }
    }

    s g() {
        List list;
        List list2;
        if (this.e != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.e.size()) {
                ArrayList arrayList;
                l lVar = (l) this.e.get(i);
                if (lVar != null) {
                    boolean z;
                    if (lVar.J) {
                        if (list2 == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(lVar);
                        lVar.K = true;
                        lVar.r = lVar.q != null ? lVar.q.n : -1;
                        if (a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + lVar);
                        }
                    }
                    if (lVar.B != null) {
                        s g = lVar.B.g();
                        if (g != null) {
                            ArrayList arrayList2;
                            if (list == null) {
                                arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < i; i2++) {
                                    arrayList2.add(null);
                                }
                            } else {
                                arrayList2 = list;
                            }
                            arrayList2.add(g);
                            list = arrayList2;
                            z = true;
                            if (!(list == null || r0)) {
                                list.add(null);
                            }
                        }
                    }
                    z = false;
                    list.add(null);
                }
                i++;
                Object obj = arrayList;
            }
        } else {
            list = null;
            list2 = null;
        }
        return (list2 == null && list == null) ? null : new s(list2, list);
    }

    void g(l lVar) {
        if (lVar.n >= 0) {
            if (a) {
                Log.v("FragmentManager", "Freeing fragment index " + lVar);
            }
            this.e.set(lVar.n, null);
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(Integer.valueOf(lVar.n));
            this.n.a(lVar.o);
            lVar.t();
        }
    }

    void g(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).g(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).f(this, lVar);
                }
            }
        }
    }

    Parcelable h() {
        g[] gVarArr = null;
        x();
        y();
        d();
        if (b) {
            this.s = true;
        }
        if (this.e == null || this.e.size() <= 0) {
            return null;
        }
        int size = this.e.size();
        v[] vVarArr = new v[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            l lVar = (l) this.e.get(i);
            if (lVar != null) {
                if (lVar.n < 0) {
                    a(new IllegalStateException("Failure saving state: active " + lVar + " has cleared index: " + lVar.n));
                }
                v vVar = new v(lVar);
                vVarArr[i] = vVar;
                if (lVar.k <= 0 || vVar.k != null) {
                    vVar.k = lVar.l;
                } else {
                    vVar.k = n(lVar);
                    if (lVar.q != null) {
                        if (lVar.q.n < 0) {
                            a(new IllegalStateException("Failure saving state: " + lVar + " has target not in fragment manager: " + lVar.q));
                        }
                        if (vVar.k == null) {
                            vVar.k = new Bundle();
                        }
                        a(vVar.k, "android:target_state", lVar.q);
                        if (lVar.s != 0) {
                            vVar.k.putInt("android:target_req_state", lVar.s);
                        }
                    }
                }
                if (a) {
                    Log.v("FragmentManager", "Saved state of " + lVar + ": " + vVar.k);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            int i2;
            t tVar;
            if (this.f != null) {
                i = this.f.size();
                if (i > 0) {
                    iArr = new int[i];
                    for (i2 = 0; i2 < i; i2++) {
                        iArr[i2] = ((l) this.f.get(i2)).n;
                        if (iArr[i2] < 0) {
                            a(new IllegalStateException("Failure saving state: active " + this.f.get(i2) + " has cleared index: " + iArr[i2]));
                        }
                        if (a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f.get(i2));
                        }
                    }
                    if (this.h != null) {
                        i = this.h.size();
                        if (i > 0) {
                            gVarArr = new g[i];
                            for (i2 = 0; i2 < i; i2++) {
                                gVarArr[i2] = new g((f) this.h.get(i2));
                                if (a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.h.get(i2));
                                }
                            }
                        }
                    }
                    tVar = new t();
                    tVar.a = vVarArr;
                    tVar.b = iArr;
                    tVar.c = gVarArr;
                    return tVar;
                }
            }
            iArr = null;
            if (this.h != null) {
                i = this.h.size();
                if (i > 0) {
                    gVarArr = new g[i];
                    for (i2 = 0; i2 < i; i2++) {
                        gVarArr[i2] = new g((f) this.h.get(i2));
                        if (a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.h.get(i2));
                        }
                    }
                }
            }
            tVar = new t();
            tVar.a = vVarArr;
            tVar.b = iArr;
            tVar.c = gVarArr;
            return tVar;
        } else if (!a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void h(l lVar) {
        if (a) {
            Log.v("FragmentManager", "remove: " + lVar + " nesting=" + lVar.y);
        }
        boolean z = !lVar.f();
        if (!lVar.I || z) {
            if (this.f != null) {
                this.f.remove(lVar);
            }
            if (lVar.L && lVar.M) {
                this.r = true;
            }
            lVar.t = false;
            lVar.u = true;
        }
    }

    void h(l lVar, boolean z) {
        if (this.p != null) {
            q k = this.p.k();
            if (k instanceof r) {
                ((r) k).h(lVar, true);
            }
        }
        if (this.H != null) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (!z || ((Boolean) iVar.b).booleanValue()) {
                    ((android.support.v4.b.q.a) iVar.a).g(this, lVar);
                }
            }
        }
    }

    public void i() {
        this.s = false;
    }

    public void i(l lVar) {
        boolean z = true;
        if (a) {
            Log.v("FragmentManager", "hide: " + lVar);
        }
        if (!lVar.H) {
            lVar.H = true;
            if (lVar.Y) {
                z = false;
            }
            lVar.Y = z;
        }
    }

    public void j() {
        this.s = false;
        a(1, false);
    }

    public void j(l lVar) {
        boolean z = false;
        if (a) {
            Log.v("FragmentManager", "show: " + lVar);
        }
        if (lVar.H) {
            lVar.H = false;
            if (!lVar.Y) {
                z = true;
            }
            lVar.Y = z;
        }
    }

    public void k() {
        this.s = false;
        a(2, false);
    }

    public void k(l lVar) {
        if (a) {
            Log.v("FragmentManager", "detach: " + lVar);
        }
        if (!lVar.I) {
            lVar.I = true;
            if (lVar.t) {
                if (this.f != null) {
                    if (a) {
                        Log.v("FragmentManager", "remove from detach: " + lVar);
                    }
                    this.f.remove(lVar);
                }
                if (lVar.L && lVar.M) {
                    this.r = true;
                }
                lVar.t = false;
            }
        }
    }

    public void l() {
        this.s = false;
        a(4, false);
    }

    public void l(l lVar) {
        if (a) {
            Log.v("FragmentManager", "attach: " + lVar);
        }
        if (lVar.I) {
            lVar.I = false;
            if (!lVar.t) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                if (this.f.contains(lVar)) {
                    throw new IllegalStateException("Fragment already added: " + lVar);
                }
                if (a) {
                    Log.v("FragmentManager", "add from attach: " + lVar);
                }
                this.f.add(lVar);
                lVar.t = true;
                if (lVar.L && lVar.M) {
                    this.r = true;
                }
            }
        }
    }

    public void m() {
        this.s = false;
        a(5, false);
    }

    void m(l lVar) {
        if (lVar.Q != null) {
            if (this.A == null) {
                this.A = new SparseArray();
            } else {
                this.A.clear();
            }
            lVar.Q.saveHierarchyState(this.A);
            if (this.A.size() > 0) {
                lVar.m = this.A;
                this.A = null;
            }
        }
    }

    Bundle n(l lVar) {
        Bundle bundle;
        if (this.z == null) {
            this.z = new Bundle();
        }
        lVar.l(this.z);
        c(lVar, this.z, false);
        if (this.z.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.z;
            this.z = null;
        }
        if (lVar.P != null) {
            m(lVar);
        }
        if (lVar.m != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", lVar.m);
        }
        if (!lVar.S) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", lVar.S);
        }
        return bundle;
    }

    public void n() {
        a(4, false);
    }

    public void o() {
        this.s = true;
        a(3, false);
    }

    public void p() {
        a(2, false);
    }

    public void q() {
        a(1, false);
    }

    public void r() {
        this.t = true;
        d();
        a(0, false);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    public void s() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); i++) {
                l lVar = (l) this.f.get(i);
                if (lVar != null) {
                    lVar.H();
                }
            }
        }
    }

    n t() {
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.p != null) {
            android.support.v4.i.d.a(this.p, stringBuilder);
        } else {
            android.support.v4.i.d.a(this.n, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
