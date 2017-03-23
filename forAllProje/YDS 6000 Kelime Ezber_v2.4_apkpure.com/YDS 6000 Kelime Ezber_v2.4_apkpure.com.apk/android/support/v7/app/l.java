package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

@TargetApi(23)
class l extends k {
    private final UiModeManager t;

    class a extends a {
        final /* synthetic */ l d;

        a(l lVar, Callback callback) {
            this.d = lVar;
            super(lVar, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.d.p()) {
                switch (i) {
                    case 0:
                        return a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    l(Context context, Window window, f fVar) {
        super(context, window, fVar);
        this.t = (UiModeManager) context.getSystemService("uimode");
    }

    Callback a(Callback callback) {
        return new a(this, callback);
    }

    int d(int i) {
        return (i == 0 && this.t.getNightMode() == 0) ? -1 : super.d(i);
    }
}
