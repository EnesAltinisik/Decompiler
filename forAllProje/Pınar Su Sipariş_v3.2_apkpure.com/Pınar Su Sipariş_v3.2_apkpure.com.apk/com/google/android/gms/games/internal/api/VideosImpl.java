package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.zzb;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.video.CaptureState;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.games.video.Videos;
import com.google.android.gms.games.video.Videos.CaptureAvailableResult;
import com.google.android.gms.games.video.Videos.CaptureCapabilitiesResult;
import com.google.android.gms.games.video.Videos.CaptureOverlayStateListener;
import com.google.android.gms.games.video.Videos.CaptureStateResult;
import com.google.android.gms.internal.zznt;

public final class VideosImpl implements Videos {

    private static abstract class b extends BaseGamesApiMethodImpl<CaptureCapabilitiesResult> {
        private b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public CaptureCapabilitiesResult a(final Status status) {
            return new CaptureCapabilitiesResult(this) {
                final /* synthetic */ b b;

                public VideoCapabilities getCapabilities() {
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

    private static abstract class c extends BaseGamesApiMethodImpl<CaptureStateResult> {
        private c(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public CaptureStateResult a(final Status status) {
            return new CaptureStateResult(this) {
                final /* synthetic */ c b;

                public CaptureState getCaptureState() {
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

    private static abstract class a extends BaseGamesApiMethodImpl<CaptureAvailableResult> {
        private a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public CaptureAvailableResult a(final Status status) {
            return new CaptureAvailableResult(this) {
                final /* synthetic */ a b;

                public Status getStatus() {
                    return status;
                }

                public boolean isAvailable() {
                    return false;
                }
            };
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public PendingResult<CaptureCapabilitiesResult> getCaptureCapabilities(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new b(this, googleApiClient) {
            final /* synthetic */ VideosImpl a;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzg(this);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public Intent getCaptureOverlayIntent(GoogleApiClient googleApiClient) {
        return Games.zzh(googleApiClient).zzAj();
    }

    public PendingResult<CaptureStateResult> getCaptureState(GoogleApiClient googleApiClient) {
        return googleApiClient.zzc(new c(this, googleApiClient) {
            final /* synthetic */ VideosImpl a;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzh(this);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<CaptureAvailableResult> isCaptureAvailable(GoogleApiClient googleApiClient, final int i) {
        return googleApiClient.zzc(new a(this, googleApiClient) {
            final /* synthetic */ VideosImpl b;

            protected void a(GamesClientImpl gamesClientImpl) throws RemoteException {
                gamesClientImpl.zzb((zznt.zzb) this, i);
            }

            protected /* synthetic */ void zza(zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((GamesClientImpl) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public boolean isCaptureSupported(GoogleApiClient googleApiClient) {
        return Games.zzh(googleApiClient).zzAk();
    }

    public void registerCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient, CaptureOverlayStateListener captureOverlayStateListener) {
        GamesClientImpl zzb = Games.zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zze(googleApiClient.zzs(captureOverlayStateListener));
        }
    }

    public void unregisterCaptureOverlayStateChangedListener(GoogleApiClient googleApiClient) {
        GamesClientImpl zzb = Games.zzb(googleApiClient, false);
        if (zzb != null) {
            zzb.zzAl();
        }
    }
}
