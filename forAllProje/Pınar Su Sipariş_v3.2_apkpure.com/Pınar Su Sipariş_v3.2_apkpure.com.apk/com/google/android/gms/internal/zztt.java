package com.google.android.gms.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zztq.zza;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.SearchAuth;
import com.google.android.gms.search.SearchAuthApi;
import com.google.android.gms.search.SearchAuthApi.GoogleNowAuthResult;

public class zztt implements SearchAuthApi {

    static abstract class a extends zza {
        a() {
        }

        public void zza(Status status, GoogleNowAuthState googleNowAuthState) {
            throw new UnsupportedOperationException();
        }

        public void zzbt(Status status) {
            throw new UnsupportedOperationException();
        }
    }

    static class b extends zznt.zza<Status, zzts> {
        private final String a;
        private final String b;
        private final boolean c = Log.isLoggable("SearchAuth", 3);

        protected b(GoogleApiClient googleApiClient, String str) {
            super(SearchAuth.API, googleApiClient);
            this.b = str;
            this.a = googleApiClient.getContext().getPackageName();
        }

        protected Status a(Status status) {
            if (this.c) {
                String str = "SearchAuth";
                String str2 = "ClearTokenImpl received failure: ";
                String valueOf = String.valueOf(status.getStatusMessage());
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return status;
        }

        protected void a(zzts com_google_android_gms_internal_zzts) throws RemoteException {
            if (this.c) {
                Log.d("SearchAuth", "ClearTokenImpl started");
            }
            ((zztr) com_google_android_gms_internal_zzts.zztm()).zzb(new a(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void zzbt(Status status) {
                    if (this.a.c) {
                        Log.d("SearchAuth", "ClearTokenImpl success");
                    }
                    this.a.zzb(status);
                }
            }, this.a, this.b);
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzts) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static class c extends zznt.zza<GoogleNowAuthResult, zzts> {
        private final String a;
        private final String b;
        private final boolean c = Log.isLoggable("SearchAuth", 3);

        protected c(GoogleApiClient googleApiClient, String str) {
            super(SearchAuth.API, googleApiClient);
            this.a = str;
            this.b = googleApiClient.getContext().getPackageName();
        }

        protected GoogleNowAuthResult a(Status status) {
            if (this.c) {
                String str = "SearchAuth";
                String str2 = "GetGoogleNowAuthImpl received failure: ";
                String valueOf = String.valueOf(status.getStatusMessage());
                Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            return new d(status, null);
        }

        protected void a(zzts com_google_android_gms_internal_zzts) throws RemoteException {
            if (this.c) {
                Log.d("SearchAuth", "GetGoogleNowAuthImpl started");
            }
            ((zztr) com_google_android_gms_internal_zzts.zztm()).zza(new a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void zza(Status status, GoogleNowAuthState googleNowAuthState) {
                    if (this.a.c) {
                        Log.d("SearchAuth", "GetGoogleNowAuthImpl success");
                    }
                    this.a.zzb(new d(status, googleNowAuthState));
                }
            }, this.b, this.a);
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzts) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static class d implements GoogleNowAuthResult {
        private final Status a;
        private final GoogleNowAuthState b;

        d(Status status, GoogleNowAuthState googleNowAuthState) {
            this.a = status;
            this.b = googleNowAuthState;
        }

        public GoogleNowAuthState getGoogleNowAuthState() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public PendingResult<Status> clearToken(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.zzc(new b(googleApiClient, str));
    }

    public PendingResult<GoogleNowAuthResult> getGoogleNowAuth(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.zzc(new c(googleApiClient, str));
    }
}
