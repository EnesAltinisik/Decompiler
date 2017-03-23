package com.google.android.gms.cast;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import com.google.android.gms.cast.Cast.MessageReceivedCallback;
import com.google.android.gms.cast.internal.zzb;
import com.google.android.gms.cast.internal.zze;
import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.cast.internal.zzm.zza;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzo;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONObject;

@SuppressLint({"MissingRemoteException"})
public class RemoteMediaPlayer implements MessageReceivedCallback {
    public static final int RESUME_STATE_PAUSE = 2;
    public static final int RESUME_STATE_PLAY = 1;
    public static final int RESUME_STATE_UNCHANGED = 0;
    public static final int STATUS_CANCELED = 2101;
    public static final int STATUS_FAILED = 2100;
    public static final int STATUS_REPLACED = 2103;
    public static final int STATUS_SUCCEEDED = 0;
    public static final int STATUS_TIMED_OUT = 2102;
    private final zzm zzagg;
    private final a zzagh;
    private OnPreloadStatusUpdatedListener zzagi;
    private OnQueueStatusUpdatedListener zzagj;
    private OnMetadataUpdatedListener zzagk;
    private OnStatusUpdatedListener zzagl;
    private final Object zzpp;

    static abstract class b extends zzb<MediaChannelResult> {
        zzo h = new zzo(this) {
            final /* synthetic */ b a;

            {
                this.a = r1;
            }

            public void zzA(long j) {
                this.a.zzb((MediaChannelResult) this.a.zzc(new Status(2103)));
            }

            public void zza(long j, int i, Object obj) {
                this.a.zzb(new c(new Status(i), obj instanceof JSONObject ? (JSONObject) obj : null));
            }
        };

        b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        public MediaChannelResult a(final Status status) {
            return new MediaChannelResult(this) {
                final /* synthetic */ b b;

                public JSONObject getCustomData() {
                    return null;
                }

                public Status getStatus() {
                    return status;
                }
            };
        }

        protected void a(zze com_google_android_gms_cast_internal_zze) {
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zze) com_google_android_gms_common_api_Api_zzb);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public interface MediaChannelResult extends Result {
        JSONObject getCustomData();
    }

    public interface OnMetadataUpdatedListener {
        void onMetadataUpdated();
    }

    public interface OnPreloadStatusUpdatedListener {
        void onPreloadStatusUpdated();
    }

    public interface OnQueueStatusUpdatedListener {
        void onQueueStatusUpdated();
    }

    public interface OnStatusUpdatedListener {
        void onStatusUpdated();
    }

    private class a implements zzn {
        final /* synthetic */ RemoteMediaPlayer a;
        private GoogleApiClient b;
        private long c = 0;

        private final class a implements ResultCallback<Status> {
            final /* synthetic */ a a;
            private final long b;

            a(a aVar, long j) {
                this.a = aVar;
                this.b = j;
            }

            public void a(Status status) {
                if (!status.isSuccess()) {
                    this.a.a.zzagg.zzb(this.b, status.getStatusCode());
                }
            }

            public /* synthetic */ void onResult(Result result) {
                a((Status) result);
            }
        }

        public a(RemoteMediaPlayer remoteMediaPlayer) {
            this.a = remoteMediaPlayer;
        }

        public void a(GoogleApiClient googleApiClient) {
            this.b = googleApiClient;
        }

        public void zza(String str, String str2, long j, String str3) throws IOException {
            if (this.b == null) {
                throw new IOException("No GoogleApiClient available");
            }
            Cast.CastApi.sendMessage(this.b, str, str2).setResultCallback(new a(this, j));
        }

        public long zzpZ() {
            long j = this.c + 1;
            this.c = j;
            return j;
        }
    }

    private static final class c implements MediaChannelResult {
        private final Status a;
        private final JSONObject b;

        c(Status status, JSONObject jSONObject) {
            this.a = status;
            this.b = jSONObject;
        }

        public JSONObject getCustomData() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    public RemoteMediaPlayer() {
        this(new zzm(null));
    }

    RemoteMediaPlayer(zzm com_google_android_gms_cast_internal_zzm) {
        this.zzpp = new Object();
        this.zzagg = com_google_android_gms_cast_internal_zzm;
        this.zzagg.zza(new zza(this) {
            final /* synthetic */ RemoteMediaPlayer a;

            {
                this.a = r1;
            }

            public void onMetadataUpdated() {
                this.a.onMetadataUpdated();
            }

            public void onPreloadStatusUpdated() {
                this.a.onPreloadStatusUpdated();
            }

            public void onQueueStatusUpdated() {
                this.a.onQueueStatusUpdated();
            }

            public void onStatusUpdated() {
                this.a.onStatusUpdated();
            }
        });
        this.zzagh = new a(this);
        this.zzagg.zza(this.zzagh);
    }

    private void onMetadataUpdated() {
        if (this.zzagk != null) {
            this.zzagk.onMetadataUpdated();
        }
    }

    private void onPreloadStatusUpdated() {
        if (this.zzagi != null) {
            this.zzagi.onPreloadStatusUpdated();
        }
    }

    private void onQueueStatusUpdated() {
        if (this.zzagj != null) {
            this.zzagj.onQueueStatusUpdated();
        }
    }

    private void onStatusUpdated() {
        if (this.zzagl != null) {
            this.zzagl.onStatusUpdated();
        }
    }

    private int zzbm(int i) {
        MediaStatus mediaStatus = getMediaStatus();
        for (int i2 = 0; i2 < mediaStatus.getQueueItemCount(); i2++) {
            if (mediaStatus.getQueueItem(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public long getApproximateStreamPosition() {
        long approximateStreamPosition;
        synchronized (this.zzpp) {
            approximateStreamPosition = this.zzagg.getApproximateStreamPosition();
        }
        return approximateStreamPosition;
    }

    public MediaInfo getMediaInfo() {
        MediaInfo mediaInfo;
        synchronized (this.zzpp) {
            mediaInfo = this.zzagg.getMediaInfo();
        }
        return mediaInfo;
    }

    public MediaStatus getMediaStatus() {
        MediaStatus mediaStatus;
        synchronized (this.zzpp) {
            mediaStatus = this.zzagg.getMediaStatus();
        }
        return mediaStatus;
    }

    public String getNamespace() {
        return this.zzagg.getNamespace();
    }

    public long getStreamDuration() {
        long streamDuration;
        synchronized (this.zzpp) {
            streamDuration = this.zzagg.getStreamDuration();
        }
        return streamDuration;
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo) {
        return load(googleApiClient, mediaInfo, true, 0, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z) {
        return load(googleApiClient, mediaInfo, z, 0, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j) {
        return load(googleApiClient, mediaInfo, z, j, null, null);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, JSONObject jSONObject) {
        return load(googleApiClient, mediaInfo, z, j, null, jSONObject);
    }

    public PendingResult<MediaChannelResult> load(GoogleApiClient googleApiClient, MediaInfo mediaInfo, boolean z, long j, long[] jArr, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaInfo mediaInfo2 = mediaInfo;
        final boolean z2 = z;
        final long j2 = j;
        final long[] jArr2 = jArr;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer g;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.g.zzpp) {
                    this.g.zzagh.a(googleApiClient2);
                    try {
                        this.g.zzagg.zza(this.h, mediaInfo2, z2, j2, jArr2, jSONObject2);
                        this.g.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.g.zzagh.a(null);
                    } catch (Throwable th) {
                        this.g.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void onMessageReceived(CastDevice castDevice, String str, String str2) {
        this.zzagg.zzcC(str2);
    }

    public PendingResult<MediaChannelResult> pause(GoogleApiClient googleApiClient) {
        return pause(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> pause(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer c;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.c.zzpp) {
                    this.c.zzagh.a(googleApiClient);
                    try {
                        this.c.zzagg.zza(this.h, jSONObject);
                        this.c.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.c.zzagh.a(null);
                    } catch (Throwable th) {
                        this.c.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> play(GoogleApiClient googleApiClient) {
        return play(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> play(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer c;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.c.zzpp) {
                    this.c.zzagh.a(googleApiClient);
                    try {
                        this.c.zzagg.zzc(this.h, jSONObject);
                        this.c.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.c.zzagh.a(null);
                    } catch (Throwable th) {
                        this.c.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueAppendItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, JSONObject jSONObject) throws IllegalArgumentException {
        return queueInsertItems(googleApiClient, new MediaQueueItem[]{mediaQueueItem}, 0, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, long j, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaQueueItem mediaQueueItem2 = mediaQueueItem;
        final int i2 = i;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer f;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.f.zzpp) {
                    this.f.zzagh.a(googleApiClient2);
                    try {
                        this.f.zzagg.zza(this.h, new MediaQueueItem[]{mediaQueueItem2}, i2, 0, 0, j2, jSONObject2);
                        this.f.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.f.zzagh.a(null);
                    } catch (Throwable th) {
                        this.f.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueInsertAndPlayItem(GoogleApiClient googleApiClient, MediaQueueItem mediaQueueItem, int i, JSONObject jSONObject) {
        return queueInsertAndPlayItem(googleApiClient, mediaQueueItem, i, -1, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueInsertItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, JSONObject jSONObject) throws IllegalArgumentException {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer e;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.e.zzpp) {
                    this.e.zzagh.a(googleApiClient2);
                    try {
                        this.e.zzagg.zza(this.h, mediaQueueItemArr2, i2, 0, -1, -1, jSONObject2);
                        this.e.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.e.zzagh.a(null);
                    } catch (Throwable th) {
                        this.e.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, long j, JSONObject jSONObject) {
        final int i2 = i;
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer e;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.e.zzpp) {
                    if (this.e.zzbm(i2) == -1) {
                        zzb((MediaChannelResult) zzc(new Status(0)));
                        return;
                    }
                    this.e.zzagh.a(googleApiClient2);
                    try {
                        this.e.zzagg.zza(this.h, i2, j2, null, 0, null, jSONObject2);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                    } finally {
                        this.e.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueJumpToItem(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        return queueJumpToItem(googleApiClient, i, -1, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, long j, JSONObject jSONObject) throws IllegalArgumentException {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final int i3 = i;
        final int i4 = i2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer g;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.g.zzpp) {
                    this.g.zzagh.a(googleApiClient2);
                    try {
                        this.g.zzagg.zza(this.h, mediaQueueItemArr2, i3, i4, j2, jSONObject2);
                        this.g.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.g.zzagh.a(null);
                    } catch (Throwable th) {
                        this.g.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueLoad(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, int i, int i2, JSONObject jSONObject) throws IllegalArgumentException {
        return queueLoad(googleApiClient, mediaQueueItemArr, i, i2, -1, jSONObject);
    }

    public PendingResult<MediaChannelResult> queueMoveItemToNewIndex(GoogleApiClient googleApiClient, int i, int i2, JSONObject jSONObject) {
        final int i3 = i;
        final int i4 = i2;
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer e;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                int i = 0;
                synchronized (this.e.zzpp) {
                    int zza = this.e.zzbm(i3);
                    if (zza == -1) {
                        zzb((MediaChannelResult) zzc(new Status(0)));
                    } else if (i4 < 0) {
                        zzb((MediaChannelResult) zzc(new Status(2001, String.format(Locale.ROOT, "Invalid request: Invalid newIndex %d.", new Object[]{Integer.valueOf(i4)}))));
                    } else if (zza == i4) {
                        zzb((MediaChannelResult) zzc(new Status(0)));
                    } else {
                        MediaQueueItem queueItem = this.e.getMediaStatus().getQueueItem(i4 > zza ? i4 + 1 : i4);
                        if (queueItem != null) {
                            i = queueItem.getItemId();
                        }
                        this.e.zzagh.a(googleApiClient2);
                        try {
                            this.e.zzagg.zza(this.h, new int[]{i3}, i, jSONObject2);
                        } catch (IOException e) {
                            zzb((MediaChannelResult) zzc(new Status(2100)));
                        } finally {
                            this.e.zzagh.a(null);
                        }
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueNext(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer c;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.c.zzpp) {
                    this.c.zzagh.a(googleApiClient);
                    try {
                        this.c.zzagg.zza(this.h, 0, -1, null, 1, null, jSONObject);
                        this.c.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.c.zzagh.a(null);
                    } catch (Throwable th) {
                        this.c.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queuePrev(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer c;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.c.zzpp) {
                    this.c.zzagh.a(googleApiClient);
                    try {
                        this.c.zzagg.zza(this.h, 0, -1, null, -1, null, jSONObject);
                        this.c.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.c.zzagh.a(null);
                    } catch (Throwable th) {
                        this.c.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueRemoveItem(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        final int i2 = i;
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    if (this.d.zzbm(i2) == -1) {
                        zzb((MediaChannelResult) zzc(new Status(0)));
                        return;
                    }
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, new int[]{i2}, jSONObject2);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                    } finally {
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueRemoveItems(GoogleApiClient googleApiClient, int[] iArr, JSONObject jSONObject) throws IllegalArgumentException {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final int[] iArr2 = iArr;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, iArr2, jSONObject2);
                        this.d.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    } catch (Throwable th) {
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueReorderItems(GoogleApiClient googleApiClient, int[] iArr, int i, JSONObject jSONObject) throws IllegalArgumentException {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final int[] iArr2 = iArr;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer e;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.e.zzpp) {
                    this.e.zzagh.a(googleApiClient2);
                    try {
                        this.e.zzagg.zza(this.h, iArr2, i2, jSONObject2);
                        this.e.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.e.zzagh.a(null);
                    } catch (Throwable th) {
                        this.e.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueSetRepeatMode(GoogleApiClient googleApiClient, int i, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, 0, -1, null, 0, Integer.valueOf(i2), jSONObject2);
                        this.d.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    } catch (Throwable th) {
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> queueUpdateItems(GoogleApiClient googleApiClient, MediaQueueItem[] mediaQueueItemArr, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final MediaQueueItem[] mediaQueueItemArr2 = mediaQueueItemArr;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, 0, -1, mediaQueueItemArr2, 0, null, jSONObject2);
                        this.d.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    } catch (Throwable th) {
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> requestStatus(final GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer b;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.b.zzpp) {
                    this.b.zzagh.a(googleApiClient);
                    try {
                        this.b.zzagg.zza(this.h);
                        this.b.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.b.zzagh.a(null);
                    } catch (Throwable th) {
                        this.b.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j) {
        return seek(googleApiClient, j, 0, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i) {
        return seek(googleApiClient, j, i, null);
    }

    public PendingResult<MediaChannelResult> seek(GoogleApiClient googleApiClient, long j, int i, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final long j2 = j;
        final int i2 = i;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer e;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.e.zzpp) {
                    this.e.zzagh.a(googleApiClient2);
                    try {
                        this.e.zzagg.zza(this.h, j2, i2, jSONObject2);
                        this.e.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.e.zzagh.a(null);
                    } catch (Throwable th) {
                        this.e.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> setActiveMediaTracks(final GoogleApiClient googleApiClient, final long[] jArr) {
        if (jArr != null) {
            return googleApiClient.zzd(new b(this, googleApiClient) {
                final /* synthetic */ RemoteMediaPlayer c;

                protected void a(zze com_google_android_gms_cast_internal_zze) {
                    synchronized (this.c.zzpp) {
                        this.c.zzagh.a(googleApiClient);
                        try {
                            this.c.zzagg.zza(this.h, jArr);
                            this.c.zzagh.a(null);
                        } catch (IOException e) {
                            zzb((MediaChannelResult) zzc(new Status(2100)));
                            this.c.zzagh.a(null);
                        } catch (Throwable th) {
                            this.c.zzagh.a(null);
                        }
                    }
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zze) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("trackIds cannot be null");
    }

    public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener onMetadataUpdatedListener) {
        this.zzagk = onMetadataUpdatedListener;
    }

    public void setOnPreloadStatusUpdatedListener(OnPreloadStatusUpdatedListener onPreloadStatusUpdatedListener) {
        this.zzagi = onPreloadStatusUpdatedListener;
    }

    public void setOnQueueStatusUpdatedListener(OnQueueStatusUpdatedListener onQueueStatusUpdatedListener) {
        this.zzagj = onQueueStatusUpdatedListener;
    }

    public void setOnStatusUpdatedListener(OnStatusUpdatedListener onStatusUpdatedListener) {
        this.zzagl = onStatusUpdatedListener;
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z) {
        return setStreamMute(googleApiClient, z, null);
    }

    public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient googleApiClient, boolean z, JSONObject jSONObject) {
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final boolean z2 = z;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, z2, jSONObject2);
                        this.d.zzagh.a(null);
                    } catch (IllegalStateException e) {
                        try {
                            zzb((MediaChannelResult) zzc(new Status(2100)));
                            this.d.zzagh.a(null);
                        } catch (Throwable th) {
                            this.d.zzagh.a(null);
                        }
                    } catch (IOException e2) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d) throws IllegalArgumentException {
        return setStreamVolume(googleApiClient, d, null);
    }

    public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient googleApiClient, double d, JSONObject jSONObject) throws IllegalArgumentException {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw new IllegalArgumentException("Volume cannot be " + d);
        }
        final GoogleApiClient googleApiClient2 = googleApiClient;
        final double d2 = d;
        final JSONObject jSONObject2 = jSONObject;
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer d;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.d.zzpp) {
                    this.d.zzagh.a(googleApiClient2);
                    try {
                        this.d.zzagg.zza(this.h, d2, jSONObject2);
                        this.d.zzagh.a(null);
                    } catch (IllegalStateException e) {
                        try {
                            zzb((MediaChannelResult) zzc(new Status(2100)));
                            this.d.zzagh.a(null);
                        } catch (Throwable th) {
                            this.d.zzagh.a(null);
                        }
                    } catch (IllegalArgumentException e2) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    } catch (IOException e3) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.d.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<MediaChannelResult> setTextTrackStyle(final GoogleApiClient googleApiClient, final TextTrackStyle textTrackStyle) {
        if (textTrackStyle != null) {
            return googleApiClient.zzd(new b(this, googleApiClient) {
                final /* synthetic */ RemoteMediaPlayer c;

                protected void a(zze com_google_android_gms_cast_internal_zze) {
                    synchronized (this.c.zzpp) {
                        this.c.zzagh.a(googleApiClient);
                        try {
                            this.c.zzagg.zza(this.h, textTrackStyle);
                            this.c.zzagh.a(null);
                        } catch (IOException e) {
                            zzb((MediaChannelResult) zzc(new Status(2100)));
                            this.c.zzagh.a(null);
                        } catch (Throwable th) {
                            this.c.zzagh.a(null);
                        }
                    }
                }

                protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                    a((zze) com_google_android_gms_common_api_Api_zzb);
                }
            });
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public PendingResult<MediaChannelResult> stop(GoogleApiClient googleApiClient) {
        return stop(googleApiClient, null);
    }

    public PendingResult<MediaChannelResult> stop(final GoogleApiClient googleApiClient, final JSONObject jSONObject) {
        return googleApiClient.zzd(new b(this, googleApiClient) {
            final /* synthetic */ RemoteMediaPlayer c;

            protected void a(zze com_google_android_gms_cast_internal_zze) {
                synchronized (this.c.zzpp) {
                    this.c.zzagh.a(googleApiClient);
                    try {
                        this.c.zzagg.zzb(this.h, jSONObject);
                        this.c.zzagh.a(null);
                    } catch (IOException e) {
                        zzb((MediaChannelResult) zzc(new Status(2100)));
                        this.c.zzagh.a(null);
                    } catch (Throwable th) {
                        this.c.zzagh.a(null);
                    }
                }
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zze) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
