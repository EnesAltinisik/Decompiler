package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaed.zza;
import com.google.android.gms.internal.zzaed.zzb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class zzaek implements zza, zzaej {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzaek.class.desiredAssertionStatus());
    private static long zzbIJ = 0;
    private final ScheduledExecutorService zzbHI;
    private final zzahf zzbHV;
    private final zzaeh zzbIK;
    private final zzaee zzbIV;
    private final zzaej.zza zzbJc;
    private String zzbJd;
    private HashSet<String> zzbJe = new HashSet();
    private boolean zzbJf = true;
    private long zzbJg;
    private zzaed zzbJh;
    private b zzbJi = b.Disconnected;
    private long zzbJj = 0;
    private long zzbJk = 0;
    private Map<Long, a> zzbJl;
    private List<d> zzbJm;
    private Map<Long, f> zzbJn;
    private Map<c, e> zzbJo;
    private String zzbJp;
    private boolean zzbJq;
    private final zzaef zzbJr;
    private final zzaeo zzbJs;
    private String zzbJt;
    private long zzbJu = 0;
    private ScheduledFuture<?> zzbJv = null;
    private long zzbJw;
    private boolean zzbJx;

    private interface a {
        void a(Map<String, Object> map);
    }

    private enum b {
        Disconnected,
        GettingToken,
        Connecting,
        Authenticating,
        Connected
    }

    private static class c {
        private final List<String> a;
        private final Map<String, Object> b;

        public c(List<String> list, Map<String, Object> map) {
            this.a = list;
            this.b = map;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) ? this.b.equals(cVar.b) : false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String valueOf = String.valueOf(zzaeg.zzP(this.a));
            String valueOf2 = String.valueOf(this.b);
            return new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(valueOf2).length()).append(valueOf).append(" (params: ").append(valueOf2).append(")").toString();
        }
    }

    private static class d {
        private final String a;
        private final List<String> b;
        private final Object c;
        private final zzaem d;

        private d(String str, List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem) {
            this.a = str;
            this.b = list;
            this.c = obj;
            this.d = com_google_android_gms_internal_zzaem;
        }

        public String a() {
            return this.a;
        }

        public List<String> b() {
            return this.b;
        }

        public Object c() {
            return this.c;
        }

        public zzaem d() {
            return this.d;
        }
    }

    private static class e {
        private final zzaem a;
        private final c b;
        private final zzaei c;
        private final Long d;

        private e(zzaem com_google_android_gms_internal_zzaem, c cVar, Long l, zzaei com_google_android_gms_internal_zzaei) {
            this.a = com_google_android_gms_internal_zzaem;
            this.b = cVar;
            this.c = com_google_android_gms_internal_zzaei;
            this.d = l;
        }

        public c a() {
            return this.b;
        }

        public Long b() {
            return this.d;
        }

        public zzaei c() {
            return this.c;
        }

        public String toString() {
            String valueOf = String.valueOf(this.b.toString());
            String valueOf2 = String.valueOf(this.d);
            return new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(valueOf2).length()).append(valueOf).append(" (Tag: ").append(valueOf2).append(")").toString();
        }
    }

    private static class f {
        private String a;
        private Map<String, Object> b;
        private zzaem c;

        private f(String str, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem) {
            this.a = str;
            this.b = map;
            this.c = com_google_android_gms_internal_zzaem;
        }

        public String a() {
            return this.a;
        }

        public Map<String, Object> b() {
            return this.b;
        }

        public zzaem c() {
            return this.c;
        }
    }

    public zzaek(zzaef com_google_android_gms_internal_zzaef, zzaeh com_google_android_gms_internal_zzaeh, zzaej.zza com_google_android_gms_internal_zzaej_zza) {
        this.zzbJc = com_google_android_gms_internal_zzaej_zza;
        this.zzbJr = com_google_android_gms_internal_zzaef;
        this.zzbHI = com_google_android_gms_internal_zzaef.zzPV();
        this.zzbIV = com_google_android_gms_internal_zzaef.zzPU();
        this.zzbIK = com_google_android_gms_internal_zzaeh;
        this.zzbJo = new HashMap();
        this.zzbJl = new HashMap();
        this.zzbJn = new HashMap();
        this.zzbJm = new ArrayList();
        this.zzbJs = new zzaeo.zza(this.zzbHI, com_google_android_gms_internal_zzaef.zzPT(), "ConnectionRetryHelper").zzaB(1000).zzl(1.3d).zzaC(30000).zzm(0.7d).zzQG();
        long j = zzbIJ;
        zzbIJ = 1 + j;
        this.zzbHV = new zzahf(com_google_android_gms_internal_zzaef.zzPT(), "PersistentConnection", "pc_" + j);
        this.zzbJt = null;
        zzQm();
    }

    private boolean isIdle() {
        return this.zzbJo.isEmpty() && this.zzbJl.isEmpty() && !this.zzbJx && this.zzbJn.isEmpty();
    }

    private Collection<e> zzQ(List<String> list) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf = String.valueOf(list);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 29).append("removing all listens at path ").append(valueOf).toString(), new Object[0]);
        }
        Collection<e> arrayList = new ArrayList();
        for (Entry entry : this.zzbJo.entrySet()) {
            c cVar = (c) entry.getKey();
            e eVar = (e) entry.getValue();
            if (cVar.a.equals(list)) {
                arrayList.add(eVar);
            }
        }
        for (e eVar2 : arrayList) {
            this.zzbJo.remove(eVar2.a());
        }
        zzQm();
        return arrayList;
    }

    private boolean zzQc() {
        return this.zzbJi == b.Authenticating || this.zzbJi == b.Connected;
    }

    private boolean zzQd() {
        return this.zzbJi == b.Connected;
    }

    private void zzQf() {
        if (zzQe()) {
            zzaeg.zzc(this.zzbJi == b.Disconnected, "Not in disconnected state: %s", this.zzbJi);
            final boolean z = this.zzbJq;
            this.zzbHV.zzh("Scheduling connection attempt", new Object[0]);
            this.zzbJq = false;
            this.zzbJs.zzk(new Runnable(this) {
                final /* synthetic */ zzaek b;

                public void run() {
                    this.b.zzbHV.zzh("Trying to fetch auth token", new Object[0]);
                    zzaeg.zzc(this.b.zzbJi == b.Disconnected, "Not in disconnected state: %s", this.b.zzbJi);
                    this.b.zzbJi = b.GettingToken;
                    this.b.zzbJu = 1 + this.b.zzbJu;
                    final long zzd = this.b.zzbJu;
                    this.b.zzbIV.zza(z, new zzaee.zza(this) {
                        final /* synthetic */ AnonymousClass1 b;

                        public void onError(String str) {
                            if (zzd == this.b.b.zzbJu) {
                                this.b.b.zzbJi = b.Disconnected;
                                zzahf zza = this.b.b.zzbHV;
                                String str2 = "Error fetching token: ";
                                String valueOf = String.valueOf(str);
                                zza.zzh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
                                this.b.b.zzQf();
                                return;
                            }
                            this.b.b.zzbHV.zzh("Ignoring getToken error, because this was not the latest attempt.", new Object[0]);
                        }

                        public void zzhT(String str) {
                            if (zzd != this.b.b.zzbJu) {
                                this.b.b.zzbHV.zzh("Ignoring getToken result, because this was not the latest attempt.", new Object[0]);
                            } else if (this.b.b.zzbJi == b.GettingToken) {
                                this.b.b.zzbHV.zzh("Successfully fetched token, opening connection", new Object[0]);
                                this.b.b.zzhV(str);
                            } else {
                                zzaeg.zzc(this.b.b.zzbJi == b.Disconnected, "Expected connection state disconnected, but was %s", this.b.b.zzbJi);
                                this.b.b.zzbHV.zzh("Not opening connection after token refresh, because connection was set to disconnected", new Object[0]);
                            }
                        }
                    });
                }
            });
        }
    }

    private void zzQg() {
        Iterator it = this.zzbJn.entrySet().iterator();
        while (it.hasNext()) {
            f fVar = (f) ((Entry) it.next()).getValue();
            if (fVar.b().containsKey("h")) {
                fVar.c().zzaj("disconnected", null);
                it.remove();
            }
        }
    }

    private void zzQh() {
        zzaP(true);
    }

    private void zzQi() {
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("calling restore state", new Object[0]);
        }
        zzaeg.zzc(this.zzbJi == b.Connecting, "Wanted to restore auth, but was in wrong state: %s", this.zzbJi);
        if (this.zzbJp == null) {
            if (this.zzbHV.zzTe()) {
                this.zzbHV.zzh("Not restoring auth because token is null.", new Object[0]);
            }
            this.zzbJi = b.Connected;
            zzQj();
            return;
        }
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Restoring auth.", new Object[0]);
        }
        this.zzbJi = b.Authenticating;
        zzQh();
    }

    private void zzQj() {
        zzaeg.zzc(this.zzbJi == b.Connected, "Should be connected if we're restoring state, but we are: %s", this.zzbJi);
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Restoring outstanding listens", new Object[0]);
        }
        for (e eVar : this.zzbJo.values()) {
            if (this.zzbHV.zzTe()) {
                zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
                String valueOf = String.valueOf(eVar.a());
                com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Restoring listen ").append(valueOf).toString(), new Object[0]);
            }
            zzb(eVar);
        }
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Restoring writes.", new Object[0]);
        }
        Object arrayList = new ArrayList(this.zzbJn.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzay(((Long) it.next()).longValue());
        }
        for (d dVar : this.zzbJm) {
            zza(dVar.a(), dVar.b(), dVar.c(), dVar.d());
        }
        this.zzbJm.clear();
    }

    private void zzQk() {
        Map hashMap = new HashMap();
        String str;
        String valueOf;
        if (zzail.zzUh()) {
            if (this.zzbJr.zzPW()) {
                hashMap.put("persistence.android.enabled", Integer.valueOf(1));
            }
            str = "sdk.android.";
            valueOf = String.valueOf(this.zzbJr.zzPX().replace('.', '-'));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else if ($assertionsDisabled || !this.zzbJr.zzPW()) {
            str = "sdk.java.";
            valueOf = String.valueOf(this.zzbJr.zzPX().replace('.', '-'));
            hashMap.put(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), Integer.valueOf(1));
        } else {
            throw new AssertionError("Stats for persistence on JVM missing (persistence not yet supported)");
        }
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Sending first connection stats", new Object[0]);
        }
        zzav(hashMap);
    }

    private long zzQl() {
        long j = this.zzbJk;
        this.zzbJk = 1 + j;
        return j;
    }

    private void zzQm() {
        boolean z = false;
        if (isIdle()) {
            if (this.zzbJv != null) {
                this.zzbJv.cancel(false);
            }
            this.zzbJv = this.zzbHI.schedule(new Runnable(this) {
                final /* synthetic */ zzaek a;

                {
                    this.a = r1;
                }

                public void run() {
                    this.a.zzbJv = null;
                    if (this.a.zzQn()) {
                        this.a.interrupt("connection_idle");
                    } else {
                        this.a.zzQm();
                    }
                }
            }, 60000, TimeUnit.MILLISECONDS);
        } else if (isInterrupted("connection_idle")) {
            if (!isIdle()) {
                z = true;
            }
            zzaeg.zzaN(z);
            resume("connection_idle");
        }
    }

    private boolean zzQn() {
        return isIdle() && System.currentTimeMillis() > this.zzbJw + 60000;
    }

    private void zzR(List<String> list) {
        Collection<e> zzQ = zzQ(list);
        if (zzQ != null) {
            for (e b : zzQ) {
                b.a.zzaj("permission_denied", null);
            }
        }
    }

    private e zza(c cVar) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf = String.valueOf(cVar);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 15).append("removing query ").append(valueOf).toString(), new Object[0]);
        }
        if (this.zzbJo.containsKey(cVar)) {
            e eVar = (e) this.zzbJo.get(cVar);
            this.zzbJo.remove(cVar);
            zzQm();
            return eVar;
        }
        if (this.zzbHV.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbHV;
            valueOf = String.valueOf(cVar);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 64).append("Trying to remove listener for QuerySpec ").append(valueOf).append(" but no listener exists.").toString(), new Object[0]);
        }
        return null;
    }

    private Map<String, Object> zza(List<String> list, Object obj, String str) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("p", zzaeg.zzP(list));
        hashMap.put("d", obj);
        if (str != null) {
            hashMap.put("h", str);
        }
        return hashMap;
    }

    private void zza(e eVar) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzaeg.zzP(eVar.b.a));
        Long b = eVar.b();
        if (b != null) {
            hashMap.put("q", eVar.a().b);
            hashMap.put("t", b);
        }
        zza("n", hashMap, null);
    }

    private void zza(String str, List<String> list, Object obj, final zzaem com_google_android_gms_internal_zzaem) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzaeg.zzP(list));
        hashMap.put("d", obj);
        zza(str, hashMap, new a(this) {
            final /* synthetic */ zzaek b;

            public void a(Map<String, Object> map) {
                String str = null;
                String str2 = (String) map.get("s");
                if (str2.equals("ok")) {
                    str2 = null;
                } else {
                    str = (String) map.get("d");
                }
                if (com_google_android_gms_internal_zzaem != null) {
                    com_google_android_gms_internal_zzaem.zzaj(str2, str);
                }
            }
        });
    }

    private void zza(String str, List<String> list, Object obj, String str2, zzaem com_google_android_gms_internal_zzaem) {
        Map zza = zza((List) list, obj, str2);
        long j = this.zzbJj;
        this.zzbJj = 1 + j;
        this.zzbJn.put(Long.valueOf(j), new f(str, zza, com_google_android_gms_internal_zzaem));
        if (zzQd()) {
            zzay(j);
        }
        this.zzbJw = System.currentTimeMillis();
        zzQm();
    }

    private void zza(String str, Map<String, Object> map, a aVar) {
        zza(str, false, (Map) map, aVar);
    }

    private void zza(String str, boolean z, Map<String, Object> map, a aVar) {
        long zzQl = zzQl();
        Map hashMap = new HashMap();
        hashMap.put("r", Long.valueOf(zzQl));
        hashMap.put("a", str);
        hashMap.put("b", map);
        this.zzbJh.a(hashMap, z);
        this.zzbJl.put(Long.valueOf(zzQl), aVar);
    }

    private void zza(List<String> list, c cVar) {
        if (list.contains("no_index")) {
            String valueOf = String.valueOf(cVar.b.get("i"));
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 14).append("\".indexOn\": \"").append(valueOf).append("\"").toString();
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf2 = String.valueOf(zzaeg.zzP(cVar.a));
            com_google_android_gms_internal_zzahf.warn(new StringBuilder((String.valueOf(valueOf).length() + 118) + String.valueOf(valueOf2).length()).append("Using an unspecified index. Consider adding '").append(valueOf).append("' at ").append(valueOf2).append(" to your security and Firebase Database rules for better performance").toString());
        }
    }

    private void zzaP(final boolean z) {
        zzaeg.zzc(zzQc(), "Must be connected to send auth, but was: %s", this.zzbJi);
        zzaeg.zzc(this.zzbJp != null, "Auth token must be set to authenticate!", new Object[0]);
        Map hashMap = new HashMap();
        hashMap.put("cred", this.zzbJp);
        zza("auth", true, hashMap, new a(this) {
            final /* synthetic */ zzaek b;

            public void a(Map<String, Object> map) {
                this.b.zzbJi = b.Connected;
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    this.b.zzbJc.zzaO(true);
                    if (z) {
                        this.b.zzQj();
                        return;
                    }
                    return;
                }
                this.b.zzbJp = null;
                this.b.zzbJc.zzaO(false);
                String str2 = (String) map.get("d");
                this.b.zzbHV.warn(new StringBuilder((String.valueOf(str).length() + 26) + String.valueOf(str2).length()).append("Authentication failed: ").append(str).append(" (").append(str2).append(")").toString());
                this.b.zzbJh.b();
            }
        });
    }

    private void zzai(String str, String str2) {
        this.zzbHV.warn(new StringBuilder((String.valueOf(str).length() + 23) + String.valueOf(str2).length()).append("Auth token revoked: ").append(str).append(" (").append(str2).append(")").toString());
        this.zzbJp = null;
        this.zzbJq = true;
        this.zzbJc.zzaO(false);
        this.zzbJh.b();
    }

    private void zzau(Map<String, Object> map) {
        this.zzbHV.info((String) map.get("msg"));
    }

    private void zzav(Map<String, Integer> map) {
        if (!map.isEmpty()) {
            Map hashMap = new HashMap();
            hashMap.put("c", map);
            zza("s", hashMap, new a(this) {
                final /* synthetic */ zzaek a;

                {
                    this.a = r1;
                }

                public void a(Map<String, Object> map) {
                    String str = (String) map.get("s");
                    if (!str.equals("ok")) {
                        String str2 = (String) map.get("d");
                        if (this.a.zzbHV.zzTe()) {
                            this.a.zzbHV.zzh(new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(str2).length()).append("Failed to send stats: ").append(str).append(" (message: ").append(str2).append(")").toString(), new Object[0]);
                        }
                    }
                }
            });
        } else if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("Not sending stats because stats are empty", new Object[0]);
        }
    }

    private void zzax(long j) {
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("handling timestamp", new Object[0]);
        }
        long currentTimeMillis = j - System.currentTimeMillis();
        Map hashMap = new HashMap();
        hashMap.put("serverTimeOffset", Long.valueOf(currentTimeMillis));
        this.zzbJc.zzat(hashMap);
    }

    private void zzay(long j) {
        if ($assertionsDisabled || zzQd()) {
            final f fVar = (f) this.zzbJn.get(Long.valueOf(j));
            final zzaem c = fVar.c();
            final String a = fVar.a();
            final long j2 = j;
            zza(a, fVar.b(), new a(this) {
                final /* synthetic */ zzaek e;

                public void a(Map<String, Object> map) {
                    if (this.e.zzbHV.zzTe()) {
                        zzahf zza = this.e.zzbHV;
                        String str = a;
                        String valueOf = String.valueOf(map);
                        zza.zzh(new StringBuilder((String.valueOf(str).length() + 11) + String.valueOf(valueOf).length()).append(str).append(" response: ").append(valueOf).toString(), new Object[0]);
                    }
                    if (((f) this.e.zzbJn.get(Long.valueOf(j2))) == fVar) {
                        this.e.zzbJn.remove(Long.valueOf(j2));
                        if (c != null) {
                            String str2 = (String) map.get("s");
                            if (str2.equals("ok")) {
                                c.zzaj(null, null);
                            } else {
                                c.zzaj(str2, (String) map.get("d"));
                            }
                        }
                    } else if (this.e.zzbHV.zzTe()) {
                        this.e.zzbHV.zzh("Ignoring on complete for put " + j2 + " because it was removed already.", new Object[0]);
                    }
                    this.e.zzQm();
                }
            });
            return;
        }
        throw new AssertionError("sendPut called when we can't send writes (we're disconnected or writes are paused).");
    }

    private void zzb(final e eVar) {
        Map hashMap = new HashMap();
        hashMap.put("p", zzaeg.zzP(eVar.a().a));
        Long b = eVar.b();
        if (b != null) {
            hashMap.put("q", eVar.b.b);
            hashMap.put("t", b);
        }
        zzaei c = eVar.c();
        hashMap.put("h", c.zzPY());
        if (c.zzPZ()) {
            zzaec zzQa = c.zzQa();
            List arrayList = new ArrayList();
            for (List zzP : zzQa.zzPR()) {
                arrayList.add(zzaeg.zzP(zzP));
            }
            Map hashMap2 = new HashMap();
            hashMap2.put("hs", zzQa.zzPS());
            hashMap2.put("ps", arrayList);
            hashMap.put("ch", hashMap2);
        }
        zza("q", hashMap, new a(this) {
            final /* synthetic */ zzaek b;

            public void a(Map<String, Object> map) {
                String str = (String) map.get("s");
                if (str.equals("ok")) {
                    Map map2 = (Map) map.get("d");
                    if (map2.containsKey("w")) {
                        this.b.zza((List) map2.get("w"), eVar.b);
                    }
                }
                if (((e) this.b.zzbJo.get(eVar.a())) != eVar) {
                    return;
                }
                if (str.equals("ok")) {
                    eVar.a.zzaj(null, null);
                    return;
                }
                this.b.zza(eVar.a());
                eVar.a.zzaj(str, (String) map.get("d"));
            }
        });
    }

    private void zzj(String str, Map<String, Object> map) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf = String.valueOf(map);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder((String.valueOf(str).length() + 22) + String.valueOf(valueOf).length()).append("handleServerMessage: ").append(str).append(" ").append(valueOf).toString(), new Object[0]);
        }
        String str2;
        zzahf com_google_android_gms_internal_zzahf2;
        String str3;
        if (str.equals("d") || str.equals("m")) {
            boolean equals = str.equals("m");
            str2 = (String) map.get("p");
            Object obj = map.get("d");
            Long zzan = zzaeg.zzan(map.get("t"));
            if (!equals || !(obj instanceof Map) || ((Map) obj).size() != 0) {
                this.zzbJc.zza(zzaeg.zzhU(str2), obj, equals, zzan);
            } else if (this.zzbHV.zzTe()) {
                com_google_android_gms_internal_zzahf2 = this.zzbHV;
                str3 = "ignoring empty merge for path ";
                str2 = String.valueOf(str2);
                com_google_android_gms_internal_zzahf2.zzh(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("rm")) {
            str2 = (String) map.get("p");
            List zzhU = zzaeg.zzhU(str2);
            Object obj2 = map.get("d");
            Long zzan2 = zzaeg.zzan(map.get("t"));
            List<Map> list = (List) obj2;
            List arrayList = new ArrayList();
            for (Map map2 : list) {
                str3 = (String) map2.get("s");
                String str4 = (String) map2.get("e");
                arrayList.add(new zzael(str3 != null ? zzaeg.zzhU(str3) : null, str4 != null ? zzaeg.zzhU(str4) : null, map2.get("m")));
            }
            if (!arrayList.isEmpty()) {
                this.zzbJc.zza(zzhU, arrayList, zzan2);
            } else if (this.zzbHV.zzTe()) {
                com_google_android_gms_internal_zzahf2 = this.zzbHV;
                str3 = "Ignoring empty range merge for path ";
                str2 = String.valueOf(str2);
                com_google_android_gms_internal_zzahf2.zzh(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
            }
        } else if (str.equals("c")) {
            zzR(zzaeg.zzhU((String) map.get("p")));
        } else if (str.equals("ac")) {
            zzai((String) map.get("s"), (String) map.get("d"));
        } else if (str.equals("sd")) {
            zzau(map);
        } else if (this.zzbHV.zzTe()) {
            com_google_android_gms_internal_zzahf2 = this.zzbHV;
            str3 = "Unrecognized action from server: ";
            str2 = String.valueOf(str);
            com_google_android_gms_internal_zzahf2.zzh(str2.length() != 0 ? str3.concat(str2) : new String(str3), new Object[0]);
        }
    }

    public void initialize() {
        zzQf();
    }

    public void interrupt(String str) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String str2 = "Connection interrupted for: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.zzbJe.add(str);
        if (this.zzbJh != null) {
            this.zzbJh.b();
            this.zzbJh = null;
        } else {
            this.zzbJs.cancel();
            this.zzbJi = b.Disconnected;
        }
        this.zzbJs.zzOx();
    }

    public boolean isInterrupted(String str) {
        return this.zzbJe.contains(str);
    }

    public void purgeOutstandingWrites() {
        for (f fVar : this.zzbJn.values()) {
            if (fVar.c != null) {
                fVar.c.zzaj("write_canceled", null);
            }
        }
        for (d dVar : this.zzbJm) {
            if (dVar.d != null) {
                dVar.d.zzaj("write_canceled", null);
            }
        }
        this.zzbJn.clear();
        this.zzbJm.clear();
        if (!zzQc()) {
            this.zzbJx = false;
        }
        zzQm();
    }

    public void refreshAuthToken() {
        this.zzbHV.zzh("Auth token refresh requested", new Object[0]);
        interrupt("token_refresh");
        resume("token_refresh");
    }

    public void resume(String str) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String str2 = "Connection no longer interrupted for: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.zzbJe.remove(str);
        if (zzQe() && this.zzbJi == b.Disconnected) {
            zzQf();
        }
    }

    public void shutdown() {
        interrupt("shutdown");
    }

    boolean zzQe() {
        return this.zzbJe.size() == 0;
    }

    public void zza(List<String> list, zzaem com_google_android_gms_internal_zzaem) {
        if (zzQd()) {
            zza("oc", (List) list, null, com_google_android_gms_internal_zzaem);
        } else {
            this.zzbJm.add(new d("oc", list, null, com_google_android_gms_internal_zzaem));
        }
        zzQm();
    }

    public void zza(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem) {
        zza("p", (List) list, obj, null, com_google_android_gms_internal_zzaem);
    }

    public void zza(List<String> list, Object obj, String str, zzaem com_google_android_gms_internal_zzaem) {
        zza("p", (List) list, obj, str, com_google_android_gms_internal_zzaem);
    }

    public void zza(List<String> list, Map<String, Object> map) {
        c cVar = new c(list, map);
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf = String.valueOf(cVar);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 15).append("unlistening on ").append(valueOf).toString(), new Object[0]);
        }
        e zza = zza(cVar);
        if (zza != null && zzQc()) {
            zza(zza);
        }
        zzQm();
    }

    public void zza(List<String> list, Map<String, Object> map, zzaei com_google_android_gms_internal_zzaei, Long l, zzaem com_google_android_gms_internal_zzaem) {
        c cVar = new c(list, map);
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String valueOf = String.valueOf(cVar);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 13).append("Listening on ").append(valueOf).toString(), new Object[0]);
        }
        zzaeg.zzc(!this.zzbJo.containsKey(cVar), "listen() called twice for same QuerySpec.", new Object[0]);
        if (this.zzbHV.zzTe()) {
            com_google_android_gms_internal_zzahf = this.zzbHV;
            valueOf = String.valueOf(cVar);
            com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 21).append("Adding listen query: ").append(valueOf).toString(), new Object[0]);
        }
        e eVar = new e(com_google_android_gms_internal_zzaem, cVar, l, com_google_android_gms_internal_zzaei);
        this.zzbJo.put(cVar, eVar);
        if (zzQc()) {
            zzb(eVar);
        }
        zzQm();
    }

    public void zza(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem) {
        zza("m", (List) list, (Object) map, null, com_google_android_gms_internal_zzaem);
    }

    public void zzaq(Map<String, Object> map) {
        if (map.containsKey("r")) {
            a aVar = (a) this.zzbJl.remove(Long.valueOf((long) ((Integer) map.get("r")).intValue()));
            if (aVar != null) {
                aVar.a((Map) map.get("b"));
            }
        } else if (!map.containsKey("error")) {
            if (map.containsKey("a")) {
                zzj((String) map.get("a"), (Map) map.get("b"));
            } else if (this.zzbHV.zzTe()) {
                zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
                String valueOf = String.valueOf(map);
                com_google_android_gms_internal_zzahf.zzh(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Ignoring unknown message: ").append(valueOf).toString(), new Object[0]);
            }
        }
    }

    public void zzb(zzb com_google_android_gms_internal_zzaed_zzb) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String str = "Got on disconnect due to ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzaed_zzb.name());
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        this.zzbJi = b.Disconnected;
        this.zzbJh = null;
        this.zzbJx = false;
        this.zzbJl.clear();
        zzQg();
        if (zzQe()) {
            boolean z = this.zzbJg > 0 ? System.currentTimeMillis() - this.zzbJg > 30000 : false;
            if (com_google_android_gms_internal_zzaed_zzb == zzb.SERVER_RESET || r0) {
                this.zzbJs.zzOx();
            }
            zzQf();
        }
        this.zzbJg = 0;
        this.zzbJc.onDisconnect();
    }

    public void zzb(List<String> list, Object obj, zzaem com_google_android_gms_internal_zzaem) {
        this.zzbJx = true;
        if (zzQd()) {
            zza("o", (List) list, obj, com_google_android_gms_internal_zzaem);
        } else {
            this.zzbJm.add(new d("o", list, obj, com_google_android_gms_internal_zzaem));
        }
        zzQm();
    }

    public void zzb(List<String> list, Map<String, Object> map, zzaem com_google_android_gms_internal_zzaem) {
        this.zzbJx = true;
        if (zzQd()) {
            zza("om", (List) list, (Object) map, com_google_android_gms_internal_zzaem);
        } else {
            this.zzbJm.add(new d("om", list, map, com_google_android_gms_internal_zzaem));
        }
        zzQm();
    }

    public void zzhR(String str) {
        this.zzbJd = str;
    }

    public void zzhS(String str) {
        if (this.zzbHV.zzTe()) {
            zzahf com_google_android_gms_internal_zzahf = this.zzbHV;
            String str2 = "Firebase Database connection was forcefully killed by the server. Will not attempt reconnect. Reason: ";
            String valueOf = String.valueOf(str);
            com_google_android_gms_internal_zzahf.zzh(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        interrupt("server_kill");
    }

    public void zzhV(String str) {
        zzaeg.zzc(this.zzbJi == b.GettingToken, "Trying to open network connection while in the wrong state: %s", this.zzbJi);
        if (str == null) {
            this.zzbJc.zzaO(false);
        }
        this.zzbJp = str;
        this.zzbJi = b.Connecting;
        this.zzbJh = new zzaed(this.zzbJr, this.zzbIK, this.zzbJd, this, this.zzbJt);
        this.zzbJh.a();
    }

    public void zzj(long j, String str) {
        if (this.zzbHV.zzTe()) {
            this.zzbHV.zzh("onReady", new Object[0]);
        }
        this.zzbJg = System.currentTimeMillis();
        zzax(j);
        if (this.zzbJf) {
            zzQk();
        }
        zzQi();
        this.zzbJf = false;
        this.zzbJt = str;
        this.zzbJc.zzQb();
    }
}
