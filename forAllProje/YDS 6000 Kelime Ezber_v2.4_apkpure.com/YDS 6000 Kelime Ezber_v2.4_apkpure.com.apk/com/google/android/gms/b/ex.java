package com.google.android.gms.b;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class ex {
    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    static HashMap<String, String> e;
    static String[] f = new String[0];
    private static final AtomicBoolean g = new AtomicBoolean();
    private static Object h;
    private static boolean i;

    class AnonymousClass1 extends ContentObserver {
        AnonymousClass1(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            ex.g.set(true);
        }
    }

    public static long a(ContentResolver contentResolver, String str, long j) {
        String a = a(contentResolver, str);
        if (a != null) {
            try {
                j = Long.parseLong(a);
            } catch (NumberFormatException e) {
            }
        }
        return j;
    }

    @Deprecated
    public static String a(ContentResolver contentResolver, String str) {
        return a(contentResolver, str, null);
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (ex.class) {
            a(contentResolver);
            Object obj = h;
            String str3;
            if (e.containsKey(str)) {
                str3 = (String) e.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!i || e.isEmpty()) {
                            c(contentResolver, f);
                            if (e.containsKey(str)) {
                                str3 = (String) e.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(a, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(str2)) {
                                str3 = str2;
                            }
                            a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                }
                a(obj, str, null);
                if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    public static Map<String, String> a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(b, null, null, strArr, null);
        Map<String, String> treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    private static void a(ContentResolver contentResolver) {
        if (e == null) {
            g.set(false);
            e = new HashMap();
            h = new Object();
            i = false;
            contentResolver.registerContentObserver(a, true, new AnonymousClass1(null));
        } else if (g.getAndSet(false)) {
            e.clear();
            h = new Object();
            i = false;
        }
    }

    private static void a(Object obj, String str, String str2) {
        synchronized (ex.class) {
            if (obj == h) {
                e.put(str, str2);
            }
        }
    }

    private static String[] a(String[] strArr) {
        HashSet hashSet = new HashSet((((f.length + strArr.length) * 4) / 3) + 1);
        hashSet.addAll(Arrays.asList(f));
        ArrayList arrayList = new ArrayList();
        for (Object obj : strArr) {
            if (hashSet.add(obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return new String[0];
        }
        f = (String[]) hashSet.toArray(new String[hashSet.size()]);
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void b(ContentResolver contentResolver, String... strArr) {
        if (strArr.length != 0) {
            synchronized (ex.class) {
                a(contentResolver);
                String[] a = a(strArr);
                if (!i || e.isEmpty()) {
                    c(contentResolver, f);
                } else if (a.length != 0) {
                    c(contentResolver, a);
                }
            }
        }
    }

    private static void c(ContentResolver contentResolver, String[] strArr) {
        e.putAll(a(contentResolver, strArr));
        i = true;
    }
}
