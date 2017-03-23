package com.google.android.gms.internal;

import com.google.android.gms.internal.zzafh.zzb;
import com.google.android.gms.internal.zzahj.zza;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class zzaff {

    class AnonymousClass1 implements zzb {
        final /* synthetic */ zzafh a;
        final /* synthetic */ Map b;

        AnonymousClass1(zzafh com_google_android_gms_internal_zzafh, Map map) {
            this.a = com_google_android_gms_internal_zzafh;
            this.b = map;
        }

        public void zzf(zzafa com_google_android_gms_internal_zzafa, zzahu com_google_android_gms_internal_zzahu) {
            this.a.a(com_google_android_gms_internal_zzafa, zzaff.zza(com_google_android_gms_internal_zzahu, this.b));
        }
    }

    class AnonymousClass2 extends zza {
        final /* synthetic */ Map a;
        final /* synthetic */ zzafg b;

        AnonymousClass2(Map map, zzafg com_google_android_gms_internal_zzafg) {
            this.a = map;
            this.b = com_google_android_gms_internal_zzafg;
        }

        public void zzb(zzahi com_google_android_gms_internal_zzahi, zzahu com_google_android_gms_internal_zzahu) {
            zzahu zza = zzaff.zza(com_google_android_gms_internal_zzahu, this.a);
            if (zza != com_google_android_gms_internal_zzahu) {
                this.b.zzg(new zzafa(com_google_android_gms_internal_zzahi.asString()), zza);
            }
        }
    }

    public static zzaes zza(zzaes com_google_android_gms_internal_zzaes, Map<String, Object> map) {
        zzaes zzQN = zzaes.zzQN();
        Iterator it = com_google_android_gms_internal_zzaes.iterator();
        zzaes com_google_android_gms_internal_zzaes2 = zzQN;
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            com_google_android_gms_internal_zzaes2 = com_google_android_gms_internal_zzaes2.zze((zzafa) entry.getKey(), zza((zzahu) entry.getValue(), (Map) map));
        }
        return com_google_android_gms_internal_zzaes2;
    }

    public static zzafh zza(zzafh com_google_android_gms_internal_zzafh, Map<String, Object> map) {
        zzafh com_google_android_gms_internal_zzafh2 = new zzafh();
        com_google_android_gms_internal_zzafh.a(new zzafa(""), new AnonymousClass1(com_google_android_gms_internal_zzafh2, map));
        return com_google_android_gms_internal_zzafh2;
    }

    public static zzahu zza(zzahu com_google_android_gms_internal_zzahu, Map<String, Object> map) {
        Object value = com_google_android_gms_internal_zzahu.zzTp().getValue();
        if (value instanceof Map) {
            Map map2 = (Map) value;
            if (map2.containsKey(".sv")) {
                value = map.get((String) map2.get(".sv"));
            }
        }
        zzahu zzar = zzahy.zzar(value);
        if (com_google_android_gms_internal_zzahu.zzTo()) {
            value = zza(com_google_android_gms_internal_zzahu.getValue(), (Map) map);
            return (value.equals(com_google_android_gms_internal_zzahu.getValue()) && zzar.equals(com_google_android_gms_internal_zzahu.zzTp())) ? com_google_android_gms_internal_zzahu : zzahv.zza(value, zzar);
        } else if (com_google_android_gms_internal_zzahu.isEmpty()) {
            return com_google_android_gms_internal_zzahu;
        } else {
            zzahj com_google_android_gms_internal_zzahj = (zzahj) com_google_android_gms_internal_zzahu;
            zzafg com_google_android_gms_internal_zzafg = new zzafg(com_google_android_gms_internal_zzahj);
            com_google_android_gms_internal_zzahj.zza(new AnonymousClass2(map, com_google_android_gms_internal_zzafg));
            return !com_google_android_gms_internal_zzafg.zzRG().zzTp().equals(zzar) ? com_google_android_gms_internal_zzafg.zzRG().zzf(zzar) : com_google_android_gms_internal_zzafg.zzRG();
        }
    }

    public static Object zza(Object obj, Map<String, Object> map) {
        if (!(obj instanceof Map)) {
            return obj;
        }
        Map map2 = (Map) obj;
        if (!map2.containsKey(".sv")) {
            return obj;
        }
        String str = (String) map2.get(".sv");
        return map.containsKey(str) ? map.get(str) : obj;
    }

    public static Map<String, Object> zza(zzain com_google_android_gms_internal_zzain) {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("timestamp", Long.valueOf(com_google_android_gms_internal_zzain.zzUi()));
        return hashMap;
    }
}
