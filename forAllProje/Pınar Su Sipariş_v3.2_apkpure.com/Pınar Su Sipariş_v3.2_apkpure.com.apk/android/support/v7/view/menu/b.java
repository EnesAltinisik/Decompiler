package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.view.ah;
import android.support.v7.view.menu.l.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements l {
    protected Context a;
    protected Context b;
    protected f c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    protected m f;
    private a g;
    private int h;
    private int i;
    private int j;

    public abstract void a(h hVar, m.a aVar);

    public b(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.h = i;
        this.i = i2;
    }

    public void a(Context context, f fVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = fVar;
    }

    public m a(ViewGroup viewGroup) {
        if (this.f == null) {
            this.f = (m) this.d.inflate(this.h, viewGroup, false);
            this.f.a(this.c);
            b(true);
        }
        return this.f;
    }

    public void b(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f;
        if (viewGroup != null) {
            int i;
            if (this.c != null) {
                this.c.j();
                ArrayList i2 = this.c.i();
                int size = i2.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    int i4;
                    h hVar = (h) i2.get(i3);
                    if (a(i, hVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        h itemData = childAt instanceof m.a ? ((m.a) childAt).getItemData() : null;
                        View a = a(hVar, childAt, viewGroup);
                        if (hVar != itemData) {
                            a.setPressed(false);
                            ah.w(a);
                        }
                        if (a != childAt) {
                            a(a, i);
                        }
                        i4 = i + 1;
                    } else {
                        i4 = i;
                    }
                    i3++;
                    i = i4;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    protected void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f).addView(view, i);
    }

    protected boolean a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public void a(a aVar) {
        this.g = aVar;
    }

    public a a() {
        return this.g;
    }

    public m.a b(ViewGroup viewGroup) {
        return (m.a) this.d.inflate(this.i, viewGroup, false);
    }

    public View a(h hVar, View view, ViewGroup viewGroup) {
        m.a aVar;
        if (view instanceof m.a) {
            aVar = (m.a) view;
        } else {
            aVar = b(viewGroup);
        }
        a(hVar, aVar);
        return (View) aVar;
    }

    public boolean a(int i, h hVar) {
        return true;
    }

    public void a(f fVar, boolean z) {
        if (this.g != null) {
            this.g.onCloseMenu(fVar, z);
        }
    }

    public boolean a(p pVar) {
        if (this.g != null) {
            return this.g.onOpenSubMenu(pVar);
        }
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean a(f fVar, h hVar) {
        return false;
    }

    public boolean b(f fVar, h hVar) {
        return false;
    }

    public int c() {
        return this.j;
    }

    public void a(int i) {
        this.j = i;
    }
}
