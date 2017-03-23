package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public final class zzabm extends zzabh<List<zzabh<?>>> {
    private static final Map<String, zzvh> zzbvH;
    private final ArrayList<zzabh<?>> zzbvQ;

    static {
        Map hashMap = new HashMap();
        hashMap.put("concat", new zzvk());
        hashMap.put("every", new zzvl());
        hashMap.put("filter", new zzvm());
        hashMap.put("forEach", new zzvn());
        hashMap.put("indexOf", new zzvo());
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        hashMap.put("join", new zzvp());
        hashMap.put("lastIndexOf", new zzvq());
        hashMap.put("map", new zzvr());
        hashMap.put("pop", new zzvs());
        hashMap.put("push", new zzvt());
        hashMap.put("reduce", new zzvu());
        hashMap.put("reduceRight", new zzvv());
        hashMap.put("reverse", new zzvw());
        hashMap.put("shift", new zzvx());
        hashMap.put("slice", new zzvy());
        hashMap.put("some", new zzvz());
        hashMap.put("sort", new zzwa());
        hashMap.put("splice", new zzwb());
        hashMap.put("toString", new zzyh());
        hashMap.put("unshift", new zzwc());
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabm(List<zzabh<?>> list) {
        zzaa.zzz(list);
        this.zzbvQ = new ArrayList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzabm)) {
            return false;
        }
        List list = (List) ((zzabm) obj).zzMk();
        if (this.zzbvQ.size() != list.size()) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (i < this.zzbvQ.size()) {
            boolean equals = this.zzbvQ.get(i) == null ? list.get(i) == null : ((zzabh) this.zzbvQ.get(i)).equals(list.get(i));
            if (!equals) {
                return equals;
            }
            i++;
            z = equals;
        }
        return z;
    }

    public void setSize(int i) {
        zzaa.zzb(i >= 0, (Object) "Invalid array length");
        if (this.zzbvQ.size() != i) {
            if (this.zzbvQ.size() < i) {
                this.zzbvQ.ensureCapacity(i);
                for (int size = this.zzbvQ.size(); size < i; size++) {
                    this.zzbvQ.add(null);
                }
                return;
            }
            this.zzbvQ.subList(i, this.zzbvQ.size()).clear();
        }
    }

    public String toString() {
        return this.zzbvQ.toString();
    }

    public Iterator<zzabh<?>> zzMj() {
        final Iterator anonymousClass1 = new Iterator<zzabh<?>>(this) {
            final /* synthetic */ zzabm a;
            private int b = 0;

            {
                this.a = r2;
            }

            public zzabh<?> a() {
                if (this.b >= this.a.zzbvQ.size()) {
                    throw new NoSuchElementException();
                }
                for (int i = this.b; i < this.a.zzbvQ.size(); i++) {
                    if (this.a.zzbvQ.get(i) != null) {
                        this.b = i;
                        int i2 = this.b;
                        this.b = i2 + 1;
                        return new zzabj(Double.valueOf((double) i2));
                    }
                }
                throw new NoSuchElementException();
            }

            public boolean hasNext() {
                for (int i = this.b; i < this.a.zzbvQ.size(); i++) {
                    if (this.a.zzbvQ.get(i) != null) {
                        return true;
                    }
                }
                return false;
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        final Iterator zzMl = super.zzMl();
        return new Iterator<zzabh<?>>(this) {
            final /* synthetic */ zzabm c;

            public zzabh<?> a() {
                return anonymousClass1.hasNext() ? (zzabh) anonymousClass1.next() : (zzabh) zzMl.next();
            }

            public boolean hasNext() {
                return anonymousClass1.hasNext() || zzMl.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public /* synthetic */ Object zzMk() {
        return zzMs();
    }

    public List<zzabh<?>> zzMs() {
        return this.zzbvQ;
    }

    public void zza(int i, zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i >= this.zzbvQ.size()) {
            setSize(i + 1);
        }
        this.zzbvQ.set(i, com_google_android_gms_internal_zzabh_);
    }

    public boolean zzhv(String str) {
        return zzbvH.containsKey(str);
    }

    public zzvh zzhw(String str) {
        if (zzhv(str)) {
            return (zzvh) zzbvH.get(str);
        }
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 51).append("Native Method ").append(str).append(" is not defined for type ListWrapper.").toString());
    }

    public zzabh<?> zzkZ(int i) {
        if (i < 0 || i >= this.zzbvQ.size()) {
            return zzabl.zzbvN;
        }
        zzabh<?> com_google_android_gms_internal_zzabh_ = (zzabh) this.zzbvQ.get(i);
        return com_google_android_gms_internal_zzabh_ == null ? zzabl.zzbvN : com_google_android_gms_internal_zzabh_;
    }

    public boolean zzla(int i) {
        return i >= 0 && i < this.zzbvQ.size() && this.zzbvQ.get(i) != null;
    }
}
