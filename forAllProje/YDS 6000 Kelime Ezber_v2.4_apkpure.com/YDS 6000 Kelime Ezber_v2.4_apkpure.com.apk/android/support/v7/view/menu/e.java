package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ah;
import android.support.v4.view.f;
import android.support.v7.appcompat.R;
import android.support.v7.widget.at;
import android.support.v7.widget.au;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

final class e extends m implements o, OnKeyListener, OnDismissListener {
    final Handler a;
    final List<a> b = new ArrayList();
    View c;
    boolean d;
    private final Context e;
    private final int f;
    private final int g;
    private final int h;
    private final boolean i;
    private final List<h> j = new LinkedList();
    private final OnGlobalLayoutListener k = new OnGlobalLayoutListener(this) {
        final /* synthetic */ e a;

        {
            this.a = r1;
        }

        public void onGlobalLayout() {
            if (this.a.f() && this.a.b.size() > 0 && !((a) this.a.b.get(0)).a.c()) {
                View view = this.a.c;
                if (view == null || !view.isShown()) {
                    this.a.e();
                    return;
                }
                for (a aVar : this.a.b) {
                    aVar.a.d();
                }
            }
        }
    };
    private final at l = new at(this) {
        final /* synthetic */ e a;

        {
            this.a = r1;
        }

        public void a(h hVar, MenuItem menuItem) {
            this.a.a.removeCallbacksAndMessages(hVar);
        }

        public void b(final h hVar, final MenuItem menuItem) {
            int i;
            this.a.a.removeCallbacksAndMessages(null);
            int size = this.a.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (hVar == ((a) this.a.b.get(i2)).b) {
                    i = i2;
                    break;
                }
            }
            i = -1;
            if (i != -1) {
                i++;
                final a aVar = i < this.a.b.size() ? (a) this.a.b.get(i) : null;
                this.a.a.postAtTime(new Runnable(this) {
                    final /* synthetic */ AnonymousClass2 d;

                    public void run() {
                        if (aVar != null) {
                            this.d.a.d = true;
                            aVar.b.b(false);
                            this.d.a.d = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.a(menuItem, 0);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };
    private int m = 0;
    private int n = 0;
    private View o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private android.support.v7.view.menu.o.a w;
    private ViewTreeObserver x;
    private OnDismissListener y;

    private static class a {
        public final au a;
        public final h b;
        public final int c;

        public a(au auVar, h hVar, int i) {
            this.a = auVar;
            this.b = hVar;
            this.c = i;
        }

        public ListView a() {
            return this.a.g();
        }
    }

    public e(Context context, View view, int i, int i2, boolean z) {
        this.e = context;
        this.o = view;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.u = false;
        this.p = k();
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private MenuItem a(h hVar, h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(a aVar, h hVar) {
        int i = 0;
        MenuItem a = a(aVar.b, hVar);
        if (a == null) {
            return null;
        }
        int headersCount;
        g gVar;
        int i2;
        ListView a2 = aVar.a();
        ListAdapter adapter = a2.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            gVar = (g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (g) adapter;
            headersCount = 0;
        }
        int count = gVar.getCount();
        while (i < count) {
            if (a == gVar.a(i)) {
                i2 = i;
                break;
            }
            i++;
        }
        i2 = -1;
        if (i2 == -1) {
            return null;
        }
        i2 = (i2 + headersCount) - a2.getFirstVisiblePosition();
        return (i2 < 0 || i2 >= a2.getChildCount()) ? null : a2.getChildAt(i2);
    }

    private void c(h hVar) {
        View a;
        a aVar;
        LayoutInflater from = LayoutInflater.from(this.e);
        Object gVar = new g(hVar, from, this.i);
        if (!f() && this.u) {
            gVar.a(true);
        } else if (f()) {
            gVar.a(m.b(hVar));
        }
        int a2 = m.a(gVar, null, this.e, this.f);
        au j = j();
        j.a((ListAdapter) gVar);
        j.g(a2);
        j.e(this.n);
        if (this.b.size() > 0) {
            a aVar2 = (a) this.b.get(this.b.size() - 1);
            a = a(aVar2, hVar);
            aVar = aVar2;
        } else {
            a = null;
            aVar = null;
        }
        if (a != null) {
            j.b(false);
            j.a(null);
            int d = d(a2);
            boolean z = d == 1;
            this.p = d;
            int[] iArr = new int[2];
            a.getLocationInWindow(iArr);
            int j2 = aVar.a.j() + iArr[0];
            int k = iArr[1] + aVar.a.k();
            int width = (this.n & 5) == 5 ? z ? j2 + a2 : j2 - a.getWidth() : z ? a.getWidth() + j2 : j2 - a2;
            j.c(width);
            j.d(k);
        } else {
            if (this.q) {
                j.c(this.s);
            }
            if (this.r) {
                j.d(this.t);
            }
            j.a(i());
        }
        this.b.add(new a(j, hVar, this.p));
        j.d();
        if (aVar == null && this.v && hVar.m() != null) {
            ViewGroup g = j.g();
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(hVar.m());
            g.addHeaderView(frameLayout, null, false);
            j.d();
        }
    }

    private int d(int i) {
        ListView a = ((a) this.b.get(this.b.size() - 1)).a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.c.getWindowVisibleDisplayFrame(rect);
        if (this.p != 1) {
            return iArr[0] - i < 0 ? 1 : 0;
        } else {
            return (a.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
    }

    private int d(h hVar) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (hVar == ((a) this.b.get(i)).b) {
                return i;
            }
        }
        return -1;
    }

    private au j() {
        au auVar = new au(this.e, null, this.g, this.h);
        auVar.a(this.l);
        auVar.a((OnItemClickListener) this);
        auVar.a((OnDismissListener) this);
        auVar.b(this.o);
        auVar.e(this.n);
        auVar.a(true);
        return auVar;
    }

    private int k() {
        return ah.h(this.o) == 1 ? 0 : 1;
    }

    public void a(int i) {
        if (this.m != i) {
            this.m = i;
            this.n = f.a(i, ah.h(this.o));
        }
    }

    public void a(Parcelable parcelable) {
    }

    public void a(h hVar) {
        hVar.a((o) this, this.e);
        if (f()) {
            c(hVar);
        } else {
            this.j.add(hVar);
        }
    }

    public void a(h hVar, boolean z) {
        int d = d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.b.size()) {
                ((a) this.b.get(i)).b.b(false);
            }
            a aVar = (a) this.b.remove(d);
            aVar.b.b((o) this);
            if (this.d) {
                aVar.a.b(null);
                aVar.a.b(0);
            }
            aVar.a.e();
            d = this.b.size();
            if (d > 0) {
                this.p = ((a) this.b.get(d - 1)).c;
            } else {
                this.p = k();
            }
            if (d == 0) {
                e();
                if (this.w != null) {
                    this.w.a(hVar, true);
                }
                if (this.x != null) {
                    if (this.x.isAlive()) {
                        this.x.removeGlobalOnLayoutListener(this.k);
                    }
                    this.x = null;
                }
                this.y.onDismiss();
            } else if (z) {
                ((a) this.b.get(0)).b.b(false);
            }
        }
    }

    public void a(android.support.v7.view.menu.o.a aVar) {
        this.w = aVar;
    }

    public void a(View view) {
        if (this.o != view) {
            this.o = view;
            this.n = f.a(this.m, ah.h(this.o));
        }
    }

    public void a(OnDismissListener onDismissListener) {
        this.y = onDismissListener;
    }

    public void a(boolean z) {
        for (a a : this.b) {
            m.a(a.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean a() {
        return false;
    }

    public boolean a(u uVar) {
        for (a aVar : this.b) {
            if (uVar == aVar.b) {
                aVar.a().requestFocus();
                return true;
            }
        }
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        a((h) uVar);
        if (this.w != null) {
            this.w.a(uVar);
        }
        return true;
    }

    public void b(int i) {
        this.q = true;
        this.s = i;
    }

    public void b(boolean z) {
        this.u = z;
    }

    public Parcelable c() {
        return null;
    }

    public void c(int i) {
        this.r = true;
        this.t = i;
    }

    public void c(boolean z) {
        this.v = z;
    }

    public void d() {
        if (!f()) {
            for (h c : this.j) {
                c(c);
            }
            this.j.clear();
            this.c = this.o;
            if (this.c != null) {
                Object obj = this.x == null ? 1 : null;
                this.x = this.c.getViewTreeObserver();
                if (obj != null) {
                    this.x.addOnGlobalLayoutListener(this.k);
                }
            }
        }
    }

    public void e() {
        int size = this.b.size();
        if (size > 0) {
            a[] aVarArr = (a[]) this.b.toArray(new a[size]);
            for (size--; size >= 0; size--) {
                a aVar = aVarArr[size];
                if (aVar.a.f()) {
                    aVar.a.e();
                }
            }
        }
    }

    public boolean f() {
        return this.b.size() > 0 && ((a) this.b.get(0)).a.f();
    }

    public ListView g() {
        return this.b.isEmpty() ? null : ((a) this.b.get(this.b.size() - 1)).a();
    }

    protected boolean h() {
        return false;
    }

    public void onDismiss() {
        a aVar;
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            aVar = (a) this.b.get(i);
            if (!aVar.a.f()) {
                break;
            }
        }
        aVar = null;
        if (aVar != null) {
            aVar.b.b(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        e();
        return true;
    }
}
