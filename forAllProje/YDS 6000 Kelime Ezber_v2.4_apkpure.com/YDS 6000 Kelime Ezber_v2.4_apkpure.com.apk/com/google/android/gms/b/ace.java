package com.google.android.gms.b;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.c;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.g;

public class ace {

    public static abstract class a<R extends g, A extends c> extends acg<R> {
        private final d<A> d;
        private final com.google.android.gms.common.api.a<?> e;

        protected a(com.google.android.gms.common.api.a<?> aVar, com.google.android.gms.common.api.c cVar) {
            super((com.google.android.gms.common.api.c) com.google.android.gms.common.internal.c.a((Object) cVar, (Object) "GoogleApiClient must not be null"));
            this.d = aVar.c();
            this.e = aVar;
        }

        private void a(RemoteException remoteException) {
            c(new Status(8, remoteException.getLocalizedMessage(), null));
        }

        protected abstract void a(A a);

        public final d<A> b() {
            return this.d;
        }

        public final void b(A a) {
            try {
                a((c) a);
            } catch (RemoteException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        public final com.google.android.gms.common.api.a<?> c() {
            return this.e;
        }

        public final void c(Status status) {
            com.google.android.gms.common.internal.c.b(!status.d(), "Failed result must not be success");
            a(b(status));
        }
    }
}
