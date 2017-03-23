package android.support.v7.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

@TargetApi(24)
class i extends l {

    class a extends a {
        final /* synthetic */ i b;

        a(i iVar, Callback callback) {
            this.b = iVar;
            super(iVar, callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            d a = this.b.a(0, true);
            if (a == null || a.j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.j, i);
            }
        }
    }

    i(Context context, Window window, f fVar) {
        super(context, window, fVar);
    }

    Callback a(Callback callback) {
        return new a(this, callback);
    }
}
