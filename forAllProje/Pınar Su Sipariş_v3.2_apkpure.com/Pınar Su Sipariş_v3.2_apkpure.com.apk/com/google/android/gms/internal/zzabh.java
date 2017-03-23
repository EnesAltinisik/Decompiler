package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public abstract class zzabh<T> {
    protected Map<String, zzabh<?>> zzbvD;

    private static class a implements Iterator<zzabh<?>> {
        private a() {
        }

        public zzabh<?> a() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public /* synthetic */ Object next() {
            return a();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public abstract String toString();

    public Iterator<zzabh<?>> zzMj() {
        return new a();
    }

    public abstract T zzMk();

    protected Iterator<zzabh<?>> zzMl() {
        if (this.zzbvD == null) {
            return new a();
        }
        final Iterator it = this.zzbvD.keySet().iterator();
        return new Iterator<zzabh<?>>(this) {
            final /* synthetic */ zzabh b;

            public zzabh<?> a() {
                return new zzabp((String) it.next());
            }

            public boolean hasNext() {
                return it.hasNext();
            }

            public /* synthetic */ Object next() {
                return a();
            }

            public void remove() {
                it.remove();
            }
        };
    }

    public void zzc(String str, zzabh<?> com_google_android_gms_internal_zzabh_) {
        if (this.zzbvD == null) {
            this.zzbvD = new HashMap();
        }
        this.zzbvD.put(str, com_google_android_gms_internal_zzabh_);
    }

    public boolean zzht(String str) {
        return this.zzbvD != null && this.zzbvD.containsKey(str);
    }

    public zzabh<?> zzhu(String str) {
        return this.zzbvD != null ? (zzabh) this.zzbvD.get(str) : zzabl.zzbvN;
    }

    public boolean zzhv(String str) {
        return false;
    }

    public zzvh zzhw(String str) {
        throw new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 56).append("Attempting to access Native Method ").append(str).append(" on unsupported type.").toString());
    }
}
