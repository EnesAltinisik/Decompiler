package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class n extends Dialog implements f {
    private g a;

    public n(Context context, int i) {
        super(context, a(context, i));
        a().a(null);
        a().j();
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public g a() {
        if (this.a == null) {
            this.a = g.a((Dialog) this, (f) this);
        }
        return this.a;
    }

    public b a(a aVar) {
        return null;
    }

    public void a(b bVar) {
    }

    public boolean a(int i) {
        return a().c(i);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    public void b(b bVar) {
    }

    public View findViewById(int i) {
        return a().a(i);
    }

    public void invalidateOptionsMenu() {
        a().f();
    }

    protected void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().a(bundle);
    }

    protected void onStop() {
        super.onStop();
        a().d();
    }

    public void setContentView(int i) {
        a().b(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }
}
