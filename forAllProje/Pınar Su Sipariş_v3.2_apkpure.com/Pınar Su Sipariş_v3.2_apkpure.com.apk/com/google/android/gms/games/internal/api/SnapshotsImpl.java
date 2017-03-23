package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
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
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;
import com.google.android.gms.internal.zznt.zzb;

public final class SnapshotsImpl implements Snapshots {

    private static abstract class c extends BaseGamesApiMethodImpl<LoadSnapshotsResult> {
        private c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public LoadSnapshotsResult a(final Status status) {
            return new LoadSnapshotsResult(this) {
                final /* synthetic */ c b;

                public SnapshotMetadataBuffer getSnapshots() {
                    return new SnapshotMetadataBuffer(DataHolder.zzbQ(14));
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

    private static abstract class d extends BaseGamesApiMethodImpl<OpenSnapshotResult> {
        private d(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public OpenSnapshotResult a(final Status status) {
            return new OpenSnapshotResult(this) {
                final /* synthetic */ d b;

                public String getConflictId() {
                    return null;
                }

                public Snapshot getConflictingSnapshot() {
                    return null;
                }

                public SnapshotContents getResolutionSnapshotContents() {
                    return null;
                }

                public Snapshot getSnapshot() {
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

    private static abstract class a extends BaseGamesApiMethodImpl<CommitSnapshotResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public CommitSnapshotResult a(final Status status) {
            return new CommitSnapshotResult(this) {
                final /* synthetic */ a b;

                public SnapshotMetadata getSnapshotMetadata() {
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

    private static abstract class b extends BaseGamesApiMethodImpl<DeleteSnapshotResult> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public DeleteSnapshotResult a(final Status status) {
            return new DeleteSnapshotResult(this) {
                final /* synthetic */ b b;

                public String getSnapshotId() {
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

    public PendingResult<CommitSnapshotResult> commitAndClose(GoogleApiClient googleApiClient, final Snapshot snapshot, final SnapshotMetadataChange snapshotMetadataChange) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ SnapshotsImpl c;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zzb) this, snapshot, snapshotMetadataChange);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<DeleteSnapshotResult> delete(GoogleApiClient googleApiClient, final SnapshotMetadata snapshotMetadata) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ SnapshotsImpl b;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzi((zzb) this, snapshotMetadata.getSnapshotId());
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void discardAndClose(GoogleApiClient googleApiClient, Snapshot snapshot) {
        Games.zzh(googleApiClient).zza(snapshot);
    }

    public int getMaxCoverImageSize(GoogleApiClient googleApiClient) {
        return Games.zzh(googleApiClient).zzAi();
    }

    public int getMaxDataSize(GoogleApiClient googleApiClient) {
        return Games.zzh(googleApiClient).zzAh();
    }

    public Intent getSelectSnapshotIntent(GoogleApiClient googleApiClient, String str, boolean z, boolean z2, int i) {
        return Games.zzh(googleApiClient).zza(str, z, z2, i);
    }

    public SnapshotMetadata getSnapshotFromBundle(Bundle bundle) {
        return (bundle == null || !bundle.containsKey(Snapshots.EXTRA_SNAPSHOT_METADATA)) ? null : (SnapshotMetadata) bundle.getParcelable(Snapshots.EXTRA_SNAPSHOT_METADATA);
    }

    public PendingResult<LoadSnapshotsResult> load(GoogleApiClient googleApiClient, final boolean z) {
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ SnapshotsImpl b;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzf((zzb) this, z);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient googleApiClient, SnapshotMetadata snapshotMetadata) {
        return open(googleApiClient, snapshotMetadata.getUniqueName(), false);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient googleApiClient, SnapshotMetadata snapshotMetadata, int i) {
        return open(googleApiClient, snapshotMetadata.getUniqueName(), false, i);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient googleApiClient, String str, boolean z) {
        return open(googleApiClient, str, z, -1);
    }

    public PendingResult<OpenSnapshotResult> open(GoogleApiClient googleApiClient, String str, boolean z, int i) {
        final String str2 = str;
        final boolean z2 = z;
        final int i2 = i;
        return googleApiClient.zzd(new d(this, googleApiClient) {
            final /* synthetic */ SnapshotsImpl d;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zzb) this, str2, z2, i2);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient googleApiClient, String str, Snapshot snapshot) {
        SnapshotMetadata metadata = snapshot.getMetadata();
        SnapshotMetadataChange build = new Builder().fromMetadata(metadata).build();
        return resolveConflict(googleApiClient, str, metadata.getSnapshotId(), build, snapshot.getSnapshotContents());
    }

    public PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient googleApiClient, String str, String str2, SnapshotMetadataChange snapshotMetadataChange, SnapshotContents snapshotContents) {
        final String str3 = str;
        final String str4 = str2;
        final SnapshotMetadataChange snapshotMetadataChange2 = snapshotMetadataChange;
        final SnapshotContents snapshotContents2 = snapshotContents;
        return googleApiClient.zzd(new d(this, googleApiClient) {
            final /* synthetic */ SnapshotsImpl e;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zza((zzb) this, str3, str4, snapshotMetadataChange2, snapshotContents2);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
