package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.b.aj;
import com.google.android.gms.common.internal.c;

public final class e {
    public static d<Status> a(Status status) {
        c.a((Object) status, (Object) "Result must not be null");
        d ajVar = new aj(Looper.getMainLooper());
        ajVar.a((g) status);
        return ajVar;
    }
}
