package com.google.android.gms.common.api;

import android.support.v4.h.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zznq;

public class zzb implements Result {
    private final Status zzaaO;
    private final a<zznq<?>, ConnectionResult> zzakK;

    public zzb(Status status, a<zznq<?>, ConnectionResult> aVar) {
        this.zzaaO = status;
        this.zzakK = aVar;
    }

    public Status getStatus() {
        return this.zzaaO;
    }
}
