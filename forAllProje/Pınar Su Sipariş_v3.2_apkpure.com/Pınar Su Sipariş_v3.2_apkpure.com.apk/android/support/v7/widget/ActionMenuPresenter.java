package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.a.a.g;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.m;
import android.support.v7.view.menu.p;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter extends android.support.v7.view.menu.b implements android.support.v4.view.d.a {
    private b A;
    final f g = new f();
    int h;
    private d i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private final SparseBooleanArray v = new SparseBooleanArray();
    private View w;
    private e x;
    private a y;
    private c z;

    private static class SavedState implements Parcelable {
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
        public int a;

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    private class a extends k {
        final /* synthetic */ ActionMenuPresenter c;
        private p d;

        public a(ActionMenuPresenter actionMenuPresenter, Context context, p pVar) {
            boolean z = false;
            this.c = actionMenuPresenter;
            super(context, pVar, null, false, android.support.v7.a.a.a.actionOverflowMenuStyle);
            this.d = pVar;
            if (!((h) pVar.getItem()).j()) {
                a(actionMenuPresenter.i == null ? (View) actionMenuPresenter.f : actionMenuPresenter.i);
            }
            a(actionMenuPresenter.g);
            int size = pVar.size();
            for (int i = 0; i < size; i++) {
                MenuItem item = pVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
            }
            a(z);
        }

        public void onDismiss() {
            super.onDismiss();
            this.c.y = null;
            this.c.h = 0;
        }
    }

    private class b extends android.support.v7.view.menu.ActionMenuItemView.b {
        final /* synthetic */ ActionMenuPresenter a;

        private b(ActionMenuPresenter actionMenuPresenter) {
            this.a = actionMenuPresenter;
        }

        public aj a() {
            return this.a.y != null ? this.a.y.e() : null;
        }
    }

    private class c implements Runnable {
        final /* synthetic */ ActionMenuPresenter a;
        private e b;

        public c(ActionMenuPresenter actionMenuPresenter, e eVar) {
            this.a = actionMenuPresenter;
            this.b = eVar;
        }

        public void run() {
            this.a.c.f();
            View view = (View) this.a.f;
            if (!(view == null || view.getWindowToken() == null || !this.b.f())) {
                this.a.x = this.b;
            }
            this.a.z = null;
        }
    }

    private class d extends p implements android.support.v7.widget.ActionMenuView.a {
        final /* synthetic */ ActionMenuPresenter a;
        private final float[] b = new float[2];

        public d(final ActionMenuPresenter actionMenuPresenter, Context context) {
            this.a = actionMenuPresenter;
            super(context, null, android.support.v7.a.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new android.support.v7.widget.aj.b(this, this) {
                final /* synthetic */ d b;

                public aj a() {
                    if (this.b.a.x == null) {
                        return null;
                    }
                    return this.b.a.x.e();
                }

                public boolean b() {
                    this.b.a.f();
                    return true;
                }

                public boolean c() {
                    if (this.b.a.z != null) {
                        return false;
                    }
                    this.b.a.g();
                    return true;
                }
            });
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                this.a.f();
            }
            return true;
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return false;
        }

        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                width = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                height = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                android.support.v4.c.a.a.a(background, width - max, height - max, width + max, height + max);
            }
            return frame;
        }
    }

    private class e extends k {
        final /* synthetic */ ActionMenuPresenter c;

        public e(ActionMenuPresenter actionMenuPresenter, Context context, android.support.v7.view.menu.f fVar, View view, boolean z) {
            this.c = actionMenuPresenter;
            super(context, fVar, view, z, android.support.v7.a.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(actionMenuPresenter.g);
        }

        public void onDismiss() {
            super.onDismiss();
            if (this.c.c != null) {
                this.c.c.close();
            }
            this.c.x = null;
        }
    }

    private class f implements android.support.v7.view.menu.l.a {
        final /* synthetic */ ActionMenuPresenter a;

        private f(ActionMenuPresenter actionMenuPresenter) {
            this.a = actionMenuPresenter;
        }

        public boolean onOpenSubMenu(android.support.v7.view.menu.f fVar) {
            if (fVar == null) {
                return false;
            }
            this.a.h = ((p) fVar).getItem().getItemId();
            android.support.v7.view.menu.l.a a = this.a.a();
            return a != null ? a.onOpenSubMenu(fVar) : false;
        }

        public void onCloseMenu(android.support.v7.view.menu.f fVar, boolean z) {
            if (fVar instanceof p) {
                ((p) fVar).p().a(false);
            }
            android.support.v7.view.menu.l.a a = this.a.a();
            if (a != null) {
                a.onCloseMenu(fVar, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, android.support.v7.a.a.h.abc_action_menu_layout, android.support.v7.a.a.h.abc_action_menu_item_layout);
    }

    public void a(Context context, android.support.v7.view.menu.f fVar) {
        super.a(context, fVar);
        Resources resources = context.getResources();
        android.support.v7.view.a a = android.support.v7.view.a.a(context);
        if (!this.m) {
            this.l = a.b();
        }
        if (!this.s) {
            this.n = a.c();
        }
        if (!this.q) {
            this.p = a.a();
        }
        int i = this.n;
        if (this.l) {
            if (this.i == null) {
                this.i = new d(this, this.a);
                if (this.k) {
                    this.i.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i;
        this.u = (int) (56.0f * resources.getDisplayMetrics().density);
        this.w = null;
    }

    public void a(Configuration configuration) {
        if (!this.q) {
            this.p = this.b.getResources().getInteger(g.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public void c(boolean z) {
        this.l = z;
        this.m = true;
    }

    public void d(boolean z) {
        this.t = z;
    }

    public void a(Drawable drawable) {
        if (this.i != null) {
            this.i.setImageDrawable(drawable);
            return;
        }
        this.k = true;
        this.j = drawable;
    }

    public Drawable e() {
        if (this.i != null) {
            return this.i.getDrawable();
        }
        if (this.k) {
            return this.j;
        }
        return null;
    }

    public m a(ViewGroup viewGroup) {
        m a = super.a(viewGroup);
        ((ActionMenuView) a).setPresenter(this);
        return a;
    }

    public View a(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.n()) {
            actionView = super.a(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public void a(h hVar, android.support.v7.view.menu.m.a aVar) {
        aVar.a(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f);
        if (this.A == null) {
            this.A = new b();
        }
        actionMenuItemView.setPopupCallback(this.A);
    }

    public boolean a(int i, h hVar) {
        return hVar.j();
    }

    public void b(boolean z) {
        int i;
        int i2 = 1;
        int i3 = 0;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f).getParent();
        if (viewGroup != null) {
            android.support.v7.g.a.a(viewGroup);
        }
        super.b(z);
        ((View) this.f).requestLayout();
        if (this.c != null) {
            ArrayList k = this.c.k();
            int size = k.size();
            for (i = 0; i < size; i++) {
                android.support.v4.view.d a = ((h) k.get(i)).a();
                if (a != null) {
                    a.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList l = this.c != null ? this.c.l() : null;
        if (this.l && l != null) {
            i = l.size();
            if (i == 1) {
                int i4;
                if (((h) l.get(0)).isActionViewExpanded()) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                i3 = i4;
            } else {
                if (i <= 0) {
                    i2 = 0;
                }
                i3 = i2;
            }
        }
        if (i3 != 0) {
            if (this.i == null) {
                this.i = new d(this, this.a);
            }
            viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup != this.f) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f;
                actionMenuView.addView(this.i, actionMenuView.c());
            }
        } else if (this.i != null && this.i.getParent() == this.f) {
            ((ViewGroup) this.f).removeView(this.i);
        }
        ((ActionMenuView) this.f).setOverflowReserved(this.l);
    }

    public boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    public boolean a(p pVar) {
        if (!pVar.hasVisibleItems()) {
            return false;
        }
        p pVar2 = pVar;
        while (pVar2.s() != this.c) {
            pVar2 = (p) pVar2.s();
        }
        View a = a(pVar2.getItem());
        if (a == null) {
            if (this.i == null) {
                return false;
            }
            a = this.i;
        }
        this.h = pVar.getItem().getItemId();
        this.y = new a(this, this.b, pVar);
        this.y.a(a);
        this.y.a();
        super.a(pVar);
        return true;
    }

    private View a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof android.support.v7.view.menu.m.a) && ((android.support.v7.view.menu.m.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public boolean f() {
        if (!this.l || j() || this.c == null || this.f == null || this.z != null || this.c.l().isEmpty()) {
            return false;
        }
        this.z = new c(this, new e(this, this.b, this.c, this.i, true));
        ((View) this.f).post(this.z);
        super.a(null);
        return true;
    }

    public boolean g() {
        if (this.z == null || this.f == null) {
            k kVar = this.x;
            if (kVar == null) {
                return false;
            }
            kVar.g();
            return true;
        }
        ((View) this.f).removeCallbacks(this.z);
        this.z = null;
        return true;
    }

    public boolean h() {
        return g() | i();
    }

    public boolean i() {
        if (this.y == null) {
            return false;
        }
        this.y.g();
        return true;
    }

    public boolean j() {
        return this.x != null && this.x.h();
    }

    public boolean k() {
        return this.z != null || j();
    }

    public boolean b() {
        int i;
        ArrayList i2 = this.c.i();
        int size = i2.size();
        int i3 = this.p;
        int i4 = this.o;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i5 = 0;
        int i6 = 0;
        Object obj = null;
        int i7 = 0;
        while (i7 < size) {
            h hVar = (h) i2.get(i7);
            if (hVar.l()) {
                i5++;
            } else if (hVar.k()) {
                i6++;
            } else {
                obj = 1;
            }
            if (this.t && hVar.isActionViewExpanded()) {
                i = 0;
            } else {
                i = i3;
            }
            i7++;
            i3 = i;
        }
        if (this.l && (r4 != null || i5 + i6 > i3)) {
            i3--;
        }
        i7 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = this.v;
        sparseBooleanArray.clear();
        i = 0;
        if (this.r) {
            i = i4 / this.u;
            i6 = ((i4 % this.u) / i) + this.u;
        } else {
            i6 = 0;
        }
        int i8 = 0;
        i3 = 0;
        int i9 = i;
        while (i8 < size) {
            hVar = (h) i2.get(i8);
            int i10;
            if (hVar.l()) {
                View a = a(hVar, this.w, viewGroup);
                if (this.w == null) {
                    this.w = a;
                }
                if (this.r) {
                    i9 -= ActionMenuView.a(a, i6, i9, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i5 = a.getMeasuredWidth();
                i10 = i4 - i5;
                if (i3 != 0) {
                    i5 = i3;
                }
                i3 = hVar.getGroupId();
                if (i3 != 0) {
                    sparseBooleanArray.put(i3, true);
                }
                hVar.d(true);
                i = i10;
                i3 = i7;
            } else if (hVar.k()) {
                boolean z;
                int groupId = hVar.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId);
                boolean z3 = (i7 > 0 || z2) && i4 > 0 && (!this.r || i9 > 0);
                if (z3) {
                    View a2 = a(hVar, this.w, viewGroup);
                    if (this.w == null) {
                        this.w = a2;
                    }
                    boolean z4;
                    if (this.r) {
                        int a3 = ActionMenuView.a(a2, i6, i9, makeMeasureSpec, 0);
                        i10 = i9 - a3;
                        if (a3 == 0) {
                            i9 = 0;
                        } else {
                            z4 = z3;
                        }
                        i5 = i10;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z5 = z3;
                        i5 = i9;
                        z4 = z5;
                    }
                    i10 = a2.getMeasuredWidth();
                    i4 -= i10;
                    if (i3 == 0) {
                        i3 = i10;
                    }
                    if (this.r) {
                        z = i9 & (i4 >= 0 ? 1 : 0);
                        i10 = i3;
                        i3 = i5;
                    } else {
                        z = i9 & (i4 + i3 > 0 ? 1 : 0);
                        i10 = i3;
                        i3 = i5;
                    }
                } else {
                    z = z3;
                    i10 = i3;
                    i3 = i9;
                }
                if (z && groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                    i9 = i7;
                } else if (z2) {
                    sparseBooleanArray.put(groupId, false);
                    i5 = i7;
                    for (i7 = 0; i7 < i8; i7++) {
                        h hVar2 = (h) i2.get(i7);
                        if (hVar2.getGroupId() == groupId) {
                            if (hVar2.j()) {
                                i5++;
                            }
                            hVar2.d(false);
                        }
                    }
                    i9 = i5;
                } else {
                    i9 = i7;
                }
                if (z) {
                    i9--;
                }
                hVar.d(z);
                i5 = i10;
                i = i4;
                int i11 = i3;
                i3 = i9;
                i9 = i11;
            } else {
                hVar.d(false);
                i5 = i3;
                i = i4;
                i3 = i7;
            }
            i8++;
            i4 = i;
            i7 = i3;
            i3 = i5;
        }
        return true;
    }

    public void a(android.support.v7.view.menu.f fVar, boolean z) {
        h();
        super.a(fVar, z);
    }

    public Parcelable d() {
        Parcelable savedState = new SavedState();
        savedState.a = this.h;
        return savedState;
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.a > 0) {
                MenuItem findItem = this.c.findItem(savedState.a);
                if (findItem != null) {
                    a((p) findItem.getSubMenu());
                }
            }
        }
    }

    public void a(boolean z) {
        if (z) {
            super.a(null);
        } else {
            this.c.a(false);
        }
    }

    public void a(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a(this.c);
    }
}
