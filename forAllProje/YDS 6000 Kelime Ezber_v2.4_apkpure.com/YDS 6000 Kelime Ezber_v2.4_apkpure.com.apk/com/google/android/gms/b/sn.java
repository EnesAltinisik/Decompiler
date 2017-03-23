package com.google.android.gms.b;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

@vz
class sn {
    private final Object[] a;

    sn(ns nsVar, String str, int i) {
        this.a = a(nsVar, str, i);
    }

    private static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            String a = obj == null ? "null" : obj instanceof Bundle ? a((Bundle) obj) : obj.toString();
            stringBuilder.append(a);
        }
        return stringBuilder.toString();
    }

    private static Object[] a(ns nsVar, String str, int i) {
        Set hashSet = new HashSet(Arrays.asList(((String) pr.aM.c()).split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(nsVar.b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(a(nsVar.c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(nsVar.d));
        }
        if (hashSet.contains("keywords")) {
            if (nsVar.e != null) {
                arrayList.add(nsVar.e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(nsVar.f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(nsVar.g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(nsVar.h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(nsVar.i);
        }
        if (hashSet.contains("location")) {
            if (nsVar.k != null) {
                arrayList.add(nsVar.k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(nsVar.l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(a(nsVar.m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(a(nsVar.n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (nsVar.o != null) {
                arrayList.add(nsVar.o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(nsVar.p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(nsVar.q);
        }
        return arrayList.toArray();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof sn)) {
            return false;
        }
        return Arrays.equals(this.a, ((sn) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.a));
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("[InterstitialAdPoolKey ").append(valueOf).append("]").toString();
    }
}
