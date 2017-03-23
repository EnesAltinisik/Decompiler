package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.c.l;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.n;
import android.support.v7.widget.RecyclerView.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.cast.TextTrackStyle;
import com.google.android.gms.internal.zzamj;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends h {
    private final Runnable A = new Runnable(this) {
        final /* synthetic */ StaggeredGridLayoutManager a;

        {
            this.a = r1;
        }

        public void run() {
            this.a.I();
        }
    };
    am a;
    am b;
    boolean c = false;
    int d = -1;
    int e = zzamj.UNSET_ENUM_VALUE;
    LazySpanLookup f = new LazySpanLookup();
    private int g = -1;
    private c[] h;
    private int i;
    private int j;
    private final ah k;
    private boolean l = false;
    private BitSet m;
    private int n = 2;
    private boolean o;
    private boolean t;
    private SavedState u;
    private int v;
    private final Rect w = new Rect();
    private final a x = new a();
    private boolean y = false;
    private boolean z = true;

    static class LazySpanLookup {
        int[] a;
        List<FullSpanItem> b;

        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new Creator<FullSpanItem>() {
                public /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return a(parcel);
                }

                public /* synthetic */ Object[] newArray(int i) {
                    return a(i);
                }

                public FullSpanItem a(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] a(int i) {
                    return new FullSpanItem[i];
                }
            };
            int a;
            int b;
            int[] c;
            boolean d;

            public FullSpanItem(Parcel parcel) {
                boolean z = true;
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.d = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.c = new int[readInt];
                    parcel.readIntArray(this.c);
                }
            }

            int a(int i) {
                return this.c == null ? 0 : this.c[i];
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.d ? 1 : 0);
                if (this.c == null || this.c.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(this.c.length);
                parcel.writeIntArray(this.c);
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.a + ", mGapDir=" + this.b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.c) + '}';
            }
        }

        LazySpanLookup() {
        }

        int a(int i) {
            if (this.b != null) {
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.b.get(size)).a >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return b(i);
        }

        int b(int i) {
            if (this.a == null || i >= this.a.length) {
                return -1;
            }
            int g = g(i);
            if (g == -1) {
                Arrays.fill(this.a, i, this.a.length, -1);
                return this.a.length;
            }
            Arrays.fill(this.a, i, g + 1, -1);
            return g + 1;
        }

        int c(int i) {
            if (this.a == null || i >= this.a.length) {
                return -1;
            }
            return this.a[i];
        }

        void a(int i, c cVar) {
            e(i);
            this.a[i] = cVar.d;
        }

        int d(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        void e(int i) {
            if (this.a == null) {
                this.a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.a, -1);
            } else if (i >= this.a.length) {
                Object obj = this.a;
                this.a = new int[d(i)];
                System.arraycopy(obj, 0, this.a, 0, obj.length);
                Arrays.fill(this.a, obj.length, this.a.length, -1);
            }
        }

        void a() {
            if (this.a != null) {
                Arrays.fill(this.a, -1);
            }
            this.b = null;
        }

        void a(int i, int i2) {
            if (this.a != null && i < this.a.length) {
                e(i + i2);
                System.arraycopy(this.a, i + i2, this.a, i, (this.a.length - i) - i2);
                Arrays.fill(this.a, this.a.length - i2, this.a.length, -1);
                c(i, i2);
            }
        }

        private void c(int i, int i2) {
            if (this.b != null) {
                int i3 = i + i2;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                    if (fullSpanItem.a >= i) {
                        if (fullSpanItem.a < i3) {
                            this.b.remove(size);
                        } else {
                            fullSpanItem.a -= i2;
                        }
                    }
                }
            }
        }

        void b(int i, int i2) {
            if (this.a != null && i < this.a.length) {
                e(i + i2);
                System.arraycopy(this.a, i, this.a, i + i2, (this.a.length - i) - i2);
                Arrays.fill(this.a, i, i + i2, -1);
                d(i, i2);
            }
        }

        private void d(int i, int i2) {
            if (this.b != null) {
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                    if (fullSpanItem.a >= i) {
                        fullSpanItem.a += i2;
                    }
                }
            }
        }

        private int g(int i) {
            if (this.b == null) {
                return -1;
            }
            FullSpanItem f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (i2 < size) {
                if (((FullSpanItem) this.b.get(i2)).a >= i) {
                    break;
                }
                i2++;
            }
            i2 = -1;
            if (i2 == -1) {
                return -1;
            }
            f = (FullSpanItem) this.b.get(i2);
            this.b.remove(i2);
            return f.a;
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.b.get(i);
                if (fullSpanItem2.a == fullSpanItem.a) {
                    this.b.remove(i);
                }
                if (fullSpanItem2.a >= fullSpanItem.a) {
                    this.b.add(i, fullSpanItem);
                    return;
                }
            }
            this.b.add(fullSpanItem);
        }

        public FullSpanItem f(int i) {
            if (this.b == null) {
                return null;
            }
            for (int size = this.b.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(size);
                if (fullSpanItem.a == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem a(int i, int i2, int i3, boolean z) {
            if (this.b == null) {
                return null;
            }
            int size = this.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.b.get(i4);
                if (fullSpanItem.a >= i2) {
                    return null;
                }
                if (fullSpanItem.a >= i) {
                    if (i3 == 0 || fullSpanItem.b == i3) {
                        return fullSpanItem;
                    }
                    if (z && fullSpanItem.d) {
                        return fullSpanItem;
                    }
                }
            }
            return null;
        }
    }

    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return a(i);
            }

            public SavedState a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i) {
                return new SavedState[i];
            }
        };
        int a;
        int b;
        int c;
        int[] d;
        int e;
        int[] f;
        List<FullSpanItem> g;
        boolean h;
        boolean i;
        boolean j;

        SavedState(Parcel parcel) {
            boolean z;
            boolean z2 = true;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt();
            if (this.c > 0) {
                this.d = new int[this.c];
                parcel.readIntArray(this.d);
            }
            this.e = parcel.readInt();
            if (this.e > 0) {
                this.f = new int[this.e];
                parcel.readIntArray(this.f);
            }
            this.h = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.i = z;
            if (parcel.readInt() != 1) {
                z2 = false;
            }
            this.j = z2;
            this.g = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.a = savedState.a;
            this.b = savedState.b;
            this.d = savedState.d;
            this.e = savedState.e;
            this.f = savedState.f;
            this.h = savedState.h;
            this.i = savedState.i;
            this.j = savedState.j;
            this.g = savedState.g;
        }

        void a() {
            this.d = null;
            this.c = 0;
            this.e = 0;
            this.f = null;
            this.g = null;
        }

        void b() {
            this.d = null;
            this.c = 0;
            this.a = -1;
            this.b = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            int i3 = 1;
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.e);
            if (this.e > 0) {
                parcel.writeIntArray(this.f);
            }
            if (this.h) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            if (this.i) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            if (!this.j) {
                i3 = 0;
            }
            parcel.writeInt(i3);
            parcel.writeList(this.g);
        }
    }

    private class a {
        int a;
        int b;
        boolean c;
        boolean d;
        final /* synthetic */ StaggeredGridLayoutManager e;

        private a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.e = staggeredGridLayoutManager;
        }

        void a() {
            this.a = -1;
            this.b = zzamj.UNSET_ENUM_VALUE;
            this.c = false;
            this.d = false;
        }

        void b() {
            this.b = this.c ? this.e.a.d() : this.e.a.c();
        }

        void a(int i) {
            if (this.c) {
                this.b = this.e.a.d() - i;
            } else {
                this.b = this.e.a.c() + i;
            }
        }
    }

    public static class b extends i {
        c e;
        boolean f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public boolean a() {
            return this.f;
        }

        public final int b() {
            if (this.e == null) {
                return -1;
            }
            return this.e.d;
        }
    }

    class c {
        int a;
        int b;
        int c;
        final int d;
        final /* synthetic */ StaggeredGridLayoutManager e;
        private ArrayList<View> f;

        private c(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
            this.e = staggeredGridLayoutManager;
            this.f = new ArrayList();
            this.a = zzamj.UNSET_ENUM_VALUE;
            this.b = zzamj.UNSET_ENUM_VALUE;
            this.c = 0;
            this.d = i;
        }

        int a(int i) {
            if (this.a != zzamj.UNSET_ENUM_VALUE) {
                return this.a;
            }
            if (this.f.size() == 0) {
                return i;
            }
            a();
            return this.a;
        }

        void a() {
            View view = (View) this.f.get(0);
            b c = c(view);
            this.a = this.e.a.a(view);
            if (c.f) {
                FullSpanItem f = this.e.f.f(c.e());
                if (f != null && f.b == -1) {
                    this.a -= f.a(this.d);
                }
            }
        }

        int b() {
            if (this.a != zzamj.UNSET_ENUM_VALUE) {
                return this.a;
            }
            a();
            return this.a;
        }

        int b(int i) {
            if (this.b != zzamj.UNSET_ENUM_VALUE) {
                return this.b;
            }
            if (this.f.size() == 0) {
                return i;
            }
            c();
            return this.b;
        }

        void c() {
            View view = (View) this.f.get(this.f.size() - 1);
            b c = c(view);
            this.b = this.e.a.b(view);
            if (c.f) {
                FullSpanItem f = this.e.f.f(c.e());
                if (f != null && f.b == 1) {
                    this.b = f.a(this.d) + this.b;
                }
            }
        }

        int d() {
            if (this.b != zzamj.UNSET_ENUM_VALUE) {
                return this.b;
            }
            c();
            return this.b;
        }

        void a(View view) {
            b c = c(view);
            c.e = this;
            this.f.add(0, view);
            this.a = zzamj.UNSET_ENUM_VALUE;
            if (this.f.size() == 1) {
                this.b = zzamj.UNSET_ENUM_VALUE;
            }
            if (c.c() || c.d()) {
                this.c += this.e.a.c(view);
            }
        }

        void b(View view) {
            b c = c(view);
            c.e = this;
            this.f.add(view);
            this.b = zzamj.UNSET_ENUM_VALUE;
            if (this.f.size() == 1) {
                this.a = zzamj.UNSET_ENUM_VALUE;
            }
            if (c.c() || c.d()) {
                this.c += this.e.a.c(view);
            }
        }

        void a(boolean z, int i) {
            int b;
            if (z) {
                b = b((int) zzamj.UNSET_ENUM_VALUE);
            } else {
                b = a((int) zzamj.UNSET_ENUM_VALUE);
            }
            e();
            if (b != zzamj.UNSET_ENUM_VALUE) {
                if (z && b < this.e.a.d()) {
                    return;
                }
                if (z || b <= this.e.a.c()) {
                    if (i != zzamj.UNSET_ENUM_VALUE) {
                        b += i;
                    }
                    this.b = b;
                    this.a = b;
                }
            }
        }

        void e() {
            this.f.clear();
            f();
            this.c = 0;
        }

        void f() {
            this.a = zzamj.UNSET_ENUM_VALUE;
            this.b = zzamj.UNSET_ENUM_VALUE;
        }

        void c(int i) {
            this.a = i;
            this.b = i;
        }

        void g() {
            int size = this.f.size();
            View view = (View) this.f.remove(size - 1);
            b c = c(view);
            c.e = null;
            if (c.c() || c.d()) {
                this.c -= this.e.a.c(view);
            }
            if (size == 1) {
                this.a = zzamj.UNSET_ENUM_VALUE;
            }
            this.b = zzamj.UNSET_ENUM_VALUE;
        }

        void h() {
            View view = (View) this.f.remove(0);
            b c = c(view);
            c.e = null;
            if (this.f.size() == 0) {
                this.b = zzamj.UNSET_ENUM_VALUE;
            }
            if (c.c() || c.d()) {
                this.c -= this.e.a.c(view);
            }
            this.a = zzamj.UNSET_ENUM_VALUE;
        }

        public int i() {
            return this.c;
        }

        b c(View view) {
            return (b) view.getLayoutParams();
        }

        void d(int i) {
            if (this.a != zzamj.UNSET_ENUM_VALUE) {
                this.a += i;
            }
            if (this.b != zzamj.UNSET_ENUM_VALUE) {
                this.b += i;
            }
        }

        public View a(int i, int i2) {
            View view = null;
            int size;
            View view2;
            if (i2 == -1) {
                size = this.f.size();
                int i3 = 0;
                while (i3 < size) {
                    view2 = (View) this.f.get(i3);
                    if (!view2.isFocusable()) {
                        break;
                    }
                    boolean z;
                    if (this.e.d(view2) > i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.e.l) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
                return view;
            }
            size = this.f.size() - 1;
            while (size >= 0) {
                view2 = (View) this.f.get(size);
                if (!view2.isFocusable()) {
                    break;
                }
                Object obj;
                if (this.e.d(view2) > i) {
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != (!this.e.l ? 1 : null)) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z = true;
        android.support.v7.widget.RecyclerView.h.a a = h.a(context, attributeSet, i, i2);
        b(a.a);
        a(a.b);
        a(a.c);
        if (this.n == 0) {
            z = false;
        }
        c(z);
        this.k = new ah();
        m();
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        boolean z = true;
        this.i = i2;
        a(i);
        if (this.n == 0) {
            z = false;
        }
        c(z);
        this.k = new ah();
        m();
    }

    private void m() {
        this.a = am.a(this, this.i);
        this.b = am.a(this, 1 - this.i);
    }

    private boolean I() {
        if (t() == 0 || this.n == 0 || !o()) {
            return false;
        }
        int L;
        int M;
        if (this.c) {
            L = L();
            M = M();
        } else {
            L = M();
            M = L();
        }
        if (L == 0 && f() != null) {
            this.f.a();
            G();
            n();
            return true;
        } else if (!this.y) {
            return false;
        } else {
            int i = this.c ? -1 : 1;
            FullSpanItem a = this.f.a(L, M + 1, i, true);
            if (a == null) {
                this.y = false;
                this.f.a(M + 1);
                return false;
            }
            FullSpanItem a2 = this.f.a(L, a.a, i * -1, true);
            if (a2 == null) {
                this.f.a(a.a);
            } else {
                this.f.a(a2.a + 1);
            }
            G();
            n();
            return true;
        }
    }

    public void k(int i) {
        if (i == 0) {
            I();
        }
    }

    public void a(RecyclerView recyclerView, n nVar) {
        a(this.A);
        for (int i = 0; i < this.g; i++) {
            this.h[i].e();
        }
    }

    View f() {
        int i;
        int i2;
        int t = t() - 1;
        BitSet bitSet = new BitSet(this.g);
        bitSet.set(0, this.g, true);
        boolean z = (this.i == 1 && h()) ? true : true;
        if (this.c) {
            i = -1;
        } else {
            i = t + 1;
            t = 0;
        }
        if (t < i) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int i3 = t;
        while (i3 != i) {
            View h = h(i3);
            b bVar = (b) h.getLayoutParams();
            if (bitSet.get(bVar.e.d)) {
                if (a(bVar.e)) {
                    return h;
                }
                bitSet.clear(bVar.e.d);
            }
            if (!(bVar.f || i3 + i2 == i)) {
                boolean z2;
                View h2 = h(i3 + i2);
                int b;
                if (this.c) {
                    t = this.a.b(h);
                    b = this.a.b(h2);
                    if (t < b) {
                        return h;
                    }
                    if (t == b) {
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    t = this.a.a(h);
                    b = this.a.a(h2);
                    if (t > b) {
                        return h;
                    }
                    if (t == b) {
                        z2 = true;
                    }
                    z2 = false;
                }
                if (z2) {
                    if (bVar.e.d - ((b) h2.getLayoutParams()).e.d < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 != (z >= false)) {
                        return h;
                    }
                } else {
                    continue;
                }
            }
            i3 += i2;
        }
        return null;
    }

    private boolean a(c cVar) {
        boolean z = true;
        if (this.c) {
            if (cVar.d() < this.a.d()) {
                return !cVar.c((View) cVar.f.get(cVar.f.size() + -1)).f;
            }
        } else if (cVar.b() > this.a.c()) {
            if (cVar.c((View) cVar.f.get(0)).f) {
                z = false;
            }
            return z;
        }
        return false;
    }

    public void a(int i) {
        a(null);
        if (i != this.g) {
            g();
            this.g = i;
            this.m = new BitSet(this.g);
            this.h = new c[this.g];
            for (int i2 = 0; i2 < this.g; i2++) {
                this.h[i2] = new c(i2);
            }
            n();
        }
    }

    public void b(int i) {
        if (i == 0 || i == 1) {
            a(null);
            if (i != this.i) {
                this.i = i;
                am amVar = this.a;
                this.a = this.b;
                this.b = amVar;
                n();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void a(boolean z) {
        a(null);
        if (!(this.u == null || this.u.h == z)) {
            this.u.h = z;
        }
        this.l = z;
        n();
    }

    public void a(String str) {
        if (this.u == null) {
            super.a(str);
        }
    }

    public void g() {
        this.f.a();
        n();
    }

    private void J() {
        boolean z = true;
        if (this.i == 1 || !h()) {
            this.c = this.l;
            return;
        }
        if (this.l) {
            z = false;
        }
        this.c = z;
    }

    boolean h() {
        return r() == 1;
    }

    public void a(Rect rect, int i, int i2) {
        int A = A() + y();
        int z = z() + B();
        if (this.i == 1) {
            z = h.a(i2, z + rect.height(), E());
            A = h.a(i, A + (this.j * this.g), D());
        } else {
            A = h.a(i, A + rect.width(), D());
            z = h.a(i2, z + (this.j * this.g), E());
        }
        d(A, z);
    }

    public void c(n nVar, r rVar) {
        a(nVar, rVar, true);
    }

    private void a(n nVar, r rVar, boolean z) {
        a aVar = this.x;
        aVar.a();
        if (!(this.u == null && this.d == -1) && rVar.e() == 0) {
            c(nVar);
            return;
        }
        boolean z2;
        if (this.u != null) {
            a(aVar);
        } else {
            J();
            aVar.c = this.c;
        }
        a(rVar, aVar);
        if (this.u == null && !(aVar.c == this.o && h() == this.t)) {
            this.f.a();
            aVar.d = true;
        }
        if (t() > 0 && (this.u == null || this.u.c < 1)) {
            int i;
            if (aVar.d) {
                for (i = 0; i < this.g; i++) {
                    this.h[i].e();
                    if (aVar.b != zzamj.UNSET_ENUM_VALUE) {
                        this.h[i].c(aVar.b);
                    }
                }
            } else {
                for (i = 0; i < this.g; i++) {
                    this.h[i].a(this.c, aVar.b);
                }
            }
        }
        a(nVar);
        this.k.a = false;
        this.y = false;
        e(this.b.f());
        a(aVar.a, rVar);
        if (aVar.c) {
            l(-1);
            a(nVar, this.k, rVar);
            l(1);
            this.k.c = aVar.a + this.k.d;
            a(nVar, this.k, rVar);
        } else {
            l(1);
            a(nVar, this.k, rVar);
            l(-1);
            this.k.c = aVar.a + this.k.d;
            a(nVar, this.k, rVar);
        }
        K();
        if (t() > 0) {
            if (this.c) {
                b(nVar, rVar, true);
                c(nVar, rVar, false);
            } else {
                c(nVar, rVar, true);
                b(nVar, rVar, false);
            }
        }
        if (!z || rVar.a()) {
            z2 = false;
        } else {
            if (this.n == 0 || t() <= 0 || (!this.y && f() == null)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                a(this.A);
                if (I()) {
                    z2 = true;
                    this.d = -1;
                    this.e = zzamj.UNSET_ENUM_VALUE;
                }
            }
            z2 = false;
            this.d = -1;
            this.e = zzamj.UNSET_ENUM_VALUE;
        }
        this.o = aVar.c;
        this.t = h();
        this.u = null;
        if (z2) {
            a(nVar, rVar, false);
        }
    }

    private void K() {
        if (this.b.h() != 1073741824) {
            float f = 0.0f;
            int t = t();
            int i = 0;
            while (i < t) {
                float f2;
                View h = h(i);
                float c = (float) this.b.c(h);
                if (c < f) {
                    f2 = f;
                } else {
                    if (((b) h.getLayoutParams()).a()) {
                        f2 = (TextTrackStyle.DEFAULT_FONT_SCALE * c) / ((float) this.g);
                    } else {
                        f2 = c;
                    }
                    f2 = Math.max(f, f2);
                }
                i++;
                f = f2;
            }
            i = this.j;
            int round = Math.round(((float) this.g) * f);
            if (this.b.h() == zzamj.UNSET_ENUM_VALUE) {
                round = Math.min(round, this.b.f());
            }
            e(round);
            if (this.j != i) {
                for (int i2 = 0; i2 < t; i2++) {
                    View h2 = h(i2);
                    b bVar = (b) h2.getLayoutParams();
                    if (!bVar.f) {
                        if (h() && this.i == 1) {
                            h2.offsetLeftAndRight(((-((this.g - 1) - bVar.e.d)) * this.j) - ((-((this.g - 1) - bVar.e.d)) * i));
                        } else {
                            int i3 = bVar.e.d * this.j;
                            round = bVar.e.d * i;
                            if (this.i == 1) {
                                h2.offsetLeftAndRight(i3 - round);
                            } else {
                                h2.offsetTopAndBottom(i3 - round);
                            }
                        }
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        if (this.u.c > 0) {
            if (this.u.c == this.g) {
                for (int i = 0; i < this.g; i++) {
                    this.h[i].e();
                    int i2 = this.u.d[i];
                    if (i2 != zzamj.UNSET_ENUM_VALUE) {
                        if (this.u.i) {
                            i2 += this.a.d();
                        } else {
                            i2 += this.a.c();
                        }
                    }
                    this.h[i].c(i2);
                }
            } else {
                this.u.a();
                this.u.a = this.u.b;
            }
        }
        this.t = this.u.j;
        a(this.u.h);
        J();
        if (this.u.a != -1) {
            this.d = this.u.a;
            aVar.c = this.u.i;
        } else {
            aVar.c = this.c;
        }
        if (this.u.e > 1) {
            this.f.a = this.u.f;
            this.f.b = this.u.g;
        }
    }

    void a(r rVar, a aVar) {
        if (!b(rVar, aVar) && !c(rVar, aVar)) {
            aVar.b();
            aVar.a = 0;
        }
    }

    private boolean c(r rVar, a aVar) {
        aVar.a = this.o ? v(rVar.e()) : u(rVar.e());
        aVar.b = zzamj.UNSET_ENUM_VALUE;
        return true;
    }

    boolean b(r rVar, a aVar) {
        boolean z = false;
        if (rVar.a() || this.d == -1) {
            return false;
        }
        if (this.d < 0 || this.d >= rVar.e()) {
            this.d = -1;
            this.e = zzamj.UNSET_ENUM_VALUE;
            return false;
        } else if (this.u == null || this.u.a == -1 || this.u.c < 1) {
            View c = c(this.d);
            if (c != null) {
                aVar.a = this.c ? L() : M();
                if (this.e != zzamj.UNSET_ENUM_VALUE) {
                    if (aVar.c) {
                        aVar.b = (this.a.d() - this.e) - this.a.b(c);
                        return true;
                    }
                    aVar.b = (this.a.c() + this.e) - this.a.a(c);
                    return true;
                } else if (this.a.c(c) > this.a.f()) {
                    aVar.b = aVar.c ? this.a.d() : this.a.c();
                    return true;
                } else {
                    int a = this.a.a(c) - this.a.c();
                    if (a < 0) {
                        aVar.b = -a;
                        return true;
                    }
                    a = this.a.d() - this.a.b(c);
                    if (a < 0) {
                        aVar.b = a;
                        return true;
                    }
                    aVar.b = zzamj.UNSET_ENUM_VALUE;
                    return true;
                }
            }
            aVar.a = this.d;
            if (this.e == zzamj.UNSET_ENUM_VALUE) {
                if (t(aVar.a) == 1) {
                    z = true;
                }
                aVar.c = z;
                aVar.b();
            } else {
                aVar.a(this.e);
            }
            aVar.d = true;
            return true;
        } else {
            aVar.b = zzamj.UNSET_ENUM_VALUE;
            aVar.a = this.d;
            return true;
        }
    }

    void e(int i) {
        this.j = i / this.g;
        this.v = MeasureSpec.makeMeasureSpec(i, this.b.h());
    }

    public boolean b() {
        return this.u == null;
    }

    public int b(r rVar) {
        return a(rVar);
    }

    private int a(r rVar) {
        boolean z = false;
        if (t() == 0) {
            return 0;
        }
        am amVar = this.a;
        View a = a(!this.z, true);
        if (!this.z) {
            z = true;
        }
        return aq.a(rVar, amVar, a, b(z, true), this, this.z, this.c);
    }

    public int c(r rVar) {
        return a(rVar);
    }

    public int d(r rVar) {
        return h(rVar);
    }

    private int h(r rVar) {
        boolean z = false;
        if (t() == 0) {
            return 0;
        }
        am amVar = this.a;
        View a = a(!this.z, true);
        if (!this.z) {
            z = true;
        }
        return aq.a(rVar, amVar, a, b(z, true), this, this.z);
    }

    public int e(r rVar) {
        return h(rVar);
    }

    public int f(r rVar) {
        return i(rVar);
    }

    private int i(r rVar) {
        boolean z = false;
        if (t() == 0) {
            return 0;
        }
        am amVar = this.a;
        View a = a(!this.z, true);
        if (!this.z) {
            z = true;
        }
        return aq.b(rVar, amVar, a, b(z, true), this, this.z);
    }

    public int g(r rVar) {
        return i(rVar);
    }

    private void a(View view, b bVar, boolean z) {
        if (bVar.f) {
            if (this.i == 1) {
                a(view, this.v, h.a(x(), v(), 0, bVar.height, true), z);
            } else {
                a(view, h.a(w(), u(), 0, bVar.width, true), this.v, z);
            }
        } else if (this.i == 1) {
            a(view, h.a(this.j, u(), 0, bVar.width, false), h.a(x(), v(), 0, bVar.height, true), z);
        } else {
            a(view, h.a(w(), u(), 0, bVar.width, true), h.a(this.j, v(), 0, bVar.height, false), z);
        }
    }

    private void a(View view, int i, int i2, boolean z) {
        a(view, this.w);
        b bVar = (b) view.getLayoutParams();
        int b = b(i, bVar.leftMargin + this.w.left, bVar.rightMargin + this.w.right);
        int b2 = b(i2, bVar.topMargin + this.w.top, bVar.bottomMargin + this.w.bottom);
        if (z ? a(view, b, b2, (i) bVar) : b(view, b, b2, bVar)) {
            view.measure(b, b2);
        }
    }

    private int b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == zzamj.UNSET_ENUM_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.u = (SavedState) parcelable;
            n();
        }
    }

    public Parcelable c() {
        if (this.u != null) {
            return new SavedState(this.u);
        }
        SavedState savedState = new SavedState();
        savedState.h = this.l;
        savedState.i = this.o;
        savedState.j = this.t;
        if (this.f == null || this.f.a == null) {
            savedState.e = 0;
        } else {
            savedState.f = this.f.a;
            savedState.e = savedState.f.length;
            savedState.g = this.f.b;
        }
        if (t() > 0) {
            savedState.a = this.o ? L() : M();
            savedState.b = i();
            savedState.c = this.g;
            savedState.d = new int[this.g];
            for (int i = 0; i < this.g; i++) {
                int b;
                if (this.o) {
                    b = this.h[i].b((int) zzamj.UNSET_ENUM_VALUE);
                    if (b != zzamj.UNSET_ENUM_VALUE) {
                        b -= this.a.d();
                    }
                } else {
                    b = this.h[i].a((int) zzamj.UNSET_ENUM_VALUE);
                    if (b != zzamj.UNSET_ENUM_VALUE) {
                        b -= this.a.c();
                    }
                }
                savedState.d[i] = b;
            }
        } else {
            savedState.a = -1;
            savedState.b = -1;
            savedState.c = 0;
        }
        return savedState;
    }

    public void a(n nVar, r rVar, View view, android.support.v4.view.a.c cVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof b) {
            b bVar = (b) layoutParams;
            if (this.i == 0) {
                cVar.c(l.a(bVar.b(), bVar.f ? this.g : 1, -1, -1, bVar.f, false));
                return;
            } else {
                cVar.c(l.a(-1, -1, bVar.b(), bVar.f ? this.g : 1, bVar.f, false));
                return;
            }
        }
        super.a(view, cVar);
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (t() > 0) {
            android.support.v4.view.a.l a = android.support.v4.view.a.a.a(accessibilityEvent);
            View a2 = a(false, true);
            View b = b(false, true);
            if (a2 != null && b != null) {
                int d = d(a2);
                int d2 = d(b);
                if (d < d2) {
                    a.b(d);
                    a.c(d2);
                    return;
                }
                a.b(d2);
                a.c(d);
            }
        }
    }

    int i() {
        View b = this.c ? b(true, true) : a(true, true);
        return b == null ? -1 : d(b);
    }

    public int a(n nVar, r rVar) {
        if (this.i == 0) {
            return this.g;
        }
        return super.a(nVar, rVar);
    }

    public int b(n nVar, r rVar) {
        if (this.i == 1) {
            return this.g;
        }
        return super.b(nVar, rVar);
    }

    View a(boolean z, boolean z2) {
        int c = this.a.c();
        int d = this.a.d();
        int t = t();
        View view = null;
        for (int i = 0; i < t; i++) {
            View h = h(i);
            int a = this.a.a(h);
            if (this.a.b(h) > c && a < d) {
                if (a >= c || !z) {
                    return h;
                }
                if (z2 && view == null) {
                    view = h;
                }
            }
        }
        return view;
    }

    View b(boolean z, boolean z2) {
        int c = this.a.c();
        int d = this.a.d();
        View view = null;
        for (int t = t() - 1; t >= 0; t--) {
            View h = h(t);
            int a = this.a.a(h);
            int b = this.a.b(h);
            if (b > c && a < d) {
                if (b <= d || !z) {
                    return h;
                }
                if (z2 && view == null) {
                    view = h;
                }
            }
        }
        return view;
    }

    private void b(n nVar, r rVar, boolean z) {
        int q = q((int) zzamj.UNSET_ENUM_VALUE);
        if (q != zzamj.UNSET_ENUM_VALUE) {
            q = this.a.d() - q;
            if (q > 0) {
                q -= -c(-q, nVar, rVar);
                if (z && q > 0) {
                    this.a.a(q);
                }
            }
        }
    }

    private void c(n nVar, r rVar, boolean z) {
        int p = p((int) Strategy.TTL_SECONDS_INFINITE);
        if (p != Strategy.TTL_SECONDS_INFINITE) {
            p -= this.a.c();
            if (p > 0) {
                p -= c(p, nVar, rVar);
                if (z && p > 0) {
                    this.a.a(-p);
                }
            }
        }
    }

    private void a(int i, r rVar) {
        int c;
        int i2;
        ah ahVar;
        boolean z = false;
        this.k.b = 0;
        this.k.c = i;
        if (q()) {
            c = rVar.c();
            if (c != -1) {
                if (this.c == (c < i)) {
                    c = this.a.f();
                    i2 = 0;
                } else {
                    i2 = this.a.f();
                    c = 0;
                }
                if (p()) {
                    this.k.g = c + this.a.e();
                    this.k.f = -i2;
                } else {
                    this.k.f = this.a.c() - i2;
                    this.k.g = c + this.a.d();
                }
                this.k.h = false;
                this.k.a = true;
                ahVar = this.k;
                if (this.a.h() == 0 && this.a.e() == 0) {
                    z = true;
                }
                ahVar.i = z;
            }
        }
        c = 0;
        i2 = 0;
        if (p()) {
            this.k.g = c + this.a.e();
            this.k.f = -i2;
        } else {
            this.k.f = this.a.c() - i2;
            this.k.g = c + this.a.d();
        }
        this.k.h = false;
        this.k.a = true;
        ahVar = this.k;
        z = true;
        ahVar.i = z;
    }

    private void l(int i) {
        int i2 = 1;
        this.k.e = i;
        ah ahVar = this.k;
        if (this.c != (i == -1)) {
            i2 = -1;
        }
        ahVar.d = i2;
    }

    public void i(int i) {
        super.i(i);
        for (int i2 = 0; i2 < this.g; i2++) {
            this.h[i2].d(i);
        }
    }

    public void j(int i) {
        super.j(i);
        for (int i2 = 0; i2 < this.g; i2++) {
            this.h[i2].d(i);
        }
    }

    public void b(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 2);
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 1);
    }

    public void a(RecyclerView recyclerView) {
        this.f.a();
        n();
    }

    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        c(i, i2, 8);
    }

    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        c(i, i2, 4);
    }

    private void c(int i, int i2, int i3) {
        int i4;
        int i5;
        int L = this.c ? L() : M();
        if (i3 != 8) {
            i4 = i + i2;
            i5 = i;
        } else if (i < i2) {
            i4 = i2 + 1;
            i5 = i;
        } else {
            i4 = i + 1;
            i5 = i2;
        }
        this.f.b(i5);
        switch (i3) {
            case 1:
                this.f.b(i, i2);
                break;
            case 2:
                this.f.a(i, i2);
                break;
            case 8:
                this.f.a(i, 1);
                this.f.b(i2, 1);
                break;
        }
        if (i4 > L) {
            if (i5 <= (this.c ? M() : L())) {
                n();
            }
        }
    }

    private int a(n nVar, ah ahVar, r rVar) {
        int i;
        int d;
        int q;
        this.m.set(0, this.g, true);
        if (this.k.i) {
            i = ahVar.e == 1 ? Strategy.TTL_SECONDS_INFINITE : zzamj.UNSET_ENUM_VALUE;
        } else if (ahVar.e == 1) {
            i = ahVar.g + ahVar.b;
        } else {
            i = ahVar.f - ahVar.b;
        }
        e(ahVar.e, i);
        if (this.c) {
            d = this.a.d();
        } else {
            d = this.a.c();
        }
        Object obj = null;
        while (ahVar.a(rVar) && (this.k.i || !this.m.isEmpty())) {
            c cVar;
            int c;
            int c2;
            View a = ahVar.a(nVar);
            b bVar = (b) a.getLayoutParams();
            int e = bVar.e();
            int c3 = this.f.c(e);
            Object obj2 = c3 == -1 ? 1 : null;
            if (obj2 != null) {
                c a2 = bVar.f ? this.h[0] : a(ahVar);
                this.f.a(e, a2);
                cVar = a2;
            } else {
                cVar = this.h[c3];
            }
            bVar.e = cVar;
            if (ahVar.e == 1) {
                b(a);
            } else {
                b(a, 0);
            }
            a(a, bVar, false);
            if (ahVar.e == 1) {
                if (bVar.f) {
                    q = q(d);
                } else {
                    q = cVar.b(d);
                }
                c = q + this.a.c(a);
                if (obj2 == null || !bVar.f) {
                    c3 = q;
                } else {
                    FullSpanItem m = m(q);
                    m.b = -1;
                    m.a = e;
                    this.f.a(m);
                    c3 = q;
                }
            } else {
                if (bVar.f) {
                    q = p(d);
                } else {
                    q = cVar.a(d);
                }
                c3 = q - this.a.c(a);
                if (obj2 != null && bVar.f) {
                    FullSpanItem n = n(q);
                    n.b = 1;
                    n.a = e;
                    this.f.a(n);
                }
                c = q;
            }
            if (bVar.f && ahVar.d == -1) {
                if (obj2 != null) {
                    this.y = true;
                } else {
                    obj = ahVar.e == 1 ? !j() ? 1 : null : !l() ? 1 : null;
                    if (obj != null) {
                        FullSpanItem f = this.f.f(e);
                        if (f != null) {
                            f.d = true;
                        }
                        this.y = true;
                    }
                }
            }
            a(a, bVar, ahVar);
            if (h() && this.i == 1) {
                q = bVar.f ? this.b.d() : this.b.d() - (((this.g - 1) - cVar.d) * this.j);
                c2 = q - this.b.c(a);
                e = q;
            } else {
                q = bVar.f ? this.b.c() : (cVar.d * this.j) + this.b.c();
                e = q + this.b.c(a);
                c2 = q;
            }
            if (this.i == 1) {
                b(a, c2, c3, e, c);
            } else {
                b(a, c3, c2, c, e);
            }
            if (bVar.f) {
                e(this.k.e, i);
            } else {
                a(cVar, this.k.e, i);
            }
            a(nVar, this.k);
            if (this.k.h && a.isFocusable()) {
                if (bVar.f) {
                    this.m.clear();
                } else {
                    this.m.set(cVar.d, false);
                }
            }
            obj = 1;
        }
        if (obj == null) {
            a(nVar, this.k);
        }
        if (this.k.e == -1) {
            q = this.a.c() - p(this.a.c());
        } else {
            q = q(this.a.d()) - this.a.d();
        }
        return q > 0 ? Math.min(ahVar.b, q) : 0;
    }

    private FullSpanItem m(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.c = new int[this.g];
        for (int i2 = 0; i2 < this.g; i2++) {
            fullSpanItem.c[i2] = i - this.h[i2].b(i);
        }
        return fullSpanItem;
    }

    private FullSpanItem n(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.c = new int[this.g];
        for (int i2 = 0; i2 < this.g; i2++) {
            fullSpanItem.c[i2] = this.h[i2].a(i) - i;
        }
        return fullSpanItem;
    }

    private void a(View view, b bVar, ah ahVar) {
        if (ahVar.e == 1) {
            if (bVar.f) {
                p(view);
            } else {
                bVar.e.b(view);
            }
        } else if (bVar.f) {
            q(view);
        } else {
            bVar.e.a(view);
        }
    }

    private void a(n nVar, ah ahVar) {
        if (ahVar.a && !ahVar.i) {
            if (ahVar.b == 0) {
                if (ahVar.e == -1) {
                    b(nVar, ahVar.g);
                } else {
                    a(nVar, ahVar.f);
                }
            } else if (ahVar.e == -1) {
                r0 = ahVar.f - o(ahVar.f);
                if (r0 < 0) {
                    r0 = ahVar.g;
                } else {
                    r0 = ahVar.g - Math.min(r0, ahVar.b);
                }
                b(nVar, r0);
            } else {
                r0 = r(ahVar.g) - ahVar.g;
                if (r0 < 0) {
                    r0 = ahVar.f;
                } else {
                    r0 = Math.min(r0, ahVar.b) + ahVar.f;
                }
                a(nVar, r0);
            }
        }
    }

    private void p(View view) {
        for (int i = this.g - 1; i >= 0; i--) {
            this.h[i].b(view);
        }
    }

    private void q(View view) {
        for (int i = this.g - 1; i >= 0; i--) {
            this.h[i].a(view);
        }
    }

    private void b(View view, int i, int i2, int i3, int i4) {
        b bVar = (b) view.getLayoutParams();
        a(view, i + bVar.leftMargin, i2 + bVar.topMargin, i3 - bVar.rightMargin, i4 - bVar.bottomMargin);
    }

    private void e(int i, int i2) {
        for (int i3 = 0; i3 < this.g; i3++) {
            if (!this.h[i3].f.isEmpty()) {
                a(this.h[i3], i, i2);
            }
        }
    }

    private void a(c cVar, int i, int i2) {
        int i3 = cVar.i();
        if (i == -1) {
            if (i3 + cVar.b() <= i2) {
                this.m.set(cVar.d, false);
            }
        } else if (cVar.d() - i3 >= i2) {
            this.m.set(cVar.d, false);
        }
    }

    private int o(int i) {
        int a = this.h[0].a(i);
        for (int i2 = 1; i2 < this.g; i2++) {
            int a2 = this.h[i2].a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    private int p(int i) {
        int a = this.h[0].a(i);
        for (int i2 = 1; i2 < this.g; i2++) {
            int a2 = this.h[i2].a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    boolean j() {
        int b = this.h[0].b((int) zzamj.UNSET_ENUM_VALUE);
        for (int i = 1; i < this.g; i++) {
            if (this.h[i].b((int) zzamj.UNSET_ENUM_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    boolean l() {
        int a = this.h[0].a((int) zzamj.UNSET_ENUM_VALUE);
        for (int i = 1; i < this.g; i++) {
            if (this.h[i].a((int) zzamj.UNSET_ENUM_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    private int q(int i) {
        int b = this.h[0].b(i);
        for (int i2 = 1; i2 < this.g; i2++) {
            int b2 = this.h[i2].b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    private int r(int i) {
        int b = this.h[0].b(i);
        for (int i2 = 1; i2 < this.g; i2++) {
            int b2 = this.h[i2].b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    private void a(n nVar, int i) {
        while (t() > 0) {
            View h = h(0);
            if (this.a.b(h) <= i) {
                b bVar = (b) h.getLayoutParams();
                if (bVar.f) {
                    int i2 = 0;
                    while (i2 < this.g) {
                        if (this.h[i2].f.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (i2 = 0; i2 < this.g; i2++) {
                        this.h[i2].h();
                    }
                } else if (bVar.e.f.size() != 1) {
                    bVar.e.h();
                } else {
                    return;
                }
                a(h, nVar);
            } else {
                return;
            }
        }
    }

    private void b(n nVar, int i) {
        int t = t() - 1;
        while (t >= 0) {
            View h = h(t);
            if (this.a.a(h) >= i) {
                b bVar = (b) h.getLayoutParams();
                if (bVar.f) {
                    int i2 = 0;
                    while (i2 < this.g) {
                        if (this.h[i2].f.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (i2 = 0; i2 < this.g; i2++) {
                        this.h[i2].g();
                    }
                } else if (bVar.e.f.size() != 1) {
                    bVar.e.g();
                } else {
                    return;
                }
                a(h, nVar);
                t--;
            } else {
                return;
            }
        }
    }

    private boolean s(int i) {
        if (this.i == 0) {
            boolean z;
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.c) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.c) != h()) {
            return false;
        }
        return true;
    }

    private c a(ah ahVar) {
        int i;
        int i2;
        c cVar = null;
        int i3 = -1;
        if (s(ahVar.e)) {
            i = this.g - 1;
            i2 = -1;
        } else {
            i = 0;
            i2 = this.g;
            i3 = 1;
        }
        int c;
        int i4;
        c cVar2;
        int b;
        c cVar3;
        if (ahVar.e == 1) {
            c = this.a.c();
            i4 = i;
            i = Integer.MAX_VALUE;
            while (i4 != i2) {
                cVar2 = this.h[i4];
                b = cVar2.b(c);
                if (b < i) {
                    cVar3 = cVar2;
                } else {
                    b = i;
                    cVar3 = cVar;
                }
                i4 += i3;
                cVar = cVar3;
                i = b;
            }
        } else {
            c = this.a.d();
            i4 = i;
            i = Integer.MIN_VALUE;
            while (i4 != i2) {
                cVar2 = this.h[i4];
                b = cVar2.a(c);
                if (b > i) {
                    cVar3 = cVar2;
                } else {
                    b = i;
                    cVar3 = cVar;
                }
                i4 += i3;
                cVar = cVar3;
                i = b;
            }
        }
        return cVar;
    }

    public boolean e() {
        return this.i == 1;
    }

    public boolean d() {
        return this.i == 0;
    }

    public int a(int i, n nVar, r rVar) {
        return c(i, nVar, rVar);
    }

    public int b(int i, n nVar, r rVar) {
        return c(i, nVar, rVar);
    }

    private int t(int i) {
        int i2 = -1;
        if (t() != 0) {
            if ((i < M()) == this.c) {
                i2 = 1;
            }
            return i2;
        } else if (this.c) {
            return 1;
        } else {
            return -1;
        }
    }

    public void d(int i) {
        if (!(this.u == null || this.u.a == i)) {
            this.u.b();
        }
        this.d = i;
        this.e = zzamj.UNSET_ENUM_VALUE;
        n();
    }

    int c(int i, n nVar, r rVar) {
        int L;
        int i2;
        if (i > 0) {
            L = L();
            i2 = 1;
        } else {
            i2 = -1;
            L = M();
        }
        this.k.a = true;
        a(L, rVar);
        l(i2);
        this.k.c = this.k.d + L;
        int abs = Math.abs(i);
        this.k.b = abs;
        i2 = a(nVar, this.k, rVar);
        if (abs >= i2) {
            i = i < 0 ? -i2 : i2;
        }
        this.a.a(-i);
        this.o = this.c;
        return i;
    }

    private int L() {
        int t = t();
        return t == 0 ? 0 : d(h(t - 1));
    }

    private int M() {
        if (t() == 0) {
            return 0;
        }
        return d(h(0));
    }

    private int u(int i) {
        int t = t();
        for (int i2 = 0; i2 < t; i2++) {
            int d = d(h(i2));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    private int v(int i) {
        for (int t = t() - 1; t >= 0; t--) {
            int d = d(h(t));
            if (d >= 0 && d < i) {
                return d;
            }
        }
        return 0;
    }

    public i a() {
        if (this.i == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public i a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public i a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new b((MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public boolean a(i iVar) {
        return iVar instanceof b;
    }

    public View a(View view, int i, n nVar, r rVar) {
        int i2 = 0;
        if (t() == 0) {
            return null;
        }
        View e = e(view);
        if (e == null) {
            return null;
        }
        J();
        int w = w(i);
        if (w == zzamj.UNSET_ENUM_VALUE) {
            return null;
        }
        int L;
        View a;
        b bVar = (b) e.getLayoutParams();
        boolean z = bVar.f;
        c cVar = bVar.e;
        if (w == 1) {
            L = L();
        } else {
            L = M();
        }
        a(L, rVar);
        l(w);
        this.k.c = this.k.d + L;
        this.k.b = (int) (0.33333334f * ((float) this.a.f()));
        this.k.h = true;
        this.k.a = false;
        a(nVar, this.k, rVar);
        this.o = this.c;
        if (!z) {
            a = cVar.a(L, w);
            if (!(a == null || a == e)) {
                return a;
            }
        }
        if (s(w)) {
            for (int i3 = this.g - 1; i3 >= 0; i3--) {
                View a2 = this.h[i3].a(L, w);
                if (a2 != null && a2 != e) {
                    return a2;
                }
            }
        } else {
            while (i2 < this.g) {
                a = this.h[i2].a(L, w);
                if (a != null && a != e) {
                    return a;
                }
                i2++;
            }
        }
        return null;
    }

    private int w(int i) {
        int i2 = 1;
        int i3 = zzamj.UNSET_ENUM_VALUE;
        switch (i) {
            case 1:
                return -1;
            case 2:
                return 1;
            case 17:
                return this.i != 0 ? zzamj.UNSET_ENUM_VALUE : -1;
            case 33:
                return this.i != 1 ? zzamj.UNSET_ENUM_VALUE : -1;
            case 66:
                if (this.i != 0) {
                    i2 = Integer.MIN_VALUE;
                }
                return i2;
            case 130:
                if (this.i == 1) {
                    i3 = 1;
                }
                return i3;
            default:
                return zzamj.UNSET_ENUM_VALUE;
        }
    }
}
