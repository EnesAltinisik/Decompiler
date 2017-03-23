package com.google.firebase.database;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class b {
    private static final Map<Integer, String> a = new HashMap();
    private static final Map<String, Integer> b = new HashMap();
    private final int c;
    private final String d;
    private final String e;

    static {
        a.put(Integer.valueOf(-1), "The transaction needs to be run again with current data");
        a.put(Integer.valueOf(-2), "The server indicated that this operation failed");
        a.put(Integer.valueOf(-3), "This client does not have permission to perform this operation");
        a.put(Integer.valueOf(-4), "The operation had to be aborted due to a network disconnect");
        a.put(Integer.valueOf(-6), "The supplied auth token has expired");
        a.put(Integer.valueOf(-7), "The supplied auth token was invalid");
        a.put(Integer.valueOf(-8), "The transaction had too many retries");
        a.put(Integer.valueOf(-9), "The transaction was overridden by a subsequent set");
        a.put(Integer.valueOf(-10), "The service is unavailable");
        a.put(Integer.valueOf(-11), "User code called from the Firebase Database runloop threw an exception:\n");
        a.put(Integer.valueOf(-24), "The operation could not be performed due to a network error");
        a.put(Integer.valueOf(-25), "The write was canceled by the user.");
        a.put(Integer.valueOf(-999), "An unknown error occurred");
        b.put("datastale", Integer.valueOf(-1));
        b.put("failure", Integer.valueOf(-2));
        b.put("permission_denied", Integer.valueOf(-3));
        b.put("disconnected", Integer.valueOf(-4));
        b.put("expired_token", Integer.valueOf(-6));
        b.put("invalid_token", Integer.valueOf(-7));
        b.put("maxretries", Integer.valueOf(-8));
        b.put("overriddenbyset", Integer.valueOf(-9));
        b.put("unavailable", Integer.valueOf(-10));
        b.put("network_error", Integer.valueOf(-24));
        b.put("write_canceled", Integer.valueOf(-25));
    }

    private b(int i, String str) {
        this(i, str, null);
    }

    private b(int i, String str, String str2) {
        this.c = i;
        this.d = str;
        if (str2 == null) {
            str2 = "";
        }
        this.e = str2;
    }

    public static b a(int i) {
        if (a.containsKey(Integer.valueOf(i))) {
            return new b(i, (String) a.get(Integer.valueOf(i)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i);
    }

    public static b a(String str) {
        return a(str, null);
    }

    public static b a(String str, String str2) {
        return a(str, str2, null);
    }

    public static b a(String str, String str2, String str3) {
        Integer num = (Integer) b.get(str.toLowerCase());
        Integer valueOf = num == null ? Integer.valueOf(-999) : num;
        return new b(valueOf.intValue(), str2 == null ? (String) a.get(valueOf) : str2, str3);
    }

    public static b a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String valueOf = String.valueOf((String) a.get(Integer.valueOf(-11)));
        String valueOf2 = String.valueOf(stringWriter.toString());
        return new b(-11, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    public int a() {
        return this.c;
    }

    public c b() {
        String str = "Firebase Database error: ";
        String valueOf = String.valueOf(this.d);
        return new c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public String toString() {
        String str = "DatabaseError: ";
        String valueOf = String.valueOf(this.d);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
