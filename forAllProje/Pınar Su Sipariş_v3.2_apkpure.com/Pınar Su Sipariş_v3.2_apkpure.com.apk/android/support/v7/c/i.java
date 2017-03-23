package android.support.v7.c;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.media.MediaRouter.RouteInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: MediaRouterJellybeanMr1 */
final class i {

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class a implements Runnable {
        private final DisplayManager a;
        private final Handler b;
        private Method c;
        private boolean d;

        public a(Context context, Handler handler) {
            if (VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            this.a = (DisplayManager) context.getSystemService("display");
            this.b = handler;
            try {
                this.c = DisplayManager.class.getMethod("scanWifiDisplays", new Class[0]);
            } catch (NoSuchMethodException e) {
            }
        }

        public void a(int i) {
            if ((i & 2) != 0) {
                if (!this.d) {
                    if (this.c != null) {
                        this.d = true;
                        this.b.post(this);
                        return;
                    }
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device.");
                }
            } else if (this.d) {
                this.d = false;
                this.b.removeCallbacks(this);
            }
        }

        public void run() {
            if (this.d) {
                try {
                    this.c.invoke(this.a, new Object[0]);
                } catch (Throwable e) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e);
                } catch (Throwable e2) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot scan for wifi displays.", e2);
                }
                this.b.postDelayed(this, 15000);
            }
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public interface b extends android.support.v7.c.h.a {
        void e(Object obj);
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    static class c<T extends b> extends b<T> {
        public c(T t) {
            super(t);
        }

        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            ((b) this.a).e(routeInfo);
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class d {
        private Method a;
        private int b;

        public d() {
            if (VERSION.SDK_INT != 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.b = RouteInfo.class.getField("STATUS_CONNECTING").getInt(null);
                this.a = RouteInfo.class.getMethod("getStatusCode", new Class[0]);
            } catch (NoSuchFieldException e) {
            } catch (NoSuchMethodException e2) {
            } catch (IllegalAccessException e3) {
            }
        }

        public boolean a(Object obj) {
            RouteInfo routeInfo = (RouteInfo) obj;
            if (this.a != null) {
                try {
                    return ((Integer) this.a.invoke(routeInfo, new Object[0])).intValue() == this.b;
                } catch (IllegalAccessException e) {
                } catch (InvocationTargetException e2) {
                }
            }
            return false;
        }
    }

    /* compiled from: MediaRouterJellybeanMr1 */
    public static final class e {
        public static boolean a(Object obj) {
            return ((RouteInfo) obj).isEnabled();
        }

        public static Display b(Object obj) {
            return ((RouteInfo) obj).getPresentationDisplay();
        }
    }

    public static Object a(b bVar) {
        return new c(bVar);
    }
}
