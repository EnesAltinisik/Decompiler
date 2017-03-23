package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zze;
import com.google.android.gms.common.api.Api.zzf;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zznt.zzb;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import java.util.List;

public class zzp implements Messages {
    public static final zza<a, MessagesOptions> zzaaA = new zza<a, MessagesOptions>() {
        public a a(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, MessagesOptions messagesOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new a(context, looper, connectionCallbacks, onConnectionFailedListener, com_google_android_gms_common_internal_zzg, messagesOptions);
        }

        public int getPriority() {
            return Strategy.TTL_SECONDS_INFINITE;
        }

        public /* synthetic */ zze zza(Context context, Looper looper, zzg com_google_android_gms_common_internal_zzg, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return a(context, looper, com_google_android_gms_common_internal_zzg, (MessagesOptions) obj, connectionCallbacks, onConnectionFailedListener);
        }
    };
    public static final zzf<a> zzaaz = new zzf();

    static abstract class a extends zznt.zza<Status, a> {
        public a(GoogleApiClient googleApiClient) {
            super(Nearby.MESSAGES_API, googleApiClient);
        }

        public Status a(Status status) {
            return status;
        }

        public /* synthetic */ Result zzc(Status status) {
            return a(status);
        }
    }

    static void zza(Iterable<Update> iterable, MessageListener messageListener) {
        for (Update update : iterable) {
            if (update.zzkl(1)) {
                messageListener.onFound(update.zzbjL);
            }
            if (update.zzkl(2)) {
                messageListener.onLost(update.zzbjL);
            }
            if (update.zzkl(4)) {
                messageListener.zza(update.zzbjL, update.zzbkv);
            }
            if (update.zzkl(8)) {
                messageListener.zza(update.zzbjL, update.zzbkw);
            }
        }
    }

    private static List<Update> zzy(Intent intent) {
        return zzl.zzc(intent, "com.google.android.gms.nearby.messages.UPDATES");
    }

    public PendingResult<Status> getPermissionStatus(GoogleApiClient googleApiClient) {
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp a;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public void handleIntent(Intent intent, MessageListener messageListener) {
        zza(zzy(intent), messageListener);
    }

    public PendingResult<Status> publish(GoogleApiClient googleApiClient, Message message) {
        return publish(googleApiClient, message, PublishOptions.DEFAULT);
    }

    public PendingResult<Status> publish(GoogleApiClient googleApiClient, final Message message, final PublishOptions publishOptions) {
        zzaa.zzz(message);
        zzaa.zzz(publishOptions);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, MessageWrapper.zza(message), publishOptions);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> registerStatusCallback(GoogleApiClient googleApiClient, final StatusCallback statusCallback) {
        zzaa.zzz(statusCallback);
        final zzou a = ((a) googleApiClient.zza(zzaaz)).a(googleApiClient, statusCallback);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, a, statusCallback);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return subscribe(googleApiClient, pendingIntent, SubscribeOptions.DEFAULT);
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, final PendingIntent pendingIntent, final SubscribeOptions subscribeOptions) {
        zzaa.zzz(pendingIntent);
        zzaa.zzz(subscribeOptions);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, pendingIntent, subscribeOptions);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener) {
        return subscribe(googleApiClient, messageListener, SubscribeOptions.DEFAULT);
    }

    public PendingResult<Status> subscribe(GoogleApiClient googleApiClient, MessageListener messageListener, SubscribeOptions subscribeOptions) {
        zzaa.zzz(messageListener);
        zzaa.zzz(subscribeOptions);
        final zzou a = ((a) googleApiClient.zza(zzaaz)).a(googleApiClient, messageListener);
        final MessageListener messageListener2 = messageListener;
        final SubscribeOptions subscribeOptions2 = subscribeOptions;
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp d;

            protected void a(a aVar) throws RemoteException {
                aVar.a(this, a, messageListener2, subscribeOptions2, null);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unpublish(GoogleApiClient googleApiClient, final Message message) {
        zzaa.zzz(message);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp b;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, MessageWrapper.zza(message));
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unregisterStatusCallback(GoogleApiClient googleApiClient, final StatusCallback statusCallback) {
        final zzou a = ((a) googleApiClient.zza(zzaaz)).a(googleApiClient, statusCallback);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(a aVar) throws RemoteException {
                aVar.b(this, a, statusCallback);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, final PendingIntent pendingIntent) {
        zzaa.zzz(pendingIntent);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp b;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, pendingIntent);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }

    public PendingResult<Status> unsubscribe(GoogleApiClient googleApiClient, final MessageListener messageListener) {
        zzaa.zzz(messageListener);
        final zzou a = ((a) googleApiClient.zza(zzaaz)).a(googleApiClient, messageListener);
        return googleApiClient.zzd(new a(this, googleApiClient) {
            final /* synthetic */ zzp c;

            protected void a(a aVar) throws RemoteException {
                aVar.a((zzb) this, a, messageListener);
            }

            protected /* synthetic */ void zza(Api.zzb com_google_android_gms_common_api_Api_zzb) throws RemoteException {
                a((a) com_google_android_gms_common_api_Api_zzb);
            }
        });
    }
}
