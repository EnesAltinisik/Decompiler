package com.google.android.gms.measurement.internal;

import android.support.v4.h.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.internal.zzsn.zza;
import com.google.android.gms.internal.zzsn.zzb;
import com.google.android.gms.internal.zzsn.zzc;
import com.google.android.gms.internal.zzsn.zze;
import com.google.android.gms.internal.zzsp;
import com.google.android.gms.internal.zzsp.zzf;
import com.google.android.gms.internal.zzsp.zzg;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.zzd;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

class f extends b {
    f(zzx com_google_android_gms_measurement_internal_zzx) {
        super(com_google_android_gms_measurement_internal_zzx);
    }

    private Boolean a(zzb com_google_android_gms_internal_zzsn_zzb, zzsp.zzb com_google_android_gms_internal_zzsp_zzb, long j) {
        Boolean a;
        if (com_google_android_gms_internal_zzsn_zzb.zzbgq != null) {
            a = new j(com_google_android_gms_internal_zzsn_zzb.zzbgq).a(j);
            if (a == null) {
                return null;
            }
            if (!a.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }
        Set hashSet = new HashSet();
        for (zzc com_google_android_gms_internal_zzsn_zzc : com_google_android_gms_internal_zzsn_zzb.zzbgo) {
            if (TextUtils.isEmpty(com_google_android_gms_internal_zzsn_zzc.zzbgv)) {
                zzFm().zzFG().zzj("null or empty param name in filter. event", com_google_android_gms_internal_zzsp_zzb.name);
                return null;
            }
            hashSet.add(com_google_android_gms_internal_zzsn_zzc.zzbgv);
        }
        Map aVar = new a();
        for (zzsp.zzc com_google_android_gms_internal_zzsp_zzc : com_google_android_gms_internal_zzsp_zzb.zzbgW) {
            if (hashSet.contains(com_google_android_gms_internal_zzsp_zzc.name)) {
                if (com_google_android_gms_internal_zzsp_zzc.zzbha != null) {
                    aVar.put(com_google_android_gms_internal_zzsp_zzc.name, com_google_android_gms_internal_zzsp_zzc.zzbha);
                } else if (com_google_android_gms_internal_zzsp_zzc.zzbgf != null) {
                    aVar.put(com_google_android_gms_internal_zzsp_zzc.name, com_google_android_gms_internal_zzsp_zzc.zzbgf);
                } else if (com_google_android_gms_internal_zzsp_zzc.zzasH != null) {
                    aVar.put(com_google_android_gms_internal_zzsp_zzc.name, com_google_android_gms_internal_zzsp_zzc.zzasH);
                } else {
                    zzFm().zzFG().zze("Unknown value for param. event, param", com_google_android_gms_internal_zzsp_zzb.name, com_google_android_gms_internal_zzsp_zzc.name);
                    return null;
                }
            }
        }
        for (zzc com_google_android_gms_internal_zzsn_zzc2 : com_google_android_gms_internal_zzsn_zzb.zzbgo) {
            boolean equals = Boolean.TRUE.equals(com_google_android_gms_internal_zzsn_zzc2.zzbgu);
            CharSequence charSequence = com_google_android_gms_internal_zzsn_zzc2.zzbgv;
            if (TextUtils.isEmpty(charSequence)) {
                zzFm().zzFG().zzj("Event has empty param name. event", com_google_android_gms_internal_zzsp_zzb.name);
                return null;
            }
            Object obj = aVar.get(charSequence);
            if (obj instanceof Long) {
                if (com_google_android_gms_internal_zzsn_zzc2.zzbgt == null) {
                    zzFm().zzFG().zze("No number filter for long param. event, param", com_google_android_gms_internal_zzsp_zzb.name, charSequence);
                    return null;
                }
                a = new j(com_google_android_gms_internal_zzsn_zzc2.zzbgt).a(((Long) obj).longValue());
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof Double) {
                if (com_google_android_gms_internal_zzsn_zzc2.zzbgt == null) {
                    zzFm().zzFG().zze("No number filter for double param. event, param", com_google_android_gms_internal_zzsp_zzb.name, charSequence);
                    return null;
                }
                a = new j(com_google_android_gms_internal_zzsn_zzc2.zzbgt).a(((Double) obj).doubleValue());
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj instanceof String) {
                if (com_google_android_gms_internal_zzsn_zzc2.zzbgs == null) {
                    zzFm().zzFG().zze("No string filter for String param. event, param", com_google_android_gms_internal_zzsp_zzb.name, charSequence);
                    return null;
                }
                a = new c(com_google_android_gms_internal_zzsn_zzc2.zzbgs).a((String) obj);
                if (a == null) {
                    return null;
                }
                if (((!a.booleanValue() ? 1 : 0) ^ equals) != 0) {
                    return Boolean.valueOf(false);
                }
            } else if (obj == null) {
                zzFm().zzFL().zze("Missing param for filter. event, param", com_google_android_gms_internal_zzsp_zzb.name, charSequence);
                return Boolean.valueOf(false);
            } else {
                zzFm().zzFG().zze("Unknown param type. event, param", com_google_android_gms_internal_zzsp_zzb.name, charSequence);
                return null;
            }
        }
        return Boolean.valueOf(true);
    }

    private Boolean a(zze com_google_android_gms_internal_zzsn_zze, zzg com_google_android_gms_internal_zzsp_zzg) {
        Boolean bool = null;
        zzc com_google_android_gms_internal_zzsn_zzc = com_google_android_gms_internal_zzsn_zze.zzbgD;
        if (com_google_android_gms_internal_zzsn_zzc == null) {
            zzFm().zzFG().zzj("Missing property filter. property", com_google_android_gms_internal_zzsp_zzg.name);
            return bool;
        }
        boolean equals = Boolean.TRUE.equals(com_google_android_gms_internal_zzsn_zzc.zzbgu);
        if (com_google_android_gms_internal_zzsp_zzg.zzbha != null) {
            if (com_google_android_gms_internal_zzsn_zzc.zzbgt != null) {
                return a(new j(com_google_android_gms_internal_zzsn_zzc.zzbgt).a(com_google_android_gms_internal_zzsp_zzg.zzbha.longValue()), equals);
            }
            zzFm().zzFG().zzj("No number filter for long property. property", com_google_android_gms_internal_zzsp_zzg.name);
            return bool;
        } else if (com_google_android_gms_internal_zzsp_zzg.zzbgf != null) {
            if (com_google_android_gms_internal_zzsn_zzc.zzbgt != null) {
                return a(new j(com_google_android_gms_internal_zzsn_zzc.zzbgt).a(com_google_android_gms_internal_zzsp_zzg.zzbgf.doubleValue()), equals);
            }
            zzFm().zzFG().zzj("No number filter for double property. property", com_google_android_gms_internal_zzsp_zzg.name);
            return bool;
        } else if (com_google_android_gms_internal_zzsp_zzg.zzasH == null) {
            zzFm().zzFG().zzj("User property has no value, property", com_google_android_gms_internal_zzsp_zzg.name);
            return bool;
        } else if (com_google_android_gms_internal_zzsn_zzc.zzbgs != null) {
            return a(new c(com_google_android_gms_internal_zzsn_zzc.zzbgs).a(com_google_android_gms_internal_zzsp_zzg.zzasH), equals);
        } else {
            if (com_google_android_gms_internal_zzsn_zzc.zzbgt == null) {
                zzFm().zzFG().zzj("No string or number filter defined. property", com_google_android_gms_internal_zzsp_zzg.name);
                return bool;
            }
            j jVar = new j(com_google_android_gms_internal_zzsn_zzc.zzbgt);
            if (com_google_android_gms_internal_zzsn_zzc.zzbgt.zzbgx == null || !com_google_android_gms_internal_zzsn_zzc.zzbgt.zzbgx.booleanValue()) {
                if (a(com_google_android_gms_internal_zzsp_zzg.zzasH)) {
                    try {
                        return a(jVar.a(Long.parseLong(com_google_android_gms_internal_zzsp_zzg.zzasH)), equals);
                    } catch (NumberFormatException e) {
                        zzFm().zzFG().zze("User property value exceeded Long value range. property, value", com_google_android_gms_internal_zzsp_zzg.name, com_google_android_gms_internal_zzsp_zzg.zzasH);
                        return bool;
                    }
                }
                zzFm().zzFG().zze("Invalid user property value for Long number filter. property, value", com_google_android_gms_internal_zzsp_zzg.name, com_google_android_gms_internal_zzsp_zzg.zzasH);
                return bool;
            } else if (b(com_google_android_gms_internal_zzsp_zzg.zzasH)) {
                try {
                    double parseDouble = Double.parseDouble(com_google_android_gms_internal_zzsp_zzg.zzasH);
                    if (!Double.isInfinite(parseDouble)) {
                        return a(jVar.a(parseDouble), equals);
                    }
                    zzFm().zzFG().zze("User property value exceeded Double value range. property, value", com_google_android_gms_internal_zzsp_zzg.name, com_google_android_gms_internal_zzsp_zzg.zzasH);
                    return bool;
                } catch (NumberFormatException e2) {
                    zzFm().zzFG().zze("User property value exceeded Double value range. property, value", com_google_android_gms_internal_zzsp_zzg.name, com_google_android_gms_internal_zzsp_zzg.zzasH);
                    return bool;
                }
            } else {
                zzFm().zzFG().zze("Invalid user property value for Double number filter. property, value", com_google_android_gms_internal_zzsp_zzg.name, com_google_android_gms_internal_zzsp_zzg.zzasH);
                return bool;
            }
        }
    }

    static Boolean a(Boolean bool, boolean z) {
        return bool == null ? null : Boolean.valueOf(bool.booleanValue() ^ z);
    }

    void a(String str, zza[] com_google_android_gms_internal_zzsn_zzaArr) {
        zzaa.zzz(com_google_android_gms_internal_zzsn_zzaArr);
        for (zza com_google_android_gms_internal_zzsn_zza : com_google_android_gms_internal_zzsn_zzaArr) {
            for (zzb com_google_android_gms_internal_zzsn_zzb : com_google_android_gms_internal_zzsn_zza.zzbgk) {
                String str2 = (String) AppMeasurement.zza.zzbbm.get(com_google_android_gms_internal_zzsn_zzb.zzbgn);
                if (str2 != null) {
                    com_google_android_gms_internal_zzsn_zzb.zzbgn = str2;
                }
                for (zzc com_google_android_gms_internal_zzsn_zzc : com_google_android_gms_internal_zzsn_zzb.zzbgo) {
                    str2 = (String) zzd.zzbbn.get(com_google_android_gms_internal_zzsn_zzc.zzbgv);
                    if (str2 != null) {
                        com_google_android_gms_internal_zzsn_zzc.zzbgv = str2;
                    }
                }
            }
            for (zze com_google_android_gms_internal_zzsn_zze : com_google_android_gms_internal_zzsn_zza.zzbgj) {
                str2 = (String) AppMeasurement.zze.zzbbo.get(com_google_android_gms_internal_zzsn_zze.zzbgC);
                if (str2 != null) {
                    com_google_android_gms_internal_zzsn_zze.zzbgC = str2;
                }
            }
        }
        zzFh().a(str, com_google_android_gms_internal_zzsn_zzaArr);
    }

    boolean a(String str) {
        return Pattern.matches("[+-]?[0-9]+", str);
    }

    zzsp.zza[] a(String str, zzsp.zzb[] com_google_android_gms_internal_zzsp_zzbArr, zzg[] com_google_android_gms_internal_zzsp_zzgArr) {
        int intValue;
        BitSet bitSet;
        BitSet bitSet2;
        Map map;
        Map map2;
        Boolean a;
        Object obj;
        zzaa.zzdl(str);
        Set hashSet = new HashSet();
        a aVar = new a();
        Map aVar2 = new a();
        a aVar3 = new a();
        Map f = zzFh().f(str);
        if (f != null) {
            for (Integer intValue2 : f.keySet()) {
                intValue = intValue2.intValue();
                zzf com_google_android_gms_internal_zzsp_zzf = (zzf) f.get(Integer.valueOf(intValue));
                bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue));
                bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue));
                if (bitSet == null) {
                    bitSet = new BitSet();
                    aVar2.put(Integer.valueOf(intValue), bitSet);
                    bitSet2 = new BitSet();
                    aVar3.put(Integer.valueOf(intValue), bitSet2);
                }
                for (int i = 0; i < com_google_android_gms_internal_zzsp_zzf.zzbhC.length * 64; i++) {
                    if (zzal.zza(com_google_android_gms_internal_zzsp_zzf.zzbhC, i)) {
                        zzFm().zzFL().zze("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i));
                        bitSet2.set(i);
                        if (zzal.zza(com_google_android_gms_internal_zzsp_zzf.zzbhD, i)) {
                            bitSet.set(i);
                        }
                    }
                }
                zzsp.zza com_google_android_gms_internal_zzsp_zza = new zzsp.zza();
                aVar.put(Integer.valueOf(intValue), com_google_android_gms_internal_zzsp_zza);
                com_google_android_gms_internal_zzsp_zza.zzbgU = Boolean.valueOf(false);
                com_google_android_gms_internal_zzsp_zza.zzbgT = com_google_android_gms_internal_zzsp_zzf;
                com_google_android_gms_internal_zzsp_zza.zzbgS = new zzf();
                com_google_android_gms_internal_zzsp_zza.zzbgS.zzbhD = zzal.zza(bitSet);
                com_google_android_gms_internal_zzsp_zza.zzbgS.zzbhC = zzal.zza(bitSet2);
            }
        }
        if (com_google_android_gms_internal_zzsp_zzbArr != null) {
            a aVar4 = new a();
            for (zzsp.zzb com_google_android_gms_internal_zzsp_zzb : com_google_android_gms_internal_zzsp_zzbArr) {
                h hVar;
                h a2 = zzFh().a(str, com_google_android_gms_internal_zzsp_zzb.name);
                if (a2 == null) {
                    zzFm().zzFG().zzj("Event aggregate wasn't created during raw event logging. event", com_google_android_gms_internal_zzsp_zzb.name);
                    hVar = new h(str, com_google_android_gms_internal_zzsp_zzb.name, 1, 1, com_google_android_gms_internal_zzsp_zzb.zzbgX.longValue());
                } else {
                    hVar = a2.a();
                }
                zzFh().a(hVar);
                long j = hVar.c;
                map = (Map) aVar4.get(com_google_android_gms_internal_zzsp_zzb.name);
                if (map == null) {
                    map = zzFh().d(str, com_google_android_gms_internal_zzsp_zzb.name);
                    if (map == null) {
                        map = new a();
                    }
                    aVar4.put(com_google_android_gms_internal_zzsp_zzb.name, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                zzFm().zzFL().zze("event, affected audience count", com_google_android_gms_internal_zzsp_zzb.name, Integer.valueOf(map2.size()));
                for (Integer intValue22 : map2.keySet()) {
                    int intValue3 = intValue22.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue3))) {
                        zzFm().zzFL().zzj("Skipping failed audience ID", Integer.valueOf(intValue3));
                    } else {
                        bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue3));
                        bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue3));
                        if (((zzsp.zza) aVar.get(Integer.valueOf(intValue3))) == null) {
                            zzsp.zza com_google_android_gms_internal_zzsp_zza2 = new zzsp.zza();
                            aVar.put(Integer.valueOf(intValue3), com_google_android_gms_internal_zzsp_zza2);
                            com_google_android_gms_internal_zzsp_zza2.zzbgU = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            aVar2.put(Integer.valueOf(intValue3), bitSet);
                            bitSet2 = new BitSet();
                            aVar3.put(Integer.valueOf(intValue3), bitSet2);
                        }
                        for (zzb com_google_android_gms_internal_zzsn_zzb : (List) map2.get(Integer.valueOf(intValue3))) {
                            if (zzFm().zzX(2)) {
                                zzFm().zzFL().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(intValue3), com_google_android_gms_internal_zzsn_zzb.zzbgm, com_google_android_gms_internal_zzsn_zzb.zzbgn);
                                zzFm().zzFL().zzj("Filter definition", zzal.zza(com_google_android_gms_internal_zzsn_zzb));
                            }
                            if (com_google_android_gms_internal_zzsn_zzb.zzbgm == null || com_google_android_gms_internal_zzsn_zzb.zzbgm.intValue() > 256) {
                                zzFm().zzFG().zzj("Invalid event filter ID. id", String.valueOf(com_google_android_gms_internal_zzsn_zzb.zzbgm));
                            } else if (bitSet.get(com_google_android_gms_internal_zzsn_zzb.zzbgm.intValue())) {
                                zzFm().zzFL().zze("Event filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue3), com_google_android_gms_internal_zzsn_zzb.zzbgm);
                            } else {
                                a = a(com_google_android_gms_internal_zzsn_zzb, com_google_android_gms_internal_zzsp_zzb, j);
                                zzp.zza zzFL = zzFm().zzFL();
                                String str2 = "Event filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    Boolean bool = a;
                                }
                                zzFL.zzj(str2, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue3));
                                } else {
                                    bitSet2.set(com_google_android_gms_internal_zzsn_zzb.zzbgm.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(com_google_android_gms_internal_zzsn_zzb.zzbgm.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (com_google_android_gms_internal_zzsp_zzgArr != null) {
            Map aVar5 = new a();
            for (zzg com_google_android_gms_internal_zzsp_zzg : com_google_android_gms_internal_zzsp_zzgArr) {
                map = (Map) aVar5.get(com_google_android_gms_internal_zzsp_zzg.name);
                if (map == null) {
                    map = zzFh().e(str, com_google_android_gms_internal_zzsp_zzg.name);
                    if (map == null) {
                        map = new a();
                    }
                    aVar5.put(com_google_android_gms_internal_zzsp_zzg.name, map);
                    map2 = map;
                } else {
                    map2 = map;
                }
                zzFm().zzFL().zze("property, affected audience count", com_google_android_gms_internal_zzsp_zzg.name, Integer.valueOf(map2.size()));
                for (Integer intValue222 : map2.keySet()) {
                    int intValue4 = intValue222.intValue();
                    if (hashSet.contains(Integer.valueOf(intValue4))) {
                        zzFm().zzFL().zzj("Skipping failed audience ID", Integer.valueOf(intValue4));
                    } else {
                        bitSet = (BitSet) aVar2.get(Integer.valueOf(intValue4));
                        bitSet2 = (BitSet) aVar3.get(Integer.valueOf(intValue4));
                        if (((zzsp.zza) aVar.get(Integer.valueOf(intValue4))) == null) {
                            com_google_android_gms_internal_zzsp_zza2 = new zzsp.zza();
                            aVar.put(Integer.valueOf(intValue4), com_google_android_gms_internal_zzsp_zza2);
                            com_google_android_gms_internal_zzsp_zza2.zzbgU = Boolean.valueOf(true);
                            bitSet = new BitSet();
                            aVar2.put(Integer.valueOf(intValue4), bitSet);
                            bitSet2 = new BitSet();
                            aVar3.put(Integer.valueOf(intValue4), bitSet2);
                        }
                        for (zze com_google_android_gms_internal_zzsn_zze : (List) map2.get(Integer.valueOf(intValue4))) {
                            if (zzFm().zzX(2)) {
                                zzFm().zzFL().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), com_google_android_gms_internal_zzsn_zze.zzbgm, com_google_android_gms_internal_zzsn_zze.zzbgC);
                                zzFm().zzFL().zzj("Filter definition", zzal.zza(com_google_android_gms_internal_zzsn_zze));
                            }
                            if (com_google_android_gms_internal_zzsn_zze.zzbgm == null || com_google_android_gms_internal_zzsn_zze.zzbgm.intValue() > 256) {
                                zzFm().zzFG().zzj("Invalid property filter ID. id", String.valueOf(com_google_android_gms_internal_zzsn_zze.zzbgm));
                                hashSet.add(Integer.valueOf(intValue4));
                                break;
                            } else if (bitSet.get(com_google_android_gms_internal_zzsn_zze.zzbgm.intValue())) {
                                zzFm().zzFL().zze("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(intValue4), com_google_android_gms_internal_zzsn_zze.zzbgm);
                            } else {
                                a = a(com_google_android_gms_internal_zzsn_zze, com_google_android_gms_internal_zzsp_zzg);
                                zzp.zza zzFL2 = zzFm().zzFL();
                                String str3 = "Property filter result";
                                if (a == null) {
                                    obj = "null";
                                } else {
                                    bool = a;
                                }
                                zzFL2.zzj(str3, obj);
                                if (a == null) {
                                    hashSet.add(Integer.valueOf(intValue4));
                                } else {
                                    bitSet2.set(com_google_android_gms_internal_zzsn_zze.zzbgm.intValue());
                                    if (a.booleanValue()) {
                                        bitSet.set(com_google_android_gms_internal_zzsn_zze.zzbgm.intValue());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        zzsp.zza[] com_google_android_gms_internal_zzsp_zzaArr = new zzsp.zza[aVar2.size()];
        int i2 = 0;
        for (Integer intValue2222 : aVar2.keySet()) {
            intValue = intValue2222.intValue();
            if (!hashSet.contains(Integer.valueOf(intValue))) {
                com_google_android_gms_internal_zzsp_zza2 = (zzsp.zza) aVar.get(Integer.valueOf(intValue));
                com_google_android_gms_internal_zzsp_zza = com_google_android_gms_internal_zzsp_zza2 == null ? new zzsp.zza() : com_google_android_gms_internal_zzsp_zza2;
                int i3 = i2 + 1;
                com_google_android_gms_internal_zzsp_zzaArr[i2] = com_google_android_gms_internal_zzsp_zza;
                com_google_android_gms_internal_zzsp_zza.zzbgi = Integer.valueOf(intValue);
                com_google_android_gms_internal_zzsp_zza.zzbgS = new zzf();
                com_google_android_gms_internal_zzsp_zza.zzbgS.zzbhD = zzal.zza((BitSet) aVar2.get(Integer.valueOf(intValue)));
                com_google_android_gms_internal_zzsp_zza.zzbgS.zzbhC = zzal.zza((BitSet) aVar3.get(Integer.valueOf(intValue)));
                zzFh().a(str, intValue, com_google_android_gms_internal_zzsp_zza.zzbgS);
                i2 = i3;
            }
        }
        return (zzsp.zza[]) Arrays.copyOf(com_google_android_gms_internal_zzsp_zzaArr, i2);
    }

    boolean b(String str) {
        return Pattern.matches("[+-]?(([0-9]+\\.?)|([0-9]*\\.[0-9]+))", str);
    }

    protected void zzkO() {
    }
}
