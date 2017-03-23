package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appdatasearch.zzk;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zznt.zza;
import java.util.List;

public final class zzmf implements zzk, AppIndexApi {

    private static abstract class b<T extends Result> extends zza<T, zzmd> {
        public b(GoogleApiClient googleApiClient) {
            super(com.google.android.gms.appdatasearch.zza.zzZt, googleApiClient);
        }

        protected abstract void a(zzma com_google_android_gms_internal_zzma) throws RemoteException;

        protected final void a(zzmd com_google_android_gms_internal_zzmd) throws RemoteException {
            a(com_google_android_gms_internal_zzmd.zzoM());
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzmd) com_google_android_gms_common_api_Api_zzb);
        }
    }

    private static abstract class c<T extends Result> extends b<Status> {
        c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected Status a(Status status) {
            return status;
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    @Deprecated
    private static final class a implements ActionResult {
        private zzmf a;
        private PendingResult<Status> b;
        private Action c;

        a(zzmf com_google_android_gms_internal_zzmf, PendingResult<Status> pendingResult, Action action) {
            this.a = com_google_android_gms_internal_zzmf;
            this.b = pendingResult;
            this.c = action;
        }

        public PendingResult<Status> end(GoogleApiClient googleApiClient) {
            String packageName = googleApiClient.getContext().getPackageName();
            UsageInfo zza = zzme.zza(this.c, System.currentTimeMillis(), packageName, 2);
            return this.a.zza(googleApiClient, zza);
        }

        public PendingResult<Status> getPendingResult() {
            return this.b;
        }
    }

    private static final class d extends zzmc<Status> {
        public d(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            super(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status);
        }

        public void zza(Status status) {
            this.zzaar.setResult(status);
        }
    }

    public static Intent zza(String str, Uri uri) {
        zzb(str, uri);
        if (zzl(uri)) {
            return new Intent("android.intent.action.VIEW", uri);
        }
        if (zzm(uri)) {
            return new Intent("android.intent.action.VIEW", zzk(uri));
        }
        String valueOf = String.valueOf(uri);
        throw new RuntimeException(new StringBuilder(String.valueOf(valueOf).length() + 70).append("appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ").append(valueOf).toString());
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, Action action, int i) {
        String packageName = googleApiClient.getContext().getPackageName();
        return zza(googleApiClient, zzme.zza(action, System.currentTimeMillis(), packageName, i));
    }

    private static void zzb(String str, Uri uri) {
        String valueOf;
        if (zzl(uri)) {
            if (uri.getHost().isEmpty()) {
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 98).append("AppIndex: The web URL must have a host (follow the format http(s)://<host>/[path]). Provided URI: ").append(valueOf).toString());
            }
        } else if (!zzm(uri)) {
            valueOf = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 176).append("AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/[host_path]'. Provided URI: ").append(valueOf).toString());
        } else if (str == null || str.equals(uri.getHost())) {
            List pathSegments = uri.getPathSegments();
            if (pathSegments.isEmpty() || ((String) pathSegments.get(0)).isEmpty()) {
                valueOf = String.valueOf(uri);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 128).append("AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/[host_path]). Provided URI: ").append(valueOf).toString());
            }
        } else {
            valueOf = String.valueOf(uri);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 150).append("AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/[host_path]. Provided URI: ").append(valueOf).toString());
        }
    }

    private static Uri zzk(Uri uri) {
        List pathSegments = uri.getPathSegments();
        String str = (String) pathSegments.get(0);
        Builder builder = new Builder();
        builder.scheme(str);
        if (pathSegments.size() > 1) {
            builder.authority((String) pathSegments.get(1));
            for (int i = 2; i < pathSegments.size(); i++) {
                builder.appendPath((String) pathSegments.get(i));
            }
        }
        builder.encodedQuery(uri.getEncodedQuery());
        builder.encodedFragment(uri.getEncodedFragment());
        return builder.build();
    }

    private static boolean zzl(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    private static boolean zzm(Uri uri) {
        return "android-app".equals(uri.getScheme());
    }

    public static void zzv(List<AppIndexingLink> list) {
        if (list != null) {
            for (AppIndexingLink appIndexingLink : list) {
                zzb(null, appIndexingLink.appIndexingUrl);
            }
        }
    }

    public ActionResult action(GoogleApiClient googleApiClient, Action action) {
        return new a(this, zza(googleApiClient, action, 1), action);
    }

    public PendingResult<Status> end(GoogleApiClient googleApiClient, Action action) {
        return zza(googleApiClient, action, 2);
    }

    public PendingResult<Status> start(GoogleApiClient googleApiClient, Action action) {
        return zza(googleApiClient, action, 1);
    }

    public PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Intent intent, String str, Uri uri, List<AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzv(list);
        return zza(googleApiClient, new UsageInfo(packageName, intent, str, uri, null, list, 1));
    }

    public PendingResult<Status> view(GoogleApiClient googleApiClient, Activity activity, Uri uri, String str, Uri uri2, List<AppIndexingLink> list) {
        String packageName = googleApiClient.getContext().getPackageName();
        zzb(packageName, uri);
        return view(googleApiClient, activity, zza(packageName, uri), str, uri2, (List) list);
    }

    public PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Intent intent) {
        String packageName = googleApiClient.getContext().getPackageName();
        return zza(googleApiClient, new UsageInfo.zza().zza(UsageInfo.zza(packageName, intent)).zzy(System.currentTimeMillis()).zzaF(0).zzaG(2).zzoL());
    }

    public PendingResult<Status> viewEnd(GoogleApiClient googleApiClient, Activity activity, Uri uri) {
        return viewEnd(googleApiClient, activity, zza(googleApiClient.getContext().getPackageName(), uri));
    }

    public PendingResult<Status> zza(GoogleApiClient googleApiClient, final UsageInfo... usageInfoArr) {
        return googleApiClient.zzc(new c<Status>(this, googleApiClient) {
            final /* synthetic */ zzmf b;

            protected void a(zzma com_google_android_gms_internal_zzma) throws RemoteException {
                com_google_android_gms_internal_zzma.zza(new d(this), null, usageInfoArr);
            }
        });
    }
}
