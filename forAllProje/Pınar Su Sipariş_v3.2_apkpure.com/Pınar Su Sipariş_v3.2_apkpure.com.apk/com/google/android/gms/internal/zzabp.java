package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import com.google.firebase.analytics.FirebaseAnalytics.Event;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class zzabp extends zzabh<String> {
    private static final Map<String, zzvh> zzbvH;
    private final String mValue;

    static {
        Map hashMap = new HashMap();
        hashMap.put("charAt", new zzxu());
        hashMap.put("concat", new zzxv());
        hashMap.put("hasOwnProperty", zzxf.zzbus);
        hashMap.put("indexOf", new zzxw());
        hashMap.put("lastIndexOf", new zzxx());
        hashMap.put("match", new zzxy());
        hashMap.put("replace", new zzxz());
        hashMap.put(Event.SEARCH, new zzya());
        hashMap.put("slice", new zzyb());
        hashMap.put("split", new zzyc());
        hashMap.put("substring", new zzyd());
        hashMap.put("toLocaleLowerCase", new zzye());
        hashMap.put("toLocaleUpperCase", new zzyf());
        hashMap.put("toLowerCase", new zzyg());
        hashMap.put("toUpperCase", new zzyi());
        hashMap.put("toString", new zzyh());
        hashMap.put("trim", new zzyj());
        zzbvH = Collections.unmodifiableMap(hashMap);
    }

    public zzabp(String str) {
        zzaa.zzz(str);
        this.mValue = str;
    }

    public boolean equals(Object obj) {
        return this == obj ? true : obj instanceof zzabp ? this.mValue.equals((String) ((zzabp) obj).zzMk()) : false;
    }

    public String toString() {
        return this.mValue.toString();
    }

    public String value() {
        return this.mValue;
    }

    public Iterator<zzabh<?>> zzMj() {
        return new Iterator<zzabh<?>>(this) {
            final /* synthetic */ zzabp a;
            private int b = 0;

            {
                this.a = r2;
            }

            public zzabh<?> a() {
                if (this.b >= this.a.mValue.length()) {
                    throw new NoSuchElementException();
                }
                int i = this.b;
                this.b = i + 1;
                return new zzabj(Double.valueOf((double) i));
            }

            public boolean hasNext() {
                return this.b < this.a.mValue.length();
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
        return value();
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

    public zzabh<?> zzlb(int i) {
        return (i < 0 || i >= this.mValue.length()) ? zzabl.zzbvN : new zzabp(String.valueOf(this.mValue.charAt(i)));
    }
}
