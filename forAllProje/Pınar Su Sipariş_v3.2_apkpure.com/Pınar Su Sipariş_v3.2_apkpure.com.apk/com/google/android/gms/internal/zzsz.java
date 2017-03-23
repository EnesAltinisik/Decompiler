package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zza;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

public class zzsz implements PanoramaApi {

    private static abstract class c<R extends Result> extends zza<R, zzta> {
        protected c(GoogleApiClient googleApiClient) {
            super(Panorama.zzaaz, googleApiClient);
        }

        protected abstract void a(Context context, zzsy com_google_android_gms_internal_zzsy) throws RemoteException;

        protected final void a(zzta com_google_android_gms_internal_zzta) throws RemoteException {
            a(com_google_android_gms_internal_zzta.getContext(), (zzsy) com_google_android_gms_internal_zzta.zztm());
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzta) com_google_android_gms_common_api_Api_zzb);
        }
    }

    private static abstract class a extends c<PanoramaResult> {
        public a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected PanoramaResult a(Status status) {
            return new aj(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    class AnonymousClass3 extends zzsx.zza {
        final /* synthetic */ Context a;
        final /* synthetic */ Uri b;
        final /* synthetic */ zzsx c;

        AnonymousClass3(Context context, Uri uri, zzsx com_google_android_gms_internal_zzsx) {
            this.a = context;
            this.b = uri;
            this.c = com_google_android_gms_internal_zzsx;
        }

        public void zza(int i, Bundle bundle, int i2, Intent intent) throws RemoteException {
            zzsz.zza(this.a, this.b);
            this.c.zza(i, bundle, i2, intent);
        }
    }

    private static final class b extends zzsx.zza {
        private final zznt.zzb<PanoramaResult> a;

        public b(zznt.zzb<PanoramaResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_panorama_PanoramaApi_PanoramaResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_panorama_PanoramaApi_PanoramaResult;
        }

        public void zza(int i, Bundle bundle, int i2, Intent intent) {
            this.a.setResult(new aj(new Status(i, null, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null), intent));
        }
    }

    private static void zza(Context context, Uri uri) {
        context.revokeUriPermission(uri, 1);
    }

    private static void zza(Context context, zzsy com_google_android_gms_internal_zzsy, zzsx com_google_android_gms_internal_zzsx, Uri uri, Bundle bundle) throws RemoteException {
        context.grantUriPermission("com.google.android.gms", uri, 1);
        try {
            com_google_android_gms_internal_zzsy.zza(new AnonymousClass3(context, uri, com_google_android_gms_internal_zzsx), uri, bundle, true);
        } catch (RemoteException e) {
            zza(context, uri);
            throw e;
        } catch (RuntimeException e2) {
            zza(context, uri);
            throw e2;
        }
    }

    public PendingResult<PanoramaResult> loadPanoramaInfo(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzsz b;

            protected void a(Context context, zzsy com_google_android_gms_internal_zzsy) throws RemoteException {
                com_google_android_gms_internal_zzsy.zza(new b(this), uri, null, false);
            }
        });
    }

    public PendingResult<PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient googleApiClient, final Uri uri) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzsz b;

            protected void a(Context context, zzsy com_google_android_gms_internal_zzsy) throws RemoteException {
                zzsz.zza(context, com_google_android_gms_internal_zzsy, new b(this), uri, null);
            }
        });
    }
}
