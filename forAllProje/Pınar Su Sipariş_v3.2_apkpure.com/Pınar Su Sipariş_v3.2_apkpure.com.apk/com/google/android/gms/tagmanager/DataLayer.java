package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String[] zzbow = "gtm.lifetime".toString().split("\\.");
    private static final Pattern zzbox = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ReentrantLock zzboA;
    private final LinkedList<Map<String, Object>> zzboB;
    private final zzc zzboC;
    private final CountDownLatch zzboD;
    private final ConcurrentHashMap<b, Integer> zzboy;
    private final Map<String, Object> zzboz;

    interface zzc {

        public interface zza {
            void zzF(List<a> list);
        }

        void a(zza com_google_android_gms_tagmanager_DataLayer_zzc_zza);

        void a(String str);

        void a(List<a> list, long j);
    }

    static final class a {
        public final String a;
        public final Object b;

        a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public int hashCode() {
            return Arrays.hashCode(new Integer[]{Integer.valueOf(this.a.hashCode()), Integer.valueOf(this.b.hashCode())});
        }

        public String toString() {
            String str = this.a;
            String valueOf = String.valueOf(this.b.toString());
            return new StringBuilder((String.valueOf(str).length() + 13) + String.valueOf(valueOf).length()).append("Key: ").append(str).append(" value: ").append(valueOf).toString();
        }
    }

    interface b {
        void a(Map<String, Object> map);
    }

    DataLayer() {
        this(new zzc() {
            public void a(zza com_google_android_gms_tagmanager_DataLayer_zzc_zza) {
                com_google_android_gms_tagmanager_DataLayer_zzc_zza.zzF(new ArrayList());
            }

            public void a(String str) {
            }

            public void a(List<a> list, long j) {
            }
        });
    }

    DataLayer(zzc com_google_android_gms_tagmanager_DataLayer_zzc) {
        this.zzboC = com_google_android_gms_tagmanager_DataLayer_zzc;
        this.zzboy = new ConcurrentHashMap();
        this.zzboz = new HashMap();
        this.zzboA = new ReentrantLock();
        this.zzboB = new LinkedList();
        this.zzboD = new CountDownLatch(1);
        zzJw();
    }

    public static List<Object> listOf(Object... objArr) {
        List<Object> arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public static Map<String, Object> mapOf(Object... objArr) {
        if (objArr.length % 2 != 0) {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        Map<String, Object> hashMap = new HashMap();
        int i = 0;
        while (i < objArr.length) {
            if (objArr[i] instanceof String) {
                hashMap.put((String) objArr[i], objArr[i + 1]);
                i += 2;
            } else {
                String valueOf = String.valueOf(objArr[i]);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 21).append("key is not a string: ").append(valueOf).toString());
            }
        }
        return hashMap;
    }

    private void zzJw() {
        this.zzboC.a(new zza(this) {
            final /* synthetic */ DataLayer a;

            {
                this.a = r1;
            }

            public void zzF(List<a> list) {
                for (a aVar : list) {
                    this.a.zzY(this.a.zzo(aVar.a, aVar.b));
                }
                this.a.zzboD.countDown();
            }
        });
    }

    private void zzJx() {
        int i = 0;
        while (true) {
            Map map = (Map) this.zzboB.poll();
            if (map != null) {
                zzad(map);
                int i2 = i + 1;
                if (i2 > 500) {
                    this.zzboB.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    private void zzY(Map<String, Object> map) {
        this.zzboA.lock();
        try {
            this.zzboB.offer(map);
            if (this.zzboA.getHoldCount() == 1) {
                zzJx();
            }
            zzZ(map);
        } finally {
            this.zzboA.unlock();
        }
    }

    private void zzZ(Map<String, Object> map) {
        Long zzaa = zzaa(map);
        if (zzaa != null) {
            List zzac = zzac(map);
            zzac.remove("gtm.lifetime");
            this.zzboC.a(zzac, zzaa.longValue());
        }
    }

    private void zza(Map<String, Object> map, String str, Collection<a> collection) {
        for (Entry entry : map.entrySet()) {
            String str2 = str.length() == 0 ? "" : ".";
            String str3 = (String) entry.getKey();
            str3 = new StringBuilder(((String.valueOf(str).length() + 0) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(str2).append(str3).toString();
            if (entry.getValue() instanceof Map) {
                zza((Map) entry.getValue(), str3, collection);
            } else if (!str3.equals("gtm.lifetime")) {
                collection.add(new a(str3, entry.getValue()));
            }
        }
    }

    private Long zzaa(Map<String, Object> map) {
        Object zzab = zzab(map);
        return zzab == null ? null : zzgs(zzab.toString());
    }

    private Object zzab(Map<String, Object> map) {
        String[] strArr = zzbow;
        int length = strArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = strArr[i];
            if (!(obj instanceof Map)) {
                return null;
            }
            i++;
            obj = ((Map) obj).get(obj2);
        }
        return obj;
    }

    private List<a> zzac(Map<String, Object> map) {
        Object arrayList = new ArrayList();
        zza(map, "", arrayList);
        return arrayList;
    }

    private void zzad(Map<String, Object> map) {
        synchronized (this.zzboz) {
            for (String str : map.keySet()) {
                zzd(zzo(str, map.get(str)), this.zzboz);
            }
        }
        zzae(map);
    }

    private void zzae(Map<String, Object> map) {
        for (b a : this.zzboy.keySet()) {
            a.a(map);
        }
    }

    static Long zzgs(String str) {
        Matcher matcher = zzbox.matcher(str);
        String str2;
        String valueOf;
        if (matcher.matches()) {
            long parseLong;
            try {
                parseLong = Long.parseLong(matcher.group(1));
            } catch (NumberFormatException e) {
                str2 = "illegal number in _lifetime value: ";
                valueOf = String.valueOf(str);
                zzbn.zzaW(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                parseLong = 0;
            }
            if (parseLong <= 0) {
                str2 = "non-positive _lifetime: ";
                valueOf = String.valueOf(str);
                zzbn.zzaV(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                return null;
            }
            valueOf = matcher.group(2);
            if (valueOf.length() == 0) {
                return Long.valueOf(parseLong);
            }
            switch (valueOf.charAt(0)) {
                case 'd':
                    return Long.valueOf((((parseLong * 1000) * 60) * 60) * 24);
                case 'h':
                    return Long.valueOf(((parseLong * 1000) * 60) * 60);
                case 'm':
                    return Long.valueOf((parseLong * 1000) * 60);
                case 's':
                    return Long.valueOf(parseLong * 1000);
                default:
                    str2 = "unknown units in _lifetime: ";
                    valueOf = String.valueOf(str);
                    zzbn.zzaW(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    return null;
            }
        }
        str2 = "unknown _lifetime: ";
        valueOf = String.valueOf(str);
        zzbn.zzaV(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }

    public Object get(String str) {
        synchronized (this.zzboz) {
            Map map = this.zzboz;
            String[] split = str.split("\\.");
            int length = split.length;
            Object obj = map;
            int i = 0;
            while (i < length) {
                Object obj2 = split[i];
                if (obj instanceof Map) {
                    obj2 = ((Map) obj).get(obj2);
                    if (obj2 == null) {
                        return null;
                    }
                    i++;
                    obj = obj2;
                } else {
                    return null;
                }
            }
            return obj;
        }
    }

    public void push(String str, Object obj) {
        push(zzo(str, obj));
    }

    public void push(Map<String, Object> map) {
        try {
            this.zzboD.await();
        } catch (InterruptedException e) {
            zzbn.zzaW("DataLayer.push: unexpected InterruptedException");
        }
        zzY(map);
    }

    public void pushEvent(String str, Map<String, Object> map) {
        Map hashMap = new HashMap(map);
        hashMap.put("event", str);
        push(hashMap);
    }

    public String toString() {
        String stringBuilder;
        synchronized (this.zzboz) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (Entry entry : this.zzboz.entrySet()) {
                stringBuilder2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{entry.getKey(), entry.getValue()}));
            }
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    void zza(b bVar) {
        this.zzboy.put(bVar, Integer.valueOf(0));
    }

    void zzb(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add(null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                zzb((List) obj, (List) list2.get(i));
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                zzd((Map) obj, (Map) list2.get(i));
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    void zzd(Map<String, Object> map, Map<String, Object> map2) {
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                if (!(map2.get(str) instanceof List)) {
                    map2.put(str, new ArrayList());
                }
                zzb((List) obj, (List) map2.get(str));
            } else if (obj instanceof Map) {
                if (!(map2.get(str) instanceof Map)) {
                    map2.put(str, new HashMap());
                }
                zzd((Map) obj, (Map) map2.get(str));
            } else {
                map2.put(str, obj);
            }
        }
    }

    void zzgr(String str) {
        push(str, null);
        this.zzboC.a(str);
    }

    Map<String, Object> zzo(String str, Object obj) {
        Map hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        Map map = hashMap;
        while (i < split.length - 1) {
            HashMap hashMap2 = new HashMap();
            map.put(split[i], hashMap2);
            i++;
            Object obj2 = hashMap2;
        }
        map.put(split[split.length - 1], obj);
        return hashMap;
    }
}
