package com.google.android.gms.b;

import android.support.v4.i.a;
import android.text.TextUtils;
import com.google.android.gms.b.dm.b;
import com.google.android.gms.b.dm.c;
import com.google.android.gms.b.dm.d;
import com.google.android.gms.b.dm.e;
import com.google.android.gms.b.dm.f;
import com.google.android.gms.b.do.g;
import com.google.android.gms.measurement.AppMeasurement;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

class bx extends cy {
    bx(cv cvVar) {
        super(cvVar);
    }

    private Boolean a(b bVar, do.b bVar2, long j) {
        Boolean a;
        if (bVar.e != null) {
            a = a(j, bVar.e);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        Set hashSet = new HashSet();
        for (c cVar : bVar.c) {
            if (TextUtils.isEmpty(cVar.d)) {
                u().z().a("null or empty param name in filter. event", bVar2.b);
                return null;
            }
            hashSet.add(cVar.d);
        }
        Map aVar = new a();
        for (do.c cVar2 : bVar2.a) {
            if (hashSet.contains(cVar2.a)) {
                if (cVar2.c != null) {
                    aVar.put(cVar2.a, cVar2.c);
                } else if (cVar2.e != null) {
                    aVar.put(cVar2.a, cVar2.e);
                } else if (cVar2.b != null) {
                    aVar.put(cVar2.a, cVar2.b);
                } else {
                    u().z().a("Unknown value for param. event, param", bVar2.b, cVar2.a);
                    return null;
                }
            }
        }
        for (c cVar3 : bVar.c) {
            boolean equals = Boolean.TRUE.equals(cVar3.c);
            CharSequence charSequence = cVar3.d;
            if (TextUtils.isEmpty(charSequence)) {
                u().z().a("Event has empty param name. event", bVar2.b);
                return null;
            }
            Object obj = aVar.get(charSequence);
            if (obj instanceof Long) {
                if (cVar3.b == null) {
                    u().z().a("No number filter for long param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = a(((Long) obj).longValue(), cVar3.b);
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (cVar3.b == null) {
                    u().z().a("No number filter for double param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = a(((Double) obj).doubleValue(), cVar3.b);
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (cVar3.a == null) {
                    u().z().a("No string filter for String param. event, param", bVar2.b, charSequence);
                    return null;
                }
                a = a((String) obj, cVar3.a);
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                u().D().a("Missing param for filter. event, param", bVar2.b, charSequence);
                return Boolean.valueOf(false);
            } else {
                u().z().a("Unknown param type. event, param", bVar2.b, charSequence);
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    private Boolean a(e eVar, g gVar) {
        c cVar = eVar.c;
        if (cVar == null) {
            u().z().a("Missing property filter. property", gVar.b);
            return null;
        }
        boolean equals = Boolean.TRUE.equals(cVar.c);
        if (gVar.d != null) {
            if (cVar.b != null) {
                return a(a(gVar.d.longValue(), cVar.b), equals);
            }
            u().z().a("No number filter for long property. property", gVar.b);
            return null;
        } else if (gVar.f != null) {
            if (cVar.b != null) {
                return a(a(gVar.f.doubleValue(), cVar.b), equals);
            }
            u().z().a("No number filter for double property. property", gVar.b);
            return null;
        } else if (gVar.c == null) {
            u().z().a("User property has no value, property", gVar.b);
            return null;
        } else if (cVar.a != null) {
            return a(a(gVar.c, cVar.a), equals);
        } else {
            if (cVar.b == null) {
                u().z().a("No string or number filter defined. property", gVar.b);
                return null;
            } else if (dl.l(gVar.c)) {
                return a(a(gVar.c, cVar.b), equals);
            } else {
                u().z().a("Invalid user property value for Numeric number filter. property, value", gVar.b, gVar.c);
                return null;
            }
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    private Boolean a(String str, int i, boolean z, String str2, List<String> list, String str3) {
        if (str == null) {
            return null;
        }
        if (i == 6) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!(z || i == 1)) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i) {
            case 1:
                return Boolean.valueOf(Pattern.compile(str3, z ? 0 : 66).matcher(str).matches());
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    private Boolean a(BigDecimal bigDecimal, int i, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, double d) {
        boolean z = true;
        if (bigDecimal == null) {
            return null;
        }
        if (i == 4) {
            if (bigDecimal3 == null || bigDecimal4 == null) {
                return null;
            }
        } else if (bigDecimal2 == null) {
            return null;
        }
        switch (i) {
            case 1:
                if (bigDecimal.compareTo(bigDecimal2) != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (bigDecimal.compareTo(bigDecimal2) != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (d != 0.0d) {
                    if (!(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) == 1 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) == -1)) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (bigDecimal.compareTo(bigDecimal2) != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (bigDecimal.compareTo(bigDecimal3) == -1 || bigDecimal.compareTo(bigDecimal4) == 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return null;
        }
    }

    private List<String> a(String[] strArr, boolean z) {
        if (z) {
            return Arrays.asList(strArr);
        }
        List<String> arrayList = new ArrayList();
        for (String toUpperCase : strArr) {
            arrayList.add(toUpperCase.toUpperCase(Locale.ENGLISH));
        }
        return arrayList;
    }

    public Boolean a(double d, d dVar) {
        try {
            return a(new BigDecimal(d), dVar, Math.ulp(d));
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Boolean a(long j, d dVar) {
        try {
            return a(new BigDecimal(j), dVar, 0.0d);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public Boolean a(String str, d dVar) {
        Boolean bool = null;
        if (dl.l(str)) {
            try {
                bool = a(new BigDecimal(str), dVar, 0.0d);
            } catch (NumberFormatException e) {
            }
        }
        return bool;
    }

    Boolean a(String str, f fVar) {
        String str2 = null;
        com.google.android.gms.common.internal.c.a((Object) fVar);
        if (str == null || fVar.a == null || fVar.a.intValue() == 0) {
            return null;
        }
        if (fVar.a.intValue() == 6) {
            if (fVar.d == null || fVar.d.length == 0) {
                return null;
            }
        } else if (fVar.b == null) {
            return null;
        }
        int intValue = fVar.a.intValue();
        boolean z = fVar.c != null && fVar.c.booleanValue();
        String toUpperCase = (z || intValue == 1 || intValue == 6) ? fVar.b : fVar.b.toUpperCase(Locale.ENGLISH);
        List a = fVar.d == null ? null : a(fVar.d, z);
        if (intValue == 1) {
            str2 = toUpperCase;
        }
        return a(str, intValue, z, toUpperCase, a, str2);
    }

    Boolean a(BigDecimal bigDecimal, d dVar, double d) {
        com.google.android.gms.common.internal.c.a((Object) dVar);
        if (dVar.a == null || dVar.a.intValue() == 0) {
            return null;
        }
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        if (dVar.a.intValue() == 4) {
            if (dVar.d == null || dVar.e == null) {
                return null;
            }
        } else if (dVar.c == null) {
            return null;
        }
        int intValue = dVar.a.intValue();
        if (dVar.a.intValue() == 4) {
            if (!dl.l(dVar.d) || !dl.l(dVar.e)) {
                return null;
            }
            try {
                bigDecimal2 = new BigDecimal(dVar.d);
                bigDecimal3 = new BigDecimal(dVar.e);
                bigDecimal4 = null;
            } catch (NumberFormatException e) {
                return null;
            }
        } else if (!dl.l(dVar.c)) {
            return null;
        } else {
            try {
                bigDecimal4 = new BigDecimal(dVar.c);
                bigDecimal3 = null;
                bigDecimal2 = null;
            } catch (NumberFormatException e2) {
                return null;
            }
        }
        return a(bigDecimal, intValue, bigDecimal4, bigDecimal2, bigDecimal3, d);
    }

    protected void a() {
    }

    void a(String str, dm.a[] aVarArr) {
        com.google.android.gms.common.internal.c.a((Object) aVarArr);
        for (dm.a aVar : aVarArr) {
            for (b bVar : aVar.c) {
                String str2 = (String) AppMeasurement.a.a.get(bVar.b);
                if (str2 != null) {
                    bVar.b = str2;
                }
                for (c cVar : bVar.c) {
                    str2 = (String) AppMeasurement.e.a.get(cVar.d);
                    if (str2 != null) {
                        cVar.d = str2;
                    }
                }
            }
            for (e eVar : aVar.b) {
                str2 = (String) AppMeasurement.g.a.get(eVar.b);
                if (str2 != null) {
                    eVar.b = str2;
                }
            }
        }
        p().a(str, aVarArr);
    }

    do.a[] a(String str, do.b[] bVarArr, g[] gVarArr) {
        int intValue;
        BitSet bitSet;
        BitSet bitSet2;
        Map map;
        Map map2;
        Boolean a;
        Object obj;
        com.google.android.gms.common.internal.c.a(str);
        Set hashSet = new HashSet();
        a aVar = new a();
        Map aVar2 = new a();
        a aVar3 = new a();
        Map f = p().f(str);
        if (f != null) {
            for (Integer intValue2 : f.keySet()) {
                intValue = intValue2.intValue();
                do.f fVar = (do.f) f.get(Integer.valueOf(intValue));
                bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue));
                bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    aVar2.put(Integer.valueOf(intValue), bitSet);
                    bitSet2 = new BitSet();
                    aVar3.put(Integer.valueOf(intValue), bitSet2);
                }
                for (int i = 0; i < fVar.a.length * 64; i++) {
                    if (dl.a(fVar.a, i)) {
                        u().D().a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (dl.a(fVar.b, i)) {
                            bitSet.set(i);
                        }
                    }
                }
                do.a aVar4 = new do.a();
                aVar.put(Integer.valueOf(intValue), aVar4);
                aVar4.d = Boolean.valueOf(false);
                aVar4.c = fVar;
                aVar4.b = new do.f();
                aVar4.b.b = dl.a(bitSet);
                aVar4.b.a = dl.a(bitSet2);
            }
        }
        if (bVarArr != null) {
            a aVar5 = new a();
            for (do.b bVar : bVarArr) {
                cd cdVar;
                cd a2 = p().a(str, bVar.b);
                if (a2 == null) {
                    u().z().a("Event aggregate wasn't created during raw event logging. appId, event", co.a(str), bVar.b);
                    cdVar = new cd(str, bVar.b, 1, 1, bVar.c.longValue());
                } else {
                    cdVar = a2.a();
                }
                p().a(cdVar);
                long j = cdVar.c;
                map = (Map) aVar5.get(bVar.b);
                if (map == null) {
                    map = p().d(str, bVar.b);
                    if (map == null) {
                        map = new a();
                    }
                    aVar5.put(bVar.b, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                for (Integer intValue22 : r7.keySet()) {
                    int intValue3 = intValue22.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue3))) {
                        u().D().a("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue3));
                        bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue3));
                        if (((do.a) aVar.get(Integer.valueOf(intValue3))) == null) {
                            do.a aVar6 = new do.a();
                            aVar.put(Integer.valueOf(intValue3), aVar6);
                            aVar6.d = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            aVar2.put(Integer.valueOf(intValue3), bitSet);
                            bitSet2 = new BitSet();
                            aVar3.put(Integer.valueOf(intValue3), bitSet2);
                        }
                        for (b bVar2 : (List) r7.get(Integer.valueOf(intValue3))) {
                            if (u().a(2)) {
                                u().D().a("Evaluating filter. audience, filter, event", Integer.valueOf(intValue3), bVar2.a, bVar2.b);
                                u().D().a("Filter definition", dl.a(bVar2));
                            }
                            if (bVar2.a == null || bVar2.a.intValue() > 256) {
                                u().z().a("Invalid event filter ID. appId, id", co.a(str), String.valueOf(bVar2.a));
                            } else if (bitSet.get(bVar2.a.intValue())) {
                                u().D().a("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), bVar2.a);
                            } else {
                                a = a(bVar2, bVar, j);
                                co.a D = u().D();
                                String str2 = "Event filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    Boolean bool = a;
                                }
                                D.a(str2, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue3));
                                } else {
                                    bitSet2.set(bVar2.a.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(bVar2.a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (gVarArr != null) {
            Map aVar7 = new a();
            for (g gVar : gVarArr) {
                map = (Map) aVar7.get(gVar.b);
                if (map == null) {
                    map = p().e(str, gVar.b);
                    if (map == null) {
                        map = new a();
                    }
                    aVar7.put(gVar.b, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                for (Integer intValue222 : r7.keySet()) {
                    int intValue4 = intValue222.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue4))) {
                        u().D().a("Skipping failed audience ID", Integer.valueOf(intValue4));
                    } else {
                        bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue4));
                        bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue4));
                        if (((do.a) aVar.get(Integer.valueOf(intValue4))) == null) {
                            aVar6 = new do.a();
                            aVar.put(Integer.valueOf(intValue4), aVar6);
                            aVar6.d = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            aVar2.put(Integer.valueOf(intValue4), bitSet);
                            bitSet2 = new BitSet();
                            aVar3.put(Integer.valueOf(intValue4), bitSet2);
                        }
                        for (e eVar : (List) r7.get(Integer.valueOf(intValue4))) {
                            if (u().a(2)) {
                                u().D().a("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), eVar.a, eVar.b);
                                u().D().a("Filter definition", dl.a(eVar));
                            }
                            if (eVar.a == null || eVar.a.intValue() > 256) {
                                u().z().a("Invalid property filter ID. appId, id", co.a(str), String.valueOf(eVar.a));
                                hashSet.add(Integer.valueOf(intValue4));
                                break;
                            } else if (bitSet.get(eVar.a.intValue())) {
                                u().D().a("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue4), eVar.a);
                            } else {
                                a = a(eVar, gVar);
                                co.a D2 = u().D();
                                String str3 = "Property filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    bool = a;
                                }
                                D2.a(str3, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue4));
                                } else {
                                    bitSet2.set(eVar.a.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(eVar.a.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        do.a[] aVarArr = new do.a[aVar2.size()];
        int i2 = 0;
        for (Integer intValue2222 : aVar2.keySet()) {
            intValue = intValue2222.intValue();
            if (!hashSet.contains(Integer.valueOf(intValue))) {
                aVar6 = (do.a) aVar.get(Integer.valueOf(intValue));
                aVar4 = aVar6 == null ? new do.a() : aVar6;
                int i3 = i2 + 1;
                aVarArr[i2] = aVar4;
                aVar4.a = Integer.valueOf(intValue);
                aVar4.b = new do.f();
                aVar4.b.b = dl.a((BitSet) aVar2.get(Integer.valueOf(intValue)));
                aVar4.b.a = dl.a((BitSet) aVar3.get(Integer.valueOf(intValue)));
                p().a(str, intValue, aVar4.b);
                i2 = i3;
            }
        }
        return (do.a[]) Arrays.copyOf(aVarArr, i2);
    }
}
