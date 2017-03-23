package com.google.android.gms.internal;

import com.google.firebase.database.DatabaseException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class zzaiw {
    private static final Pattern zzbSp = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern zzbSq = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    private static boolean zzP(zzafa com_google_android_gms_internal_zzafa) {
        zzahi zzRt = com_google_android_gms_internal_zzafa.zzRt();
        return zzRt == null || !zzRt.asString().startsWith(".");
    }

    public static void zzQ(zzafa com_google_android_gms_internal_zzafa) throws DatabaseException {
        if (!zzP(com_google_android_gms_internal_zzafa)) {
            String str = "Invalid write location: ";
            String valueOf = String.valueOf(com_google_android_gms_internal_zzafa.toString());
            throw new DatabaseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static void zzau(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Entry entry : map.entrySet()) {
                    zziv((String) entry.getKey());
                    zzau(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object zzau : (List) obj) {
                zzau(zzau);
            }
        }
    }

    public static Map<zzafa, zzahu> zzc(zzafa com_google_android_gms_internal_zzafa, Map<String, Object> map) throws DatabaseException {
        Map treeMap = new TreeMap();
        for (Entry entry : map.entrySet()) {
            zzafa com_google_android_gms_internal_zzafa2 = new zzafa((String) entry.getKey());
            Object value = entry.getValue();
            zzafo.zza(com_google_android_gms_internal_zzafa.zzh(com_google_android_gms_internal_zzafa2), value);
            String asString = !com_google_android_gms_internal_zzafa2.isEmpty() ? com_google_android_gms_internal_zzafa2.zzRw().asString() : "";
            if (asString.equals(".sv") || asString.equals(".value")) {
                String valueOf = String.valueOf(com_google_android_gms_internal_zzafa2);
                throw new DatabaseException(new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(asString).length()).append("Path '").append(valueOf).append("' contains disallowed child name: ").append(asString).toString());
            } else if (!asString.equals(".priority") || zzahy.zzp(zzahv.zzaq(value))) {
                zzau(value);
                treeMap.put(com_google_android_gms_internal_zzafa2, zzahv.zzaq(value));
            } else {
                String valueOf2 = String.valueOf(com_google_android_gms_internal_zzafa2);
                throw new DatabaseException(new StringBuilder(String.valueOf(valueOf2).length() + 83).append("Path '").append(valueOf2).append("' contains invalid priority (must be a string, double, ServerValue, or null).").toString());
            }
        }
        zzafa com_google_android_gms_internal_zzafa3 = null;
        for (zzafa com_google_android_gms_internal_zzafa4 : treeMap.keySet()) {
            boolean z = com_google_android_gms_internal_zzafa3 == null || com_google_android_gms_internal_zzafa3.zzj(com_google_android_gms_internal_zzafa4) < 0;
            zzaiv.zzaN(z);
            if (com_google_android_gms_internal_zzafa3 == null || !com_google_android_gms_internal_zzafa3.zzi(com_google_android_gms_internal_zzafa4)) {
                com_google_android_gms_internal_zzafa3 = com_google_android_gms_internal_zzafa4;
            } else {
                valueOf2 = String.valueOf(com_google_android_gms_internal_zzafa3);
                asString = String.valueOf(com_google_android_gms_internal_zzafa4);
                throw new DatabaseException(new StringBuilder((String.valueOf(valueOf2).length() + 42) + String.valueOf(asString).length()).append("Path '").append(valueOf2).append("' is an ancestor of '").append(asString).append("' in an update.").toString());
            }
        }
        return treeMap;
    }

    private static boolean zzip(String str) {
        return !zzbSp.matcher(str).find();
    }

    public static void zziq(String str) throws DatabaseException {
        if (!zzip(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void zzir(String str) throws DatabaseException {
        if (str.startsWith(".info")) {
            zziq(str.substring(5));
        } else if (str.startsWith("/.info")) {
            zziq(str.substring(6));
        } else {
            zziq(str);
        }
    }

    private static boolean zzis(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || zzbSq.matcher(str).find()));
    }

    private static boolean zzit(String str) {
        return str.equals(".info") || !zzbSq.matcher(str).find();
    }

    public static void zziu(String str) throws DatabaseException {
        if (str != null && !zzit(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void zziv(String str) throws DatabaseException {
        if (!zzis(str)) {
            throw new DatabaseException(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }
}
