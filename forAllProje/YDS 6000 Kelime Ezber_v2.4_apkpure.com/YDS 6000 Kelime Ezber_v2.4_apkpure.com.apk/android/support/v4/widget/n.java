package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class n {
    public static void a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            p.a(listView, i);
        } else {
            o.a(listView, i);
        }
    }
}
