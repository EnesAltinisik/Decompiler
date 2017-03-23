package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.zzc;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GoogleCloudMessaging {
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    public static final String INSTANCE_ID_SCOPE = "GCM";
    @Deprecated
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    @Deprecated
    public static final String MESSAGE_TYPE_MESSAGE = "gcm";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    @Deprecated
    public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
    public static int zzaSW = 5000000;
    public static int zzaSX = 6500000;
    public static int zzaSY = 7000000;
    static GoogleCloudMessaging zzaSZ;
    private static final AtomicInteger zzaTc = new AtomicInteger(1);
    private PendingIntent zzaTa;
    private Map<String, Handler> zzaTb = Collections.synchronizedMap(new HashMap());
    private final BlockingQueue<Intent> zzaTd = new LinkedBlockingQueue();
    final Messenger zzaTe = new Messenger(new Handler(this, Looper.getMainLooper()) {
        final /* synthetic */ GoogleCloudMessaging a;

        public void handleMessage(Message message) {
            if (message == null || !(message.obj instanceof Intent)) {
                Log.w(GoogleCloudMessaging.INSTANCE_ID_SCOPE, "Dropping invalid message");
            }
            Intent intent = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent.getAction())) {
                this.a.zzaTd.add(intent);
            } else if (!this.a.zzp(intent)) {
                intent.setPackage(this.a.zzov.getPackageName());
                this.a.zzov.sendBroadcast(intent);
            }
        }
    });
    private Context zzov;

    public static synchronized GoogleCloudMessaging getInstance(Context context) {
        GoogleCloudMessaging googleCloudMessaging;
        synchronized (GoogleCloudMessaging.class) {
            if (zzaSZ == null) {
                zzaSZ = new GoogleCloudMessaging();
                zzaSZ.zzov = context.getApplicationContext();
            }
            googleCloudMessaging = zzaSZ;
        }
        return googleCloudMessaging;
    }

    private String zzBO() {
        String valueOf = String.valueOf("google.rpc");
        String valueOf2 = String.valueOf(String.valueOf(zzaTc.getAndIncrement()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    static String zza(Intent intent, String str) throws IOException {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null) {
            return stringExtra;
        }
        stringExtra = intent.getStringExtra("error");
        if (stringExtra != null) {
            throw new IOException(stringExtra);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    private void zza(String str, String str2, long j, int i, Bundle bundle) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent("com.google.android.gcm.intent.SEND");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        zzq(intent);
        intent.setPackage(zzaS(this.zzov));
        intent.putExtra("google.to", str);
        intent.putExtra("google.message_id", str2);
        intent.putExtra("google.ttl", Long.toString(j));
        intent.putExtra("google.delay", Integer.toString(i));
        intent.putExtra("google.from", zzeA(str));
        if (zzaS(this.zzov).contains(".gsf")) {
            Bundle bundle2 = new Bundle();
            for (String str3 : bundle.keySet()) {
                String str32;
                Object obj = bundle.get(str32);
                if (obj instanceof String) {
                    String str4 = "gcm.";
                    str32 = String.valueOf(str32);
                    bundle2.putString(str32.length() != 0 ? str4.concat(str32) : new String(str4), (String) obj);
                }
            }
            bundle2.putString("google.to", str);
            bundle2.putString("google.message_id", str2);
            InstanceID.getInstance(this.zzov).zzc(INSTANCE_ID_SCOPE, "upstream", bundle2);
            return;
        }
        this.zzov.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public static String zzaS(Context context) {
        return zzc.zzaX(context);
    }

    public static int zzaT(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzaS(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    private String zzeA(String str) {
        int indexOf = str.indexOf(64);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return InstanceID.getInstance(this.zzov).zzCf().zzi("", str, INSTANCE_ID_SCOPE);
    }

    private boolean zzp(Intent intent) {
        Object stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra != null) {
            Handler handler = (Handler) this.zzaTb.remove(stringExtra);
            if (handler != null) {
                Message obtain = Message.obtain();
                obtain.obj = intent;
                return handler.sendMessage(obtain);
            }
        }
        return false;
    }

    public void close() {
        zzaSZ = null;
        a.a = null;
        zzBP();
    }

    public String getMessageType(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? MESSAGE_TYPE_MESSAGE : stringExtra;
    }

    @Deprecated
    public synchronized String register(String... strArr) throws IOException {
        String zze;
        zze = zze(strArr);
        Bundle bundle = new Bundle();
        if (zzaS(this.zzov).contains(".gsf")) {
            bundle.putString("legacy.sender", zze);
            zze = InstanceID.getInstance(this.zzov).getToken(zze, INSTANCE_ID_SCOPE, bundle);
        } else {
            bundle.putString("sender", zze);
            zze = zza(zzF(bundle), "registration_id");
        }
        return zze;
    }

    public void send(String str, String str2, long j, Bundle bundle) throws IOException {
        zza(str, str2, j, -1, bundle);
    }

    public void send(String str, String str2, Bundle bundle) throws IOException {
        send(str, str2, -1, bundle);
    }

    @Deprecated
    public synchronized void unregister() throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        InstanceID.getInstance(this.zzov).deleteInstanceID();
    }

    synchronized void zzBP() {
        if (this.zzaTa != null) {
            this.zzaTa.cancel();
            this.zzaTa = null;
        }
    }

    @Deprecated
    Intent zzF(Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        } else if (zzaT(this.zzov) < 0) {
            throw new IOException("Google Play Services missing");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(zzaS(this.zzov));
            zzq(intent);
            intent.putExtra("google.message_id", zzBO());
            intent.putExtras(bundle);
            intent.putExtra("google.messenger", this.zzaTe);
            this.zzov.startService(intent);
            try {
                return (Intent) this.zzaTd.poll(30000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    String zze(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder = new StringBuilder(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            stringBuilder.append(',').append(strArr[i]);
        }
        return stringBuilder.toString();
    }

    synchronized void zzq(Intent intent) {
        if (this.zzaTa == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzaTa = PendingIntent.getBroadcast(this.zzov, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzaTa);
    }
}
