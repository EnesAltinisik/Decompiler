package com.google.android.gms.b;

import com.google.firebase.b;
import com.google.firebase.b.a;
import java.util.concurrent.ScheduledExecutorService;

public class fi implements gm {
    private final ScheduledExecutorService a;
    private final b b;

    public fi(b bVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = bVar;
        this.a = scheduledExecutorService;
    }

    private a b(final gm.b bVar) {
        return new a(this) {
            final /* synthetic */ fi b;
        };
    }

    public void a(gm.b bVar) {
        this.b.a(b(bVar));
    }

    public void a(boolean z, final gm.a aVar) {
        this.b.b(z).a(this.a, new com.google.android.gms.c.b<com.google.firebase.b.a>(this) {
            public void a(com.google.firebase.b.a aVar) {
                aVar.a(aVar.a());
            }

            public /* synthetic */ void a(Object obj) {
                a((com.google.firebase.b.a) obj);
            }
        }).a(this.a, new com.google.android.gms.c.a(this) {
            private boolean b(Exception exception) {
                return (exception instanceof com.google.firebase.a) || (exception instanceof kz);
            }

            public void a(Exception exception) {
                if (b(exception)) {
                    aVar.a(null);
                } else {
                    aVar.b(exception.getMessage());
                }
            }
        });
    }
}
