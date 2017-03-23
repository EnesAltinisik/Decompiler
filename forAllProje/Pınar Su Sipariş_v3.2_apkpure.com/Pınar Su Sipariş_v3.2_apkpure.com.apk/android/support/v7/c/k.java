package android.support.v7.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RegisteredMediaRouteProvider */
final class k extends c implements ServiceConnection {
    private static final boolean a = Log.isLoggable("MediaRouteProviderProxy", 3);
    private final ComponentName b;
    private final c c;
    private final ArrayList<b> d = new ArrayList();
    private boolean e;
    private boolean f;
    private a g;
    private boolean h;

    /* compiled from: RegisteredMediaRouteProvider */
    private final class a implements DeathRecipient {
        final /* synthetic */ k a;
        private final Messenger b;
        private final d c;
        private final Messenger d;
        private int e = 1;
        private int f = 1;
        private int g;
        private int h;
        private final SparseArray<android.support.v7.c.g.c> i = new SparseArray();

        public a(k kVar, Messenger messenger) {
            this.a = kVar;
            this.b = messenger;
            this.c = new d(this);
            this.d = new Messenger(this.c);
        }

        public boolean a() {
            int i = this.e;
            this.e = i + 1;
            this.h = i;
            if (!a(1, this.h, 1, null, null)) {
                return false;
            }
            try {
                this.b.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException e) {
                binderDied();
                return false;
            }
        }

        public void b() {
            a(2, 0, 0, null, null);
            this.c.a();
            this.b.getBinder().unlinkToDeath(this, 0);
            this.a.c.post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.c();
                }
            });
        }

        private void c() {
            for (int i = 0; i < this.i.size(); i++) {
                ((android.support.v7.c.g.c) this.i.valueAt(i)).a(null, null);
            }
            this.i.clear();
        }

        public boolean a(int i) {
            if (i == this.h) {
                this.h = 0;
                this.a.a(this, "Registation failed");
            }
            android.support.v7.c.g.c cVar = (android.support.v7.c.g.c) this.i.get(i);
            if (cVar != null) {
                this.i.remove(i);
                cVar.a(null, null);
            }
            return true;
        }

        public boolean b(int i) {
            return true;
        }

        public boolean a(int i, int i2, Bundle bundle) {
            if (this.g != 0 || i != this.h || i2 < 1) {
                return false;
            }
            this.h = 0;
            this.g = i2;
            this.a.a(this, d.a(bundle));
            this.a.a(this);
            return true;
        }

        public boolean a(Bundle bundle) {
            if (this.g == 0) {
                return false;
            }
            this.a.a(this, d.a(bundle));
            return true;
        }

        public boolean a(int i, Bundle bundle) {
            android.support.v7.c.g.c cVar = (android.support.v7.c.g.c) this.i.get(i);
            if (cVar == null) {
                return false;
            }
            this.i.remove(i);
            cVar.a(bundle);
            return true;
        }

        public boolean a(int i, String str, Bundle bundle) {
            android.support.v7.c.g.c cVar = (android.support.v7.c.g.c) this.i.get(i);
            if (cVar == null) {
                return false;
            }
            this.i.remove(i);
            cVar.a(str, bundle);
            return true;
        }

        public void binderDied() {
            this.a.c.post(new Runnable(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.b(this.a);
                }
            });
        }

        public int a(String str) {
            int i = this.f;
            this.f = i + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            int i2 = this.e;
            this.e = i2 + 1;
            a(3, i2, i, null, bundle);
            return i;
        }

        public void c(int i) {
            int i2 = this.e;
            this.e = i2 + 1;
            a(4, i2, i, null, null);
        }

        public void d(int i) {
            int i2 = this.e;
            this.e = i2 + 1;
            a(5, i2, i, null, null);
        }

        public void a(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i2);
            int i3 = this.e;
            this.e = i3 + 1;
            a(6, i3, i, null, bundle);
        }

        public void b(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.e;
            this.e = i3 + 1;
            a(7, i3, i, null, bundle);
        }

        public void c(int i, int i2) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i2);
            int i3 = this.e;
            this.e = i3 + 1;
            a(8, i3, i, null, bundle);
        }

        public void a(b bVar) {
            Object d;
            int i = this.e;
            this.e = i + 1;
            if (bVar != null) {
                d = bVar.d();
            } else {
                d = null;
            }
            a(10, i, 0, d, null);
        }

        private boolean a(int i, int i2, int i3, Object obj, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = i2;
            obtain.arg2 = i3;
            obtain.obj = obj;
            obtain.setData(bundle);
            obtain.replyTo = this.d;
            try {
                this.b.send(obtain);
                return true;
            } catch (DeadObjectException e) {
                return false;
            } catch (Throwable e2) {
                if (i != 2) {
                    Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
                }
                return false;
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private final class b extends android.support.v7.c.c.d {
        final /* synthetic */ k a;
        private final String b;
        private boolean c;
        private int d = -1;
        private int e;
        private a f;
        private int g;

        public b(k kVar, String str) {
            this.a = kVar;
            this.b = str;
        }

        public void a(a aVar) {
            this.f = aVar;
            this.g = aVar.a(this.b);
            if (this.c) {
                aVar.d(this.g);
                if (this.d >= 0) {
                    aVar.b(this.g, this.d);
                    this.d = -1;
                }
                if (this.e != 0) {
                    aVar.c(this.g, this.e);
                    this.e = 0;
                }
            }
        }

        public void d() {
            if (this.f != null) {
                this.f.c(this.g);
                this.f = null;
                this.g = 0;
            }
        }

        public void a() {
            this.a.a(this);
        }

        public void b() {
            this.c = true;
            if (this.f != null) {
                this.f.d(this.g);
            }
        }

        public void c() {
            a(0);
        }

        public void a(int i) {
            this.c = false;
            if (this.f != null) {
                this.f.a(this.g, i);
            }
        }

        public void b(int i) {
            if (this.f != null) {
                this.f.b(this.g, i);
                return;
            }
            this.d = i;
            this.e = 0;
        }

        public void c(int i) {
            if (this.f != null) {
                this.f.c(this.g, i);
            } else {
                this.e += i;
            }
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private final class c extends Handler {
        final /* synthetic */ k a;

        private c(k kVar) {
            this.a = kVar;
        }
    }

    /* compiled from: RegisteredMediaRouteProvider */
    private static final class d extends Handler {
        private final WeakReference<a> a;

        public d(a aVar) {
            this.a = new WeakReference(aVar);
        }

        public void a() {
            this.a.clear();
        }

        public void handleMessage(Message message) {
            a aVar = (a) this.a.get();
            if (aVar != null && !a(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) && k.a) {
                Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
            }
        }

        private boolean a(a aVar, int i, int i2, int i3, Object obj, Bundle bundle) {
            switch (i) {
                case 0:
                    aVar.a(i2);
                    return true;
                case 1:
                    aVar.b(i2);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.a(i2, i3, (Bundle) obj);
                    }
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.a(i2, (Bundle) obj);
                    }
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        String str;
                        if (bundle == null) {
                            str = null;
                        } else {
                            str = bundle.getString("error");
                        }
                        return aVar.a(i2, str, (Bundle) obj);
                    }
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.a((Bundle) obj);
                    }
            }
            return false;
        }
    }

    public k(Context context, ComponentName componentName) {
        super(context, new android.support.v7.c.c.c(componentName));
        this.b = componentName;
        this.c = new c();
    }

    public android.support.v7.c.c.d a(String str) {
        d e = e();
        if (e != null) {
            List a = e.a();
            int size = a.size();
            for (int i = 0; i < size; i++) {
                if (((a) a.get(i)).a().equals(str)) {
                    android.support.v7.c.c.d bVar = new b(this, str);
                    this.d.add(bVar);
                    if (this.h) {
                        bVar.a(this.g);
                    }
                    j();
                    return bVar;
                }
            }
        }
        return null;
    }

    public void b(b bVar) {
        if (this.h) {
            this.g.a(bVar);
        }
        j();
    }

    public boolean a(String str, String str2) {
        return this.b.getPackageName().equals(str) && this.b.getClassName().equals(str2);
    }

    public void f() {
        if (!this.e) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Starting");
            }
            this.e = true;
            j();
        }
    }

    public void g() {
        if (this.e) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.e = false;
            j();
        }
    }

    public void h() {
        if (this.g == null && k()) {
            m();
            l();
        }
    }

    private void j() {
        if (k()) {
            l();
        } else {
            m();
        }
    }

    private boolean k() {
        if (!this.e || (d() == null && this.d.isEmpty())) {
            return false;
        }
        return true;
    }

    private void l() {
        if (!this.f) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Binding");
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.b);
            try {
                this.f = a().bindService(intent, this, 1);
                if (!this.f && a) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed");
                }
            } catch (Throwable e) {
                if (a) {
                    Log.d("MediaRouteProviderProxy", this + ": Bind failed", e);
                }
            }
        }
    }

    private void m() {
        if (this.f) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f = false;
            n();
            a().unbindService(this);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (a) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f) {
            n();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (e.a(messenger)) {
                a aVar = new a(this, messenger);
                if (aVar.a()) {
                    this.g = aVar;
                    return;
                } else if (a) {
                    Log.d("MediaRouteProviderProxy", this + ": Registration failed");
                    return;
                } else {
                    return;
                }
            }
            Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (a) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        n();
    }

    private void a(a aVar) {
        if (this.g == aVar) {
            this.h = true;
            o();
            b d = d();
            if (d != null) {
                this.g.a(d);
            }
        }
    }

    private void b(a aVar) {
        if (this.g == aVar) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            n();
        }
    }

    private void a(a aVar, String str) {
        if (this.g == aVar) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            m();
        }
    }

    private void a(a aVar, d dVar) {
        if (this.g == aVar) {
            if (a) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + dVar);
            }
            a(dVar);
        }
    }

    private void n() {
        if (this.g != null) {
            a(null);
            this.h = false;
            p();
            this.g.b();
            this.g = null;
        }
    }

    private void a(b bVar) {
        this.d.remove(bVar);
        bVar.d();
        j();
    }

    private void o() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((b) this.d.get(i)).a(this.g);
        }
    }

    private void p() {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            ((b) this.d.get(i)).d();
        }
    }

    public String toString() {
        return "Service connection " + this.b.flattenToShortString();
    }
}
