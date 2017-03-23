package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzaa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzabg {
    public static String zzbrK = new String("");
    private static Integer zzbvy = new Integer(0);
    private final Object zzRF;
    private final int zzagd;
    private final boolean zzbvA;
    private final List<Integer> zzbvz;

    public static class zza {
        private final Object zzRF;
        private final Integer zzbvB;
        private boolean zzbvC = false;
        private final List<Integer> zzbvz = new ArrayList();

        public zza(int i, Object obj) {
            this.zzbvB = Integer.valueOf(i);
            this.zzRF = obj;
        }

        public zzabg zzMi() {
            zzaa.zzz(this.zzbvB);
            zzaa.zzz(this.zzRF);
            return new zzabg(this.zzbvB, this.zzRF, this.zzbvz, this.zzbvC);
        }

        public zza zzaH(boolean z) {
            this.zzbvC = z;
            return this;
        }

        public zza zzkY(int i) {
            this.zzbvz.add(Integer.valueOf(i));
            return this;
        }
    }

    private zzabg(Integer num, Object obj, List<Integer> list, boolean z) {
        this.zzagd = num.intValue();
        this.zzRF = obj;
        this.zzbvz = Collections.unmodifiableList(list);
        this.zzbvA = z;
    }

    public boolean equals(Object obj) {
        return (obj instanceof zzabg) && ((zzabg) obj).getValue().equals(this.zzRF);
    }

    public int getType() {
        return this.zzagd;
    }

    public String getTypeName() {
        switch (this.zzagd) {
            case 1:
                return "String";
            case 2:
                return "List";
            case 3:
                return "Map";
            case 4:
                return "Macro Reference";
            case 5:
                return "Function ID";
            case 6:
                return "Integer";
            case 7:
                return "Template";
            case 8:
                return "Boolean";
            case 9:
                return "Tag Reference";
            default:
                zzun.e("Unknown type: " + this.zzagd);
                return "Unknown";
        }
    }

    public Object getValue() {
        return this.zzRF;
    }

    public int hashCode() {
        return this.zzRF.hashCode();
    }

    public String toString() {
        if (this.zzagd == 4 || this.zzagd == 5) {
            String valueOf = String.valueOf(getTypeName());
            zzun.e(new StringBuilder(String.valueOf(valueOf).length() + 28).append("Fail to convert a ").append(valueOf).append(" to string").toString());
            return zzbrK;
        } else if (this.zzRF != null) {
            return this.zzRF.toString();
        } else {
            zzun.e("Fail to convert a null object to string");
            return zzbrK;
        }
    }

    public List<Integer> zzMh() {
        return this.zzbvz;
    }
}
