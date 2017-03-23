package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Map;

class fz implements com.google.android.gms.b.gj.a {
    private static long a = 0;
    private gd b;
    private gj c;
    private a d;
    private c e = c.REALTIME_CONNECTING;
    private final jb f;

    public interface a {
        void a(long j, String str);

        void a(b bVar);

        void a(String str);

        void a(Map<String, Object> map);

        void b(String str);
    }

    public enum b {
        SERVER_RESET,
        OTHER
    }

    private enum c {
        REALTIME_CONNECTING,
        REALTIME_CONNECTED,
        REALTIME_DISCONNECTED
    }

    public fz(gb gbVar, gd gdVar, String str, a aVar, String str2) {
        long j = a;
        a = 1 + j;
        this.b = gdVar;
        this.d = aVar;
        this.f = new jb(gbVar.a(), "Connection", "conn_" + j);
        this.c = new gj(gbVar, gdVar, str, this, str2);
    }

    private void a(long j, String str) {
        if (this.f.a()) {
            this.f.a("realtime connection established", new Object[0]);
        }
        this.e = c.REALTIME_CONNECTED;
        this.d.a(j, str);
    }

    private void a(String str) {
        if (this.f.a()) {
            this.f.a("Connection shutdown command received. Shutting down...", new Object[0]);
        }
        this.d.b(str);
        b();
    }

    private void b(String str) {
        if (this.f.a()) {
            jb jbVar = this.f;
            String valueOf = String.valueOf(this.b.a());
            jbVar.a(new StringBuilder((String.valueOf(valueOf).length() + 62) + String.valueOf(str).length()).append("Got a reset; killing connection to ").append(valueOf).append("; Updating internalHost to ").append(str).toString(), new Object[0]);
        }
        this.d.a(str);
        a(b.SERVER_RESET);
    }

    private void b(Map<String, Object> map) {
        if (this.f.a()) {
            jb jbVar = this.f;
            String str = "received data message: ";
            String valueOf = String.valueOf(map.toString());
            jbVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.d.a((Map) map);
    }

    private void b(Map<String, Object> map, boolean z) {
        if (this.e != c.REALTIME_CONNECTED) {
            this.f.a("Tried to send on an unconnected connection", new Object[0]);
            return;
        }
        if (z) {
            this.f.a("Sending data (contents hidden)", new Object[0]);
        } else {
            this.f.a("Sending data: %s", map);
        }
        this.c.a((Map) map);
    }

    private void c(Map<String, Object> map) {
        if (this.f.a()) {
            jb jbVar = this.f;
            String str = "Got control message: ";
            String valueOf = String.valueOf(map.toString());
            jbVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        try {
            valueOf = (String) map.get("t");
            if (valueOf == null) {
                if (this.f.a()) {
                    jbVar = this.f;
                    str = "Got invalid control message: ";
                    valueOf = String.valueOf(map.toString());
                    jbVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                }
                b();
            } else if (valueOf.equals("s")) {
                a((String) map.get("d"));
            } else if (valueOf.equals("r")) {
                b((String) map.get("d"));
            } else if (valueOf.equals("h")) {
                d((Map) map.get("d"));
            } else if (this.f.a()) {
                jbVar = this.f;
                str = "Ignoring unknown control message: ";
                valueOf = String.valueOf(valueOf);
                jbVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f.a()) {
                jbVar = this.f;
                str = "Failed to parse control message: ";
                valueOf = String.valueOf(e.toString());
                jbVar.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            }
            b();
        }
    }

    private void d(Map<String, Object> map) {
        long longValue = ((Long) map.get("ts")).longValue();
        this.d.a((String) map.get("h"));
        String str = (String) map.get("s");
        if (this.e == c.REALTIME_CONNECTING) {
            a(longValue, str);
        }
    }

    public void a() {
        if (this.f.a()) {
            this.f.a("Opening a connection", new Object[0]);
        }
        this.c.a();
    }

    public void a(b bVar) {
        if (this.e != c.REALTIME_DISCONNECTED) {
            if (this.f.a()) {
                this.f.a("closing realtime connection", new Object[0]);
            }
            this.e = c.REALTIME_DISCONNECTED;
            if (this.c != null) {
                this.c.b();
                this.c = null;
            }
            this.d.a(bVar);
        }
    }

    public void a(Map<String, Object> map) {
        String str;
        jb jbVar;
        String str2;
        try {
            str = (String) map.get("t");
            if (str == null) {
                if (this.f.a()) {
                    jbVar = this.f;
                    str2 = "Failed to parse server message: missing message type:";
                    str = String.valueOf(map.toString());
                    jbVar.a(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
                }
                b();
            } else if (str.equals("d")) {
                b((Map) map.get("d"));
            } else if (str.equals("c")) {
                c((Map) map.get("d"));
            } else if (this.f.a()) {
                jbVar = this.f;
                str2 = "Ignoring unknown server message type: ";
                str = String.valueOf(str);
                jbVar.a(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
        } catch (ClassCastException e) {
            if (this.f.a()) {
                jbVar = this.f;
                str2 = "Failed to parse server message: ";
                str = String.valueOf(e.toString());
                jbVar.a(str.length() != 0 ? str2.concat(str) : new String(str2), new Object[0]);
            }
            b();
        }
    }

    public void a(Map<String, Object> map, boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("t", "d");
        hashMap.put("d", map);
        b(hashMap, z);
    }

    public void a(boolean z) {
        this.c = null;
        if (z || this.e != c.REALTIME_CONNECTING) {
            if (this.f.a()) {
                this.f.a("Realtime connection lost", new Object[0]);
            }
        } else if (this.f.a()) {
            this.f.a("Realtime connection failed", new Object[0]);
        }
        b();
    }

    public void b() {
        a(b.OTHER);
    }
}
