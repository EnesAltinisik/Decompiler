package com.google.android.gms.internal;

import com.google.android.gms.internal.zzaf.zzh;
import com.google.android.gms.tagmanager.zzbn;
import com.google.android.gms.tagmanager.zzdl;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class zzabt {

    public static class zza {
        private final com.google.android.gms.internal.zzag.zza zzbqS;
        private final Map<String, com.google.android.gms.internal.zzag.zza> zzbvr;

        private zza(Map<String, com.google.android.gms.internal.zzag.zza> map, com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) {
            this.zzbvr = map;
            this.zzbqS = com_google_android_gms_internal_zzag_zza;
        }

        public static zzb zzMz() {
            return new zzb();
        }

        public String toString() {
            String valueOf = String.valueOf(zzLY());
            String valueOf2 = String.valueOf(this.zzbqS);
            return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
        }

        public com.google.android.gms.internal.zzag.zza zzKu() {
            return this.zzbqS;
        }

        public Map<String, com.google.android.gms.internal.zzag.zza> zzLY() {
            return Collections.unmodifiableMap(this.zzbvr);
        }

        public void zza(String str, com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) {
            this.zzbvr.put(str, com_google_android_gms_internal_zzag_zza);
        }
    }

    public static class zzb {
        private com.google.android.gms.internal.zzag.zza zzbqS;
        private final Map<String, com.google.android.gms.internal.zzag.zza> zzbvr;

        private zzb() {
            this.zzbvr = new HashMap();
        }

        public zza zzMA() {
            return new zza(this.zzbvr, this.zzbqS);
        }

        public zzb zzb(String str, com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) {
            this.zzbvr.put(str, com_google_android_gms_internal_zzag_zza);
            return this;
        }

        public zzb zzq(com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) {
            this.zzbqS = com_google_android_gms_internal_zzag_zza;
            return this;
        }
    }

    public static class zzc {
        private final String zzahE;
        private final List<zze> zzbvo;
        private final Map<String, List<zza>> zzbvp;
        private final int zzbvq;

        private zzc(List<zze> list, Map<String, List<zza>> map, String str, int i) {
            this.zzbvo = Collections.unmodifiableList(list);
            this.zzbvp = Collections.unmodifiableMap(map);
            this.zzahE = str;
            this.zzbvq = i;
        }

        public static zzd zzMB() {
            return new zzd();
        }

        public String getVersion() {
            return this.zzahE;
        }

        public String toString() {
            String valueOf = String.valueOf(zzLW());
            String valueOf2 = String.valueOf(this.zzbvp);
            return new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(valueOf2).length()).append("Rules: ").append(valueOf).append("  Macros: ").append(valueOf2).toString();
        }

        public List<zze> zzLW() {
            return this.zzbvo;
        }

        public Map<String, List<zza>> zzMC() {
            return this.zzbvp;
        }
    }

    public static class zzd {
        private String zzahE;
        private final List<zze> zzbvo;
        private final Map<String, List<zza>> zzbvp;
        private int zzbvq;

        private zzd() {
            this.zzbvo = new ArrayList();
            this.zzbvp = new HashMap();
            this.zzahE = "";
            this.zzbvq = 0;
        }

        public zzc zzMD() {
            return new zzc(this.zzbvo, this.zzbvp, this.zzahE, this.zzbvq);
        }

        public zzd zzb(zze com_google_android_gms_internal_zzabt_zze) {
            this.zzbvo.add(com_google_android_gms_internal_zzabt_zze);
            return this;
        }

        public zzd zzc(zza com_google_android_gms_internal_zzabt_zza) {
            String zzg = zzdl.zzg((com.google.android.gms.internal.zzag.zza) com_google_android_gms_internal_zzabt_zza.zzLY().get(zzae.INSTANCE_NAME.toString()));
            List list = (List) this.zzbvp.get(zzg);
            if (list == null) {
                list = new ArrayList();
                this.zzbvp.put(zzg, list);
            }
            list.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzd zzhx(String str) {
            this.zzahE = str;
            return this;
        }

        public zzd zzlc(int i) {
            this.zzbvq = i;
            return this;
        }
    }

    public static class zze {
        private final List<zza> zzbvt;
        private final List<zza> zzbvu;
        private final List<zza> zzbvv;
        private final List<zza> zzbvw;
        private final List<zza> zzbwc;
        private final List<zza> zzbwd;
        private final List<String> zzbwe;
        private final List<String> zzbwf;
        private final List<String> zzbwg;
        private final List<String> zzbwh;

        private zze(List<zza> list, List<zza> list2, List<zza> list3, List<zza> list4, List<zza> list5, List<zza> list6, List<String> list7, List<String> list8, List<String> list9, List<String> list10) {
            this.zzbvt = Collections.unmodifiableList(list);
            this.zzbvu = Collections.unmodifiableList(list2);
            this.zzbvv = Collections.unmodifiableList(list3);
            this.zzbvw = Collections.unmodifiableList(list4);
            this.zzbwc = Collections.unmodifiableList(list5);
            this.zzbwd = Collections.unmodifiableList(list6);
            this.zzbwe = Collections.unmodifiableList(list7);
            this.zzbwf = Collections.unmodifiableList(list8);
            this.zzbwg = Collections.unmodifiableList(list9);
            this.zzbwh = Collections.unmodifiableList(list10);
        }

        public static zzf zzME() {
            return new zzf();
        }

        public String toString() {
            String valueOf = String.valueOf(zzMa());
            String valueOf2 = String.valueOf(zzMb());
            String valueOf3 = String.valueOf(zzMc());
            String valueOf4 = String.valueOf(zzMd());
            String valueOf5 = String.valueOf(zzMF());
            String valueOf6 = String.valueOf(zzMK());
            return new StringBuilder((((((String.valueOf(valueOf).length() + 102) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).append("  Add macros: ").append(valueOf5).append("  Remove macros: ").append(valueOf6).toString();
        }

        public List<zza> zzMF() {
            return this.zzbwc;
        }

        public List<String> zzMG() {
            return this.zzbwe;
        }

        public List<String> zzMH() {
            return this.zzbwf;
        }

        public List<String> zzMI() {
            return this.zzbwg;
        }

        public List<String> zzMJ() {
            return this.zzbwh;
        }

        public List<zza> zzMK() {
            return this.zzbwd;
        }

        public List<zza> zzMa() {
            return this.zzbvt;
        }

        public List<zza> zzMb() {
            return this.zzbvu;
        }

        public List<zza> zzMc() {
            return this.zzbvv;
        }

        public List<zza> zzMd() {
            return this.zzbvw;
        }
    }

    public static class zzf {
        private final List<zza> zzbvt;
        private final List<zza> zzbvu;
        private final List<zza> zzbvv;
        private final List<zza> zzbvw;
        private final List<zza> zzbwc;
        private final List<zza> zzbwd;
        private final List<String> zzbwe;
        private final List<String> zzbwf;
        private final List<String> zzbwg;
        private final List<String> zzbwh;

        private zzf() {
            this.zzbvt = new ArrayList();
            this.zzbvu = new ArrayList();
            this.zzbvv = new ArrayList();
            this.zzbvw = new ArrayList();
            this.zzbwc = new ArrayList();
            this.zzbwd = new ArrayList();
            this.zzbwe = new ArrayList();
            this.zzbwf = new ArrayList();
            this.zzbwg = new ArrayList();
            this.zzbwh = new ArrayList();
        }

        public zze zzML() {
            return new zze(this.zzbvt, this.zzbvu, this.zzbvv, this.zzbvw, this.zzbwc, this.zzbwd, this.zzbwe, this.zzbwf, this.zzbwg, this.zzbwh);
        }

        public zzf zzd(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbvt.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzf zze(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbvu.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzf zzf(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbvv.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzf zzg(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbvw.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzf zzh(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbwc.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }

        public zzf zzhA(String str) {
            this.zzbwe.add(str);
            return this;
        }

        public zzf zzhB(String str) {
            this.zzbwf.add(str);
            return this;
        }

        public zzf zzhy(String str) {
            this.zzbwg.add(str);
            return this;
        }

        public zzf zzhz(String str) {
            this.zzbwh.add(str);
            return this;
        }

        public zzf zzi(zza com_google_android_gms_internal_zzabt_zza) {
            this.zzbwd.add(com_google_android_gms_internal_zzabt_zza);
            return this;
        }
    }

    public static class zzg extends Exception {
        public zzg(String str) {
            super(str);
        }
    }

    private static zza zza(com.google.android.gms.internal.zzaf.zzb com_google_android_gms_internal_zzaf_zzb, com.google.android.gms.internal.zzaf.zzf com_google_android_gms_internal_zzaf_zzf, com.google.android.gms.internal.zzag.zza[] com_google_android_gms_internal_zzag_zzaArr, int i) throws zzg {
        zzb zzMz = zza.zzMz();
        for (int valueOf : com_google_android_gms_internal_zzaf_zzb.zziF) {
            com.google.android.gms.internal.zzaf.zze com_google_android_gms_internal_zzaf_zze = (com.google.android.gms.internal.zzaf.zze) zza(com_google_android_gms_internal_zzaf_zzf.zziV, Integer.valueOf(valueOf).intValue(), "properties");
            String str = (String) zza(com_google_android_gms_internal_zzaf_zzf.zziT, com_google_android_gms_internal_zzaf_zze.key, "keys");
            com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza = (com.google.android.gms.internal.zzag.zza) zza(com_google_android_gms_internal_zzag_zzaArr, com_google_android_gms_internal_zzaf_zze.value, "values");
            if (zzae.PUSH_AFTER_EVALUATE.toString().equals(str)) {
                zzMz.zzq(com_google_android_gms_internal_zzag_zza);
            } else {
                zzMz.zzb(str, com_google_android_gms_internal_zzag_zza);
            }
        }
        return zzMz.zzMA();
    }

    private static zze zza(com.google.android.gms.internal.zzaf.zzg com_google_android_gms_internal_zzaf_zzg, List<zza> list, List<zza> list2, List<zza> list3, com.google.android.gms.internal.zzaf.zzf com_google_android_gms_internal_zzaf_zzf) {
        zzf zzME = zze.zzME();
        for (int valueOf : com_google_android_gms_internal_zzaf_zzg.zzjj) {
            zzME.zzd((zza) list3.get(Integer.valueOf(valueOf).intValue()));
        }
        for (int valueOf2 : com_google_android_gms_internal_zzaf_zzg.zzjk) {
            zzME.zze((zza) list3.get(Integer.valueOf(valueOf2).intValue()));
        }
        for (int valueOf22 : com_google_android_gms_internal_zzaf_zzg.zzjl) {
            zzME.zzf((zza) list.get(Integer.valueOf(valueOf22).intValue()));
        }
        for (int valueOf3 : com_google_android_gms_internal_zzaf_zzg.zzjn) {
            zzME.zzhy(com_google_android_gms_internal_zzaf_zzf.zziU[Integer.valueOf(valueOf3).intValue()].zzjJ);
        }
        for (int valueOf222 : com_google_android_gms_internal_zzaf_zzg.zzjm) {
            zzME.zzg((zza) list.get(Integer.valueOf(valueOf222).intValue()));
        }
        for (int valueOf32 : com_google_android_gms_internal_zzaf_zzg.zzjo) {
            zzME.zzhz(com_google_android_gms_internal_zzaf_zzf.zziU[Integer.valueOf(valueOf32).intValue()].zzjJ);
        }
        for (int valueOf2222 : com_google_android_gms_internal_zzaf_zzg.zzjp) {
            zzME.zzh((zza) list2.get(Integer.valueOf(valueOf2222).intValue()));
        }
        for (int valueOf322 : com_google_android_gms_internal_zzaf_zzg.zzjr) {
            zzME.zzhA(com_google_android_gms_internal_zzaf_zzf.zziU[Integer.valueOf(valueOf322).intValue()].zzjJ);
        }
        for (int valueOf22222 : com_google_android_gms_internal_zzaf_zzg.zzjq) {
            zzME.zzi((zza) list2.get(Integer.valueOf(valueOf22222).intValue()));
        }
        for (int valueOf4 : com_google_android_gms_internal_zzaf_zzg.zzjs) {
            zzME.zzhB(com_google_android_gms_internal_zzaf_zzf.zziU[Integer.valueOf(valueOf4).intValue()].zzjJ);
        }
        return zzME.zzML();
    }

    private static com.google.android.gms.internal.zzag.zza zza(int i, com.google.android.gms.internal.zzaf.zzf com_google_android_gms_internal_zzaf_zzf, com.google.android.gms.internal.zzag.zza[] com_google_android_gms_internal_zzag_zzaArr, Set<Integer> set) throws zzg {
        int i2 = 0;
        if (set.contains(Integer.valueOf(i))) {
            String valueOf = String.valueOf(set);
            zzhi(new StringBuilder(String.valueOf(valueOf).length() + 90).append("Value cycle detected.  Current value reference: ").append(i).append(".  Previous value references: ").append(valueOf).append(".").toString());
        }
        com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza = (com.google.android.gms.internal.zzag.zza) zza(com_google_android_gms_internal_zzaf_zzf.zziU, i, "values");
        if (com_google_android_gms_internal_zzag_zzaArr[i] != null) {
            return com_google_android_gms_internal_zzag_zzaArr[i];
        }
        com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza2 = null;
        set.add(Integer.valueOf(i));
        zzh zzp;
        int[] iArr;
        int length;
        int i3;
        int i4;
        switch (com_google_android_gms_internal_zzag_zza.type) {
            case 1:
            case 5:
            case 6:
            case 8:
                com_google_android_gms_internal_zzag_zza2 = com_google_android_gms_internal_zzag_zza;
                break;
            case 2:
                zzp = zzp(com_google_android_gms_internal_zzag_zza);
                com_google_android_gms_internal_zzag_zza2 = zzo(com_google_android_gms_internal_zzag_zza);
                com_google_android_gms_internal_zzag_zza2.zzjK = new com.google.android.gms.internal.zzag.zza[zzp.zzjv.length];
                iArr = zzp.zzjv;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzag_zza2.zzjK[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 3:
                com_google_android_gms_internal_zzag_zza2 = zzo(com_google_android_gms_internal_zzag_zza);
                zzh zzp2 = zzp(com_google_android_gms_internal_zzag_zza);
                if (zzp2.zzjw.length != zzp2.zzjx.length) {
                    i3 = zzp2.zzjw.length;
                    zzhi("Uneven map keys (" + i3 + ") and map values (" + zzp2.zzjx.length + ")");
                }
                com_google_android_gms_internal_zzag_zza2.zzjL = new com.google.android.gms.internal.zzag.zza[zzp2.zzjw.length];
                com_google_android_gms_internal_zzag_zza2.zzjM = new com.google.android.gms.internal.zzag.zza[zzp2.zzjw.length];
                int[] iArr2 = zzp2.zzjw;
                int length2 = iArr2.length;
                i3 = 0;
                i4 = 0;
                while (i3 < length2) {
                    int i5 = i4 + 1;
                    com_google_android_gms_internal_zzag_zza2.zzjL[i4] = zza(iArr2[i3], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, (Set) set);
                    i3++;
                    i4 = i5;
                }
                iArr = zzp2.zzjx;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzag_zza2.zzjM[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
            case 4:
                com_google_android_gms_internal_zzag_zza2 = zzo(com_google_android_gms_internal_zzag_zza);
                com_google_android_gms_internal_zzag_zza2.zzjN = zzdl.zzg(zza(zzp(com_google_android_gms_internal_zzag_zza).zzjA, com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, (Set) set));
                break;
            case 7:
                com_google_android_gms_internal_zzag_zza2 = zzo(com_google_android_gms_internal_zzag_zza);
                zzp = zzp(com_google_android_gms_internal_zzag_zza);
                com_google_android_gms_internal_zzag_zza2.zzjR = new com.google.android.gms.internal.zzag.zza[zzp.zzjz.length];
                iArr = zzp.zzjz;
                length = iArr.length;
                i3 = 0;
                while (i2 < length) {
                    i4 = i3 + 1;
                    com_google_android_gms_internal_zzag_zza2.zzjR[i3] = zza(iArr[i2], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, (Set) set);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        if (com_google_android_gms_internal_zzag_zza2 == null) {
            valueOf = String.valueOf(com_google_android_gms_internal_zzag_zza);
            zzhi(new StringBuilder(String.valueOf(valueOf).length() + 15).append("Invalid value: ").append(valueOf).toString());
        }
        com_google_android_gms_internal_zzag_zzaArr[i] = com_google_android_gms_internal_zzag_zza2;
        set.remove(Integer.valueOf(i));
        return com_google_android_gms_internal_zzag_zza2;
    }

    private static <T> T zza(T[] tArr, int i, String str) throws zzg {
        if (i < 0 || i >= tArr.length) {
            zzhi(new StringBuilder(String.valueOf(str).length() + 45).append("Index out of bounds detected: ").append(i).append(" in ").append(str).toString());
        }
        return tArr[i];
    }

    public static zzc zzb(com.google.android.gms.internal.zzaf.zzf com_google_android_gms_internal_zzaf_zzf) throws zzg {
        int i;
        int i2 = 0;
        com.google.android.gms.internal.zzag.zza[] com_google_android_gms_internal_zzag_zzaArr = new com.google.android.gms.internal.zzag.zza[com_google_android_gms_internal_zzaf_zzf.zziU.length];
        for (i = 0; i < com_google_android_gms_internal_zzaf_zzf.zziU.length; i++) {
            zza(i, com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, new HashSet(0));
        }
        zzd zzMB = zzc.zzMB();
        List arrayList = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaf_zzf.zziX.length; i++) {
            arrayList.add(zza(com_google_android_gms_internal_zzaf_zzf.zziX[i], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, i));
        }
        List arrayList2 = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaf_zzf.zziY.length; i++) {
            arrayList2.add(zza(com_google_android_gms_internal_zzaf_zzf.zziY[i], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, i));
        }
        List arrayList3 = new ArrayList();
        for (i = 0; i < com_google_android_gms_internal_zzaf_zzf.zziW.length; i++) {
            zza zza = zza(com_google_android_gms_internal_zzaf_zzf.zziW[i], com_google_android_gms_internal_zzaf_zzf, com_google_android_gms_internal_zzag_zzaArr, i);
            zzMB.zzc(zza);
            arrayList3.add(zza);
        }
        com.google.android.gms.internal.zzaf.zzg[] com_google_android_gms_internal_zzaf_zzgArr = com_google_android_gms_internal_zzaf_zzf.zziZ;
        int length = com_google_android_gms_internal_zzaf_zzgArr.length;
        while (i2 < length) {
            zzMB.zzb(zza(com_google_android_gms_internal_zzaf_zzgArr[i2], arrayList, arrayList3, arrayList2, com_google_android_gms_internal_zzaf_zzf));
            i2++;
        }
        zzMB.zzhx(com_google_android_gms_internal_zzaf_zzf.version);
        zzMB.zzlc(com_google_android_gms_internal_zzaf_zzf.zzjh);
        return zzMB.zzMD();
    }

    public static void zzc(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static void zzhi(String str) throws zzg {
        zzbn.e(str);
        throw new zzg(str);
    }

    public static com.google.android.gms.internal.zzag.zza zzo(com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) {
        com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza2 = new com.google.android.gms.internal.zzag.zza();
        com_google_android_gms_internal_zzag_zza2.type = com_google_android_gms_internal_zzag_zza.type;
        com_google_android_gms_internal_zzag_zza2.zzjS = (int[]) com_google_android_gms_internal_zzag_zza.zzjS.clone();
        if (com_google_android_gms_internal_zzag_zza.zzjT) {
            com_google_android_gms_internal_zzag_zza2.zzjT = com_google_android_gms_internal_zzag_zza.zzjT;
        }
        return com_google_android_gms_internal_zzag_zza2;
    }

    private static zzh zzp(com.google.android.gms.internal.zzag.zza com_google_android_gms_internal_zzag_zza) throws zzg {
        if (((zzh) com_google_android_gms_internal_zzag_zza.getExtension(zzh.zzjt)) == null) {
            String valueOf = String.valueOf(com_google_android_gms_internal_zzag_zza);
            zzhi(new StringBuilder(String.valueOf(valueOf).length() + 54).append("Expected a ServingValue and didn't get one. Value is: ").append(valueOf).toString());
        }
        return (zzh) com_google_android_gms_internal_zzag_zza.getExtension(zzh.zzjt);
    }
}
