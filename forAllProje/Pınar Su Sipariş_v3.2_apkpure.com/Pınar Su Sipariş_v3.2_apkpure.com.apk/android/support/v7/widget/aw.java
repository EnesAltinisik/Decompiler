package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.app.AppCompatDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class aw extends ContextWrapper {
    private static final ArrayList<WeakReference<aw>> a = new ArrayList();
    private Resources b;
    private final Theme c;

    public static Context a(Context context) {
        if (!b(context)) {
            return context;
        }
        Context context2;
        int size = a.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) a.get(i);
            context2 = weakReference != null ? (aw) weakReference.get() : null;
            if (context2 != null && context2.getBaseContext() == context) {
                return context2;
            }
        }
        context2 = new aw(context);
        a.add(new WeakReference(context2));
        return context2;
    }

    private static boolean b(Context context) {
        if ((context instanceof aw) || (context.getResources() instanceof ay) || (context.getResources() instanceof bb)) {
            return false;
        }
        if (!AppCompatDelegate.isCompatVectorFromResourcesEnabled() || VERSION.SDK_INT <= 20) {
            return true;
        }
        return false;
    }

    private aw(Context context) {
        super(context);
        if (bb.a()) {
            this.c = getResources().newTheme();
            this.c.setTo(context.getTheme());
            return;
        }
        this.c = null;
    }

    public Theme getTheme() {
        return this.c == null ? super.getTheme() : this.c;
    }

    public void setTheme(int i) {
        if (this.c == null) {
            super.setTheme(i);
        } else {
            this.c.applyStyle(i, true);
        }
    }

    public Resources getResources() {
        if (this.b == null) {
            this.b = this.c == null ? new ay(this, super.getResources()) : new bb(this, super.getResources());
        }
        return this.b;
    }
}
