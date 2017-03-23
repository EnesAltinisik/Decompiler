package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;
import com.google.android.gms.internal.zznt.zzb;

public final class StatsImpl implements Stats {

    private static abstract class a extends BaseGamesApiMethodImpl<LoadPlayerStatsResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadPlayerStatsResult a(final Status status) {
            return new LoadPlayerStatsResult(this) {
                final /* synthetic */ a b;

                public PlayerStats getPlayerStats() {
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

    public PendingResult<LoadPlayerStatsResult> loadPlayerStats(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ StatsImpl b;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zze((zzb) this, z);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
