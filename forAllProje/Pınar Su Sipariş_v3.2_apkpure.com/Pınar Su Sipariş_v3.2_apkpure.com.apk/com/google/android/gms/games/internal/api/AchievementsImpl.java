package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.internal.zznt;

public final class AchievementsImpl implements Achievements {

    private static abstract class a extends BaseGamesApiMethodImpl<LoadAchievementsResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadAchievementsResult a(final Status status) {
            return new LoadAchievementsResult(this) {
                final /* synthetic */ a b;

                public AchievementBuffer getAchievements() {
                    return new AchievementBuffer(DataHolder.zzbQ(14));
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

    private static abstract class b extends BaseGamesApiMethodImpl<UpdateAchievementResult> {
        private final String a;

        public b(String str, GoogleApiClient googleApiClient) {
            super(googleApiClient);
            this.a = str;
        }

        public UpdateAchievementResult a(final Status status) {
            return new UpdateAchievementResult(this) {
                final /* synthetic */ b b;

                public String getAchievementId() {
                    return this.b.a;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public Intent getAchievementsIntent(GoogleApiClient googleApiClient) {
        return Games.zzh(googleApiClient).zzzT();
    }

    public void increment(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        googleApiClient.zzd(new b(this, str, googleApiClient) {
            final /* synthetic */ AchievementsImpl c;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(null, str2, i2);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> incrementImmediate(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return googleApiClient.zzd(new b(this, str, googleApiClient) {
            final /* synthetic */ AchievementsImpl c;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zznt.zzb) this, str2, i2);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<LoadAchievementsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ AchievementsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzc((zznt.zzb) this, z);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void reveal(GoogleApiClient googleApiClient, final String str) {
        googleApiClient.zzd(new b(this, googleApiClient, str) {
            final /* synthetic */ AchievementsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza(null, str);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> revealImmediate(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new b(this, googleApiClient, str) {
            final /* synthetic */ AchievementsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zznt.zzb) this, str);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void setSteps(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        googleApiClient.zzd(new b(this, str, googleApiClient) {
            final /* synthetic */ AchievementsImpl c;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb(null, str2, i2);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> setStepsImmediate(GoogleApiClient googleApiClient, String str, int i) {
        final String str2 = str;
        final int i2 = i;
        return googleApiClient.zzd(new b(this, str, googleApiClient) {
            final /* synthetic */ AchievementsImpl c;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb((zznt.zzb) this, str2, i2);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void unlock(GoogleApiClient googleApiClient, final String str) {
        googleApiClient.zzd(new b(this, googleApiClient, str) {
            final /* synthetic */ AchievementsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb(null, str);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<UpdateAchievementResult> unlockImmediate(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new b(this, googleApiClient, str) {
            final /* synthetic */ AchievementsImpl b;

            public void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb((zznt.zzb) this, str);
            }

            public /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
