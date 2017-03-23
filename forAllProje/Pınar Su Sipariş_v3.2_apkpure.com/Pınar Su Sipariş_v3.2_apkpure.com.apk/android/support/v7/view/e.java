package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.f;
import android.support.v7.view.menu.f.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode */
public class e extends b implements a {
    private Context a;
    private ActionBarContextView b;
    private b.a c;
    private WeakReference<View> d;
    private boolean e;
    private boolean f;
    private f g;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.a = context;
        this.b = actionBarContextView;
        this.c = aVar;
        this.g = new f(actionBarContextView.getContext()).a(1);
        this.g.a((a) this);
        this.f = z;
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setTitle(charSequence);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.setSubtitle(charSequence);
    }

    public void setTitle(int i) {
        setTitle(this.a.getString(i));
    }

    public void setSubtitle(int i) {
        setSubtitle(this.a.getString(i));
    }

    public void setTitleOptionalHint(boolean z) {
        super.setTitleOptionalHint(z);
        this.b.setTitleOptional(z);
    }

    public boolean isTitleOptional() {
        return this.b.d();
    }

    public void setCustomView(View view) {
        this.b.setCustomView(view);
        this.d = view != null ? new WeakReference(view) : null;
    }

    public void invalidate() {
        this.c.onPrepareActionMode(this, this.g);
    }

    public void finish() {
        if (!this.e) {
            this.e = true;
            this.b.sendAccessibilityEvent(32);
            this.c.onDestroyActionMode(this);
        }
    }

    public Menu getMenu() {
        return this.g;
    }

    public CharSequence getTitle() {
        return this.b.getTitle();
    }

    public CharSequence getSubtitle() {
        return this.b.getSubtitle();
    }

    public View getCustomView() {
        return this.d != null ? (View) this.d.get() : null;
    }

    public MenuInflater getMenuInflater() {
        return new g(this.b.getContext());
    }

    public boolean onMenuItemSelected(f fVar, MenuItem menuItem) {
        return this.c.onActionItemClicked(this, menuItem);
    }

    public void onMenuModeChange(f fVar) {
        invalidate();
        this.b.a();
    }

    public boolean isUiFocusable() {
        return this.f;
    }
}
