package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;
import com.google.android.gms.internal.zznt.zzb;

public final class QuestsImpl implements Quests {

    private static abstract class a extends BaseGamesApiMethodImpl<AcceptQuestResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public AcceptQuestResult a(final Status status) {
            return new AcceptQuestResult(this) {
                final /* synthetic */ a b;

                public Quest getQuest() {
                    return null;
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

    private static abstract class b extends BaseGamesApiMethodImpl<ClaimMilestoneResult> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public ClaimMilestoneResult a(final Status status) {
            return new ClaimMilestoneResult(this) {
                final /* synthetic */ b b;

                public Milestone getMilestone() {
                    return null;
                }

                public Quest getQuest() {
                    return null;
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

    private static abstract class c extends BaseGamesApiMethodImpl<LoadQuestsResult> {
        private c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadQuestsResult a(final Status status) {
            return new LoadQuestsResult(this) {
                final /* synthetic */ c b;

                public QuestBuffer getQuests() {
                    return new QuestBuffer(DataHolder.zzbQ(status.getStatusCode()));
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

    public PendingResult<AcceptQuestResult> accept(GoogleApiClient googleApiClient, final String str) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ QuestsImpl b;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzh((zzb) this, str);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<ClaimMilestoneResult> claim(GoogleApiClient googleApiClient, final String str, final String str2) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ QuestsImpl c;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb((zzb) this, str, str2);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleApiClient, String str) {
        return Games.zzh(googleApiClient).zzej(str);
    }

    public Intent getQuestsIntent(GoogleApiClient googleApiClient, int[] iArr) {
        return Games.zzh(googleApiClient).zzb(iArr);
    }

    public PendingResult<LoadQuestsResult> load(GoogleApiClient googleApiClient, int[] iArr, int i, boolean z) {
        final int[] iArr2 = iArr;
        final int i2 = i;
        final boolean z2 = z;
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ QuestsImpl d;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zzb) this, iArr2, i2, z2);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<LoadQuestsResult> loadByIds(GoogleApiClient googleApiClient, final boolean z, final String... strArr) {
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ QuestsImpl c;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb((zzb) this, z, strArr);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleApiClient, QuestUpdateListener questUpdateListener) {
        GamesClientImpl zzb = Games.zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzc(googleApiClient.zzs(questUpdateListener));
        }
    }

    public void showStateChangedPopup(GoogleApiClient googleApiClient, String str) {
        GamesClientImpl zzb = Games.zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzek(str);
        }
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleApiClient) {
        GamesClientImpl zzb = Games.zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzzY();
        }
    }
}
