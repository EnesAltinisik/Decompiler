package com.google.android.gms.common.internal;

import java.util.Iterator;

public class zzx {
    private final String separator;

    private zzx(String str) {
        this.separator = str;
    }

    public static zzx zzdk(String str) {
        return new zzx(str);
    }

    public final String zza(Iterable<?> iterable) {
        return zza(new StringBuilder(), iterable).toString();
    }

    public final StringBuilder zza(StringBuilder stringBuilder, Iterable<?> iterable) {
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            stringBuilder.append(zzx(it.next()));
            while (it.hasNext()) {
                stringBuilder.append(this.separator);
                stringBuilder.append(zzx(it.next()));
            }
        }
        return stringBuilder;
    }

    CharSequence zzx(Object obj) {
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
