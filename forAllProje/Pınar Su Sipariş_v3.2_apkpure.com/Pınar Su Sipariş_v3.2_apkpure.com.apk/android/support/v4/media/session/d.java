package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;

/* compiled from: MediaControllerCompatApi21 */
class d {

    /* compiled from: MediaControllerCompatApi21 */
    public interface a {
        void a();

        void a(Object obj);

        void a(String str, Bundle bundle);

        void b(Object obj);
    }

    /* compiled from: MediaControllerCompatApi21 */
    static class b<T extends a> extends Callback {
        protected final T a;

        public b(T t) {
            this.a = t;
        }

        public void onSessionDestroyed() {
            this.a.a();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            this.a.a(str, bundle);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.a.a(playbackState);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.a.b(mediaMetadata);
        }
    }

    /* compiled from: MediaControllerCompatApi21 */
    public static class c {
        public static void a(Object obj) {
            ((TransportControls) obj).play();
        }

        public static void b(Object obj) {
            ((TransportControls) obj).pause();
        }
    }

    public static Object a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static void a(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((Callback) obj2, handler);
    }

    public static void a(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((Callback) obj2);
    }

    public static Object a(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    public static Object b(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    public static Object c(Object obj) {
        return ((MediaController) obj).getMetadata();
    }
}
