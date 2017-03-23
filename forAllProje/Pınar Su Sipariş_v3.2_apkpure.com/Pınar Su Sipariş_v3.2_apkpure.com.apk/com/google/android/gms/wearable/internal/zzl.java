package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.ChannelApi.OpenChannelResult;

public final class zzl implements ChannelApi {

    class AnonymousClass2 implements a<ChannelListener> {
        final /* synthetic */ IntentFilter[] a;

        AnonymousClass2(IntentFilter[] intentFilterArr) {
            this.a = intentFilterArr;
        }

        public void a(zzbp com_google_android_gms_wearable_internal_zzbp, zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, ChannelListener channelListener, zzou<ChannelListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((zzb) com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, channelListener, (zzou) com_google_android_gms_internal_zzou_com_google_android_gms_wearable_ChannelApi_ChannelListener, null, this.a);
        }
    }

    static final class a implements OpenChannelResult {
        private final Status a;
        private final Channel b;

        a(Status status, Channel channel) {
            this.a = (Status) zzaa.zzz(status);
            this.b = channel;
        }

        public Channel getChannel() {
            return this.b;
        }

        public Status getStatus() {
            return this.a;
        }
    }

    static final class b extends e<Status> {
        private final String a;
        private ChannelListener b;

        b(GoogleApiClient googleApiClient, ChannelListener channelListener, String str) {
            super(googleApiClient);
            this.b = (ChannelListener) zzaa.zzz(channelListener);
            this.a = str;
        }

        public Status a(Status status) {
            this.b = null;
            return status;
        }

        protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((zzb) this, this.b, this.a);
            this.b = null;
        }

        protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzbp) com_google_android_gms_common_api_Api_zzb);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    private static a<ChannelListener> zza(IntentFilter[] intentFilterArr) {
        return new AnonymousClass2(intentFilterArr);
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, ChannelListener channelListener) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb((Object) channelListener, (Object) "listener is null");
        return b.a(googleApiClient, zza(new IntentFilter[]{zzbn.zzhE(ChannelApi.ACTION_CHANNEL_EVENT)}), channelListener);
    }

    public PendingResult<OpenChannelResult> openChannel(GoogleApiClient googleApiClient, final String str, final String str2) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb((Object) str, (Object) "nodeId is null");
        zzaa.zzb((Object) str2, (Object) "path is null");
        return googleApiClient.zzc(new e<OpenChannelResult>(this, googleApiClient) {
            final /* synthetic */ zzl c;

            public OpenChannelResult a(Status status) {
                return new a(status, null);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zze(this, str, str2);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, ChannelListener channelListener) {
        zzaa.zzb((Object) googleApiClient, (Object) "client is null");
        zzaa.zzb((Object) channelListener, (Object) "listener is null");
        return googleApiClient.zzc(new b(googleApiClient, channelListener, null));
    }
}
