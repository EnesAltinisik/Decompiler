package com.google.android.gms.b;

import android.content.Context;
import com.google.firebase.b;
import java.util.concurrent.atomic.AtomicReference;

public class kx {
    private static final AtomicReference<kx> a = new AtomicReference();

    kx(Context context) {
    }

    public static kx a(Context context) {
        a.compareAndSet(null, new kx(context));
        return (kx) a.get();
    }

    public void a(b bVar) {
    }
}
