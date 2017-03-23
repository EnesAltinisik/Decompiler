package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zza;

abstract class ah<R extends Result> extends zza<R, zzpp> {

    static abstract class a extends ah<Status> {
        public a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public ah(GoogleApiClient googleApiClient) {
        super(zzpl.API, googleApiClient);
    }
}
