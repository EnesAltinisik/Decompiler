package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.SocialImpl;
import com.google.android.gms.games.internal.api.StatsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.api.VideosImpl;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.social.Social;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zznt.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Games {
    public static final Api<GamesOptions> API = new Api("Games.API", zzaaA, zzaaz);
    public static final Achievements Achievements = new AchievementsImpl();
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES = new Scope(Scopes.GAMES);
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final Stats Stats = new StatsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    public static final Videos Videos = new VideosImpl();
    private static final zza<GamesClientImpl, GamesOptions> zzaJm = new a() {
        public List<Scope> a(GamesOptions gamesOptions) {
            return Collections.singletonList(Games.zzaJn);
        }

        public /* synthetic */ List zzp(Object obj) {
            return a((GamesOptions) obj);
        }
    };
    public static final Scope zzaJn = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final Api<GamesOptions> zzaJo = new Api("Games.API_1P", zzaJm, zzaaz);
    public static final AppContents zzaJp = new AppContentsImpl();
    public static final Multiplayer zzaJq = new MultiplayerImpl();
    public static final Social zzaJr = new SocialImpl();
    private static final zza<GamesClientImpl, GamesOptions> zzaaA = new a() {
        public List<Scope> a(GamesOptions gamesOptions) {
            return Collections.singletonList(Games.SCOPE_GAMES);
        }

        public /* synthetic */ List zzp(Object obj) {
            return a((GamesOptions) obj);
        }
    };
    static final zzf<GamesClientImpl> zzaaz = new zzf();

    private static abstract class a extends zza<GamesClientImpl, GamesOptions> {
        private a() {
        }

        public GamesClientImpl a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, GamesOptions gamesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new GamesClientImpl(context, looper, com_google_android_gms_common_internal_zzg, gamesOptions == null ? new GamesOptions() : gamesOptions, connectionCallbacks, onConnectionFailedListener);
        }

        public int getPriority() {
            return 1;
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (GamesOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    }

    public static abstract class BaseGamesApiMethodImpl<R extends Result> extends zznt.zza<R, GamesClientImpl> {
        public BaseGamesApiMethodImpl(GoogleApiClient googleApiClient) {
            super(Games.zzaaz, googleApiClient);
        }
    }

    private static abstract class b extends BaseGamesApiMethodImpl<GetServerAuthCodeResult> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public GetServerAuthCodeResult a(final Status status) {
            return new GetServerAuthCodeResult(this) {
                final /* synthetic */ b b;

                public String getCode() {
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

    class AnonymousClass3 extends b {
        final /* synthetic */ String a;

        AnonymousClass3(GoogleApiClient googleApiClient, String str) {
            this.a = str;
            super(googleApiClient);
        }

        protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzb(this.a, (zzb) this);
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
        }
    }

    private static abstract class c extends BaseGamesApiMethodImpl<Status> {
        private c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    class AnonymousClass4 extends c {
        AnonymousClass4(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
            gamesClientImpl.zzf(this);
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
        }
    }

    public static final class GamesOptions implements Optional {
        public final boolean zzaJA;
        public final boolean zzaJB;
        public final boolean zzaJt;
        public final boolean zzaJu;
        public final int zzaJv;
        public final boolean zzaJw;
        public final int zzaJx;
        public final String zzaJy;
        public final ArrayList<String> zzaJz;

        public static final class Builder {
            boolean zzaJA;
            boolean zzaJB;
            boolean zzaJt;
            boolean zzaJu;
            int zzaJv;
            boolean zzaJw;
            int zzaJx;
            String zzaJy;
            ArrayList<String> zzaJz;

            private Builder() {
                this.zzaJt = false;
                this.zzaJu = true;
                this.zzaJv = 17;
                this.zzaJw = false;
                this.zzaJx = 4368;
                this.zzaJy = null;
                this.zzaJz = new ArrayList();
                this.zzaJA = false;
                this.zzaJB = false;
            }

            public GamesOptions build() {
                return new GamesOptions();
            }

            public Builder setRequireGooglePlus(boolean z) {
                this.zzaJA = z;
                return this;
            }

            public Builder setSdkVariant(int i) {
                this.zzaJx = i;
                return this;
            }

            public Builder setShowConnectingPopup(boolean z) {
                this.zzaJu = z;
                this.zzaJv = 17;
                return this;
            }

            public Builder setShowConnectingPopup(boolean z, int i) {
                this.zzaJu = z;
                this.zzaJv = i;
                return this;
            }
        }

        private GamesOptions() {
            this.zzaJt = false;
            this.zzaJu = true;
            this.zzaJv = 17;
            this.zzaJw = false;
            this.zzaJx = 4368;
            this.zzaJy = null;
            this.zzaJz = new ArrayList();
            this.zzaJA = false;
            this.zzaJB = false;
        }

        private GamesOptions(Builder builder) {
            this.zzaJt = false;
            this.zzaJu = builder.zzaJu;
            this.zzaJv = builder.zzaJv;
            this.zzaJw = false;
            this.zzaJx = builder.zzaJx;
            this.zzaJy = null;
            this.zzaJz = builder.zzaJz;
            this.zzaJA = builder.zzaJA;
            this.zzaJB = false;
        }

        public static Builder builder() {
            return new Builder();
        }

        public Bundle zzyP() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", this.zzaJt);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", this.zzaJu);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", this.zzaJv);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", this.zzaJw);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", this.zzaJx);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", this.zzaJy);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", this.zzaJz);
            bundle.putBoolean("com.google.android.gms.games.key.requireGooglePlus", this.zzaJA);
            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", this.zzaJB);
            return bundle;
        }
    }

    @Deprecated
    public interface GetServerAuthCodeResult extends Result {
        String getCode();
    }

    public interface GetTokenResult extends Result {
    }

    public static abstract class StatusImpl extends BaseGamesApiMethodImpl<Status> {
        public Status zzb(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return zzb(status);
        }
    }

    private Games() {
    }

    public static String getAppId(GoogleApiClient googleApiClient) {
        return zzh(googleApiClient).zziC();
    }

    public static String getCurrentAccountName(GoogleApiClient googleApiClient) {
        return zzh(googleApiClient).zzzP();
    }

    @Deprecated
    public static PendingResult<GetServerAuthCodeResult> getGamesServerAuthCode(GoogleApiClient googleApiClient, String str) {
        zzaa.zzh(str, "Please provide a valid serverClientId");
        return googleApiClient.zzd(new AnonymousClass3(googleApiClient, str));
    }

    public static int getSdkVariant(GoogleApiClient googleApiClient) {
        return zzh(googleApiClient).zzAc();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleApiClient) {
        return zzh(googleApiClient).zzAb();
    }

    public static void setGravityForPopups(GoogleApiClient googleApiClient, int i) {
        GamesClientImpl zzb = zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzgO(i);
        }
    }

    public static void setViewForPopups(GoogleApiClient googleApiClient, View view) {
        zzaa.zzz(view);
        GamesClientImpl zzb = zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzr(view);
        }
    }

    public static PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new AnonymousClass4(googleApiClient));
    }

    public static GamesClientImpl zzb(GoogleApiClient googleApiClient, boolean z) {
        zzaa.zzb(googleApiClient != null, (Object) "GoogleApiClient parameter is required.");
        zzaa.zza(googleApiClient.isConnected(), (Object) "GoogleApiClient must be connected.");
        return zzc(googleApiClient, z);
    }

    public static GamesClientImpl zzc(GoogleApiClient googleApiClient, boolean z) {
        zzaa.zza(googleApiClient.zza(API), (Object) "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean hasConnectedApi = googleApiClient.hasConnectedApi(API);
        if (!z || hasConnectedApi) {
            return hasConnectedApi ? (GamesClientImpl) googleApiClient.zza(zzaaz) : null;
        } else {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
    }

    public static GamesClientImpl zzh(GoogleApiClient googleApiClient) {
        return zzb(googleApiClient, true);
    }
}
