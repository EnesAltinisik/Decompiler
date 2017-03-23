package com.google.android.gms.b;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a.a.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;

public class abs extends n<b> implements abp {

    static final class a extends com.google.android.gms.b.ace.a<Status, abt> {
        private final abq d;

        a(abq com_google_android_gms_b_abq, c cVar) {
            super(abo.c, cVar);
            this.d = com_google_android_gms_b_abq;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(abt com_google_android_gms_b_abt) {
            abv anonymousClass1 = new com.google.android.gms.b.abv.a(this) {
                final /* synthetic */ a a;

                {
                    this.a = r1;
                }

                public void a(Status status) {
                    this.a.a((g) status);
                }

                public void b(Status status) {
                    throw new UnsupportedOperationException();
                }
            };
            try {
                abs.b(this.d);
                com_google_android_gms_b_abt.a(anonymousClass1, this.d);
            } catch (Throwable e) {
                Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
                c(new Status(10, "MessageProducer"));
            }
        }

        protected /* synthetic */ g b(Status status) {
            return a(status);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return this.d.equals(((a) obj).d);
        }

        public String toString() {
            String valueOf = String.valueOf(this.d);
            return new StringBuilder(String.valueOf(valueOf).length() + 20).append("LogEventMethodImpl(").append(valueOf).append(")").toString();
        }
    }

    abs(Context context) {
        super(context, abo.c, null, new aca());
    }

    public static abp a(Context context) {
        return new abs(context);
    }

    static void b(abq com_google_android_gms_b_abq) {
        if (com_google_android_gms_b_abq.j != null && com_google_android_gms_b_abq.i.k.length == 0) {
            com_google_android_gms_b_abq.i.k = com_google_android_gms_b_abq.j.a();
        }
        if (com_google_android_gms_b_abq.k != null && com_google_android_gms_b_abq.i.q.length == 0) {
            com_google_android_gms_b_abq.i.q = com_google_android_gms_b_abq.k.a();
        }
        com_google_android_gms_b_abq.c = ln.a(com_google_android_gms_b_abq.i);
    }

    public d<Status> a(abq com_google_android_gms_b_abq) {
        return b(new a(com_google_android_gms_b_abq, c()));
    }
}
