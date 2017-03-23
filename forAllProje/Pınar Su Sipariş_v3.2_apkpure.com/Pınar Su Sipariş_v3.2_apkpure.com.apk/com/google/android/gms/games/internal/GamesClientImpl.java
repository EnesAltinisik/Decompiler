package com.google.android.gms.games.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzd.zzf;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.Games.GetServerAuthCodeResult;
import com.google.android.gms.games.Games.GetTokenResult;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.Notifications.ContactSettingLoadResult;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.Notifications.InboxCountResult;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;
import com.google.android.gms.games.Players.LoadStockProfileImagesResult;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.Players.UpdateGamerProfileResult;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.internal.IGamesService.Stub;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.player.ProfileSettingsEntity;
import com.google.android.gms.games.internal.player.StockProfileImageBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests.LoadRequestSummariesResult;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import com.google.android.gms.games.request.Requests.SendRequestResult;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.games.social.Social.InviteUpdateResult;
import com.google.android.gms.games.social.Social.LoadInvitesResult;
import com.google.android.gms.games.social.SocialInvite;
import com.google.android.gms.games.social.SocialInviteBuffer;
import com.google.android.gms.games.social.SocialInviteEntity;
import com.google.android.gms.games.stats.PlayerStats;
import com.google.android.gms.games.stats.PlayerStatsBuffer;
import com.google.android.gms.games.stats.PlayerStatsEntity;
import com.google.android.gms.games.stats.Stats.LoadPlayerStatsResult;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoBuffer;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.games.video.Videos.CaptureAvailableResult;
import com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult;
import com.google.android.gms.games.video.Videos.CaptureOverlayStateListener;
import com.google.android.gms.games.video.Videos.CaptureRuntimeErrorCallback;
import com.google.android.gms.games.video.Videos.CaptureStateResult;
import com.google.android.gms.games.video.Videos.CaptureStoppedResult;
import com.google.android.gms.games.video.Videos.CaptureStreamingAvailabilityResult;
import com.google.android.gms.games.video.Videos.CaptureStreamingMetadataResult;
import com.google.android.gms.games.video.Videos.CaptureStreamingUrlResult;
import com.google.android.gms.games.video.Videos.ListVideosResult;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zznz;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzou;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public final class GamesClientImpl extends zzk<IGamesService> {
    EventIncrementManager zzaKQ = new EventIncrementManager(this) {
        final /* synthetic */ GamesClientImpl a;

        {
            this.a = r1;
        }

        public EventIncrementCache zzAn() {
            return new ao(this.a);
        }
    };
    private final String zzaKR;
    private PlayerEntity zzaKS;
    private GameEntity zzaKT;
    private final PopupManager zzaKU;
    private boolean zzaKV = false;
    private final Binder zzaKW;
    private final long zzaKX;
    private final GamesOptions zzaKY;

    private static abstract class c extends zznz<RoomStatusUpdateListener> {
        c(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, DataHolder dataHolder) {
            a(roomStatusUpdateListener, GamesClientImpl.zzai(dataHolder));
        }

        protected abstract void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room);

        protected /* synthetic */ void zza(Object obj, DataHolder dataHolder) {
            a((RoomStatusUpdateListener) obj, dataHolder);
        }
    }

    private static abstract class a extends c {
        private final ArrayList<String> a = new ArrayList();

        a(DataHolder dataHolder, String[] strArr) {
            super(dataHolder);
            for (Object add : strArr) {
                this.a.add(add);
            }
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            a(roomStatusUpdateListener, room, this.a);
        }

        protected abstract void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList);
    }

    private static final class aa extends AbstractGamesCallbacks {
        private final zzb<CaptureStreamingMetadataResult> a;

        aa(zzb<CaptureStreamingMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingMetadataResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingMetadataResult, (Object) "Holder must not be null");
        }

        public void zzd(int i, String str, String str2) {
            this.a.setResult(new ab(new Status(i), str, str2));
        }
    }

    private static final class ab implements CaptureStreamingMetadataResult {
        private final Status a;
        private final String b;
        private final String c;

        ab(Status status, String str, String str2) {
            this.a = status;
            this.b = str;
            this.c = str2;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class ac extends AbstractGamesCallbacks {
        private final zzb<CaptureStreamingUrlResult> a;

        ac(zzb<CaptureStreamingUrlResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingUrlResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingUrlResult, (Object) "Holder must not be null");
        }

        public void zzl(int i, String str) {
            this.a.setResult(new ad(new Status(i), str));
        }
    }

    private static final class ad implements CaptureStreamingUrlResult {
        private final Status a;
        private final String b;

        ad(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status getStatus() {
            return this.a;
        }

        public String getUrl() {
            return this.b;
        }
    }

    private static abstract class aw extends zzoa {
        protected aw(DataHolder dataHolder) {
            super(dataHolder, GamesStatusCodes.zzgs(dataHolder.getStatusCode()));
        }
    }

    private static final class ae extends aw implements ClaimMilestoneResult {
        private final Milestone a;
        private final Quest b;

        ae(DataHolder dataHolder, String str) {
            super(dataHolder);
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            try {
                if (questBuffer.getCount() > 0) {
                    this.b = new QuestEntity((Quest) questBuffer.get(0));
                    List zzBv = this.b.zzBv();
                    int size = zzBv.size();
                    for (int i = 0; i < size; i++) {
                        if (((Milestone) zzBv.get(i)).getMilestoneId().equals(str)) {
                            this.a = (Milestone) zzBv.get(i);
                            return;
                        }
                    }
                    this.a = null;
                } else {
                    this.a = null;
                    this.b = null;
                }
                questBuffer.release();
            } finally {
                questBuffer.release();
            }
        }

        public Milestone getMilestone() {
            return this.a;
        }

        public Quest getQuest() {
            return this.b;
        }
    }

    private static final class af extends aw implements CommitSnapshotResult {
        private final SnapshotMetadata a;

        af(DataHolder dataHolder) {
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() > 0) {
                    this.a = new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0));
                } else {
                    this.a = null;
                }
                snapshotMetadataBuffer.release();
            } catch (Throwable th) {
                snapshotMetadataBuffer.release();
            }
        }

        public SnapshotMetadata getSnapshotMetadata() {
            return this.a;
        }
    }

    private static final class ag extends c {
        ag(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onConnectedToRoom(room);
        }
    }

    private static final class ah extends aw implements ContactSettingLoadResult {
        ah(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class ai extends AbstractGamesCallbacks {
        private final zzb<ContactSettingLoadResult> a;

        ai(zzb<ContactSettingLoadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_ContactSettingLoadResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_ContactSettingLoadResult, (Object) "Holder must not be null");
        }

        public void zzI(DataHolder dataHolder) {
            this.a.setResult(new ah(dataHolder));
        }
    }

    private static final class aj extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        aj(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzgE(int i) {
            this.a.setResult(GamesStatusCodes.zzgs(i));
        }
    }

    private static final class ak extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        ak(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzgI(int i) {
            this.a.setResult(new Status(i));
        }
    }

    private static final class al implements DeleteSnapshotResult {
        private final Status a;
        private final String b;

        al(int i, String str) {
            this.a = GamesStatusCodes.zzgs(i);
            this.b = str;
        }

        public String getSnapshotId() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class am extends c {
        am(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onDisconnectedFromRoom(room);
        }
    }

    private static final class an extends AbstractGamesCallbacks {
        private final zzb<LoadEventsResult> a;

        an(zzb<LoadEventsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult, (Object) "Holder must not be null");
        }

        public void zzi(DataHolder dataHolder) {
            this.a.setResult(new bx(dataHolder));
        }
    }

    private class ao extends EventIncrementCache {
        final /* synthetic */ GamesClientImpl a;

        public ao(GamesClientImpl gamesClientImpl) {
            this.a = gamesClientImpl;
            super(gamesClientImpl.getContext().getMainLooper(), 1000);
        }

        protected void zzq(String str, int i) {
            try {
                if (this.a.isConnected()) {
                    ((IGamesService) this.a.zztm()).zzn(str, i);
                } else {
                    GamesLog.zzE("GamesClientImpl", new StringBuilder(String.valueOf(str).length() + 89).append("Unable to increment event ").append(str).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                }
            } catch (RemoteException e) {
                this.a.zzb(e);
            }
        }
    }

    private static final class ap extends AbstractGamesCallbacks {
        private final zzb<LoadGameInstancesResult> a;

        ap(zzb<LoadGameInstancesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameInstancesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameInstancesResult, (Object) "Holder must not be null");
        }

        public void zzp(DataHolder dataHolder) {
            this.a.setResult(new by(dataHolder));
        }
    }

    private static final class aq implements GameMuteStatusChangeResult {
        private final Status a;
        private final String b;
        private final boolean c;

        public aq(int i, String str, boolean z) {
            this.a = GamesStatusCodes.zzgs(i);
            this.b = str;
            this.c = z;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class ar extends AbstractGamesCallbacks {
        private final zzb<GameMuteStatusChangeResult> a;

        ar(zzb<GameMuteStatusChangeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusChangeResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusChangeResult, (Object) "Holder must not be null");
        }

        public void zza(int i, String str, boolean z) {
            this.a.setResult(new aq(i, str, z));
        }
    }

    private static final class as implements GameMuteStatusLoadResult {
        private final Status a;
        private final String b;
        private final boolean c;

        public as(DataHolder dataHolder) {
            try {
                this.a = GamesStatusCodes.zzgs(dataHolder.getStatusCode());
                if (dataHolder.getCount() > 0) {
                    this.b = dataHolder.zzd("external_game_id", 0, 0);
                    this.c = dataHolder.zze("muted", 0, 0);
                } else {
                    this.b = null;
                    this.c = false;
                }
                dataHolder.close();
            } catch (Throwable th) {
                dataHolder.close();
            }
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class at extends AbstractGamesCallbacks {
        private final zzb<GameMuteStatusLoadResult> a;

        at(zzb<GameMuteStatusLoadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusLoadResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusLoadResult, (Object) "Holder must not be null");
        }

        public void zzG(DataHolder dataHolder) {
            this.a.setResult(new as(dataHolder));
        }
    }

    private static final class au extends AbstractGamesCallbacks {
        private final zzb<LoadGameSearchSuggestionsResult> a;

        au(zzb<LoadGameSearchSuggestionsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameSearchSuggestionsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameSearchSuggestionsResult, (Object) "Holder must not be null");
        }

        public void zzq(DataHolder dataHolder) {
            this.a.setResult(new bz(dataHolder));
        }
    }

    private static final class av extends AbstractGamesCallbacks {
        private final zzb<UpdateGamerProfileResult> a;

        av(zzb<UpdateGamerProfileResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_UpdateGamerProfileResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_UpdateGamerProfileResult;
        }

        public void zzh(int i, Bundle bundle) {
            this.a.setResult(new ez(i, bundle));
        }
    }

    private static final class ax extends AbstractGamesCallbacks {
        private final zzb<LoadGamesResult> a;

        ax(zzb<LoadGamesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGamesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGamesResult, (Object) "Holder must not be null");
        }

        public void zzn(DataHolder dataHolder) {
            this.a.setResult(new ca(dataHolder));
        }
    }

    private static final class ay extends AbstractGamesCallbacks {
        private final zzb<GetTokenResult> a;

        public ay(zzb<GetTokenResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetTokenResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetTokenResult, (Object) "Holder must not be null");
        }

        public void zzh(int i, String str) {
            this.a.setResult(new bb(GamesStatusCodes.zzgs(i), str));
        }
    }

    private static final class az extends AbstractGamesCallbacks {
        private final zzb<GetServerAuthCodeResult> a;

        public az(zzb<GetServerAuthCodeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetServerAuthCodeResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetServerAuthCodeResult, (Object) "Holder must not be null");
        }

        public void zzh(int i, String str) {
            this.a.setResult(new ba(GamesStatusCodes.zzgs(i), str));
        }
    }

    private static abstract class b extends zznz<RoomUpdateListener> {
        b(DataHolder dataHolder) {
            super(dataHolder);
        }

        protected void a(RoomUpdateListener roomUpdateListener, DataHolder dataHolder) {
            a(roomUpdateListener, GamesClientImpl.zzai(dataHolder), dataHolder.getStatusCode());
        }

        protected abstract void a(RoomUpdateListener roomUpdateListener, Room room, int i);

        protected /* synthetic */ void zza(Object obj, DataHolder dataHolder) {
            a((RoomUpdateListener) obj, dataHolder);
        }
    }

    private static final class ba implements GetServerAuthCodeResult {
        private final Status a;
        private final String b;

        ba(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public String getCode() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class bb implements GetTokenResult {
        private final Status a;
        private final String b;

        bb(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class bc extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        bc(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzad(Status status) {
            this.a.setResult(status);
        }
    }

    private static final class bd extends AbstractGamesCallbacks {
        private final zzb<InviteUpdateResult> a;

        bd(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, (Object) "Holder must not be null");
        }

        public void zzad(DataHolder dataHolder) {
            this.a.setResult(new bl(dataHolder));
        }
    }

    private static final class be implements InboxCountResult {
        private final Status a;
        private final Bundle b;

        be(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class bf extends AbstractGamesCallbacks {
        private final zzb<InboxCountResult> a;

        bf(zzb<InboxCountResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_InboxCountResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_InboxCountResult, (Object) "Holder must not be null");
        }

        public void zzg(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.setResult(new be(GamesStatusCodes.zzgs(i), bundle));
        }
    }

    private static abstract class eu extends aw {
        final TurnBasedMatch a;

        eu(DataHolder dataHolder) {
            super(dataHolder);
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            try {
                if (turnBasedMatchBuffer.getCount() > 0) {
                    this.a = (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze();
                } else {
                    this.a = null;
                }
                turnBasedMatchBuffer.release();
            } catch (Throwable th) {
                turnBasedMatchBuffer.release();
            }
        }

        public TurnBasedMatch getMatch() {
            return this.a;
        }
    }

    private static final class bg extends eu implements InitiateMatchResult {
        bg(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class bh extends AbstractGamesCallbacks {
        private final zzou<OnInvitationReceivedListener> a;

        bh(zzou<OnInvitationReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_OnInvitationReceivedListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_OnInvitationReceivedListener;
        }

        public void onInvitationRemoved(String str) {
            this.a.zza(new bj(str));
        }

        public void zzs(DataHolder dataHolder) {
            InvitationBuffer invitationBuffer = new InvitationBuffer(dataHolder);
            Invitation invitation = null;
            try {
                if (invitationBuffer.getCount() > 0) {
                    invitation = (Invitation) ((Invitation) invitationBuffer.get(0)).freeze();
                }
                invitationBuffer.release();
                if (invitation != null) {
                    this.a.zza(new bi(invitation));
                }
            } catch (Throwable th) {
                invitationBuffer.release();
            }
        }
    }

    private static final class bi implements zzou.zzb<OnInvitationReceivedListener> {
        private final Invitation a;

        bi(Invitation invitation) {
            this.a = invitation;
        }

        public void a(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationReceived(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnInvitationReceivedListener) obj);
        }
    }

    private static final class bj implements zzou.zzb<OnInvitationReceivedListener> {
        private final String a;

        bj(String str) {
            this.a = str;
        }

        public void a(OnInvitationReceivedListener onInvitationReceivedListener) {
            onInvitationReceivedListener.onInvitationRemoved(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnInvitationReceivedListener) obj);
        }
    }

    private static final class bk extends AbstractGamesCallbacks {
        private final zzb<LoadInvitationsResult> a;

        bk(zzb<LoadInvitationsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult, (Object) "Holder must not be null");
        }

        public void zzr(DataHolder dataHolder) {
            this.a.setResult(new cb(dataHolder));
        }
    }

    private static final class bl extends aw implements InviteUpdateResult {
        private final SocialInvite a;

        bl(DataHolder dataHolder) {
            super(dataHolder);
            SocialInviteBuffer socialInviteBuffer = new SocialInviteBuffer(dataHolder);
            try {
                if (socialInviteBuffer.getCount() > 0) {
                    this.a = new SocialInviteEntity((SocialInvite) socialInviteBuffer.get(0));
                } else {
                    this.a = null;
                }
                socialInviteBuffer.release();
            } catch (Throwable th) {
                socialInviteBuffer.release();
            }
        }
    }

    private static final class bm extends AbstractGamesCallbacks {
        private final zzb<LoadInvitesResult> a;

        bm(zzb<LoadInvitesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_LoadInvitesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_LoadInvitesResult, (Object) "Holder must not be null");
        }

        public void zzah(DataHolder dataHolder) {
            this.a.setResult(new cc(dataHolder));
        }
    }

    private static final class bn extends b {
        public bn(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onJoinedRoom(i, room);
        }
    }

    private static final class bo extends aw implements LeaderboardMetadataResult {
        private final LeaderboardBuffer a;

        bo(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new LeaderboardBuffer(dataHolder);
        }

        public LeaderboardBuffer getLeaderboards() {
            return this.a;
        }
    }

    private static final class bp extends AbstractGamesCallbacks {
        private final zzb<LoadScoresResult> a;

        bp(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, (Object) "Holder must not be null");
        }

        public void zza(DataHolder dataHolder, DataHolder dataHolder2) {
            this.a.setResult(new cl(dataHolder, dataHolder2));
        }
    }

    private static final class bq extends AbstractGamesCallbacks {
        private final zzb<LeaderboardMetadataResult> a;

        bq(zzb<LeaderboardMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult, (Object) "Holder must not be null");
        }

        public void zzj(DataHolder dataHolder) {
            this.a.setResult(new bo(dataHolder));
        }
    }

    private static final class br extends eu implements LeaveMatchResult {
        br(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class bs implements zzou.zzb<RoomUpdateListener> {
        private final int a;
        private final String b;

        bs(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public void a(RoomUpdateListener roomUpdateListener) {
            roomUpdateListener.onLeftRoom(this.a, this.b);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((RoomUpdateListener) obj);
        }
    }

    private static final class bt extends AbstractGamesCallbacks {
        private final zzb<ListVideosResult> a;

        bt(zzb<ListVideosResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult, (Object) "Holder must not be null");
        }

        public void zzX(DataHolder dataHolder) {
            this.a.setResult(new bu(dataHolder));
        }
    }

    private static final class bu extends aw implements ListVideosResult {
        private final VideoBuffer a;

        public bu(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new VideoBuffer(dataHolder);
        }
    }

    private static final class bv extends aw implements LoadAchievementsResult {
        private final AchievementBuffer a;

        bv(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new AchievementBuffer(dataHolder);
        }

        public AchievementBuffer getAchievements() {
            return this.a;
        }
    }

    private static final class bw extends aw implements LoadAppContentResult {
        private final ArrayList<DataHolder> a;

        bw(DataHolder[] dataHolderArr) {
            super(dataHolderArr[0]);
            this.a = new ArrayList(Arrays.asList(dataHolderArr));
        }
    }

    private static final class bx extends aw implements LoadEventsResult {
        private final EventBuffer a;

        bx(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new EventBuffer(dataHolder);
        }

        public EventBuffer getEvents() {
            return this.a;
        }
    }

    private static final class by extends aw implements LoadGameInstancesResult {
        private final GameInstanceBuffer a;

        by(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new GameInstanceBuffer(dataHolder);
        }
    }

    private static final class bz extends aw implements LoadGameSearchSuggestionsResult {
        private final GameSearchSuggestionBuffer a;

        bz(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new GameSearchSuggestionBuffer(dataHolder);
        }
    }

    private static final class ca extends aw implements LoadGamesResult {
        private final GameBuffer a;

        ca(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new GameBuffer(dataHolder);
        }

        public GameBuffer getGames() {
            return this.a;
        }
    }

    private static final class cb extends aw implements LoadInvitationsResult {
        private final InvitationBuffer a;

        cb(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new InvitationBuffer(dataHolder);
        }

        public InvitationBuffer getInvitations() {
            return this.a;
        }
    }

    private static final class cc extends aw implements LoadInvitesResult {
        private final SocialInviteBuffer a;

        cc(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new SocialInviteBuffer(dataHolder);
        }
    }

    private static final class cd extends eu implements LoadMatchResult {
        cd(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class ce implements LoadMatchesResult {
        private final Status a;
        private final LoadMatchesResponse b;

        ce(Status status, Bundle bundle) {
            this.a = status;
            this.b = new LoadMatchesResponse(bundle);
        }

        public LoadMatchesResponse getMatches() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            this.b.release();
        }
    }

    private static final class cf extends aw implements LoadPlayerScoreResult {
        private final LeaderboardScoreEntity a;

        cf(DataHolder dataHolder) {
            super(dataHolder);
            LeaderboardScoreBuffer leaderboardScoreBuffer = new LeaderboardScoreBuffer(dataHolder);
            try {
                if (leaderboardScoreBuffer.getCount() > 0) {
                    this.a = (LeaderboardScoreEntity) ((LeaderboardScore) leaderboardScoreBuffer.get(0)).freeze();
                } else {
                    this.a = null;
                }
                leaderboardScoreBuffer.release();
            } catch (Throwable th) {
                leaderboardScoreBuffer.release();
            }
        }

        public LeaderboardScore getScore() {
            return this.a;
        }
    }

    private static final class cg extends aw implements LoadPlayerStatsResult {
        private final PlayerStats a;

        cg(DataHolder dataHolder) {
            super(dataHolder);
            PlayerStatsBuffer playerStatsBuffer = new PlayerStatsBuffer(dataHolder);
            try {
                if (playerStatsBuffer.getCount() > 0) {
                    this.a = new PlayerStatsEntity((PlayerStats) playerStatsBuffer.get(0));
                } else {
                    this.a = null;
                }
                playerStatsBuffer.release();
            } catch (Throwable th) {
                playerStatsBuffer.release();
            }
        }

        public PlayerStats getPlayerStats() {
            return this.a;
        }
    }

    private static final class ch extends aw implements LoadPlayersResult {
        private final PlayerBuffer a;

        ch(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new PlayerBuffer(dataHolder);
        }

        public PlayerBuffer getPlayers() {
            return this.a;
        }
    }

    private static final class ci extends aw implements LoadQuestsResult {
        private final DataHolder a;

        ci(DataHolder dataHolder) {
            super(dataHolder);
            this.a = dataHolder;
        }

        public QuestBuffer getQuests() {
            return new QuestBuffer(this.a);
        }
    }

    private static final class cj extends aw implements LoadRequestSummariesResult {
        cj(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class ck implements LoadRequestsResult {
        private final Status a;
        private final Bundle b;

        ck(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle;
        }

        public GameRequestBuffer getRequests(int i) {
            String zzgS = RequestType.zzgS(i);
            return !this.b.containsKey(zzgS) ? null : new GameRequestBuffer((DataHolder) this.b.get(zzgS));
        }

        public Status getStatus() {
            return this.a;
        }

        public void release() {
            for (String parcelable : this.b.keySet()) {
                DataHolder dataHolder = (DataHolder) this.b.getParcelable(parcelable);
                if (dataHolder != null) {
                    dataHolder.close();
                }
            }
        }
    }

    private static final class cl extends aw implements LoadScoresResult {
        private final LeaderboardEntity a;
        private final LeaderboardScoreBuffer b;

        cl(DataHolder dataHolder, DataHolder dataHolder2) {
            super(dataHolder2);
            LeaderboardBuffer leaderboardBuffer = new LeaderboardBuffer(dataHolder);
            try {
                if (leaderboardBuffer.getCount() > 0) {
                    this.a = (LeaderboardEntity) ((Leaderboard) leaderboardBuffer.get(0)).freeze();
                } else {
                    this.a = null;
                }
                leaderboardBuffer.release();
                this.b = new LeaderboardScoreBuffer(dataHolder2);
            } catch (Throwable th) {
                leaderboardBuffer.release();
            }
        }

        public Leaderboard getLeaderboard() {
            return this.a;
        }

        public LeaderboardScoreBuffer getScores() {
            return this.b;
        }
    }

    private static final class cm extends aw implements LoadSnapshotsResult {
        cm(DataHolder dataHolder) {
            super(dataHolder);
        }

        public SnapshotMetadataBuffer getSnapshots() {
            return new SnapshotMetadataBuffer(this.zzamz);
        }
    }

    private static final class cn extends aw implements LoadStockProfileImagesResult {
        private final StockProfileImageBuffer a;

        cn(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new StockProfileImageBuffer(dataHolder);
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    private static final class co implements LoadXpForGameCategoriesResult {
        private final Status a;
        private final List<String> b;
        private final Bundle c;

        co(Status status, Bundle bundle) {
            this.a = status;
            this.b = bundle.getStringArrayList("game_category_list");
            this.c = bundle;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class cp extends aw implements LoadXpStreamResult {
        private final ExperienceEventBuffer a;

        cp(DataHolder dataHolder) {
            super(dataHolder);
            this.a = new ExperienceEventBuffer(dataHolder);
        }
    }

    private static final class cq implements zzou.zzb<OnTurnBasedMatchUpdateReceivedListener> {
        private final String a;

        cq(String str) {
            this.a = str;
        }

        public void a(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchRemoved(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnTurnBasedMatchUpdateReceivedListener) obj);
        }
    }

    private static final class cr extends AbstractGamesCallbacks {
        private final zzou<OnTurnBasedMatchUpdateReceivedListener> a;

        cr(zzou<OnTurnBasedMatchUpdateReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_turnbased_OnTurnBasedMatchUpdateReceivedListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_turnbased_OnTurnBasedMatchUpdateReceivedListener;
        }

        public void onTurnBasedMatchRemoved(String str) {
            this.a.zza(new cq(str));
        }

        public void zzy(DataHolder dataHolder) {
            TurnBasedMatchBuffer turnBasedMatchBuffer = new TurnBasedMatchBuffer(dataHolder);
            TurnBasedMatch turnBasedMatch = null;
            try {
                if (turnBasedMatchBuffer.getCount() > 0) {
                    turnBasedMatch = (TurnBasedMatch) ((TurnBasedMatch) turnBasedMatchBuffer.get(0)).freeze();
                }
                turnBasedMatchBuffer.release();
                if (turnBasedMatch != null) {
                    this.a.zza(new cs(turnBasedMatch));
                }
            } catch (Throwable th) {
                turnBasedMatchBuffer.release();
            }
        }
    }

    private static final class cs implements zzou.zzb<OnTurnBasedMatchUpdateReceivedListener> {
        private final TurnBasedMatch a;

        cs(TurnBasedMatch turnBasedMatch) {
            this.a = turnBasedMatch;
        }

        public void a(OnTurnBasedMatchUpdateReceivedListener onTurnBasedMatchUpdateReceivedListener) {
            onTurnBasedMatchUpdateReceivedListener.onTurnBasedMatchReceived(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnTurnBasedMatchUpdateReceivedListener) obj);
        }
    }

    private static final class ct implements zzou.zzb<RealTimeMessageReceivedListener> {
        private final RealTimeMessage a;

        ct(RealTimeMessage realTimeMessage) {
            this.a = realTimeMessage;
        }

        public void a(RealTimeMessageReceivedListener realTimeMessageReceivedListener) {
            realTimeMessageReceivedListener.onRealTimeMessageReceived(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((RealTimeMessageReceivedListener) obj);
        }
    }

    private static final class cu extends aw implements OpenSnapshotResult {
        private final Snapshot a;
        private final String b;
        private final Snapshot c;
        private final Contents d;
        private final SnapshotContents e;

        cu(DataHolder dataHolder, Contents contents) {
            this(dataHolder, null, contents, null, null);
        }

        cu(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            boolean z = true;
            super(dataHolder);
            SnapshotMetadataBuffer snapshotMetadataBuffer = new SnapshotMetadataBuffer(dataHolder);
            try {
                if (snapshotMetadataBuffer.getCount() == 0) {
                    this.a = null;
                    this.c = null;
                } else if (snapshotMetadataBuffer.getCount() == 1) {
                    if (dataHolder.getStatusCode() == 4004) {
                        z = false;
                    }
                    com.google.android.gms.common.internal.zzb.zzai(z);
                    this.a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                    this.c = null;
                } else {
                    this.a = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(0)), new SnapshotContentsEntity(contents));
                    this.c = new SnapshotEntity(new SnapshotMetadataEntity((SnapshotMetadata) snapshotMetadataBuffer.get(1)), new SnapshotContentsEntity(contents2));
                }
                snapshotMetadataBuffer.release();
                this.b = str;
                this.d = contents3;
                this.e = new SnapshotContentsEntity(contents3);
            } catch (Throwable th) {
                snapshotMetadataBuffer.release();
            }
        }

        public String getConflictId() {
            return this.b;
        }

        public Snapshot getConflictingSnapshot() {
            return this.c;
        }

        public SnapshotContents getResolutionSnapshotContents() {
            return this.e;
        }

        public Snapshot getSnapshot() {
            return this.a;
        }
    }

    private static final class cv implements zzou.zzb<RoomStatusUpdateListener> {
        private final String a;

        cv(String str) {
            this.a = str;
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener) {
            roomStatusUpdateListener.onP2PConnected(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((RoomStatusUpdateListener) obj);
        }
    }

    private static final class cw implements zzou.zzb<RoomStatusUpdateListener> {
        private final String a;

        cw(String str) {
            this.a = str;
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener) {
            roomStatusUpdateListener.onP2PDisconnected(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((RoomStatusUpdateListener) obj);
        }
    }

    private static final class cx extends a {
        cx(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersConnected(room, arrayList);
        }
    }

    private static final class cy extends a {
        cy(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerDeclined(room, arrayList);
        }
    }

    private static final class cz extends a {
        cz(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeersDisconnected(room, arrayList);
        }
    }

    private static final class d extends AbstractGamesCallbacks {
        private final zzb<InviteUpdateResult> a;

        d(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, (Object) "Holder must not be null");
        }

        public void zzaa(DataHolder dataHolder) {
            this.a.setResult(new bl(dataHolder));
        }
    }

    private static final class da extends a {
        da(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerInvitedToRoom(room, arrayList);
        }
    }

    private static final class db extends a {
        db(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerJoined(room, arrayList);
        }
    }

    private static final class dc extends a {
        dc(DataHolder dataHolder, String[] strArr) {
            super(dataHolder, strArr);
        }

        protected void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room, ArrayList<String> arrayList) {
            roomStatusUpdateListener.onPeerLeft(room, arrayList);
        }
    }

    private static final class dd extends AbstractGamesCallbacks {
        private final zzb<LoadPlayerScoreResult> a;

        dd(zzb<LoadPlayerScoreResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadPlayerScoreResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadPlayerScoreResult, (Object) "Holder must not be null");
        }

        public void zzJ(DataHolder dataHolder) {
            this.a.setResult(new cf(dataHolder));
        }
    }

    private static final class de extends AbstractGamesCallbacks {
        private final zzb<LoadPlayerStatsResult> a;

        public de(zzb<LoadPlayerStatsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_stats_Stats_LoadPlayerStatsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_stats_Stats_LoadPlayerStatsResult, (Object) "Holder must not be null");
        }

        public void zzW(DataHolder dataHolder) {
            this.a.setResult(new cg(dataHolder));
        }
    }

    private static final class df extends AbstractGamesCallbacks {
        private final zzb<LoadPlayersResult> a;

        df(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, (Object) "Holder must not be null");
        }

        public void zzaf(DataHolder dataHolder) {
            this.a.setResult(new ch(dataHolder));
        }
    }

    private static final class dg extends AbstractGamesCallbacks {
        private final zzb<LoadXpForGameCategoriesResult> a;

        dg(zzb<LoadXpForGameCategoriesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpForGameCategoriesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpForGameCategoriesResult, (Object) "Holder must not be null");
        }

        public void zzf(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.setResult(new co(GamesStatusCodes.zzgs(i), bundle));
        }
    }

    static final class dh extends AbstractGamesCallbacks {
        private final zzb<LoadXpStreamResult> a;

        dh(zzb<LoadXpStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult, (Object) "Holder must not be null");
        }

        public void zzU(DataHolder dataHolder) {
            this.a.setResult(new cp(dataHolder));
        }
    }

    private static final class di extends AbstractGamesCallbacks {
        private final zzb<LoadPlayersResult> a;

        di(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, (Object) "Holder must not be null");
        }

        public void zzl(DataHolder dataHolder) {
            this.a.setResult(new ch(dataHolder));
        }

        public void zzm(DataHolder dataHolder) {
            this.a.setResult(new ch(dataHolder));
        }
    }

    private static final class dj extends AbstractGamesClient {
        private final PopupManager a;

        public dj(PopupManager popupManager) {
            this.a = popupManager;
        }

        public PopupLocationInfoParcelable zzzL() {
            return new PopupLocationInfoParcelable(this.a.zzAE());
        }
    }

    private static final class dk extends AbstractGamesCallbacks {
        private final zzb<LoadProfileSettingsResult> a;

        dk(zzb<LoadProfileSettingsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadProfileSettingsResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadProfileSettingsResult;
        }

        public void zzV(DataHolder dataHolder) {
            this.a.setResult(new ProfileSettingsEntity(dataHolder));
            dataHolder.close();
        }
    }

    private static final class dl extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        dl(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzgF(int i) {
            this.a.setResult(GamesStatusCodes.zzgs(i));
        }
    }

    private static final class dm extends AbstractGamesCallbacks {
        private final zzb<AcceptQuestResult> a;

        public dm(zzb<AcceptQuestResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_AcceptQuestResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_AcceptQuestResult, (Object) "Holder must not be null");
        }

        public void zzQ(DataHolder dataHolder) {
            this.a.setResult(new e(dataHolder));
        }
    }

    private static final class dn implements zzou.zzb<QuestUpdateListener> {
        private final Quest a;

        dn(Quest quest) {
            this.a = quest;
        }

        public void a(QuestUpdateListener questUpdateListener) {
            questUpdateListener.onQuestCompleted(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((QuestUpdateListener) obj);
        }
    }

    private static final class do extends AbstractGamesCallbacks {
        private final zzb<ClaimMilestoneResult> a;
        private final String b;

        public do(zzb<ClaimMilestoneResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_ClaimMilestoneResult, String str) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_ClaimMilestoneResult, (Object) "Holder must not be null");
            this.b = (String) zzaa.zzb((Object) str, (Object) "MilestoneId must not be null");
        }

        public void zzP(DataHolder dataHolder) {
            this.a.setResult(new ae(dataHolder, this.b));
        }
    }

    private static final class dp extends AbstractGamesCallbacks {
        private final zzou<QuestUpdateListener> a;

        dp(zzou<QuestUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_quest_QuestUpdateListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_games_quest_QuestUpdateListener;
        }

        private Quest a(DataHolder dataHolder) {
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            Quest quest = null;
            try {
                if (questBuffer.getCount() > 0) {
                    quest = (Quest) ((Quest) questBuffer.get(0)).freeze();
                }
                questBuffer.release();
                return quest;
            } catch (Throwable th) {
                questBuffer.release();
            }
        }

        public void zzR(DataHolder dataHolder) {
            Quest a = a(dataHolder);
            if (a != null) {
                this.a.zza(new dn(a));
            }
        }
    }

    private static final class dq extends AbstractGamesCallbacks {
        private final zzb<LoadQuestsResult> a;

        public dq(zzb<LoadQuestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult, (Object) "Holder must not be null");
        }

        public void zzT(DataHolder dataHolder) {
            this.a.setResult(new ci(dataHolder));
        }
    }

    private static final class dr implements zzou.zzb<ReliableMessageSentCallback> {
        private final int a;
        private final String b;
        private final int c;

        dr(int i, int i2, String str) {
            this.a = i;
            this.c = i2;
            this.b = str;
        }

        public void a(ReliableMessageSentCallback reliableMessageSentCallback) {
            if (reliableMessageSentCallback != null) {
                reliableMessageSentCallback.onRealTimeMessageSent(this.a, this.c, this.b);
            }
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((ReliableMessageSentCallback) obj);
        }
    }

    private static final class ds extends AbstractGamesCallbacks {
        final zzou<ReliableMessageSentCallback> a;

        public ds(zzou<ReliableMessageSentCallback> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMultiplayer_ReliableMessageSentCallback) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMultiplayer_ReliableMessageSentCallback;
        }

        public void zzb(int i, int i2, String str) {
            if (this.a != null) {
                this.a.zza(new dr(i, i2, str));
            }
        }
    }

    private static final class dt extends AbstractGamesCallbacks {
        private final zzou<OnRequestReceivedListener> a;

        dt(zzou<OnRequestReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_request_OnRequestReceivedListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_games_request_OnRequestReceivedListener;
        }

        public void onRequestRemoved(String str) {
            this.a.zza(new dv(str));
        }

        public void zzt(DataHolder dataHolder) {
            GameRequestBuffer gameRequestBuffer = new GameRequestBuffer(dataHolder);
            GameRequest gameRequest = null;
            try {
                if (gameRequestBuffer.getCount() > 0) {
                    gameRequest = (GameRequest) ((GameRequest) gameRequestBuffer.get(0)).freeze();
                }
                gameRequestBuffer.release();
                if (gameRequest != null) {
                    this.a.zza(new du(gameRequest));
                }
            } catch (Throwable th) {
                gameRequestBuffer.release();
            }
        }
    }

    private static final class du implements zzou.zzb<OnRequestReceivedListener> {
        private final GameRequest a;

        du(GameRequest gameRequest) {
            this.a = gameRequest;
        }

        public void a(OnRequestReceivedListener onRequestReceivedListener) {
            onRequestReceivedListener.onRequestReceived(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnRequestReceivedListener) obj);
        }
    }

    private static final class dv implements zzou.zzb<OnRequestReceivedListener> {
        private final String a;

        dv(String str) {
            this.a = str;
        }

        public void a(OnRequestReceivedListener onRequestReceivedListener) {
            onRequestReceivedListener.onRequestRemoved(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((OnRequestReceivedListener) obj);
        }
    }

    private static final class dw extends AbstractGamesCallbacks {
        private final zzb<SendRequestResult> a;

        public dw(zzb<SendRequestResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_SendRequestResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_SendRequestResult, (Object) "Holder must not be null");
        }

        public void zzL(DataHolder dataHolder) {
            this.a.setResult(new eg(dataHolder));
        }
    }

    private static final class dx extends AbstractGamesCallbacks {
        private final zzb<LoadRequestSummariesResult> a;

        public dx(zzb<LoadRequestSummariesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestSummariesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestSummariesResult, (Object) "Holder must not be null");
        }

        public void zzM(DataHolder dataHolder) {
            this.a.setResult(new cj(dataHolder));
        }
    }

    private static final class dy extends AbstractGamesCallbacks {
        private final zzb<LoadRequestsResult> a;

        public dy(zzb<LoadRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult, (Object) "Holder must not be null");
        }

        public void zzd(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.setResult(new ck(GamesStatusCodes.zzgs(i), bundle));
        }
    }

    private static final class dz extends AbstractGamesCallbacks {
        private final zzb<UpdateRequestsResult> a;

        public dz(zzb<UpdateRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult, (Object) "Holder must not be null");
        }

        public void zzK(DataHolder dataHolder) {
            this.a.setResult(new fd(dataHolder));
        }
    }

    private static final class e extends aw implements AcceptQuestResult {
        private final Quest a;

        e(DataHolder dataHolder) {
            super(dataHolder);
            QuestBuffer questBuffer = new QuestBuffer(dataHolder);
            try {
                if (questBuffer.getCount() > 0) {
                    this.a = new QuestEntity((Quest) questBuffer.get(0));
                } else {
                    this.a = null;
                }
                questBuffer.release();
            } catch (Throwable th) {
                questBuffer.release();
            }
        }

        public Quest getQuest() {
            return this.a;
        }
    }

    private static final class ea extends c {
        ea(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomAutoMatching(room);
        }
    }

    private static final class eb extends AbstractGamesCallbacks {
        private final zzou<? extends RoomUpdateListener> a;
        private final zzou<? extends RoomStatusUpdateListener> b;
        private final zzou<RealTimeMessageReceivedListener> c;

        public eb(zzou<RoomUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener) {
            this.a = (zzou) zzaa.zzb((Object) com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, (Object) "Callbacks must not be null");
            this.b = null;
            this.c = null;
        }

        public eb(zzou<? extends RoomUpdateListener> com_google_android_gms_internal_zzou__extends_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, zzou<? extends RoomStatusUpdateListener> com_google_android_gms_internal_zzou__extends_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener, zzou<RealTimeMessageReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener) {
            this.a = (zzou) zzaa.zzb((Object) com_google_android_gms_internal_zzou__extends_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, (Object) "Callbacks must not be null");
            this.b = com_google_android_gms_internal_zzou__extends_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener;
            this.c = com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener;
        }

        public void onLeftRoom(int i, String str) {
            this.a.zza(new bs(i, str));
        }

        public void onP2PConnected(String str) {
            if (this.b != null) {
                this.b.zza(new cv(str));
            }
        }

        public void onP2PDisconnected(String str) {
            if (this.b != null) {
                this.b.zza(new cw(str));
            }
        }

        public void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) {
            if (this.c != null) {
                this.c.zza(new ct(realTimeMessage));
            }
        }

        public void zzA(DataHolder dataHolder) {
            this.a.zza(new bn(dataHolder));
        }

        public void zzB(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.zza(new ed(dataHolder));
            }
        }

        public void zzC(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.zza(new ea(dataHolder));
            }
        }

        public void zzD(DataHolder dataHolder) {
            this.a.zza(new ec(dataHolder));
        }

        public void zzE(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.zza(new ag(dataHolder));
            }
        }

        public void zzF(DataHolder dataHolder) {
            if (this.b != null) {
                this.b.zza(new am(dataHolder));
            }
        }

        public void zza(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new da(dataHolder, strArr));
            }
        }

        public void zzb(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new db(dataHolder, strArr));
            }
        }

        public void zzc(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new dc(dataHolder, strArr));
            }
        }

        public void zzd(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new cy(dataHolder, strArr));
            }
        }

        public void zze(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new cx(dataHolder, strArr));
            }
        }

        public void zzf(DataHolder dataHolder, String[] strArr) {
            if (this.b != null) {
                this.b.zza(new cz(dataHolder, strArr));
            }
        }

        public void zzz(DataHolder dataHolder) {
            this.a.zza(new ee(dataHolder));
        }
    }

    private static final class ec extends b {
        ec(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomConnected(i, room);
        }
    }

    private static final class ed extends c {
        ed(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomStatusUpdateListener roomStatusUpdateListener, Room room) {
            roomStatusUpdateListener.onRoomConnecting(room);
        }
    }

    private static final class ee extends b {
        public ee(DataHolder dataHolder) {
            super(dataHolder);
        }

        public void a(RoomUpdateListener roomUpdateListener, Room room, int i) {
            roomUpdateListener.onRoomCreated(i, room);
        }
    }

    private static final class ef extends AbstractGamesCallbacks {
        private final zzb<InviteUpdateResult> a;

        ef(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, (Object) "Holder must not be null");
        }

        public void zzZ(DataHolder dataHolder) {
            this.a.setResult(new bl(dataHolder));
        }
    }

    private static final class eg extends aw implements SendRequestResult {
        private final GameRequest a;

        eg(DataHolder dataHolder) {
            super(dataHolder);
            GameRequestBuffer gameRequestBuffer = new GameRequestBuffer(dataHolder);
            try {
                if (gameRequestBuffer.getCount() > 0) {
                    this.a = (GameRequest) ((GameRequest) gameRequestBuffer.get(0)).freeze();
                } else {
                    this.a = null;
                }
                gameRequestBuffer.release();
            } catch (Throwable th) {
                gameRequestBuffer.release();
            }
        }
    }

    private static final class eh extends AbstractGamesCallbacks {
        private final zzb<LoadPlayersResult> a;

        eh(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, (Object) "Holder must not be null");
        }

        public void zzag(DataHolder dataHolder) {
            this.a.setResult(new ch(dataHolder));
        }
    }

    private static final class ei extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        public ei(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzzK() {
            this.a.setResult(GamesStatusCodes.zzgs(0));
        }
    }

    private static final class ej extends AbstractGamesCallbacks {
        private final zzb<CommitSnapshotResult> a;

        public ej(zzb<CommitSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_CommitSnapshotResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_CommitSnapshotResult, (Object) "Holder must not be null");
        }

        public void zzO(DataHolder dataHolder) {
            this.a.setResult(new af(dataHolder));
        }
    }

    static final class ek extends AbstractGamesCallbacks {
        private final zzb<DeleteSnapshotResult> a;

        public ek(zzb<DeleteSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_DeleteSnapshotResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_DeleteSnapshotResult, (Object) "Holder must not be null");
        }

        public void zzk(int i, String str) {
            this.a.setResult(new al(i, str));
        }
    }

    private static final class el extends AbstractGamesCallbacks {
        private final zzb<OpenSnapshotResult> a;

        public el(zzb<OpenSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult, (Object) "Holder must not be null");
        }

        public void zza(DataHolder dataHolder, Contents contents) {
            this.a.setResult(new cu(dataHolder, contents));
        }

        public void zza(DataHolder dataHolder, String str, Contents contents, Contents contents2, Contents contents3) {
            this.a.setResult(new cu(dataHolder, str, contents, contents2, contents3));
        }
    }

    private static final class em extends AbstractGamesCallbacks {
        private final zzb<LoadSnapshotsResult> a;

        public em(zzb<LoadSnapshotsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult, (Object) "Holder must not be null");
        }

        public void zzN(DataHolder dataHolder) {
            this.a.setResult(new cm(dataHolder));
        }
    }

    private static final class en extends AbstractGamesCallbacks {
        private final zzb<LoadStockProfileImagesResult> a;

        en(zzb<LoadStockProfileImagesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadStockProfileImagesResult) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadStockProfileImagesResult;
        }

        public void zzY(DataHolder dataHolder) {
            this.a.setResult(new cn(dataHolder));
        }
    }

    private static final class eo extends AbstractGamesCallbacks {
        private final zzb<SubmitScoreResult> a;

        public eo(zzb<SubmitScoreResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_SubmitScoreResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_SubmitScoreResult, (Object) "Holder must not be null");
        }

        public void zzk(DataHolder dataHolder) {
            this.a.setResult(new ep(dataHolder));
        }
    }

    private static final class ep extends aw implements SubmitScoreResult {
        private final ScoreSubmissionData a;

        public ep(DataHolder dataHolder) {
            super(dataHolder);
            try {
                this.a = new ScoreSubmissionData(dataHolder);
            } finally {
                dataHolder.close();
            }
        }

        public ScoreSubmissionData getScoreData() {
            return this.a;
        }
    }

    private static final class eq extends AbstractGamesCallbacks {
        private final zzb<CancelMatchResult> a;

        public eq(zzb<CancelMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_CancelMatchResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_CancelMatchResult, (Object) "Holder must not be null");
        }

        public void zzj(int i, String str) {
            this.a.setResult(new j(GamesStatusCodes.zzgs(i), str));
        }
    }

    private static final class er extends AbstractGamesCallbacks {
        private final zzb<InitiateMatchResult> a;

        public er(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, (Object) "Holder must not be null");
        }

        public void zzv(DataHolder dataHolder) {
            this.a.setResult(new bg(dataHolder));
        }
    }

    private static final class es extends AbstractGamesCallbacks {
        private final zzb<LeaveMatchResult> a;

        public es(zzb<LeaveMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult, (Object) "Holder must not be null");
        }

        public void zzx(DataHolder dataHolder) {
            this.a.setResult(new br(dataHolder));
        }
    }

    private static final class et extends AbstractGamesCallbacks {
        private final zzb<LoadMatchResult> a;

        public et(zzb<LoadMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchResult, (Object) "Holder must not be null");
        }

        public void zzu(DataHolder dataHolder) {
            this.a.setResult(new cd(dataHolder));
        }
    }

    private static final class ev extends AbstractGamesCallbacks {
        private final zzb<UpdateMatchResult> a;

        public ev(zzb<UpdateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult, (Object) "Holder must not be null");
        }

        public void zzw(DataHolder dataHolder) {
            this.a.setResult(new fb(dataHolder));
        }
    }

    private static final class ew extends AbstractGamesCallbacks {
        private final zzb<LoadMatchesResult> a;

        public ew(zzb<LoadMatchesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult, (Object) "Holder must not be null");
        }

        public void zzc(int i, Bundle bundle) {
            bundle.setClassLoader(getClass().getClassLoader());
            this.a.setResult(new ce(GamesStatusCodes.zzgs(i), bundle));
        }
    }

    private static final class ex implements UpdateAchievementResult {
        private final Status a;
        private final String b;

        ex(int i, String str) {
            this.a = GamesStatusCodes.zzgs(i);
            this.b = str;
        }

        public String getAchievementId() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class ey extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        ey(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzgJ(int i) {
            this.a.setResult(new Status(i));
        }
    }

    private static final class ez implements UpdateGamerProfileResult {
        private final Status a;
        private final Bundle b;

        ez(int i, Bundle bundle) {
            this.a = new Status(i);
            this.b = bundle;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class f extends AbstractGamesCallbacks {
        private final zzb<UpdateAchievementResult> a;

        f(zzb<UpdateAchievementResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult, (Object) "Holder must not be null");
        }

        public void zzi(int i, String str) {
            this.a.setResult(new ex(i, str));
        }
    }

    private static final class fa extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        fa(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzae(Status status) {
            this.a.setResult(status);
        }
    }

    private static final class fb extends eu implements UpdateMatchResult {
        fb(DataHolder dataHolder) {
            super(dataHolder);
        }
    }

    private static final class fc extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        fc(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status;
        }

        public void zzgK(int i) {
            this.a.setResult(new Status(i));
        }
    }

    private static final class fd extends aw implements UpdateRequestsResult {
        private final RequestUpdateOutcomes a;

        fd(DataHolder dataHolder) {
            super(dataHolder);
            this.a = RequestUpdateOutcomes.zzal(dataHolder);
        }

        public Set<String> getRequestIds() {
            return this.a.getRequestIds();
        }

        public int getRequestOutcome(String str) {
            return this.a.getRequestOutcome(str);
        }
    }

    private static final class g extends AbstractGamesCallbacks {
        private final zzb<LoadAchievementsResult> a;

        g(zzb<LoadAchievementsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult, (Object) "Holder must not be null");
        }

        public void zzh(DataHolder dataHolder) {
            this.a.setResult(new bv(dataHolder));
        }
    }

    private static final class h extends AbstractGamesCallbacks {
        private final zzb<LoadAppContentResult> a;

        public h(zzb<LoadAppContentResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_appcontent_AppContents_LoadAppContentResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_appcontent_AppContents_LoadAppContentResult, (Object) "Holder must not be null");
        }

        public void zza(DataHolder[] dataHolderArr) {
            this.a.setResult(new bw(dataHolderArr));
        }
    }

    private static final class i extends AbstractGamesCallbacks {
        private final zzb<InviteUpdateResult> a;

        i(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, (Object) "Holder must not be null");
        }

        public void zzae(DataHolder dataHolder) {
            this.a.setResult(new bl(dataHolder));
        }
    }

    private static final class j implements CancelMatchResult {
        private final Status a;
        private final String b;

        j(Status status, String str) {
            this.a = status;
            this.b = str;
        }

        public String getMatchId() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class k extends AbstractGamesCallbacks {
        private final zzb<CaptureAvailableResult> a;

        k(zzb<CaptureAvailableResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureAvailableResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureAvailableResult, (Object) "Holder must not be null");
        }

        public void zzg(int i, boolean z) {
            this.a.setResult(new l(new Status(i), z));
        }
    }

    private static final class l implements CaptureAvailableResult {
        private final Status a;
        private final boolean b;

        l(Status status, boolean z) {
            this.a = status;
            this.b = z;
        }

        public Status getStatus() {
            return this.a;
        }

        public boolean isAvailable() {
            return this.b;
        }
    }

    private static final class m extends AbstractGamesCallbacks {
        private final zzb<CaptureCapabilitiesResult> a;

        m(zzb<CaptureCapabilitiesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureCapabilitiesResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureCapabilitiesResult, (Object) "Holder must not be null");
        }

        public void zza(int i, VideoCapabilities videoCapabilities) {
            this.a.setResult(new n(new Status(i), videoCapabilities));
        }
    }

    private static final class n implements CaptureCapabilitiesResult {
        private final Status a;
        private final VideoCapabilities b;

        n(Status status, VideoCapabilities videoCapabilities) {
            this.a = status;
            this.b = videoCapabilities;
        }

        public VideoCapabilities getCapabilities() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class o extends AbstractGamesCallbacks {
        private final BaseGamesApiMethodImpl<Status> a;

        o(BaseGamesApiMethodImpl<Status> baseGamesApiMethodImpl) {
            this.a = (BaseGamesApiMethodImpl) zzaa.zzb((Object) baseGamesApiMethodImpl, (Object) "Holder must not be null");
        }

        public void zzac(Status status) {
            this.a.zzb(status);
        }

        public void zzgG(int i) {
            this.a.zzb(new Status(i));
        }
    }

    private static final class p extends AbstractGamesCallbacks {
        private final zzou<CaptureOverlayStateListener> a;

        p(zzou<CaptureOverlayStateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_video_Videos_CaptureOverlayStateListener) {
            this.a = (zzou) zzaa.zzb((Object) com_google_android_gms_internal_zzou_com_google_android_gms_games_video_Videos_CaptureOverlayStateListener, (Object) "Callback must not be null");
        }

        public void onCaptureOverlayStateChanged(int i) {
            this.a.zza(new q(i));
        }
    }

    private static final class q implements zzou.zzb<CaptureOverlayStateListener> {
        private final int a;

        q(int i) {
            this.a = i;
        }

        public void a(CaptureOverlayStateListener captureOverlayStateListener) {
            captureOverlayStateListener.onCaptureOverlayStateChanged(this.a);
        }

        public void zzrV() {
        }

        public /* synthetic */ void zzt(Object obj) {
            a((CaptureOverlayStateListener) obj);
        }
    }

    private static final class r extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        public r(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzgM(int i) {
            this.a.setResult(new Status(i));
        }
    }

    private static final class s extends AbstractGamesCallbacks {
        private final zzb<Status> a;
        private final CaptureRuntimeErrorCallback b;

        public s(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, CaptureRuntimeErrorCallback captureRuntimeErrorCallback) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
            this.b = (CaptureRuntimeErrorCallback) zzaa.zzb((Object) captureRuntimeErrorCallback, (Object) "Callback must not be null");
        }

        public void zzaf(Status status) {
            this.a.setResult(status);
        }

        public void zzgL(int i) {
            this.b.zzhD(i);
        }
    }

    private static final class t extends AbstractGamesCallbacks {
        private final zzb<CaptureStateResult> a;

        public t(zzb<CaptureStateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStateResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStateResult, (Object) "Holder must not be null");
        }

        public void zzi(int i, Bundle bundle) {
            this.a.setResult(new u(new Status(i), CaptureState.zzy(bundle)));
        }
    }

    private static final class u implements CaptureStateResult {
        private final Status a;
        private final CaptureState b;

        u(Status status, CaptureState captureState) {
            this.a = status;
            this.b = captureState;
        }

        public CaptureState getCaptureState() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class v extends AbstractGamesCallbacks {
        private final zzb<CaptureStoppedResult> a;

        public v(zzb<CaptureStoppedResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStoppedResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStoppedResult, (Object) "Holder must not be null");
        }

        public void zza(int i, Uri uri) {
            this.a.setResult(new w(new Status(i), uri));
        }
    }

    private static final class w implements CaptureStoppedResult {
        private final Status a;
        private final Uri b;

        w(Status status, Uri uri) {
            this.a = status;
            this.b = uri;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class x extends AbstractGamesCallbacks {
        private final zzb<CaptureStreamingAvailabilityResult> a;

        x(zzb<CaptureStreamingAvailabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingAvailabilityResult) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingAvailabilityResult, (Object) "Holder must not be null");
        }

        public void zza(int i, boolean z, boolean z2) {
            this.a.setResult(new y(new Status(i), z, z2));
        }
    }

    private static final class y implements CaptureStreamingAvailabilityResult {
        private final Status a;
        private final boolean b;
        private final boolean c;

        y(Status status, boolean z, boolean z2) {
            this.a = status;
            this.b = z;
            this.c = z2;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    private static final class z extends AbstractGamesCallbacks {
        private final zzb<Status> a;

        z(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) {
            this.a = (zzb) zzaa.zzb((Object) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, (Object) "Holder must not be null");
        }

        public void zzgH(int i) {
            this.a.setResult(new Status(i));
        }
    }

    public GamesClientImpl(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, GamesOptions gamesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 1, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        this.zzaKR = com_google_android_gms_common_internal_zzg.zzty();
        this.zzaKW = new Binder();
        this.zzaKU = PopupManager.zza(this, com_google_android_gms_common_internal_zzg.zztu());
        zzr(com_google_android_gms_common_internal_zzg.zztA());
        this.zzaKX = (long) hashCode();
        this.zzaKY = gamesOptions;
    }

    private static Room zzai(DataHolder dataHolder) {
        RoomBuffer roomBuffer = new RoomBuffer(dataHolder);
        Room room = null;
        try {
            if (roomBuffer.getCount() > 0) {
                room = (Room) ((Room) roomBuffer.get(0)).freeze();
            }
            roomBuffer.release();
            return room;
        } catch (Throwable th) {
            roomBuffer.release();
        }
    }

    private void zzb(RemoteException remoteException) {
        GamesLog.zzb("GamesClientImpl", "service died", remoteException);
    }

    private void zzzO() {
        this.zzaKS = null;
        this.zzaKT = null;
    }

    public void disconnect() {
        this.zzaKV = false;
        if (isConnected()) {
            try {
                IGamesService iGamesService = (IGamesService) zztm();
                iGamesService.zzAm();
                this.zzaKQ.flush();
                iGamesService.zzI(this.zzaKX);
            } catch (RemoteException e) {
                GamesLog.zzD("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.zzaKV = false;
    }

    public Intent zzAa() {
        try {
            return ((IGamesService) zztm()).zzAa();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzAb() {
        try {
            return ((IGamesService) zztm()).zzAb();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public int zzAc() {
        try {
            return ((IGamesService) zztm()).zzAc();
        } catch (RemoteException e) {
            zzb(e);
            return 4368;
        }
    }

    public int zzAd() {
        try {
            return ((IGamesService) zztm()).zzAd();
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public Intent zzAe() {
        try {
            return ((IGamesService) zztm()).zzAe();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public int zzAf() {
        try {
            return ((IGamesService) zztm()).zzAf();
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public int zzAg() {
        try {
            return ((IGamesService) zztm()).zzAg();
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public int zzAh() {
        try {
            return ((IGamesService) zztm()).zzAh();
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public int zzAi() {
        try {
            return ((IGamesService) zztm()).zzAi();
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public Intent zzAj() {
        try {
            return ((IGamesService) zztm()).zzAx();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public boolean zzAk() {
        try {
            return ((IGamesService) zztm()).zzAk();
        } catch (RemoteException e) {
            zzb(e);
            return false;
        }
    }

    public void zzAl() {
        try {
            ((IGamesService) zztm()).zzP(this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzAm() {
        if (isConnected()) {
            try {
                ((IGamesService) zztm()).zzAm();
            } catch (RemoteException e) {
                zzb(e);
            }
        }
    }

    public int zza(zzou<ReliableMessageSentCallback> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMultiplayer_ReliableMessageSentCallback, byte[] bArr, String str, String str2) {
        try {
            return ((IGamesService) zztm()).zza(new ds(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMultiplayer_ReliableMessageSentCallback), bArr, str, str2);
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public int zza(byte[] bArr, String str, String[] strArr) {
        zzaa.zzb((Object) strArr, (Object) "Participant IDs must not be null");
        try {
            return ((IGamesService) zztm()).zzb(bArr, str, strArr);
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public Intent zza(int i, byte[] bArr, int i2, Bitmap bitmap, String str) {
        try {
            Intent zza = ((IGamesService) zztm()).zza(i, bArr, i2, str);
            zzaa.zzb((Object) bitmap, (Object) "Must provide a non null icon");
            zza.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
            return zza;
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zza(PlayerEntity playerEntity) {
        try {
            return ((IGamesService) zztm()).zza(playerEntity);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zza(Room room, int i) {
        try {
            return ((IGamesService) zztm()).zza((RoomEntity) room.freeze(), i);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zza(String str, boolean z, boolean z2, int i) {
        try {
            return ((IGamesService) zztm()).zza(str, z, z2, i);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    protected void zza(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0 && bundle != null) {
            bundle.setClassLoader(GamesClientImpl.class.getClassLoader());
            this.zzaKV = bundle.getBoolean("show_welcome_popup");
            this.zzaKS = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
            this.zzaKT = (GameEntity) bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.zza(i, iBinder, bundle, i2);
    }

    public void zza(Account account, byte[] bArr) throws RemoteException {
        ((IGamesService) zztm()).zza(account, bArr);
    }

    public void zza(IBinder iBinder, Bundle bundle) {
        if (isConnected()) {
            try {
                ((IGamesService) zztm()).zza(iBinder, bundle);
            } catch (RemoteException e) {
                zzb(e);
            }
        }
    }

    public void zza(zzf com_google_android_gms_common_internal_zzd_zzf) {
        zzzO();
        super.zza(com_google_android_gms_common_internal_zzd_zzf);
    }

    public void zza(BaseGamesApiMethodImpl<Status> baseGamesApiMethodImpl, String str, VideoConfiguration videoConfiguration) throws RemoteException {
        ((IGamesService) zztm()).zza(new o(baseGamesApiMethodImpl), str, videoConfiguration);
    }

    public void zza(IGamesService iGamesService) {
        super.zza((IInterface) iGamesService);
        if (this.zzaKV) {
            this.zzaKU.zzAB();
            this.zzaKV = false;
        }
        if (!this.zzaKY.zzaJt && !this.zzaKY.zzaJB) {
            zzb(iGamesService);
        }
    }

    public void zza(Snapshot snapshot) {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        zzaa.zza(!snapshotContents.isClosed(), (Object) "Snapshot already closed");
        Contents zzvG = snapshotContents.zzvG();
        snapshotContents.close();
        try {
            ((IGamesService) zztm()).zza(zzvG);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zza(zzb<LoadInvitationsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult, int i) throws RemoteException {
        ((IGamesService) zztm()).zza(new bk(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult), i);
    }

    public void zza(zzb<LoadRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult, int i, int i2, int i3) throws RemoteException {
        ((IGamesService) zztm()).zza(new dy(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult), i, i2, i3);
    }

    public void zza(zzb<LoadAppContentResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_appcontent_AppContents_LoadAppContentResult, int i, String str, String[] strArr, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new h(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_appcontent_AppContents_LoadAppContentResult), i, str, strArr, z);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zza(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), i, z, z2);
    }

    public void zza(zzb<LoadMatchesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult, int i, int[] iArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new ew(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult), i, iArr);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, Account account) throws RemoteException {
        ((IGamesService) zztm()).zza(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), account);
    }

    public void zza(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2) throws RemoteException {
        ((IGamesService) zztm()).zza(new bp(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult), leaderboardScoreBuffer.zzBn().asBundle(), i, i2);
    }

    public void zza(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, TurnBasedMatchConfig turnBasedMatchConfig) throws RemoteException {
        ((IGamesService) zztm()).zza(new er(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult), turnBasedMatchConfig.getVariant(), turnBasedMatchConfig.zzBt(), turnBasedMatchConfig.getInvitedPlayerIds(), turnBasedMatchConfig.getAutoMatchCriteria());
    }

    public void zza(zzb<CommitSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_CommitSnapshotResult, Snapshot snapshot, SnapshotMetadataChange snapshotMetadataChange) throws RemoteException {
        SnapshotContents snapshotContents = snapshot.getSnapshotContents();
        zzaa.zza(!snapshotContents.isClosed(), (Object) "Snapshot already closed");
        BitmapTeleporter zzBy = snapshotMetadataChange.zzBy();
        if (zzBy != null) {
            zzBy.zzd(getContext().getCacheDir());
        }
        Contents zzvG = snapshotContents.zzvG();
        snapshotContents.close();
        ((IGamesService) zztm()).zza(new ej(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_CommitSnapshotResult), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzvG);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, VideoConfiguration videoConfiguration, CaptureRuntimeErrorCallback captureRuntimeErrorCallback) throws RemoteException {
        ((IGamesService) zztm()).zza(new s(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, captureRuntimeErrorCallback), videoConfiguration);
    }

    public void zza(zzb<UpdateAchievementResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult, String str) throws RemoteException {
        IGamesCallbacks iGamesCallbacks;
        if (com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult == null) {
            iGamesCallbacks = null;
        } else {
            Object fVar = new f(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult);
        }
        ((IGamesService) zztm()).zza(iGamesCallbacks, str, this.zzaKU.zzAD(), this.zzaKU.zzAC());
    }

    public void zza(zzb<UpdateAchievementResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zza(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult == null ? null : new f(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult), str, i, this.zzaKU.zzAD(), this.zzaKU.zzAC());
    }

    public void zza(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new bp(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult), str, i, i2, i3, z);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, int i, boolean z, boolean z2) throws RemoteException {
        Object obj = -1;
        switch (str.hashCode()) {
            case 156408498:
                if (str.equals("played_with")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
                ((IGamesService) zztm()).zzd(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, i, z, z2);
                return;
            default:
                String str2 = "Invalid player collection: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    public void zza(zzb<LoadMatchesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult, String str, int i, int[] iArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new ew(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchesResult), str, i, iArr);
    }

    public void zza(zzb<SubmitScoreResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_SubmitScoreResult, String str, long j, String str2) throws RemoteException {
        ((IGamesService) zztm()).zza(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_SubmitScoreResult == null ? null : new eo(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_SubmitScoreResult), str, j, str2);
    }

    public void zza(zzb<LeaveMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult, String str, String str2) throws RemoteException {
        ((IGamesService) zztm()).zzc(new es(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult), str, str2);
    }

    public void zza(zzb<LoadPlayerScoreResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadPlayerScoreResult, String str, String str2, int i, int i2) throws RemoteException {
        ((IGamesService) zztm()).zza(new dd(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadPlayerScoreResult), str, str2, i, i2);
    }

    public void zza(zzb<LoadRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult, String str, String str2, int i, int i2, int i3) throws RemoteException {
        ((IGamesService) zztm()).zza(new dy(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestsResult), str, str2, i, i2, i3);
    }

    public void zza(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new bp(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult), str, str2, i, i2, i3, z);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, String str2, int i, boolean z, boolean z2) throws RemoteException {
        Object obj = -1;
        switch (str.hashCode()) {
            case -1049482625:
                if (str.equals("nearby")) {
                    obj = 2;
                    break;
                }
                break;
            case 156408498:
                if (str.equals("played_with")) {
                    obj = 1;
                    break;
                }
                break;
            case 782949780:
                if (str.equals("circled")) {
                    obj = null;
                    break;
                }
                break;
        }
        switch (obj) {
            case null:
            case 1:
            case 2:
                ((IGamesService) zztm()).zza(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, str2, i, z, z2);
                return;
            default:
                String str3 = "Invalid player collection: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    public void zza(zzb<OpenSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) throws RemoteException {
        zzaa.zza(!snapshotContents.isClosed(), (Object) "SnapshotContents already closed");
        BitmapTeleporter zzBy = snapshotMetadataChange.zzBy();
        if (zzBy != null) {
            zzBy.zzd(getContext().getCacheDir());
        }
        Contents zzvG = snapshotContents.zzvG();
        snapshotContents.close();
        ((IGamesService) zztm()).zza(new el(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult), str, str2, (SnapshotMetadataChangeEntity) snapshotMetadataChange, zzvG);
    }

    public void zza(zzb<LeaderboardMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult, String str, String str2, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult), str, str2, z);
    }

    public void zza(zzb<LoadQuestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult, String str, String str2, boolean z, String[] strArr) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new dq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult), str, str2, strArr, z);
    }

    public void zza(zzb<LoadQuestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult, String str, String str2, int[] iArr, int i, boolean z) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new dq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult), str, str2, iArr, i, z);
    }

    public void zza(zzb<UpdateRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult, String str, String str2, String[] strArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new dz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult), str, str2, strArr);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzf(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, z);
    }

    public void zza(zzb<OpenSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult, String str, boolean z, int i) throws RemoteException {
        ((IGamesService) zztm()).zza(new el(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_OpenSnapshotResult), str, z, i);
    }

    public void zza(zzb<UpdateGamerProfileResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_UpdateGamerProfileResult, String str, boolean z, String str2, boolean z2, boolean z3) throws RemoteException {
        ((IGamesService) zztm()).zza(new av(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_UpdateGamerProfileResult), str, z, str2, z2, z3);
    }

    public void zza(zzb<UpdateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult, String str, byte[] bArr, String str2, ParticipantResult[] participantResultArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new ev(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult), str, bArr, str2, participantResultArr);
    }

    public void zza(zzb<UpdateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult, String str, byte[] bArr, ParticipantResult[] participantResultArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new ev(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_UpdateMatchResult), str, bArr, participantResultArr);
    }

    public void zza(zzb<SendRequestResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_SendRequestResult, String str, String[] strArr, int i, byte[] bArr, int i2) throws RemoteException {
        ((IGamesService) zztm()).zza(new dw(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_SendRequestResult), str, strArr, i, bArr, i2);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzc(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), z);
    }

    public void zza(zzb<LoadProfileSettingsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadProfileSettingsResult, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zza(new dk(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadProfileSettingsResult), z, z2);
    }

    public void zza(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z, boolean z2, Bundle bundle) throws RemoteException {
        ((IGamesService) zztm()).zza(new aj(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z, z2, bundle);
    }

    public void zza(zzb<LoadEventsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult, boolean z, String... strArr) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new an(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult), z, strArr);
    }

    public void zza(zzb<LoadQuestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult, int[] iArr, int i, boolean z) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new dq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult), iArr, i, z);
    }

    public void zza(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String[] strArr) throws RemoteException {
        ((IGamesService) zztm()).zzc(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), strArr);
    }

    public void zza(zzou<OnInvitationReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_OnInvitationReceivedListener) {
        try {
            ((IGamesService) zztm()).zza(new bh(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_OnInvitationReceivedListener), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zza(zzou<RoomUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, zzou<RoomStatusUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener, zzou<RealTimeMessageReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener, RoomConfig roomConfig) {
        try {
            ((IGamesService) zztm()).zza(new eb(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener, com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener), this.zzaKW, roomConfig.getVariant(), roomConfig.getInvitedPlayerIds(), roomConfig.getAutoMatchCriteria(), false, this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zza(zzou<RoomUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, String str) {
        try {
            ((IGamesService) zztm()).zzc(new eb(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener), str);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return zzcd(iBinder);
    }

    public String zzao(boolean z) {
        if (z && this.zzaKS != null) {
            return this.zzaKS.getPlayerId();
        }
        try {
            return ((IGamesService) zztm()).zzAo();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzb(int i, int i2, boolean z) {
        try {
            return ((IGamesService) zztm()).zzb(i, i2, z);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzb(int[] iArr) {
        try {
            return ((IGamesService) zztm()).zzb(iArr);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    protected Set<Scope> zzb(Set<Scope> set) {
        Scope scope = new Scope(Scopes.GAMES);
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        int i = 0;
        boolean z = false;
        for (Scope scope3 : set) {
            int i2;
            boolean z2;
            if (scope3.equals(scope)) {
                i2 = i;
                z2 = true;
            } else if (scope3.equals(scope2)) {
                i2 = 1;
                z2 = z;
            } else {
                i2 = i;
                z2 = z;
            }
            z = z2;
            i = i2;
        }
        if (i != 0) {
            zzaa.zza(!z, "Cannot have both %s and %s!", Scopes.GAMES, "https://www.googleapis.com/auth/games.firstparty");
        } else {
            zzaa.zza(z, "Games APIs requires %s to function.", Scopes.GAMES);
        }
        return set;
    }

    public void zzb(IGamesService iGamesService) {
        try {
            iGamesService.zza(new dj(this.zzaKU), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzb(zzb<CaptureAvailableResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureAvailableResult, int i) throws RemoteException {
        ((IGamesService) zztm()).zzc(new k(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureAvailableResult), i);
    }

    public void zzb(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zzb(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), i, z, z2);
    }

    public void zzb(zzb<UpdateAchievementResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult, String str) throws RemoteException {
        IGamesCallbacks iGamesCallbacks;
        if (com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult == null) {
            iGamesCallbacks = null;
        } else {
            Object fVar = new f(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult);
        }
        ((IGamesService) zztm()).zzb(iGamesCallbacks, str, this.zzaKU.zzAD(), this.zzaKU.zzAC());
    }

    public void zzb(zzb<UpdateAchievementResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zzb(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult == null ? null : new f(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_UpdateAchievementResult), str, i, this.zzaKU.zzAD(), this.zzaKU.zzAC());
    }

    public void zzb(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bp(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult), str, i, i2, i3, z);
    }

    public void zzb(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zzb(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, i, z, z2);
    }

    public void zzb(zzb<ClaimMilestoneResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_ClaimMilestoneResult, String str, String str2) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zzf(new do(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_ClaimMilestoneResult, str2), str, str2);
    }

    public void zzb(zzb<LoadScoresResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult, String str, String str2, int i, int i2, int i3, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bp(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LoadScoresResult), str, str2, i, i2, i3, z);
    }

    public void zzb(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, String str2, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zzb(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, str2, i, z, z2);
    }

    public void zzb(zzb<LoadAchievementsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult, String str, String str2, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new g(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult), str, str2, z);
    }

    public void zzb(zzb<LeaderboardMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzc(new bq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult), str, z);
    }

    public void zzb(zzb<LeaderboardMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult), z);
    }

    public void zzb(zzb<LoadQuestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult, boolean z, String[] strArr) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new dq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_LoadQuestsResult), strArr, z);
    }

    public void zzb(zzb<UpdateRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult, String[] strArr) throws RemoteException {
        ((IGamesService) zztm()).zza(new dz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult), strArr);
    }

    public void zzb(zzou<OnTurnBasedMatchUpdateReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_turnbased_OnTurnBasedMatchUpdateReceivedListener) {
        try {
            ((IGamesService) zztm()).zzb(new cr(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_turnbased_OnTurnBasedMatchUpdateReceivedListener), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzb(zzou<RoomUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, zzou<RoomStatusUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener, zzou<RealTimeMessageReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener, RoomConfig roomConfig) {
        try {
            ((IGamesService) zztm()).zza(new eb(com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomUpdateListener, com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RoomStatusUpdateListener, com_google_android_gms_internal_zzou_com_google_android_gms_games_multiplayer_realtime_RealTimeMessageReceivedListener), this.zzaKW, roomConfig.getInvitationId(), false, this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzb(String str, zzb<GetServerAuthCodeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetServerAuthCodeResult) throws RemoteException {
        zzaa.zzh(str, "Please provide a valid serverClientId");
        ((IGamesService) zztm()).zza(str, new az(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetServerAuthCodeResult));
    }

    public Intent zzc(int i, int i2, boolean z) {
        try {
            return ((IGamesService) zztm()).zzc(i, i2, z);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzc(zzb<LoadInvitesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_LoadInvitesResult, int i) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bm(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_LoadInvitesResult), i);
    }

    public void zzc(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zzc(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), i, z, z2);
    }

    public void zzc(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzk(new er(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult), str);
    }

    public void zzc(zzb<ListVideosResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zzd(new bt(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult), str, i);
    }

    public void zzc(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, String str, String str2) throws RemoteException {
        ((IGamesService) zztm()).zzd(new er(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult), str, str2);
    }

    public void zzc(zzb<LoadSnapshotsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult, String str, String str2, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzc(new em(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult), str, str2, z);
    }

    public void zzc(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzh(new fa(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), str, z);
    }

    public void zzc(zzb<LoadAchievementsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new g(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_achievement_Achievements_LoadAchievementsResult), z);
    }

    public void zzc(zzb<UpdateRequestsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult, String[] strArr) throws RemoteException {
        ((IGamesService) zztm()).zzb(new dz(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_UpdateRequestsResult), strArr);
    }

    public void zzc(zzou<QuestUpdateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_quest_QuestUpdateListener) {
        try {
            ((IGamesService) zztm()).zzd(new dp(com_google_android_gms_internal_zzou_com_google_android_gms_games_quest_QuestUpdateListener), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    protected IGamesService zzcd(IBinder iBinder) {
        return Stub.zzcg(iBinder);
    }

    public void zzd(Account account) throws RemoteException {
        ((IGamesService) zztm()).zzd(account);
    }

    public void zzd(zzb<GetTokenResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetTokenResult) throws RemoteException {
        ((IGamesService) zztm()).zzj(new ay(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Games_GetTokenResult));
    }

    public void zzd(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zze(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), i, z, z2);
    }

    public void zzd(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzl(new er(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult), str);
    }

    public void zzd(zzb<LoadXpStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zzb(new dh(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult), str, i);
    }

    public void zzd(zzb<InitiateMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult, String str, String str2) throws RemoteException {
        ((IGamesService) zztm()).zze(new er(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_InitiateMatchResult), str, str2);
    }

    public void zzd(zzb<LeaderboardMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzd(new bq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_leaderboard_Leaderboards_LeaderboardMetadataResult), str, z);
    }

    public void zzd(zzb<LoadEventsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult, boolean z) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zzf(new an(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_event_Events_LoadEventsResult), z);
    }

    public void zzd(zzou<OnRequestReceivedListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_request_OnRequestReceivedListener) {
        try {
            ((IGamesService) zztm()).zzc(new dt(com_google_android_gms_internal_zzou_com_google_android_gms_games_request_OnRequestReceivedListener), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public int zze(byte[] bArr, String str) {
        try {
            return ((IGamesService) zztm()).zzb(bArr, str, null);
        } catch (RemoteException e) {
            zzb(e);
            return -1;
        }
    }

    public void zze(zzb<LoadGamesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGamesResult) throws RemoteException {
        ((IGamesService) zztm()).zzd(new ax(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGamesResult));
    }

    public void zze(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, int i, boolean z, boolean z2) throws RemoteException {
        ((IGamesService) zztm()).zzf(new di(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), i, z, z2);
    }

    public void zze(zzb<LeaveMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzn(new es(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LeaveMatchResult), str);
    }

    public void zze(zzb<LoadXpStreamResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zzc(new dh(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpStreamResult), str, i);
    }

    public void zze(zzb<GameMuteStatusChangeResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusChangeResult, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zza(new ar(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusChangeResult), str, z);
    }

    public void zze(zzb<LoadPlayerStatsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_stats_Stats_LoadPlayerStatsResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzi(new de(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_stats_Stats_LoadPlayerStatsResult), z);
    }

    public void zze(zzou<CaptureOverlayStateListener> com_google_android_gms_internal_zzou_com_google_android_gms_games_video_Videos_CaptureOverlayStateListener) {
        try {
            ((IGamesService) zztm()).zzf(new p(com_google_android_gms_internal_zzou_com_google_android_gms_games_video_Videos_CaptureOverlayStateListener), this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzei(String str) {
        try {
            ((IGamesService) zztm()).zzeq(str);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public Intent zzej(String str) {
        try {
            return ((IGamesService) zztm()).zzej(str);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzek(String str) {
        try {
            ((IGamesService) zztm()).zza(str, this.zzaKU.zzAD(), this.zzaKU.zzAC());
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzf(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zza(new ei(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status));
    }

    public void zzf(zzb<CancelMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_CancelMatchResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzm(new eq(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_CancelMatchResult), str);
    }

    public void zzf(zzb<LoadInvitationsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zzb(new bk(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult), str, i, false);
    }

    public void zzf(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzg(new eh(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str, z);
    }

    public void zzf(zzb<LoadSnapshotsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzd(new em(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_LoadSnapshotsResult), z);
    }

    public void zzg(zzb<CaptureCapabilitiesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureCapabilitiesResult) throws RemoteException {
        ((IGamesService) zztm()).zzl(new m(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureCapabilitiesResult));
    }

    public void zzg(zzb<LoadMatchResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzo(new et(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_turnbased_TurnBasedMultiplayer_LoadMatchResult), str);
    }

    public void zzg(zzb<LoadRequestSummariesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestSummariesResult, String str, int i) throws RemoteException {
        ((IGamesService) zztm()).zza(new dx(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_request_Requests_LoadRequestSummariesResult), str, i);
    }

    public void zzg(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzm(new r(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z);
    }

    public void zzgO(int i) {
        this.zzaKU.setGravity(i);
    }

    public void zzgP(int i) {
        try {
            ((IGamesService) zztm()).zzgP(i);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzh(zzb<CaptureStateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStateResult) throws RemoteException {
        ((IGamesService) zztm()).zzv(new t(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStateResult));
    }

    public void zzh(zzb<AcceptQuestResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_AcceptQuestResult, String str) throws RemoteException {
        this.zzaKQ.flush();
        ((IGamesService) zztm()).zzt(new dm(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_quest_Quests_AcceptQuestResult), str);
    }

    public void zzh(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzh(new dl(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z);
    }

    protected String zzhT() {
        return "com.google.android.gms.games.service.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    public void zzi(zzb<CaptureStreamingAvailabilityResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingAvailabilityResult) throws RemoteException {
        ((IGamesService) zztm()).zzs(new x(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingAvailabilityResult));
    }

    public void zzi(zzb<DeleteSnapshotResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_DeleteSnapshotResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzq(new ek(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_snapshot_Snapshots_DeleteSnapshotResult), str);
    }

    public void zzi(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzj(new ak(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z);
    }

    public String zziC() {
        try {
            return ((IGamesService) zztm()).zziC();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzj(zzb<CaptureStreamingMetadataResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingMetadataResult) throws RemoteException {
        ((IGamesService) zztm()).zzq(new aa(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingMetadataResult));
    }

    public void zzj(zzb<LoadGameInstancesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameInstancesResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzf(new ap(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameInstancesResult), str);
    }

    public void zzj(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzk(new ey(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z);
    }

    public void zzk(zzb<CaptureStreamingUrlResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingUrlResult) throws RemoteException {
        ((IGamesService) zztm()).zzr(new ac(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStreamingUrlResult));
    }

    public void zzk(zzb<LoadGameSearchSuggestionsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameSearchSuggestionsResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzp(new au(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_GamesMetadata_LoadGameSearchSuggestionsResult), str);
    }

    public void zzk(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zzl(new fc(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), z);
    }

    public Intent zzl(String str, int i, int i2) {
        try {
            return ((IGamesService) zztm()).zzm(str, i, i2);
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzl(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        ((IGamesService) zztm()).zzt(new bc(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status));
    }

    public void zzl(zzb<LoadXpForGameCategoriesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpForGameCategoriesResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzr(new dg(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadXpForGameCategoriesResult), str);
    }

    public void zzl(zzb<ContactSettingLoadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_ContactSettingLoadResult, boolean z) throws RemoteException {
        ((IGamesService) zztm()).zze(new ai(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_ContactSettingLoadResult), z);
    }

    public void zzm(zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        ((IGamesService) zztm()).zzo(new z(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status));
    }

    public void zzm(zzb<LoadInvitationsResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzj(new bk(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_multiplayer_Invitations_LoadInvitationsResult), str);
    }

    public void zzn(zzb<ListVideosResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult) throws RemoteException {
        ((IGamesService) zztm()).zzk(new bt(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_ListVideosResult));
    }

    public void zzn(zzb<GameMuteStatusLoadResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusLoadResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzi(new at(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_GameMuteStatusLoadResult), str);
    }

    public void zzn(String str, int i) {
        this.zzaKQ.zzn(str, i);
    }

    public void zzo(zzb<CaptureStoppedResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStoppedResult) throws RemoteException {
        ((IGamesService) zztm()).zzu(new v(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_video_Videos_CaptureStoppedResult));
    }

    public void zzo(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzu(new ef(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult), str);
    }

    public void zzo(String str, int i) {
        try {
            ((IGamesService) zztm()).zzo(str, i);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    protected Bundle zzoO() {
        String locale = getContext().getResources().getConfiguration().locale.toString();
        Bundle zzyP = this.zzaKY.zzyP();
        zzyP.putString("com.google.android.gms.games.key.gamePackageName", this.zzaKR);
        zzyP.putString("com.google.android.gms.games.key.desiredLocale", locale);
        zzyP.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.zzaKU.zzAD()));
        zzyP.putInt("com.google.android.gms.games.key.API_VERSION", 4);
        zzyP.putBundle("com.google.android.gms.games.key.signInOptions", com.google.android.gms.signin.internal.zzg.zza(zztH()));
        return zzyP;
    }

    public void zzp(zzb<LoadStockProfileImagesResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadStockProfileImagesResult) throws RemoteException {
        ((IGamesService) zztm()).zzp(new en(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadStockProfileImagesResult));
    }

    public void zzp(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzv(new d(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult), str);
    }

    public void zzp(String str, int i) {
        try {
            ((IGamesService) zztm()).zzp(str, i);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public boolean zzpd() {
        return true;
    }

    public void zzq(zzb<InboxCountResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_InboxCountResult) throws RemoteException {
        ((IGamesService) zztm()).zzs(new bf(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Notifications_InboxCountResult), null);
    }

    public void zzq(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzw(new bd(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult), str);
    }

    public Bundle zzqr() {
        try {
            Bundle zzqr = ((IGamesService) zztm()).zzqr();
            if (zzqr == null) {
                return zzqr;
            }
            zzqr.setClassLoader(GamesClientImpl.class.getClassLoader());
            return zzqr;
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzr(View view) {
        this.zzaKU.zzs(view);
    }

    public void zzr(zzb<InviteUpdateResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzx(new i(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_social_Social_InviteUpdateResult), str);
    }

    public void zzs(zzb<LoadPlayersResult> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult, String str) throws RemoteException {
        ((IGamesService) zztm()).zzy(new df(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_games_Players_LoadPlayersResult), str);
    }

    public String zzzP() {
        try {
            return ((IGamesService) zztm()).zzzP();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Player zzzQ() {
        PlayerBuffer playerBuffer;
        zztl();
        synchronized (this) {
            if (this.zzaKS == null) {
                try {
                    playerBuffer = new PlayerBuffer(((IGamesService) zztm()).zzAp());
                    if (playerBuffer.getCount() > 0) {
                        this.zzaKS = (PlayerEntity) ((Player) playerBuffer.get(0)).freeze();
                    }
                    playerBuffer.release();
                } catch (RemoteException e) {
                    zzb(e);
                } catch (Throwable th) {
                    playerBuffer.release();
                }
            }
        }
        return this.zzaKS;
    }

    public Game zzzR() {
        zztl();
        synchronized (this) {
            if (this.zzaKT == null) {
                GameBuffer gameBuffer;
                try {
                    gameBuffer = new GameBuffer(((IGamesService) zztm()).zzAr());
                    if (gameBuffer.getCount() > 0) {
                        this.zzaKT = (GameEntity) ((Game) gameBuffer.get(0)).freeze();
                    }
                    gameBuffer.release();
                } catch (RemoteException e) {
                    zzb(e);
                } catch (Throwable th) {
                    gameBuffer.release();
                }
            }
        }
        return this.zzaKT;
    }

    public Intent zzzS() {
        try {
            return ((IGamesService) zztm()).zzzS();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzzT() {
        try {
            return ((IGamesService) zztm()).zzzT();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzzU() {
        try {
            return ((IGamesService) zztm()).zzzU();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public Intent zzzV() {
        try {
            return ((IGamesService) zztm()).zzzV();
        } catch (RemoteException e) {
            zzb(e);
            return null;
        }
    }

    public void zzzW() {
        try {
            ((IGamesService) zztm()).zzJ(this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzzX() {
        try {
            ((IGamesService) zztm()).zzK(this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzzY() {
        try {
            ((IGamesService) zztm()).zzM(this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }

    public void zzzZ() {
        try {
            ((IGamesService) zztm()).zzL(this.zzaKX);
        } catch (RemoteException e) {
            zzb(e);
        }
    }
}
