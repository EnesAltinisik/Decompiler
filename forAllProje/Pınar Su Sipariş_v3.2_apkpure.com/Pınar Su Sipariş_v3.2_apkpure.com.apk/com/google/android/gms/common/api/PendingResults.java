package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznv;
import com.google.android.gms.internal.zzox;
import com.google.android.gms.internal.zzpb;

public final class PendingResults {

    private static final class a<R extends Result> extends zznv<R> {
        private final R a;

        public a(R r) {
            super(Looper.getMainLooper());
            this.a = r;
        }

        protected R zzc(Status status) {
            if (status.getStatusCode() == this.a.getStatus().getStatusCode()) {
                return this.a;
            }
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    private static final class b<R extends Result> extends zznv<R> {
        private final R a;

        public b(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.a = r;
        }

        protected R zzc(Status status) {
            return this.a;
        }
    }

    private static final class c<R extends Result> extends zznv<R> {
        public c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected R zzc(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() {
        PendingResult com_google_android_gms_internal_zzpb = new zzpb(Looper.getMainLooper());
        com_google_android_gms_internal_zzpb.cancel();
        return com_google_android_gms_internal_zzpb;
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r) {
        zzaa.zzb((Object) r, (Object) "Result must not be null");
        zzaa.zzb(r.getStatus().getStatusCode() == 16, (Object) "Status code must be CommonStatusCodes.CANCELED");
        PendingResult aVar = new a(r);
        aVar.cancel();
        return aVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r) {
        zzaa.zzb((Object) r, (Object) "Result must not be null");
        PendingResult cVar = new c(null);
        cVar.zzb(r);
        return new zzox(cVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) {
        zzaa.zzb((Object) status, (Object) "Result must not be null");
        PendingResult com_google_android_gms_internal_zzpb = new zzpb(Looper.getMainLooper());
        com_google_android_gms_internal_zzpb.zzb(status);
        return com_google_android_gms_internal_zzpb;
    }

    public static <R extends Result> PendingResult<R> zza(R r, GoogleApiClient googleApiClient) {
        zzaa.zzb((Object) r, (Object) "Result must not be null");
        zzaa.zzb(!r.getStatus().isSuccess(), (Object) "Status code must not be SUCCESS");
        PendingResult bVar = new b(googleApiClient, r);
        bVar.zzb(r);
        return bVar;
    }

    public static PendingResult<Status> zza(Status status, GoogleApiClient googleApiClient) {
        zzaa.zzb((Object) status, (Object) "Result must not be null");
        PendingResult com_google_android_gms_internal_zzpb = new zzpb(googleApiClient);
        com_google_android_gms_internal_zzpb.zzb(status);
        return com_google_android_gms_internal_zzpb;
    }

    public static <R extends Result> OptionalPendingResult<R> zzb(R r, GoogleApiClient googleApiClient) {
        zzaa.zzb((Object) r, (Object) "Result must not be null");
        PendingResult cVar = new c(googleApiClient);
        cVar.zzb(r);
        return new zzox(cVar);
    }
}
