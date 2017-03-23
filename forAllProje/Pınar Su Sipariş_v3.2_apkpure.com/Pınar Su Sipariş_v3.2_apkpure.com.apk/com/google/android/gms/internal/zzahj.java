package com.google.android.gms.internal;

import com.google.android.gms.internal.zzadx.zzb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class zzahj implements zzahu {
    static final /* synthetic */ boolean $assertionsDisabled = (!zzahj.class.desiredAssertionStatus());
    public static Comparator<zzahi> zzbQD = new Comparator<zzahi>() {
        public int a(zzahi com_google_android_gms_internal_zzahi, zzahi com_google_android_gms_internal_zzahi2) {
            return com_google_android_gms_internal_zzahi.zzi(com_google_android_gms_internal_zzahi2);
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return a((zzahi) obj, (zzahi) obj2);
        }
    };
    private final zzads<zzahi, zzahu> zzbPc;
    private final zzahu zzbQE;
    private String zzbQF;

    public static abstract class zza extends zzb<zzahi, zzahu> {
        public abstract void zzb(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu);

        public void zzf(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
            zzb(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
        }

        public /* synthetic */ void zzk(Object obj, Object obj2) {
            zzf((zzahi) obj, (zzahu) obj2);
        }
    }

    private static class a implements Iterator<zzaht> {
        private final Iterator<Entry<zzahi, zzahu>> a;

        public a(Iterator<Entry<zzahi, zzahu>> it) {
            this.a = it;
        }

        public zzaht a() {
            Entry entry = (Entry) this.a.next();
            return new zzaht((zzahi) entry.getKey(), (zzahu) entry.getValue());
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public void remove() {
            this.a.remove();
        }
    }

    protected zzahj() {
        this.zzbQF = null;
        this.zzbPc = com.google.android.gms.internal.zzads.zza.zza(zzbQD);
        this.zzbQE = zzahy.zzTM();
    }

    protected zzahj(zzads<zzahi, zzahu> com_google_android_gms_internal_zzads_com_google_android_gms_internal_zzahi__com_google_android_gms_internal_zzahu, zzahu com_google_android_gms_internal_zzahu) {
        this.zzbQF = null;
        if (!com_google_android_gms_internal_zzads_com_google_android_gms_internal_zzahi__com_google_android_gms_internal_zzahu.isEmpty() || com_google_android_gms_internal_zzahu.isEmpty()) {
            this.zzbQE = com_google_android_gms_internal_zzahu;
            this.zzbPc = com_google_android_gms_internal_zzads_com_google_android_gms_internal_zzahi__com_google_android_gms_internal_zzahu;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }

    private static void zzb(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(" ");
        }
    }

    private void zzc(StringBuilder stringBuilder, int i) {
        if (this.zzbPc.isEmpty() && this.zzbQE.isEmpty()) {
            stringBuilder.append("{ }");
            return;
        }
        stringBuilder.append("{\n");
        Iterator it = this.zzbPc.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            zzb(stringBuilder, i + 2);
            stringBuilder.append(((zzahi) entry.getKey()).asString());
            stringBuilder.append("=");
            if (entry.getValue() instanceof zzahj) {
                ((zzahj) entry.getValue()).zzc(stringBuilder, i + 2);
            } else {
                stringBuilder.append(((zzahu) entry.getValue()).toString());
            }
            stringBuilder.append("\n");
        }
        if (!this.zzbQE.isEmpty()) {
            zzb(stringBuilder, i + 2);
            stringBuilder.append(".priority=");
            stringBuilder.append(this.zzbQE.toString());
            stringBuilder.append("\n");
        }
        zzb(stringBuilder, i);
        stringBuilder.append("}");
    }

    public /* synthetic */ int compareTo(Object obj) {
        return zzg((zzahu) obj);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzahj)) {
            return false;
        }
        zzahj com_google_android_gms_internal_zzahj = (zzahj) obj;
        if (!zzTp().equals(com_google_android_gms_internal_zzahj.zzTp())) {
            return false;
        }
        if (this.zzbPc.size() != com_google_android_gms_internal_zzahj.zzbPc.size()) {
            return false;
        }
        Iterator it = this.zzbPc.iterator();
        Iterator it2 = com_google_android_gms_internal_zzahj.zzbPc.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Entry entry2 = (Entry) it2.next();
            if (((zzahi) entry.getKey()).equals(entry2.getKey())) {
                if (!((zzahu) entry.getValue()).equals(entry2.getValue())) {
                }
            }
            return false;
        }
        if (!it.hasNext() && !it2.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    public int getChildCount() {
        return this.zzbPc.size();
    }

    public Object getValue() {
        return getValue(false);
    }

    public Object getValue(boolean z) {
        int i = 0;
        if (isEmpty()) {
            return null;
        }
        Map hashMap = new HashMap();
        Iterator it = this.zzbPc.iterator();
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int i5;
            int i6;
            Entry entry = (Entry) it.next();
            String asString = ((zzahi) entry.getKey()).asString();
            hashMap.put(asString, ((zzahu) entry.getValue()).getValue(z));
            i4++;
            if (i2 != 0) {
                if (asString.length() <= 1 || asString.charAt(0) != '0') {
                    Integer zzio = zzaiv.zzio(asString);
                    if (zzio == null || zzio.intValue() < 0) {
                        i5 = 0;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    } else if (zzio.intValue() > i3) {
                        i3 = zzio.intValue();
                        i5 = i2;
                        i6 = i3;
                        i2 = i5;
                        i3 = i6;
                    }
                } else {
                    i5 = 0;
                    i6 = i3;
                    i2 = i5;
                    i3 = i6;
                }
            }
            i5 = i2;
            i6 = i3;
            i2 = i5;
            i3 = i6;
        }
        if (z || i2 == 0 || i3 >= i4 * 2) {
            if (z && !this.zzbQE.isEmpty()) {
                hashMap.put(".priority", this.zzbQE.getValue());
            }
            return hashMap;
        }
        List arrayList = new ArrayList(i3 + 1);
        while (i <= i3) {
            arrayList.add(hashMap.get(i));
            i++;
        }
        return arrayList;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            zzaht com_google_android_gms_internal_zzaht = (zzaht) it.next();
            i = com_google_android_gms_internal_zzaht.zzPj().hashCode() + (((i * 31) + com_google_android_gms_internal_zzaht.zzTK().hashCode()) * 17);
        }
        return i;
    }

    public boolean isEmpty() {
        return this.zzbPc.isEmpty();
    }

    public Iterator<zzaht> iterator() {
        return new a(this.zzbPc.iterator());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        zzc(stringBuilder, 0);
        return stringBuilder.toString();
    }

    public zzahu zzO(zzafa com_google_android_gms_internal_zzafa) {
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        return zzRt == null ? this : zzm(zzRt).zzO(com_google_android_gms_internal_zzafa.zzRu());
    }

    public Iterator<zzaht> zzPw() {
        return new a(this.zzbPc.zzPw());
    }

    public String zzTn() {
        if (this.zzbQF == null) {
            String zza = zza(com.google.android.gms.internal.zzahu.zza.V1);
            this.zzbQF = zza.isEmpty() ? "" : zzaiv.zzim(zza);
        }
        return this.zzbQF;
    }

    public boolean zzTo() {
        return false;
    }

    public zzahu zzTp() {
        return this.zzbQE;
    }

    public zzahi zzTq() {
        return (zzahi) this.zzbPc.zzPu();
    }

    public zzahi zzTr() {
        return (zzahi) this.zzbPc.zzPv();
    }

    public String zza(com.google.android.gms.internal.zzahu.zza com_google_android_gms_internal_zzahu_zza) {
        if (com_google_android_gms_internal_zzahu_zza != com.google.android.gms.internal.zzahu.zza.V1) {
            throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!this.zzbQE.isEmpty()) {
            stringBuilder.append("priority:");
            stringBuilder.append(this.zzbQE.zza(com.google.android.gms.internal.zzahu.zza.V1));
            stringBuilder.append(":");
        }
        List<zzaht> arrayList = new ArrayList();
        Iterator it = iterator();
        Object obj = null;
        while (it.hasNext()) {
            zzaht com_google_android_gms_internal_zzaht = (zzaht) it.next();
            arrayList.add(com_google_android_gms_internal_zzaht);
            Object obj2 = (obj == null && com_google_android_gms_internal_zzaht.zzPj().zzTp().isEmpty()) ? null : 1;
            obj = obj2;
        }
        if (obj != null) {
            Collections.sort(arrayList, zzahx.zzTL());
        }
        for (zzaht com_google_android_gms_internal_zzaht2 : arrayList) {
            String zzTn = com_google_android_gms_internal_zzaht2.zzPj().zzTn();
            if (!zzTn.equals("")) {
                stringBuilder.append(":");
                stringBuilder.append(com_google_android_gms_internal_zzaht2.zzTK().asString());
                stringBuilder.append(":");
                stringBuilder.append(zzTn);
            }
        }
        return stringBuilder.toString();
    }

    public void zza(zza com_google_android_gms_internal_zzahj_zza) {
        zza(com_google_android_gms_internal_zzahj_zza, false);
    }

    public void zza(final zza com_google_android_gms_internal_zzahj_zza, boolean z) {
        if (!z || zzTp().isEmpty()) {
            this.zzbPc.zza(com_google_android_gms_internal_zzahj_zza);
        } else {
            this.zzbPc.zza(new zzb<zzahi, zzahu>(this) {
                boolean a = false;
                final /* synthetic */ zzahj c;

                public void a(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
                    if (!this.a && com_google_android_gms_internal_zzahi.zzi(zzahi.zzTj()) > 0) {
                        this.a = true;
                        com_google_android_gms_internal_zzahj_zza.zzb(zzahi.zzTj(), this.c.zzTp());
                    }
                    com_google_android_gms_internal_zzahj_zza.zzb(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
                }

                public /* synthetic */ void zzk(Object obj, Object obj2) {
                    a((zzahi) obj, (zzahu) obj2);
                }
            });
        }
    }

    public zzahu zze(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
        if (com_google_android_gms_internal_zzahi.zzTl()) {
            return zzf(com_google_android_gms_internal_zzahu);
        }
        zzads com_google_android_gms_internal_zzads = this.zzbPc;
        if (com_google_android_gms_internal_zzads.containsKey(com_google_android_gms_internal_zzahi)) {
            com_google_android_gms_internal_zzads = com_google_android_gms_internal_zzads.zzad(com_google_android_gms_internal_zzahi);
        }
        if (!com_google_android_gms_internal_zzahu.isEmpty()) {
            com_google_android_gms_internal_zzads = com_google_android_gms_internal_zzads.zzj(com_google_android_gms_internal_zzahi, com_google_android_gms_internal_zzahu);
        }
        return com_google_android_gms_internal_zzads.isEmpty() ? zzahn.zzTA() : new zzahj(com_google_android_gms_internal_zzads, this.zzbQE);
    }

    public zzahu zzf(zzahu com_google_android_gms_internal_zzahu) {
        return this.zzbPc.isEmpty() ? zzahn.zzTA() : new zzahj(this.zzbPc, com_google_android_gms_internal_zzahu);
    }

    public int zzg(zzahu com_google_android_gms_internal_zzahu) {
        return isEmpty() ? com_google_android_gms_internal_zzahu.isEmpty() ? 0 : -1 : com_google_android_gms_internal_zzahu.zzTo() ? 1 : com_google_android_gms_internal_zzahu.isEmpty() ? 1 : com_google_android_gms_internal_zzahu == zzahu.zzbRi ? -1 : 0;
    }

    public boolean zzk(zzahi com_google_android_gms_internal_zzahi) {
        return !zzm(com_google_android_gms_internal_zzahi).isEmpty();
    }

    public zzahi zzl(zzahi com_google_android_gms_internal_zzahi) {
        return (zzahi) this.zzbPc.zzae(com_google_android_gms_internal_zzahi);
    }

    public zzahu zzl(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        if (zzRt == null) {
            return com_google_android_gms_internal_zzahu;
        }
        if (!zzRt.zzTl()) {
            return zze(zzRt, zzm(zzRt).zzl(com_google_android_gms_internal_zzafa.zzRu(), com_google_android_gms_internal_zzahu));
        }
        if ($assertionsDisabled || zzahy.zzp(com_google_android_gms_internal_zzahu)) {
            return zzf(com_google_android_gms_internal_zzahu);
        }
        throw new AssertionError();
    }

    public zzahu zzm(zzahi com_google_android_gms_internal_zzahi) {
        return (!com_google_android_gms_internal_zzahi.zzTl() || this.zzbQE.isEmpty()) ? this.zzbPc.containsKey(com_google_android_gms_internal_zzahi) ? (zzahu) this.zzbPc.get(com_google_android_gms_internal_zzahi) : zzahn.zzTA() : this.zzbQE;
    }
}
