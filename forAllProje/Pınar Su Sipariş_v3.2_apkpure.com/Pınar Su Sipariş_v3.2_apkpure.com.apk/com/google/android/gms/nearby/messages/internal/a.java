package com.google.android.gms.nearby.messages.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.h.j;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.internal.zzk;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.internal.zznt;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zzb;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.MessagesOptions;
import com.google.android.gms.nearby.messages.PublishCallback;
import com.google.android.gms.nearby.messages.PublishOptions;
import com.google.android.gms.nearby.messages.StatusCallback;
import com.google.android.gms.nearby.messages.SubscribeCallback;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.nearby.messages.internal.zzf.zza;
import java.util.List;

class a extends zzk<zzh> {
    private final ClientAppContext a;
    private final int b;
    private final h<StatusCallback, f> c = new h<StatusCallback, f>(this) {
        final /* synthetic */ a a;

        {
            this.a = r2;
        }

        protected f a(zzou<StatusCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback) {
            return new f(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback);
        }

        protected /* synthetic */ a b(zzou com_google_android_gms_internal_zzou) {
            return a(com_google_android_gms_internal_zzou);
        }
    };
    private final h<MessageListener, c> d = new h<MessageListener, c>(this) {
        final /* synthetic */ a a;

        {
            this.a = r2;
        }

        protected c a(zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener) {
            return new c(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener);
        }

        protected /* synthetic */ a b(zzou com_google_android_gms_internal_zzou) {
            return a(com_google_android_gms_internal_zzou);
        }
    };

    private static abstract class h<C, W extends a<C>> {
        private final j<C, W> a;

        private h() {
            this.a = new j(1);
        }

        W a(zzou<C> com_google_android_gms_internal_zzou_C, C c) {
            a aVar = (a) this.a.get(c);
            if (aVar != null) {
                com_google_android_gms_internal_zzou_C.clear();
                return aVar;
            }
            W b = b((zzou) com_google_android_gms_internal_zzou_C);
            this.a.put(c, b);
            return b;
        }

        W a(C c) {
            return (a) this.a.get(c);
        }

        protected abstract W b(zzou<C> com_google_android_gms_internal_zzou_C);

        W b(C c) {
            a aVar = (a) this.a.remove(c);
            if (aVar != null) {
                aVar.a().clear();
            }
            return aVar;
        }
    }

    private interface a<C> {
        zzou<C> a();
    }

    @TargetApi(14)
    private static class b implements ActivityLifecycleCallbacks {
        private final Activity a;
        private final a b;

        private b(Activity activity, a aVar) {
            this.a = activity;
            this.b = aVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity == this.a) {
                Log.v("NearbyMessagesClient", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (activity == this.a) {
                try {
                    this.b.a(1);
                } catch (RemoteException e) {
                    Log.v("NearbyMessagesClient", String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", new Object[]{activity.getPackageName(), e}));
                }
            }
        }
    }

    private static abstract class d<T> implements zzb<T> {
        private d() {
        }

        public void zzrV() {
        }
    }

    private static class c extends zza implements a<MessageListener> {
        private final zzou<MessageListener> a;

        private c(zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener;
        }

        public zzou<MessageListener> a() {
            return this.a;
        }

        public void zzE(final List<Update> list) throws RemoteException {
            this.a.zza(new d<MessageListener>(this) {
                final /* synthetic */ c b;

                public void a(MessageListener messageListener) {
                    zzp.zza(list, messageListener);
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((MessageListener) obj);
                }
            });
        }

        public void zza(MessageWrapper messageWrapper) {
        }

        public void zzb(MessageWrapper messageWrapper) {
        }
    }

    private static class e extends zzi.zza {
        private final PublishCallback a;

        private e(PublishCallback publishCallback) {
            this.a = publishCallback;
        }

        private static e b(PublishCallback publishCallback) {
            return publishCallback == null ? null : new e(publishCallback);
        }

        public void onExpired() {
            this.a.onExpired();
        }
    }

    private static class f extends zzj.zza implements a<StatusCallback> {
        private final zzou<StatusCallback> a;

        private f(zzou<StatusCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback) {
            this.a = com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback;
        }

        public zzou<StatusCallback> a() {
            return this.a;
        }

        public void onPermissionChanged(final boolean z) {
            this.a.zza(new d<StatusCallback>(this) {
                final /* synthetic */ f b;

                public void a(StatusCallback statusCallback) {
                    statusCallback.onPermissionChanged(z);
                }

                public /* synthetic */ void zzt(Object obj) {
                    a((StatusCallback) obj);
                }
            });
        }
    }

    private static class g extends zzk.zza {
        private final SubscribeCallback a;

        private g(SubscribeCallback subscribeCallback) {
            this.a = subscribeCallback;
        }

        private static g b(SubscribeCallback subscribeCallback) {
            return subscribeCallback == null ? null : new g(subscribeCallback);
        }

        public void onExpired() {
            this.a.onExpired();
        }
    }

    @TargetApi(14)
    a(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, zzg com_google_android_gms_common_internal_zzg, MessagesOptions messagesOptions) {
        super(context, looper, 62, com_google_android_gms_common_internal_zzg, connectionCallbacks, onConnectionFailedListener);
        String zzty = com_google_android_gms_common_internal_zzg.zzty();
        int a = a(context);
        if (messagesOptions != null) {
            this.a = new ClientAppContext(zzty, messagesOptions.zzbiR, messagesOptions.zzbiS, messagesOptions.zzbiU, a);
            this.b = messagesOptions.zzbiT;
        } else {
            this.a = new ClientAppContext(zzty, null, false, null, a);
            this.b = -1;
        }
        if (a == 1 && zzs.zzva()) {
            Activity activity = (Activity) context;
            Log.v("NearbyMessagesClient", String.format("Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", new Object[]{activity.getPackageName()}));
            activity.getApplication().registerActivityLifecycleCallbacks(new b(activity, this));
        }
    }

    private static int a(Context context) {
        return context instanceof Activity ? 1 : context instanceof Application ? 2 : context instanceof Service ? 3 : 0;
    }

    private static <C> zzou<C> a(GoogleApiClient googleApiClient, C c, h<C, ? extends a<C>> hVar) {
        a a = hVar.a(c);
        return a != null ? a.a() : googleApiClient.zzs(c);
    }

    zzou<MessageListener> a(GoogleApiClient googleApiClient, MessageListener messageListener) {
        return a(googleApiClient, (Object) messageListener, this.d);
    }

    zzou<StatusCallback> a(GoogleApiClient googleApiClient, StatusCallback statusCallback) {
        return a(googleApiClient, (Object) statusCallback, this.c);
    }

    protected zzh a(IBinder iBinder) {
        return zzh.zza.zzdI(iBinder);
    }

    void a(int i) throws RemoteException {
        String str;
        switch (i) {
            case 1:
                str = "ACTIVITY_STOPPED";
                break;
            case 2:
                str = "CLIENT_DISCONNECTED";
                break;
            default:
                Log.w("NearbyMessagesClient", String.format("Received unknown/unforeseen client lifecycle event %d, can't do anything with it.", new Object[]{Integer.valueOf(i)}));
                return;
        }
        if (isConnected()) {
            HandleClientLifecycleEventRequest handleClientLifecycleEventRequest = new HandleClientLifecycleEventRequest(i);
            Log.d("NearbyMessagesClient", String.format("Emitting client lifecycle event %s", new Object[]{str}));
            ((zzh) zztm()).zza(handleClientLifecycleEventRequest);
            return;
        }
        Log.d("NearbyMessagesClient", String.format("Failed to emit client lifecycle event %s due to GmsClient being disconnected", new Object[]{str}));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status) throws RemoteException {
        ((zzh) zztm()).zza(new GetPermissionStatusRequest(b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status)));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, PendingIntent pendingIntent) throws RemoteException {
        ((zzh) zztm()).zza(new UnsubscribeRequest(null, b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), pendingIntent, 0));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, PendingIntent pendingIntent, SubscribeOptions subscribeOptions) throws RemoteException {
        ((zzh) zztm()).zza(new SubscribeRequest(null, subscribeOptions.getStrategy(), b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), subscribeOptions.getFilter(), pendingIntent, 0, null, g.b(subscribeOptions.getCallback()), subscribeOptions.zzbjk));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener, MessageListener messageListener) throws RemoteException {
        if (this.d.a(messageListener) != null) {
            ((zzh) zztm()).zza(new UnsubscribeRequest((IBinder) this.d.a(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener, messageListener), b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), null, 0));
            this.d.b((Object) messageListener);
        }
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<MessageListener> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener, MessageListener messageListener, SubscribeOptions subscribeOptions, byte[] bArr) throws RemoteException {
        ((zzh) zztm()).zza(new SubscribeRequest((IBinder) this.d.a(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_MessageListener, messageListener), subscribeOptions.getStrategy(), b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), subscribeOptions.getFilter(), null, 0, bArr, g.b(subscribeOptions.getCallback()), subscribeOptions.zzbjk));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<StatusCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback, StatusCallback statusCallback) throws RemoteException {
        RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), (IBinder) this.c.a(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback, statusCallback));
        registerStatusCallbackRequest.zzbkn = true;
        ((zzh) zztm()).zza(registerStatusCallbackRequest);
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, MessageWrapper messageWrapper) throws RemoteException {
        ((zzh) zztm()).zza(new UnpublishRequest(messageWrapper, b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), this.a));
    }

    void a(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, MessageWrapper messageWrapper, PublishOptions publishOptions) throws RemoteException {
        ((zzh) zztm()).zza(new PublishRequest(messageWrapper, publishOptions.getStrategy(), b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), e.b(publishOptions.getCallback())));
    }

    void b(zznt.zzb<Status> com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status, zzou<StatusCallback> com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback, StatusCallback statusCallback) throws RemoteException {
        if (this.c.a(statusCallback) != null) {
            RegisterStatusCallbackRequest registerStatusCallbackRequest = new RegisterStatusCallbackRequest(b.a(com_google_android_gms_internal_zznt_zzb_com_google_android_gms_common_api_Status), (IBinder) this.c.a(com_google_android_gms_internal_zzou_com_google_android_gms_nearby_messages_StatusCallback, statusCallback));
            registerStatusCallbackRequest.zzbkn = false;
            ((zzh) zztm()).zza(registerStatusCallbackRequest);
            this.c.b((Object) statusCallback);
        }
    }

    public void disconnect() {
        try {
            a(2);
        } catch (RemoteException e) {
            Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", new Object[]{e}));
        }
        super.disconnect();
    }

    protected /* synthetic */ IInterface zzab(IBinder iBinder) {
        return a(iBinder);
    }

    protected String zzhT() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    protected String zzhU() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    protected Bundle zzoO() {
        Bundle zzoO = super.zzoO();
        zzoO.putInt("NearbyPermissions", this.b);
        zzoO.putParcelable("ClientAppContext", this.a);
        return zzoO;
    }
}
