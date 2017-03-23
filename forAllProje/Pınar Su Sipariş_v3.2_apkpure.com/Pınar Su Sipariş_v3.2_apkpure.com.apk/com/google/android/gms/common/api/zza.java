package com.google.android.gms.common.api;

import android.support.v4.h.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zznq;

public class zza extends zzb {
    private final ConnectionResult zzakJ;

    public zza(Status status, a<zznq<?>, ConnectionResult> aVar) {
        super(status, aVar);
        this.zzakJ = (ConnectionResult) aVar.get(aVar.b(0));
    }
}
