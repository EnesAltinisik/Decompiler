package android.support.v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.e.a.b;
import android.support.v4.h.j;
import android.support.v7.view.menu.n;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
/* compiled from: SupportActionModeWrapper */
public class f extends ActionMode {
    final Context a;
    final b b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements android.support.v7.view.b.a {
        final Callback a;
        final Context b;
        final ArrayList<f> c = new ArrayList();
        final j<Menu, Menu> d = new j();

        public a(Context context, Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public boolean onCreateActionMode(b bVar, Menu menu) {
            return this.a.onCreateActionMode(a(bVar), a(menu));
        }

        public boolean onPrepareActionMode(b bVar, Menu menu) {
            return this.a.onPrepareActionMode(a(bVar), a(menu));
        }

        public boolean onActionItemClicked(b bVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(a(bVar), n.a(this.b, (b) menuItem));
        }

        public void onDestroyActionMode(b bVar) {
            this.a.onDestroyActionMode(a(bVar));
        }

        private Menu a(Menu menu) {
            Menu menu2 = (Menu) this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            menu2 = n.a(this.b, (android.support.v4.e.a.a) menu);
            this.d.put(menu, menu2);
            return menu2;
        }

        public ActionMode a(b bVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                f fVar = (f) this.c.get(i);
                if (fVar != null && fVar.b == bVar) {
                    return fVar;
                }
            }
            ActionMode fVar2 = new f(this.b, bVar);
            this.c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public Object getTag() {
        return this.b.getTag();
    }

    public void setTag(Object obj) {
        this.b.setTag(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    public void invalidate() {
        this.b.invalidate();
    }

    public void finish() {
        this.b.finish();
    }

    public Menu getMenu() {
        return n.a(this.a, (android.support.v4.e.a.a) this.b.getMenu());
    }

    public CharSequence getTitle() {
        return this.b.getTitle();
    }

    public void setTitle(int i) {
        this.b.setTitle(i);
    }

    public CharSequence getSubtitle() {
        return this.b.getSubtitle();
    }

    public void setSubtitle(int i) {
        this.b.setSubtitle(i);
    }

    public View getCustomView() {
        return this.b.getCustomView();
    }

    public void setCustomView(View view) {
        this.b.setCustomView(view);
    }

    public MenuInflater getMenuInflater() {
        return this.b.getMenuInflater();
    }

    public boolean getTitleOptionalHint() {
        return this.b.getTitleOptionalHint();
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.setTitleOptionalHint(z);
    }

    public boolean isTitleOptional() {
        return this.b.isTitleOptional();
    }
}
