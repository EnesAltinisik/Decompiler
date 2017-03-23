package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

class zzaed implements com.google.android.gms.internal.zzaen.zza {
    private static long a = 0;
    private zzaeh b;
    private zzaen c;
    private zza d;
    private a e = a.REALTIME_CONNECTING;
    private final zzahf f;

    private enum a {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public interface zza {
        void zzaq(Map<String, Object> map);

        void zzb(zzb com_google_android_gms_internal_zzaed_zzb);

        void zzhR(String str);

        void zzhS(String str);

        void zzj(long j, String str);
    }

    public enum zzb {
        SERVER_RESET,
        OTHER
    }

    public zzaed(zzaef com_google_android_gms_internal_zzaef, zzaeh com_google_android_gms_internal_zzaeh, String str, zza com_google_android_gms_internal_zzaed_zza, String str2) {
        long j = a;
        a = 1 + j;
        this.b = com_google_android_gms_internal_zzaeh;
        this.d = com_google_android_gms_internal_zzaed_zza;
        this.f = new zzahf(com_google_android_gms_internal_zzaef.zzPT(), "Connection", "conn_" + j);
        this.c = new zzaen(com_google_android_gms_internal_zzaef, com_google_android_gms_internal_zzaeh, str, this, str2);
    }

    private void a(long j, String str) {
        if (this.f.zzTe()) {
            this.f.zzh("realtime connection established", new Object[0]);
        }
        this.e = a.REALTIME_CONNECTED;
        this.d.zzj(j, str);
    }

    private void a(String str) {
        if (this.f.zzTe()) {
            this.f.zzh("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.d.zzhS(str);
        b();
    }

    private void a(Map<String, Object> map) {
        if (this.f.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.f;
            String str = "received data message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.d.zzaq(map);
    }

    private void b(String str) {
        if (this.f.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.f;
            String valueOf = String.valueOf(this.b.getHost());
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(valueOf).length() + 62) + String.valueOf(str).length()).append("Got a reset; killing connection to ").append(valueOf).append("; Updating internalHost to ").append(str).toString(), new Object[0]);
        }
        this.d.zzhR(str);
        a(zzb.SERVER_RESET);
    }

    private void b(Map<String, Object> map) {
        if (this.f.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.f;
            String str = "Got control message: ";
            String valueOf = String.valueOf(map.toString());
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        try {
            valueOf = (String) map.get("t");
            if (valueOf == null) {
                if (this.f.zzTe()) {
                    com_google_android_gms_internal_zzahf = this.f;
                    str = "Got invalid control message: ";
                    valueOf = String.valueOf(map.toString());
                    com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                }
                b();
            } else if (valueOf.equals("s")) {
                a((String) map.get("d"));
            } else if (valueOf.equals("r")) {
                b((String) map.get("d"));
            } else if (valueOf.equals("h")) {
                c((Map) map.get("d"));
            } else if (this.f.zzTe()) {
                com_google_android_gms_internal_zzahf = this.f;
                str = "Ignoring unknown control message: ";
                valueOf = String.valueOf(valueOf);
                com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f.zzTe()) {
                com_google_android_gms_internal_zzahf = this.f;
                str = "Failed to parse control message: ";
                valueOf = String.valueOf(e.toString());
                com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            b();
        }
    }

    private void b(Map<String, Object> map, boolean z) {
        if (this.e != a.REALTIME_CONNECTED) {
            this.f.zzh("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.f.zzh("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f.zzh("Sending data: %s", map);
        }
        this.c.a((Map) map);
    }

    private void c(Map<String, Object> map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.d.zzhR((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.e == a.REALTIME_CONNECTING) {
            this.c.b();
            a(longValue, str);
        }
    }

    public void a() {
        if (this.f.zzTe()) {
            this.f.zzh("Opening a connection", new Object[0]);
        }
        this.c.a();
    }

    public void a(zzb com_google_android_gms_internal_zzaed_zzb) {
        if (this.e != a.REALTIME_DISCONNECTED) {
            if (this.f.zzTe()) {
                this.f.zzh("closing realtime connection", new Object[0]);
            }
            this.e = a.REALTIME_DISCONNECTED;
            if (this.c != null) {
                this.c.c();
                this.c = null;
            }
            this.d.zzb(com_google_android_gms_internal_zzaed_zzb);
        }
    }

    public void a(Map<String, Object> map, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        b(hashMap, z);
    }

    public void b() {
        a(zzb.OTHER);
    }

    public void zzaM(boolean z) {
        this.c = null;
        if (z || this.e != a.REALTIME_CONNECTING) {
            if (this.f.zzTe()) {
                this.f.zzh("Realtime connection lost", new Object[0]);
            }
        } else if (this.f.zzTe()) {
            this.f.zzh("Realtime connection failed", new Object[0]);
        }
        b();
    }

    public void zzap(Map<String, Object> map) {
        String str;
        zzahf com_google_android_gms_internal_zzahf;
        String str2;
        try {
            str = (String) map.get("t");
            if (str == null) {
                if (this.f.zzTe()) {
                    com_google_android_gms_internal_zzahf = this.f;
                    str2 = "Failed to parse server message: missing message type:";
                    str = String.valueOf(map.toString());
                    com_google_android_gms_internal_zzahf.zzh(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
                }
                b();
            } else if (str.equals("d")) {
                a((Map) map.get("d"));
            } else if (str.equals("c")) {
                b((Map) map.get("d"));
            } else if (this.f.zzTe()) {
                com_google_android_gms_internal_zzahf = this.f;
                str2 = "Ignoring unknown server message type: ";
                str = String.valueOf(str);
                com_google_android_gms_internal_zzahf.zzh(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f.zzTe()) {
                com_google_android_gms_internal_zzahf = this.f;
                str2 = "Failed to parse server message: ";
                str = String.valueOf(e.toString());
                com_google_android_gms_internal_zzahf.zzh(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
            b();
        }
    }
}
