package com.google.android.gms.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class zzc {
    static String zzaUq = null;
    static int zzaUr = 0;
    static int zzaUs = 0;
    static int zzaUt = 0;
    PendingIntent zzaTa;
    Messenger zzaTe;
    int zzaUA;
    long zzaUB;
    Map<String, Object> zzaUu = new HashMap();
    Messenger zzaUv;
    MessengerCompat zzaUw;
    long zzaUx;
    long zzaUy;
    int zzaUz;
    Context zzov;

    public zzc(Context context) {
        this.zzov = context;
    }

    public static synchronized String zzCj() {
        String num;
        synchronized (zzc.class) {
            int i = zzaUt;
            zzaUt = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private void zzF(Object obj) {
        synchronized (getClass()) {
            for (String str : this.zzaUu.keySet()) {
                Object obj2 = this.zzaUu.get(str);
                this.zzaUu.put(str, obj);
                zzh(obj2, obj);
            }
        }
    }

    static String zza(KeyPair keyPair, String... strArr) {
        String str = null;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes(Constants.ENCODING);
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                str = InstanceID.zzp(instance.sign());
            } catch (Throwable e) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e);
            }
        } catch (Throwable e2) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e2);
        }
        return str;
    }

    public static String zzaX(Context context) {
        ApplicationInfo applicationInfo;
        if (zzaUq != null) {
            return zzaUq;
        }
        zzaUr = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                try {
                    ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                    Log.w("InstanceID/Rpc", "Found " + applicationInfo2.uid);
                    zzaUs = applicationInfo2.uid;
                    zzaUq = resolveInfo.serviceInfo.packageName;
                    return zzaUq;
                } catch (NameNotFoundException e) {
                }
            } else {
                String valueOf = String.valueOf(resolveInfo.serviceInfo.packageName);
                String valueOf2 = String.valueOf("com.google.android.c2dm.intent.REGISTER");
                Log.w("InstanceID/Rpc", new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length()).append("Possible malicious package ").append(valueOf).append(" declares ").append(valueOf2).append(" without permission").toString());
            }
        }
        Log.w("InstanceID/Rpc", "Failed to resolve REGISTER intent, falling back");
        try {
            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
            zzaUq = applicationInfo.packageName;
            zzaUs = applicationInfo.uid;
            return zzaUq;
        } catch (NameNotFoundException e2) {
            try {
                applicationInfo = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                zzaUq = applicationInfo.packageName;
                zzaUs = applicationInfo.uid;
                return zzaUq;
            } catch (NameNotFoundException e3) {
                Log.w("InstanceID/Rpc", "Both Google Play Services and legacy GSF package are missing");
                return null;
            }
        }
    }

    private static int zzaY(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(zzaX(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    private Intent zzb(Bundle bundle, KeyPair keyPair) throws IOException {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String zzCj = zzCj();
        synchronized (getClass()) {
            this.zzaUu.put(zzCj, conditionVariable);
        }
        zza(bundle, keyPair, zzCj);
        conditionVariable.block(30000);
        synchronized (getClass()) {
            Object remove = this.zzaUu.remove(zzCj);
            if (remove instanceof Intent) {
                intent = (Intent) remove;
            } else if (remove instanceof String) {
                throw new IOException((String) remove);
            } else {
                String valueOf = String.valueOf(remove);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 12).append("No response ").append(valueOf).toString());
                throw new IOException(InstanceID.ERROR_TIMEOUT);
            }
        }
        return intent;
    }

    private void zzeB(String str) {
        if ("com.google.android.gsf".equals(zzaUq)) {
            this.zzaUz++;
            if (this.zzaUz >= 3) {
                if (this.zzaUz == 3) {
                    this.zzaUA = new Random().nextInt(1000) + 1000;
                }
                this.zzaUA *= 2;
                this.zzaUB = SystemClock.elapsedRealtime() + ((long) this.zzaUA);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(str).length() + 31).append("Backoff due to ").append(str).append(" for ").append(this.zzaUA).toString());
            }
        }
    }

    private void zzh(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf).toString());
            }
        }
    }

    private void zzi(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.zzaUu.get(str);
            this.zzaUu.put(str, obj);
            zzh(obj2, obj);
        }
    }

    void zzCi() {
        if (this.zzaTe == null) {
            zzaX(this.zzov);
            this.zzaTe = new Messenger(new Handler(this, Looper.getMainLooper()) {
                final /* synthetic */ zzc a;

                public void handleMessage(Message message) {
                    this.a.zze(message);
                }
            });
        }
    }

    Intent zza(Bundle bundle, KeyPair keyPair) throws IOException {
        Intent zzb = zzb(bundle, keyPair);
        return (zzb == null || !zzb.hasExtra("google.messenger")) ? zzb : zzb(bundle, keyPair);
    }

    void zza(Bundle bundle, KeyPair keyPair, String str) throws IOException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzaUB == 0 || elapsedRealtime > this.zzaUB) {
            zzCi();
            if (zzaUq == null) {
                throw new IOException(InstanceID.ERROR_MISSING_INSTANCEID_SERVICE);
            }
            this.zzaUx = SystemClock.elapsedRealtime();
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(zzaUq);
            bundle.putString("gmsv", Integer.toString(zzaY(this.zzov)));
            bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(InstanceID.zzaU(this.zzov)));
            bundle.putString("app_ver_name", InstanceID.zzaV(this.zzov));
            bundle.putString("cliv", "1");
            bundle.putString("appid", InstanceID.zza(keyPair));
            bundle.putString("pub2", InstanceID.zzp(keyPair.getPublic().getEncoded()));
            bundle.putString("sig", zza(keyPair, this.zzov.getPackageName(), r1));
            intent.putExtras(bundle);
            zzr(intent);
            zzb(intent, str);
            return;
        }
        elapsedRealtime = this.zzaUB - elapsedRealtime;
        Log.w("InstanceID/Rpc", "Backoff mode, next request attempt: " + elapsedRealtime + " interval: " + this.zzaUA);
        throw new IOException(InstanceID.ERROR_BACKOFF);
    }

    protected void zzb(Intent intent, String str) {
        this.zzaUx = SystemClock.elapsedRealtime();
        intent.putExtra("kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        intent.putExtra("X-kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        boolean equals = "com.google.android.gsf".equals(zzaUq);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            equals = "1".equals(stringExtra);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.d("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 8).append("Sending ").append(valueOf).toString());
        }
        if (this.zzaUv != null) {
            intent.putExtra("google.messenger", this.zzaTe);
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                this.zzaUv.send(obtain);
                return;
            } catch (RemoteException e) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        if (equals) {
            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
            intent2.setPackage(this.zzov.getPackageName());
            intent2.putExtra("GSF", intent);
            this.zzov.startService(intent2);
            return;
        }
        intent.putExtra("google.messenger", this.zzaTe);
        intent.putExtra("messenger2", "1");
        if (this.zzaUw != null) {
            Message obtain2 = Message.obtain();
            obtain2.obj = intent;
            try {
                this.zzaUw.send(obtain2);
                return;
            } catch (RemoteException e2) {
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    Log.d("InstanceID/Rpc", "Messenger failed, fallback to startService");
                }
            }
        }
        this.zzov.startService(intent);
    }

    public void zze(Message message) {
        if (message != null) {
            if (message.obj instanceof Intent) {
                Intent intent = (Intent) message.obj;
                intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof MessengerCompat) {
                        this.zzaUw = (MessengerCompat) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.zzaUv = (Messenger) parcelableExtra;
                    }
                }
                zzu((Intent) message.obj);
                return;
            }
            Log.w("InstanceID/Rpc", "Dropping invalid message");
        }
    }

    synchronized void zzr(Intent intent) {
        if (this.zzaTa == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.zzaTa = PendingIntent.getBroadcast(this.zzov, 0, intent2, 0);
        }
        intent.putExtra("app", this.zzaTa);
    }

    String zzs(Intent intent) throws IOException {
        if (intent == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String stringExtra = intent.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("unregistered");
        }
        intent.getLongExtra("Retry-After", 0);
        String valueOf;
        if (stringExtra != null) {
            if (stringExtra == null) {
                return stringExtra;
            }
            stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                throw new IOException(stringExtra);
            }
            valueOf = String.valueOf(intent.getExtras());
            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } else if (stringExtra == null) {
            return stringExtra;
        } else {
            stringExtra = intent.getStringExtra("error");
            if (stringExtra == null) {
                valueOf = String.valueOf(intent.getExtras());
                Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 29).append("Unexpected response from GCM ").append(valueOf).toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException(stringExtra);
        }
    }

    void zzt(Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            Log.w("InstanceID/Rpc", new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf).toString());
            return;
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            valueOf = "InstanceID/Rpc";
            String str = "Received InstanceID error ";
            String valueOf2 = String.valueOf(stringExtra);
            Log.d(valueOf, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (!"ID".equals(split[1])) {
                String str2 = "InstanceID/Rpc";
                String str3 = "Unexpected structured response ";
                valueOf2 = String.valueOf(stringExtra);
                Log.w(str2, valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
            }
            if (split.length > 2) {
                valueOf2 = split[2];
                valueOf = split[3];
                if (valueOf.startsWith(":")) {
                    valueOf = valueOf.substring(1);
                }
            } else {
                valueOf = "UNKNOWN";
                valueOf2 = null;
            }
            intent.putExtra("error", valueOf);
        } else {
            valueOf2 = null;
            valueOf = stringExtra;
        }
        if (valueOf2 == null) {
            zzF(valueOf);
        } else {
            zzi(valueOf2, valueOf);
        }
        long longExtra = intent.getLongExtra("Retry-After", 0);
        if (longExtra > 0) {
            this.zzaUy = SystemClock.elapsedRealtime();
            this.zzaUA = ((int) longExtra) * 1000;
            this.zzaUB = SystemClock.elapsedRealtime() + ((long) this.zzaUA);
            Log.w("InstanceID/Rpc", "Explicit request from server to backoff: " + this.zzaUA);
        } else if ("SERVICE_NOT_AVAILABLE".equals(valueOf) || "AUTHENTICATION_FAILED".equals(valueOf)) {
            zzeB(valueOf);
        }
    }

    public void zzu(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra;
            String valueOf;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                action = intent.getStringExtra("registration_id");
                stringExtra = action == null ? intent.getStringExtra("unregistered") : action;
                if (stringExtra == null) {
                    zzt(intent);
                    return;
                }
                this.zzaUx = SystemClock.elapsedRealtime();
                this.zzaUB = 0;
                this.zzaUz = 0;
                this.zzaUA = 0;
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    valueOf = String.valueOf(intent.getExtras());
                    Log.d("InstanceID/Rpc", new StringBuilder((String.valueOf(stringExtra).length() + 16) + String.valueOf(valueOf).length()).append("AppIDResponse: ").append(stringExtra).append(" ").append(valueOf).toString());
                }
                action = null;
                if (stringExtra.startsWith("|")) {
                    String[] split = stringExtra.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String str = "InstanceID/Rpc";
                        String str2 = "Unexpected structured response ";
                        action = String.valueOf(stringExtra);
                        Log.w(str, action.length() != 0 ? str2.concat(action) : new String(str2));
                    }
                    stringExtra = split[2];
                    if (split.length > 4) {
                        if ("SYNC".equals(split[3])) {
                            InstanceIDListenerService.zzaW(this.zzov);
                        } else if ("RST".equals(split[3])) {
                            InstanceIDListenerService.zza(this.zzov, InstanceID.getInstance(this.zzov).zzCf());
                            intent.removeExtra("registration_id");
                            zzi(stringExtra, intent);
                            return;
                        }
                    }
                    action = split[split.length - 1];
                    if (action.startsWith(":")) {
                        action = action.substring(1);
                    }
                    intent.putExtra("registration_id", action);
                    action = stringExtra;
                }
                if (action == null) {
                    zzF(intent);
                } else {
                    zzi(action, intent);
                }
            } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
                stringExtra = "InstanceID/Rpc";
                valueOf = "Unexpected response ";
                action = String.valueOf(intent.getAction());
                Log.d(stringExtra, action.length() != 0 ? valueOf.concat(action) : new String(valueOf));
            }
        } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
            Log.d("InstanceID/Rpc", "Unexpected response: null");
        }
    }
}
