package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.zze;
import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.ChannelApi.ChannelListener;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.CapabilityInfoParcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.gms.wearable.internal.NodeParcelable;
import com.google.android.gms.wearable.internal.zzaw.zza;
import java.util.List;

public abstract class WearableListenerService extends Service implements CapabilityListener, ChannelListener, DataListener, MessageListener, NodeListener {
    public static final String BIND_LISTENER_INTENT_ACTION = "com.google.android.gms.wearable.BIND_LISTENER";
    private String zzZC;
    private IBinder zzaqQ;
    private Handler zzbBU;
    private final Object zzbBV = new Object();
    private boolean zzbBW;

    private final class a extends zza {
        final /* synthetic */ WearableListenerService a;
        private volatile int b;

        private a(WearableListenerService wearableListenerService) {
            this.a = wearableListenerService;
            this.b = -1;
        }

        private void a() throws SecurityException {
            int callingUid = Binder.getCallingUid();
            if (callingUid != this.b) {
                if (zze.zze(this.a, callingUid)) {
                    this.b = callingUid;
                    return;
                }
                throw new SecurityException("Caller is not GooglePlayServices");
            }
        }

        private boolean a(Runnable runnable, String str, Object obj) {
            if (Log.isLoggable("WearableLS", 3)) {
                Log.d("WearableLS", String.format("%s: %s %s", new Object[]{str, this.a.zzZC, obj}));
            }
            a();
            synchronized (this.a.zzbBV) {
                if (this.a.zzbBW) {
                    return false;
                }
                this.a.zzbBU.post(runnable);
                return true;
            }
        }

        public void onConnectedNodes(final List<NodeParcelable> list) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onConnectedNodes(list);
                }
            }, "onConnectedNodes", list);
        }

        public void zza(final AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onEntityUpdate(amsEntityUpdateParcelable);
                }
            }, "onEntityUpdate", amsEntityUpdateParcelable);
        }

        public void zza(final AncsNotificationParcelable ancsNotificationParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onNotificationReceived(ancsNotificationParcelable);
                }
            }, "onNotificationReceived", ancsNotificationParcelable);
        }

        public void zza(final CapabilityInfoParcelable capabilityInfoParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onCapabilityChanged(capabilityInfoParcelable);
                }
            }, "onConnectedCapabilityChanged", capabilityInfoParcelable);
        }

        public void zza(final ChannelEventParcelable channelEventParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    channelEventParcelable.zza(this.b.a);
                }
            }, "onChannelEvent", channelEventParcelable);
        }

        public void zza(final MessageEventParcelable messageEventParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onMessageReceived(messageEventParcelable);
                }
            }, "onMessageReceived", messageEventParcelable);
        }

        public void zza(final NodeParcelable nodeParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onPeerConnected(nodeParcelable);
                }
            }, "onPeerConnected", nodeParcelable);
        }

        public void zzaq(final DataHolder dataHolder) {
            try {
                if (!a(new Runnable(this) {
                    final /* synthetic */ a b;

                    public void run() {
                        DataEventBuffer dataEventBuffer = new DataEventBuffer(dataHolder);
                        try {
                            this.b.a.onDataChanged(dataEventBuffer);
                        } finally {
                            dataEventBuffer.release();
                        }
                    }
                }, "onDataItemChanged", dataHolder)) {
                }
            } finally {
                dataHolder.close();
            }
        }

        public void zzb(final NodeParcelable nodeParcelable) {
            a(new Runnable(this) {
                final /* synthetic */ a b;

                public void run() {
                    this.b.a.onPeerDisconnected(nodeParcelable);
                }
            }, "onPeerDisconnected", nodeParcelable);
        }
    }

    public final IBinder onBind(Intent intent) {
        return BIND_LISTENER_INTENT_ACTION.equals(intent.getAction()) ? this.zzaqQ : null;
    }

    public void onCapabilityChanged(CapabilityInfo capabilityInfo) {
    }

    public void onChannelClosed(Channel channel, int i, int i2) {
    }

    public void onChannelOpened(Channel channel) {
    }

    public void onConnectedNodes(List<Node> list) {
    }

    public void onCreate() {
        super.onCreate();
        if (Log.isLoggable("WearableLS", 3)) {
            String str = "WearableLS";
            String str2 = "onCreate: ";
            String valueOf = String.valueOf(new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        this.zzZC = getPackageName();
        HandlerThread handlerThread = new HandlerThread("WearableListenerService");
        handlerThread.start();
        this.zzbBU = new Handler(handlerThread.getLooper());
        this.zzaqQ = new a();
    }

    public void onDataChanged(DataEventBuffer dataEventBuffer) {
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String str = "WearableLS";
            String str2 = "onDestroy: ";
            String valueOf = String.valueOf(new ComponentName(getPackageName(), getClass().getName()).flattenToShortString());
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        synchronized (this.zzbBV) {
            this.zzbBW = true;
            if (this.zzbBU == null) {
                throw new IllegalStateException("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()?");
            }
            this.zzbBU.getLooper().quit();
        }
        super.onDestroy();
    }

    public void onEntityUpdate(zzb com_google_android_gms_wearable_zzb) {
    }

    public void onInputClosed(Channel channel, int i, int i2) {
    }

    public void onMessageReceived(MessageEvent messageEvent) {
    }

    public void onNotificationReceived(zzd com_google_android_gms_wearable_zzd) {
    }

    public void onOutputClosed(Channel channel, int i, int i2) {
    }

    public void onPeerConnected(Node node) {
    }

    public void onPeerDisconnected(Node node) {
    }
}
