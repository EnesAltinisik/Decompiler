package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;

public final class zzaz implements MessageApi {

    private static final class a extends e<Status> {
        private MessageListener a;
        private zzou<MessageListener> b;
        private IntentFilter[] c;

        private a(GoogleApiClient googleApiClient, MessageListener messageListener, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener, IntentFilter[] intentFilterArr) {
            super(googleApiClient);
            this.a = (MessageListener) zzaa.zzz(messageListener);
            this.b = (zzou) zzaa.zzz(com_google_android_gms_internal_zzou_com_google_android_gms_wearable_MessageApi_MessageListener);
            this.c = (IntentFilter[]) zzaa.zzz(intentFilterArr);
        }

        public Status a(Status status) {
            this.a = null;
            this.b = null;
            this.c = null;
            return status;
        }

        protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
            com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, this.a, this.b, this.c);
            this.a = null;
            this.b = null;
            this.c = null;
        }

        protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
            a((zzbp) com_google_android_gms_common_api_Api_zzb);
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    public static class zzb implements SendMessageResult {
        private final Status zzaaO;
        private final int zzauX;

        public zzb(Status status, int i) {
            this.zzaaO = status;
            this.zzauX = i;
        }

        public int getRequestId() {
            return this.zzauX;
        }

        public Status getStatus() {
            return this.zzaaO;
        }
    }

    private PendingResult<Status> zza(GoogleApiClient googleApiClient, MessageListener messageListener, IntentFilter[] intentFilterArr) {
        return googleApiClient.zzc(new a(googleApiClient, messageListener, googleApiClient.zzs(messageListener), intentFilterArr));
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageListener messageListener) {
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzbn.zzhE(MessageApi.ACTION_MESSAGE_RECEIVED)});
    }

    public PendingResult<Status> addListener(GoogleApiClient googleApiClient, MessageListener messageListener, Uri uri, int i) {
        zzaa.zzb(uri != null, (Object) "uri must not be null");
        boolean z = i == 0 || i == 1;
        zzaa.zzb(z, (Object) "invalid filter type");
        return zza(googleApiClient, messageListener, new IntentFilter[]{zzbn.zza(MessageApi.ACTION_MESSAGE_RECEIVED, uri, i)});
    }

    public PendingResult<Status> removeListener(GoogleApiClient googleApiClient, final MessageListener messageListener) {
        return googleApiClient.zzc(new e<Status>(this, googleApiClient) {
            final /* synthetic */ zzaz b;

            public Status a(Status status) {
                return status;
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, messageListener);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            public /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }

    public PendingResult<SendMessageResult> sendMessage(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr) {
        final String str3 = str;
        final String str4 = str2;
        final byte[] bArr2 = bArr;
        return googleApiClient.zzc(new e<SendMessageResult>(this, googleApiClient) {
            final /* synthetic */ zzaz d;

            protected SendMessageResult a(Status status) {
                return new zzb(status, -1);
            }

            protected void a(zzbp com_google_android_gms_wearable_internal_zzbp) throws RemoteException {
                com_google_android_gms_wearable_internal_zzbp.zza((com.google.android.gms.internal.zznt.zzb) this, str3, str4, bArr2);
            }

            protected /* synthetic */ void zza(com.google.android.gms.common.api.Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((zzbp) com_google_android_gms_common_api_Api_zzb);
            }

            protected /* synthetic */ Result zzc(Status status) {
                return a(status);
            }
        });
    }
}
