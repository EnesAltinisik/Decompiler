package com.google.android.gms.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.AttestationData;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.safetynet.SafetyNetApi.AttestationResult;
import com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult;
import java.util.List;

public class zztn implements SafetyNetApi {

    static abstract class b extends ak<AttestationResult> {
        protected zztl c = new zztj(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void zza(Status status, AttestationData attestationData) {
                this.a.zzb(new a(status, attestationData));
            }
        };

        public b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected AttestationResult a(Status status) {
            return new a(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static abstract class c extends ak<SafeBrowsingResult> {
        protected zztl e = new zztj(this) {
            final /* synthetic */ c a;

            {
                this.a = r1;
            }

            public void zza(Status status, SafeBrowsingData safeBrowsingData) {
                this.a.zzb(new d(status, safeBrowsingData));
            }
        };

        public c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected SafeBrowsingResult a(Status status) {
            return new d(status, null);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static class a implements AttestationResult {
        private final Status a;
        private final AttestationData b;

        public a(Status status, AttestationData attestationData) {
            this.a = status;
            this.b = attestationData;
        }

        public String getJwsResult() {
            return this.b == null ? null : this.b.getJwsResult();
        }

        public Status getStatus() {
            return this.a;
        }
    }

    static class d implements SafeBrowsingResult {
        private Status a;
        private final SafeBrowsingData b;
        private String c = null;

        public d(Status status, SafeBrowsingData safeBrowsingData) {
            this.a = status;
            this.b = safeBrowsingData;
            if (this.b != null) {
                this.c = this.b.getMetadata();
            } else if (this.a.isSuccess()) {
                this.a = new Status(8);
            }
        }

        public String getMetadata() {
            return this.c;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public PendingResult<AttestationResult> attest(GoogleApiClient googleApiClient, final byte[] bArr) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zztn b;

            protected void a(zzto com_google_android_gms_internal_zzto) throws RemoteException {
                com_google_android_gms_internal_zzto.zza(this.c, bArr);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzto) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<SafeBrowsingResult> lookupUri(GoogleApiClient googleApiClient, List<Integer> list, String str) {
        return zza(googleApiClient, list, str, null);
    }

    public PendingResult<SafeBrowsingResult> zza(GoogleApiClient googleApiClient, List<Integer> list, String str, String str2) {
        if (list == null) {
            throw new IllegalArgumentException("Null threatTypes in lookupUri");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Null or empty uri in lookupUri");
        } else {
            final List<Integer> list2 = list;
            final String str3 = str;
            final String str4 = str2;
            return googleApiClient.zzc(new c(this, googleApiClient) {
                final /* synthetic */ zztn d;

                protected void a(zzto com_google_android_gms_internal_zzto) throws RemoteException {
                    com_google_android_gms_internal_zzto.zza(this.e, list2, 1, str3, str4);
                }

                protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zzto) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
    }
}
