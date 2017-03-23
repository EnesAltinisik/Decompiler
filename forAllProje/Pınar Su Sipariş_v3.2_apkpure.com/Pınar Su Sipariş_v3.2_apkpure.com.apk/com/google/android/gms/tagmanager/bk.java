package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzabt;
import com.google.android.gms.internal.zzabt.zzc;
import com.google.android.gms.internal.zzabt.zze;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzaf.zzi;
import com.google.android.gms.internal.zzag.zza;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class bk {
    private static final as<zza> a = new as(zzdl.zzKT(), true);
    private final zzc b;
    private final h c;
    private final Map<String, k> d;
    private final Map<String, k> e;
    private final Map<String, k> f;
    private final ce<zzabt.zza, as<zza>> g;
    private final ce<String, b> h;
    private final Set<zze> i;
    private final DataLayer j;
    private final Map<String, c> k;
    private volatile String l;
    private int m;

    interface a {
        void a(zze com_google_android_gms_internal_zzabt_zze, Set<zzabt.zza> set, Set<zzabt.zza> set2, bf bfVar);
    }

    private static class b {
        private as<zza> a;
        private zza b;

        public b(as<zza> asVar, zza com_google_android_gms_internal_zzag_zza) {
            this.a = asVar;
            this.b = com_google_android_gms_internal_zzag_zza;
        }

        public as<zza> a() {
            return this.a;
        }

        public zza b() {
            return this.b;
        }

        public int c() {
            return (this.b == null ? 0 : this.b.getCachedSize()) + ((zza) this.a.a()).getCachedSize();
        }
    }

    private static class c {
        private final Set<zze> a = new HashSet();
        private final Map<zze, List<zzabt.zza>> b = new HashMap();
        private final Map<zze, List<zzabt.zza>> c = new HashMap();
        private final Map<zze, List<String>> d = new HashMap();
        private final Map<zze, List<String>> e = new HashMap();
        private zzabt.zza f;

        public Set<zze> a() {
            return this.a;
        }

        public void a(zzabt.zza com_google_android_gms_internal_zzabt_zza) {
            this.f = com_google_android_gms_internal_zzabt_zza;
        }

        public void a(zze com_google_android_gms_internal_zzabt_zze) {
            this.a.add(com_google_android_gms_internal_zzabt_zze);
        }

        public void a(zze com_google_android_gms_internal_zzabt_zze, zzabt.zza com_google_android_gms_internal_zzabt_zza) {
            List list = (List) this.b.get(com_google_android_gms_internal_zzabt_zze);
            if (list == null) {
                list = new ArrayList();
                this.b.put(com_google_android_gms_internal_zzabt_zze, list);
            }
            list.add(com_google_android_gms_internal_zzabt_zza);
        }

        public void a(zze com_google_android_gms_internal_zzabt_zze, String str) {
            List list = (List) this.d.get(com_google_android_gms_internal_zzabt_zze);
            if (list == null) {
                list = new ArrayList();
                this.d.put(com_google_android_gms_internal_zzabt_zze, list);
            }
            list.add(str);
        }

        public Map<zze, List<zzabt.zza>> b() {
            return this.b;
        }

        public void b(zze com_google_android_gms_internal_zzabt_zze, zzabt.zza com_google_android_gms_internal_zzabt_zza) {
            List list = (List) this.c.get(com_google_android_gms_internal_zzabt_zze);
            if (list == null) {
                list = new ArrayList();
                this.c.put(com_google_android_gms_internal_zzabt_zze, list);
            }
            list.add(com_google_android_gms_internal_zzabt_zza);
        }

        public void b(zze com_google_android_gms_internal_zzabt_zze, String str) {
            List list = (List) this.e.get(com_google_android_gms_internal_zzabt_zze);
            if (list == null) {
                list = new ArrayList();
                this.e.put(com_google_android_gms_internal_zzabt_zze, list);
            }
            list.add(str);
        }

        public Map<zze, List<String>> c() {
            return this.d;
        }

        public Map<zze, List<String>> d() {
            return this.e;
        }

        public Map<zze, List<zzabt.zza>> e() {
            return this.c;
        }

        public zzabt.zza f() {
            return this.f;
        }
    }

    public bk(Context context, zzc com_google_android_gms_internal_zzabt_zzc, DataLayer dataLayer, zzt.zza com_google_android_gms_tagmanager_zzt_zza, zzt.zza com_google_android_gms_tagmanager_zzt_zza2, h hVar) {
        if (com_google_android_gms_internal_zzabt_zzc == null) {
            throw new NullPointerException("resource cannot be null");
        }
        this.b = com_google_android_gms_internal_zzabt_zzc;
        this.i = new HashSet(com_google_android_gms_internal_zzabt_zzc.zzLW());
        this.j = dataLayer;
        this.c = hVar;
        this.g = new zzm().a(1048576, new zzm.zza<zzabt.zza, as<zza>>(this) {
            final /* synthetic */ bk a;

            {
                this.a = r1;
            }

            public int a(zzabt.zza com_google_android_gms_internal_zzabt_zza, as<zza> asVar) {
                return ((zza) asVar.a()).getCachedSize();
            }

            public /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return a((zzabt.zza) obj, (as) obj2);
            }
        });
        this.h = new zzm().a(1048576, new zzm.zza<String, b>(this) {
            final /* synthetic */ bk a;

            {
                this.a = r1;
            }

            public int a(String str, b bVar) {
                return str.length() + bVar.c();
            }

            public /* synthetic */ int sizeOf(Object obj, Object obj2) {
                return a((String) obj, (b) obj2);
            }
        });
        this.d = new HashMap();
        b(new zzj(context));
        b(new zzt(com_google_android_gms_tagmanager_zzt_zza2));
        b(new cm(dataLayer));
        b(new zzdm(context, dataLayer));
        this.e = new HashMap();
        c(new ch());
        c(new f());
        c(new zzag());
        c(new m());
        c(new n());
        c(new aa());
        c(new ab());
        c(new ba());
        c(new br());
        this.f = new HashMap();
        a(new v(context));
        a(new ao(context));
        a(new bz(context));
        a(new ca(context));
        a(new cb(context));
        a(new cc(context));
        a(new cd(context));
        a(new cf());
        a(new cg(this.b.getVersion()));
        a(new zzt(com_google_android_gms_tagmanager_zzt_zza));
        a(new ck(dataLayer));
        a(new a(context));
        a(new b());
        a(new e());
        a(new i(this));
        a(new o());
        a(new p());
        a(new w(context));
        a(new x());
        a(new zzbi());
        a(new ae());
        a(new ag(context));
        a(new at());
        a(new av());
        a(new ax());
        a(new az());
        a(new bb(context));
        a(new bl());
        a(new bm());
        a(new bt());
        a(new bw());
        this.k = new HashMap();
        for (zze com_google_android_gms_internal_zzabt_zze : this.i) {
            if (hVar.a()) {
                a(com_google_android_gms_internal_zzabt_zze.zzMF(), com_google_android_gms_internal_zzabt_zze.zzMG(), "add macro");
                a(com_google_android_gms_internal_zzabt_zze.zzMK(), com_google_android_gms_internal_zzabt_zze.zzMH(), "remove macro");
                a(com_google_android_gms_internal_zzabt_zze.zzMc(), com_google_android_gms_internal_zzabt_zze.zzMI(), "add tag");
                a(com_google_android_gms_internal_zzabt_zze.zzMd(), com_google_android_gms_internal_zzabt_zze.zzMJ(), "remove tag");
            }
            int i = 0;
            while (i < com_google_android_gms_internal_zzabt_zze.zzMF().size()) {
                zzabt.zza com_google_android_gms_internal_zzabt_zza = (zzabt.zza) com_google_android_gms_internal_zzabt_zze.zzMF().get(i);
                String str = "Unknown";
                if (hVar.a() && i < com_google_android_gms_internal_zzabt_zze.zzMG().size()) {
                    str = (String) com_google_android_gms_internal_zzabt_zze.zzMG().get(i);
                }
                c a = a(this.k, a(com_google_android_gms_internal_zzabt_zza));
                a.a(com_google_android_gms_internal_zzabt_zze);
                a.a(com_google_android_gms_internal_zzabt_zze, com_google_android_gms_internal_zzabt_zza);
                a.a(com_google_android_gms_internal_zzabt_zze, str);
                i++;
            }
            i = 0;
            while (i < com_google_android_gms_internal_zzabt_zze.zzMK().size()) {
                com_google_android_gms_internal_zzabt_zza = (zzabt.zza) com_google_android_gms_internal_zzabt_zze.zzMK().get(i);
                str = "Unknown";
                if (hVar.a() && i < com_google_android_gms_internal_zzabt_zze.zzMH().size()) {
                    str = (String) com_google_android_gms_internal_zzabt_zze.zzMH().get(i);
                }
                a = a(this.k, a(com_google_android_gms_internal_zzabt_zza));
                a.a(com_google_android_gms_internal_zzabt_zze);
                a.b(com_google_android_gms_internal_zzabt_zze, com_google_android_gms_internal_zzabt_zza);
                a.b(com_google_android_gms_internal_zzabt_zze, str);
                i++;
            }
        }
        for (Entry entry : this.b.zzMC().entrySet()) {
            for (zzabt.zza com_google_android_gms_internal_zzabt_zza2 : (List) entry.getValue()) {
                if (!zzdl.zzk((zza) com_google_android_gms_internal_zzabt_zza2.zzLY().get(zzae.NOT_DEFAULT_MACRO.toString())).booleanValue()) {
                    a(this.k, (String) entry.getKey()).a(com_google_android_gms_internal_zzabt_zza2);
                }
            }
        }
    }

    private as<zza> a(zza com_google_android_gms_internal_zzag_zza, Set<String> set, bx bxVar) {
        if (!com_google_android_gms_internal_zzag_zza.zzjT) {
            return new as(com_google_android_gms_internal_zzag_zza, true);
        }
        zza zzo;
        int i;
        as a;
        String str;
        String valueOf;
        switch (com_google_android_gms_internal_zzag_zza.type) {
            case 2:
                zzo = zzabt.zzo(com_google_android_gms_internal_zzag_zza);
                zzo.zzjK = new zza[com_google_android_gms_internal_zzag_zza.zzjK.length];
                for (i = 0; i < com_google_android_gms_internal_zzag_zza.zzjK.length; i++) {
                    a = a(com_google_android_gms_internal_zzag_zza.zzjK[i], (Set) set, bxVar.a(i));
                    if (a == a) {
                        return a;
                    }
                    zzo.zzjK[i] = (zza) a.a();
                }
                return new as(zzo, false);
            case 3:
                zzo = zzabt.zzo(com_google_android_gms_internal_zzag_zza);
                if (com_google_android_gms_internal_zzag_zza.zzjL.length != com_google_android_gms_internal_zzag_zza.zzjM.length) {
                    str = "Invalid serving value: ";
                    valueOf = String.valueOf(com_google_android_gms_internal_zzag_zza.toString());
                    zzbn.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return a;
                }
                zzo.zzjL = new zza[com_google_android_gms_internal_zzag_zza.zzjL.length];
                zzo.zzjM = new zza[com_google_android_gms_internal_zzag_zza.zzjL.length];
                for (i = 0; i < com_google_android_gms_internal_zzag_zza.zzjL.length; i++) {
                    a = a(com_google_android_gms_internal_zzag_zza.zzjL[i], (Set) set, bxVar.b(i));
                    as a2 = a(com_google_android_gms_internal_zzag_zza.zzjM[i], (Set) set, bxVar.c(i));
                    if (a == a || a2 == a) {
                        return a;
                    }
                    zzo.zzjL[i] = (zza) a.a();
                    zzo.zzjM[i] = (zza) a2.a();
                }
                return new as(zzo, false);
            case 4:
                if (set.contains(com_google_android_gms_internal_zzag_zza.zzjN)) {
                    valueOf = String.valueOf(com_google_android_gms_internal_zzag_zza.zzjN);
                    str = String.valueOf(set.toString());
                    zzbn.e(new StringBuilder((String.valueOf(valueOf).length() + 79) + String.valueOf(str).length()).append("Macro cycle detected.  Current macro reference: ").append(valueOf).append(".  Previous macro references: ").append(str).append(".").toString());
                    return a;
                }
                set.add(com_google_android_gms_internal_zzag_zza.zzjN);
                as<zza> a3 = by.a(a(com_google_android_gms_internal_zzag_zza.zzjN, (Set) set, bxVar.a()), com_google_android_gms_internal_zzag_zza.zzjS);
                set.remove(com_google_android_gms_internal_zzag_zza.zzjN);
                return a3;
            case 7:
                zzo = zzabt.zzo(com_google_android_gms_internal_zzag_zza);
                zzo.zzjR = new zza[com_google_android_gms_internal_zzag_zza.zzjR.length];
                for (i = 0; i < com_google_android_gms_internal_zzag_zza.zzjR.length; i++) {
                    a = a(com_google_android_gms_internal_zzag_zza.zzjR[i], (Set) set, bxVar.d(i));
                    if (a == a) {
                        return a;
                    }
                    zzo.zzjR[i] = (zza) a.a();
                }
                return new as(zzo, false);
            default:
                zzbn.e("Unknown type: " + com_google_android_gms_internal_zzag_zza.type);
                return a;
        }
    }

    private as<zza> a(String str, Set<String> set, af afVar) {
        this.m++;
        b bVar = (b) this.h.a(str);
        if (bVar == null || this.c.a()) {
            c cVar = (c) this.k.get(str);
            String valueOf;
            if (cVar == null) {
                valueOf = String.valueOf(b());
                zzbn.e(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(str).length()).append(valueOf).append("Invalid macro: ").append(str).toString());
                this.m--;
                return a;
            }
            zzabt.zza f;
            as a = a(str, cVar.a(), cVar.b(), cVar.c(), cVar.e(), cVar.d(), set, afVar.b());
            if (((Set) a.a()).isEmpty()) {
                f = cVar.f();
            } else {
                if (((Set) a.a()).size() > 1) {
                    valueOf = String.valueOf(b());
                    zzbn.zzaW(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append(valueOf).append("Multiple macros active for macroName ").append(str).toString());
                }
                f = (zzabt.zza) ((Set) a.a()).iterator().next();
            }
            if (f == null) {
                this.m--;
                return a;
            }
            as a2 = a(this.f, f, (Set) set, afVar.a());
            boolean z = a.b() && a2.b();
            as<zza> asVar = a2 == a ? a : new as((zza) a2.a(), z);
            zza zzKu = f.zzKu();
            if (asVar.b()) {
                this.h.a(str, new b(asVar, zzKu));
            }
            a(zzKu, (Set) set);
            this.m--;
            return asVar;
        }
        a(bVar.b(), (Set) set);
        this.m--;
        return bVar.a();
    }

    private as<zza> a(Map<String, k> map, zzabt.zza com_google_android_gms_internal_zzabt_zza, Set<String> set, bc bcVar) {
        boolean z = true;
        zza com_google_android_gms_internal_zzag_zza = (zza) com_google_android_gms_internal_zzabt_zza.zzLY().get(zzae.FUNCTION.toString());
        if (com_google_android_gms_internal_zzag_zza == null) {
            zzbn.e("No function id in properties");
            return a;
        }
        String str = com_google_android_gms_internal_zzag_zza.zzjO;
        k kVar = (k) map.get(str);
        if (kVar == null) {
            zzbn.e(String.valueOf(str).concat(" has no backing implementation."));
            return a;
        }
        as<zza> asVar = (as) this.g.a(com_google_android_gms_internal_zzabt_zza);
        if (asVar != null && !this.c.a()) {
            return asVar;
        }
        Map hashMap = new HashMap();
        boolean z2 = true;
        for (Entry entry : com_google_android_gms_internal_zzabt_zza.zzLY().entrySet()) {
            as a = a((zza) entry.getValue(), (Set) set, bcVar.a((String) entry.getKey()).a((zza) entry.getValue()));
            if (a == a) {
                return a;
            }
            boolean z3;
            if (a.b()) {
                com_google_android_gms_internal_zzabt_zza.zza((String) entry.getKey(), (zza) a.a());
                z3 = z2;
            } else {
                z3 = false;
            }
            hashMap.put((String) entry.getKey(), (zza) a.a());
            z2 = z3;
        }
        if (kVar.zze(hashMap.keySet())) {
            if (!(z2 && kVar.zzJf())) {
                z = false;
            }
            asVar = new as(kVar.zzV(hashMap), z);
            if (z) {
                this.g.a(com_google_android_gms_internal_zzabt_zza, asVar);
            }
            bcVar.a((zza) asVar.a());
            return asVar;
        }
        String valueOf = String.valueOf(kVar.zzJP());
        String valueOf2 = String.valueOf(hashMap.keySet());
        zzbn.e(new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Incorrect keys for function ").append(str).append(" required ").append(valueOf).append(" had ").append(valueOf2).toString());
        return a;
    }

    private as<Set<zzabt.zza>> a(Set<zze> set, Set<String> set2, a aVar, bj bjVar) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (zze com_google_android_gms_internal_zzabt_zze : set) {
            bf a = bjVar.a();
            as a2 = a(com_google_android_gms_internal_zzabt_zze, (Set) set2, a);
            if (((Boolean) a2.a()).booleanValue()) {
                aVar.a(com_google_android_gms_internal_zzabt_zze, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.b();
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        bjVar.a(hashSet);
        return new as(hashSet, z);
    }

    private static c a(Map<String, c> map, String str) {
        c cVar = (c) map.get(str);
        if (cVar != null) {
            return cVar;
        }
        cVar = new c();
        map.put(str, cVar);
        return cVar;
    }

    private static String a(zzabt.zza com_google_android_gms_internal_zzabt_zza) {
        return zzdl.zzg((zza) com_google_android_gms_internal_zzabt_zza.zzLY().get(zzae.INSTANCE_NAME.toString()));
    }

    private void a(zza com_google_android_gms_internal_zzag_zza, Set<String> set) {
        if (com_google_android_gms_internal_zzag_zza != null) {
            as a = a(com_google_android_gms_internal_zzag_zza, (Set) set, new aq());
            if (a != a) {
                Object zzl = zzdl.zzl((zza) a.a());
                if (zzl instanceof Map) {
                    this.j.push((Map) zzl);
                } else if (zzl instanceof List) {
                    for (Object zzl2 : (List) zzl2) {
                        if (zzl2 instanceof Map) {
                            this.j.push((Map) zzl2);
                        } else {
                            zzbn.zzaW("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    zzbn.zzaW("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    private static void a(List<zzabt.zza> list, List<String> list2, String str) {
        if (list.size() != list2.size()) {
            zzbn.zzaV(new StringBuilder(String.valueOf(str).length() + 102).append("Invalid resource: imbalance of rule names of functions for ").append(str).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map<String, k> map, k kVar) {
        if (map.containsKey(kVar.zzJO())) {
            String str = "Duplicate function type name: ";
            String valueOf = String.valueOf(kVar.zzJO());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        map.put(kVar.zzJO(), kVar);
    }

    private String b() {
        if (this.m <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.m));
        for (int i = 2; i < this.m; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    as<Boolean> a(zzabt.zza com_google_android_gms_internal_zzabt_zza, Set<String> set, bc bcVar) {
        as a = a(this.e, com_google_android_gms_internal_zzabt_zza, (Set) set, bcVar);
        Boolean zzk = zzdl.zzk((zza) a.a());
        bcVar.a(zzdl.zzQ(zzk));
        return new as(zzk, a.b());
    }

    as<Boolean> a(zze com_google_android_gms_internal_zzabt_zze, Set<String> set, bf bfVar) {
        boolean z = true;
        for (zzabt.zza a : com_google_android_gms_internal_zzabt_zze.zzMb()) {
            as a2 = a(a, (Set) set, bfVar.a());
            if (((Boolean) a2.a()).booleanValue()) {
                bfVar.a(zzdl.zzQ(Boolean.valueOf(false)));
                return new as(Boolean.valueOf(false), a2.b());
            }
            boolean z2 = z && a2.b();
            z = z2;
        }
        for (zzabt.zza a3 : com_google_android_gms_internal_zzabt_zze.zzMa()) {
            a2 = a(a3, (Set) set, bfVar.b());
            if (((Boolean) a2.a()).booleanValue()) {
                z = z && a2.b();
            } else {
                bfVar.a(zzdl.zzQ(Boolean.valueOf(false)));
                return new as(Boolean.valueOf(false), a2.b());
            }
        }
        bfVar.a(zzdl.zzQ(Boolean.valueOf(true)));
        return new as(Boolean.valueOf(true), z);
    }

    as<Set<zzabt.zza>> a(String str, Set<zze> set, Map<zze, List<zzabt.zza>> map, Map<zze, List<String>> map2, Map<zze, List<zzabt.zza>> map3, Map<zze, List<String>> map4, Set<String> set2, bj bjVar) {
        final Map<zze, List<zzabt.zza>> map5 = map;
        final Map<zze, List<String>> map6 = map2;
        final Map<zze, List<zzabt.zza>> map7 = map3;
        final Map<zze, List<String>> map8 = map4;
        return a((Set) set, (Set) set2, new a(this) {
            final /* synthetic */ bk e;

            public void a(zze com_google_android_gms_internal_zzabt_zze, Set<zzabt.zza> set, Set<zzabt.zza> set2, bf bfVar) {
                List list = (List) map5.get(com_google_android_gms_internal_zzabt_zze);
                List list2 = (List) map6.get(com_google_android_gms_internal_zzabt_zze);
                if (list != null) {
                    set.addAll(list);
                    bfVar.c().zzc(list, list2);
                }
                list = (List) map7.get(com_google_android_gms_internal_zzabt_zze);
                list2 = (List) map8.get(com_google_android_gms_internal_zzabt_zze);
                if (list != null) {
                    set2.addAll(list);
                    bfVar.d().zzc(list, list2);
                }
            }
        }, bjVar);
    }

    as<Set<zzabt.zza>> a(Set<zze> set, bj bjVar) {
        return a((Set) set, new HashSet(), new a(this) {
            final /* synthetic */ bk a;

            {
                this.a = r1;
            }

            public void a(zze com_google_android_gms_internal_zzabt_zze, Set<zzabt.zza> set, Set<zzabt.zza> set2, bf bfVar) {
                set.addAll(com_google_android_gms_internal_zzabt_zze.zzMc());
                set2.addAll(com_google_android_gms_internal_zzabt_zze.zzMd());
                bfVar.e().zzc(com_google_android_gms_internal_zzabt_zze.zzMc(), com_google_android_gms_internal_zzabt_zze.zzMI());
                bfVar.f().zzc(com_google_android_gms_internal_zzabt_zze.zzMd(), com_google_android_gms_internal_zzabt_zze.zzMJ());
            }
        }, bjVar);
    }

    synchronized String a() {
        return this.l;
    }

    void a(k kVar) {
        a(this.f, kVar);
    }

    public synchronized void a(String str) {
        c(str);
        g b = this.c.b(str);
        cj b2 = b.b();
        for (zzabt.zza a : (Set) a(this.i, b2.b()).a()) {
            a(this.d, a, new HashSet(), b2.a());
        }
        b.c();
        c(null);
    }

    public synchronized void a(List<zzi> list) {
        for (zzi com_google_android_gms_internal_zzaf_zzi : list) {
            if (com_google_android_gms_internal_zzaf_zzi.name == null || !com_google_android_gms_internal_zzaf_zzi.name.startsWith("gaExperiment:")) {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzaf_zzi);
                zzbn.v(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Ignored supplemental: ").append(valueOf).toString());
            } else {
                j.a(this.j, com_google_android_gms_internal_zzaf_zzi);
            }
        }
    }

    public as<zza> b(String str) {
        this.m = 0;
        g a = this.c.a(str);
        as<zza> a2 = a(str, new HashSet(), a.a());
        a.c();
        return a2;
    }

    void b(k kVar) {
        a(this.d, kVar);
    }

    void c(k kVar) {
        a(this.e, kVar);
    }

    synchronized void c(String str) {
        this.l = str;
    }
}
