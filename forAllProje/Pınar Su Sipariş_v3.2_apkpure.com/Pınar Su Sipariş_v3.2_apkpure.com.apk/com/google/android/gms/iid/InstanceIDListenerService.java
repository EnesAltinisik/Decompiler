package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.support.v4.b.p;
import android.util.Log;

public class InstanceIDListenerService extends Service {
    static String ACTION = "action";
    private static String zzaSR = "gcm.googleapis.com/refresh";
    private static String zzaUi = "google.com/iid";
    private static String zzaUj = "CMD";
    MessengerCompat zzaUg = new MessengerCompat(new Handler(this, Looper.getMainLooper()) {
        final /* synthetic */ InstanceIDListenerService a;

        public void handleMessage(Message message) {
            this.a.zza(message, MessengerCompat.zzc(message));
        }
    });
    BroadcastReceiver zzaUh = new BroadcastReceiver(this) {
        final /* synthetic */ InstanceIDListenerService a;

        {
            this.a = r1;
        }

        public void onReceive(Context context, Intent intent) {
            if (Log.isLoggable("InstanceID", 3)) {
                intent.getStringExtra("registration_id");
                String valueOf = String.valueOf(intent.getExtras());
                Log.d("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 46).append("Received GSF callback using dynamic receiver: ").append(valueOf).toString());
            }
            this.a.zzn(intent);
            this.a.stop();
        }
    };
    int zzaUk;
    int zzaUl;

    static void zza(Context context, zzd com_google_android_gms_iid_zzd) {
        com_google_android_gms_iid_zzd.zzCk();
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.putExtra(zzaUj, "RST");
        intent.setPackage(context.getPackageName());
        context.startService(intent);
    }

    private void zza(Message message, int i) {
        zzc.zzaX(this);
        getPackageManager();
        if (i == zzc.zzaUs || i == zzc.zzaUr) {
            zzn((Intent) message.obj);
            return;
        }
        int i2 = zzc.zzaUr;
        Log.w("InstanceID", "Message from unexpected caller " + i + " mine=" + i2 + " appid=" + zzc.zzaUs);
    }

    static void zzaW(Context context) {
        Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
        intent.setPackage(context.getPackageName());
        intent.putExtra(zzaUj, "SYNC");
        context.startService(intent);
    }

    public IBinder onBind(Intent intent) {
        return (intent == null || !"com.google.android.gms.iid.InstanceID".equals(intent.getAction())) ? null : this.zzaUg.getBinder();
    }

    public void onCreate() {
        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
        intentFilter.addCategory(getPackageName());
        registerReceiver(this.zzaUh, intentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
    }

    public void onDestroy() {
        unregisterReceiver(this.zzaUh);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        zzhN(i2);
        if (intent == null) {
            stop();
            return 2;
        }
        try {
            if ("com.google.android.gms.iid.InstanceID".equals(intent.getAction())) {
                if (VERSION.SDK_INT <= 18) {
                    Intent intent2 = (Intent) intent.getParcelableExtra("GSF");
                    if (intent2 != null) {
                        startService(intent2);
                        return 1;
                    }
                }
                zzn(intent);
            }
            stop();
            if (intent.getStringExtra("from") != null) {
                p.completeWakefulIntent(intent);
            }
            return 2;
        } finally {
            stop();
        }
    }

    public void onTokenRefresh() {
    }

    void stop() {
        synchronized (this) {
            this.zzaUk--;
            if (this.zzaUk == 0) {
                stopSelf(this.zzaUl);
            }
            if (Log.isLoggable("InstanceID", 3)) {
                int i = this.zzaUk;
                Log.d("InstanceID", "Stop " + i + " " + this.zzaUl);
            }
        }
    }

    public void zzas(boolean z) {
        onTokenRefresh();
    }

    void zzhN(int i) {
        synchronized (this) {
            this.zzaUk++;
            if (i > this.zzaUl) {
                this.zzaUl = i;
            }
        }
    }

    public void zzn(Intent intent) {
        InstanceID instance;
        String stringExtra = intent.getStringExtra("subtype");
        if (stringExtra == null) {
            instance = InstanceID.getInstance(this);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("subtype", stringExtra);
            instance = InstanceID.zza(this, bundle);
        }
        String stringExtra2 = intent.getStringExtra(zzaUj);
        if (intent.getStringExtra("error") == null && intent.getStringExtra("registration_id") == null) {
            if (Log.isLoggable("InstanceID", 3)) {
                String valueOf = String.valueOf(intent.getExtras());
                Log.d("InstanceID", new StringBuilder(((String.valueOf(stringExtra).length() + 18) + String.valueOf(stringExtra2).length()) + String.valueOf(valueOf).length()).append("Service command ").append(stringExtra).append(" ").append(stringExtra2).append(" ").append(valueOf).toString());
            }
            if (intent.getStringExtra("unregistered") != null) {
                zzd zzCf = instance.zzCf();
                if (stringExtra == null) {
                    stringExtra = "";
                }
                zzCf.zzeG(stringExtra);
                instance.zzCg().zzu(intent);
                return;
            } else if (zzaSR.equals(intent.getStringExtra("from"))) {
                instance.zzCf().zzeG(stringExtra);
                zzas(false);
                return;
            } else if ("RST".equals(stringExtra2)) {
                instance.zzCe();
                zzas(true);
                return;
            } else if ("RST_FULL".equals(stringExtra2)) {
                if (!instance.zzCf().isEmpty()) {
                    instance.zzCf().zzCk();
                    zzas(true);
                    return;
                }
                return;
            } else if ("SYNC".equals(stringExtra2)) {
                instance.zzCf().zzeG(stringExtra);
                zzas(false);
                return;
            } else if (!"PING".equals(stringExtra2)) {
                return;
            } else {
                return;
            }
        }
        if (Log.isLoggable("InstanceID", 3)) {
            stringExtra2 = "InstanceID";
            String str = "Register result in service ";
            stringExtra = String.valueOf(stringExtra);
            Log.d(stringExtra2, stringExtra.length() != 0 ? str.concat(stringExtra) : new String(str));
        }
        instance.zzCg().zzu(intent);
    }
}
