package com.google.android.gms.b;

import com.google.firebase.database.c;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

public class ku {
    private static final Pattern a = Pattern.compile("[\\[\\]\\.#$]");
    private static final Pattern b = Pattern.compile("[\\[\\]\\.#\\$\\/\\u0000-\\u001F\\u007F]");

    public static void a(gx gxVar) {
        if (!b(gxVar)) {
            String str = "Invalid write location: ";
            String valueOf = String.valueOf(gxVar.toString());
            throw new c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public static void a(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (!map.containsKey(".sv")) {
                for (Entry entry : map.entrySet()) {
                    c((String) entry.getKey());
                    a(entry.getValue());
                }
            }
        } else if (obj instanceof List) {
            for (Object a : (List) obj) {
                a(a);
            }
        }
    }

    public static void a(String str) {
        if (!d(str)) {
            throw new c(new StringBuilder(String.valueOf(str).length() + 101).append("Invalid Firebase Database path: ").append(str).append(". Firebase Database paths must not contain '.', '#', '$', '[', or ']'").toString());
        }
    }

    public static void b(String str) {
        if (str.startsWith(".info")) {
            a(str.substring(5));
        } else if (str.startsWith("/.info")) {
            a(str.substring(6));
        } else {
            a(str);
        }
    }

    private static boolean b(gx gxVar) {
        je d = gxVar.d();
        return d == null || !d.d().startsWith(".");
    }

    public static void c(String str) {
        if (!e(str)) {
            throw new c(new StringBuilder(String.valueOf(str).length() + 68).append("Invalid key: ").append(str).append(". Keys must not contain '/', '.', '#', '$', '[', or ']'").toString());
        }
    }

    private static boolean d(String str) {
        return !a.matcher(str).find();
    }

    private static boolean e(String str) {
        return str != null && str.length() > 0 && (str.equals(".value") || str.equals(".priority") || !(str.startsWith(".") || b.matcher(str).find()));
    }
}
