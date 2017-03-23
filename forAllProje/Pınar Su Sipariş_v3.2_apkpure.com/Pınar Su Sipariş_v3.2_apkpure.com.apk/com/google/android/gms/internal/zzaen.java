package com.google.android.gms.internal;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class zzaen {
    private static long a = 0;
    private a b;
    private boolean c = false;
    private boolean d = false;
    private long e = 0;
    private zzaep f;
    private zza g;
    private ScheduledFuture<?> h;
    private ScheduledFuture<?> i;
    private final zzaef j;
    private final ScheduledExecutorService k;
    private final zzahf l;

    public interface zza {
        void zzaM(boolean z);

        void zzap(Map<String, Object> map);
    }

    private interface a {
        void a();

        void a(String str);

        void b();
    }

    private class b implements a, zzaif {
        final /* synthetic */ zzaen a;
        private zzaie b;

        private b(zzaen com_google_android_gms_internal_zzaen, zzaie com_google_android_gms_internal_zzaie) {
            this.a = com_google_android_gms_internal_zzaen;
            this.b = com_google_android_gms_internal_zzaie;
            this.b.zza((zzaif) this);
        }

        private void c() {
            this.b.close();
            try {
                this.b.zzTW();
            } catch (Throwable e) {
                this.a.l.zze("Interrupted while shutting down websocket threads", e);
            }
        }

        public void a() {
            try {
                this.b.connect();
            } catch (Throwable e) {
                if (this.a.l.zzTe()) {
                    this.a.l.zza("Error connecting", e, new Object[0]);
                }
                c();
            }
        }

        public void a(String str) {
            this.b.zzhZ(str);
        }

        public void b() {
            this.b.close();
        }

        public void onClose() {
            String str = "closed";
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void run() {
                    if (this.a.a.l.zzTe()) {
                        this.a.a.l.zzh("closed", new Object[0]);
                    }
                    this.a.a.g();
                }
            });
        }

        public void zzQC() {
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ b a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.a.i.cancel(false);
                    this.a.a.c = true;
                    if (this.a.a.l.zzTe()) {
                        this.a.a.l.zzh("websocket opened", new Object[0]);
                    }
                    this.a.a.d();
                }
            });
        }

        public void zza(final zzaig com_google_android_gms_internal_zzaig) {
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ b b;

                public void run() {
                    String str = "had an error";
                    if (this.b.a.l.zzTe()) {
                        this.b.a.l.zza(str, com_google_android_gms_internal_zzaig, new Object[0]);
                    }
                    if (com_google_android_gms_internal_zzaig.getMessage().startsWith("unknown host")) {
                        if (this.b.a.l.zzTe()) {
                            this.b.a.l.zzh("If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?", new Object[0]);
                        }
                    } else if (this.b.a.l.zzTe()) {
                        zzahf b = this.b.a.l;
                        String valueOf = String.valueOf(com_google_android_gms_internal_zzaig.getMessage());
                        b.zzh(new StringBuilder(String.valueOf(valueOf).length() + 2).append("|").append(valueOf).append("|").toString(), new Object[0]);
                    }
                    this.b.a.g();
                }
            });
        }

        public void zza(zzaii com_google_android_gms_internal_zzaii) {
            final String text = com_google_android_gms_internal_zzaii.getText();
            if (this.a.l.zzTe()) {
                zzahf b = this.a.l;
                String str = "ws message: ";
                String valueOf = String.valueOf(text);
                b.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            this.a.k.execute(new Runnable(this) {
                final /* synthetic */ b b;

                public void run() {
                    this.b.a.c(text);
                }
            });
        }
    }

    public zzaen(zzaef com_google_android_gms_internal_zzaef, zzaeh com_google_android_gms_internal_zzaeh, String str, zza com_google_android_gms_internal_zzaen_zza, String str2) {
        this.j = com_google_android_gms_internal_zzaef;
        this.k = com_google_android_gms_internal_zzaef.zzPV();
        this.g = com_google_android_gms_internal_zzaen_zza;
        long j = a;
        a = 1 + j;
        this.l = new zzahf(com_google_android_gms_internal_zzaef.zzPT(), "WebSocket", "ws_" + j);
        this.b = a(com_google_android_gms_internal_zzaeh, str, str2);
    }

    private a a(zzaeh com_google_android_gms_internal_zzaeh, String str, String str2) {
        if (str == null) {
            str = com_google_android_gms_internal_zzaeh.getHost();
        }
        URI zza = zzaeh.zza(str, com_google_android_gms_internal_zzaeh.isSecure(), com_google_android_gms_internal_zzaeh.getNamespace(), str2);
        Map hashMap = new HashMap();
        hashMap.put(a.a.a.a.a.b.a.HEADER_USER_AGENT, this.j.zziJ());
        return new b(new zzaie(zza, null, hashMap));
    }

    private void a(int i) {
        this.e = (long) i;
        this.f = new zzaep();
        if (this.l.zzTe()) {
            this.l.zzh("HandleNewFrameCount: " + this.e, new Object[0]);
        }
    }

    private void a(String str) {
        Throwable th;
        zzahf com_google_android_gms_internal_zzahf;
        String str2;
        String valueOf;
        this.f.zzia(str);
        this.e--;
        if (this.e == 0) {
            try {
                this.f.zzQH();
                Map zzij = zzaim.zzij(this.f.toString());
                this.f = null;
                if (this.l.zzTe()) {
                    zzahf com_google_android_gms_internal_zzahf2 = this.l;
                    String valueOf2 = String.valueOf(zzij);
                    com_google_android_gms_internal_zzahf2.zzh(new StringBuilder(String.valueOf(valueOf2).length() + 36).append("handleIncomingFrame complete frame: ").append(valueOf2).toString(), new Object[0]);
                }
                this.g.zzap(zzij);
            } catch (Throwable e) {
                th = e;
                com_google_android_gms_internal_zzahf = this.l;
                str2 = "Error parsing frame: ";
                valueOf = String.valueOf(this.f.toString());
                com_google_android_gms_internal_zzahf.zze(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                c();
                h();
            } catch (Throwable e2) {
                th = e2;
                com_google_android_gms_internal_zzahf = this.l;
                str2 = "Error parsing frame (cast error): ";
                valueOf = String.valueOf(this.f.toString());
                com_google_android_gms_internal_zzahf.zze(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
                c();
                h();
            }
        }
    }

    private static String[] a(String str, int i) {
        int i2 = 0;
        if (str.length() <= i) {
            return new String[]{str};
        }
        ArrayList arrayList = new ArrayList();
        while (i2 < str.length()) {
            arrayList.add(str.substring(i2, Math.min(i2 + i, str.length())));
            i2 += i;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private String b(String str) {
        if (str.length() <= 6) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt > 0) {
                    a(parseInt);
                }
                return null;
            } catch (NumberFormatException e) {
            }
        }
        a(1);
        return str;
    }

    private void c(String str) {
        if (!this.d) {
            d();
            if (f()) {
                a(str);
                return;
            }
            String b = b(str);
            if (b != null) {
                a(b);
            }
        }
    }

    private void d() {
        if (!this.d) {
            if (this.h != null) {
                this.h.cancel(false);
                if (this.l.zzTe()) {
                    this.l.zzh("Reset keepAlive. Remaining: " + this.h.getDelay(TimeUnit.MILLISECONDS), new Object[0]);
                }
            } else if (this.l.zzTe()) {
                this.l.zzh("Reset keepAlive", new Object[0]);
            }
            this.h = this.k.schedule(e(), 45000, TimeUnit.MILLISECONDS);
        }
    }

    private Runnable e() {
        return new Runnable(this) {
            final /* synthetic */ zzaen a;

            {
                this.a = r1;
            }

            public void run() {
                if (this.a.b != null) {
                    this.a.b.a("0");
                    this.a.d();
                }
            }
        };
    }

    private boolean f() {
        return this.f != null;
    }

    private void g() {
        if (!this.d) {
            if (this.l.zzTe()) {
                this.l.zzh("closing itself", new Object[0]);
            }
            h();
        }
        this.b = null;
        if (this.h != null) {
            this.h.cancel(false);
        }
    }

    private void h() {
        this.d = true;
        this.g.zzaM(this.c);
    }

    private void i() {
        if (!this.c && !this.d) {
            if (this.l.zzTe()) {
                this.l.zzh("timed out on connect", new Object[0]);
            }
            this.b.b();
        }
    }

    public void a() {
        this.b.a();
        this.i = this.k.schedule(new Runnable(this) {
            final /* synthetic */ zzaen a;

            {
                this.a = r1;
            }

            public void run() {
                this.a.i();
            }
        }, 30000, TimeUnit.MILLISECONDS);
    }

    public void a(Map<String, Object> map) {
        String str;
        d();
        try {
            String[] a = a(zzaim.zzaB(map), 16384);
            if (a.length > 1) {
                this.b.a(a.length);
            }
            for (String str2 : a) {
                this.b.a(str2);
            }
        } catch (Throwable e) {
            Throwable th = e;
            zzahf com_google_android_gms_internal_zzahf = this.l;
            str2 = "Failed to serialize message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzahf.zze(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            h();
        }
    }

    public void b() {
    }

    public void c() {
        if (this.l.zzTe()) {
            this.l.zzh("websocket is being closed", new Object[0]);
        }
        this.d = true;
        this.b.b();
        if (this.i != null) {
            this.i.cancel(true);
        }
        if (this.h != null) {
            this.h.cancel(true);
        }
    }
}
