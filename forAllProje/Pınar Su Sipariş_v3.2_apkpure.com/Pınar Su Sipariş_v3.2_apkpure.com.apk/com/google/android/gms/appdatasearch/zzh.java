package com.google.android.gms.appdatasearch;

import java.util.HashMap;
import java.util.Map;

public class zzh {
    private static final String[] zzZU = new String[]{"text1", "text2", "icon", "intent_action", "intent_data", "intent_data_id", "intent_extra_data", "suggest_large_icon", "intent_activity", "thing_proto"};
    private static final Map<String, Integer> zzZV = new HashMap(zzZU.length);

    static {
        int i = 0;
        while (i < zzZU.length) {
            zzZV.put(zzZU[i], Integer.valueOf(i));
            i++;
        }
    }

    public static String zzaC(int i) {
        return (i < 0 || i >= zzZU.length) ? null : zzZU[i];
    }

    public static int zzce(String str) {
        Integer num = (Integer) zzZV.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 44).append("[").append(str).append("] is not a valid global search section name").toString());
    }

    public static int zzoJ() {
        return zzZU.length;
    }
}
