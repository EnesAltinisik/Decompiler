package com.google.android.gms.games.internal.api;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.internal.zznt;

public final class EventsImpl implements Events {

    private static abstract class a extends BaseGamesApiMethodImpl<LoadEventsResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadEventsResult a(final Status status) {
            return new LoadEventsResult(this) {
                final /* synthetic */ a b;

                public EventBuffer getEvents() {
                    return new EventBuffer(DataHolder.zzbQ(14));
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

    private static abstract class b extends BaseGamesApiMethodImpl<Result> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Result zzc(final Status status) {
            return new Result(this) {
                final /* synthetic */ b b;

                public Status getStatus() {
                    return status;
                }
            };
        }
    }

    @SuppressLint({"MissingRemoteException"})
    public void increment(GoogleApiClient googleApiClient, final String str, final int i) {
        GamesClientImpl zzc = Games.zzc(googleApiClient, false);
        if (zzc != null) {
            if (zzc.isConnected()) {
                zzc.zzn(str, i);
            } else {
                googleApiClient.zzd(new b(this, googleApiClient) {
                    final /* synthetic */ EventsImpl c;

                    public void a(GamesClientImpl gamesClientImpl) {
                        gamesClientImpl.zzn(str, i);
                    }

                    public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                        a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
                    }
                });
            }
        }
    }

    public PendingResult<LoadEventsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ EventsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzd((zznt.zzb) this, z);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<LoadEventsResult> loadByIds(GoogleApiClient googleApiClient, final boolean z, final String... strArr) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ EventsImpl c;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zznt.zzb) this, z, strArr);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
