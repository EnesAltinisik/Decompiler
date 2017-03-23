package com.google.android.gms.b;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.c.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.util.k;

public abstract class abz {
    public final int a;

    private static abstract class a extends abz {
        protected final e<Void> b;

        public a(int i, e<Void> eVar) {
            super(i);
            this.b = eVar;
        }

        public void a(f fVar, boolean z) {
        }

        public final void a(com.google.android.gms.b.p.a<?> aVar) {
            try {
                b(aVar);
            } catch (RemoteException e) {
                a(abz.b(e));
                throw e;
            } catch (RemoteException e2) {
                a(abz.b(e2));
            }
        }

        public void a(Status status) {
            this.b.b(new l(status));
        }

        protected abstract void b(com.google.android.gms.b.p.a<?> aVar);
    }

    public static class b<A extends com.google.android.gms.b.ace.a<? extends g, com.google.android.gms.common.api.a.c>> extends abz {
        protected final A b;

        public b(int i, A a) {
            super(i);
            this.b = a;
        }

        public void a(f fVar, boolean z) {
            fVar.a(this.b, z);
        }

        public void a(com.google.android.gms.b.p.a<?> aVar) {
            this.b.b(aVar.b());
        }

        public void a(Status status) {
            this.b.c(status);
        }
    }

    public static final class c extends a {
        public final com.google.android.gms.b.y.a<?> c;

        public c(com.google.android.gms.b.y.a<?> aVar, e<Void> eVar) {
            super(4, eVar);
            this.c = aVar;
        }

        public /* bridge */ /* synthetic */ void a(f fVar, boolean z) {
            super.a(fVar, z);
        }

        public /* bridge */ /* synthetic */ void a(Status status) {
            super.a(status);
        }

        public void b(com.google.android.gms.b.p.a<?> aVar) {
            ad adVar = (ad) aVar.c().remove(this.c);
            if (adVar != null) {
                adVar.a.a();
                return;
            }
            Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
            this.b.b(new l(Status.c));
        }
    }

    public abz(int i) {
        this.a = i;
    }

    private static Status b(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (k.d() && (remoteException instanceof TransactionTooLargeException)) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }

    public abstract void a(f fVar, boolean z);

    public abstract void a(com.google.android.gms.b.p.a<?> aVar);

    public abstract void a(Status status);
}
