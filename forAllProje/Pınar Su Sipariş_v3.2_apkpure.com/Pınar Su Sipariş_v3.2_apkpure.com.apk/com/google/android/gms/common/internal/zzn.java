package com.google.android.gms.common.internal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

final class zzn extends zzm implements Callback {
    private final HashMap<a, zzb> a = new HashMap();
    private final Context b;
    private final Handler c;
    private final com.google.android.gms.common.stats.zzb d;
    private final long e;

    private static final class a {
        private final String a;
        private final String b;
        private final ComponentName c;

        public a(ComponentName componentName) {
            this.a = null;
            this.b = null;
            this.c = (ComponentName) zzaa.zzz(componentName);
        }

        public a(String str, String str2) {
            this.a = zzaa.zzdl(str);
            this.b = zzaa.zzdl(str2);
            this.c = null;
        }

        public Intent a() {
            return this.a != null ? new Intent(this.a).setPackage(this.b) : new Intent().setComponent(this.c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zzz.equal(this.a, aVar.a) && zzz.equal(this.c, aVar.c);
        }

        public int hashCode() {
            return zzz.hashCode(this.a, this.c);
        }

        public String toString() {
            return this.a == null ? this.c.flattenToString() : this.a;
        }
    }

    private final class zzb {
        final /* synthetic */ zzn a;
        private final zza b = new zza(this);
        private final Set<ServiceConnection> c = new HashSet();
        private int d = 2;
        private boolean e;
        private IBinder f;
        private final a g;
        private ComponentName h;

        public class zza implements ServiceConnection {
            final /* synthetic */ zzb zzasb;

            public zza(zzb com_google_android_gms_common_internal_zzn_zzb) {
                this.zzasb = com_google_android_gms_common_internal_zzn_zzb;
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                synchronized (this.zzasb.a.a) {
                    this.zzasb.f = iBinder;
                    this.zzasb.h = componentName;
                    for (ServiceConnection onServiceConnected : this.zzasb.c) {
                        onServiceConnected.onServiceConnected(componentName, iBinder);
                    }
                    this.zzasb.d = 1;
                }
            }

            public void onServiceDisconnected(ComponentName componentName) {
                synchronized (this.zzasb.a.a) {
                    this.zzasb.f = null;
                    this.zzasb.h = componentName;
                    for (ServiceConnection onServiceDisconnected : this.zzasb.c) {
                        onServiceDisconnected.onServiceDisconnected(componentName);
                    }
                    this.zzasb.d = 2;
                }
            }
        }

        public zzb(zzn com_google_android_gms_common_internal_zzn, a aVar) {
            this.a = com_google_android_gms_common_internal_zzn;
            this.g = aVar;
        }

        public void a(ServiceConnection serviceConnection, String str) {
            this.a.d.zza(this.a.b, serviceConnection, str, this.g.a());
            this.c.add(serviceConnection);
        }

        @TargetApi(14)
        public void a(String str) {
            this.d = 3;
            this.e = this.a.d.zza(this.a.b, str, this.g.a(), this.b, 129);
            if (!this.e) {
                this.d = 2;
                try {
                    this.a.d.zza(this.a.b, this.b);
                } catch (IllegalArgumentException e) {
                }
            }
        }

        public boolean a() {
            return this.e;
        }

        public boolean a(ServiceConnection serviceConnection) {
            return this.c.contains(serviceConnection);
        }

        public int b() {
            return this.d;
        }

        public void b(ServiceConnection serviceConnection, String str) {
            this.a.d.zzb(this.a.b, serviceConnection);
            this.c.remove(serviceConnection);
        }

        public void b(String str) {
            this.a.d.zza(this.a.b, this.b);
            this.e = false;
            this.d = 2;
        }

        public boolean c() {
            return this.c.isEmpty();
        }

        public IBinder d() {
            return this.f;
        }

        public ComponentName e() {
            return this.h;
        }
    }

    zzn(Context context) {
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = com.google.android.gms.common.stats.zzb.zzuH();
        this.e = 5000;
    }

    private boolean a(a aVar, ServiceConnection serviceConnection, String str) {
        boolean a;
        zzaa.zzb((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            zzb com_google_android_gms_common_internal_zzn_zzb = (zzb) this.a.get(aVar);
            if (com_google_android_gms_common_internal_zzn_zzb != null) {
                this.c.removeMessages(0, com_google_android_gms_common_internal_zzn_zzb);
                if (!com_google_android_gms_common_internal_zzn_zzb.a(serviceConnection)) {
                    com_google_android_gms_common_internal_zzn_zzb.a(serviceConnection, str);
                    switch (com_google_android_gms_common_internal_zzn_zzb.b()) {
                        case 1:
                            serviceConnection.onServiceConnected(com_google_android_gms_common_internal_zzn_zzb.e(), com_google_android_gms_common_internal_zzn_zzb.d());
                            break;
                        case 2:
                            com_google_android_gms_common_internal_zzn_zzb.a(str);
                            break;
                        default:
                            break;
                    }
                }
                String valueOf = String.valueOf(aVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(valueOf).toString());
            }
            com_google_android_gms_common_internal_zzn_zzb = new zzb(this, aVar);
            com_google_android_gms_common_internal_zzn_zzb.a(serviceConnection, str);
            com_google_android_gms_common_internal_zzn_zzb.a(str);
            this.a.put(aVar, com_google_android_gms_common_internal_zzn_zzb);
            a = com_google_android_gms_common_internal_zzn_zzb.a();
        }
        return a;
    }

    private void b(a aVar, ServiceConnection serviceConnection, String str) {
        zzaa.zzb((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            zzb com_google_android_gms_common_internal_zzn_zzb = (zzb) this.a.get(aVar);
            String valueOf;
            if (com_google_android_gms_common_internal_zzn_zzb == null) {
                valueOf = String.valueOf(aVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 50).append("Nonexistent connection status for service config: ").append(valueOf).toString());
            } else if (com_google_android_gms_common_internal_zzn_zzb.a(serviceConnection)) {
                com_google_android_gms_common_internal_zzn_zzb.b(serviceConnection, str);
                if (com_google_android_gms_common_internal_zzn_zzb.c()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, com_google_android_gms_common_internal_zzn_zzb), this.e);
                }
            } else {
                valueOf = String.valueOf(aVar);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 76).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(valueOf).toString());
            }
        }
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                zzb com_google_android_gms_common_internal_zzn_zzb = (zzb) message.obj;
                synchronized (this.a) {
                    if (com_google_android_gms_common_internal_zzn_zzb.c()) {
                        if (com_google_android_gms_common_internal_zzn_zzb.a()) {
                            com_google_android_gms_common_internal_zzn_zzb.b("GmsClientSupervisor");
                        }
                        this.a.remove(com_google_android_gms_common_internal_zzn_zzb.g);
                    }
                }
                return true;
            default:
                return false;
        }
    }

    public boolean zza(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return a(new a(componentName), serviceConnection, str);
    }

    public boolean zza(String str, String str2, ServiceConnection serviceConnection, String str3) {
        return a(new a(str, str2), serviceConnection, str3);
    }

    public void zzb(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        b(new a(componentName), serviceConnection, str);
    }

    public void zzb(String str, String str2, ServiceConnection serviceConnection, String str3) {
        b(new a(str, str2), serviceConnection, str3);
    }
}
