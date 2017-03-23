package com.google.android.gms.tagmanager;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class aw {
    private static aw a;
    private volatile a b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    enum a {
        NONE,
        CONTAINER,
        CONTAINER_DEBUG
    }

    aw() {
        e();
    }

    static aw a() {
        aw awVar;
        synchronized (aw.class) {
            if (a == null) {
                a = new aw();
            }
            awVar = a;
        }
        return awVar;
    }

    private String a(String str) {
        return str.split("&")[0].split("=")[1];
    }

    private String b(Uri uri) {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    synchronized boolean a(Uri uri) {
        boolean z = true;
        synchronized (this) {
            try {
                String decode = URLDecoder.decode(uri.toString(), Constants.ENCODING);
                String str;
                String valueOf;
                if (decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) {
                    str = "Container preview url: ";
                    valueOf = String.valueOf(decode);
                    zzbn.v(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    if (decode.matches(".*?&gtm_debug=x$")) {
                        this.b = a.CONTAINER_DEBUG;
                    } else {
                        this.b = a.CONTAINER;
                    }
                    this.e = b(uri);
                    if (this.b == a.CONTAINER || this.b == a.CONTAINER_DEBUG) {
                        decode = String.valueOf("/r?");
                        valueOf = String.valueOf(this.e);
                        this.d = valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode);
                    }
                    this.c = a(this.e);
                } else if (!decode.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$")) {
                    str = "Invalid preview uri: ";
                    String valueOf2 = String.valueOf(decode);
                    zzbn.zzaW(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
                    z = false;
                } else if (a(uri.getQuery()).equals(this.c)) {
                    decode = "Exit preview mode for container: ";
                    valueOf = String.valueOf(this.c);
                    zzbn.v(valueOf.length() != 0 ? decode.concat(valueOf) : new String(decode));
                    this.b = a.NONE;
                    this.d = null;
                } else {
                    z = false;
                }
            } catch (UnsupportedEncodingException e) {
                z = false;
            }
        }
        return z;
    }

    a b() {
        return this.b;
    }

    String c() {
        return this.d;
    }

    String d() {
        return this.c;
    }

    void e() {
        this.b = a.NONE;
        this.d = null;
        this.c = null;
        this.e = null;
    }
}
