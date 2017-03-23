package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.zze;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.zzao.zza;
import com.google.android.gms.drive.internal.zzz;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service implements ChangeListener, CompletionListener, zzc, zzq {
    public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
    private final String mName;
    int zzaqn;
    private CountDownLatch zzawl;
    a zzawm;
    boolean zzawn;

    final class a extends Handler {
        final /* synthetic */ DriveEventService a;

        a(DriveEventService driveEventService) {
            this.a = driveEventService;
        }

        private Message a() {
            return obtainMessage(2);
        }

        private Message a(OnEventResponse onEventResponse) {
            return obtainMessage(1, onEventResponse);
        }

        public void handleMessage(Message message) {
            zzz.zzC("DriveEventService", "handleMessage message type:" + message.what);
            switch (message.what) {
                case 1:
                    this.a.zza((OnEventResponse) message.obj);
                    return;
                case 2:
                    getLooper().quit();
                    return;
                default:
                    zzz.zzD("DriveEventService", "Unexpected message type:" + message.what);
                    return;
            }
        }
    }

    final class b extends zza {
        final /* synthetic */ DriveEventService a;

        b(DriveEventService driveEventService) {
            this.a = driveEventService;
        }

        public void zzc(OnEventResponse onEventResponse) throws RemoteException {
            synchronized (this.a) {
                String valueOf = String.valueOf(onEventResponse);
                zzz.zzC("DriveEventService", new StringBuilder(String.valueOf(valueOf).length() + 9).append("onEvent: ").append(valueOf).toString());
                this.a.zzwe();
                if (this.a.zzawm != null) {
                    this.a.zzawm.sendMessage(this.a.zzawm.a(onEventResponse));
                } else {
                    zzz.zzE("DriveEventService", "Receiving event before initialize is completed.");
                }
            }
        }
    }

    protected DriveEventService() {
        this("DriveEventService");
    }

    protected DriveEventService(String str) {
        this.zzawn = false;
        this.zzaqn = -1;
        this.mName = str;
    }

    private void zza(OnEventResponse onEventResponse) {
        String valueOf;
        DriveEvent zzwy = onEventResponse.zzwy();
        String valueOf2 = String.valueOf(zzwy);
        zzz.zzC("DriveEventService", new StringBuilder(String.valueOf(valueOf2).length() + 20).append("handleEventMessage: ").append(valueOf2).toString());
        try {
            switch (zzwy.getType()) {
                case 1:
                    onChange((ChangeEvent) zzwy);
                    return;
                case 2:
                    onCompletion((CompletionEvent) zzwy);
                    return;
                case 4:
                    zza((ChangesAvailableEvent) zzwy);
                    return;
                case 7:
                    zza((TransferStateEvent) zzwy);
                    return;
                default:
                    String str = this.mName;
                    valueOf2 = String.valueOf(zzwy);
                    zzz.zzD(str, new StringBuilder(String.valueOf(valueOf2).length() + 17).append("Unhandled event: ").append(valueOf2).toString());
                    return;
            }
        } catch (Throwable e) {
            valueOf2 = this.mName;
            valueOf = String.valueOf(zzwy);
            zzz.zza(valueOf2, e, new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error handling event: ").append(valueOf).toString());
        }
        valueOf2 = this.mName;
        valueOf = String.valueOf(zzwy);
        zzz.zza(valueOf2, e, new StringBuilder(String.valueOf(valueOf).length() + 22).append("Error handling event: ").append(valueOf).toString());
    }

    private void zzwe() throws SecurityException {
        int callingUid = getCallingUid();
        if (callingUid != this.zzaqn) {
            if (zze.zze(this, callingUid)) {
                this.zzaqn = callingUid;
                return;
            }
            throw new SecurityException("Caller is not GooglePlayServices");
        }
    }

    protected int getCallingUid() {
        return Binder.getCallingUid();
    }

    public final synchronized IBinder onBind(Intent intent) {
        IBinder asBinder;
        if (ACTION_HANDLE_EVENT.equals(intent.getAction())) {
            if (this.zzawm == null && !this.zzawn) {
                this.zzawn = true;
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                this.zzawl = new CountDownLatch(1);
                new Thread(this) {
                    final /* synthetic */ DriveEventService b;

                    public void run() {
                        try {
                            Looper.prepare();
                            this.b.zzawm = new a(this.b);
                            this.b.zzawn = false;
                            countDownLatch.countDown();
                            zzz.zzC("DriveEventService", "Bound and starting loop");
                            Looper.loop();
                            zzz.zzC("DriveEventService", "Finished loop");
                        } finally {
                            if (this.b.zzawl != null) {
                                this.b.zzawl.countDown();
                            }
                        }
                    }
                }.start();
                try {
                    if (!countDownLatch.await(5000, TimeUnit.MILLISECONDS)) {
                        zzz.zzE("DriveEventService", "Failed to synchronously initialize event handler.");
                    }
                } catch (Throwable e) {
                    throw new RuntimeException("Unable to start event handler", e);
                }
            }
            asBinder = new b(this).asBinder();
        } else {
            asBinder = null;
        }
        return asBinder;
    }

    public void onChange(ChangeEvent changeEvent) {
        String str = this.mName;
        String valueOf = String.valueOf(changeEvent);
        zzz.zzD(str, new StringBuilder(String.valueOf(valueOf).length() + 24).append("Unhandled change event: ").append(valueOf).toString());
    }

    public void onCompletion(CompletionEvent completionEvent) {
        String str = this.mName;
        String valueOf = String.valueOf(completionEvent);
        zzz.zzD(str, new StringBuilder(String.valueOf(valueOf).length() + 28).append("Unhandled completion event: ").append(valueOf).toString());
    }

    public synchronized void onDestroy() {
        zzz.zzC("DriveEventService", "onDestroy");
        if (this.zzawm != null) {
            this.zzawm.sendMessage(this.zzawm.a());
            this.zzawm = null;
            try {
                if (!this.zzawl.await(5000, TimeUnit.MILLISECONDS)) {
                    zzz.zzD("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
                }
            } catch (InterruptedException e) {
            }
            this.zzawl = null;
        }
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        return true;
    }

    public void zza(ChangesAvailableEvent changesAvailableEvent) {
        String str = this.mName;
        String valueOf = String.valueOf(changesAvailableEvent);
        zzz.zzD(str, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Unhandled changes available event: ").append(valueOf).toString());
    }

    public void zza(TransferStateEvent transferStateEvent) {
        String str = this.mName;
        String valueOf = String.valueOf(transferStateEvent);
        zzz.zzD(str, new StringBuilder(String.valueOf(valueOf).length() + 32).append("Unhandled transfer state event: ").append(valueOf).toString());
    }
}
