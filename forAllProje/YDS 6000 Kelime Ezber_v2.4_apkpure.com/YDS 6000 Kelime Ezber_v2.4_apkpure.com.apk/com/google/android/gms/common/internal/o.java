package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class o<T extends IInterface> {
    public static final String[] d = new String[]{"service_esmobile", "service_googleme"};
    final Handler a;
    protected f b;
    protected AtomicInteger c;
    private int e;
    private long f;
    private long g;
    private int h;
    private long i;
    private final Context j;
    private final Looper k;
    private final w l;
    private final com.google.android.gms.common.k m;
    private final Object n;
    private final Object o;
    private ad p;
    private T q;
    private final ArrayList<e<?>> r;
    private h s;
    private int t;
    private final b u;
    private final c v;
    private final int w;
    private final String x;

    public interface b {
        void a(int i);

        void a(Bundle bundle);
    }

    public interface c {
        void a(com.google.android.gms.common.a aVar);
    }

    public interface f {
        void a(com.google.android.gms.common.a aVar);
    }

    protected abstract class e<TListener> {
        private TListener a;
        private boolean b = false;
        final /* synthetic */ o d;

        public e(o oVar, TListener tListener) {
            this.d = oVar;
            this.a = tListener;
        }

        protected abstract void a(TListener tListener);

        public void b() {
            synchronized (this) {
                Object obj = this.a;
                if (this.b) {
                    String valueOf = String.valueOf(this);
                    Log.w("GmsClient", new StringBuilder(String.valueOf(valueOf).length() + 47).append("Callback proxy ").append(valueOf).append(" being reused. This is not safe.").toString());
                }
            }
            if (obj != null) {
                try {
                    a(obj);
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            synchronized (this) {
                this.b = true;
            }
            c();
        }

        public void c() {
            d();
            synchronized (this.d.r) {
                this.d.r.remove(this);
            }
        }

        public void d() {
            synchronized (this) {
                this.a = null;
            }
        }
    }

    private abstract class a extends e<Boolean> {
        public final int a;
        public final Bundle b;
        final /* synthetic */ o c;

        protected a(o oVar, int i, Bundle bundle) {
            this.c = oVar;
            super(oVar, Boolean.valueOf(true));
            this.a = i;
            this.b = bundle;
        }

        protected abstract void a(com.google.android.gms.common.a aVar);

        protected void a(Boolean bool) {
            PendingIntent pendingIntent = null;
            if (bool == null) {
                this.c.a(1, null);
                return;
            }
            switch (this.a) {
                case 0:
                    if (!a()) {
                        this.c.a(1, null);
                        a(new com.google.android.gms.common.a(8, null));
                        return;
                    }
                    return;
                case 10:
                    this.c.a(1, null);
                    throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
                default:
                    this.c.a(1, null);
                    if (this.b != null) {
                        pendingIntent = (PendingIntent) this.b.getParcelable("pendingIntent");
                    }
                    a(new com.google.android.gms.common.a(this.a, pendingIntent));
                    return;
            }
        }

        protected /* synthetic */ void a(Object obj) {
            a((Boolean) obj);
        }

        protected abstract boolean a();
    }

    final class d extends Handler {
        final /* synthetic */ o a;

        public d(o oVar, Looper looper) {
            this.a = oVar;
            super(looper);
        }

        private void a(Message message) {
            ((e) message.obj).c();
        }

        private boolean b(Message message) {
            return message.what == 2 || message.what == 1 || message.what == 5;
        }

        public void handleMessage(Message message) {
            PendingIntent pendingIntent = null;
            if (this.a.c.get() != message.arg1) {
                if (b(message)) {
                    a(message);
                }
            } else if ((message.what == 1 || message.what == 5) && !this.a.c()) {
                a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                com.google.android.gms.common.a aVar = new com.google.android.gms.common.a(message.arg2, pendingIntent);
                this.a.b.a(aVar);
                this.a.a(aVar);
            } else if (message.what == 4) {
                this.a.a(4, null);
                if (this.a.u != null) {
                    this.a.u.a(message.arg2);
                }
                this.a.a(message.arg2);
                this.a.a(4, 1, null);
            } else if (message.what == 2 && !this.a.b()) {
                a(message);
            } else if (b(message)) {
                ((e) message.obj).b();
            } else {
                Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            }
        }
    }

    public static final class g extends com.google.android.gms.common.internal.ac.a {
        private o a;
        private final int b;

        public g(o oVar, int i) {
            this.a = oVar;
            this.b = i;
        }

        private void a() {
            this.a = null;
        }

        public void a(int i, Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        public void a(int i, IBinder iBinder, Bundle bundle) {
            c.a(this.a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.a.a(i, iBinder, bundle, this.b);
            a();
        }
    }

    public final class h implements ServiceConnection {
        final /* synthetic */ o a;
        private final int b;

        public h(o oVar, int i) {
            this.a = oVar;
            this.b = i;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                this.a.b(new com.google.android.gms.common.a(8, null, "ServiceBroker IBinder is null"));
                return;
            }
            synchronized (this.a.o) {
                this.a.p = com.google.android.gms.common.internal.ad.a.a(iBinder);
            }
            this.a.a(0, null, this.b);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (this.a.o) {
                this.a.p = null;
            }
            this.a.a.sendMessage(this.a.a.obtainMessage(4, this.b, 1));
        }
    }

    protected class i implements f {
        final /* synthetic */ o a;

        public i(o oVar) {
            this.a = oVar;
        }

        public void a(com.google.android.gms.common.a aVar) {
            if (aVar.b()) {
                this.a.a(null, this.a.w());
            } else if (this.a.v != null) {
                this.a.v.a(aVar);
            }
        }
    }

    protected final class j extends a {
        public final IBinder e;
        final /* synthetic */ o f;

        public j(o oVar, int i, IBinder iBinder, Bundle bundle) {
            this.f = oVar;
            super(oVar, i, bundle);
            this.e = iBinder;
        }

        protected void a(com.google.android.gms.common.a aVar) {
            if (this.f.v != null) {
                this.f.v.a(aVar);
            }
            this.f.a(aVar);
        }

        protected boolean a() {
            try {
                String interfaceDescriptor = this.e.getInterfaceDescriptor();
                if (this.f.j().equals(interfaceDescriptor)) {
                    IInterface a = this.f.a(this.e);
                    if (a == null || !this.f.a(2, 3, a)) {
                        return false;
                    }
                    Bundle t = this.f.t();
                    if (this.f.u != null) {
                        this.f.u.a(t);
                    }
                    return true;
                }
                String valueOf = String.valueOf(this.f.j());
                Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(valueOf).append(" vs. ").append(interfaceDescriptor).toString());
                return false;
            } catch (RemoteException e) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        }
    }

    protected final class k extends a {
        final /* synthetic */ o e;

        public k(o oVar, int i, Bundle bundle) {
            this.e = oVar;
            super(oVar, i, bundle);
        }

        protected void a(com.google.android.gms.common.a aVar) {
            this.e.b.a(aVar);
            this.e.a(aVar);
        }

        protected boolean a() {
            this.e.b.a(com.google.android.gms.common.a.a);
            return true;
        }
    }

    protected o(Context context, Looper looper, int i, b bVar, c cVar, String str) {
        this(context, looper, w.a(context), com.google.android.gms.common.k.b(), i, (b) c.a((Object) bVar), (c) c.a((Object) cVar), str);
    }

    protected o(Context context, Looper looper, w wVar, com.google.android.gms.common.k kVar, int i, b bVar, c cVar, String str) {
        this.n = new Object();
        this.o = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.c = new AtomicInteger(0);
        this.j = (Context) c.a((Object) context, (Object) "Context must not be null");
        this.k = (Looper) c.a((Object) looper, (Object) "Looper must not be null");
        this.l = (w) c.a((Object) wVar, (Object) "Supervisor must not be null");
        this.m = (com.google.android.gms.common.k) c.a((Object) kVar, (Object) "API availability must not be null");
        this.a = new d(this, looper);
        this.w = i;
        this.u = bVar;
        this.v = cVar;
        this.x = str;
    }

    private void a(int i, T t) {
        boolean z = true;
        if ((i == 3) != (t != null)) {
            z = false;
        }
        c.b(z);
        synchronized (this.n) {
            this.t = i;
            this.q = t;
            switch (i) {
                case 1:
                    x();
                    break;
                case 2:
                    k();
                    break;
                case 3:
                    a((IInterface) t);
                    break;
            }
        }
    }

    private boolean a(int i, int i2, T t) {
        boolean z;
        synchronized (this.n) {
            if (this.t != i) {
                z = false;
            } else {
                a(i2, (IInterface) t);
                z = true;
            }
        }
        return z;
    }

    private void b(com.google.android.gms.common.a aVar) {
        this.a.sendMessage(this.a.obtainMessage(3, this.c.get(), aVar.c(), aVar.d()));
    }

    private void k() {
        if (this.s != null) {
            String valueOf = String.valueOf(i());
            String valueOf2 = String.valueOf(e_());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(valueOf2).length()).append("Calling connect() while still connected, missing disconnect() for ").append(valueOf).append(" on ").append(valueOf2).toString());
            this.l.b(i(), e_(), this.s, m());
            this.c.incrementAndGet();
        }
        this.s = new h(this, this.c.get());
        if (!this.l.a(i(), e_(), this.s, m())) {
            valueOf = String.valueOf(i());
            valueOf2 = String.valueOf(e_());
            Log.e("GmsClient", new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(valueOf2).length()).append("unable to connect to service: ").append(valueOf).append(" on ").append(valueOf2).toString());
            a(16, null, this.c.get());
        }
    }

    private void x() {
        if (this.s != null) {
            this.l.b(i(), e_(), this.s, m());
            this.s = null;
        }
    }

    protected abstract T a(IBinder iBinder);

    public void a() {
        this.c.incrementAndGet();
        synchronized (this.r) {
            int size = this.r.size();
            for (int i = 0; i < size; i++) {
                ((e) this.r.get(i)).d();
            }
            this.r.clear();
        }
        synchronized (this.o) {
            this.p = null;
        }
        a(1, null);
    }

    protected void a(int i) {
        this.e = i;
        this.f = System.currentTimeMillis();
    }

    protected void a(int i, Bundle bundle, int i2) {
        this.a.sendMessage(this.a.obtainMessage(5, i2, -1, new k(this, i, bundle)));
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        this.a.sendMessage(this.a.obtainMessage(1, i2, -1, new j(this, i, iBinder, bundle)));
    }

    protected void a(T t) {
        this.g = System.currentTimeMillis();
    }

    protected void a(com.google.android.gms.common.a aVar) {
        this.h = aVar.c();
        this.i = System.currentTimeMillis();
    }

    public void a(f fVar) {
        this.b = (f) c.a((Object) fVar, (Object) "Connection progress callbacks cannot be null.");
        a(2, null);
    }

    public void a(z zVar, Set<Scope> set) {
        s a = new s(this.w).a(this.j.getPackageName()).a(r());
        if (set != null) {
            a.a((Collection) set);
        }
        if (d()) {
            a.a(q()).a(zVar);
        } else if (v()) {
            a.a(p());
        }
        try {
            synchronized (this.o) {
                if (this.p != null) {
                    this.p.a(new g(this, this.c.get()), a);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "service died");
            b(1);
        } catch (Throwable e2) {
            Log.w("GmsClient", "Remote exception occurred", e2);
        } catch (SecurityException e3) {
            throw e3;
        } catch (Throwable e22) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e22);
            b(new com.google.android.gms.common.a(8, null, "IGmsServiceBroker.getService failed."));
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        synchronized (this.n) {
            int i = this.t;
            IInterface iInterface = this.q;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.println("null");
        } else {
            printWriter.append(j()).append("@").println(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.g > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.g;
            String valueOf = String.valueOf(simpleDateFormat.format(new Date(this.g)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.f > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            switch (this.e) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(this.e));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(this.f)));
            append.println(new StringBuilder(String.valueOf(valueOf).length() + 21).append(j).append(" ").append(valueOf).toString());
        }
        if (this.i > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(com.google.android.gms.common.api.b.a(this.h));
            append = printWriter.append(" lastFailedTime=");
            j = this.i;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(this.i)));
            append.println(new StringBuilder(String.valueOf(valueOf2).length() + 21).append(j).append(" ").append(valueOf2).toString());
        }
    }

    public void b(int i) {
        this.a.sendMessage(this.a.obtainMessage(4, this.c.get(), i));
    }

    public boolean b() {
        boolean z;
        synchronized (this.n) {
            z = this.t == 3;
        }
        return z;
    }

    public boolean c() {
        boolean z;
        synchronized (this.n) {
            z = this.t == 2;
        }
        return z;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return true;
    }

    protected String e_() {
        return "com.google.android.gms";
    }

    public boolean f() {
        return false;
    }

    public Intent g() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public IBinder h() {
        IBinder iBinder;
        synchronized (this.o) {
            if (this.p == null) {
                iBinder = null;
            } else {
                iBinder = this.p.asBinder();
            }
        }
        return iBinder;
    }

    protected abstract String i();

    protected abstract String j();

    protected final String m() {
        return this.x == null ? this.j.getClass().getName() : this.x;
    }

    public void n() {
        int a = this.m.a(this.j);
        if (a != 0) {
            a(1, null);
            this.b = new i(this);
            this.a.sendMessage(this.a.obtainMessage(3, this.c.get(), a));
            return;
        }
        a(new i(this));
    }

    public final Context o() {
        return this.j;
    }

    public Account p() {
        return null;
    }

    public final Account q() {
        return p() != null ? p() : new Account("<<default account>>", "com.google");
    }

    protected Bundle r() {
        return new Bundle();
    }

    protected final void s() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public Bundle t() {
        return null;
    }

    public final T u() {
        T t;
        synchronized (this.n) {
            if (this.t == 4) {
                throw new DeadObjectException();
            }
            s();
            c.a(this.q != null, (Object) "Client is connected but service is null");
            t = this.q;
        }
        return t;
    }

    public boolean v() {
        return false;
    }

    protected Set<Scope> w() {
        return Collections.EMPTY_SET;
    }
}
