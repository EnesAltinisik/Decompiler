package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzdl {
    private static final Object zzbrG = null;
    private static Long zzbrH = new Long(0);
    private static Double zzbrI = new Double(0.0d);
    private static bv zzbrJ = bv.a(0);
    private static String zzbrK = new String("");
    private static Boolean zzbrL = new Boolean(false);
    private static List<Object> zzbrM = new ArrayList(0);
    private static Map<Object, Object> zzbrN = new HashMap();
    private static zza zzbrO = zzQ(zzbrK);

    private static double getDouble(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        zzbn.e("getDouble received non-Number");
        return 0.0d;
    }

    public static Object zzKN() {
        return null;
    }

    public static Long zzKO() {
        return zzbrH;
    }

    public static Double zzKP() {
        return zzbrI;
    }

    public static Boolean zzKQ() {
        return zzbrL;
    }

    public static bv zzKR() {
        return zzbrJ;
    }

    public static String zzKS() {
        return zzbrK;
    }

    public static zza zzKT() {
        return zzbrO;
    }

    public static String zzL(Object obj) {
        return obj == null ? zzbrK : obj.toString();
    }

    public static bv zzM(Object obj) {
        return obj instanceof bv ? (bv) obj : zzS(obj) ? bv.a(zzT(obj)) : zzR(obj) ? bv.a(Double.valueOf(getDouble(obj))) : zzgO(zzL(obj));
    }

    public static Long zzN(Object obj) {
        return zzS(obj) ? Long.valueOf(zzT(obj)) : zzgP(zzL(obj));
    }

    public static Double zzO(Object obj) {
        return zzR(obj) ? Double.valueOf(getDouble(obj)) : zzgQ(zzL(obj));
    }

    public static Boolean zzP(Object obj) {
        return obj instanceof Boolean ? (Boolean) obj : zzgR(zzL(obj));
    }

    public static zza zzQ(Object obj) {
        boolean z = false;
        zza com_google_android_gms_internal_zzag_zza = new zza();
        if (obj instanceof zza) {
            return (zza) obj;
        }
        if (obj instanceof String) {
            com_google_android_gms_internal_zzag_zza.type = 1;
            com_google_android_gms_internal_zzag_zza.zzjJ = (String) obj;
        } else if (obj instanceof List) {
            com_google_android_gms_internal_zzag_zza.type = 2;
            List<Object> list = (List) obj;
            r5 = new ArrayList(list.size());
            r1 = false;
            for (Object zzQ : list) {
                zza zzQ2 = zzQ(zzQ);
                if (zzQ2 == zzbrO) {
                    return zzbrO;
                }
                r0 = r1 || zzQ2.zzjT;
                r5.add(zzQ2);
                r1 = r0;
            }
            com_google_android_gms_internal_zzag_zza.zzjK = (zza[]) r5.toArray(new zza[0]);
            z = r1;
        } else if (obj instanceof Map) {
            com_google_android_gms_internal_zzag_zza.type = 3;
            Set<Entry> entrySet = ((Map) obj).entrySet();
            r5 = new ArrayList(entrySet.size());
            List arrayList = new ArrayList(entrySet.size());
            r1 = false;
            for (Entry entry : entrySet) {
                zza zzQ3 = zzQ(entry.getKey());
                zza zzQ4 = zzQ(entry.getValue());
                if (zzQ3 == zzbrO || zzQ4 == zzbrO) {
                    return zzbrO;
                }
                r0 = r1 || zzQ3.zzjT || zzQ4.zzjT;
                r5.add(zzQ3);
                arrayList.add(zzQ4);
                r1 = r0;
            }
            com_google_android_gms_internal_zzag_zza.zzjL = (zza[]) r5.toArray(new zza[0]);
            com_google_android_gms_internal_zzag_zza.zzjM = (zza[]) arrayList.toArray(new zza[0]);
            z = r1;
        } else if (zzR(obj)) {
            com_google_android_gms_internal_zzag_zza.type = 1;
            com_google_android_gms_internal_zzag_zza.zzjJ = obj.toString();
        } else if (zzS(obj)) {
            com_google_android_gms_internal_zzag_zza.type = 6;
            com_google_android_gms_internal_zzag_zza.zzjP = zzT(obj);
        } else if (obj instanceof Boolean) {
            com_google_android_gms_internal_zzag_zza.type = 8;
            com_google_android_gms_internal_zzag_zza.zzjQ = ((Boolean) obj).booleanValue();
        } else {
            String str = "Converting to Value from unknown object type: ";
            String valueOf = String.valueOf(obj == null ? "null" : obj.getClass().toString());
            zzbn.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return zzbrO;
        }
        com_google_android_gms_internal_zzag_zza.zzjT = z;
        return com_google_android_gms_internal_zzag_zza;
    }

    private static boolean zzR(Object obj) {
        return (obj instanceof Double) || (obj instanceof Float) || ((obj instanceof bv) && ((bv) obj).a());
    }

    private static boolean zzS(Object obj) {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || ((obj instanceof bv) && ((bv) obj).b());
    }

    private static long zzT(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        zzbn.e("getInt64 received non-Number");
        return 0;
    }

    public static String zzg(zza com_google_android_gms_internal_zzag_zza) {
        return zzL(zzl(com_google_android_gms_internal_zzag_zza));
    }

    public static zza zzgN(String str) {
        zza com_google_android_gms_internal_zzag_zza = new zza();
        com_google_android_gms_internal_zzag_zza.type = 5;
        com_google_android_gms_internal_zzag_zza.zzjO = str;
        return com_google_android_gms_internal_zzag_zza;
    }

    private static bv zzgO(String str) {
        try {
            return bv.a(str);
        } catch (NumberFormatException e) {
            zzbn.e(new StringBuilder(String.valueOf(str).length() + 33).append("Failed to convert '").append(str).append("' to a number.").toString());
            return zzbrJ;
        }
    }

    private static Long zzgP(String str) {
        bv zzgO = zzgO(str);
        return zzgO == zzbrJ ? zzbrH : Long.valueOf(zzgO.longValue());
    }

    private static Double zzgQ(String str) {
        bv zzgO = zzgO(str);
        return zzgO == zzbrJ ? zzbrI : Double.valueOf(zzgO.doubleValue());
    }

    private static Boolean zzgR(String str) {
        return "true".equalsIgnoreCase(str) ? Boolean.TRUE : "false".equalsIgnoreCase(str) ? Boolean.FALSE : zzbrL;
    }

    public static bv zzh(zza com_google_android_gms_internal_zzag_zza) {
        return zzM(zzl(com_google_android_gms_internal_zzag_zza));
    }

    public static Long zzi(zza com_google_android_gms_internal_zzag_zza) {
        return zzN(zzl(com_google_android_gms_internal_zzag_zza));
    }

    public static Double zzj(zza com_google_android_gms_internal_zzag_zza) {
        return zzO(zzl(com_google_android_gms_internal_zzag_zza));
    }

    public static Boolean zzk(zza com_google_android_gms_internal_zzag_zza) {
        return zzP(zzl(com_google_android_gms_internal_zzag_zza));
    }

    public static Object zzl(zza com_google_android_gms_internal_zzag_zza) {
        int i = 0;
        if (com_google_android_gms_internal_zzag_zza == null) {
            return null;
        }
        zza[] com_google_android_gms_internal_zzag_zzaArr;
        int length;
        switch (com_google_android_gms_internal_zzag_zza.type) {
            case 1:
                return com_google_android_gms_internal_zzag_zza.zzjJ;
            case 2:
                ArrayList arrayList = new ArrayList(com_google_android_gms_internal_zzag_zza.zzjK.length);
                com_google_android_gms_internal_zzag_zzaArr = com_google_android_gms_internal_zzag_zza.zzjK;
                length = com_google_android_gms_internal_zzag_zzaArr.length;
                while (i < length) {
                    Object zzl = zzl(com_google_android_gms_internal_zzag_zzaArr[i]);
                    if (zzl == null) {
                        return null;
                    }
                    arrayList.add(zzl);
                    i++;
                }
                return arrayList;
            case 3:
                if (com_google_android_gms_internal_zzag_zza.zzjL.length != com_google_android_gms_internal_zzag_zza.zzjM.length) {
                    String str = "Converting an invalid value to object: ";
                    String valueOf = String.valueOf(com_google_android_gms_internal_zzag_zza.toString());
                    zzbn.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return null;
                }
                Map hashMap = new HashMap(com_google_android_gms_internal_zzag_zza.zzjM.length);
                while (i < com_google_android_gms_internal_zzag_zza.zzjL.length) {
                    Object zzl2 = zzl(com_google_android_gms_internal_zzag_zza.zzjL[i]);
                    Object zzl3 = zzl(com_google_android_gms_internal_zzag_zza.zzjM[i]);
                    if (zzl2 == null || zzl3 == null) {
                        return null;
                    }
                    hashMap.put(zzl2, zzl3);
                    i++;
                }
                return hashMap;
            case 4:
                zzbn.e("Trying to convert a macro reference to object");
                return null;
            case 5:
                zzbn.e("Trying to convert a function id to object");
                return null;
            case 6:
                return Long.valueOf(com_google_android_gms_internal_zzag_zza.zzjP);
            case 7:
                StringBuffer stringBuffer = new StringBuffer();
                com_google_android_gms_internal_zzag_zzaArr = com_google_android_gms_internal_zzag_zza.zzjR;
                length = com_google_android_gms_internal_zzag_zzaArr.length;
                while (i < length) {
                    String zzg = zzg(com_google_android_gms_internal_zzag_zzaArr[i]);
                    if (zzg == zzbrK) {
                        return null;
                    }
                    stringBuffer.append(zzg);
                    i++;
                }
                return stringBuffer.toString();
            case 8:
                return Boolean.valueOf(com_google_android_gms_internal_zzag_zza.zzjQ);
            default:
                zzbn.e("Failed to convert a value of type: " + com_google_android_gms_internal_zzag_zza.type);
                return null;
        }
    }
}
