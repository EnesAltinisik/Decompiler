package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.DecoratedMediaCustomViewStyle;
import android.support.v4.b.ag;

@TargetApi(24)
class r {
    public static void a(ag agVar) {
        agVar.a().setStyle(new DecoratedCustomViewStyle());
    }

    public static void b(ag agVar) {
        agVar.a().setStyle(new DecoratedMediaCustomViewStyle());
    }
}
