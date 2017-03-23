package android.support.v4.d.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* compiled from: DisplayManagerCompat */
public abstract class a {
    private static final WeakHashMap<Context, a> a = new WeakHashMap();

    /* compiled from: DisplayManagerCompat */
    private static class a extends a {
        private final Object a;

        public a(Context context) {
            this.a = b.a(context);
        }
    }

    /* compiled from: DisplayManagerCompat */
    private static class b extends a {
        private final WindowManager a;

        public b(Context context) {
            this.a = (WindowManager) context.getSystemService("window");
        }
    }

    a() {
    }

    public static a a(Context context) {
        a aVar;
        synchronized (a) {
            aVar = (a) a.get(context);
            if (aVar == null) {
                if (VERSION.SDK_INT >= 17) {
                    aVar = new a(context);
                } else {
                    aVar = new b(context);
                }
                a.put(context, aVar);
            }
        }
        return aVar;
    }
}
