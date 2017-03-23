package com.google.android.gms.cast;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.LaunchOptions.Builder;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzh;
import com.google.android.gms.cast.internal.zzk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt;
import java.io.IOException;

public final class Cast {
    public static final int ACTIVE_INPUT_STATE_NO = 0;
    public static final int ACTIVE_INPUT_STATE_UNKNOWN = -1;
    public static final int ACTIVE_INPUT_STATE_YES = 1;
    public static final Api<CastOptions> API = new Api("Cast.API", zzaaA, zzk.zzaiF);
    public static final CastApi CastApi = new zza();
    public static final String EXTRA_APP_NO_LONGER_RUNNING = "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING";
    public static final int MAX_MESSAGE_LENGTH = 65536;
    public static final int MAX_NAMESPACE_LENGTH = 128;
    public static final int STANDBY_STATE_NO = 0;
    public static final int STANDBY_STATE_UNKNOWN = -1;
    public static final int STANDBY_STATE_YES = 1;
    static final zza<zze, CastOptions> zzaaA = new zza<zze, CastOptions>() {
        public zze a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, CastOptions castOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            zzaa.zzb((Object) castOptions, (Object) "Setting the API options is required.");
            return new zze(context, looper, com_google_android_gms_common_internal_zzg, castOptions.zzaep, (long) castOptions.zzaer, castOptions.zzaeq, connectionCallbacks, onConnectionFailedListener);
        }

        public /* synthetic */ Api.zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (CastOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };

    public interface ApplicationConnectionResult extends Result {
        ApplicationMetadata getApplicationMetadata();

        String getApplicationStatus();

        String getSessionId();

        boolean getWasLaunched();
    }

    static abstract class a extends zzb<ApplicationConnectionResult> {
        public a(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public ApplicationConnectionResult a(final Status status) {
            return new ApplicationConnectionResult(this) {
                final /* synthetic */ a b;

                public ApplicationMetadata getApplicationMetadata() {
                    return null;
                }

                public String getApplicationStatus() {
                    return null;
                }

                public String getSessionId() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }

                public boolean getWasLaunched() {
                    return false;
                }
            };
        }

        public void a(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
        }

        public /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zze) com_google_android_gms_common_api_Api_zzb);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public interface CastApi {

        public static final class zza implements CastApi {
            public int getActiveInputState(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).zzqv();
            }

            public ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).getApplicationMetadata();
            }

            public String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).getApplicationStatus();
            }

            public int getStandbyState(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).zzqw();
            }

            public double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).zzqu();
            }

            public boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException {
                return ((zze) googleApiClient.zza(zzk.zzaiF)).isMute();
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient) {
                return zza(googleApiClient, null, null, null);
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str) {
                return zza(googleApiClient, str, null, null);
            }

            public PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str, String str2) {
                return zza(googleApiClient, str, str2, null);
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, final String str) {
                return googleApiClient.zzd(new a(this, googleApiClient) {
                    final /* synthetic */ zza b;

                    public void a(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zza(str, false, (zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }

                    public /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                        a((zze) com_google_android_gms_common_api_Api_zzb);
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, final String str, final LaunchOptions launchOptions) {
                return googleApiClient.zzd(new a(this, googleApiClient) {
                    final /* synthetic */ zza c;

                    public void a(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zza(str, launchOptions, (zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }

                    public /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                        a((zze) com_google_android_gms_common_api_Api_zzb);
                    }
                });
            }

            @Deprecated
            public PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z) {
                return launchApplication(googleApiClient, str, new Builder().setRelaunchIfRunning(z).build());
            }

            public PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient) {
                return googleApiClient.zzd(new zzh(this, googleApiClient) {
                    final /* synthetic */ zza a;

                    public void zza(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zzb((zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }
                });
            }

            public void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException {
                try {
                    ((zze) googleApiClient.zza(zzk.zzaiF)).zzcD(str);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException {
                try {
                    ((zze) googleApiClient.zza(zzk.zzaiF)).zzqt();
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, final String str, final String str2) {
                return googleApiClient.zzd(new zzh(this, googleApiClient) {
                    final /* synthetic */ zza c;

                    public void zza(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zza(str, str2, (zznt.zzb) this);
                            return;
                        } catch (IllegalArgumentException e) {
                        } catch (IllegalStateException e2) {
                        }
                        zzbq(2001);
                    }
                });
            }

            public void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException {
                try {
                    ((zze) googleApiClient.zza(zzk.zzaiF)).zza(str, messageReceivedCallback);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException {
                try {
                    ((zze) googleApiClient.zza(zzk.zzaiF)).zzaf(z);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException {
                try {
                    ((zze) googleApiClient.zza(zzk.zzaiF)).zzf(d);
                } catch (RemoteException e) {
                    throw new IOException("service error");
                }
            }

            public PendingResult<Status> stopApplication(GoogleApiClient googleApiClient) {
                return googleApiClient.zzd(new zzh(this, googleApiClient) {
                    final /* synthetic */ zza a;

                    public void zza(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zza("", (zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }
                });
            }

            public PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, final String str) {
                return googleApiClient.zzd(new zzh(this, googleApiClient) {
                    final /* synthetic */ zza b;

                    public void zza(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        if (TextUtils.isEmpty(str)) {
                            zze(2001, "IllegalArgument: sessionId cannot be null or empty");
                            return;
                        }
                        try {
                            com_google_android_gms_cast_internal_zze.zza(str, (zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }
                });
            }

            public PendingResult<ApplicationConnectionResult> zza(GoogleApiClient googleApiClient, String str, String str2, JoinOptions joinOptions) {
                final String str3 = str;
                final String str4 = str2;
                final JoinOptions joinOptions2 = joinOptions;
                return googleApiClient.zzd(new a(this, googleApiClient) {
                    final /* synthetic */ zza d;

                    public void a(zze com_google_android_gms_cast_internal_zze) throws RemoteException {
                        try {
                            com_google_android_gms_cast_internal_zze.zza(str3, str4, joinOptions2, (zznt.zzb) this);
                        } catch (IllegalStateException e) {
                            zzbq(2001);
                        }
                    }

                    public /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                        a((zze) com_google_android_gms_common_api_Api_zzb);
                    }
                });
            }
        }

        int getActiveInputState(GoogleApiClient googleApiClient) throws IllegalStateException;

        ApplicationMetadata getApplicationMetadata(GoogleApiClient googleApiClient) throws IllegalStateException;

        String getApplicationStatus(GoogleApiClient googleApiClient) throws IllegalStateException;

        int getStandbyState(GoogleApiClient googleApiClient) throws IllegalStateException;

        double getVolume(GoogleApiClient googleApiClient) throws IllegalStateException;

        boolean isMute(GoogleApiClient googleApiClient) throws IllegalStateException;

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> joinApplication(GoogleApiClient googleApiClient, String str, String str2);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str);

        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions);

        @Deprecated
        PendingResult<ApplicationConnectionResult> launchApplication(GoogleApiClient googleApiClient, String str, boolean z);

        PendingResult<Status> leaveApplication(GoogleApiClient googleApiClient);

        void removeMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str) throws IOException, IllegalArgumentException;

        void requestStatus(GoogleApiClient googleApiClient) throws IOException, IllegalStateException;

        PendingResult<Status> sendMessage(GoogleApiClient googleApiClient, String str, String str2);

        void setMessageReceivedCallbacks(GoogleApiClient googleApiClient, String str, MessageReceivedCallback messageReceivedCallback) throws IOException, IllegalStateException;

        void setMute(GoogleApiClient googleApiClient, boolean z) throws IOException, IllegalStateException;

        void setVolume(GoogleApiClient googleApiClient, double d) throws IOException, IllegalArgumentException, IllegalStateException;

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient);

        PendingResult<Status> stopApplication(GoogleApiClient googleApiClient, String str);
    }

    public static final class CastOptions implements HasOptions {
        final CastDevice zzaep;
        final Listener zzaeq;
        private final int zzaer;

        public static final class Builder {
            CastDevice zzaes;
            Listener zzaet;
            private int zzaeu = 0;

            public Builder(CastDevice castDevice, Listener listener) {
                zzaa.zzb((Object) castDevice, (Object) "CastDevice parameter cannot be null");
                zzaa.zzb((Object) listener, (Object) "CastListener parameter cannot be null");
                this.zzaes = castDevice;
                this.zzaet = listener;
            }

            public CastOptions build() {
                return new CastOptions();
            }

            public Builder setVerboseLoggingEnabled(boolean z) {
                if (z) {
                    this.zzaeu |= 1;
                } else {
                    this.zzaeu &= -2;
                }
                return this;
            }
        }

        private CastOptions(Builder builder) {
            this.zzaep = builder.zzaes;
            this.zzaeq = builder.zzaet;
            this.zzaer = builder.zzaeu;
        }

        @Deprecated
        public static Builder builder(CastDevice castDevice, Listener listener) {
            return new Builder(castDevice, listener);
        }
    }

    public static class Listener {
        public void onActiveInputStateChanged(int i) {
        }

        public void onApplicationDisconnected(int i) {
        }

        public void onApplicationMetadataChanged(ApplicationMetadata applicationMetadata) {
        }

        public void onApplicationStatusChanged() {
        }

        public void onStandbyStateChanged(int i) {
        }

        public void onVolumeChanged() {
        }
    }

    public interface MessageReceivedCallback {
        void onMessageReceived(CastDevice castDevice, String str, String str2);
    }

    private Cast() {
    }
}
