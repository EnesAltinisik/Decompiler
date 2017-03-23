package android.support.v7.c;

import android.content.Context;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteCategory;
import android.media.MediaRouter.RouteGroup;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.media.MediaRouter.VolumeCallback;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaRouterJellybean */
final class h {

    /* compiled from: MediaRouterJellybean */
    public interface a {
        void a(int i, Object obj);

        void a(Object obj);

        void a(Object obj, Object obj2);

        void a(Object obj, Object obj2, int i);

        void b(int i, Object obj);

        void b(Object obj);

        void c(Object obj);

        void d(Object obj);
    }

    /* compiled from: MediaRouterJellybean */
    static class b<T extends a> extends Callback {
        protected final T a;

        public b(T t) {
            this.a = t;
        }

        public void onRouteSelected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
            this.a.a(i, (Object) routeInfo);
        }

        public void onRouteUnselected(MediaRouter mediaRouter, int i, RouteInfo routeInfo) {
            this.a.b(i, routeInfo);
        }

        public void onRouteAdded(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.a(routeInfo);
        }

        public void onRouteRemoved(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.b(routeInfo);
        }

        public void onRouteChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.c(routeInfo);
        }

        public void onRouteGrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup, int i) {
            this.a.a(routeInfo, routeGroup, i);
        }

        public void onRouteUngrouped(MediaRouter mediaRouter, RouteInfo routeInfo, RouteGroup routeGroup) {
            this.a.a((Object) routeInfo, (Object) routeGroup);
        }

        public void onRouteVolumeChanged(MediaRouter mediaRouter, RouteInfo routeInfo) {
            this.a.d(routeInfo);
        }
    }

    /* compiled from: MediaRouterJellybean */
    public static final class c {
        private Method a;

        public c() {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.a = MediaRouter.class.getMethod("getSystemAudioRoute", new Class[0]);
            } catch (NoSuchMethodException e) {
            }
        }

        public Object a(Object obj) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            if (this.a != null) {
                try {
                    return this.a.invoke(mediaRouter, new Object[0]);
                } catch (IllegalAccessException e) {
                } catch (InvocationTargetException e2) {
                }
            }
            return mediaRouter.getRouteAt(0);
        }
    }

    /* compiled from: MediaRouterJellybean */
    public static final class d {
        public static CharSequence a(Object obj, Context context) {
            return ((RouteInfo) obj).getName(context);
        }

        public static int a(Object obj) {
            return ((RouteInfo) obj).getSupportedTypes();
        }

        public static int b(Object obj) {
            return ((RouteInfo) obj).getPlaybackType();
        }

        public static int c(Object obj) {
            return ((RouteInfo) obj).getPlaybackStream();
        }

        public static int d(Object obj) {
            return ((RouteInfo) obj).getVolume();
        }

        public static int e(Object obj) {
            return ((RouteInfo) obj).getVolumeMax();
        }

        public static int f(Object obj) {
            return ((RouteInfo) obj).getVolumeHandling();
        }

        public static Object g(Object obj) {
            return ((RouteInfo) obj).getTag();
        }

        public static void a(Object obj, Object obj2) {
            ((RouteInfo) obj).setTag(obj2);
        }

        public static void a(Object obj, int i) {
            ((RouteInfo) obj).requestSetVolume(i);
        }

        public static void b(Object obj, int i) {
            ((RouteInfo) obj).requestUpdateVolume(i);
        }
    }

    /* compiled from: MediaRouterJellybean */
    public static final class e {
        private Method a;

        public e() {
            if (VERSION.SDK_INT < 16 || VERSION.SDK_INT > 17) {
                throw new UnsupportedOperationException();
            }
            try {
                this.a = MediaRouter.class.getMethod("selectRouteInt", new Class[]{Integer.TYPE, RouteInfo.class});
            } catch (NoSuchMethodException e) {
            }
        }

        public void a(Object obj, int i, Object obj2) {
            MediaRouter mediaRouter = (MediaRouter) obj;
            RouteInfo routeInfo = (RouteInfo) obj2;
            if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
                if (this.a != null) {
                    try {
                        this.a.invoke(mediaRouter, new Object[]{Integer.valueOf(i), routeInfo});
                        return;
                    } catch (Throwable e) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e);
                    } catch (Throwable e2) {
                        Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route.  Media routing may not work.", e2);
                    }
                } else {
                    Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
                }
            }
            mediaRouter.selectRoute(i, routeInfo);
        }
    }

    /* compiled from: MediaRouterJellybean */
    public static final class f {
        public static void a(Object obj, CharSequence charSequence) {
            ((UserRouteInfo) obj).setName(charSequence);
        }

        public static void a(Object obj, int i) {
            ((UserRouteInfo) obj).setPlaybackType(i);
        }

        public static void b(Object obj, int i) {
            ((UserRouteInfo) obj).setPlaybackStream(i);
        }

        public static void c(Object obj, int i) {
            ((UserRouteInfo) obj).setVolume(i);
        }

        public static void d(Object obj, int i) {
            ((UserRouteInfo) obj).setVolumeMax(i);
        }

        public static void e(Object obj, int i) {
            ((UserRouteInfo) obj).setVolumeHandling(i);
        }

        public static void a(Object obj, Object obj2) {
            ((UserRouteInfo) obj).setVolumeCallback((VolumeCallback) obj2);
        }
    }

    /* compiled from: MediaRouterJellybean */
    public interface g {
        void a(Object obj, int i);

        void b(Object obj, int i);
    }

    /* compiled from: MediaRouterJellybean */
    static class h<T extends g> extends VolumeCallback {
        protected final T a;

        public h(T t) {
            this.a = t;
        }

        public void onVolumeSetRequest(RouteInfo routeInfo, int i) {
            this.a.a(routeInfo, i);
        }

        public void onVolumeUpdateRequest(RouteInfo routeInfo, int i) {
            this.a.b(routeInfo, i);
        }
    }

    public static Object a(Context context) {
        return context.getSystemService("media_router");
    }

    public static List a(Object obj) {
        MediaRouter mediaRouter = (MediaRouter) obj;
        int routeCount = mediaRouter.getRouteCount();
        List arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        return arrayList;
    }

    public static Object a(Object obj, int i) {
        return ((MediaRouter) obj).getSelectedRoute(i);
    }

    public static void a(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).selectRoute(i, (RouteInfo) obj2);
    }

    public static void b(Object obj, int i, Object obj2) {
        ((MediaRouter) obj).addCallback(i, (Callback) obj2);
    }

    public static void a(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((Callback) obj2);
    }

    public static Object a(Object obj, String str, boolean z) {
        return ((MediaRouter) obj).createRouteCategory(str, z);
    }

    public static Object b(Object obj, Object obj2) {
        return ((MediaRouter) obj).createUserRoute((RouteCategory) obj2);
    }

    public static void c(Object obj, Object obj2) {
        ((MediaRouter) obj).addUserRoute((UserRouteInfo) obj2);
    }

    public static void d(Object obj, Object obj2) {
        ((MediaRouter) obj).removeUserRoute((UserRouteInfo) obj2);
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static Object a(g gVar) {
        return new h(gVar);
    }
}
