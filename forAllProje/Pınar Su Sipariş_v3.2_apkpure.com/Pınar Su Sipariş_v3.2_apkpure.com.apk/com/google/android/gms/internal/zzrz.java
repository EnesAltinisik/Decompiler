package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.SessionRegistrationRequest;
import com.google.android.gms.fitness.request.SessionStartRequest;
import com.google.android.gms.fitness.request.SessionStopRequest;
import com.google.android.gms.fitness.request.SessionUnregistrationRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzrn.zza;
import java.util.concurrent.TimeUnit;

public class zzrz implements SessionsApi {

    private static class a extends zza {
        private final zzb<SessionReadResult> a;

        private a(zzb<SessionReadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_SessionReadResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_SessionReadResult;
        }

        public void zza(SessionReadResult sessionReadResult) throws RemoteException {
            this.a.setResult(sessionReadResult);
        }
    }

    private static class b extends zzro.zza {
        private final zzb<SessionStopResult> a;

        private b(zzb<SessionStopResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_SessionStopResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_fitness_result_SessionStopResult;
        }

        public void zza(SessionStopResult sessionStopResult) {
            this.a.setResult(sessionStopResult);
        }
    }

    private PendingResult<SessionStopResult> zza(GoogleApiClient googleApiClient, final String str, final String str2) {
        return googleApiClient.zzd(new a<SessionStopResult>(this, googleApiClient) {
            final /* synthetic */ zzrz c;

            protected SessionStopResult a(Status status) {
                return SessionStopResult.zzZ(status);
            }

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionStopRequest(str, str2, new b(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> insertSession(GoogleApiClient googleApiClient, final SessionInsertRequest sessionInsertRequest) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ zzrz b;

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionInsertRequest(sessionInsertRequest, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<SessionReadResult> readSession(GoogleApiClient googleApiClient, final SessionReadRequest sessionReadRequest) {
        return googleApiClient.zzc(new a<SessionReadResult>(this, googleApiClient) {
            final /* synthetic */ zzrz b;

            protected SessionReadResult a(Status status) {
                return SessionReadResult.zzY(status);
            }

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionReadRequest(sessionReadRequest, new a(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> registerForSessions(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return zza(googleApiClient, pendingIntent, 0);
    }

    public PendingResult<Status> startSession(GoogleApiClient googleApiClient, final Session session) {
        zzaa.zzb((Object) session, (Object) "Session cannot be null");
        zzaa.zzb(session.getEndTime(TimeUnit.MILLISECONDS) == 0, (Object) "Cannot start a session which has already ended");
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrz b;

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionStartRequest(session, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<SessionStopResult> stopSession(GoogleApiClient googleApiClient, String str) {
        return zza(googleApiClient, null, str);
    }

    public PendingResult<Status> unregisterForSessions(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrz b;

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionUnregistrationRequest(pendingIntent, new zzsa(this)));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> zza(GoogleApiClient googleApiClient, final PendingIntent pendingIntent, final int i) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ zzrz c;

            protected void a(zzqy com_google_android_gms_internal_zzqy) throws RemoteException {
                ((zzrj) com_google_android_gms_internal_zzqy.zztm()).zza(new SessionRegistrationRequest(pendingIntent, new zzsa(this), i));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzqy) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
