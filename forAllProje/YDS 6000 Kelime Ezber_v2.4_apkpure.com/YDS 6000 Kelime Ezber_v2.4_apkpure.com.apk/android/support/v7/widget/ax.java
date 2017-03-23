package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.a.c;
import android.support.v4.view.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

public class ax extends b {
    final RecyclerView a;
    final b c = new b(this) {
        final /* synthetic */ ax a;

        {
            this.a = r1;
        }

        public void a(View view, c cVar) {
            super.a(view, cVar);
            if (!this.a.b() && this.a.a.getLayoutManager() != null) {
                this.a.a.getLayoutManager().a(view, cVar);
            }
        }

        public boolean a(View view, int i, Bundle bundle) {
            return super.a(view, i, bundle) ? true : (this.a.b() || this.a.a.getLayoutManager() == null) ? false : this.a.a.getLayoutManager().a(view, i, bundle);
        }
    };

    public ax(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public void a(View view, c cVar) {
        super.a(view, cVar);
        cVar.b(RecyclerView.class.getName());
        if (!b() && this.a.getLayoutManager() != null) {
            this.a.getLayoutManager().a(cVar);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !b()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        return super.a(view, i, bundle) ? true : (b() || this.a.getLayoutManager() == null) ? false : this.a.getLayoutManager().a(i, bundle);
    }

    boolean b() {
        return this.a.v();
    }

    public b c() {
        return this.c;
    }
}
