package com.google.android.gms.b;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.v;
import com.google.android.gms.b.zp.a;
import com.google.android.gms.common.util.i;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

@vz
public class zm {
    private final Object a = new Object();
    private String b = "";
    private String c = "";
    private boolean d = false;

    private Uri a(Context context, String str, String str2) {
        Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        return buildUpon.build();
    }

    private void f(Context context, String str) {
        v.e().a(context, a(context, (String) pr.dc.c(), str));
    }

    public String a() {
        String str;
        synchronized (this.a) {
            str = this.c;
        }
        return str;
    }

    public String a(Context context) {
        String str;
        synchronized (this.a) {
            if (TextUtils.isEmpty(this.b)) {
                this.b = v.e().b(context, "debug_signals_id.txt");
                if (TextUtils.isEmpty(this.b)) {
                    this.b = v.e().c();
                    v.e().b(context, "debug_signals_id.txt", this.b);
                }
            }
            str = this.b;
        }
        return str;
    }

    public void a(Context context, String str) {
        if (c(context, str)) {
            zy.b("Device is linked for in app preview.");
        } else {
            f(context, str);
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        Builder buildUpon = a(context, (String) pr.df.c(), str3).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        v.e().a(context, str, buildUpon.build().toString());
    }

    public void a(String str) {
        synchronized (this.a) {
            this.c = str;
        }
    }

    public void a(boolean z) {
        synchronized (this.a) {
            this.d = z;
        }
    }

    public void b(Context context, String str) {
        if (d(context, str)) {
            zy.b("Device is linked for debug signals.");
        } else {
            f(context, str);
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }

    boolean c(Context context, String str) {
        Object e = e(context, a(context, (String) pr.dd.c(), str).toString());
        if (TextUtils.isEmpty(e)) {
            zy.b("Not linked for in app preview.");
            return false;
        }
        a(e.trim());
        return true;
    }

    boolean d(Context context, String str) {
        Object e = e(context, a(context, (String) pr.de.c(), str).toString());
        if (TextUtils.isEmpty(e)) {
            zy.b("Not linked for debug signals.");
            return false;
        }
        boolean parseBoolean = Boolean.parseBoolean(e.trim());
        a(parseBoolean);
        return parseBoolean;
    }

    protected String e(Context context, final String str) {
        Throwable th;
        String str2;
        String valueOf;
        aag a = new zp(context).a(str, new a<String>(this) {
            public String a() {
                String str = "Error getting a response from: ";
                String valueOf = String.valueOf(str);
                zy.e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                return null;
            }

            public String a(InputStream inputStream) {
                String str;
                try {
                    str = new String(i.a(inputStream, true), "UTF-8");
                    String str2 = str;
                    zy.b(new StringBuilder((String.valueOf(str2).length() + 49) + String.valueOf(str).length()).append("Response received from server. \nURL: ").append(str2).append("\n Response: ").append(str).toString());
                    return str;
                } catch (Throwable e) {
                    Throwable th = e;
                    String str3 = "Error connecting to url: ";
                    str = String.valueOf(str);
                    zy.c(str.length() != 0 ? str3.concat(str) : new String(str3), th);
                    return null;
                }
            }

            public /* synthetic */ Object b() {
                return a();
            }

            public /* synthetic */ Object b(InputStream inputStream) {
                return a(inputStream);
            }
        });
        try {
            return (String) a.get((long) ((Integer) pr.dg.c()).intValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e) {
            th = e;
            str2 = "Timeout while retriving a response from: ";
            valueOf = String.valueOf(str);
            zy.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            a.cancel(true);
        } catch (Throwable e2) {
            th = e2;
            str2 = "Interrupted while retriving a response from: ";
            valueOf = String.valueOf(str);
            zy.b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            a.cancel(true);
        } catch (Throwable e22) {
            th = e22;
            String str3 = "Error retriving a response from: ";
            valueOf = String.valueOf(str);
            zy.b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), th);
        }
        return null;
    }
}
