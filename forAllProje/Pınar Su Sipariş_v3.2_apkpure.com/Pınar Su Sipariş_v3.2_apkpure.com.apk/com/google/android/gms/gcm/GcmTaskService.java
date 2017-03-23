package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.gcm.zzb.zza;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service {
    public static final String SERVICE_ACTION_EXECUTE_TASK = "com.google.android.gms.gcm.ACTION_TASK_READY";
    public static final String SERVICE_ACTION_INITIALIZE = "com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE";
    public static final String SERVICE_PERMISSION = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set<String> zzaSS = new HashSet();
    private int zzaST;

    private class a extends Thread {
        final /* synthetic */ GcmTaskService a;
        private final String b;
        private final zzb c;
        private final Bundle d;

        a(GcmTaskService gcmTaskService, String str, IBinder iBinder, Bundle bundle) {
            this.a = gcmTaskService;
            super(String.valueOf(str).concat(" GCM Task"));
            this.b = str;
            this.c = zza.zzch(iBinder);
            this.d = bundle;
        }

        public void run() {
            Process.setThreadPriority(10);
            try {
                this.c.zzhG(this.a.onRunTask(new TaskParams(this.b, this.d)));
            } catch (RemoteException e) {
                String str = "GcmTaskService";
                String str2 = "Error reporting result of operation to scheduler for ";
                String valueOf = String.valueOf(this.b);
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } finally {
                this.a.zzez(this.b);
            }
        }
    }

    private void zzez(String str) {
        synchronized (this.zzaSS) {
            this.zzaSS.remove(str);
            if (this.zzaSS.size() == 0) {
                stopSelf(this.zzaST);
            }
        }
    }

    private void zzhF(int i) {
        synchronized (this.zzaSS) {
            this.zzaST = i;
            if (this.zzaSS.size() == 0) {
                stopSelf(this.zzaST);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onInitializeTasks() {
    }

    public abstract int onRunTask(TaskParams taskParams);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            zzhF(i2);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if (SERVICE_ACTION_EXECUTE_TASK.equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                    if (parcelableExtra == null || !(parcelableExtra instanceof PendingCallback)) {
                        String valueOf = String.valueOf(getPackageName());
                        Log.e("GcmTaskService", new StringBuilder((String.valueOf(valueOf).length() + 47) + String.valueOf(stringExtra).length()).append(valueOf).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    } else {
                        synchronized (this.zzaSS) {
                            this.zzaSS.add(stringExtra);
                        }
                        new a(this, stringExtra, ((PendingCallback) parcelableExtra).getIBinder(), bundle).start();
                    }
                } else if (SERVICE_ACTION_INITIALIZE.equals(action)) {
                    onInitializeTasks();
                } else {
                    Log.e("GcmTaskService", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
                zzhF(i2);
            } finally {
                zzhF(i2);
            }
        }
        return 2;
    }
}
