package android.support.v7.app;

import android.annotation.TargetApi;
import android.app.Notification.MediaStyle;
import android.media.session.MediaSession.Token;
import android.support.v4.b.ag;

@TargetApi(21)
class q {
    public static void a(ag agVar, int[] iArr, Object obj) {
        MediaStyle mediaStyle = new MediaStyle(agVar.a());
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (obj != null) {
            mediaStyle.setMediaSession((Token) obj);
        }
    }
}
