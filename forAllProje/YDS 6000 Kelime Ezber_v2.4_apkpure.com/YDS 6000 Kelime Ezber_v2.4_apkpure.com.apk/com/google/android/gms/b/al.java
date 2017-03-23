package com.google.android.gms.b;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import java.lang.ref.WeakReference;

public class al<R extends g> extends k<R> implements h<R> {
    private j<? super R, ? extends g> a;
    private al<? extends g> b;
    private volatile i<? super R> c;
    private d<R> d;
    private final Object e;
    private Status f;
    private final WeakReference<c> g;
    private final a h;
    private boolean i;

    private final class a extends Handler {
        final /* synthetic */ al a;

        public void handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    d dVar = (d) message.obj;
                    synchronized (this.a.e) {
                        if (dVar == null) {
                            this.a.b.a(new Status(13, "Transform returned null"));
                        } else if (dVar instanceof af) {
                            this.a.b.a(((af) dVar).b());
                        } else {
                            this.a.b.a(dVar);
                        }
                    }
                    return;
                case 1:
                    RuntimeException runtimeException = (RuntimeException) message.obj;
                    String str = "TransformedResultImpl";
                    String str2 = "Runtime exception on the transformation worker thread: ";
                    String valueOf = String.valueOf(runtimeException.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    throw runtimeException;
                default:
                    Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
                    return;
            }
        }
    }

    private void a(Status status) {
        synchronized (this.e) {
            this.f = status;
            b(this.f);
        }
    }

    private void b() {
        if (this.a != null || this.c != null) {
            c cVar = (c) this.g.get();
            if (!(this.i || this.a == null || cVar == null)) {
                cVar.a(this);
                this.i = true;
            }
            if (this.f != null) {
                b(this.f);
            } else if (this.d != null) {
                this.d.a((h) this);
            }
        }
    }

    private void b(Status status) {
        synchronized (this.e) {
            if (this.a != null) {
                Status a = this.a.a(status);
                com.google.android.gms.common.internal.c.a((Object) a, (Object) "onFailure must not return null");
                this.b.a(a);
            } else if (c()) {
                this.c.a(status);
            }
        }
    }

    private void b(g gVar) {
        if (gVar instanceof f) {
            try {
                ((f) gVar).a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(gVar);
                Log.w("TransformedResultImpl", new StringBuilder(String.valueOf(valueOf).length() + 18).append("Unable to release ").append(valueOf).toString(), e);
            }
        }
    }

    private boolean c() {
        return (this.c == null || ((c) this.g.get()) == null) ? false : true;
    }

    void a() {
        this.c = null;
    }

    public void a(d<?> dVar) {
        synchronized (this.e) {
            this.d = dVar;
            b();
        }
    }

    public void a(final R r) {
        synchronized (this.e) {
            if (!r.a().d()) {
                a(r.a());
                b((g) r);
            } else if (this.a != null) {
                ae.a().submit(new Runnable(this) {
                    final /* synthetic */ al b;

                    public void run() {
                        c cVar;
                        try {
                            acg.a.set(Boolean.valueOf(true));
                            this.b.h.sendMessage(this.b.h.obtainMessage(0, this.b.a.a(r)));
                            acg.a.set(Boolean.valueOf(false));
                            this.b.b(r);
                            cVar = (c) this.b.g.get();
                            if (cVar != null) {
                                cVar.b(this.b);
                            }
                        } catch (RuntimeException e) {
                            this.b.h.sendMessage(this.b.h.obtainMessage(1, e));
                            acg.a.set(Boolean.valueOf(false));
                            this.b.b(r);
                            cVar = (c) this.b.g.get();
                            if (cVar != null) {
                                cVar.b(this.b);
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            acg.a.set(Boolean.valueOf(false));
                            this.b.b(r);
                            cVar = (c) this.b.g.get();
                            if (cVar != null) {
                                cVar.b(this.b);
                            }
                        }
                    }
                });
            } else if (c()) {
                this.c.b(r);
            }
        }
    }
}
