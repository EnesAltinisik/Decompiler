package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.Plus.zza;
import com.google.android.gms.plus.internal.zze;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class zzti implements People {

    private static abstract class a extends zza<LoadPeopleResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadPeopleResult a(final Status status) {
            return new LoadPeopleResult(this) {
                final /* synthetic */ a b;

                public String getNextPageToken() {
                    return null;
                }

                public PersonBuffer getPersonBuffer() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public void release() {
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public Person getCurrentPerson(GoogleApiClient googleApiClient) {
        return Plus.zzf(googleApiClient, true).zzIm();
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, final Collection<String> collection) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzti b;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                com_google_android_gms_plus_internal_zze.zza(this, collection);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<LoadPeopleResult> load(GoogleApiClient googleApiClient, final String... strArr) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzti b;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                com_google_android_gms_plus_internal_zze.zzd(this, strArr);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<LoadPeopleResult> loadConnected(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzti a;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                com_google_android_gms_plus_internal_zze.zzt(this);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final int i, final String str) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzti c;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                zza(com_google_android_gms_plus_internal_zze.zza(this, i, str));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    @SuppressLint({"MissingRemoteException"})
    public PendingResult<LoadPeopleResult> loadVisible(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ zzti b;

            protected void a(zze com_google_android_gms_plus_internal_zze) {
                zza(com_google_android_gms_plus_internal_zze.zzu(this, str));
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
