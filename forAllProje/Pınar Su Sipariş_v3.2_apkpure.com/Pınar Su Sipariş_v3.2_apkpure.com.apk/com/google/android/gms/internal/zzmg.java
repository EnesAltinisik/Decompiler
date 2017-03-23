package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.appinvite.AppInvite;
import com.google.android.gms.appinvite.AppInviteApi;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.appinvite.AppInviteReferral;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzmj.zza;

public class zzmg implements AppInviteApi {

    static class a extends zza {
        a() {
        }

        public void zza(Status status, Intent intent) {
            throw new UnsupportedOperationException();
        }

        public void zzd(Status status) throws RemoteException {
            throw new UnsupportedOperationException();
        }
    }

    static abstract class b<R extends Result> extends zznt.zza<R, zzmh> {
        public b(GoogleApiClient googleApiClient) {
            super(AppInvite.zzaaz, googleApiClient);
        }
    }

    final class c extends b<Status> {
        final /* synthetic */ zzmg a;
        private final String b;

        public c(zzmg com_google_android_gms_internal_zzmg, GoogleApiClient googleApiClient, String str) {
            this.a = com_google_android_gms_internal_zzmg;
            super(googleApiClient);
            this.b = str;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(zzmh com_google_android_gms_internal_zzmh) throws RemoteException {
            com_google_android_gms_internal_zzmh.zzb(new a(this) {
                final /* synthetic */ c a;

                {
                    this.a = r1;
                }

                public void zzd(Status status) throws RemoteException {
                    this.a.zzb(status);
                }
            }, this.b);
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzmh) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    final class d extends b<Status> {
        final /* synthetic */ zzmg a;
        private final String b;

        public d(zzmg com_google_android_gms_internal_zzmg, GoogleApiClient googleApiClient, String str) {
            this.a = com_google_android_gms_internal_zzmg;
            super(googleApiClient);
            this.b = str;
        }

        protected Status a(Status status) {
            return status;
        }

        protected void a(zzmh com_google_android_gms_internal_zzmh) throws RemoteException {
            com_google_android_gms_internal_zzmh.zza(new a(this) {
                final /* synthetic */ d a;

                {
                    this.a = r1;
                }

                public void zzd(Status status) throws RemoteException {
                    this.a.zzb(status);
                }
            }, this.b);
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzmh) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    final class e extends b<AppInviteInvitationResult> {
        final /* synthetic */ zzmg a;
        private final Activity b;
        private final boolean c;
        private final Intent d;

        public e(zzmg com_google_android_gms_internal_zzmg, GoogleApiClient googleApiClient, Activity activity, boolean z) {
            this.a = com_google_android_gms_internal_zzmg;
            super(googleApiClient);
            this.b = activity;
            this.c = z;
            this.d = this.b != null ? this.b.getIntent() : null;
        }

        protected AppInviteInvitationResult a(Status status) {
            return new zzmi(status, new Intent());
        }

        protected void a(zzmh com_google_android_gms_internal_zzmh) throws RemoteException {
            if (AppInviteReferral.hasReferral(this.d)) {
                zzb(new zzmi(Status.zzalw, this.d));
            } else {
                com_google_android_gms_internal_zzmh.zza(new a(this) {
                    final /* synthetic */ e a;

                    {
                        this.a = r1;
                    }

                    public void zza(Status status, Intent intent) {
                        this.a.zzb(new zzmi(status, intent));
                        if (AppInviteReferral.hasReferral(intent) && this.a.c && this.a.b != null) {
                            this.a.b.startActivity(intent);
                        }
                    }
                });
            }
        }

        protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzmh) com_google_android_gms_common_api_Api_zzb);
        }

        protected /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public PendingResult<Status> convertInvitation(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.zzc(new d(this, googleApiClient, str));
    }

    public PendingResult<AppInviteInvitationResult> getInvitation(GoogleApiClient googleApiClient, Activity activity, boolean z) {
        return googleApiClient.zzc(new e(this, googleApiClient, activity, z));
    }

    public PendingResult<Status> updateInvitationOnInstall(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.zzc(new c(this, googleApiClient, str));
    }
}
