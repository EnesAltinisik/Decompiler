package android.support.v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.util.Log;
import java.util.List;

/* compiled from: MediaControllerCompat */
public final class c {
    private final b a;
    private final Token b;

    /* compiled from: MediaControllerCompat */
    public static abstract class a implements DeathRecipient {
        private final Object mCallbackObj;
        private a mHandler;
        private boolean mRegistered = false;

        /* compiled from: MediaControllerCompat */
        private class a extends Handler {
            final /* synthetic */ a a;

            public a(a aVar, Looper looper) {
                this.a = aVar;
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.a.mRegistered) {
                    switch (message.what) {
                        case 1:
                            this.a.onSessionEvent((String) message.obj, message.getData());
                            return;
                        case 2:
                            this.a.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            this.a.onMetadataChanged((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            this.a.onAudioInfoChanged((f) message.obj);
                            return;
                        case 5:
                            this.a.onQueueChanged((List) message.obj);
                            return;
                        case 6:
                            this.a.onQueueTitleChanged((CharSequence) message.obj);
                            return;
                        case 7:
                            this.a.onExtrasChanged((Bundle) message.obj);
                            return;
                        case 8:
                            this.a.onSessionDestroyed();
                            return;
                        default:
                            return;
                    }
                }
            }

            public void a(int i, Object obj, Bundle bundle) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        /* compiled from: MediaControllerCompat */
        private class b implements android.support.v4.media.session.d.a {
            final /* synthetic */ a a;

            private b(a aVar) {
                this.a = aVar;
            }

            public void a() {
                this.a.onSessionDestroyed();
            }

            public void a(String str, Bundle bundle) {
                this.a.onSessionEvent(str, bundle);
            }

            public void a(Object obj) {
                this.a.onPlaybackStateChanged(PlaybackStateCompat.a(obj));
            }

            public void b(Object obj) {
                this.a.onMetadataChanged(MediaMetadataCompat.a(obj));
            }
        }

        /* compiled from: MediaControllerCompat */
        private class c extends android.support.v4.media.session.a.a {
            final /* synthetic */ a a;

            private c(a aVar) {
                this.a = aVar;
            }

            public void a(String str, Bundle bundle) throws RemoteException {
                this.a.mHandler.a(1, str, bundle);
            }

            public void a() throws RemoteException {
                this.a.mHandler.a(8, null, null);
            }

            public void a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                this.a.mHandler.a(2, playbackStateCompat, null);
            }

            public void a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                this.a.mHandler.a(3, mediaMetadataCompat, null);
            }

            public void a(List<QueueItem> list) throws RemoteException {
                this.a.mHandler.a(5, list, null);
            }

            public void a(CharSequence charSequence) throws RemoteException {
                this.a.mHandler.a(6, charSequence, null);
            }

            public void a(Bundle bundle) throws RemoteException {
                this.a.mHandler.a(7, bundle, null);
            }

            public void a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                Object fVar;
                if (parcelableVolumeInfo != null) {
                    fVar = new f(parcelableVolumeInfo.a, parcelableVolumeInfo.b, parcelableVolumeInfo.c, parcelableVolumeInfo.d, parcelableVolumeInfo.e);
                } else {
                    fVar = null;
                }
                this.a.mHandler.a(4, fVar, null);
            }
        }

        public a() {
            if (VERSION.SDK_INT >= 21) {
                this.mCallbackObj = d.a(new b());
            } else {
                this.mCallbackObj = new c();
            }
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onQueueChanged(List<QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onAudioInfoChanged(f fVar) {
        }

        public void binderDied() {
            onSessionDestroyed();
        }

        private void setHandler(Handler handler) {
            this.mHandler = new a(this, handler.getLooper());
        }
    }

    /* compiled from: MediaControllerCompat */
    interface b {
        g a();

        void a(a aVar);

        void a(a aVar, Handler handler);

        PlaybackStateCompat b();

        MediaMetadataCompat c();

        Object d();
    }

    /* compiled from: MediaControllerCompat */
    static class c implements b {
        protected final Object a;

        public c(Context context, Token token) throws RemoteException {
            this.a = d.a(context, token.a());
            if (this.a == null) {
                throw new RemoteException();
            }
        }

        public void a(a aVar, Handler handler) {
            d.a(this.a, aVar.mCallbackObj, handler);
        }

        public void a(a aVar) {
            d.a(this.a, aVar.mCallbackObj);
        }

        public g a() {
            Object a = d.a(this.a);
            return a != null ? new h(a) : null;
        }

        public PlaybackStateCompat b() {
            Object b = d.b(this.a);
            return b != null ? PlaybackStateCompat.a(b) : null;
        }

        public MediaMetadataCompat c() {
            Object c = d.c(this.a);
            return c != null ? MediaMetadataCompat.a(c) : null;
        }

        public Object d() {
            return this.a;
        }
    }

    /* compiled from: MediaControllerCompat */
    static class d extends c {
        public d(Context context, Token token) throws RemoteException {
            super(context, token);
        }

        public g a() {
            Object a = d.a(this.a);
            return a != null ? new i(a) : null;
        }
    }

    /* compiled from: MediaControllerCompat */
    static class e implements b {
        private Token a;
        private b b;
        private g c;

        public e(Token token) {
            this.a = token;
            this.b = android.support.v4.media.session.b.a.a((IBinder) token.a());
        }

        public void a(a aVar, Handler handler) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.b.asBinder().linkToDeath(aVar, 0);
                this.b.a((a) aVar.mCallbackObj);
                aVar.setHandler(handler);
                aVar.mRegistered = true;
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback. " + e);
                aVar.onSessionDestroyed();
            }
        }

        public void a(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.b.b((a) aVar.mCallbackObj);
                this.b.asBinder().unlinkToDeath(aVar, 0);
                aVar.mRegistered = false;
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in unregisterCallback. " + e);
            }
        }

        public g a() {
            if (this.c == null) {
                this.c = new j(this.b);
            }
            return this.c;
        }

        public PlaybackStateCompat b() {
            try {
                return this.b.o();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState. " + e);
                return null;
            }
        }

        public MediaMetadataCompat c() {
            try {
                return this.b.n();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata. " + e);
                return null;
            }
        }

        public Object d() {
            return null;
        }
    }

    /* compiled from: MediaControllerCompat */
    public static final class f {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        f(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    /* compiled from: MediaControllerCompat */
    public static abstract class g {
        public abstract void a();

        public abstract void b();

        g() {
        }
    }

    /* compiled from: MediaControllerCompat */
    static class h extends g {
        protected final Object a;

        public h(Object obj) {
            this.a = obj;
        }

        public void a() {
            android.support.v4.media.session.d.c.a(this.a);
        }

        public void b() {
            android.support.v4.media.session.d.c.b(this.a);
        }
    }

    /* compiled from: MediaControllerCompat */
    static class i extends h {
        public i(Object obj) {
            super(obj);
        }
    }

    /* compiled from: MediaControllerCompat */
    static class j extends g {
        private b a;

        public j(b bVar) {
            this.a = bVar;
        }

        public void a() {
            try {
                this.a.g();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in play. " + e);
            }
        }

        public void b() {
            try {
                this.a.h();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in pause. " + e);
            }
        }
    }

    public c(Context context, Token token) throws RemoteException {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.b = token;
        if (VERSION.SDK_INT >= 23) {
            this.a = new d(context, token);
        } else if (VERSION.SDK_INT >= 21) {
            this.a = new c(context, token);
        } else {
            this.a = new e(this.b);
        }
    }

    public g a() {
        return this.a.a();
    }

    public PlaybackStateCompat b() {
        return this.a.b();
    }

    public MediaMetadataCompat c() {
        return this.a.c();
    }

    public Token d() {
        return this.b;
    }

    public void a(a aVar) {
        a(aVar, null);
    }

    public void a(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        if (handler == null) {
            handler = new Handler();
        }
        this.a.a(aVar, handler);
    }

    public void b(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.a.a(aVar);
    }

    public Object e() {
        return this.a.d();
    }
}
