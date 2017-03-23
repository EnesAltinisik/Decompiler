package com.google.android.gms.internal;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public final class zzacj {

    public static class zza {
        public final zzack zzbEe;
        public final List<Asset> zzbEf;

        public zza(zzack com_google_android_gms_internal_zzack, List<Asset> list) {
            this.zzbEe = com_google_android_gms_internal_zzack;
            this.zzbEf = list;
        }
    }

    private static int zza(String str, com.google.android.gms.internal.zzack.zza.zza[] com_google_android_gms_internal_zzack_zza_zzaArr) {
        int i = 14;
        for (com.google.android.gms.internal.zzack.zza.zza com_google_android_gms_internal_zzack_zza_zza : com_google_android_gms_internal_zzack_zza_zzaArr) {
            if (i == 14) {
                if (com_google_android_gms_internal_zzack_zza_zza.type == 9 || com_google_android_gms_internal_zzack_zza_zza.type == 2 || com_google_android_gms_internal_zzack_zza_zza.type == 6) {
                    i = com_google_android_gms_internal_zzack_zza_zza.type;
                } else if (com_google_android_gms_internal_zzack_zza_zza.type != 14) {
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 48).append("Unexpected TypedValue type: ").append(com_google_android_gms_internal_zzack_zza_zza.type).append(" for key ").append(str).toString());
                }
            } else if (com_google_android_gms_internal_zzack_zza_zza.type != i) {
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 126).append("The ArrayList elements should all be the same type, but ArrayList with key ").append(str).append(" contains items of type ").append(i).append(" and ").append(com_google_android_gms_internal_zzack_zza_zza.type).toString());
            }
        }
        return i;
    }

    static int zza(List<Asset> list, Asset asset) {
        list.add(asset);
        return list.size() - 1;
    }

    public static zza zza(DataMap dataMap) {
        zzack com_google_android_gms_internal_zzack = new zzack();
        List arrayList = new ArrayList();
        com_google_android_gms_internal_zzack.zzbEg = zza(dataMap, arrayList);
        return new zza(com_google_android_gms_internal_zzack, arrayList);
    }

    private static com.google.android.gms.internal.zzack.zza.zza zza(List<Asset> list, Object obj) {
        com.google.android.gms.internal.zzack.zza.zza com_google_android_gms_internal_zzack_zza_zza = new com.google.android.gms.internal.zzack.zza.zza();
        if (obj == null) {
            com_google_android_gms_internal_zzack_zza_zza.type = 14;
            return com_google_android_gms_internal_zzack_zza_zza;
        }
        com_google_android_gms_internal_zzack_zza_zza.zzbEk = new com.google.android.gms.internal.zzack.zza.zza.zza();
        if (obj instanceof String) {
            com_google_android_gms_internal_zzack_zza_zza.type = 2;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEm = (String) obj;
        } else if (obj instanceof Integer) {
            com_google_android_gms_internal_zzack_zza_zza.type = 6;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEq = ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            com_google_android_gms_internal_zzack_zza_zza.type = 5;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEp = ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            com_google_android_gms_internal_zzack_zza_zza.type = 3;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEn = ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            com_google_android_gms_internal_zzack_zza_zza.type = 4;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEo = ((Float) obj).floatValue();
        } else if (obj instanceof Boolean) {
            com_google_android_gms_internal_zzack_zza_zza.type = 8;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEs = ((Boolean) obj).booleanValue();
        } else if (obj instanceof Byte) {
            com_google_android_gms_internal_zzack_zza_zza.type = 7;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEr = ((Byte) obj).byteValue();
        } else if (obj instanceof byte[]) {
            com_google_android_gms_internal_zzack_zza_zza.type = 1;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEl = (byte[]) obj;
        } else if (obj instanceof String[]) {
            com_google_android_gms_internal_zzack_zza_zza.type = 11;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEv = (String[]) obj;
        } else if (obj instanceof long[]) {
            com_google_android_gms_internal_zzack_zza_zza.type = 12;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEw = (long[]) obj;
        } else if (obj instanceof float[]) {
            com_google_android_gms_internal_zzack_zza_zza.type = 15;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEx = (float[]) obj;
        } else if (obj instanceof Asset) {
            com_google_android_gms_internal_zzack_zza_zza.type = 13;
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEy = (long) zza((List) list, (Asset) obj);
        } else if (obj instanceof DataMap) {
            com_google_android_gms_internal_zzack_zza_zza.type = 9;
            DataMap dataMap = (DataMap) obj;
            TreeSet treeSet = new TreeSet(dataMap.keySet());
            com.google.android.gms.internal.zzack.zza[] com_google_android_gms_internal_zzack_zzaArr = new com.google.android.gms.internal.zzack.zza[treeSet.size()];
            Iterator it = treeSet.iterator();
            r1 = 0;
            while (it.hasNext()) {
                r0 = (String) it.next();
                com_google_android_gms_internal_zzack_zzaArr[r1] = new com.google.android.gms.internal.zzack.zza();
                com_google_android_gms_internal_zzack_zzaArr[r1].name = r0;
                com_google_android_gms_internal_zzack_zzaArr[r1].zzbEi = zza((List) list, dataMap.get(r0));
                r1++;
            }
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEt = com_google_android_gms_internal_zzack_zzaArr;
        } else if (obj instanceof ArrayList) {
            com_google_android_gms_internal_zzack_zza_zza.type = 10;
            ArrayList arrayList = (ArrayList) obj;
            com.google.android.gms.internal.zzack.zza.zza[] com_google_android_gms_internal_zzack_zza_zzaArr = new com.google.android.gms.internal.zzack.zza.zza[arrayList.size()];
            Object obj2 = null;
            int size = arrayList.size();
            int i = 0;
            int i2 = 14;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                com.google.android.gms.internal.zzack.zza.zza zza = zza((List) list, obj3);
                if (zza.type == 14 || zza.type == 2 || zza.type == 6 || zza.type == 9) {
                    if (i2 == 14 && zza.type != 14) {
                        r1 = zza.type;
                    } else if (zza.type != i2) {
                        String valueOf = String.valueOf(obj2.getClass());
                        r0 = String.valueOf(obj3.getClass());
                        throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 80) + String.valueOf(r0).length()).append("ArrayList elements must all be of the sameclass, but this one contains a ").append(valueOf).append(" and a ").append(r0).toString());
                    } else {
                        obj3 = obj2;
                        r1 = i2;
                    }
                    com_google_android_gms_internal_zzack_zza_zzaArr[i] = zza;
                    i++;
                    i2 = r1;
                    obj2 = obj3;
                } else {
                    r0 = String.valueOf(obj3.getClass());
                    throw new IllegalArgumentException(new StringBuilder(String.valueOf(r0).length() + 130).append("The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a ").append(r0).toString());
                }
            }
            com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEu = com_google_android_gms_internal_zzack_zza_zzaArr;
        } else {
            String str = "newFieldValueFromValue: unexpected value ";
            r0 = String.valueOf(obj.getClass().getSimpleName());
            throw new RuntimeException(r0.length() != 0 ? str.concat(r0) : new String(str));
        }
        return com_google_android_gms_internal_zzack_zza_zza;
    }

    public static DataMap zza(zza com_google_android_gms_internal_zzacj_zza) {
        DataMap dataMap = new DataMap();
        for (com.google.android.gms.internal.zzack.zza com_google_android_gms_internal_zzack_zza : com_google_android_gms_internal_zzacj_zza.zzbEe.zzbEg) {
            zza(com_google_android_gms_internal_zzacj_zza.zzbEf, dataMap, com_google_android_gms_internal_zzack_zza.name, com_google_android_gms_internal_zzack_zza.zzbEi);
        }
        return dataMap;
    }

    private static ArrayList zza(List<Asset> list, com.google.android.gms.internal.zzack.zza.zza.zza com_google_android_gms_internal_zzack_zza_zza_zza, int i) {
        ArrayList arrayList = new ArrayList(com_google_android_gms_internal_zzack_zza_zza_zza.zzbEu.length);
        for (com.google.android.gms.internal.zzack.zza.zza com_google_android_gms_internal_zzack_zza_zza : com_google_android_gms_internal_zzack_zza_zza_zza.zzbEu) {
            if (com_google_android_gms_internal_zzack_zza_zza.type == 14) {
                arrayList.add(null);
            } else if (i == 9) {
                DataMap dataMap = new DataMap();
                for (com.google.android.gms.internal.zzack.zza com_google_android_gms_internal_zzack_zza : com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEt) {
                    zza(list, dataMap, com_google_android_gms_internal_zzack_zza.name, com_google_android_gms_internal_zzack_zza.zzbEi);
                }
                arrayList.add(dataMap);
            } else if (i == 2) {
                arrayList.add(com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEm);
            } else if (i == 6) {
                arrayList.add(Integer.valueOf(com_google_android_gms_internal_zzack_zza_zza.zzbEk.zzbEq));
            } else {
                throw new IllegalArgumentException("Unexpected typeOfArrayList: " + i);
            }
        }
        return arrayList;
    }

    private static void zza(List<Asset> list, DataMap dataMap, String str, com.google.android.gms.internal.zzack.zza.zza com_google_android_gms_internal_zzack_zza_zza) {
        int i = com_google_android_gms_internal_zzack_zza_zza.type;
        if (i == 14) {
            dataMap.putString(str, null);
            return;
        }
        com.google.android.gms.internal.zzack.zza.zza.zza com_google_android_gms_internal_zzack_zza_zza_zza = com_google_android_gms_internal_zzack_zza_zza.zzbEk;
        if (i == 1) {
            dataMap.putByteArray(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEl);
        } else if (i == 11) {
            dataMap.putStringArray(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEv);
        } else if (i == 12) {
            dataMap.putLongArray(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEw);
        } else if (i == 15) {
            dataMap.putFloatArray(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEx);
        } else if (i == 2) {
            dataMap.putString(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEm);
        } else if (i == 3) {
            dataMap.putDouble(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEn);
        } else if (i == 4) {
            dataMap.putFloat(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEo);
        } else if (i == 5) {
            dataMap.putLong(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEp);
        } else if (i == 6) {
            dataMap.putInt(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEq);
        } else if (i == 7) {
            dataMap.putByte(str, (byte) com_google_android_gms_internal_zzack_zza_zza_zza.zzbEr);
        } else if (i == 8) {
            dataMap.putBoolean(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEs);
        } else if (i == 13) {
            if (list == null) {
                String str2 = "populateBundle: unexpected type for: ";
                String valueOf = String.valueOf(str);
                throw new RuntimeException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            dataMap.putAsset(str, (Asset) list.get((int) com_google_android_gms_internal_zzack_zza_zza_zza.zzbEy));
        } else if (i == 9) {
            DataMap dataMap2 = new DataMap();
            for (com.google.android.gms.internal.zzack.zza com_google_android_gms_internal_zzack_zza : com_google_android_gms_internal_zzack_zza_zza_zza.zzbEt) {
                zza(list, dataMap2, com_google_android_gms_internal_zzack_zza.name, com_google_android_gms_internal_zzack_zza.zzbEi);
            }
            dataMap.putDataMap(str, dataMap2);
        } else if (i == 10) {
            i = zza(str, com_google_android_gms_internal_zzack_zza_zza_zza.zzbEu);
            ArrayList zza = zza(list, com_google_android_gms_internal_zzack_zza_zza_zza, i);
            if (i == 14) {
                dataMap.putStringArrayList(str, zza);
            } else if (i == 9) {
                dataMap.putDataMapArrayList(str, zza);
            } else if (i == 2) {
                dataMap.putStringArrayList(str, zza);
            } else if (i == 6) {
                dataMap.putIntegerArrayList(str, zza);
            } else {
                throw new IllegalStateException("Unexpected typeOfArrayList: " + i);
            }
        } else {
            throw new RuntimeException("populateBundle: unexpected type " + i);
        }
    }

    private static com.google.android.gms.internal.zzack.zza[] zza(DataMap dataMap, List<Asset> list) {
        TreeSet treeSet = new TreeSet(dataMap.keySet());
        com.google.android.gms.internal.zzack.zza[] com_google_android_gms_internal_zzack_zzaArr = new com.google.android.gms.internal.zzack.zza[treeSet.size()];
        Iterator it = treeSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = dataMap.get(str);
            com_google_android_gms_internal_zzack_zzaArr[i] = new com.google.android.gms.internal.zzack.zza();
            com_google_android_gms_internal_zzack_zzaArr[i].name = str;
            com_google_android_gms_internal_zzack_zzaArr[i].zzbEi = zza((List) list, obj);
            i++;
        }
        return com_google_android_gms_internal_zzack_zzaArr;
    }
}
