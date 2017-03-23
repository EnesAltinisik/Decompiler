package com.google.android.gms.b;

import java.util.Comparator;

public abstract class jk implements Comparator<jq> {
    public static jk a(String str) {
        if (str.equals(".value")) {
            return jy.b();
        }
        if (str.equals(".key")) {
            return jn.b();
        }
        if (!str.equals(".priority")) {
            return new jt(new gx(str));
        }
        throw new IllegalStateException("queryDefinition shouldn't ever be .priority since it's the default");
    }

    public abstract String a();

    public abstract boolean a(jr jrVar);

    public boolean a(jr jrVar, jr jrVar2) {
        return compare(new jq(je.a(), jrVar), new jq(je.a(), jrVar2)) != 0;
    }
}
